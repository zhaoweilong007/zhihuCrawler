import { spawn } from 'node:child_process';
import { createHash } from 'node:crypto';
import { readFile, readdir } from 'node:fs/promises';
import { join } from 'node:path';

const treeish = process.argv[2] || 'HEAD:document';
const catalogDirectory = join(process.cwd(), 'catalog');
const searchDirectory = join(process.cwd(), 'search');
const meta = JSON.parse(await readFile(join(catalogDirectory, 'meta.json'), 'utf8'));
const revision = await new Promise((resolve, reject) => {
  const command = spawn('git', ['rev-parse', treeish]);
  let output = '';
  command.stdout.setEncoding('utf8');
  command.stdout.on('data', (chunk) => { output += chunk; });
  command.once('error', reject);
  command.once('close', (code) => code === 0 ? resolve(output.trim()) : reject(new Error(`git exited with ${code}`)));
});
if (meta.revision !== revision) throw new Error('catalog meta revision does not match the document tree');

const rootHash = createHash('sha256').update('').digest('hex');
const rootShard = JSON.parse(await readFile(join(catalogDirectory, `${rootHash.slice(0, 2)}.json`), 'utf8'));
if (!Array.isArray(rootShard[rootHash]?.entries) || rootShard[rootHash].entries.length === 0) {
  throw new Error('root catalog index is missing or empty');
}

const shards = (await readdir(catalogDirectory)).filter((name) => /^[0-9a-f]{2}\.json$/.test(name));
if (shards.length !== 256) throw new Error(`expected 256 catalog shards, got ${shards.length}`);
const searchShards = (await readdir(searchDirectory)).filter((name) => /^[0-9a-f]{2}\.json$/.test(name));
if (searchShards.length !== meta.searchShards || searchShards.length !== 256) {
  throw new Error(`expected 256 search shards, got ${searchShards.length}`);
}
console.log(`catalog verified: revision=${revision} files=${meta.files} directories=${meta.directories} shards=${shards.length} searchShards=${searchShards.length}`);
