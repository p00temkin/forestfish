const ethers = require('ethers');
const fs = require('fs')
const evmchainindex = require('../../../evmchainindex.json');

const nodeURLs = evmchainindex['networks']['ETHEREUM'].nodeURLs;
var providerurl = nodeURLs[Math.floor(Math.random() * nodeURLs.length)];
console.log(' - using providerurl: ' + providerurl);

// Initiate provider 
var provider = new ethers.providers.JsonRpcProvider(providerurl);

const getBlock = async() => {
        const blocknr = await provider.getBlockNumber();
        console.log(" - latest block: ", blocknr);
}

getBlock();

