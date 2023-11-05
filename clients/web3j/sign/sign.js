const Web3 = require('web3');
const evmchainindex = require('../../../evmchainindex.json');

const nodeURLs = evmchainindex['networks']['POLYGON'].nodeURLs;
var providerurl = nodeURLs[Math.floor(Math.random() * nodeURLs.length)];
console.log(' - using providerurl: ' + providerurl);

// Initiate web3
const web3Provider = new Web3.providers.HttpProvider(providerurl);
const web3 = new Web3(web3Provider);

// https://medium.com/singapore-blockchain-dapps/ethereum-using-web3-js-for-message-signing-a542676b50b5
const sig = web3.eth.accounts.sign("Hello, I am Kenneth!", '0xb5b1870957d373ef0eeffecc6e4812c0fd08f554b37b233526acc331bf1544f7');
console.log(" - sig.message: " + sig.message);
console.log(" - sig.signature: " + sig.signature);
console.log(" - sig.r: " + sig.r);
console.log(" - sig.s: " + sig.s);
console.log(" - sig.v: " + sig.v);

