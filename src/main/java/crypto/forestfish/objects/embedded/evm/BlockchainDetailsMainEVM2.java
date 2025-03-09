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
		EVMChainInfo plume2 = new EVMChainInfo(
				EVMChain.PLUME98866.toString(), 
				"Plume Mainnet", 
				98866L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Plume Mainnet Gas Token", "PLUME", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://phoenix-rpc.plumenetwork.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://phoenix-explorer.plumenetwork.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/98866");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PLUME98866, plume2);
		
		// miracle
		EVMChainInfo miracle = new EVMChainInfo(
				EVMChain.MIRACLE.toString(), 
				"Miracle Chain", 
				92278L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Miracle Chain Gas Token", "MPT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.miracleplay.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.miracleplay.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/92278");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MIRACLE, miracle);
		
		// hemi
		EVMChainInfo hemi = new EVMChainInfo(
				EVMChain.HEMI.toString(), 
				"Hemi Network", 
				43111L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Hemi Network Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.hemi.network/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.hemi.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/43111");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.HEMI, hemi);
		
		// z
		EVMChainInfo z = new EVMChainInfo(
				EVMChain.Z.toString(), 
				"Z Chain", 
				9369L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Z Chain Gas Token", "Z", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.zchain.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://zscan.live");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/9369");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.Z, z);
		
		// pione
		EVMChainInfo pionez = new EVMChainInfo(
				EVMChain.PIONEZERO.toString(), 
				"Pione Zero", 
				5080L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Pione Zero Gas Token", "PZO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.zeroscan.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://zero.pionescan.com");
				}},
				new ArrayList<String>() {{
					this.add("https://dex.pionechain.com/testnet/faucet/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/5080");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PIONEZERO, pionez);
		
		// blackfort
		EVMChainInfo blackfort = new EVMChainInfo(
				EVMChain.BLACKFORT.toString(), 
				"BlackFort Exchange Network Deprecated", 
				4999L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("BlackFort Exchange Network Deprecated Gas Token", "BXNdpr", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://mainnet.blackfort.network/rpc");
					this.add("https://mainnet-1.blackfort.network/rpc");
					this.add("https://mainnet-2.blackfort.network/rpc");
					this.add("https://mainnet-3.blackfort.network/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.blackfort.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/4999");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BLACKFORT, blackfort);
		
		// pepe
		EVMChainInfo pepe = new EVMChainInfo(
				EVMChain.PEPE.toString(), 
				"Pepe Unchained", 
				3409L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Pepe Unchained Gas Token", "PEPU", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-pepe-unchained-gupg0lo9wf.t.conduit.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://pepuscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/3409");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PEPE, pepe);

		
		// reactive
		EVMChainInfo reactive = new EVMChainInfo(
				EVMChain.REACTIVE.toString(), 
				"Reactive Mainnet", 
				1597L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Reactive Mainnet Gas Token", "REACT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://mainnet-rpc.rnk.dev");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://reactscan.net");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1597");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.REACTIVE, reactive);
		
		// pundi
		EVMChainInfo pundi = new EVMChainInfo(
				EVMChain.PUNDI.toString(), 
				"Pundi AIFX Omnilayer", 
				530L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Pundi AIFX Omnilayer Gas Token", "PUNDAI", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://fx-json-web3.functionx.io:8545");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://pundiscan.io/evm");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/530");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PUNDI, pundi);
		
		// magichain
		EVMChainInfo magichain = new EVMChainInfo(
				EVMChain.MAGICHAIN.toString(), 
				"MagiChain", 
				24125L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("MagiChain Gas Token", "MGIX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.magichain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.magichain.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/24125");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MAGICHAIN, magichain);

		
		// apertum
		EVMChainInfo apertum = new EVMChainInfo(
				EVMChain.APERTUM.toString(), 
				"Apertum", 
				2786L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Apertum Gas Token", "APTM", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.apertum.io/ext/bc/YDJ1r9RMkewATmA7B35q1bdV18aywzmdiXwd9zGBq3uQjsCnn/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.apertum.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2786");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.APERTUM, apertum);
		
		// lagom
		EVMChainInfo lagom = new EVMChainInfo(
				EVMChain.LAGOM.toString(), 
				"LAGOM Mainnet", 
				986L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("LAGOM Mainnet Gas Token", "LAGO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc1.lagom.mainnet.zeeve.net");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://Explorer.lagomchain.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/986");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.LAGOM, lagom);
		
		// coinweb
		EVMChainInfo coinweb = new EVMChainInfo(
				EVMChain.COINWEB.toString(), 
				"Coinweb BNB shard", 
				2222222L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Coinweb BNB shard Gas Token", "CWEB", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://api-cloud.coinweb.io/eth-rpc-service/bnb");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.coinweb.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2222222");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.COINWEB, coinweb);
		
		// ethpar
		EVMChainInfo ethpar = new EVMChainInfo(
				EVMChain.ETHPAR.toString(), 
				"Ethpar Mainnet", 
				1727L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Ethpar Mainnet Gas Token", "ETP", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc01.ethpar.net/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://dora.ethpar.net");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1727");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ETHPAR, ethpar);
		
		// smart
		EVMChainInfo smart = new EVMChainInfo(
				EVMChain.SMART.toString(), 
				"Smart Pay Mobile Money", 
				666301179999L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Smart Pay Mobile Money Gas Token", "SMRTP", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://network.uat.smartmoneyewallet.com/");
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
					this.add("https://chainlist.org/chain/666301179999");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SMART, smart);
		
		// atleta
		EVMChainInfo atleta = new EVMChainInfo(
				EVMChain.ATLETA.toString(), 
				"Atleta Network", 
				2440L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Atleta Network Gas Token", "ATLA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.mainnet.atleta.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://polkadot-explorer.atleta.network/#/explorer");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2440");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ATLETA, atleta);

		// xferchain
		EVMChainInfo xferchain = new EVMChainInfo(
				EVMChain.XFERCHAIN.toString(), 
				"XferChain Mainnet", 
				28125L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("XferChain Mainnet Gas Token", "Dapo", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.xferchain.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://xferchain.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/28125");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.XFERCHAIN, xferchain);
		
		// tuxappcoin
		EVMChainInfo tuxappcoin = new EVMChainInfo(
				EVMChain.TUXAPPCOIN.toString(), 
				"Tuxappcoin", 
				1313161573L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Tuxappcoin Gas Token", "TUXA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-0x4e454165.aurora-cloud.dev");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.tuxa.aurora.dev");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1313161573");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TUXAPPCOIN, tuxappcoin);
		
		// reactive
		EVMChainInfo reactivekopli = new EVMChainInfo(
				EVMChain.REACTIVEKOPLI.toString(), 
				"Reactive Kopli", 
				5318008L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Reactive Kopli Gas Token", "REACT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://kopli-rpc.rnk.dev");
					this.add("http://kopli-rpc.rkt.ink");
					this.add("https://kopli-rpc.reactive.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://kopli.reactscan.net");
				}},
				new ArrayList<String>() {{
					this.add("https://dev.reactive.network/docs/kopli-testnet#faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/5318008");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.REACTIVEKOPLI, reactivekopli);
		
		// emeraldz
		EVMChainInfo emeraldz = new EVMChainInfo(
				EVMChain.EMERALDZ.toString(), 
				"Emeraldz", 
				789789L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Emeraldz Gas Token", "EMED", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://public.0xrpc.com/789789");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://emeraldzscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/789789");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.EMERALDZ, emeraldz);
		
		// unichain
		EVMChainInfo unichain = new EVMChainInfo(
				EVMChain.UNICHAIN.toString(), 
				"Unichain", 
				130L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Unichain Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://mainnet.unichain.org");
					this.add("https://unichain-rpc.publicnode.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://unichain.blockscout.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/130");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.UNICHAIN, unichain);
		
		// nibiru_test
		EVMChainInfo nibiru_test = new EVMChainInfo(
				EVMChain.NIBIRUTEST.toString(), 
				"Nibiru testnet-1", 
				7210L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Nibiru testnet-1 Gas Token", "NIBI", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://evm-rpc.testnet-1.nibiru.fi");
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
					this.add("https://chainlist.org/chain/7210");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.NIBIRUTEST, nibiru_test);
		
		// memecore
		EVMChainInfo memecore = new EVMChainInfo(
				EVMChain.MEMECORE.toString(), 
				"MemeCore", 
				4352L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("MemeCore Gas Token", "M", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.memecore.net");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://blockscout.memecore.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/4352");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MEMECORE, memecore);
		
		// xone
		EVMChainInfo xone = new EVMChainInfo(
				EVMChain.XONE.toString(), 
				"Xone Mainnet", 
				3721L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Xone Mainnet Gas Token", "XOC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.xone.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://xscscan.com");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.xone.org/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/3721");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.XONE, xone);
		
		// coinzax
		EVMChainInfo coinzax = new EVMChainInfo(
				EVMChain.COINZAX.toString(), 
				"COINZAX", 
				1310L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("COINZAX Gas Token", "ZAX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.coinzax.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.coinzax.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1310");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.COINZAX, coinzax);
		
		// weber
		EVMChainInfo weber = new EVMChainInfo(
				EVMChain.WEBER.toString(), 
				"Weber Governance Mainnet", 
				881L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Weber Governance Mainnet Gas Token", "PTT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://chain.myweber.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://mainnet.myweber.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/881");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.WEBER, weber);
		
		// landstars
		EVMChainInfo landstars = new EVMChainInfo(
				EVMChain.LANDSTARS.toString(), 
				"Landstars", 
				495L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Landstars Gas Token", "LDS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://13882-60301.pph-server.de");
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
					this.add("https://chainlist.org/chain/495");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.LANDSTARS, landstars);
		
		// official
		EVMChainInfo official_vasyl = new EVMChainInfo(
				EVMChain.VASYL.toString(), 
				"OFFICIAL VASYL", 
				1278060416L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("OFFICIAL VASYL Gas Token", "VASYL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.official-vasyl.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.official-vasyl.network");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.official-vasyl.network");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1278060416");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.VASYL, official_vasyl);
		
		// plume
		EVMChainInfo plume = new EVMChainInfo(
				EVMChain.PLUME98865.toString(), 
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
		networks.put(EVMChain.PLUME98865, plume);
		
		// worldecomoney
		EVMChainInfo worldecomoney = new EVMChainInfo(
				EVMChain.WORLDECOMONEY.toString(), 
				"WorldEcoMoney", 
				315L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("WorldEcoMoney Gas Token", "WEM", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.wemblockchain.com");
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
		networks.put(EVMChain.WORLDECOMONEY, worldecomoney);
		
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
		
		// ethereumfair
		EVMChainInfo ethereumfair = new EVMChainInfo(
				EVMChain.ETHEREUMFAIR.toString(), 
				"EthereumFair", 
				513100L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("EthereumFair Gas Token", "ETHF", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.etherfair.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://www.oklink.com/ethf");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/513100");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ETHEREUMFAIR, ethereumfair);
		
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
					this.add("https://hydration-rpc.n.dwellir.com");
					this.add("https://rpc.helikon.io/hydradx");
					this.add("https://hydration.dotters.network");
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
		
		// haven1
		EVMChainInfo haven1 = new EVMChainInfo(
				EVMChain.HAVEN1.toString(), 
				"Haven1", 
				8811L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Haven1 Gas Token", "H1", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.haven1.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.haven1.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/8811");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.HAVEN1, haven1);
		
		// bharat
		EVMChainInfo bharat = new EVMChainInfo(
				EVMChain.BHARAT.toString(), 
				"Bharat Blockchain Network Mainnet", 
				8099L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Bharat Blockchain Network Mainnet Gas Token", "BBN", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://bbnrpc.mainnet.bharatblockchain.io");
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
					this.add("https://chainlist.org/chain/8099");
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
					this.add("https://xr1.calderachain.xyz/http");
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
		
		// zkcandy
		EVMChainInfo zkcandy = new EVMChainInfo(
				EVMChain.ZKCANDY.toString(), 
				"ZKcandy Mainnet", 
				320L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("ZKcandy Mainnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.zkcandy.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.zkcandy.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/320");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZKCANDY, zkcandy);
		
		// amaxsmartchain
		EVMChainInfo amaxsmartchain = new EVMChainInfo(
				EVMChain.AMAXSMARTCHAIN.toString(), 
				"AmaxSmartchain", 
				662L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("AmaxSmartchain Gas Token", "AMAX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.amaxchain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.amaxchain.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/662");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.AMAXSMARTCHAIN, amaxsmartchain);
		
		// lydia
		EVMChainInfo lydia = new EVMChainInfo(
				EVMChain.LYDIA.toString(), 
				"Lydia Coin", 
				1989L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Lydia Coin Gas Token", "BSW", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.lydiacoins.com");
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
					this.add("https://chainlist.org/chain/1989");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.LYDIA, lydia);
		
		// pho
		EVMChainInfo pho = new EVMChainInfo(
				EVMChain.PHO.toString(), 
				"Pho Blockchain Mainnet", 
				2605L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Pho Blockchain Mainnet Gas Token", "PHO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://mainnet.phochain.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://phoscan.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2605");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PHO, pho);
		
		// witness
		EVMChainInfo witness = new EVMChainInfo(
				EVMChain.WITNESS.toString(), 
				"WITNESS CHAIN", 
				1702448187L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("WITNESS CHAIN Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://sequencer.witnesschain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.witnesschain.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1702448187");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.WITNESS, witness);
		
		// privix
		EVMChainInfo privix = new EVMChainInfo(
				EVMChain.PRIVIX.toString(), 
				"Privix Chain Mainnet", 
				16969696L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Privix Chain Mainnet Gas Token", "PSC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://mainnet-rpc.privixchain.xyz/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://privixscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/16969696");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PRIVIX, privix);
		
		// conet
		EVMChainInfo conet_canun = new EVMChainInfo(
				EVMChain.CONETCANUN.toString(), 
				"CONET Cancun", 
				224433L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("CONET Cancun Gas Token", "CONET", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.conet.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://cancun.conet.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/224433");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CONETCANUN, conet_canun);
		
		// lumoz
		EVMChainInfo lumoz = new EVMChainInfo(
				EVMChain.LUMOZ.toString(), 
				"Lumoz Chain Mainnet", 
				96370L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Lumoz Chain Mainnet Gas Token", "MOZ", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.lumoz.org");
					this.add("https://rpc-hk.lumoz.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.lumoz.info");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/96370");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.LUMOZ, lumoz);
		
		// arcadia
		EVMChainInfo arcadia = new EVMChainInfo(
				EVMChain.ARCADIA.toString(), 
				"Arcadia Mainnet", 
				4278608L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Arcadia Mainnet Gas Token", "AIP", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://arcadia.khalani.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.arcadia.khalani.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/4278608");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ARCADIA, arcadia);
		
		// oone
		EVMChainInfo oone = new EVMChainInfo(
				EVMChain.OONE.toString(), 
				"Oone Chain Mainnet", 
				777888L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Oone Chain Mainnet Gas Token", "OONE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.oonechain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://oonescan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/777888");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.OONE, oone);
		
		// heima
		EVMChainInfo heima = new EVMChainInfo(
				EVMChain.HEIMA.toString(), 
				"Heima", 
				212013L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Heima Gas Token", "HEI", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.litentry-parachain.litentry.io");
					this.add("https://litentry-rpc.dwellir.com");
					this.add("https://rpc.heima-parachain.heima.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://litentry-rpc.dwellir.com");
					this.add("https://heima.statescan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/212013");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.HEIMA, heima);
		
		// onfa
		EVMChainInfo onfa = new EVMChainInfo(
				EVMChain.ONFA.toString(), 
				"ONFA Chain", 
				8691942025L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("ONFA Chain Gas Token", "OFC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.onfa.io");
					this.add("https://rpc.onfachain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://onfascan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/8691942025");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ONFA, onfa);
		
		// mud
		EVMChainInfo mud = new EVMChainInfo(
				EVMChain.MUD.toString(), 
				"MUD Chain", 
				168169L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("MUD Chain Gas Token", "MUD", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.mud.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.mud.network");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.mud.network");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/168169");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MUD, mud);
		
		// berachain
		EVMChainInfo berachain = new EVMChainInfo(
				EVMChain.BERACHAIN.toString(), 
				"Berachain", 
				80094L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Berachain Gas Token", "BERA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.berachain.com");
					this.add("https://berachain-rpc.publicnode.com");
					this.add("https://rpc.berachain-apis.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://beratrail.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/80094");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BERACHAIN, berachain);
		
		// birdlayer
		EVMChainInfo birdlayer = new EVMChainInfo(
				EVMChain.BIRDLAYER.toString(), 
				"BirdLayer", 
				53456L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("BirdLayer Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc1.birdlayer.xyz");
					this.add("https://rpc.birdlayer.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.birdlayer.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/53456");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BIRDLAYER, birdlayer);
		
		// bevm
		EVMChainInfo bevm = new EVMChainInfo(
				EVMChain.BEVMSIGNET.toString(), 
				"BEVM Signet", 
				11504L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("BEVM Signet Gas Token", "BTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://signet.bevm.io/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan-signet.bevm.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/11504");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BEVMSIGNET, bevm);
		
		// volcano
		EVMChainInfo volcano = new EVMChainInfo(
				EVMChain.VOLCANO.toString(), 
				"Volcano Chain Mainnet", 
				10085L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Volcano Chain Mainnet Gas Token", "VC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://mainnet.vchain.pro");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://vchainscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/10085");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.VOLCANO, volcano);
		
		// nibiru
		EVMChainInfo nibiru = new EVMChainInfo(
				EVMChain.NIBIRU.toString(), 
				"Nibiru Mainnet", 
				6900L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Nibiru Mainnet Gas Token", "NIBI", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://evm-rpc.nibiru.fi");
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
					this.add("https://chainlist.org/chain/6900");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.NIBIRU, nibiru);
		
		// pione
		EVMChainInfo pione = new EVMChainInfo(
				EVMChain.PIONE.toString(), 
				"Pione Chain Mainnet", 
				5090L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Pione Chain Mainnet Gas Token", "PIO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.pionescan.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://pionescan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/5090");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PIONE, pione);
		
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
		
		// fushuma
		EVMChainInfo fushuma = new EVMChainInfo(
				EVMChain.FUSHUMA.toString(), 
				"Fushuma", 
				121224L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Fushuma Gas Token", "FUMA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.fushuma.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://fumascan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/121224");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FUSHUMA, fushuma);
		
		// citronus
		EVMChainInfo citronus = new EVMChainInfo(
				EVMChain.CITRONUS.toString(), 
				"Citronus", 
				50000L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Citronus Gas Token", "CITRO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.citronus.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.citronus.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/50000");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CITRONUS, citronus);

		
		// xusd
		EVMChainInfo xusd = new EVMChainInfo(
				EVMChain.XUSD.toString(), 
				"XUSD ONE StableChain Mainnet", 
				20441L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("XUSD ONE StableChain Mainnet Gas Token", "X1", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://xusd.live");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://xusdscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/20441");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.XUSD, xusd);
		
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
		
		// pointledger
		EVMChainInfo pointledger = new EVMChainInfo(
				EVMChain.POINTLEDGER.toString(), 
				"pointledger", 
				9889L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("pointledger Gas Token", "PLG", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.pointledger.net");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://exp.pointledger.net");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/9889");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.POINTLEDGER, pointledger);
		
		// action
		EVMChainInfo action = new EVMChainInfo(
				EVMChain.ACTION.toString(), 
				"Action Mainnet", 
				21000L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Action Mainnet Gas Token", "ACTN", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.actionblockchain.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("http://exp.actionblockchain.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/21000");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ACTION, action);
		
		// deepsafe
		EVMChainInfo deepsafe = new EVMChainInfo(
				EVMChain.DEEPSAFE.toString(), 
				"DeepSafe Beta Mainnet", 
				10011L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("DeepSafe Beta Mainnet Gas Token", "DEF", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://betamainnet-rpc-node-http.deepsafe.network");
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
					this.add("https://chainlist.org/chain/10011");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DEEPSAFE, deepsafe);
		
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
