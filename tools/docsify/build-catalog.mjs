import { createHash } from 'node:crypto';
import { spawn } from 'node:child_process';
import { mkdir, writeFile } from 'node:fs/promises';
import { join } from 'node:path';

const treeish = process.argv[2] || 'HEAD:document';
const outputDirectory = join(process.cwd(), 'catalog');
const directories = new Map([['', new Map()]]);
let pending = '';
let files = 0;

function addEntry(parent, name, type) {
  if (!directories.has(parent)) directories.set(parent, new Map());
  directories.get(parent).set(name, type);
}

function addPath(path) {
  if (!path) return;
  files += 1;
  const segments = path.split('/');
  let parent = '';
  segments.forEach((segment, index) => {
    const type = index === segments.length - 1 ? 'file' : 'dir';
    addEntry(parent, segment, type);
    if (type === 'dir') parent = parent ? `${parent}/${segment}` : segment;
  });
}

function gitOutput(args) {
  const command = spawn('git', args);
  let output = '';
  command.stdout.setEncoding('utf8');
  command.stdout.on('data', (chunk) => { output += chunk; });
  return new Promise((resolve, reject) => {
    command.once('error', reject);
    command.once('close', (code) => code === 0 ? resolve(output.trim()) : reject(new Error(`git exited with ${code}`)));
  });
}

const child = spawn('git', ['-c', 'core.quotepath=false', 'ls-tree', '-r', '-z', '--name-only', treeish]);
child.stdout.setEncoding('utf8');
child.stdout.on('data', (chunk) => {
  const paths = (pending + chunk).split('\0');
  pending = paths.pop();
  paths.forEach(addPath);
});

const exitCode = await new Promise((resolve, reject) => {
  child.once('error', reject);
  child.once('close', resolve);
});
if (exitCode !== 0) process.exit(exitCode);
addPath(pending);

const shards = new Map();
for (const [path, children] of directories) {
  const entries = Array.from(children, ([name, type]) => ({ name, type })).sort((left, right) => {
    if (left.type !== right.type) return left.type === 'dir' ? -1 : 1;
    return left.name.localeCompare(right.name, 'zh-CN');
  });
  const hash = createHash('sha256').update(path).digest('hex');
  const shard = hash.slice(0, 2);
  if (!shards.has(shard)) shards.set(shard, {});
  shards.get(shard)[hash] = { entries };
}

await mkdir(outputDirectory, { recursive: true });
for (const [shard, indexes] of shards) {
  await writeFile(join(outputDirectory, `${shard}.json`), JSON.stringify(indexes));
}
const revision = await gitOutput(['rev-parse', treeish]);
await writeFile(join(outputDirectory, 'meta.json'), JSON.stringify({ revision, files, directories: directories.size }));

console.log(`generated ${directories.size} directory indexes in ${shards.size} shards at ${outputDirectory}`);
