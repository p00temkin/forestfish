package crypto.forestfish.objects.embedded.evm;

import java.util.ArrayList;
import java.util.HashMap;

import crypto.forestfish.enums.BlockchainType;
import crypto.forestfish.enums.evm.EVMChain;
import crypto.forestfish.enums.evm.EVMPriceMechanism;
import crypto.forestfish.objects.evm.model.chain.EVMChainInfo;
import crypto.forestfish.objects.evm.model.chain.EVMCurrency;

public class BlockchainDetailsMainEVM {

	@SuppressWarnings("serial")
	public static HashMap<EVMChain, EVMChainInfo> getMainnetEVMNetworks() {

		HashMap<EVMChain, EVMChainInfo> networks = new HashMap<>();

		// ethereum
		EVMChainInfo ethereum = new EVMChainInfo(
				EVMChain.ETHEREUMINS.toString(), 
				"Ethereum Inscription Mainnet", 
				1617L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Ethereum Inscription Mainnet Gas Token", "ETINS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rpc.etins.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.etins.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1617");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ETHEREUMINS, ethereum);

		// volley
		EVMChainInfo volley = new EVMChainInfo(
				EVMChain.VOLLEY.toString(), 
				"Volley Mainnet", 
				9981L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Volley Mainnet Gas Token", "V2X", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://main-rpc.volleychain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://volleyscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/9981");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.VOLLEY, volley);
		
		// opencampus
		EVMChainInfo opencampus = new EVMChainInfo(
				EVMChain.OPENCAMPUS.toString(), 
				"Open Campus Codex", 
				656476L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Open Campus Codex Gas Token", "EDU", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.open-campus-codex.gelato.digital");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://opencampus-codex.blockscout.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/656476");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.OPENCAMPUS, opencampus);
		
		// coinsec
		EVMChainInfo coinsec = new EVMChainInfo(
				EVMChain.COINSEC.toString(), 
				"COINSEC", 
				57451L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("COINSEC Gas Token", "SEC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://mainnet-rpc.coinsec.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.coinsec.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/57451");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.COINSEC, coinsec);
		
		// numblock
		EVMChainInfo numblock = new EVMChainInfo(
				EVMChain.NUMBLOCK.toString(), 
				"NumBlock Chain", 
				5112023L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("NumBlock Chain Gas Token", "NUMB", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-mainnet.numblock.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://mainnet.numblock.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/5112023");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.NUMBLOCK, numblock);
		
		// fhenix
		EVMChainInfo fhenix = new EVMChainInfo(
				EVMChain.FHENIX.toString(), 
				"Fhenix Helium", 
				8008135L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Fhenix Helium Gas Token", "tFHE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://api.helium.fhenix.zone");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.helium.fhenix.zone");
				}},
				new ArrayList<String>() {{
					this.add("https://get-helium.fhenix.zone");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/8008135");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FHENIX, fhenix);
		
		// nal_test
		EVMChainInfo nal_test = new EVMChainInfo(
				EVMChain.NALTEST.toString(), 
				"Nal Sepolia Testnet", 
				328527624L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Nal Sepolia Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.nal.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-scan.nal.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/328527624");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.NALTEST, nal_test);
		
		// metalink
		EVMChainInfo metalink = new EVMChainInfo(
				EVMChain.METALINK.toString(), 
				"MetaLink Network", 
				2004L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("MetaLink Network Gas Token", "MTL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("http://77.237.237.69:9933");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("http://twoto3.com:3000");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2004");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.METALINK, metalink);
		
		// eternalcoin
		EVMChainInfo eternalcoin = new EVMChainInfo(
				EVMChain.ETERNALCOIN.toString(), 
				"EternalCoin Mainnet", 
				140L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("EternalCoin Mainnet Gas Token", "Eter", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://mainnet.eternalcoin.io/v1");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/140");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ETERNALCOIN, eternalcoin);

		// maxi
		EVMChainInfo maxi = new EVMChainInfo(
				EVMChain.MAXI.toString(), 
				"MAXI Chain Mainnet", 
				899L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("MAXI Chain Mainnet Gas Token", "MGAS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.maxi.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://mainnet.maxi.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/899");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MAXI, maxi);
		
		// itx
		EVMChainInfo itx = new EVMChainInfo(
				EVMChain.ITX.toString(), 
				"ITX Mainnet", 
				1235L, 
				BlockchainType.BORKED.toString(), // single node unstable
				new EVMCurrency("ITX Mainnet Gas Token", "ITX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.itxchain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.itxchain.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1235");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ITX, itx);
		
		// neuroweb
		EVMChainInfo neuroweb = new EVMChainInfo(
				EVMChain.NEUROWEB.toString(), 
				"NeuroWeb", 
				2043L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("NeuroWeb Gas Token", "NEURO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://astrosat.origintrail.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2043");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.NEUROWEB, neuroweb);
		
		// fraxtal
		EVMChainInfo fraxtal = new EVMChainInfo(
				EVMChain.FRAXTAL.toString(), 
				"Fraxtal", 
				252L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Fraxtal Gas Token", "frxETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rpc.frax.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://fraxscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/252");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FRAXTAL, fraxtal);

		// cmrangers
		EVMChainInfo cmrangers = new EVMChainInfo(
				EVMChain.CMRANGERS.toString(), 
				"Rangers Protocol ConnectorManager", 
				38400L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Rangers Protocol ConnectorManager Gas Token", "cmRPG", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"9000000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://cm.rangersprotocol.com/api/jsonrpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.rangersprotocol.com");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge.rangersprotocol.com");
				}},
				new ArrayList<String>() {{
					this.add("https://rangersprotocol.com");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CMRANGERS, cmrangers);

		// dogechain
		EVMChainInfo dogechain = new EVMChainInfo(
				EVMChain.DOGECHAIN.toString(), 
				"Dogechain Mainnet", 
				2000L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Dogechain Mainnet Gas Token", "DOGE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.dogechain.dog");
					this.add("https://rpc01-sg.dogechain.dog");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.dogechain.dog");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2000");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DOGECHAIN, dogechain);

		// eclat
		EVMChainInfo eclat = new EVMChainInfo(
				EVMChain.ECLAT.toString(), 
				"Eclat Mainnet", 
				165279L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Eclat Mainnet Gas Token", "ECLAT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://mainnet-rpc.eclatscan.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://eclatscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/165279");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ECLAT, eclat);

		// rangers
		EVMChainInfo rangers = new EVMChainInfo(
				EVMChain.RANGERS.toString(), 
				"Rangers Protocol Mainnet", 
				2025L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Rangers Protocol Mainnet Gas Token", "RPG", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"9000000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://mainnet.rangersprotocol.com/api/jsonrpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.rangersprotocol.com");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge.rangersprotocol.com");
				}},
				new ArrayList<String>() {{
					this.add("https://rangersprotocol.com");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.RANGERS, rangers);

		// arbitrum
		EVMChainInfo arbitrum_blueberry = new EVMChainInfo(
				EVMChain.ARBITRUMBLUEBERRY.toString(), 
				"Arbitrum Blueberry", 
				88153591557L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Arbitrum Blueberry Gas Token", "CGT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.arb-blueberry.gelato.digital");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://arb-blueberry.gelatoscout.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/88153591557");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ARBITRUMBLUEBERRY, arbitrum_blueberry);

		// siberium
		EVMChainInfo siberium = new EVMChainInfo(
				EVMChain.SIBERIUM.toString(), 
				"Siberium Network", 
				111111L, 
				BlockchainType.BORKED.toString(), // all nodes gone
				new EVMCurrency("Siberium Network Gas Token", "SIBR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"8400000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.main.siberium.net");
					this.add("https://rpc.main.siberium.net.ru");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.main.siberium.net");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/111111");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SIBERIUM, siberium);

		// egochain
		EVMChainInfo egochain = new EVMChainInfo(
				EVMChain.EGOCHAIN.toString(), 
				"Egochain", 
				5439L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Egochain Gas Token", "EGAX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://mainnet.egochain.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://egoscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/5439");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.EGOCHAIN, egochain);

		// espento
		EVMChainInfo espento = new EVMChainInfo(
				EVMChain.ESPENTO.toString(), 
				"Espento Mainnet", 
				9911L, 
				BlockchainType.BORKED.toString(), // single node unstable
				new EVMCurrency("Espento Mainnet Gas Token", "SPENT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.escscan.com/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://escscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/9911");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ESPENTO, espento);

		// santiment
		EVMChainInfo santiment = new EVMChainInfo(
				EVMChain.SANTIMENT.toString(), 
				"Santiment Intelligence Network", 
				11888L, 
				BlockchainType.BORKED.toString(), // single node unstable
				new EVMCurrency("Santiment Intelligence Network Gas Token", "SANR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://sanrchain-node.santiment.net");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://app-explorer-pos.sanr.app");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/11888");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SANTIMENT, santiment);


		// taproot
		EVMChainInfo taproot = new EVMChainInfo(
				EVMChain.TAPROOT.toString(), 
				"TAPROOT Mainnet", 
				911L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("TAPROOT Mainnet Gas Token", "TBTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.taprootchain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.taprootchain.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/911");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TAPROOT, taproot);

		// flare
		EVMChainInfo flare = new EVMChainInfo(
				EVMChain.FLARE.toString(), 
				"Flare Mainnet", 
				14L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Flare Mainnet Gas Token", "FLR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"8400000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://flare.public-rpc.com");
					this.add("https://flare-api.flare.network/ext/C/rpc");
					this.add("https://rpc.ftso.au/flare");
					this.add("https://flare.solidifi.app/ext/C/rpc");
					this.add("https://flare.rpc.thirdweb.com");
					this.add("https://flare-bundler.etherspot.io");
					this.add("https://rpc.ankr.com/flare");
					this.add("https://01-gravelines-003-01.rpc.tatum.io/ext/bc/C/rpc");
					this.add("https://01-vinthill-003-02.rpc.tatum.io/ext/bc/C/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://flare-explorer.flare.network");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/14");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FLARE, flare);

		// eiob
		EVMChainInfo eiob = new EVMChainInfo(
				EVMChain.EIOB.toString(), 
				"EIOB Mainnet", 
				612L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("EIOB Mainnet Gas Token", "EIOB", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"3200000", // +0 gives exceeds block gas limit 
				new ArrayList<String>() {{
					this.add("https://rpc.eiob.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.eiob.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/612");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.EIOB, eiob);

		// jono12
		EVMChainInfo jono12 = new EVMChainInfo(
				EVMChain.JONO12.toString(), 
				"Jono12 Subnet", 
				955081L, 
				BlockchainType.BORKED.toString(), // single node down
				new EVMCurrency("Jono12 Subnet Gas Token", "JONO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"3200000", // +0 gives exceeds block gas limit 
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/jono12/testnet/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://subnets-test.avax.network/jono12");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/955081");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.JONO12, jono12);

		// jono11
		EVMChainInfo jono11 = new EVMChainInfo(
				EVMChain.JONO11.toString(), 
				"Jono11 Subnet", 
				20765L, 
				BlockchainType.BORKED.toString(), // single node down
				new EVMCurrency("Jono11 Subnet Gas Token", "JONO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"3200000", // +0 gives exceeds block gas limit 
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/jono11/testnet/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://subnets-test.avax.network/jono11");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/20765");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.JONO11, jono11);

		// mxc
		EVMChainInfo mxc = new EVMChainInfo(
				EVMChain.MXC.toString(), 
				"MXC zkEVM Moonchain", 
				18686L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("MXC zkEVM Moonchain Gas Token", "MXC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.mxc.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.moonchain.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/18686");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MXC, mxc);

		// titan
		EVMChainInfo titan = new EVMChainInfo(
				EVMChain.TITAN.toString(), 
				"Titan (TKX)", 
				18888L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Titan (TKX) Gas Token", "TKX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://titan-json-rpc-tokyo.titanlab.io");
					this.add("https://titan-json-rpc-seoul.titanlab.io");
					this.add("https://titan-json-rpc-hongkong.titanlab.io");
					this.add("https://titan-json-rpc.titanlab.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://tkxscan.io/Titan");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/18888");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TITAN, titan);

		// konet
		EVMChainInfo konet = new EVMChainInfo(
				EVMChain.KONET.toString(), 
				"KONET Mainnet", 
				17217L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("KONET Mainnet Gas Token", "KONET", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://api.kon-wallet.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.kon-wallet.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/17217");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.KONET, konet);

		// dcpay
		EVMChainInfo dcpay = new EVMChainInfo(
				EVMChain.DCPAY.toString(), 
				"DCpay Mainnet", 
				21223L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("DCpay Mainnet Gas Token", "DCP", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.dcpay.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://mainnet.dcpay.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/21223");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DCPAY, dcpay);

		// dreyerx
		EVMChainInfo dreyerx = new EVMChainInfo(
				EVMChain.DREYERX.toString(), 
				"DreyerX Mainnet", 
				23451L, 
				BlockchainType.BORKED.toString(), // unstable
				new EVMCurrency("DreyerX Mainnet Gas Token", "DRX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.dreyerx.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.dreyerx.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/23451");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DREYERX, dreyerx);

		// klaos
		EVMChainInfo klaos = new EVMChainInfo(
				EVMChain.KLAOS.toString(), 
				"KLAOS Nova", 
				27181L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("KLAOS Nova Gas Token", "KLAOS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.klaosnova.laosfoundation.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://blockscout.klaosnova.laosfoundation.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/27181");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.KLAOS, klaos);

		// zeroone
		EVMChainInfo zeroone = new EVMChainInfo(
				EVMChain.ZEROONE.toString(), 
				"zeroone Mainnet Subnet", 
				27827L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("zeroone Mainnet Subnet Gas Token", "ZERO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/zeroonemai/mainnet/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/zeroonemai");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/27827");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZEROONE, zeroone);

		// vizing
		EVMChainInfo vizing = new EVMChainInfo(
				EVMChain.VIZING.toString(), 
				"Vizing Mainnet", 
				28518L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Vizing Mainnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.vizing.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.vizing.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/28518");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.VIZING, vizing);


		// miyou
		EVMChainInfo miyou = new EVMChainInfo(
				EVMChain.MIYOU.toString(), 
				"MiYou Mainnet", 
				30088L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("MiYou Mainnet Gas Token", "MY", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://blockchain.miyoulab.com");
					this.add("https://blockchain.miyou.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://myscan.miyou.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/30088");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MIYOU, miyou);

		// prm
		EVMChainInfo prm = new EVMChainInfo(
				EVMChain.PRM.toString(), 
				"PRM Mainnet", 
				39656L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("PRM Mainnet Gas Token", "PRM", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://mainnet-rpc.prmscan.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://prmscan.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/39656");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PRM, prm);

		// lambda
		EVMChainInfo lambda = new EVMChainInfo(
				EVMChain.LAMBDA.toString(), 
				"Lambda Chain Mainnet", 
				56026L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Lambda Chain Mainnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://nrpc.lambda.im/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.lambda.im");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/56026");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.LAMBDA, lambda);

		// bob
		EVMChainInfo bob = new EVMChainInfo(
				EVMChain.BOB.toString(), 
				"BOB", 
				60808L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("BOB Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://bob-mainnet.public.blastapi.io");
					this.add("https://rpc.gobob.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.gobob.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/60808");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BOB, bob);

		// xpla_verse
		EVMChainInfo xpla_verse = new EVMChainInfo(
				EVMChain.XPLAVERSE.toString(), 
				"XPLA Verse", 
				7300L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("XPLA Verse Gas Token", "OAS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-xpla-verse.xpla.dev");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-xpla-verse.xpla.dev");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/7300");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.XPLAVERSE, xpla_verse);
		
		// sei
		EVMChainInfo sei = new EVMChainInfo(
				EVMChain.SEI.toString(), 
				"Sei Network", 
				1329L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Sei Network Gas Token", "SEI", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://evm-rpc.sei-apis.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://seitrace.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1329");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SEI, sei);
		
		// nahmii3
		EVMChainInfo nahmii3 = new EVMChainInfo(
				EVMChain.NAHMII3.toString(), 
				"Nahmii 3 Mainnet", 
				4061L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Nahmii 3 Mainnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.n3.nahmii.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.nahmii.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/4061");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.NAHMII3, nahmii3);
		
		// icb
		EVMChainInfo icb = new EVMChainInfo(
				EVMChain.ICB.toString(), 
				"ICB Network", 
				73115L, 
				BlockchainType.BORKED.toString(), // unstable single
				new EVMCurrency("ICB Network Gas Token", "ICBX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc1-mainnet.icbnetwork.info/");
					this.add("https://rpc2-mainnet.icbnetwork.info/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://icbscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/73115");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ICB, icb);

		// proof
		EVMChainInfo proof = new EVMChainInfo(
				EVMChain.PROOF.toString(), 
				"Proof of Play - Apex", 
				70700L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Proof of Play - Apex Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.apex.proofofplay.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.apex.proofofplay.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/70700");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PROOF, proof);

		// kaichain
		EVMChainInfo kaichain = new EVMChainInfo(
				EVMChain.KAICHAIN.toString(), 
				"KaiChain", 
				61406L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("KaiChain Gas Token", "KEC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://mainnet-rpc.kaichain.net");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.kaichain.net");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/61406");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.KAICHAIN, kaichain);

		// decentraconnect
		EVMChainInfo decentraconnect = new EVMChainInfo(
				EVMChain.DECENTRACONNECT.toString(), 
				"Decentraconnect Social", 
				19224L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Decentraconnect Social Gas Token", "DCSM", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rpc.decentraconnect.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://decentraconnect.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/19224");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DECENTRACONNECT, decentraconnect);


		// parex
		EVMChainInfo parex = new EVMChainInfo(
				EVMChain.PAREX.toString(), 
				"Parex Mainnet", 
				322202L, 
				BlockchainType.BORKED.toString(), // unstable single
				new EVMCurrency("Parex Mainnet Gas Token", "PRX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://mainnet-rpc.parex.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.parex.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/322202");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PAREX, parex);

		// hemi
		EVMChainInfo hemi = new EVMChainInfo(
				EVMChain.HEMI.toString(), 
				"Hemi Sepolia", 
				743111L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Hemi Sepolia Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet.rpc.hemi.network/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.explorer.hemi.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/743111");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.HEMI, hemi);

		// filecoin
		EVMChainInfo filecoin = new EVMChainInfo(
				EVMChain.FILECOIN.toString(), 
				"Filecoin Mainnet", 
				314L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Filecoin Mainnet Gas Token", "FIL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"8400000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://api.node.glif.io/");
					this.add("https://rpc.ankr.com/filecoin");
					this.add("https://filfox.info/rpc/v1");
					this.add("https://filecoin.drpc.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://filfox.info/en");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://filfox.info/en");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FILECOIN, filecoin);

		// kinto
		EVMChainInfo kinto = new EVMChainInfo(
				EVMChain.KINTO.toString(), 
				"Kinto Mainnet", 
				7887L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Kinto Mainnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"8400000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.kinto.xyz/http");
					this.add("https://kinto-mainnet.calderachain.xyz/http");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.kinto.xyz/");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/7887");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.KINTO, kinto);

		// xai
		EVMChainInfo xai = new EVMChainInfo(
				EVMChain.XAI.toString(), 
				"Xai Mainnet", 
				660279L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Xai Mainnet Gas Token", "XAI", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://xai-chain.net/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.xai-chain.net");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/660279");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.XAI, xai);


		// avax_eclipse_test
		EVMChainInfo innovatorchain = new EVMChainInfo(
				EVMChain.INOV8.toString(), 
				"Innovator Chain", 
				129L, 
				BlockchainType.BORKED.toString(), // single node unstable
				new EVMCurrency("Innovator Chain Gas Token", "INOV8", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"8400000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.innovatorchain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://evm.innovatorchain.com");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://innovatorchain.com");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.INOV8, innovatorchain);

		// degen
		EVMChainInfo degen = new EVMChainInfo(
				EVMChain.DEGEN.toString(), 
				"Degen Chain", 
				666666666L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Degen Chain Gas Token", "DEGEN", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.degen.tips");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/666666666");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DEGEN, degen);

		// liquidlayer
		EVMChainInfo liquidlayer = new EVMChainInfo(
				EVMChain.LIQUIDLAYER.toString(), 
				"LiquidLayer Mainnet", 
				25186L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Kinto Mainnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"8400000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://mainnet.liquidlayer.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.liquidlayer.network");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://liquidlayer.network");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.LIQUIDLAYER, liquidlayer);

		// xdc
		EVMChainInfo xdc = new EVMChainInfo(
				EVMChain.XDC.toString(), 
				"XDC Network", 
				50L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Flare Mainnet Gas Token", "XDC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"8400000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.xdcrpc.com");
					this.add("https://erpc.xinfin.network");
					this.add("https://rpc.xinfin.network");
					this.add("https://rpc1.xinfin.network");
					this.add("https://rpc-xdc.icecreamswap.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://xdcscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/50");
					this.add("https://xinfin.network/#stats");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.XDC, xdc);

		// telos
		EVMChainInfo telos = new EVMChainInfo(
				EVMChain.TELOS.toString(), 
				"Telos EVM Mainnet", 
				40L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Telos EVM Mainnet Gas Token", "TLOS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"8400000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc1.us.telos.net/evm");
					this.add("https://mainnet.telos.net/evm");
					this.add("https://telos.drpc.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://teloscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/40");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TELOS, telos);

		// shibachain
		EVMChainInfo shibachain = new EVMChainInfo(
				EVMChain.SHIBACHAIN.toString(), 
				"ShibaChain", 
				27L, 
				BlockchainType.BORKED.toString(), // nodes dead
				new EVMCurrency("ShibaChain Gas Token", "SHIB", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"8400000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.shibchain.org");
					this.add("https://rpc.shibachain.net");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://exp.shibchain.org");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/27");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SHIBACHAIN, shibachain);

		// fncy
		EVMChainInfo fncy = new EVMChainInfo(
				EVMChain.FNCY.toString(), 
				"FNCY Mainnet", 
				73L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("FNCY Mainnet Gas Token", "FNCY", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"8400000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://fncy-seed1.fncy.world");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://fncyscan.fncy.world");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://www.coingecko.com/en/coins/fncy");
					this.add("https://fncy.world/");
					this.add("https://chainlist.org/chain/73");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FNCY, fncy);

		// hedera
		EVMChainInfo hedera = new EVMChainInfo(
				EVMChain.HEDERA.toString(), 
				"Hedera Mainnet", 
				295L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Hedera Mainnet Gas Token", "HBAR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"8400000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://mainnet.hashio.io/api");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://hashscan.io/mainnet");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://hedera.com/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.HEDERA, hedera);

		// joc
		EVMChainInfo joc = new EVMChainInfo(
				EVMChain.JOC.toString(), 
				"Japan Open Chain Mainnet", 
				81L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Japan Open Chain Gas Token", "JOC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"8400000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc-1.japanopenchain.org:8545");
					this.add("https://rpc-2.japanopenchain.org:8545");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.japanopenchain.org");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://japanopenchain.org");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.JOC, joc);

		// zkfair
		EVMChainInfo zkfair = new EVMChainInfo(
				EVMChain.ZKFAIR.toString(), 
				"ZKFair Mainnet", 
				42766L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("ZKFair Mainnet Gas Token", "USDC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"8400000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.zkfair.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.zkfair.io");
				}},
				new ArrayList<String>() {{
					this.add("https://wallet.zkfair.io/");
				}},
				new ArrayList<String>() {{
					this.add("https://zkfair.io");
				}},
				BlockchainTokenDetailsEVM.generateZKFairTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZKFAIR, zkfair);

		// ubiq
		EVMChainInfo ubiq = new EVMChainInfo(
				EVMChain.UBIQ.toString(), 
				"Ubiq Mainnet", 
				8L, 
				BlockchainType.BORKED.toString(), // unstable
				new EVMCurrency("Ubiq Gas Token", "UBQ", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.octano.dev");
					this.add("https://pyrus2.ubiqscan.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://ubiqscan.io/");
				}},
				new ArrayList<String>() {{
					this.add("<todo insert faucet>");
				}},
				new ArrayList<String>() {{
					this.add("https://ubiqsmart.com/");
					this.add("https://www.coingecko.com/en/coins/ubiq");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.UBIQ, ubiq);

		// neon
		EVMChainInfo neon = new EVMChainInfo(
				EVMChain.NEON.toString(), 
				"Neon EVM Mainnet", 
				245022934L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("NEON Gas Token", "NEON", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://neon-proxy-mainnet.solana.p2p.org");
					this.add("https://neon-evm.drpc.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://neonscan.org");
				}},
				new ArrayList<String>() {{
					this.add("<todo insert faucet>");
				}},
				new ArrayList<String>() {{
					this.add("https://neonevm.org/");
					this.add("https://www.coingecko.com/en/coins/neon");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.NEON, neon);

		// manta
		EVMChainInfo manta = new EVMChainInfo(
				EVMChain.MANTA.toString(), 
				"Manta Pacific Mainnet", 
				169L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Manta Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://pacific-rpc.manta.network/http");
					this.add("https://1rpc.io/manta");
					this.add("https://manta-pacific.drpc.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://pacific-explorer.manta.network");
				}},
				new ArrayList<String>() {{
					this.add("<todo insert faucet>");
				}},
				new ArrayList<String>() {{
					this.add("https://manta.network");
				}},
				BlockchainTokenDetailsEVM.generateMantaTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MANTA, manta);

		// filefilego
		EVMChainInfo filefilego = new EVMChainInfo(
				EVMChain.FILEFILEGO.toString(), 
				"FileFileGo", 
				191L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("FileFileGo Gas Token", "FFG", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.filefilego.com/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/191");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FILEFILEGO, filefilego);

		// eos
		EVMChainInfo eos = new EVMChainInfo(
				EVMChain.EOSEVM.toString(), 
				"EOS EVM Network", 
				17777L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("EOS EVM Network Gas Token", "EOS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://api.evm.eosnetwork.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.evm.eosnetwork.com");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://eosnetwork.com");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.EOSEVM, eos);

		// gnosis
		EVMChainInfo gnosis = new EVMChainInfo(
				EVMChain.GNOSIS.toString(), 
				"Gnosis Chain", 
				100L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Gnosis Gas Token", "xDai", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.gnosischain.com/");
					this.add("https://gnosis.oat.farm");
					this.add("https://gnosis.publicnode.com");
					this.add("https://rpc.gnosischain.com");
					this.add("https://rpc.gnosis.gateway.fm");
					this.add("https://rpc.ankr.com/gnosis");
					this.add("https://gnosis-mainnet.public.blastapi.io");
					this.add("https://gnosis.api.onfinality.io/public");
					this.add("https://gnosis.blockpi.network/v1/rpc/public");
					this.add("https://gnosis-rpc.publicnode.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://gnosisscan.io/");
				}},
				new ArrayList<String>() {{
					this.add("https://www.gnosisfaucet.com/");
					this.add("https://bridge.gnosischain.com/");
					this.add("https://hop.exchange/");
				}},
				new ArrayList<String>() {{
					this.add("https://www.gnosis.io/");
				}},
				BlockchainTokenDetailsEVM.generateGnosisTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.GNOSIS, gnosis);

		// mantle
		EVMChainInfo mantle = new EVMChainInfo(
				EVMChain.MANTLE.toString(), 
				"Mantle Mainnet", 
				5000L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Mantle Gas Token", "MNT", 18), 
				EVMPriceMechanism.LEGACY.toString(),
				30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.mantle.xyz");
					this.add("https://mantle.publicnode.com");
					this.add("https://mantle-mainnet.public.blastapi.io");
					this.add("https://mantle.drpc.org");
					this.add("https://rpc.ankr.com/mantle");
					this.add("https://1rpc.io/mantle");
					this.add("https://mantle-rpc.publicnode.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.mantle.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge.mantle.xyz/");
				}},
				new ArrayList<String>() {{
					this.add("https://www.mantle.xyz/");
				}},
				BlockchainTokenDetailsEVM.generateMantleTokenIndex(),
				BlockchainTokenDetailsEVM.generateMantleNFTIndex());
		networks.put(EVMChain.MANTLE, mantle);

		// opbnb
		EVMChainInfo opbnb = new EVMChainInfo(
				EVMChain.OPBNB.toString(), 
				"opBNB Mainnet", 
				204L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("opBNB Gas Token", "BNB", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://opbnb.publicnode.com");
					this.add("https://opbnb-mainnet.nodereal.io/v1/64a9df0874fb4a93b9d0a3849de012d3");
					this.add("https://opbnb-mainnet-rpc.bnbchain.org");
					this.add("https://opbnb-mainnet.nodereal.io/v1/e9a36765eb8a40b9bd12e680a1fd2bc5");
					this.add("https://opbnb-rpc.publicnode.com");
					this.add("https://opbnb.drpc.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://mainnet.opbnbscan.com");
				}},
				new ArrayList<String>() {{
					this.add("https://opbnb-bridge.bnbchain.org/deposit");
				}},
				new ArrayList<String>() {{
					this.add("https://opbnb.bnbchain.org");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.OPBNB, opbnb);

		// zora
		EVMChainInfo zora = new EVMChainInfo(
				EVMChain.ZORA.toString(), 
				"Zora Mainnet", 
				7777777L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Zora Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.zora.energy/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.zora.energy");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge.zora.energy/");
				}},
				new ArrayList<String>() {{
					this.add("https://zora.energy");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZORA, zora);

		// boyaa
		EVMChainInfo boyaa = new EVMChainInfo(
				EVMChain.BOYAA.toString(), 
				"Boyaa Mainnet", 
				434L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Boyaa Mainnet Gas Token", "BYC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://evm-rpc.mainnet.boyaa.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.mainnet.boyaa.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/434");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BOYAA, boyaa);

		// optrust
		EVMChainInfo optrust = new EVMChainInfo(
				EVMChain.OPTRUST.toString(), 
				"OpTrust Mainnet", 
				537L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("OpTrust Mainnet Gas Token", "BNB", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.optrust.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.optrust.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/537");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.OPTRUST, optrust);

		// previewnet
		EVMChainInfo previewnet = new EVMChainInfo(
				EVMChain.PREVIEWNET.toString(), 
				"Previewnet", 
				646L, 
				BlockchainType.BORKED.toString(), // single node timeout
				new EVMCurrency("Previewnet Gas Token", "FLOW", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://previewnet.evm.nodes.onflow.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://previewnet.flowdiver.io");
				}},
				new ArrayList<String>() {{
					this.add("https://previewnet-faucet.onflow.org");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/646");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PREVIEWNET, previewnet);

		// ultronsmartchain
		EVMChainInfo ultronsmartchain = new EVMChainInfo(
				EVMChain.ULTRONSMARTCHAIN.toString(), 
				"UltronSmartchain", 
				662L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("UltronSmartchain Gas Token", "ULC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.ultronsmartchain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.ultronsmartchain.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/662");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ULTRONSMARTCHAIN, ultronsmartchain);

		// rebus
		EVMChainInfo rebus = new EVMChainInfo(
				EVMChain.REBUS.toString(), 
				"Rebus Mainnet", 
				1011L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Rebus Mainnet Gas Token", "REBUS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://apievm.rebuschain.com/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://cosmos.rebuschain.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1011");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.REBUS, rebus);

		// lisk
		EVMChainInfo lisk = new EVMChainInfo(
				EVMChain.LISK.toString(), 
				"Lisk", 
				1135L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Lisk Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.api.lisk.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://blockscout.lisk.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1135");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.LISK, lisk);

		// clubmos
		EVMChainInfo clubmos = new EVMChainInfo(
				EVMChain.CLUBMOS.toString(), 
				"ClubMos Mainnet", 
				1188L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("ClubMos Mainnet Gas Token", "MOS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://mainnet.mosscan.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://www.mosscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1188");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CLUBMOS, clubmos);

		// saitablockchain(sbc)
		EVMChainInfo saitablockchain = new EVMChainInfo(
				EVMChain.SAITABLOCKCHAIN.toString(), 
				"SaitaBlockChain(SBC)", 
				1209L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("SaitaBlockChain(SBC) Gas Token", "STC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-nodes.saitascan.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://saitascan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1209");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SAITABLOCKCHAIN, saitablockchain);

		// redstone
		EVMChainInfo redstone = new EVMChainInfo(
				EVMChain.REDSTONE.toString(), 
				"Redstone", 
				690L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Redstone Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.redstonechain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.redstone.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/690");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.REDSTONE, redstone);

		// syndr
		EVMChainInfo syndr = new EVMChainInfo(
				EVMChain.SYNDR.toString(), 
				"Syndr L3", 
				404L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Syndr L3 Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.syndr.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.syndr.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/404");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SYNDR, syndr);

		// kroma
		EVMChainInfo kroma = new EVMChainInfo(
				EVMChain.KROMA.toString(), 
				"Kroma Mainnet", 
				255L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Kroma Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://api.kroma.network");
					this.add("https://rpc-kroma.rockx.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://blockscout.kroma.network");
				}},
				new ArrayList<String>() {{
					this.add("https://kroma.network/bridge");
					this.add("https://owlto.finance/?to=Kroma");
				}},
				new ArrayList<String>() {{
					this.add("kroma.network");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.KROMA, kroma);

		// tomochain
		EVMChainInfo tomochain = new EVMChainInfo(
				EVMChain.TOMOCHAIN.toString(), 
				"Tomochain Mainnet", 
				88L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Tomo Gas Token", "TOMO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.tomochain.com");
					this.add("https://tomo.blockpi.network/v1/rpc/public");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://tomoscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<todo faucet>");
				}},
				new ArrayList<String>() {{
					this.add("https://tomochain.com");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TOMOCHAIN, tomochain);

		// tenet
		EVMChainInfo tenet = new EVMChainInfo(
				EVMChain.TENET.toString(), 
				"Tenet Mainnet", 
				1559L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("TENET Gas Token", "TENET", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.tenet.org");
					this.add("https://tenet-evm.publicnode.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://tenetscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<todo faucet>");
				}},
				new ArrayList<String>() {{
					this.add("https://ethereumpow.org/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TENET, tenet);

		// ethhw
		EVMChainInfo ethw = new EVMChainInfo(
				EVMChain.ETHW.toString(), 
				"ETH PoW Mainnet", 
				10001L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("ETHW Gas Token", "ETHW", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://mainnet.ethereumpow.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://mainnet.ethwscan.com/");
				}},
				new ArrayList<String>() {{
					this.add("<todo faucet>");
				}},
				new ArrayList<String>() {{
					this.add("https://ethereumpow.org/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ETHW, ethw);

		// kardiachain
		EVMChainInfo kardiachain = new EVMChainInfo(
				EVMChain.KARDIACHAIN.toString(), 
				"KARURA Mainnet", 
				24L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("KARDIACHAIN Gas Token", "KAI", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.kardiachain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.kardiachain.io/");
				}},
				new ArrayList<String>() {{
					this.add("<todo faucet>");
				}},
				new ArrayList<String>() {{
					this.add("https://kardiachain.io/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.KARDIACHAIN, kardiachain);

		// karura
		EVMChainInfo karura = new EVMChainInfo(
				EVMChain.KARURA.toString(), 
				"KARURA Mainnet", 
				686L, 
				BlockchainType.BORKED.toString(), // rpc incomp? issue calling ethGetBalance()
				new EVMCurrency("KARURA Gas Token", "KAR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.evm.karura.network");
					this.add("https://eth-rpc-karura.aca-api.network");
					this.add("https://eth-rpc-karura.aca-staging.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://karura.network");
				}},
				new ArrayList<String>() {{
					this.add("<todo faucet>");
				}},
				new ArrayList<String>() {{
					this.add("https://acala.network/karura");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.KARURA, karura);

		// lukso
		EVMChainInfo lukso = new EVMChainInfo(
				EVMChain.LUKSO.toString(), 
				"LUKSO Mainnet", 
				42L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("LUKSO Gas Token", "LYX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.mainnet.lukso.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.execution.mainnet.lukso.network");
				}},
				new ArrayList<String>() {{
					this.add("<todo faucet>");
				}},
				new ArrayList<String>() {{
					this.add("https://lukso.network/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.LUKSO, lukso);

		// fuse
		EVMChainInfo fuse = new EVMChainInfo(
				EVMChain.FUSE.toString(), 
				"FUSE Mainnet", 
				122L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("FUSE Gas Token", "FUSE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"10000000000", //10 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://fuse-mainnet.chainstacklabs.com");
					this.add("https://rpc.fuse.io");
					this.add("https://fuse-rpc.gateway.pokt.network");
					this.add("https://fuse.api.onfinality.io/public");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.fuse.io/");
				}},
				new ArrayList<String>() {{
					this.add("<todo faucet>");
				}},
				new ArrayList<String>() {{
					this.add("https://www.fuse.io/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FUSE, fuse);

		// rootstock
		EVMChainInfo rootstock = new EVMChainInfo(
				EVMChain.ROOTSTOCK.toString(), 
				"Rootstock Mainnet", 
				30L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Rootstock Gas Token", "RBTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://public-node.rsk.co");
					this.add("https://mycrypto.rsk.co");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.rsk.co");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://www.rsk.co");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ROOTSTOCK, rootstock);

		// quadrans
		EVMChainInfo quadrans = new EVMChainInfo(
				EVMChain.QUADRANS.toString(), 
				"Quadrans Blockchain", 
				10946L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Quadrans Gas Token", "QDC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.quadrans.io");
					this.add("https://rpcna.quadrans.io");
					this.add("https://rpceu.quadrans.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.quadrans.io");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://quadrans.io");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.QUADRANS, quadrans);

		// torus
		EVMChainInfo torus = new EVMChainInfo(
				EVMChain.TORUS.toString(), 
				"Torus Mainnet", 
				8192L, 
				BlockchainType.BORKED.toString(), // single unstable
				new EVMCurrency("Torus Mainnet Gas Token", "TQF", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.toruschain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://toruscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://toruschain.com");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TORUS, torus);
		
		// poodl
		EVMChainInfo poodl = new EVMChainInfo(
				EVMChain.POODL.toString(), 
				"Poodl Mainnet", 
				15259L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Poodl Mainnet Gas Token", "POODL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.poodl.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.poodl.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/15259");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.POODL, poodl);
		
		// flag
		EVMChainInfo flag = new EVMChainInfo(
				EVMChain.FLAG.toString(), 
				"Flag Mainnet", 
				147L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Flag Mainnet Gas Token", "FLAG", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://mainnet-rpc.flagscan.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://flagscan.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/147");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FLAG, flag);
		
		// ramestta
		EVMChainInfo ramestta = new EVMChainInfo(
				EVMChain.RAMESTTA.toString(), 
				"Ramestta Mainnet", 
				1370L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Ramestta Mainnet Gas Token", "RAMA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://blockchain.ramestta.com");
					this.add("https://blockchain2.ramestta.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://ramascan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1370");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.RAMESTTA, ramestta);
		
		// evolve
		EVMChainInfo evolve = new EVMChainInfo(
				EVMChain.EVOLVE.toString(), 
				"EVOLVE Mainnet", 
				3424L, 
				BlockchainType.BORKED.toString(), // unstable
				new EVMCurrency("EVOLVE Mainnet Gas Token", "EVO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.evolveblockchain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://evoexplorer.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/3424");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.EVOLVE, evolve);

		// playa3ull_games
		EVMChainInfo playa3ull_games = new EVMChainInfo(
				EVMChain.PLAYA3ULL.toString(), 
				"PLAYA3ULL GAMES Mainnet", 
				3011L, 
				BlockchainType.BORKED.toString(), // timeouts at times
				new EVMCurrency("PLAYA3ULL GAMES Mainnet Gas Token", "3ULL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://api.mainnet.playa3ull.games");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://3011.routescan.io/");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://app.playa3ull.games/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PLAYA3ULL, playa3ull_games);

		// alveychain
		EVMChainInfo alveychain = new EVMChainInfo(
				EVMChain.ALVEYCHAIN.toString(), 
				"AlveyChain Mainnet", 
				3797L, 
				BlockchainType.PUBLIC.toString(), // unstable
				new EVMCurrency("AlveyChain Mainnet Gas Token", "BSTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://elves-core1.alvey.io");
					this.add("https://elves-core2.alvey.io");
					this.add("https://elves-core3.alvey.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://alveyscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://www.alveychain.com/");
					this.add("https://chainlist.org/chain/3797");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ALVEYCHAIN, alveychain);

		// bpx
		EVMChainInfo bpx = new EVMChainInfo(
				EVMChain.BPX.toString(), 
				"BPX Blockchain", 
				279L, 
				BlockchainType.PUBLIC.toString(), // scam?
				new EVMCurrency("BPX Blockchain Gas Token", "BPX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://bpx-dataseed.infinex.cc");
					this.add("https://rpc.mainnet.bpxchain.cc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://beta.shibariumtech.com/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://bpxchain.cc");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BPX, bpx);

		// zeta
		EVMChainInfo zeta = new EVMChainInfo(
				EVMChain.ZETA.toString(), 
				"Mint Testnet", 
				7000L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("ZetaChain Mainnet Gas Token", "ZETA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://zetachain-evm.blockpi.network/v1/rpc/public");
					this.add("https://zetachain-mainnet-archive.allthatnode.com:8545");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.mainnet.zetachain.com");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://zetachain.com");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZETA, zeta);

		// lovely
		EVMChainInfo lovely = new EVMChainInfo(
				EVMChain.LOVELY.toString(), 
				"Lovely Network Mainnet", 
				730L, 
				BlockchainType.PUBLIC.toString(), // scam?
				new EVMCurrency("Lovely Network Mainnet Gas Token", "LOVELY", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.lovely.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.lovely.network");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.lovely.network");
				}},
				new ArrayList<String>() {{
					this.add("https://lovely.finance/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.LOVELY, lovely);

		// aurorapowergold
		EVMChainInfo aurorapowergold = new EVMChainInfo(
				EVMChain.AURORAPOWERGOLD.toString(), 
				"PowerGold", 
				1313161560L, 
				BlockchainType.BORKED.toString(), // unstable
				new EVMCurrency("PowerGold Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://powergold.aurora.dev");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.powergold.aurora.dev");
				}},
				new ArrayList<String>() {{
					this.add("<faucet todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://aurora.dev/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.AURORAPOWERGOLD, aurorapowergold);

		// bloom
		EVMChainInfo bloom = new EVMChainInfo(
				EVMChain.BLOOM.toString(), 
				"Bloom Genesis Mainnet", 
				333313L, 
				BlockchainType.PUBLIC.toString(), // unstable
				new EVMCurrency("Bloom Genesis Mainnet Gas Token", "BGBC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://mainnet-rpc.bloomgenesis.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.bloomgenesis.com");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://bloomgenesis.com");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BLOOM, bloom);

		// metadap
		EVMChainInfo metadap = new EVMChainInfo(
				EVMChain.METADAP.toString(), 
				"MetaDAP Enterprise Mainnet", 
				91120L, 
				BlockchainType.BORKED.toString(), // unstable
				new EVMCurrency("MetaDAP Enterprise Mainnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.chain.metadap.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.chain.metadap.io");
				}},
				new ArrayList<String>() {{
					this.add("<bridge to do>");
				}},
				new ArrayList<String>() {{
					this.add("https://metadap.io");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.METADAP, metadap);

		// doid
		EVMChainInfo doid = new EVMChainInfo(
				EVMChain.DOID.toString(), 
				"DOID", 
				53277L, 
				BlockchainType.BORKED.toString(), // unstable
				new EVMCurrency("DOID Gas Token", "DOID", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.doid.tech");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.doid.tech");
				}},
				new ArrayList<String>() {{
					this.add("<bridge to do>");
				}},
				new ArrayList<String>() {{
					this.add("https://doid.tech");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DOID, doid);

		// vrcscan
		EVMChainInfo vrcscan = new EVMChainInfo(
				EVMChain.VRCSCAN.toString(), 
				"Vrcscan Mainnet", 
				713L, 
				BlockchainType.PUBLIC.toString(), // unstable
				new EVMCurrency("Vrcscan Mainnet Gas Token", "VRC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc-mainnet-5.vrcscan.com");
					this.add("https://rpc-mainnet-6.vrcscan.com");
					this.add("https://rpc-mainnet-7.vrcscan.com");
					this.add("https://rpc-mainnet-8.vrcscan.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://dxb.vrcscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<bridge to do>");
				}},
				new ArrayList<String>() {{
					this.add("https://vrcscan.com/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.VRCSCAN, vrcscan);

		// dym
		EVMChainInfo dym = new EVMChainInfo(
				EVMChain.DYMENSION.toString(), 
				"Dymension", 
				1100L, 
				BlockchainType.PUBLIC.toString(), // unstable
				new EVMCurrency("Dymension Gas Token", "DYM", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://dymension-evm.blockpi.network/v1/rpc/public");
					this.add("https://dymension.liquify/json-rpc");
					this.add("https://dymension-evm-rpc.publicnode.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://dym.fyi");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://portal.dymension.xyz/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DYMENSION, dym);

		// merlin
		EVMChainInfo merlin = new EVMChainInfo(
				EVMChain.MERLIN.toString(), 
				"Merlin Mainnet", 
				4200L, 
				BlockchainType.PUBLIC.toString(), // unstable
				new EVMCurrency("Merlin Mainnet Gas Token", "TIME", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.merlinchain.io");
					this.add("https://merlin-mainnet-enterprise.unifra.io");
					this.add("https://rpc-merlin.rockx.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.merlinchain.io");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://merlinchain.io");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MERLIN, merlin);

		// edexa
		EVMChainInfo edexa = new EVMChainInfo(
				EVMChain.EDEXA.toString(), 
				"edeXa Mainnet", 
				5424L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("edeXa Mainnet Gas Token", "EDX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://mainnet.edexa.network/rpc");
					this.add("https://mainnet.edexa.com/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.edexa.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/5424");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.EDEXA, edexa);

		// tsc
				EVMChainInfo tsc = new EVMChainInfo(
						EVMChain.TSC.toString(), 
						"TSC Mainnet", 
						345L, 
						BlockchainType.PUBLIC.toString(),
						new EVMCurrency("TSC Mainnet Gas Token", "TAS", 18), 
						EVMPriceMechanism.LEGACY.toString(),30,
						"30000000000", //30 gwei
						null, // enforced min gasprice
						"300000", //300k units
						new ArrayList<String>() {{
							this.add("https://rpc01.trias.one");
						}}, 
						new ArrayList<String>(), // archive nodes (if available)
						new ArrayList<String>(),
						new ArrayList<String>(),
						new ArrayList<String>() {{
							this.add("https://www.tscscan.io");
						}},
						new ArrayList<String>() {{
							this.add("<TODO>");
						}},
						new ArrayList<String>() {{
							this.add("https://chainlist.org/chain/345");
						}},
						BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
						BlockchainTokenDetailsEVM.generateDummyNFTIndex());
				networks.put(EVMChain.TSC, tsc);
		
		// xchain
		EVMChainInfo xchain = new EVMChainInfo(
				EVMChain.XCHAIN.toString(), 
				"Xchain Mainnet", 
				31753L, 
				BlockchainType.BORKED.toString(), // unstable single
				new EVMCurrency("Xchain Mainnet Gas Token", "INTD", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.xchainscan.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://xchainscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/31753");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.XCHAIN, xchain);

		// entangle
		EVMChainInfo entangle = new EVMChainInfo(
				EVMChain.ENTANGLE.toString(), 
				"Entangle Mainnet", 
				33033L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Entangle Mainnet Gas Token", "NGL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://json-rpc.entangle.fi");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.entangle.fi");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/33033");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ENTANGLE, entangle);

		// etherlink
		EVMChainInfo etherlink = new EVMChainInfo(
				EVMChain.ETHERLINK.toString(), 
				"Etherlink Mainnet", 
				42793L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Etherlink Mainnet Gas Token", "XTZ", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://node.mainnet.etherlink.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.etherlink.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/42793");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ETHERLINK, etherlink);

		// inoai
		EVMChainInfo inoai = new EVMChainInfo(
				EVMChain.INOAI.toString(), 
				"Inoai Network", 
				88559L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Inoai Network Gas Token", "INO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://inoai-network.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://inoai.live");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/88559");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.INOAI, inoai);

		// chiliz
		EVMChainInfo chiliz = new EVMChainInfo(
				EVMChain.CHILIZ.toString(), 
				"Chiliz Chain Mainnet", 
				88888L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Chiliz Chain Mainnet Gas Token", "CHZ", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.chiliz.com");
					this.add("https://rpc.ankr.com/chiliz");
					this.add("https://chiliz.publicnode.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.chiliz.com");
				}},
				new ArrayList<String>() {{
					this.add("https://tatum.io/faucets/chiliz");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/88888");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CHILIZ, chiliz);

		// optopia
		EVMChainInfo optopia = new EVMChainInfo(
				EVMChain.OPTOPIA.toString(), 
				"Optopia Mainnet", 
				62050L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Optopia Mainnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-mainnet.optopia.ai");
					this.add("https://rpc-mainnet-2.optopia.ai");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.optopia.ai");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/62050");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.OPTOPIA, optopia);

		// tangle
		EVMChainInfo tangle = new EVMChainInfo(
				EVMChain.TANGLE.toString(), 
				"Tangle", 
				5845L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Tangle Gas Token", "TNT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.tangle.tools");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.tangle.tools");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/5845");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TANGLE, tangle);

		// bouncebit
		EVMChainInfo bouncebit = new EVMChainInfo(
				EVMChain.BOUNCEBIT.toString(), 
				"BounceBit Mainnet", 
				6001L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("BounceBit Mainnet Gas Token", "BB", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://fullnode-mainnet.bouncebitapi.com/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://bbscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/6001");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BOUNCEBIT, bouncebit);

		// qie
		EVMChainInfo qie = new EVMChainInfo(
				EVMChain.QIE.toString(), 
				"QIE Blockchain", 
				5656L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("QIE Blockchain Gas Token", "QIE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-main1.qiblockchain.online/");
					this.add("https://rpc-main2.qiblockchain.online/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://mainnet.qiblockchain.online");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/5656");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.QIE, qie);

		// very
		EVMChainInfo very = new EVMChainInfo(
				EVMChain.VERY.toString(), 
				"VERY Mainnet", 
				4613L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("VERY Mainnet Gas Token", "VERY", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.verylabs.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://www.veryscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/4613");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.VERY, very);

		// zksats
		EVMChainInfo zksats = new EVMChainInfo(
				EVMChain.ZKSATS.toString(), 
				"ZKSats Mainnet", 
				305L, 
				BlockchainType.BORKED.toString(), // unstable
				new EVMCurrency("ZKSats Mainnet Gas Token", "BTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://mainnet.zksats.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.zksats.io");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://zksats.io");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZKSATS, zksats);

		// mapprotocol
		EVMChainInfo mapprotocol = new EVMChainInfo(
				EVMChain.MAPPROTOCOL.toString(), 
				"MAPO Makalu Testnet", 
				22776L, 
				BlockchainType.PUBLIC.toString(), // unstable
				new EVMCurrency("MAPO Mainnet Gas Token", "MAPO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.maplabs.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://maposcan.io");
				}},
				new ArrayList<String>() {{
					this.add("<bridge to do>");
				}},
				new ArrayList<String>() {{
					this.add("https://mapprotocol.io/");
					this.add("https://www.coingecko.com/en/coins/map-protocol");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MAPPROTOCOL, mapprotocol);

		// ancient8
		EVMChainInfo ancient8 = new EVMChainInfo(
				EVMChain.ANCIENT8.toString(), 
				"Ancient8", 
				888888888L, 
				BlockchainType.PUBLIC.toString(), // unstable
				new EVMCurrency("Ancient8 Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.ancient8.gg");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.ancient8.gg");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("hhttps://ancient8.gg");
					this.add("https://chainlist.org/chain/888888888");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ANCIENT8, ancient8);

		// bstchain
		EVMChainInfo bstchain = new EVMChainInfo(
				EVMChain.BSTCHAIN.toString(), 
				"BST Chain", 
				7007L, 
				BlockchainType.BORKED.toString(), // unstable
				new EVMCurrency("BST Chain Gas Token", "BSTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.bstchain.io/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://bstscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("hhttps://rpc.bstchain.io");
					this.add("https://chainlist.org/chain/323");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BSTCHAIN, bstchain);

		// cosvm_mainnet
		EVMChainInfo cosvm_mainnet = new EVMChainInfo(
				EVMChain.COSVM.toString(), 
				"Cosvm Mainnet", 
				323L, 
				BlockchainType.BORKED.toString(), // expired ssl cert from only public node
				new EVMCurrency("Cosvm Mainnet Gas Token", "CVM", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.cosvm.net");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.cosvm.net");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://cosvm.network");
					this.add("https://chainlist.org/chain/323");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.COSVM, cosvm_mainnet);

		// fibonacci
		EVMChainInfo fibonacci = new EVMChainInfo(
				EVMChain.FIBONACCI.toString(), 
				"Fibonacci Mainnet", 
				12306L, 
				BlockchainType.BORKED.toString(), // unstable
				new EVMCurrency("Fibonacci Mainnet Gas Token", "FIBO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://node1.fibo-api.asia");
					this.add("https://node2.fibo-api.asia");
					this.add("https://node1.fibo-rpc.asia");
					this.add("https://node2.fibo-rpc.asia");
					this.add("https://node3.fibo-rpc.asia");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.fibochain.org");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://fibochain.org");
					this.add("https://www.coingecko.com/en/coins/fibonacci");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FIBONACCI, fibonacci);

		// dchain
		EVMChainInfo dchain = new EVMChainInfo(
				EVMChain.DCHAIN.toString(), 
				"DCHAIN", 
				2716446429837000L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("DCHAIN Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://dchain-2716446429837000-1.jsonrpc.sagarpc.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://dchain-2716446429837000-1.sagaexplorer.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2716446429837000");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DCHAIN, dchain);
		
		// mind
		EVMChainInfo mind = new EVMChainInfo(
				EVMChain.MINDSMARTCHAIN.toString(), 
				"Mind Smart Chain Mainnet", 
				9996L, 
				BlockchainType.BORKED.toString(), // all nodes very unstable
				new EVMCurrency("Mind Smart Chain Mainnet Gas Token", "MIND", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc-msc.mindchain.info/");
					this.add("https://seednode.mindchain.info");
					this.add("https://archive.mindchain.info/");
					this.add("https://mind-smart-chain.rpc.thirdweb.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://mainnet.mindscan.info");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://mindscan.info");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MINDSMARTCHAIN, mind);

		// hypra
		EVMChainInfo hypra = new EVMChainInfo(
				EVMChain.HYPRA.toString(), 
				"Hypra Mainnet", 
				622277L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Hypra Mainnet Gas Token", "HYP", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.hypra.network");
					this.add("https://rpc.rthcentral.org");
					this.add("https://hypra.rpc.thirdweb.com");
					this.add("https://rpc.rethereum.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.hypra.network");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://hypra.network");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.HYPRA, hypra);

		// quartzunique
		EVMChainInfo uniquequartz = new EVMChainInfo(
				EVMChain.QUARTZUNIQUE.toString(), 
				"Quartz by Unique", 
				8881L, 
				BlockchainType.BORKED.toString(), // online but borked
				new EVMCurrency("Quartz by Unique Gas Token", "QTZ", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc-quartz.unique.network");
					this.add("https://eu-rpc-quartz.unique.network");
					this.add("https://asia-rpc-quartz.unique.network");
					this.add("https://us-rpc-quartz.unique.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://uniquescan.io/quartz");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("unique.network");
					this.add("https://www.coingecko.com/en/coins/unique-network");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.QUARTZUNIQUE, uniquequartz);

		// unique
		EVMChainInfo unique = new EVMChainInfo(
				EVMChain.UNIQUE.toString(), 
				"Unique", 
				8880L, 
				BlockchainType.BORKED.toString(), // online but borked
				new EVMCurrency("Unique Gas Token", "UNQ", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.unique.network");
					this.add("https://eu-rpc.unique.network");
					this.add("https://asia-rpc.unique.network");
					this.add("https://us-rpc.unique.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://uniquescan.io/unique");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("unique.network");
					this.add("https://www.coingecko.com/en/coins/unique-network");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.UNIQUE, unique);

		// ontology
		EVMChainInfo ontology = new EVMChainInfo(
				EVMChain.ONTOLOGY.toString(), 
				"Ontology Mainnet", 
				58L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Ontology Mainnet Gas Token", "UNQ", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://dappnode1.ont.io:10339");
					this.add("http://dappnode1.ont.io:20339");
					this.add("http://dappnode2.ont.io:20339");
					this.add("http://dappnode3.ont.io:20339");
					this.add("http://dappnode4.ont.io:20339");
					this.add("https://dappnode2.ont.io:10339");
					this.add("https://dappnode3.ont.io:10339");
					this.add("https://dappnode4.ont.io:10339");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.ont.io");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://ont.io/");
					this.add("https://www.coingecko.com/en/coins/ontology");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ONTOLOGY, ontology);

		// edgeware
		EVMChainInfo edgeware = new EVMChainInfo(
				EVMChain.EDGEWARE.toString(), 
				"Unique", 
				2021L, 
				BlockchainType.BORKED.toString(), // online but weird
				new EVMCurrency("Unique Gas Token", "UNQ", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://mainnet2.edgewa.re/evm");
					this.add("https://edgeware-evm0.jelliedowl.net");
					this.add("https://edgeware-evm.jelliedowl.net");
					this.add("https://mainnet3.edgewa.re/evm");
					this.add("https://mainnet4.edgewa.re/evm");
					this.add("https://mainnet5.edgewa.re/evm");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://edgscan.live");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://www.edgeware.io/");
					this.add("https://www.coingecko.com/en/coins/edgeware");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.EDGEWARE, edgeware);

		// edgeless
		EVMChainInfo edgeless = new EVMChainInfo(
				EVMChain.EDGELESS.toString(), 
				"Edgeless Network", 
				2026L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Edgeless Network Gas Token", "EwEth", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.edgeless.network/http");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.edgeless.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2026");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.EDGELESS, edgeless);

		// vanar
		EVMChainInfo vanar = new EVMChainInfo(
				EVMChain.VANAR.toString(), 
				"Vanar Mainnet", 
				2040L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Vanar Mainnet Gas Token", "VANRY", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.vanarchain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.vanarchain.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2040");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.VANAR, vanar);

		// catena
		EVMChainInfo catena = new EVMChainInfo(
				EVMChain.CATENA.toString(), 
				"Catena Mainnet", 
				2121L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Catena Mainnet Gas Token", "CMCX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc1.catenarpc.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://catenascan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2121");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CATENA, catena);

		// omnia
		EVMChainInfo omnia = new EVMChainInfo(
				EVMChain.OMNIA.toString(), 
				"Omnia Chain", 
				2342L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Omnia Chain Gas Token", "OMNIA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.omniaverse.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.omniaverse.io");
				}},
				new ArrayList<String>() {{
					this.add("https://www.omniaverse.io");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2342");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.OMNIA, omnia);

		// jumbochain
		EVMChainInfo jumbochain = new EVMChainInfo(
				EVMChain.JUMBOCHAIN.toString(), 
				"Jumbochain Mainnet", 
				1009L, 
				BlockchainType.BORKED.toString(), // 502 from single node
				new EVMCurrency("Jumbochain Mainnet Gas Token", "JNFTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpcpriv.jumbochain.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://jumboscan.jumbochain.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1009");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.JUMBOCHAIN, jumbochain);

		// elux
		EVMChainInfo elux = new EVMChainInfo(
				EVMChain.ELUX.toString(), 
				"Elux Chain", 
				2907L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Elux Chain Gas Token", "ELUX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.eluxscan.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://eluxscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2907");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ELUX, elux);

		// nanon
		EVMChainInfo nanon = new EVMChainInfo(
				EVMChain.NANON.toString(), 
				"Nanon", 
				2748L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Nanon Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.nanon.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.nanon.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2748");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.NANON, nanon);

		// xr
		EVMChainInfo xr = new EVMChainInfo(
				EVMChain.XR.toString(), 
				"XR Sepolia", 
				2730L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("XR Sepolia Gas Token", "tXR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://xr-sepolia-testnet.rpc.caldera.xyz/http");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://xr-sepolia-testnet.explorer.caldera.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2730");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.XR, xr);

		// gm
		EVMChainInfo gm = new EVMChainInfo(
				EVMChain.GMNETWORK.toString(), 
				"GM Network Mainnet", 
				2777L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("GM Network Mainnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.gmnetwork.ai");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.gmnetwork.ai");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2777");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.GMNETWORK, gm);
		
		// ham
		EVMChainInfo ham = new EVMChainInfo(
				EVMChain.HAM.toString(), 
				"Ham", 
				5112L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Ham Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.ham.fun");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.ham.fun");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/5112");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.HAM, ham);
		
		// mo
		EVMChainInfo mo = new EVMChainInfo(
				EVMChain.MO.toString(), 
				"MO Mainnet", 
				7924L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("MO Mainnet Gas Token", "MO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://mainnet-rpc.mochain.app/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://moscan.app");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.mochain.app/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/7924");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MO, mo);
		
		// space
		EVMChainInfo space = new EVMChainInfo(
				EVMChain.SPACE.toString(), 
				"Space Subnet", 
				8227L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Space Subnet Gas Token", "FUEL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/space/mainnet/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/space");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/8227");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SPACE, space);
		
		// atleta
		EVMChainInfo atleta = new EVMChainInfo(
				EVMChain.ATLETA.toString(), 
				"Atleta Olympia", 
				2340L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Atleta Olympia Gas Token", "ATLA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.atleta.network");
					this.add("https://testnet-rpc.atleta.network:9944");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://polkadot-explorer.atleta.network/#/explorer");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.atleta.network");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2340");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ATLETA, atleta);

		// centrifuge
		EVMChainInfo centrifuge = new EVMChainInfo(
				EVMChain.CENTRIFUGE.toString(), 
				"Centrifuge", 
				2031L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Centrifuge Gas Token", "CFG", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://fullnode.centrifuge.io");
					this.add("https://centrifuge-parachain.api.onfinality.io/public");
					this.add("https://centrifuge-rpc.dwellir.com");
					this.add("https://rpc-centrifuge.luckyfriday.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://centrifuge.subscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2031");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CENTRIFUGE, centrifuge);

		// bitgert
		EVMChainInfo bitgert = new EVMChainInfo(
				EVMChain.BITGERT.toString(), 
				"Bitgert Mainnet", 
				32520L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Bitgert Mainnet Gas Token", "Brise", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.icecreamswap.com");
					this.add("https://mainnet-rpc.brisescan.com");
					this.add("https://chainrpc.com");
					this.add("https://serverrpc.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.hypra.network");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://brisescan.com");
					this.add("https://www.coingecko.com/en/coins/bitgert");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BITGERT, bitgert);

		// eluvio
		EVMChainInfo eluvio = new EVMChainInfo(
				EVMChain.ELUVIO.toString(), 
				"Eluvio Content Fabric", 
				955305L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Eluvio Content Fabric Gas Token", "ELV", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://host-76-74-28-226.contentfabric.io/eth");
					this.add("https://host-76-74-29-35.contentfabric.io/eth/");
					this.add("https://host-154-14-211-98.contentfabric.io/eth/");
					this.add("https://host-154-14-192-66.contentfabric.io/eth/");
					this.add("https://host-64-235-250-98.contentfabric.io/eth/");
					this.add("https://host-76-74-28-232.contentfabric.io/eth/");
					this.add("https://host-76-74-29-2.contentfabric.io/eth/");
					this.add("https://host-76-74-29-8.contentfabric.io/eth/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.hypra.network");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://explorer.eluv.io");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ELUVIO, eluvio);

		// defichain
		EVMChainInfo defichain = new EVMChainInfo(
				EVMChain.DEFICHAIN.toString(), 
				"DeFiChain EVM Network Mainnet", 
				1130L, 
				BlockchainType.BORKED.toString(), // single node timeouts at times
				new EVMCurrency("DeFiChain Gas Token", "DFI", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://dmc.mydefichain.com/mainnet");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://meta.defichain.com/");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://defichain.com/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DEFICHAIN, defichain);

		// coredao
		EVMChainInfo coredao = new EVMChainInfo(
				EVMChain.CORE.toString(), 
				"Core DAO Mainnet", 
				1116L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Core Gas Token", "CORE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.coredao.org/");
					this.add("https://rpc-core.icecreamswap.com");	
					this.add("https://core.drpc.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.coredao.org");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge.coredao.org/");
				}},
				new ArrayList<String>() {{
					this.add("https://coredao.org/");
				}},
				BlockchainTokenDetailsEVM.generateCoreTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CORE, coredao);

		// metadium
		EVMChainInfo metadium = new EVMChainInfo(
				EVMChain.METADIUM.toString(), 
				"Metadium Mainnet", 
				11L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Metadium Gas Token", "META", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://api.metadium.com/prod");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.metadium.com/");
				}},
				new ArrayList<String>() {{
					this.add("<faucet-todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://metadium.com");
					this.add("https://www.coingecko.com/en/coins/metadium");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.METADIUM, metadium);

		// optimism
		EVMChainInfo optimism = new EVMChainInfo(
				EVMChain.OPTIMISM.toString(), 
				"Optimism Mainnet", 
				10L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Optimism Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://mainnet.optimism.io");
					this.add("https://optimism.publicnode.com");
					this.add("https://optimism.gateway.tenderly.co");
					this.add("https://optimism-rpc.publicnode.com");
					this.add("https://optimism.drpc.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://optimistic.etherscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<faucet-todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://www.optimism.io/");
					this.add("https://chainid.link/?network=optimism");
				}},
				BlockchainTokenDetailsEVM.generateOptimismTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.OPTIMISM, optimism);

		// conflux
		EVMChainInfo conflux = new EVMChainInfo(
				EVMChain.CONFLUX.toString(), 
				"Conflux eSpace", 
				1030L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Conflux Token", "CFX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://evm.confluxrpc.com");
					this.add("https://conflux-espace-public.unifra.io"); // quickly gives 429 rate limit ..
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://evm.confluxscan.net");
					this.add("https://conflux-espace-public.unifra.io");
				}},
				new ArrayList<String>() {{
					this.add("faucet todo");
				}},
				new ArrayList<String>() {{
					this.add("https://confluxnetwork.org/");
				}},
				BlockchainTokenDetailsEVM.generateConfluxTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CONFLUX, conflux);

		// playdapp
		EVMChainInfo playdapp = new EVMChainInfo(
				EVMChain.PLAYDAPP.toString(), 
				"Playdapp Network", 
				504441L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Playdapp Network Gas Token", "PDA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/playdappne/mainnet/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/playdappne");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/504441");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PLAYDAPP, playdapp);

		// docoin
		EVMChainInfo docoin = new EVMChainInfo(
				EVMChain.DOCOIN.toString(), 
				"DoCoin Community Chain", 
				526916L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("DoCoin Community Chain Gas Token", "DCT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.docoin.shop");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.docoin.shop");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/526916");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DOCOIN, docoin);

		// dot
		EVMChainInfo dot = new EVMChainInfo(
				EVMChain.DOTBLOX.toString(), 
				"Dot Blox", 
				7923L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Dot Blox Gas Token", "DTBX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.dotblox.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.dotblox.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/7923");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DOTBLOX, dot);

		// cyber
		EVMChainInfo cyber = new EVMChainInfo(
				EVMChain.CYBER.toString(), 
				"Cyber Mainnet", 
				7560L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Cyber Mainnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.cyber.co/");
					this.add("https://cyber.alt.technology/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://cyberscan.co");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/7560");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CYBER, cyber);

		// inevm
		EVMChainInfo inevm = new EVMChainInfo(
				EVMChain.INEVM.toString(), 
				"inEVM Mainnet", 
				2525L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("inEVM Mainnet Gas Token", "INJ", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://mainnet.rpc.inevm.com/http");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2525");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.INEVM, inevm);

		// kava
		EVMChainInfo kava = new EVMChainInfo(
				EVMChain.KAVA.toString(), 
				"KAVA Evm Mainnet", 
				2222L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("KAVA Token", "KAVA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers ..
				new ArrayList<String>() {{
					this.add("https://evm2.kava.io");
					this.add("https://evm.kava.io");
					this.add("https://kava-rpc.gateway.pokt.network");
					this.add("https://evm.kava.chainstacklabs.com");
					this.add("https://kava-evm.publicnode.com");
					this.add("https://evm.kava-rpc.com");
					this.add("https://rpc.ankr.com/kava_evm");
					this.add("https://kava-evm-rpc.publicnode.com");
					this.add("https://kava.drpc.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.kava.io/");
				}},
				new ArrayList<String>() {{
					this.add("faucet-todo");
				}},
				new ArrayList<String>() {{
					this.add("https://kava.io");
					this.add("https://docs.kava.io/docs/ethereum/metamask/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.KAVA, kava);

		// hychain
		EVMChainInfo hychain = new EVMChainInfo(
				EVMChain.HYCHAIN.toString(), 
				"HYCHAIN", 
				2911L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("HYCHAIN Gas Token", "TOPIA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.hychain.com/http");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.hychain.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2911");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.HYCHAIN, hychain);

		// scroll
		EVMChainInfo scroll = new EVMChainInfo(
				EVMChain.SCROLL.toString(), 
				"Scroll Mainnet", 
				534352L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Scroll Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://scroll.blockpi.network/v1/rpc/public");
					this.add("https://rpc-scroll.icecreamswap.com");
					this.add("https://rpc.scroll.io");
					this.add("https://1rpc.io/scroll");
					this.add("https://rpc.ankr.com/scroll");
					this.add("https://scroll-mainnet.chainstacklabs.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://blockscout.scroll.io");
				}},
				new ArrayList<String>() {{
					this.add("https://scroll.io/bridge");
				}},
				new ArrayList<String>() {{
					this.add("https://scroll.io");
				}},
				BlockchainTokenDetailsEVM.generateScrollTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SCROLL, scroll);

		// etc
		EVMChainInfo etc = new EVMChainInfo(
				EVMChain.ETC.toString(), 
				"Ethereum Classic Mainnet", 
				61L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Ethereum Classic Gas Token", "ETC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://etc.rivet.link");
					this.add("https://etc.etcdesktop.com");
					this.add("https://etc.mytokenpocket.vip");
					this.add("https://besu-at.etc-network.info");
					this.add("https://besu-de.etc-network.info");
					this.add("https://geth-at.etc-network.info");
					this.add("https://geth-de.etc-network.info");
					this.add("https://rpc.etcinscribe.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://blockscout.com/etc/mainnet");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://www.coingecko.com/en/coins/ethereum-classic");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ETC, etc);

		// okx
		EVMChainInfo okx = new EVMChainInfo(
				EVMChain.OKX.toString(), 
				"OKXChain Mainnet", 
				66L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("OKXChain Mainnet Gas Token", "OKT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://exchainrpc.okex.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://www.oklink.com/en/okc");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://www.okx.com/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.OKX, okx);

		// linea
		EVMChainInfo linea = new EVMChainInfo(
				EVMChain.LINEA.toString(), 
				"Linea Mainnet", 
				59144L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Linea Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1600000000", //1.6 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.linea.build");
					this.add("https://linea.drpc.org");
					this.add("https://linea.blockpi.network/v1/rpc/public");
					this.add("https://1rpc.io/linea");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://lineascan.build");
				}},
				new ArrayList<String>() {{
					this.add("faucet-todo");
				}},
				new ArrayList<String>() {{
					this.add("https://linea.build/");
				}},
				BlockchainTokenDetailsEVM.generateLineaTokenIndex(),
				BlockchainTokenDetailsEVM.generateLineaNFTIndex());
		networks.put(EVMChain.LINEA, linea);

		// bifrost
		EVMChainInfo bifrost = new EVMChainInfo(
				EVMChain.BIFROST.toString(), 
				"Bifrost Mainnet", 
				3068L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Bifrost Token", "BFC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1600000000", //1.6 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://public-01.mainnet.thebifrost.io/rpc");
					this.add("https://public-02.mainnet.thebifrost.io/rpc");
					this.add("https://public-01.mainnet.bifrostnetwork.com/rpc");
					this.add("https://public-02.mainnet.bifrostnetwork.com/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.mainnet.thebifrost.io");
				}},
				new ArrayList<String>() {{
					this.add("faucet-todo");
				}},
				new ArrayList<String>() {{
					this.add("https://www.coingecko.com/en/coins/bifrost");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BIFROST, bifrost);

		// xodex
		EVMChainInfo xodex = new EVMChainInfo(
				EVMChain.XODEX.toString(), 
				"XODEX", 
				2415L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Bifrost Token", "XODEX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1600000000", //1.6 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://mainnet.xo-dex.com/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.xo-dex.com");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge.xodex.app/transfer");
				}},
				new ArrayList<String>() {{
					this.add("https://www.xo-dex.com/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.XODEX, xodex);

		// dischain
		EVMChainInfo dischain = new EVMChainInfo(
				EVMChain.DISCHAIN.toString(), 
				"DisChain", 
				513100L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("DisChain Gas Token", "DIS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.dischain.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://www.oklink.com/dis");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/513100");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DISCHAIN, dischain);

		// zklink
		EVMChainInfo zklink = new EVMChainInfo(
				EVMChain.ZKLINK.toString(), 
				"zkLink Nova Mainnet", 
				810180L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("zkLink Nova Mainnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.zklink.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.zklink.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/810180");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZKLINK, zklink);


		// pulsechain
		EVMChainInfo pulsechain = new EVMChainInfo(
				EVMChain.PULSECHAIN.toString(), 
				"PulseChain", 
				369L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("PulseChain Token", "PLS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. crazy usage atm
				new ArrayList<String>() {{
					this.add("https://rpc.pulsechain.com");
					this.add("https://rpc-pulsechain.g4mm4.io");
					this.add("https://pulsechain.publicnode.com");
					this.add("https://pulsechain-rpc.publicnode.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.pulsechain.com");
				}},
				new ArrayList<String>() {{
					this.add("faucet-todo");
				}},
				new ArrayList<String>() {{
					this.add("https://pulsechain.com/");
				}},
				BlockchainTokenDetailsEVM.generatePulsechainTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PULSECHAIN, pulsechain);

		// satoshichain
		EVMChainInfo satoshichain = new EVMChainInfo(
				EVMChain.SATOSHICHAIN.toString(), 
				"SatoshiChain Mainnet", 
				12009L, 
				BlockchainType.BORKED.toString(), 
				new EVMCurrency("SATS Token", "SATS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"550030000000000", //550030 gwei, recommended 550k+ gwei default?
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. crazy usage atm
				new ArrayList<String>() {{
					this.add("https://mainnet-rpc.satoshichain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://satoshiscan.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.satoshichain.io/");
				}},
				new ArrayList<String>() {{
					this.add("https://satoshichain.medium.com/important-announcement-regarding-satoshichain-transitioning-forward-cf320190f2dc");
					this.add("https://satoshix.io/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SATOSHICHAIN, satoshichain);

		// zkevm
		EVMChainInfo zkevm = new EVMChainInfo(
				EVMChain.ZKEVM.toString(), 
				"Polygon ZKEVM Network", 
				1101L, 
				BlockchainType.BORKED.toString(), // quite unstable atm, 500; {"id":37482,"jsonrpc":"2.0","error":{"message":"Unable to perform request","code":19}}
				new EVMCurrency("ETH Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://zkevm-rpc.com");
					this.add("https://rpc.polygon-zkevm.gateway.fm");
					this.add("https://rpc.ankr.com/polygon_zkevm");
					this.add("https://polygon-zkevm.drpc.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://zkevm.polygonscan.com/");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge.zkevm-rpc.com/");
				}},
				new ArrayList<String>() {{
					this.add("https://wiki.polygon.technology/docs/zkEVM/develop");
				}},
				BlockchainTokenDetailsEVM.generateZKEVMTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZKEVM, zkevm);

		// doric
		EVMChainInfo doric = new EVMChainInfo(
				EVMChain.DORIC.toString(), 
				"Doric Network", 
				1717L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Doric Network Gas Token", "DRC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://mainnet.doric.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.doric.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1717");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DORIC, doric);

		// reya
		EVMChainInfo reya = new EVMChainInfo(
				EVMChain.REYA.toString(), 
				"Reya Network", 
				1729L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Reya Network Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.reya.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.reya.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1729");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.REYA, reya);

		// hubble
		EVMChainInfo hubble = new EVMChainInfo(
				EVMChain.HUBBLE.toString(), 
				"Hubble Exchange", 
				1992L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Hubble Exchange Gas Token", "USDC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.hubble.exchange");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.hubble.exchange");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1992");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.HUBBLE, hubble);

		// xpla
		EVMChainInfo xpla = new EVMChainInfo(
				EVMChain.XPLA.toString(), 
				"Xpla Mainnet", 
				37L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Xpla Gas Token", "XPLA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://dimension-evm-rpc.xpla.dev");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.xpla.io/mainnet");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://xpla.io/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.XPLA, xpla);

		// framechain
		EVMChainInfo framechain = new EVMChainInfo(
				EVMChain.FRAMECHAIN.toString(), 
				"Syndicate Frame Chain", 
				5101L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Syndicate Frame Chain Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rpc-frame.syndicate.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-frame.syndicate.io/");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge-frame.syndicate.io");
				}},
				new ArrayList<String>() {{
					this.add("https://www.farcaster.xyz/");
					this.add("https://frame.syndicate.io/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FRAMECHAIN, framechain);

		// unreal_gelato
		EVMChainInfo unreal_gelato = new EVMChainInfo(
				EVMChain.UNREAL.toString(), 
				"Unreal", 
				18233L, 
				BlockchainType.BORKED.toString(), // single node unstable
				new EVMCurrency("Unreal Gas Token", "NEXB", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rpc.unreal-orbit.gelato.digital");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://unreal.blockscout.com");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://gelato.digital");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.UNREAL, unreal_gelato);

		// quantum
		EVMChainInfo quantum = new EVMChainInfo(
				EVMChain.QUANTUM.toString(), 
				"Quantum Network", 
				44445L, 
				BlockchainType.BORKED.toString(), // single node unstable
				new EVMCurrency("Quantum Network Gas Token", "QTM", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpcqtm.avescoin.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://qtm.avescoin.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/44445");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.QUANTUM, quantum);

		// caga
		EVMChainInfo caga = new EVMChainInfo(
				EVMChain.CAGA.toString(), 
				"CAGA crypto Ankara testnet", 
				72778L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("CAGA crypto Ankara testnet Gas Token", "CAGA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://www.ankara-cagacrypto.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.ankara-cagacrypto.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/72778");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CAGA, caga);

		// re.al
		EVMChainInfo real = new EVMChainInfo(
				EVMChain.REAL.toString(), 
				"re.al", 
				111188L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("re.al Gas Token", "reETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://real.drpc.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.re.al");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/111188");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.REAL, real);

		// larissa
		EVMChainInfo larissa = new EVMChainInfo(
				EVMChain.LARISSA.toString(), 
				"Larissa Chain", 
				9898L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Larissa Chain Gas Token", "LRS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.larissa.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.larissa.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/9898");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.LARISSA, larissa);

		// bevm
		EVMChainInfo bevm = new EVMChainInfo(
				EVMChain.BEVM.toString(), 
				"BEVM Mainnet", 
				11501L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("BEVM Mainnet Gas Token", "BTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-mainnet-2.bevm.io/");
					this.add("https://rpc-mainnet-1.bevm.io/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan-mainnet.bevm.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/11501");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BEVM, bevm);

		// ptcescan
		EVMChainInfo ptcescan = new EVMChainInfo(
				EVMChain.PTCESCAN.toString(), 
				"PTCESCAN Mainnet", 
				889910246L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("PTCESCAN Mainnet Gas Token", "PTCE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.ptcscan.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://ptcscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/889910246");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PTCESCAN, ptcescan);

		// rari
		EVMChainInfo rari = new EVMChainInfo(
				EVMChain.RARI.toString(), 
				"RARI Chain Mainnet", 
				1380012617L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("RARI Chain Mainnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rari.calderachain.xyz/http");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://mainnet.explorer.rarichain.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1380012617");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.RARI, rari);

		// vitruveo
		EVMChainInfo vitruveo = new EVMChainInfo(
				EVMChain.VITRUVEO.toString(), 
				"Vitruveo Mainnet", 
				1490L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Vitruveo Mainnet Gas Token", "VTRU", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rpc.vitruveo.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.vitruveo.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1490");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.VITRUVEO, vitruveo);


		// lorenzo
		EVMChainInfo lorenzo = new EVMChainInfo(
				EVMChain.LORENZO.toString(), 
				"Lorenzo", 
				8329L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Lorenzo Gas Token", "stBTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.lorenzo-protocol.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.lorenzo-protocol.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/8329");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.LORENZO, lorenzo);
		
		// aura
		EVMChainInfo aura = new EVMChainInfo(
				EVMChain.AURA.toString(), 
				"Aura Mainnet", 
				6322L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Aura Mainnet Gas Token", "AURA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://jsonrpc.aura.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://aurascan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/6322");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.AURA, aura);
		
		// whitechain
		EVMChainInfo whitechain = new EVMChainInfo(
				EVMChain.WHITECHAIN.toString(), 
				"Whitechain", 
				1875L, 
				BlockchainType.BORKED.toString(), // unstable single node
				new EVMCurrency("Whitechain Gas Token", "WBT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rpc.whitechain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.whitechain.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1875");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.WHITECHAIN, whitechain);

		// ethxy
		EVMChainInfo ethxy = new EVMChainInfo(
				EVMChain.ETHXY.toString(), 
				"EthXY", 
				969L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("EthXY Gas Token", "SEXY", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.ethxy.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.ethxy.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/969");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ETHXY, ethxy);

		// gravity
		EVMChainInfo gravity = new EVMChainInfo(
				EVMChain.GRAVITY.toString(), 
				"Gravity Alpha Mainnet", 
				1625L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Gravity Alpha Mainnet Gas Token", "G.", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.gravity.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.gravity.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1625");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.GRAVITY, gravity);
		
		// metal
		EVMChainInfo metal = new EVMChainInfo(
				EVMChain.METAL.toString(), 
				"Metal L2", 
				1750L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Metal L2 Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.metall2.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.metall2.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1750");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.METAL, metal);
		
		// panarchy
		EVMChainInfo panarchy = new EVMChainInfo(
				EVMChain.PANARCHY.toString(), 
				"Panarchy", 
				2013L, 
				BlockchainType.BORKED.toString(), // unstable single
				new EVMCurrency("Panarchy Gas Token", "GAS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://polytopia.org:8545");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2013");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PANARCHY, panarchy);
		
		// sanko
		EVMChainInfo sanko = new EVMChainInfo(
				EVMChain.SANKO.toString(), 
				"Sanko", 
				1996L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Sanko Gas Token", "DMT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://mainnet.sanko.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.sanko.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1996");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SANKO, sanko);
		
		// onigiri
		EVMChainInfo onigiri = new EVMChainInfo(
				EVMChain.ONIGIRI.toString(), 
				"ONIGIRI Subnet", 
				5040L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("ONIGIRI Subnet Gas Token", "ONGR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/onigiri/mainnet/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/onigiri");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/5040");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ONIGIRI, onigiri);

		// nahmii2
		EVMChainInfo nahmii2 = new EVMChainInfo(
				EVMChain.NAHMII2.toString(), 
				"Nahmii 2 Mainnet", 
				5551L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Nahmii 2 Mainnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://l2.nahmii.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.n2.nahmii.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/5551");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.NAHMII2, nahmii2);
		
		// pools
		EVMChainInfo pools = new EVMChainInfo(
				EVMChain.POOLS.toString(), 
				"Pools Mainnet", 
				6868L, 
				BlockchainType.BORKED.toString(), // unstable single node
				new EVMCurrency("Pools Mainnet Gas Token", "POOLS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.poolsmobility.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.poolsmobility.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/6868");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.POOLS, pools);
		
		// algen
		EVMChainInfo algen = new EVMChainInfo(
				EVMChain.ALGEN.toString(), 
				"Algen", 
				8911L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Algen Gas Token", "ALG", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.algen.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.algen.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/8911");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ALGEN, algen);
		
		// algenl2
		EVMChainInfo algenl2 = new EVMChainInfo(
				EVMChain.ALGENL2.toString(), 
				"Algen Layer2", 
				8921L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Algen Layer2 Gas Token", "ALG", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.alg2.algen.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.alg2.algen.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/8921");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ALGENL2, algenl2);
		
		// mint
		EVMChainInfo mint = new EVMChainInfo(
				EVMChain.MINT.toString(), 
				"Mint Mainnet", 
				185L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Mint Mainnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.mintchain.io");
					this.add("https://asia.rpc.mintchain.io");
					this.add("https://global.rpc.mintchain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.mintchain.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/185");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MINT, mint);

		// lycan
		EVMChainInfo lycan = new EVMChainInfo(
				EVMChain.LYCAN.toString(), 
				"Lycan Chain", 
				721L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Lycan Chain Gas Token", "LYC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.lycanchain.com/");
					this.add("https://us-east.lycanchain.com");
					this.add("https://us-west.lycanchain.com");
					this.add("https://eu-north.lycanchain.com");
					this.add("https://eu-west.lycanchain.com");
					this.add("https://asia-southeast.lycanchain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.lycanchain.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/721");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.LYCAN, lycan);
		
		// tycooncoin
		EVMChainInfo tycooncoin = new EVMChainInfo(
				EVMChain.TYCOONCOIN.toString(), 
				"Tycooncoin", 
				3630L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Tycooncoin Gas Token", "TYCO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://mainnet-rpc.tycoscan.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/3630");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TYCOONCOIN, tycooncoin);
		
		// l3x
		EVMChainInfo l3x = new EVMChainInfo(
				EVMChain.L3X.toString(), 
				"L3X Protocol", 
				12324L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("L3X Protocol Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-mainnet.l3x.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.l3x.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/12324");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.L3X, l3x);
		
		// defi
		EVMChainInfo defi = new EVMChainInfo(
				EVMChain.DEFIORACLE.toString(), 
				"Defi Oracle Meta Mainnet", 
				138L, 
				BlockchainType.BORKED.toString(), // single node unstable
				new EVMCurrency("Defi Oracle Meta Mainnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.defi-oracle.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.defi-oracle.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/138");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DEFIORACLE, defi);
		
		// defiverse
		EVMChainInfo defiverse = new EVMChainInfo(
				EVMChain.DEFIVERSE.toString(), 
				"DeFiVerse Mainnet", 
				16116L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("DeFiVerse Mainnet Gas Token", "OAS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.defi-verse.org/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.defi-verse.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/16116");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DEFIVERSE, defiverse);

		// ebi
		EVMChainInfo ebi = new EVMChainInfo(
				EVMChain.EBI.toString(), 
				"Ebi Chain", 
				98881L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Ebi Chain Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.ebi.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/98881");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.EBI, ebi);
		
		// lavita
		EVMChainInfo lavita = new EVMChainInfo(
				EVMChain.LAVITA.toString(), 
				"LAVITA Mainnet", 
				360890L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("LAVITA Mainnet Gas Token", "vTFUEL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://tsub360890-eth-rpc.thetatoken.org/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://tsub360890-explorer.thetatoken.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/360890");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.LAVITA, lavita);
		
		// uchain
		EVMChainInfo uchain = new EVMChainInfo(
				EVMChain.UCHAIN.toString(), 
				"UCHAIN Mainnet", 
				2112L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("UCHAIN Mainnet Gas Token", "UCASH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.uchain.link/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://uchain.info");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2112");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.UCHAIN, uchain);

		// tobe
		EVMChainInfo tobe = new EVMChainInfo(
				EVMChain.TOBE.toString(), 
				"Tobe Chain", 
				4080L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Tobe Chain Gas Token", "TBC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.tobescan.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://tobescan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/4080");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TOBE, tobe);



		// beam
		EVMChainInfo beam = new EVMChainInfo(
				EVMChain.BEAM.toString(), 
				"Beam Mainnet", 
				4337L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Beam Gas Token", "BEAM", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/beam/mainnet/rpc");
					this.add("https://build.onbeam.com/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/beam");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://meritcircle.io/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BEAM, beam);

		// hizoco
		EVMChainInfo hizoco = new EVMChainInfo(
				EVMChain.HIZOCO.toString(), 
				"Hizoco mainnet", 
				80096L, 
				BlockchainType.BORKED.toString(), // single node unstable
				new EVMCurrency("Hizoco mainnet Gas Token", "HZC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://hizoco.net/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://hizoco.net:38443");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://hizoco.net");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.HIZOCO, hizoco);

		// viridis
		EVMChainInfo viridis = new EVMChainInfo(
				EVMChain.VIRIDIS.toString(), 
				"Viridis Mainnet", 
				422L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Viridis Mainnet Gas Token", "VRD", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://mainnet-rpc.vrd.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.vrd.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/422");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.VIRIDIS, viridis);

		// aternos
		EVMChainInfo aternos = new EVMChainInfo(
				EVMChain.ATERNOS.toString(), 
				"Aternos", 
				12020L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Aternos Gas Token", "ATR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rpc.aternoschain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.aternoschain.com");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.aternoschain.com");
					this.add("https://www.coingecko.com/en/coins/aternos-chain");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/12020");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ATERNOS, aternos);

		// c4ei
		EVMChainInfo c4ei = new EVMChainInfo(
				EVMChain.C4EI.toString(), 
				"C4EI", 
				21004L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("C4EI Gas Token", "C4EI", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rpc.c4ei.net");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://exp.c4ei.net");
				}},
				new ArrayList<String>() {{
					this.add("https://play.google.com/store/apps/details?id=net.c4ei.fps2");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/21004");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.C4EI, c4ei);

		// karak
		EVMChainInfo karak = new EVMChainInfo(
				EVMChain.KARAK.toString(), 
				"Karak Mainnet", 
				2410L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Karak Mainnet Gas Token", "KRK", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rpc.karak.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.karak.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2410");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.KARAK, karak);

		// selendra
		EVMChainInfo selendra = new EVMChainInfo(
				EVMChain.SELENDRA.toString(), 
				"Selendra Network Mainnet", 
				1961L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Selendra Network Mainnet Gas Token", "SEL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rpc0.selendra.org");
					this.add("https://rpc1.selendra.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.selendra.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1961");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SELENDRA, selendra);

		// zilliqa
		EVMChainInfo zilliqa = new EVMChainInfo(
				EVMChain.ZILLIQA.toString(), 
				"Zilliqa Mainnet", 
				32769L, 
				BlockchainType.BORKED.toString(), // single node down
				new EVMCurrency("Zilliqa Gas Token", "ZIL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://api.zilliqa.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://evmx.zilliqa.com");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/32769");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZILLIQA, zilliqa);

		// kingdom
		EVMChainInfo kingdom = new EVMChainInfo(
				EVMChain.KINGDOM.toString(), 
				"Kingdom Chain", 
				39916801L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Kingdom Chain Gas Token", "KOZI", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://kingdomchain.observer/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://www.beastkingdom.io/travelsong");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/39916801");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.KINGDOM, kingdom);

		// op
		EVMChainInfo oprasp = new EVMChainInfo(
				EVMChain.OPCELESTIARASPBERRY.toString(), 
				"OP Celestia Raspberry", 
				123420111L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("OP Celestia Raspberry Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.opcelestia-raspberry.gelato.digital");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://opcelestia-raspberry.gelatoscout.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/123420111");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.OPCELESTIARASPBERRY, oprasp);

		// polygon
		EVMChainInfo polygon_blackberry = new EVMChainInfo(
				EVMChain.POLYGONBLACKBERRY.toString(), 
				"Polygon Blackberry", 
				94204209L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Polygon Blackberry Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.polygon-blackberry.gelato.digital");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://polygon-blackberry.gelatoscout.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/94204209");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.POLYGONBLACKBERRY, polygon_blackberry);

		// oasissapphire
		EVMChainInfo oasissapphire = new EVMChainInfo(
				EVMChain.OASISSAPPHIRE.toString(), 
				"Oasis Sapphire Network", 
				23294L, 
				BlockchainType.PUBLIC.toString(), 
				new EVMCurrency("Oasis Token", "ROSE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://sapphire.oasis.io");
					this.add("https://1rpc.io/oasis/sapphire");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.sapphire.oasis.io/");
				}},
				new ArrayList<String>() {{
					this.add("faucet-todo");
				}},
				new ArrayList<String>() {{
					this.add("https://oasisprotocol.org/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.OASISSAPPHIRE, oasissapphire);

		// oasisemerald
		EVMChainInfo oasisemerald = new EVMChainInfo(
				EVMChain.OASISEMERALD.toString(), 
				"Oasis Emerald Network", 
				42262L, 
				BlockchainType.PUBLIC.toString(), 
				new EVMCurrency("Oasis Token", "ROSE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://emerald.oasis.dev");
					this.add("https://1rpc.io/oasis/emerald");
					this.add("https://emerald.oasis.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.emerald.oasis.dev/");
				}},
				new ArrayList<String>() {{
					this.add("faucet-todo");
				}},
				new ArrayList<String>() {{
					this.add("https://oasisprotocol.org/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.OASISEMERALD, oasisemerald);

		// swamps
		EVMChainInfo swamps = new EVMChainInfo(
				EVMChain.SWAMPS.toString(), 
				"Swamps L2", 
				45454L, 
				BlockchainType.BORKED.toString(), // single unstable
				new EVMCurrency("Swamps L2 Gas Token", "SWP", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://swamps.tc.l2aas.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://swamps-explorer.tc.l2aas.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/45454");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SWAMPS, swamps);

		// electroneum
		EVMChainInfo electroneum = new EVMChainInfo(
				EVMChain.ELECTRONEUM.toString(), 
				"Electroneum Mainnet", 
				52014L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Electroneum Mainnet Gas Token", "ETN", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.electroneum.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://blockexplorer.electroneum.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/52014");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ELECTRONEUM, electroneum);

		// global
		EVMChainInfo global = new EVMChainInfo(
				EVMChain.GLOBAL.toString(), 
				"Global Trust Network", 
				101010L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Global Trust Network Gas Token", "FREE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://gtn.stabilityprotocol.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://stability.blockscout.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/101010");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.GLOBAL, global);

		// stratis
		EVMChainInfo stratis = new EVMChainInfo(
				EVMChain.STRATIS.toString(), 
				"Stratis Mainnet", 
				105105L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Stratis Mainnet Gas Token", "STRAX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.stratisevm.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.stratisevm.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/105105");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.STRATIS, stratis);

		// zedxion
		EVMChainInfo zedxion = new EVMChainInfo(
				EVMChain.ZEDXION.toString(), 
				"ZEDXION", 
				83872L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("ZEDXION Gas Token", "zedx", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://mainnet-rpc.zedscan.net");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("http://zedscan.net");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/83872");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZEDXION, zedxion);

		// one
		EVMChainInfo one = new EVMChainInfo(
				EVMChain.ONE.toString(), 
				"One World Chain Mainnet", 
				309075L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("One World Chain Mainnet Gas Token", "OWCT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://mainnet-rpc.oneworldchain.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://mainnet.oneworldchain.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/309075");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ONE, one);

		// hydradx
		EVMChainInfo hydradx = new EVMChainInfo(
				EVMChain.HYDRADX.toString(), 
				"HydraDX", 
				222222L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("HydraDX Gas Token", "WETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.hydradx.cloud");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.evm.hydration.cloud");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/222222");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.HYDRADX, hydradx);

		// bitlayer
		EVMChainInfo bitlayer = new EVMChainInfo(
				EVMChain.BITLAYER.toString(), 
				"Bitlayer Mainnet", 
				200901L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Bitlayer Mainnet Gas Token", "BTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.bitlayer-rpc.com");
					this.add("https://rpc.ankr.com/bitlayer");
					this.add("https://rpc-bitlayer.rockx.com");
					this.add("https://rpc.bitlayer.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://www.btrscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/200901");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BITLAYER, bitlayer);

		// oasischain
		EVMChainInfo oasischain = new EVMChainInfo(
				EVMChain.OASISCHAIN.toString(), 
				"Oasis Chain", 
				26863L, 
				BlockchainType.PUBLIC.toString(), 
				new EVMCurrency("Oasis Token", "OAC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rpc1.oasischain.io");
					this.add("https://rpc2.oasischain.io");
					this.add("https://rpc3.oasischain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.oasischain.io/");
				}},
				new ArrayList<String>() {{
					this.add("faucet-todo");
				}},
				new ArrayList<String>() {{
					this.add("https://oasischain.io/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.OASISCHAIN, oasischain);

		// canto
		EVMChainInfo canto = new EVMChainInfo(
				EVMChain.CANTO.toString(), 
				"Canto Network", 
				7700L, 
				BlockchainType.PUBLIC.toString(), 
				new EVMCurrency("Canto Token", "CANTO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://canto.gravitychain.io");
					this.add("https://canto.slingshot.finance/");
					this.add("https://canto.evm.chandrastation.com/");
					this.add("https://jsonrpc.canto.nodestake.top");
					this.add("https://canto.slingshot.finance");
					this.add("https://mainnode.plexnode.org:8545");
					this.add("https://canto.gravitychain.io/");
					this.add("https://jsonrpc.canto.nodestake.top/");
					this.add("https://canto-rpc.ansybl.io");

					//this.add("https://canto.neobase.one/"); // dead
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://tuber.build/");
				}},
				new ArrayList<String>() {{
					this.add("faucet-todo");
				}},
				new ArrayList<String>() {{
					this.add("https://docs.canto.io/user-guides/connecting-to-canto");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CANTO, canto);

		// syscoin
		EVMChainInfo syscoin = new EVMChainInfo(
				EVMChain.SYSCOIN.toString(), 
				"SYSCoin Mainnet", 
				57L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("SYS", "SYS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rpc.syscoin.org");
					this.add("https://syscoin-evm.publicnode.com");
					this.add("https://rpc.ankr.com/syscoin");
					this.add("https://syscoin.public-rpc.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://explorer.syscoin.org");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.syscoin.org/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/57");
					this.add("https://syscoin.medium.com/setting-up-metamask-for-syscoin-nevm-ea0012d6d1c8");
					this.add("https://www.coingecko.com/en/coins/syscoin");
					this.add("https://bridge.syscoin.org");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SYSCOIN, syscoin);

		// milkomediaC1
		EVMChainInfo milkomedaC1 = new EVMChainInfo(
				EVMChain.MILKOMEDAC1.toString(), 
				"Milkomeda Cardano mainnet", 
				2001L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("milkADA", "mADA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rpc-mainnet-cardano-evm.c1.milkomeda.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://explorer-mainnet-cardano-evm.c1.milkomeda.com/");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2001");
					this.add("https://app.blueshift.fi/#/bridge");
				}},
				BlockchainTokenDetailsEVM.generateMilkomedaC1TokenIndex(),
				BlockchainTokenDetailsEVM.generateMilkomedaC1NFTIndex());
		networks.put(EVMChain.MILKOMEDAC1, milkomedaC1);

		// milkomediaA1
		EVMChainInfo milkomediaA1 = new EVMChainInfo(
				EVMChain.MILKOMEDAA1.toString(), 
				"Milkomeda Algorand mainnet", 
				2002L, 
				BlockchainType.BORKED.toString(), // dead :(
				new EVMCurrency("milkALGO", "milkALGO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rpc-mainnet-algorand-rollup.a1.milkomeda.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://explorer-mainnet-algorand-rollup.a1.milkomeda.com");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2002");
					this.add("https://dcspark.github.io/milkomeda-documentation/algorand/for-end-users/configuring-metamask/");
					this.add("https://algorand-bridge.milkomeda.com/mainnet");
				}},
				BlockchainTokenDetailsEVM.generateMilkomedaA1TokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MILKOMEDAA1, milkomediaA1);

		// wemix
		EVMChainInfo wemix = new EVMChainInfo(
				EVMChain.WEMIX.toString(), 
				"WEMIX mainnet", 
				1111L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("WEMIX", "WEMIX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"101000000000", //101 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://api.wemix.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://explorer.wemix.com");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1111");
					this.add("https://medium.com/wemix-communication/metamask-wemix3-0-mainnet-setting-guide-1a249fcaf866");
				}},
				BlockchainTokenDetailsEVM.generateWemixTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.WEMIX, wemix);

		// arbitrum one
		EVMChainInfo arbitrum_one = new EVMChainInfo(
				EVMChain.ARBITRUMONE.toString(), 
				"Arbitrum ONE mainnet", 
				42161L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("ETH", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://arb1.arbitrum.io/rpc");
					this.add("https://arbitrum.llamarpc.com");
					this.add("https://arbitrum.drpc.org");
					this.add("https://arbitrum-one.publicnode.com");
					this.add("https://arbitrum-one.public.blastapi.io");
					this.add("https://rpc.arb1.arbitrum.gateway.fm");
					this.add("https://1rpc.io/arb");
					this.add("https://rpc.ankr.com/arbitrum");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://arb1.arbitrum.io/rpc");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/42161");
				}},
				BlockchainTokenDetailsEVM.generateArbitrumONETokenIndex(),
				BlockchainTokenDetailsEVM.generateArbitrumNFTIndex());
		networks.put(EVMChain.ARBITRUMONE, arbitrum_one);

		// astar
		EVMChainInfo astar = new EVMChainInfo(
				EVMChain.ASTAR.toString(), 
				"ASTAR Mainnet", 
				592L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("ASTR", "ASTR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://astar.public.blastapi.io");
					this.add("https://evm.astar.network");
					this.add("https://1rpc.io/astr");	
					this.add("https://astar-rpc.dwellir.com");

					//this.add("https://rpc.astar.network:8545"); // continously times out
					//this.add("https://astar-mainnet.g.alchemy.com/v2/demo"); // gone
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://astar.subscan.io");
					this.add("https://blockscout.com/astar");
				}},
				new ArrayList<String>() {{
					this.add("https://portal.astar.network");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/592");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ASTAR, astar);

		// deepl
		EVMChainInfo deepl = new EVMChainInfo(
				EVMChain.DEEPL.toString(), 
				"DeepL Mainnet", 
				222555L, 
				BlockchainType.BORKED.toString(), // single node unstable
				new EVMCurrency("DeepL Mainnet Gas Token", "DEEPL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rpc.deeplnetwork.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.deeplnetwork.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/222555");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DEEPL, deepl);

		// tiltyard
		EVMChainInfo tiltyard = new EVMChainInfo(
				EVMChain.TILTYARD.toString(), 
				"Tiltyard Mainnet Subnet", 
				710420L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Tiltyard Mainnet Subnet Gas Token", "TILT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/tiltyard/mainnet/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/tiltyard");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/710420");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TILTYARD, tiltyard);

		// astarzkyoto
		EVMChainInfo astarzkyoto = new EVMChainInfo(
				EVMChain.ASTARZKYOTO.toString(), 
				"Astar zKyoto", 
				6038361L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Astar zKyoto Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rpc.startale.com/zkyoto");
					this.add("https://rpc.zkyoto.gelato.digital");
					this.add("https://astar-zkyoto-rpc.dwellir.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://astar-zkyoto.blockscout.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/6038361");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ASTARZKYOTO, astarzkyoto);

		// astar zkevm
		EVMChainInfo astarzkevm = new EVMChainInfo(
				EVMChain.ASTARZKEVM.toString(), 
				"Astar zkEVM", 
				3776L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Astar zkEVM Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.startale.com/astar-zkevm");
					this.add("https://astar-zkevm-rpc.dwellir.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://astar-zkevm.explorer.startale.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/3776");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ASTARZKEVM, astarzkevm);

		// blast
		EVMChainInfo blast = new EVMChainInfo(
				EVMChain.BLAST.toString(), 
				"Blast", 
				81457L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Blast Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://blast-rpc.publicnode.com");
					this.add("https://rpc.blast.io");
					this.add("https://rpc.ankr.com/blast");
					this.add("https://blast.din.dev/rpc");
					this.add("https://blastl2-mainnet.public.blastapi.io");
					this.add("https://blast.blockpi.network/v1/rpc/public");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://blastexplorer.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/81457");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BLAST, blast);

		// atlas
		EVMChainInfo atlas = new EVMChainInfo(
				EVMChain.ATLAS.toString(), 
				"Atlas", 
				622463L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Atlas Gas Token", "TON", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.atl.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.atl.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/622463");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ATLAS, atlas);
		
		// eram
		EVMChainInfo eram = new EVMChainInfo(
				EVMChain.ERAM.toString(), 
				"ERAM Mainnet", 
				721529L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("ERAM Mainnet Gas Token", "ERAM", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://mainnet-rpc.eramscan.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://eramscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/721529");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ERAM, eram);
		
		// eternal
		EVMChainInfo eternal = new EVMChainInfo(
				EVMChain.ETERNAL.toString(), 
				"Eternal Mainnet", 
				140L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Eternal Mainnet Gas Token", "Eter", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://mainnet.eternalcoin.io/v1");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/140");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ETERNAL, eternal);
		
		// treasure
		EVMChainInfo treasure = new EVMChainInfo(
				EVMChain.TREASURE.toString(), 
				"Treasure Ruby", 
				978657L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Treasure Ruby Gas Token", "MAGIC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.treasure.lol/http");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.treasurescan.io");
				}},
				new ArrayList<String>() {{
					this.add("https://portal.treasure.lol/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/978657");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TREASURE, treasure);
		
		// optimusz7
		EVMChainInfo optimusz7 = new EVMChainInfo(
				EVMChain.OPTIMUSZ7.toString(), 
				"OptimusZ7 Mainnet", 
				9797L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("OptimusZ7 Mainnet Gas Token", "OZ7", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.optimusz7.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.optimusz7.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/9797");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.OPTIMUSZ7, optimusz7);
		
		// glscan
		EVMChainInfo glscan = new EVMChainInfo(
				EVMChain.GLSCAN.toString(), 
				"GLScan", 
				10222L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("GLScan Gas Token", "GLC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://glc-dataseed.glscan.io/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://glscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/10222");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.GLSCAN, glscan);
		
		// tao
		EVMChainInfo tao = new EVMChainInfo(
				EVMChain.TAO.toString(), 
				"TAO EVM Mainnet", 
				10321L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("TAO EVM Mainnet Gas Token", "TAO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.taoevm.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://taoscan.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/10321");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TAO, tao);
		
		// lamina1
		EVMChainInfo lamina1 = new EVMChainInfo(
				EVMChain.LAMINA1.toString(), 
				"Lamina1", 
				10849L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Lamina1 Gas Token", "L1", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/lamina1/mainnet/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/lamina1");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/10849");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.LAMINA1, lamina1);
		
		// niza
		EVMChainInfo niza = new EVMChainInfo(
				EVMChain.NIZA.toString(), 
				"Niza Chain Mainnet", 
				20041L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Niza Chain Mainnet Gas Token", "NIZA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://nizascan.io/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://nizascan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/20041");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.NIZA, niza);
		
		// lamina1_identity
		EVMChainInfo lamina1_identity = new EVMChainInfo(
				EVMChain.LAMINA1IDENTITY.toString(), 
				"Lamina1 Identity", 
				10850L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Lamina1 Identity Gas Token", "L1ID", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/lamina1id/mainnet/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/lamina1id");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/10850");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.LAMINA1IDENTITY, lamina1_identity);
		
		// evmos
		EVMChainInfo evmos = new EVMChainInfo(
				EVMChain.EVMOS.toString(), 
				"EVMOS Mainnet", 
				9001L, 
				BlockchainType.BORKED.toString(), // so many issues ..
				new EVMCurrency("EVMOS", "EVMOS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://evmos-evm-rpc.publicnode.com");
					this.add("https://evmos-json-rpc.agoranodes.com");
					this.add("https://json-rpc.evmos.blockhunters.org");
					this.add("https://evmos-mainnet.public.blastapi.io");
					this.add("https://evmos-evm.publicnode.com");
					this.add("https://evmos-json-rpc.stakely.io");
					this.add("https://evmos-mainnet.gateway.pokt.network/v1/lb/627586ddea1b320039c95205");
					this.add("https://evmos.lava.build");
					//this.add("https://eth.bd.evmos.org:8545"); // timeout
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://www.mintscan.io/evmos");
					this.add("https://escan.live/");
				}},
				new ArrayList<String>() {{
					this.add("https://stakely.io/en/faucet/evmos-evm");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/9001");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.EVMOS, evmos);

		// polygon
		EVMChainInfo polygon = new EVMChainInfo(
				EVMChain.POLYGON.toString(), 
				"Polygon Mainnet", 
				137L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("MATIC", "MATIC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				"31000000000", // 30 gwei threshold for miner.gasprice/txpool.pricelimit, enforced since Oct 2021: https://medium.com/stakingbits/polygon-minimum-gas-fee-is-now-30-gwei-to-curb-spam-8bd4313c83a2
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rubic-polygon.rpc.blxrbdn.com/"); // MEV protection
					this.add("https://polygon-rpc.com/");
					this.add("https://rpc-mainnet.matic.quiknode.pro");
					this.add("https://rpc-mainnet.maticvigil.com");
					this.add("https://poly-rpc.gateway.pokt.network");
					this.add("https://polygon-mainnet.public.blastapi.io");
					this.add("https://rpc.ankr.com/polygon");
					this.add("https://1rpc.io/matic");
					this.add("https://polygon-bor.publicnode.com");
					this.add("https://polygon.llamarpc.com");
					this.add("https://polygon.rpc.blxrbdn.com");
					this.add("https://polygon.blockpi.network/v1/rpc/public");
					this.add("https://endpoints.omniatech.io/v1/matic/mainnet/public");
					this.add("https://polygon.api.onfinality.io/public");
					this.add("https://polygon.gateway.tenderly.co");
					this.add("https://polygon-bor-rpc.publicnode.com");
					this.add("https://polygon.drpc.org");

					//this.add("https://matic-mainnet.chainstacklabs.com");
					//this.add("https://polygon-mainnet-public.unifra.io");
					//this.add("https://matic-mainnet-full-rpc.bwarelabs.com");
					//this.add("https://matic-mainnet-archive-rpc.bwarelabs.com");
					//this.add("https://polygon-mainnet.g.alchemy.com/v2/demo"); // dead node
					//this.add("https://polygon-mainnet.rpcfast.com"); // consistently timeout
					//this.add("https://polygonapi.terminet.io/rpc"); // consistently slow
					//this.add("https://rpc-mainnet.matic.network"); // just unstable at times
				}}, 
				new ArrayList<String>() {{
					this.add("https://polygon-mainnet.g.alchemy.com/v2/<api key>"); // archive node
				}},
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://polygonscan.com");
					//this.add("https://explorer.matic.network"); // discontinued
				}},
				new ArrayList<String>() {{
					this.add("https://matic.supply");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/137");
				}},
				BlockchainTokenDetailsEVM.generatePolygonTokenIndex(),
				BlockchainTokenDetailsEVM.generatePolygonNFTIndex());
		networks.put(EVMChain.POLYGON, polygon);

		// worldland
		EVMChainInfo worldland = new EVMChainInfo(
				EVMChain.WORLDLAND.toString(), 
				"WorldLand Mainnet", 
				103L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("WorldLand Mainnet Gas Token", "WLC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://seoul.worldland.foundation");
					this.add("https://seoul2.worldland.foundation");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.worldland.foundation");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/103");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.WORLDLAND, worldland);

		// roburna
		EVMChainInfo roburna = new EVMChainInfo(
				EVMChain.ROBURNA.toString(), 
				"Roburna Mainnet", 
				158L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Roburna Mainnet Gas Token", "RBA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://dataseed.roburna.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://rbascan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/158");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ROBURNA, roburna);

		// x
		EVMChainInfo x = new EVMChainInfo(
				EVMChain.XLAYER.toString(), 
				"X Layer Mainnet", 
				196L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("X Layer Mainnet Gas Token", "OKB", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.xlayer.tech");
					this.add("https://xlayerrpc.okx.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://www.oklink.com/xlayer");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/196");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.XLAYER, x);

		// furtheon
		EVMChainInfo furtheon = new EVMChainInfo(
				EVMChain.FURTHEON.toString(), 
				"Furtheon", 
				308L, 
				BlockchainType.BORKED.toString(), // unstable
				new EVMCurrency("Furtheon Gas Token", "FTH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.furtheon.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("http://furthscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/308");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FURTHEON, furtheon);

		// ox
		EVMChainInfo ox = new EVMChainInfo(
				EVMChain.OX.toString(), 
				"OX Chain", 
				6699L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("OX Chain Gas Token", "OX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.oxscan.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/6699");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.OX, ox);
		
		// b2
		EVMChainInfo b2 = new EVMChainInfo(
				EVMChain.B2.toString(), 
				"B2 Mainnet", 
				223L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("B2 Mainnet Gas Token", "BTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.ankr.com/b2");
					this.add("https://mainnet.b2-rpc.com");
					this.add("https://rpc.bsquared.network");
					this.add("https://b2-mainnet.alt.technology");
					this.add("https://b2-mainnet-public.s.chainbase.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.bsquared.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/223");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.B2, b2);

		// b2
		EVMChainInfo b2hub = new EVMChainInfo(
				EVMChain.B2HUB.toString(), 
				"B2 Hub Mainnet", 
				213L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("B2 Hub Mainnet Gas Token", "B2", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://hub-rpc.bsquared.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://hub-explorer.bsquared.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/213");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.B2HUB, b2hub);

		// zksyncera
		EVMChainInfo zksyncera = new EVMChainInfo(
				EVMChain.ZKSYNCERA.toString(), 
				"zkSync Era Mainnet", 
				324L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("zkSync Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"250000000", //0.25 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://mainnet.era.zksync.io");
					this.add("https://zksync.drpc.org");
					this.add("https://zksync-era.blockpi.network/v1/rpc/public");
					this.add("https://zksync.meowrpc.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://explorer.zksync.io");
				}},
				new ArrayList<String>() {{
					this.add("brige test funds from goerli using https://portal.zksync.io/bridge");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/324");
				}},
				BlockchainTokenDetailsEVM.generateZkSyncTokenIndex(),
				BlockchainTokenDetailsEVM.generateZKSyncEraNFTIndex());
		networks.put(EVMChain.ZKSYNCERA, zksyncera);

		// qitmeer
		EVMChainInfo qitmeer = new EVMChainInfo(
				EVMChain.QITMEER.toString(), 
				"Qitmeer Network Mainnet", 
				813L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Qitmeer Network Mainnet Gas Token", "MEER", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://evm-dataseed1.meerscan.io");
					this.add("https://evm-dataseed2.meerscan.io");
					this.add("https://evm-dataseed3.meerscan.io");
					this.add("https://evm-dataseed.meerscan.com");
					this.add("https://qng.rpc.qitmeer.io");
					this.add("https://mainnet.meerlabs.com");
					this.add("https://rpc.dimai.ai");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://qng.meerscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/813");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.QITMEER, qitmeer);

		// cronos
		EVMChainInfo cronos = new EVMChainInfo(
				EVMChain.CRONOS.toString(), 
				"Cronos Main Network", 
				25L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("CRONOS Main Token", "CRO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://cronosrpc-1.xstaking.sg");
					this.add("https://evm.cronos.org");
					this.add("https://cronos.blockpi.network/v1/rpc/public");
					this.add("https://cronos-evm.publicnode.com");
					this.add("https://cronos-evm-rpc.publicnode.com");
					this.add("https://cronos.drpc.org");
					//this.add("https://cronos-rpc.elk.finance"); // dead
					//this.add("https://cronos-rpc.heavenswail.one"); // dead

				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://cronoscan.com/");
				}},
				new ArrayList<String>() {{
					this.add("https://cronos.org/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/25");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CRONOS, cronos);

		// flowevm
		EVMChainInfo flowevm = new EVMChainInfo(
				EVMChain.FLOWEVM.toString(), 
				"FlowEVM PreviewNet", 
				646L, 
				BlockchainType.BORKED.toString(), // single node unstable
				new EVMCurrency("FlowEVM PreviewNet Gas Token", "FLOW", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://previewnet.evm.nodes.onflow.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://previewnet.flowdiver.io");
				}},
				new ArrayList<String>() {{
					this.add("https://previewnet-faucet.onflow.org");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/646");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FLOWEVM, flowevm);

		// eth
		EVMChainInfo eth = new EVMChainInfo(
				EVMChain.ETH.toString(), 
				"Ethereum Main Network", 
				1L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Ethereum Main Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://mainnet.infura.io/v3/9aa3d95b3bc440fa88ea12eaa4456161");
					this.add("https://eth-mainnet.public.blastapi.io");
					this.add("https://rpc.ankr.com/eth");
					this.add("https://eth-rpc.gateway.pokt.network");
					this.add("https://eth-mainnet.gateway.pokt.network/v1/5f3453978e354ab992c4da79");
					this.add("https://cloudflare-eth.com");
					this.add("https://nodes.mewapi.io/rpc/eth");
					this.add("https://rpc.mevblocker.io");
					this.add("https://ethereum-rpc.publicnode.com");
					this.add("https://ethereum.publicnode.com");
					this.add("https://mainnet.gateway.tenderly.co");
					this.add("https://rpc.blocknative.com/boost");
					this.add("https://rpc.flashbots.net");
					this.add("https://rpc.flashbots.net/fast");
					this.add("https://rpc.mevblocker.io/fast");
					this.add("https://rpc.mevblocker.io/noreverts");
					this.add("https://rpc.mevblocker.io/fullprivacy");
					this.add("https://eth1.lava.build/lava-referer-2d782cbf-8784-4606-a25b-f91e98729c71/");
					this.add("https://eth.drpc.org");

					//this.add("https://main-rpc.linkpool.io"); // invalid cert
					//this.add("https://main-light.eth.linkpool.io"); // invalid cert
					//this.add("https://api.mycryptoapi.com/eth"); // consistent 403
					//this.add("https://ethereumnodelight.app.runonflux.io"); // consistent rpc errors
					//this.add("https://eth-mainnet.nodereal.io/v1/1659dfb40aa24bbb8153a677b98064d7");
					//this.add("https://mainnet-nethermind.blockscout.com"); // gone, resolve issues
					//this.add("https://mainnet.eth.cloud.ava.do"); // just unstable
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>() {{
					this.add("https://rpc.flashbots.net");
				}}, 
				new ArrayList<String>() {{
					this.add("https://relay.flashbots.net");
					//this.add("https://mainnet-relay.securerpc.com"); // untested
				}}, 
				new ArrayList<String>() {{
					this.add("https://etherscan.io");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1");
				}},
				BlockchainTokenDetailsEVM.generateEthereumTokenIndex(),
				BlockchainTokenDetailsEVM.generateEthereumNFTIndex());
		networks.put(EVMChain.ETH, eth);

		// avax
		EVMChainInfo avax = new EVMChainInfo(
				EVMChain.AVAX.toString(), 
				"Avalanche C-Chain", 
				43114L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Avalanche Native Token", "AVAX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://api.avax.network/ext/bc/C/rpc");
					this.add("https://rpc.ankr.com/avalanche");
					this.add("https://ava-mainnet.public.blastapi.io/ext/bc/C/rpc");
					this.add("https://avax.meowrpc.com");
					this.add("https://avalanche-c-chain.publicnode.com");
					this.add("https://avalanche-c-chain-rpc.publicnode.com");
					//this.add("https://avalancheapi.terminet.io/ext/bc/C/rpc"); // keps pushing 500 internal server error
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://snowtrace.io/");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/43114");
				}},
				BlockchainTokenDetailsEVM.generateAvaxTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.AVAX, avax);

		// bobabnb
		EVMChainInfo bobabnb = new EVMChainInfo(
				EVMChain.BOBABNB.toString(), 
				"Boba BNB Mainnet", 
				56288L, 
				BlockchainType.PUBLIC.toString(), // missing good rpcs
				new EVMCurrency("Boba BNB Token", "BOBA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://bnb.boba.network");
					this.add("https://boba-bnb.gateway.tenderly.co/");
					this.add("https://gateway.tenderly.co/public/boba-bnb");
					this.add("https://replica.bnb.boba.network");
				}}, 
				new ArrayList<String>() {{
					this.add("https://blockexplorer.bnb.boba.network");
				}},
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://gateway.testnet.bnb.boba.network/wallet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/56288");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BOBABNB, bobabnb);

		// boba
		EVMChainInfo boba = new EVMChainInfo(
				EVMChain.BOBA.toString(), 
				"Boba Network", 
				288L, 
				BlockchainType.PUBLIC.toString(), // missing good rpcs
				new EVMCurrency("Boba Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://lightning-replica.boba.network");
					this.add("https://replica.boba.network");
					this.add("https://boba-ethereum.gateway.tenderly.co");
					this.add("https://gateway.tenderly.co/public/boba-ethereum");
					this.add("https://boba-eth.drpc.org");

					//this.add("https://boba-mainnet.gateway.pokt.network/v1/lb/623ad21b20354900396fed7f"); // timeout
					this.add("https://mainnet.boba.network"); // was temp stuck at block 951796
					//this.add("https://lighting-replica.boba.network"); // does not resolve
				}}, 
				new ArrayList<String>() {{
					this.add("https://blockexplorer.boba.network");
					this.add("https://mainnet.boba.network	");
					this.add("https://boba-mainnet.gateway.pokt.network/v1/lb/623ad21b20354900396fed7f	");
				}},
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://gateway.testnet.bnb.boba.network/wallet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/288");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BOBA, boba);

		// bitkub 
		EVMChainInfo bitkub = new EVMChainInfo(
				EVMChain.BITKUB.toString(),
				"Bitkub Network", 
				96L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Bitkub Native Token", "KUB", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rpc.bitkubchain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://bkcscan.com");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://support.bitkub.com/hc/en-us/articles/360061315771-How-to-connect-an-online-wallet-to-Bitkub-Chain-Metamask"); // NEXT Smart Chain? https://chainlist.org/chain/96
				}},
				BlockchainTokenDetailsEVM.generateBitkubTokenIndex(),
				BlockchainTokenDetailsEVM.generateBitkubNFTIndex());
		networks.put(EVMChain.BITKUB, bitkub);


		// moonbeam
		EVMChainInfo moonbeam = new EVMChainInfo(
				EVMChain.MOONBEAM.toString(), 
				"Moonbeam Network", 
				1284L, 
				BlockchainType.PUBLIC.toString(), // All nodes just give Value must be in format 0x[1-9]+[0-9]* or 0x0 errors ..
				new EVMCurrency("Moonbeam Native Token", "GLMR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://moonbeam-rpc.dwellir.com");
					this.add("https://moonbeam.unitedbloc.com");
					this.add("https://rpc.api.moonbeam.network");
					this.add("https://rpc.ankr.com/moonbeam");
					this.add("https://moonbeam.public.blastapi.io");
					this.add("https://moonbeam.unitedbloc.com:3000");
					this.add("https://moonbeam.api.onfinality.io/public");
					this.add("https://moonbeam.publicnode.com");
					this.add("https://moonbeam-rpc.publicnode.com");
					this.add("https://moonbeam.drpc.org");

				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://moonscan.io");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1284");
				}},
				BlockchainTokenDetailsEVM.generateMoonbeamTokenIndex(),
				BlockchainTokenDetailsEVM.generateMoonbeamNFTIndex());
		networks.put(EVMChain.MOONBEAM, moonbeam);

		// moonriver
		EVMChainInfo moonriver = new EVMChainInfo(
				EVMChain.MOONRIVER.toString(), 
				"Moonbeam Network", 
				1285L, 
				BlockchainType.PUBLIC.toString(), // All nodes just give Value must be in format 0x[1-9]+[0-9]* or 0x0 errors ..
				new EVMCurrency("MoonRiver Native Token", "MOVR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://moonriver-rpc.dwellir.com");
					this.add("https://moonriver.unitedbloc.com");
					this.add("https://moonriver.unitedbloc.com:2000");
					this.add("https://moonriver.public.blastapi.io");
					this.add("https://rpc.api.moonriver.moonbeam.network");
					this.add("https://moonriver.api.onfinality.io/public");
					this.add("https://moonriver.publicnode.com");
					this.add("https://moonriver-rpc.publicnode.com");
					this.add("https://moonriver.drpc.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://moonriver.moonscan.io");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1285");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MOONRIVER, moonriver);

		// adiri
		EVMChainInfo adiri = new EVMChainInfo(
				EVMChain.ADIRI.toString(), 
				"Adiri", 
				2017L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Adiri Gas Token", "TEL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.telcoin.network");
					this.add("https://adiri.tel");
					this.add("https://node1.telcoin.network");
					this.add("https://node2.telcoin.network");
					this.add("https://node3.telcoin.network");
					this.add("https://node4.telcoin.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://telscan.io");
				}},
				new ArrayList<String>() {{
					this.add("https://telcoin.network/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2017");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ADIRI, adiri);

		// now
		EVMChainInfo now = new EVMChainInfo(
				EVMChain.NOW.toString(), 
				"NOW Chain", 
				2014L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("NOW Chain Gas Token", "NOW", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.nowscan.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://nowscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2014");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.NOW, now);

		// metachain
		EVMChainInfo metachain = new EVMChainInfo(
				EVMChain.METACHAIN.toString(), 
				"MetaChain Istanbul", 
				1453L, 
				BlockchainType.BORKED.toString(), // unstable
				new EVMCurrency("MetaChain Istanbul Gas Token", "MTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://istanbul-rpc.metachain.dev");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://istanbul-explorer.metachain.dev");
				}},
				new ArrayList<String>() {{
					this.add("https://istanbul-faucet.metachain.dev");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1453");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.METACHAIN, metachain);

		// taraxa
		EVMChainInfo taraxa = new EVMChainInfo(
				EVMChain.TARAXA.toString(), 
				"Taraxa Mainnet", 
				841L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Taraxa Native Token", "TARA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rpc.mainnet.taraxa.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://explorer.mainnet.taraxa.io");
				}},
				new ArrayList<String>() {{
					this.add("<faucet todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/841");
					this.add("https://www.coingecko.com/sv/coins/taraxa");
					this.add("https://www.taraxa.io/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TARAXA, taraxa);

		// fantom
		EVMChainInfo fantom = new EVMChainInfo(
				EVMChain.FANTOM.toString(), 
				"Fantom Network", 
				250L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Fantom Native Token", "FTM", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rpc.ftm.tools");
					this.add("https://fantom-mainnet.gateway.pokt.network/v1/lb/62759259ea1b320039c9e7ac");
					this.add("https://rpc.ankr.com/fantom");
					this.add("https://rpc2.fantom.network");
					this.add("https://rpcapi.fantom.network");
					this.add("https://fantom-mainnet.public.blastapi.io");
					this.add("https://rpcapi.fantom.network");
					this.add("https://endpoints.omniatech.io/v1/fantom/mainnet/public");
					this.add("https://fantom-pokt.nodies.app");
					this.add("https://rpc.fantom.network");
					this.add("https://rpc3.fantom.network");
					this.add("https://1rpc.io/ftm");
					this.add("https://fantom.blockpi.network/v1/rpc/public");					
					this.add("https://fantom.publicnode.com");
					this.add("https://rpc.fantom.gateway.fm");
					this.add("https://fantom.api.onfinality.io/public	");
					this.add("https://fantom.drpc.org");
					this.add("https://fantom-rpc.publicnode.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://ftmscan.com");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.fantom.network/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/250");
				}},
				BlockchainTokenDetailsEVM.generateFantomTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FANTOM, fantom);


		// won
		EVMChainInfo won = new EVMChainInfo(
				EVMChain.WON.toString(), 
				"Won Network", 
				686868L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Won Network Gas Token", "WON", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.wonnetwork.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.wonnetwork.org");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.wondollars.org");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/686868");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.WON, won);

		// rexx
		EVMChainInfo rexx = new EVMChainInfo(
				EVMChain.REXX.toString(), 
				"REXX Mainnet", 
				888882L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("REXX Mainnet Gas Token", "REXX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.rexxnetwork.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://rexxnetwork.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/888882");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.REXX, rexx);

		// amchain
		EVMChainInfo amchain = new EVMChainInfo(
				EVMChain.AMCHAIN.toString(), 
				"AmChain", 
				999999L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("AmChain Gas Token", "AMC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://node1.amchain.net");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.amchain.net");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/999999");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.AMCHAIN, amchain);

		// geek
		EVMChainInfo geek = new EVMChainInfo(
				EVMChain.GEEK.toString(), 
				"GEEK Verse Mainnet", 
				75512L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("GEEK Verse Mainnet Gas Token", "GEEK", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.geekout-pte.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.geekout-pte.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/75512");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.GEEK, geek);
		
		// taiko
		EVMChainInfo taiko = new EVMChainInfo(
				EVMChain.TAIKO.toString(), 
				"Taiko Mainnet", 
				167000L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Taiko Mainnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.mainnet.taiko.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://taikoscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/167000");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TAIKO, taiko);


		// forma
		EVMChainInfo forma = new EVMChainInfo(
				EVMChain.FORMA.toString(), 
				"Forma", 
				984122L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Forma Gas Token", "TIA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.forma.art");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.forma.art");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/984122");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FORMA, forma);
		
		// formasketchpad
		EVMChainInfo formasketchpad = new EVMChainInfo(
				EVMChain.FORMASKETCHPAD.toString(), 
				"Forma Sketchpad", 
				984123L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Forma Sketchpad Gas Token", "TIA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.sketchpad-1.forma.art");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.sketchpad-1.forma.art");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/984123");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FORMASKETCHPAD, formasketchpad);
		
		// orenium
		EVMChainInfo orenium = new EVMChainInfo(
				EVMChain.ORENIUM.toString(), 
				"Orenium Mainnet Protocol", 
				7778L, 
				BlockchainType.BORKED.toString(), // single node giving 523
				new EVMCurrency("Orenium Mainnet Protocol Gas Token", "ORE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://validator-mainnet.orenium.org");
					this.add("https://rpc-oracle-mainnet.orenium.org");
					this.add("https://portalmainnet.orenium.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://oreniumscan.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/7778");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ORENIUM, orenium);

		// iota
		EVMChainInfo iota = new EVMChainInfo(
				EVMChain.IOTA.toString(), 
				"IOTA EVM", 
				8822L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("IOTA EVM Gas Token", "IOTA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://json-rpc.evm.iotaledger.net");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://iota-evm.blockscout.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/8822");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.IOTA, iota);

		// superlumio
		EVMChainInfo superlumio = new EVMChainInfo(
				EVMChain.SUPERLUMIO.toString(), 
				"SuperLumio", 
				8866L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("SuperLumio Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://mainnet.lumio.io/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.lumio.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/8866");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SUPERLUMIO, superlumio);

		// gold
		EVMChainInfo gold = new EVMChainInfo(
				EVMChain.GOLD.toString(), 
				"Gold Chain", 
				4653L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Gold Chain Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://chain-rpc.gold.dev");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/4653");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.GOLD, gold);

		// harmony, https://chainlist.org/chain/1666600000
		EVMChainInfo harmony = new EVMChainInfo(
				EVMChain.HARMONY.toString(), 
				"Harmony Mainnet Shard 0", 
				1666600000L, 
				BlockchainType.BORKED.toString(), // address convertion oneXXXX 
				new EVMCurrency("Harmony Native Token", "ONE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://api.harmony.one");
					this.add("https://harmony-0-rpc.gateway.pokt.network");
					this.add("https://harmony-mainnet.chainstacklabs.com");
					this.add("https://api.s0.t.hmny.io");
					this.add("https://rpc.ankr.com/harmony");
					this.add("https://a.api.s0.t.hmny.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://explorer.harmony.one");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1666600000");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.HARMONY, harmony);

		// etho
		EVMChainInfo etho = new EVMChainInfo(
				EVMChain.ETHO.toString(), 
				"ETHO Network", 
				1313114L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("ETHO Native Token", "ETHO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					//this.add("https://rpc.ether1.org"); // discontinued
					this.add("https://rpc.ethoprotocol.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://explorer.ethoprotocol.com");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1313114");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ETHO, etho);

		// kronobit
		EVMChainInfo kronobit = new EVMChainInfo(
				EVMChain.KRONOBIT.toString(), 
				"Kronobit Mainnet", 
				13600L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Kronobit Mainnet Gas Token", "KNB", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://mainnet-rpc.qbitscan.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.qbitscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/13600");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.KRONOBIT, kronobit);

		// bsc
		EVMChainInfo bsc = new EVMChainInfo(
				EVMChain.BSC.toString(), 
				"Binance Smart Chain Mainnet", 
				56L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Binance Chain Native Token", "BNB", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"500000", //500k units
				new ArrayList<String>() {{
					this.add("https://bsc-dataseed.binance.org");
					this.add("https://bsc-dataseed1.binance.org");
					this.add("https://bsc-dataseed2.binance.org");
					this.add("https://bsc-dataseed3.binance.org");
					this.add("https://bsc-dataseed4.binance.org");
					this.add("https://bsc-dataseed1.defibit.io");
					this.add("https://bsc-dataseed2.defibit.io");
					this.add("https://bsc-dataseed3.defibit.io");
					this.add("https://bsc-dataseed4.defibit.io");
					this.add("https://bsc-dataseed1.ninicoin.io");
					this.add("https://bsc-dataseed2.ninicoin.io");
					this.add("https://bsc-dataseed3.ninicoin.io");
					this.add("https://bsc-dataseed4.ninicoin.io");
					this.add("https://bsc-dataseed1.bnbchain.org");
					this.add("https://bsc-dataseed2.bnbchain.org");
					this.add("https://bsc-dataseed3.bnbchain.org");
					this.add("https://bsc-dataseed4.bnbchain.org");
					this.add("https://bsc.publicnode.com");
					this.add("https://bsc-rpc.publicnode.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://bscscan.com");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/56");
				}},
				BlockchainTokenDetailsEVM.generateBSCTokenIndex(),
				BlockchainTokenDetailsEVM.generateBSCNFTIndex());
		networks.put(EVMChain.BSC, bsc);

		// metis
		EVMChainInfo metis = new EVMChainInfo(
				EVMChain.METIS.toString(), 
				"Metis Mainnet", 
				1088L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Metis Native Token", "METIS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://andromeda.metis.io/?owner=1088");
					this.add("https://metis-mainnet.public.blastapi.io");
					this.add("https://metis.drpc.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://andromeda-explorer.metis.io/");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1088");
				}},
				BlockchainTokenDetailsEVM.generateMetisTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.METIS, metis);

		// nexablock
		EVMChainInfo nexablock = new EVMChainInfo(
				EVMChain.NEXABLOCK.toString(), 
				"Nexa Block", 
				9025L,
				BlockchainType.BORKED.toString(), // single node unstable
				new EVMCurrency("Nexa Block Token", "NEXB", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rpc-nodes.nexablockscan.io");
					this.add("https://rpc-nodes-delta.nexablockscan.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("<faucet todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://nexablockscan.io");
				}},
				new ArrayList<String>() {{
					this.add("https://nexa.org/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.NEXABLOCK, nexablock);	

		// ztc
		EVMChainInfo ztc = new EVMChainInfo(
				EVMChain.ZTC.toString(), 
				"Ztc Mainnet", 
				9998L, 
				BlockchainType.BORKED.toString(), // single unstable node .. 502
				new EVMCurrency("Ztc Mainnet Gas Token", "ZTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://zitcoin.us");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/9998");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZTC, ztc);

		// shine
		EVMChainInfo shine = new EVMChainInfo(
				EVMChain.SHINE.toString(), 
				"Shine Chain", 
				11221L, 
				BlockchainType.BORKED.toString(), // single node unstable
				new EVMCurrency("Shine Chain Gas Token", "SC20", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.shinescan.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://shinescan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/11221");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SHINE, shine);

		// rss3
		EVMChainInfo rss3 = new EVMChainInfo(
				EVMChain.RSS3.toString(), 
				"RSS3 VSL Mainnet", 
				12553L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("RSS3 VSL Mainnet Gas Token", "RSS3", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.rss3.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.rss3.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/12553");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.RSS3, rss3);

		// masa
		EVMChainInfo masa = new EVMChainInfo(
				EVMChain.MASA.toString(), 
				"Masa", 
				13396L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Masa Gas Token", "MASA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/masanetwork/mainnet/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/masa");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/13396");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MASA, masa);

		// viction
		EVMChainInfo viction = new EVMChainInfo(
				EVMChain.VICTION.toString(), 
				"Viction", 
				88L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Viction Gas Token", "VIC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.viction.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/88");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.VICTION, viction);

		// alph
		EVMChainInfo alph = new EVMChainInfo(
				EVMChain.ALPH.toString(), 
				"Alph Network", 
				8738L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Alph Network Gas Token", "ALPH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rpc.alph.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://explorer.alph.network");
				}},
				new ArrayList<String>() {{
					this.add("<faucet todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/8738");
				}},
				BlockchainTokenDetailsEVM.generateMetisTestTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ALPH, alph);

		// shibarium
		EVMChainInfo shibarium = new EVMChainInfo(
				EVMChain.SHIBARIUM.toString(), 
				"Shibarium Mainnet", 
				109L, 
				// https://www.tradingview.com/news/u_today:02fb7b457094b:0-key-reason-behind-shib-s-sudden-plunge-after-shibarium-s-launch
				BlockchainType.BORKED.toString(), 
				new EVMCurrency("Shibarium Token", "BONE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://www.shibrpc.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://www.shibariumscan.io");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/109");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SHIBARIUM, shibarium);

		// aurora
		EVMChainInfo aurora = new EVMChainInfo(
				EVMChain.AURORA.toString(), 
				"Aurora Mainnet", 
				1313161554L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Aurora Token", "AETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://mainnet.aurora.dev");
					this.add("https://1rpc.io/aurora");
					this.add("https://aurora.drpc.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://aurorascan.dev/");
					this.add("https://explorer.mainnet.aurora.dev/");
					this.add("https://explorer.aurorachain.io/");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1313161554");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.AURORA, aurora);

		// celo
		EVMChainInfo celo = new EVMChainInfo(
				EVMChain.CELO.toString(), 
				"Celo Mainnet", 
				42220L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("CELO Native Token", "CELO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://forno.celo.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://explorer.celo.org");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/42220");
				}},
				BlockchainTokenDetailsEVM.generateCeloTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CELO, celo);

		// base
		EVMChainInfo base = new EVMChainInfo(
				EVMChain.BASE.toString(), 
				"BASE Mainnet", 
				8453L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("BASE Native Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://base.blockpi.network/v1/rpc/public");
					this.add("https://developer-access-mainnet.base.org/");
					this.add("https://base-mainnet.public.blastapi.io");
					this.add("https://base.meowrpc.com");
					this.add("https://base.publicnode.com");
					this.add("https://1rpc.io/base");
					this.add("https://mainnet.base.org/");
					this.add("https://rpc.notadegen.com/base");
					this.add("https://base-mainnet.diamondswap.org/rpc");
					this.add("https://base.gateway.tenderly.co");
					this.add("https://base-rpc.publicnode.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://basescan.org");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/8453");
					this.add("https://base.org/");
				}},
				BlockchainTokenDetailsEVM.generateBaseTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BASE, base);

		// klaytn
		EVMChainInfo klay = new EVMChainInfo(
				EVMChain.KLAYTN.toString(), 
				"KLAYTN Mainnet", 
				8217L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("KLAYTN Native Token", "KLAY", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://public-node-api.klaytnapi.com/v1/cypress");
					this.add("https://klaytn.blockpi.network/v1/rpc/public");
					this.add("https://klaytn.api.onfinality.io/public");
					this.add("https://klaytn.drpc.org");
					this.add("https://public-en-cypress.klaytn.net");

				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://scope.klaytn.com");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/8217");
					this.add("https://medium.com/klaytn/how-to-add-klaytn-to-metamask-b3bdd970c0e8");
				}},
				BlockchainTokenDetailsEVM.generateKlaytnTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.KLAYTN, klay);

		// shido
		EVMChainInfo shido = new EVMChainInfo(
				EVMChain.SHIDO.toString(), 
				"Shido Mainnet Block", 
				9008L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Shido Mainnet Block Gas Token", "SHIDO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-delta-nodes.shidoscan.com");
					this.add("https://rpc-nodes.shidoscan.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://shidoscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/9008");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SHIDO, shido);

		// borachain
		EVMChainInfo borachain = new EVMChainInfo(
				EVMChain.BORACHAIN.toString(), 
				"Bora Chain, gaming side-chain of KLAYTN", 
				77001L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("BORAChain Native Token", "BGAS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://public-node.api.boraportal.com/bora/mainnet");
					this.add("https://public-node.api.boraportal.io/bora/mainnet"); // fails to reply to node rpc version
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://scope.boraportal.com/");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://medium.com/@DAO_FE/1-add-rpc-network-name-borachain-mainnet-network-url-https-public-node-api-boraportal-io-b-59f422588926");
				}},
				BlockchainTokenDetailsEVM.generateBorachainTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BORACHAIN, borachain);

		return networks;

	}

}
