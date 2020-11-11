const abi = require('node-abi')

console.log(abi.getAbi(process.versions.node, 'node'))

console.log(abi.getAbi(require('./package.json').devDependencies.electron, 'electron'))
