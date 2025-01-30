package crypto.forestfish.objects.embedded.evm;

import java.util.ArrayList;
import java.util.HashMap;

import crypto.forestfish.enums.BlockchainType;
import crypto.forestfish.enums.evm.EVMChain;
import crypto.forestfish.enums.evm.EVMPriceMechanism;
import crypto.forestfish.objects.evm.model.chain.EVMChainInfo;
import crypto.forestfish.objects.evm.model.chain.EVMCurrency;

public class BlockchainDetailsMainEVM2 {

	@SuppressWarnings("serial")
	public static HashMap<EVMChain, EVMChainInfo> getMainnetEVMNetworks() {

		HashMap<EVMChain, EVMChainInfo> networks = new HashMap<>();
		

		// plume
		EVMChainInfo plume = new EVMChainInfo(
				EVMChain.PLUME.toString(), 
				"Plume Mainnet", 
				98865L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Plume Mainnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.plumenetwork.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.plumenetwork.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/98865");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PLUME, plume);
		
		// etp
		EVMChainInfo etp = new EVMChainInfo(
				EVMChain.ETP.toString(), 
				"ETP Mainnet", 
				20256789L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("ETP Mainnet Gas Token", "ETP", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.etpscan.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://etpscan.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/20256789");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ETP, etp);
		
		// deepbrainchain
		EVMChainInfo deepbrainchain = new EVMChainInfo(
				EVMChain.DEEPBRAINCHAIN.toString(), 
				"DeepBrainChain Mainnet", 
				19880818L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("DeepBrainChain Mainnet Gas Token", "DBC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.dbcwallet.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://www.dbcscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/19880818");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DEEPBRAINCHAIN, deepbrainchain);
		
		// ternoa
		EVMChainInfo ternoa = new EVMChainInfo(
				EVMChain.TERNOA.toString(), 
				"Ternoa", 
				752025L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Ternoa Gas Token", "CAPS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-mainnet.zkevm.ternoa.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-mainnet.zkevm.ternoa.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/752025");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TERNOA, ternoa);
		
		// zether
		EVMChainInfo zether = new EVMChainInfo(
				EVMChain.ZETHER.toString(), 
				"Zether Mainnet", 
				715131L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Zether Mainnet Gas Token", "ZTH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.zether.org");
					this.add("https://rpc.zthscan.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://zthscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/715131");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZETHER, zether);
		
		// fidesinnova
		EVMChainInfo fidesinnova = new EVMChainInfo(
				EVMChain.FIDESINNOVA.toString(), 
				"Fidesinnova", 
				706883L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Fidesinnova Gas Token", "FDS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://fidesf1-rpc.fidesinnova.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.fidesinnova.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/706883");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FIDESINNOVA, fidesinnova);

		
		// conwai
		EVMChainInfo conwai = new EVMChainInfo(
				EVMChain.CONWAI.toString(), 
				"Conwai Mainnet", 
				668668L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Conwai Mainnet Gas Token", "CNW", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://conwai.calderachain.xyz/http");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://conwai.calderaexplorer.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/668668");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CONWAI, conwai);
		
		// graphite
		EVMChainInfo graphite = new EVMChainInfo(
				EVMChain.GRAPHITE.toString(), 
				"Graphite Mainnet", 
				440017L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Graphite Mainnet Gas Token", "@G", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://anon-entrypoint-1.atgraphite.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://main.atgraphite.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/440017");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.GRAPHITE, graphite);
		
		// infinaeon
		EVMChainInfo infinaeon = new EVMChainInfo(
				EVMChain.INFINAEON.toString(), 
				"Infinaeon", 
				420000L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Infinaeon Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.infinaeon.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.infinaeon.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/420000");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.INFINAEON, infinaeon);
		
		// conet
		EVMChainInfo conet = new EVMChainInfo(
				EVMChain.CONET.toString(), 
				"CONET Mainnet", 
				224400L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("CONET Mainnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://mainnet-rpc.conet.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://mainnet.conet.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/224400");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CONET, conet);
		
		// hydration
		EVMChainInfo hydration = new EVMChainInfo(
				EVMChain.HYDRATION.toString(), 
				"Hydration", 
				222222L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Hydration Gas Token", "WETH", 18), 
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
		networks.put(EVMChain.HYDRATION, hydration);
		
		// cratd2c
		EVMChainInfo cratd2c = new EVMChainInfo(
				EVMChain.CRATD2C.toString(), 
				"CratD2C", 
				2310L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("CratD2C Gas Token", "CRAT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://node1.cratd2csmartchain.io");
					this.add("https://node2.cratd2csmartchain.io");
					this.add("https://node3.cratd2csmartchain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.cratd2csmartchain.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2310");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CRATD2C, cratd2c);
		
		// rufus
		EVMChainInfo rufus = new EVMChainInfo(
				EVMChain.RUFUS.toString(), 
				"Rufus", 
				2420L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Rufus Gas Token", "ELON", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rufus.calderachain.xyz/http");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://rufus.calderaexplorer.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2420");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.RUFUS, rufus);
		
		// hydra
		EVMChainInfo hydra = new EVMChainInfo(
				EVMChain.HYDRA.toString(), 
				"Hydra Chain", 
				4488L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Hydra Chain Gas Token", "HYDRA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-mainnet.hydrachain.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://skynet.hydrachain.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/4488");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.HYDRA, hydra);
		
		// mst
		EVMChainInfo mst = new EVMChainInfo(
				EVMChain.MST.toString(), 
				"MST Chain", 
				4646L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("MST Chain Gas Token", "MST", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://mariorpc.mstblockchain.com");
					this.add("https://craftrpc.mstblockchain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://mstscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/4646");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MST, mst);
		
		// oev
		EVMChainInfo oev = new EVMChainInfo(
				EVMChain.OEV.toString(), 
				"OEV Network", 
				4913L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("OEV Network Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://oev.rpc.api3.org");
					this.add("https://oev-network.calderachain.xyz/http");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://oev-network.calderaexplorer.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/4913");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.OEV, oev);
		
		// saga
		EVMChainInfo saga = new EVMChainInfo(
				EVMChain.SAGA.toString(), 
				"Saga", 
				5464L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Saga Gas Token", "GAS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("http://sagaevm-5464-1.jsonrpc.sagarpc.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sagaevm-5464-1.sagaexplorer.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/5464");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SAGA, saga);
		
		// sidra
		EVMChainInfo sidra = new EVMChainInfo(
				EVMChain.SIDRA.toString(), 
				"Sidra Chain", 
				97453L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Sidra Chain Gas Token", "SDA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://node.sidrachain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://ledger.sidrachain.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/97453");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SIDRA, sidra);
		
		// henez
		EVMChainInfo henez = new EVMChainInfo(
				EVMChain.HENEZ.toString(), 
				"Henez Chain Mainnet", 
				91111L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Henez Chain Mainnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://henez.calderachain.xyz/http");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://henez.calderaexplorer.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/91111");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.HENEZ, henez);
		
		// o
		EVMChainInfo o = new EVMChainInfo(
				EVMChain.O.toString(), 
				"O Chain", 
				84841L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("O Chain Gas Token", "O", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.o.xyz");
					this.add("https://84841.rpc.thirdweb.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.o.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/84841");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.O, o);
		
		// vemp
		EVMChainInfo vemp = new EVMChainInfo(
				EVMChain.VEMP.toString(), 
				"VEMP Horizon", 
				82614L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("VEMP Horizon Gas Token", "VEMP", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://vemp-horizon.calderachain.xyz/http");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://vemp-horizon.calderaexplorer.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/82614");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.VEMP, vemp);
		
		// forta
		EVMChainInfo forta = new EVMChainInfo(
				EVMChain.FORTA.toString(), 
				"Forta Chain", 
				80931L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Forta Chain Gas Token", "FORT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-forta-chain-8gj1qndmfc.t.conduit.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.forta.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/80931");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FORTA, forta);
		
		// geo
		EVMChainInfo geo = new EVMChainInfo(
				EVMChain.GEO.toString(), 
				"Geo Genesis", 
				80451L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Geo Genesis Gas Token", "GRT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-geo-genesis-h0q2s21xx8.t.conduit.xyz/");
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
					this.add("https://chainlist.org/chain/80451");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.GEO, geo);
		
		// caga
		EVMChainInfo caga = new EVMChainInfo(
				EVMChain.CAGA.toString(), 
				"CAGA mainnet", 
				72888L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("CAGA mainnet Gas Token", "CAGA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://cagamainnet.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.cagamainnet.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/72888");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CAGA, caga);
		
		// cyberchain
		EVMChainInfo cyberchain = new EVMChainInfo(
				EVMChain.CYBERCHAIN.toString(), 
				"CyberChain Mainnet", 
				65535L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("CyberChain Mainnet Gas Token", "CCX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.cyberchain.xyz/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.cyberchain.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/65535");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CYBERCHAIN, cyberchain);
		
		// treasure
		EVMChainInfo treasure = new EVMChainInfo(
				EVMChain.TREASURE.toString(), 
				"Treasure", 
				61166L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Treasure Gas Token", "MAGIC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.treasure.lol");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://treasurescan.io");
				}},
				new ArrayList<String>() {{
					this.add("https://thirdweb.com/treasure");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/61166");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TREASURE, treasure);

		
		// ink
		EVMChainInfo ink = new EVMChainInfo(
				EVMChain.INK.toString(), 
				"Ink", 
				57073L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Ink Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-gel.inkonchain.com");
					this.add("https://rpc-qnd.inkonchain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.inkonchain.com");
				}},
				new ArrayList<String>() {{
					this.add("https://inkonchain.com/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/57073");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.INK, ink);
		
		// overprotocol
		EVMChainInfo overprotocol = new EVMChainInfo(
				EVMChain.OVERPROTOCOL.toString(), 
				"OverProtocol Mainnet", 
				54176L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("OverProtocol Mainnet Gas Token", "OVER", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.overprotocol.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.over.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/54176");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.OVERPROTOCOL, overprotocol);
		
		// donatuz
		EVMChainInfo donatuz = new EVMChainInfo(
				EVMChain.DONATUZ.toString(), 
				"Donatuz", 
				42026L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Donatuz Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.donatuz.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.donatuz.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/42026");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DONATUZ, donatuz);
		
		// pmon
		EVMChainInfo pmon = new EVMChainInfo(
				EVMChain.PMON.toString(), 
				"PMON Chain", 
				42001L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("PMON Chain Gas Token", "PMON", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.pmon.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.pmon.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/42001");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PMON, pmon);
		
		// ferrum
		EVMChainInfo ferrum = new EVMChainInfo(
				EVMChain.FERRUM.toString(), 
				"Ferrum Quantum Portal Network", 
				26100L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Ferrum Quantum Portal Network Gas Token", "qpFRM", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://qpn.svcs.ferrumnetwork.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.ferrumnetwork.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/26100");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FERRUM, ferrum);
		
		// ronin
		EVMChainInfo ronin = new EVMChainInfo(
				EVMChain.RONIN.toString(), 
				"Ronin Mainnet", 
				2020L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Ronin Mainnet Gas Token", "RON", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://api.roninchain.com/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://app.roninchain.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2020");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.RONIN, ronin);
		
		// premiumblock
		EVMChainInfo premiumblock = new EVMChainInfo(
				EVMChain.PREMIUMBLOCK.toString(), 
				"PremiumBlock", 
				23023L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("PremiumBlock Gas Token", "PBLK", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.premiumblock.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.premiumblock.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/23023");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PREMIUMBLOCK, premiumblock);
		
		// ultra
		EVMChainInfo ultra = new EVMChainInfo(
				EVMChain.ULTRA.toString(), 
				"Ultra EVM Network", 
				19991L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Ultra EVM Network Gas Token", "UOS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://evm.ultra.eosusa.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://evmexplorer.ultra.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/19991");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ULTRA, ultra);
		
		// abstract
		EVMChainInfo abstracto = new EVMChainInfo(
				EVMChain.ABSTRACT.toString(), 
				"Abstract", 
				2741L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Abstract Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://api.mainnet.abs.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.mainnet.abs.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2741");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ABSTRACT, abstracto);
		
		// bitlazer
		EVMChainInfo bitlazer = new EVMChainInfo(
				EVMChain.BITLAZER.toString(), 
				"Bitlazer", 
				14235L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Bitlazer Gas Token", "lzrBTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://bitlazer.calderachain.xyz/http");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://bitlazer.calderaexplorer.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/14235");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BITLAZER, bitlazer);
		
		// huddle01
		EVMChainInfo huddle01 = new EVMChainInfo(
				EVMChain.HUDDLE01.toString(), 
				"Huddle01 dRTC Chain", 
				12323L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Huddle01 dRTC Chain Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://huddle01.calderachain.xyz/http");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://huddle01.calderaexplorer.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/12323");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.HUDDLE01, huddle01);
		
		// artela
		EVMChainInfo artela = new EVMChainInfo(
				EVMChain.ARTELA.toString(), 
				"Artela Mainnet", 
				11820L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Artela Mainnet Gas Token", "ART", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://node-euro.artela.network/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://artscan.artela.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/11820");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ARTELA, artela);
		
		// egold
		EVMChainInfo egold = new EVMChainInfo(
				EVMChain.EGOLD.toString(), 
				"eGold Chain", 
				11451L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("eGold Chain Gas Token", "XAU", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.egoldchain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://egoldscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/11451");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.EGOLD, egold);
		
		// bitcoin
		EVMChainInfo bitcoin = new EVMChainInfo(
				EVMChain.BITCOIN.toString(), 
				"Bitcoin Chain", 
				8086L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Bitcoin Chain Gas Token", "BTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.bitcoinevm.org");
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
					this.add("https://chainlist.org/chain/8086");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BITCOIN, bitcoin);
		
		// powerloom
		EVMChainInfo powerloom = new EVMChainInfo(
				EVMChain.POWERLOOM.toString(), 
				"Powerloom Mainnet", 
				7865L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Powerloom Mainnet Gas Token", "POWER", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.powerloom.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.powerloom.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/7865");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.POWERLOOM, powerloom);
		
		// initverse
		EVMChainInfo initverse = new EVMChainInfo(
				EVMChain.INITVERSE.toString(), 
				"InitVerse mainnet", 
				7233L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("InitVerse mainnet Gas Token", "INI", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-mainnet.inichain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://www.iniscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/7233");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.INITVERSE, initverse);
		
		// bharat
		EVMChainInfo bharat = new EVMChainInfo(
				EVMChain.BHARAT.toString(), 
				"Bharat Blockchain Network", 
				7099L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Bharat Blockchain Network Gas Token", "BBN", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://bbnrpc.testnet.bharatblockchain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://www.bon.bharatblockchain.io/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/7099");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BHARAT, bharat);
		
		// pointpay
		EVMChainInfo pointpay = new EVMChainInfo(
				EVMChain.POINTPAY.toString(), 
				"PointPay Mainnet", 
				5511L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("PointPay Mainnet Gas Token", "PXP", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-mainnet.pointpay.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.pointpay.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/5511");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.POINTPAY, pointpay);
		
		// echos
		EVMChainInfo echos = new EVMChainInfo(
				EVMChain.ECHOS.toString(), 
				"Echos Chain", 
				4321L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Echos Chain Gas Token", "USDC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-echos-mainnet-0.t.conduit.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.echos.fun");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/4321");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ECHOS, echos);
		
		// paynetwork
		EVMChainInfo paynetwork = new EVMChainInfo(
				EVMChain.PAYNETWORK.toString(), 
				"PayNetwork Mainnet", 
				3969L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("PayNetwork Mainnet Gas Token", "Pay", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.paynetwork.io");
					this.add("https://paynetwork-main.calderachain.xyz/http");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://paynetwork-main.calderaexplorer.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/3969");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PAYNETWORK, paynetwork);
		
		// firechain
		EVMChainInfo firechain = new EVMChainInfo(
				EVMChain.FIRECHAIN.toString(), 
				"Firechain zkEVM Ghostrider", 
				3885L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Firechain zkEVM Ghostrider Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-zkevm-ghostrider.thefirechain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://ghostrider-zkevm.firescan.io");
				}},
				new ArrayList<String>() {{
					this.add("https://zkevm-faucet.firestation.io");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/3885");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FIRECHAIN, firechain);

		
		// meroneum
		EVMChainInfo meroneum = new EVMChainInfo(
				EVMChain.MERONEUM.toString(), 
				"Meroneum", 
				3366L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Meroneum Gas Token", "MERON", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://mainnet-node1.meronscan.ai/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://meronscan.ai");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/3366");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MERONEUM, meroneum);
		
		// bc
		EVMChainInfo bc = new EVMChainInfo(
				EVMChain.BC.toString(), 
				"BC Hyper Chain Mainnet", 
				3030L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("BC Hyper Chain Mainnet Gas Token", "VTCN", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://mainapi.bchscan.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://mainnet.bchscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/3030");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BC, bc);
		
		// goat
		EVMChainInfo goat = new EVMChainInfo(
				EVMChain.GOAT.toString(), 
				"GOAT Network", 
				2345L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("GOAT Network Gas Token", "BTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.goat.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.goat.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2345");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.GOAT, goat);
		
		// soneium
		EVMChainInfo soneium = new EVMChainInfo(
				EVMChain.SONEIUM.toString(), 
				"Soneium", 
				1868L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Soneium Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.soneium.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://soneium.slam.vision");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1868");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SONEIUM, soneium);
		
		// glue
		EVMChainInfo glue = new EVMChainInfo(
				EVMChain.GLUE.toString(), 
				"Glue Mainnet", 
				1300L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Glue Mainnet Gas Token", "GLUE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.glue.net");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.glue.net");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1300");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.GLUE, glue);
		
		// edu
		EVMChainInfo edu = new EVMChainInfo(
				EVMChain.EDU.toString(), 
				"EDU Chain", 
				41923L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("EDU Chain Gas Token", "EDU", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.edu-chain.raas.gelato.cloud");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://educhain.blockscout.com");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge.gelato.network/bridge/edu-chain");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/41923");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.EDU, edu);
		
		// hashkey
		EVMChainInfo hashkey = new EVMChainInfo(
				EVMChain.HASHKEY.toString(), 
				"HashKey Chain", 
				177L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("HashKey Chain Gas Token", "HSK", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://mainnet.hsk.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.hsk.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/177");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.HASHKEY, hashkey);
		
		// wowchain
		EVMChainInfo wowchain = new EVMChainInfo(
				EVMChain.WOWCHAIN.toString(), 
				"WowChain Mainnet", 
				203L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("WowChain Mainnet Gas Token", "DOGE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.wowchain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.wowchain.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/203");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.WOWCHAIN, wowchain);
		
		// mind
		EVMChainInfo mind = new EVMChainInfo(
				EVMChain.MIND.toString(), 
				"Mind Network Mainnet", 
				228L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Mind Network Mainnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-mainnet.mindnetwork.xyz");
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
					this.add("https://chainlist.org/chain/228");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MIND, mind);
		
		// xr
		EVMChainInfo xr = new EVMChainInfo(
				EVMChain.XR.toString(), 
				"XR One", 
				273L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("XR One Gas Token", "XR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://xr-one.calderachain.xyz/http");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://xr-one.calderaexplorer.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/273");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.XR, xr);
		
		// river
		EVMChainInfo river = new EVMChainInfo(
				EVMChain.RIVER.toString(), 
				"River", 
				550L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("River Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://towns-mainnet.calderachain.xyz/http");
					this.add("https://mainnet.rpc.river.build");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://towns-mainnet.calderaexplorer.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/550");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.RIVER, river);
		
		// nfb
		EVMChainInfo nfb = new EVMChainInfo(
				EVMChain.NFB.toString(), 
				"NFB Chain", 
				632L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("NFB Chain Gas Token", "NFBC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://node.nfbchain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.nfbchain.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/632");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.NFB, nfb);
		
		// tranched
		EVMChainInfo tranched = new EVMChainInfo(
				EVMChain.TRANCHED.toString(), 
				"Tranched Mainnet", 
				743L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Tranched Mainnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://tranched-mainnet.calderachain.xyz/http");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://tranched-mainnet.calderaexplorer.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/743");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TRANCHED, tranched);
		
		// rivalz
		EVMChainInfo rivalz = new EVMChainInfo(
				EVMChain.RIVALZ.toString(), 
				"Rivalz", 
				753L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Rivalz Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rivalz.calderachain.xyz/http");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://rivalz.calderaexplorer.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/753");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.RIVALZ, rivalz);
		
		// evoz
		EVMChainInfo evoz = new EVMChainInfo(
				EVMChain.EVOZ.toString(), 
				"Evoz Mainnet", 
				805L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Evoz Mainnet Gas Token", "EVOZ", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.evozscan.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://evozscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/805");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.EVOZ, evoz);
		
		// electra
		EVMChainInfo electra = new EVMChainInfo(
				EVMChain.ELECTRA.toString(), 
				"Electra Network", 
				861L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Electra Network Gas Token", "ELC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.electranetwork.tech");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.electranetwork.tech");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/861");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ELECTRA, electra);

		// rinia
		EVMChainInfo rinia = new EVMChainInfo(
				EVMChain.RINIA.toString(), 
				"Rinia", 
				917L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Rinia Gas Token", "FIRE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rinia-rpc1.thefirechain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://rinia.firescan.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.firestation.io");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/917");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.RINIA, rinia);
		
		// subtensor
		EVMChainInfo subtensor = new EVMChainInfo(
				EVMChain.SUBTENSOR.toString(), 
				"Subtensor EVM", 
				964L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Subtensor EVM Gas Token", "TAO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://lite.chain.opentensor.ai");
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
					this.add("https://chainlist.org/chain/964");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SUBTENSOR, subtensor);
		
		// taker
		EVMChainInfo taker = new EVMChainInfo(
				EVMChain.TAKER.toString(), 
				"Taker Chain Mainnet", 
				1125L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Taker Chain Mainnet Gas Token", "TAKER", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-mainnet.taker.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.taker.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1125");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TAKER, taker);
		
		// story
		EVMChainInfo story = new EVMChainInfo(
				EVMChain.STORY.toString(), 
				"Story", 
				1514L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Story Gas Token", "IP", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://mainnet.storyrpc.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://mainnet.storyscan.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1514");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.STORY, story);
		
		// form
		EVMChainInfo form = new EVMChainInfo(
				EVMChain.FORM.toString(), 
				"Form Network", 
				478L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Form Network Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.form.network/http");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.form.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/478");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FORM, form);
		
		// wemblockchain
		EVMChainInfo wemblockchain = new EVMChainInfo(
				EVMChain.WEMBLOCKCHAIN.toString(), 
				"WEMblockchain MainNet", 
				315L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("WEMblockchain MainNet Gas Token", "WEM", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("http://rpc.wemblockchain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://wemscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/315");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.WEMBLOCKCHAIN, wemblockchain);
		
		// puppynet
		EVMChainInfo puppynet = new EVMChainInfo(
				EVMChain.PUPPYNET.toString(), 
				"Puppynet", 
				157L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Puppynet Gas Token", "BONE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://puppynet.shibrpc.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://puppyscan.shib.io");
				}},
				new ArrayList<String>() {{
					this.add("https://shibarium.shib.io/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/157");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PUPPYNET, puppynet);
		
		// formicarium
		EVMChainInfo formicarium = new EVMChainInfo(
				EVMChain.FORMICARIUM.toString(), 
				"Formicarium", 
				43521L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Formicarium Gas Token", "M", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.formicarium.memecore.net");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://formicarium.memecorescan.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.memecore.com/formicarium");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/43521");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FORMICARIUM, formicarium);
		
		// unite
		EVMChainInfo unite = new EVMChainInfo(
				EVMChain.UNITE.toString(), 
				"Unite", 
				88899L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Unite Gas Token", "UNITE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://unite-mainnet.g.alchemy.com/public");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://unite-mainnet.explorer.alchemy.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/88899");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.UNITE, unite);
		
		// lux
		EVMChainInfo lux = new EVMChainInfo(
				EVMChain.LUX.toString(), 
				"Lux Mainnet", 
				96369L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Lux Mainnet Gas Token", "LUX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://api.lux.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explore.lux-test.network");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.lux-test.network");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/96369");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.LUX, lux);
		
		// zoo
		EVMChainInfo zoo = new EVMChainInfo(
				EVMChain.ZOO.toString(), 
				"Zoo Mainnet", 
				200200L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Zoo Mainnet Gas Token", "ZOO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://api.zoo.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explore.zoo-test.network");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.zoo-test.network");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/200200");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZOO, zoo);
		
		// owshen
		EVMChainInfo owshen = new EVMChainInfo(
				EVMChain.OWSHEN.toString(), 
				"Owshen Mainnet", 
				918273L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Owshen Mainnet Gas Token", "DIVE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.owshen.io");
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
					this.add("https://chainlist.org/chain/918273");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.OWSHEN, owshen);

		// turbo
		EVMChainInfo turbo = new EVMChainInfo(
				EVMChain.TURBO.toString(), 
				"Turbo", 
				1313161567L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Turbo Gas Token", "TURBO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-0x4e45415f.aurora-cloud.dev");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.turbo.aurora.dev");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1313161567");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TURBO, turbo);
		
		// corn
		EVMChainInfo corn = new EVMChainInfo(
				EVMChain.CORN.toString(), 
				"Corn Maizenet", 
				21000000L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Corn Maizenet Gas Token", "BTCN", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://maizenet-rpc.usecorn.com");
					this.add("https://rpc.ankr.com/corn_maizenet");
					this.add("https://mainnet.corn-rpc.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://maizenet-explorer.usecorn.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/21000000");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CORN, corn);
		
		// wadzchain
		EVMChainInfo wadzchain = new EVMChainInfo(
				EVMChain.WADZCHAIN.toString(), 
				"Wadzchain Mainnet", 
				171717L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Wadzchain Mainnet Gas Token", "WCO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.wadzchain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.wadzchain.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/171717");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.WADZCHAIN, wadzchain);
		
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
