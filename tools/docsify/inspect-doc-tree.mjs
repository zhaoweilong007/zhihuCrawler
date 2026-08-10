import { spawn } from 'node:child_process';

const treeish = process.argv[2] || 'HEAD:document';
let files = 0;
let bytes = 0;
let largest = { size: 0, path: '' };
let pending = '';

function inspect(line) {
  if (!line) return;
  const separator = line.indexOf('\t');
  const metadata = line.slice(0, separator).trim().split(/\s+/);
  const path = line.slice(separator + 1);
  const size = Number(metadata.at(-1));
  files += 1;
  bytes += size;
  if (size > largest.size) largest = { size, path };
}

const child = spawn('git', ['-c', 'core.quotepath=false', 'ls-tree', '-r', '-l', treeish]);
child.stdout.setEncoding('utf8');
child.stdout.on('data', (chunk) => {
  const lines = (pending + chunk).split('\n');
  pending = lines.pop();
  lines.forEach(inspect);
});

const exitCode = await new Promise((resolve, reject) => {
  child.once('error', reject);
  child.once('close', resolve);
});

if (exitCode !== 0) process.exit(exitCode);
inspect(pending);
console.log(JSON.stringify({ treeish, files, bytes, largest }, null, 2));
