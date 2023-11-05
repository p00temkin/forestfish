const Web3 = require('web3');
const fs = require('fs')
const evmchainindex = require('../../../evmchainindex.json');

const nodeURLs = evmchainindex['networks']['ETHEREUM'].nodeURLs;
var providerurl = nodeURLs[Math.floor(Math.random() * nodeURLs.length)];
console.log(' - using providerurl: ' + providerurl);

// BoredApe address
const boredape_ca = evmchainindex['networks']['ETHEREUM']['nftindex']['erc721tokens']['BORED_APE'].contractAddress;
console.log(" - BoredApe contract_address:", boredape_ca.toString());

// Initiate web3
const web3Provider = new Web3.providers.HttpProvider(providerurl);
const web3 = new Web3(web3Provider);

// Get the contract ABI, https://etherscan.io/address/0xbc4ca0eda7647a8ab7c2061c2e118a18a936f13d#code
const boredape_abi = JSON.parse(fs.readFileSync('./abi/erc721.json', 'utf8'));
const BoredApe = new web3.eth.Contract(boredape_abi, boredape_ca);

(async function() {

	const blocknr = await web3.eth.getBlockNumber();
	console.log(" - latest block: ", blocknr);
	
	const nodeversion = await web3.eth.getNodeInfo();
	console.log(" - RPC node is running client: " + nodeversion);

	const chainid = await web3.eth.getChainId();
	console.log(" - RPC node has chainid: " + chainid);
	
	let totalSupply = await BoredApe.methods.totalSupply().call();
	console.log(" - ERC721 BoredApe totalSupply: " + totalSupply);
	
	let tokenURI = await BoredApe.methods.tokenURI(0).call();
	console.log(" - ERC721 BoredApe tokenURI: " + tokenURI);
	
})();
