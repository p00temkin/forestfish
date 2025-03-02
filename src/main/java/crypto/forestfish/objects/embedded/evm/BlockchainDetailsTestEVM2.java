package crypto.forestfish.objects.embedded.evm;

import java.util.ArrayList;
import java.util.HashMap;

import crypto.forestfish.enums.BlockchainType;
import crypto.forestfish.enums.evm.EVMChain;
import crypto.forestfish.enums.evm.EVMPriceMechanism;
import crypto.forestfish.objects.evm.model.chain.EVMChainInfo;
import crypto.forestfish.objects.evm.model.chain.EVMCurrency;

public class BlockchainDetailsTestEVM2 {

	@SuppressWarnings("serial")
	public static HashMap<EVMChain, EVMChainInfo> getTestnetEVMNetworks() {

		HashMap<EVMChain, EVMChainInfo> networks = new HashMap<>();

		
		// okto_test
		EVMChainInfo okto_test = new EVMChainInfo(
				EVMChain.OKTOTEST.toString(), 
				"Okto Testnet", 
				8801L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Okto Testnet Gas Token", "OKTO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.okto-testnet.zeeve.online");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.okto-testnet.zeeve.online");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.okto-testnet.zeeve.online");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/8801");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.OKTOTEST, okto_test);
		
		// quarkchain_test
		EVMChainInfo quarkchain_test = new EVMChainInfo(
				EVMChain.QUARKCHAINTEST.toString(), 
				"QuarkChain L2 Beta Testnet", 
				3335L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("QuarkChain L2 Beta Testnet Gas Token", "QKC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.beta.testnet.l2.quarkchain.io:8545");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.beta.testnet.l2.quarkchain.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/3335");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.QUARKCHAINTEST, quarkchain_test);
		
		// iopn_test
		EVMChainInfo iopn_test = new EVMChainInfo(
				EVMChain.IOPNTEST.toString(), 
				"IOPN Testnet", 
				984L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("IOPN Testnet Gas Token", "OPN", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.iopn.tech");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.iopn.tech");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.iopn.tech");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/984");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.IOPNTEST, iopn_test);
		
		// moca_test
		EVMChainInfo moca_test = new EVMChainInfo(
				EVMChain.MOCATEST.toString(), 
				"Moca Chain Testnet", 
				5151L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Moca Chain Testnet Gas Token", "MOCA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.mechain.tech");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-scan.mechain.tech");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.mechain.tech");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/5151");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MOCATEST, moca_test);
		
		// celestium_test
		EVMChainInfo celestium_test = new EVMChainInfo(
				EVMChain.CELESTIUMTEST.toString(), 
				"CELESTIUM Network Testnet", 
				252525L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("CELESTIUM Network Testnet Gas Token", "tCLT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-private-testnet.celestium.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.celestium.network");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.celestium.network");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/252525");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CELESTIUMTEST, celestium_test);

		// ethpar_test
		EVMChainInfo ethpar_test = new EVMChainInfo(
				EVMChain.ETHPARTEST.toString(), 
				"Ethpar Testnet", 
				806582L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Ethpar Testnet Gas Token", "ETP", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc82.testnet.ethpar.net/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://dora.testnet.ethpar.net");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/806582");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ETHPARTEST, ethpar_test);
		
		// dkargo_test
		EVMChainInfo dkargo_test = new EVMChainInfo(
				EVMChain.DKARGOTEST.toString(), 
				"dKargo Warehouse Testnet", 
				61022448L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("dKargo Warehouse Testnet Gas Token", "DKA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://warehouse-full01.dkargo.io");
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
					this.add("https://chainlist.org/chain/61022448");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DKARGOTEST, dkargo_test);
		
		// xferchain_test
		EVMChainInfo xferchain_test = new EVMChainInfo(
				EVMChain.XFERCHAINTEST.toString(), 
				"XferChain Testnet", 
				27125L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("XferChain Testnet Gas Token", "Dapo", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.xferchain.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.xferchain.org");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.xferchain.org");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/27125");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.XFERCHAINTEST, xferchain_test);
		
		// statemesh_test
		EVMChainInfo statemesh_test = new EVMChainInfo(
				EVMChain.STATEMESHTEST.toString(), 
				"StateMesh Testnet", 
				11343L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("StateMesh Testnet Gas Token", "MESH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-test.statemesh.net");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-test.statemesh.net");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.statemesh.net");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/11343");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.STATEMESHTEST, statemesh_test);
		
		// lydia_test
		EVMChainInfo lydia_test = new EVMChainInfo(
				EVMChain.LYDIATEST.toString(), 
				"Lydia Coin Testnet", 
				198989L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Lydia Coin Testnet Gas Token", "BSW", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.lydiacoins.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.lydiacoins.com/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/198989");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.LYDIATEST, lydia_test);
		
		// block_test
		EVMChainInfo block_test = new EVMChainInfo(
				EVMChain.BLOCKTEST.toString(), 
				"Block Chain LOL Berachain Testnet", 
				6231991L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Block Chain LOL Berachain Testnet Gas Token", "HARRY", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://block-chain.alt.technology");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.block-chain.lol");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.block-chain.lol/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/6231991");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BLOCKTEST, block_test);
		
		// privix_test
		EVMChainInfo privix_test = new EVMChainInfo(
				EVMChain.PRIVIXTEST.toString(), 
				"Privix Chain Testnet", 
				96969696L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Privix Chain Testnet Gas Token", "tPSC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.privixchain.xyz/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.privixscan.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.privixchain.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/96969696");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PRIVIXTEST, privix_test);
		
		// gpt_test
		EVMChainInfo gpt_test = new EVMChainInfo(
				EVMChain.GPTTEST.toString(), 
				"GPT Testnet", 
				476462898L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("GPT Testnet Gas Token", "SkpGPT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.gptprotocol.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-explorer.gptprotocol.io");
				}},
				new ArrayList<String>() {{
					this.add("https://testnet-faucet.gptprotocol.io");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/476462898");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.GPTTEST, gpt_test);
		
		// zuux_test
		EVMChainInfo zuux_test = new EVMChainInfo(
				EVMChain.ZUUXTEST.toString(), 
				"Zuux chain testnet", 
				4284265L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Zuux chain testnet Gas Token", "ZUUX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.zuux.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.zuux.network");
				}},
				new ArrayList<String>() {{
					this.add("https://www.zuuxlend.xyz/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/4284265");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZUUXTEST, zuux_test);
		
		// egold_test
		EVMChainInfo egold_test = new EVMChainInfo(
				EVMChain.EGOLDTEST.toString(), 
				"eGold Chain Testnet", 
				111451L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("eGold Chain Testnet Gas Token", "XAU", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.egoldchain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("http://testnet.egoldscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/111451");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.EGOLDTEST, egold_test);
		
		// monad_test
		EVMChainInfo monad_test = new EVMChainInfo(
				EVMChain.MONADTEST.toString(), 
				"Monad Testnet", 
				10143L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Monad Testnet Gas Token", "MON", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.monad.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.monadexplorer.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/10143");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MONADTEST, monad_test);
		
		// story_test
		EVMChainInfo story_test = new EVMChainInfo(
				EVMChain.STORYAENEIDTEST.toString(), 
				"Story Aeneid Testnet", 
				1315L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Story Aeneid Testnet Gas Token", "IP", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://aeneid.storyrpc.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://aeneid.storyscan.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1315");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.STORYAENEIDTEST, story_test);
		
		// rinia_test
		EVMChainInfo rinia_test = new EVMChainInfo(
				EVMChain.RINIATEST.toString(), 
				"Rinia", 
				917L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Rinia Gas Token", "FIRE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-rinia.firestation.io");
					this.add("https://rinia-rpc1.thefirechain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://rpc-rinia.firestation.io");
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
		networks.put(EVMChain.RINIATEST, rinia_test);
		
		// zkcandysepolia_test
		EVMChainInfo zkcandysepolia_test = new EVMChainInfo(
				EVMChain.ZKCANDYSEPOLIATEST.toString(), 
				"ZKcandy Sepolia Testnet", 
				302L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("ZKcandy Sepolia Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://sepolia.rpc.zkcandy.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sepolia.explorer.zkcandy.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/302");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZKCANDYSEPOLIATEST, zkcandysepolia_test);
		
		// pumpfi_test
		EVMChainInfo pumpfi_test = new EVMChainInfo(
				EVMChain.PUMPFITEST.toString(), 
				"PUMPFI CHAIN TESTNET", 
				490092L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("PUMPFI CHAIN TESTNET Gas Token", "PMPT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc1testnet.pumpfi.me");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnetscan.pumpfi.me");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.pumpfi.me");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/490092");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PUMPFITEST, pumpfi_test);
		
		// autonomys_test
		EVMChainInfo autonomys_test = new EVMChainInfo(
				EVMChain.AUTONOMYSTEST.toString(), 
				"Autonomys Taurus Testnet", 
				490000L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Autonomys Taurus Testnet Gas Token", "AI3", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://auto-evm.taurus.autonomys.xyz/ws");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://blockscout.taurus.autonomys.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/490000");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.AUTONOMYSTEST, autonomys_test);
		
		// pointpay_test
		EVMChainInfo pointpay_test = new EVMChainInfo(
				EVMChain.POINTPAYTEST.toString(), 
				"PointPay Testnet", 
				5511555L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("PointPay Testnet Gas Token", "PXP", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.pointpay.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.pointpay.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/5511555");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.POINTPAYTEST, pointpay_test);

		// ozean_test
		EVMChainInfo ozean_test = new EVMChainInfo(
				EVMChain.OZEANTEST.toString(), 
				"Ozean Poseidon Testnet", 
				7849306L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Ozean Poseidon Testnet Gas Token", "USDX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://ozean-testnet.rpc.caldera.xyz/http");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://ozean-testnet.explorer.caldera.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://ozean-testnet.hub.caldera.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/7849306");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.OZEANTEST, ozean_test);
		
		// autonity_test
		EVMChainInfo autonity_test = new EVMChainInfo(
				EVMChain.AUTONITYTEST.toString(), 
				"Autonity Piccadilly (Tiber) Testnet", 
				65100004L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Autonity Piccadilly (Tiber) Testnet Gas Token", "ATN", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://autonity.rpc.web3cdn.network/testnet");
					this.add("https://autonity-piccadilly.rpc.subquery.network/public");
					this.add("https://piccadilly.autonity-apis.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://piccadilly.autonity.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/65100004");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.AUTONITYTEST, autonity_test);
		
		// haust_test
		EVMChainInfo haust_test = new EVMChainInfo(
				EVMChain.HAUSTTEST.toString(), 
				"Haust Network Testnet", 
				1523903251L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Haust Network Testnet Gas Token", "HAUST", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.haust.app");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-testnet.haust.app");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.haust.app");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1523903251");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.HAUSTTEST, haust_test);

		
		// official_test
		EVMChainInfo official_test = new EVMChainInfo(
				EVMChain.OFFICIALTEST.toString(), 
				"OFFICIAL VASYL TESTNET", 
				1278060416L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("OFFICIAL VASYL TESTNET Gas Token", "VASYL", 18), 
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
		networks.put(EVMChain.OFFICIALTEST, official_test);
		
		// stavanger_test
		EVMChainInfo stavanger_test = new EVMChainInfo(
				EVMChain.STAVANGERTEST.toString(), 
				"Stavanger Public Testnet", 
				50591822L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Stavanger Public Testnet Gas Token", "POL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.stavanger.gateway.fm");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.stavanger.gateway.fm");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.stavanger.gateway.fm");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/50591822");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.STAVANGERTEST, stavanger_test);
		
		// soonchainsepolia_test
		EVMChainInfo soonchainsepolia_test = new EVMChainInfo(
				EVMChain.SOONCHAINSEPOLIATEST.toString(), 
				"SoonChain Sepolia Devnet", 
				20221001L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("SoonChain Sepolia Devnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://sepolia.rpc.soonchain.ai");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sepolia.explorer.soonchain.ai");
				}},
				new ArrayList<String>() {{
					this.add("https://console.optimism.io/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/20221001");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SOONCHAINSEPOLIATEST, soonchainsepolia_test);
		
		// vector
		EVMChainInfo vector = new EVMChainInfo(
				EVMChain.VECTOR.toString(), 
				"Vector Smart Chain", 
				420042L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Vector Smart Chain Gas Token", "VSG", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.vscblockchain.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.vscblockchain.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/420042");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.VECTOR, vector);
		
		// studio_test
		EVMChainInfo studio_test = new EVMChainInfo(
				EVMChain.STUDIOTEST.toString(), 
				"Studio Testnet", 
				240240L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Studio Testnet Gas Token", "STO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.studio-blockchain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://studio-scan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/240240");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.STUDIOTEST, studio_test);
		
		// chronicle_test
		EVMChainInfo chronicle_test = new EVMChainInfo(
				EVMChain.CHRONICLETEST.toString(), 
				"Chronicle Loa - Lit Protocol Testnet", 
				175190L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Chronicle Loa - Lit Protocol Testnet Gas Token", "tLit", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://loa-rpc.litprotocol.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://loa-explorer.litprotocol.com");
				}},
				new ArrayList<String>() {{
					this.add("https://developer.litprotocol.com/support/intro");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/175190");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CHRONICLETEST, chronicle_test);
		
		// openledger_test
		EVMChainInfo openledger_test = new EVMChainInfo(
				EVMChain.OPENLEDGERTEST.toString(), 
				"OpenLedger Testnet", 
				161201L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("OpenLedger Testnet Gas Token", "OPN", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpctn.openledger.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scantn.openledger.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/161201");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.OPENLEDGERTEST, openledger_test);
		
		// edgesepolia_test
		EVMChainInfo edgesepolia_test = new EVMChainInfo(
				EVMChain.EDGESEPOLIATEST.toString(), 
				"Edge Matrix Chain Sepolia", 
				99879L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Edge Matrix Chain Sepolia Gas Token", "EMC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc1-sepolia.emc.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sepolia.emcscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/99879");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.EDGESEPOLIATEST, edgesepolia_test);
		
		// settlussepolia_test
		EVMChainInfo settlussepolia_test = new EVMChainInfo(
				EVMChain.SETTLUSSEPOLIATEST.toString(), 
				"Settlus Sepolia Testnet", 
				5373L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Settlus Sepolia Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://settlus-septestnet.g.alchemy.com/public");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://settlus-sepolia-testnet.explorer.alchemy.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/5373");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SETTLUSSEPOLIATEST, settlussepolia_test);
		
		// nfb_test
		EVMChainInfo nfb_test = new EVMChainInfo(
				EVMChain.NFBTEST.toString(), 
				"NFB Chain Testnet", 
				6320L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("NFB Chain Testnet Gas Token", "NFBCT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-node.nfbchain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-scan.nfbchain.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/6320");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.NFBTEST, nfb_test);

		// uxlink_test
		EVMChainInfo uxlink_test = new EVMChainInfo(
				EVMChain.UXLINKTEST.toString(), 
				"UXLINK One Testnet", 
				7181L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("UXLINK One Testnet Gas Token", "UXLINK", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-sepolia.uxlinkone.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sepolia.uxlinkone.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/7181");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.UXLINKTEST, uxlink_test);

		// inco_test
		EVMChainInfo inco_test = new EVMChainInfo(
				EVMChain.INCOTEST.toString(), 
				"Inco Gentry Testnet", 
				9090L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Inco Gentry Testnet Gas Token", "INCO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet.inco.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.inco.org");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.inco.org");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/9090");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.INCOTEST, inco_test);
		
		// abstractsepolia_test
		EVMChainInfo abstractsepolia_test = new EVMChainInfo(
				EVMChain.ABSTRACTSEPOLIATEST.toString(), 
				"Abstract Sepolia Testnet", 
				11124L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Abstract Sepolia Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://api.testnet.abs.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sepolia.abscan.org");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.triangleplatform.com/abstract/testnet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/11124");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ABSTRACTSEPOLIATEST, abstractsepolia_test);
		
		// qubetics_test
		EVMChainInfo qubetics_test = new EVMChainInfo(
				EVMChain.QUBETICSTEST.toString(), 
				"Qubetics Testnet", 
				9003L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Qubetics Testnet Gas Token", "TICS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://alphatestnet-evm-rpc.qubetics.work/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.shidoscan.com");
				}},
				new ArrayList<String>() {{
					this.add("https://alphatestnet-explorer.qubetics.work/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/9003");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.QUBETICSTEST, qubetics_test);
		
		// newton_test
		EVMChainInfo newton_test = new EVMChainInfo(
				EVMChain.NEWTONTEST.toString(), 
				"Newton Finance Testnet", 
				26988L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Newton Finance Testnet Gas Token", "NEW", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://jp-rpc-testnet-newfi.newpay.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-testnet-newfi.newpay.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/26988");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.NEWTONTEST, newton_test);
		
		// aldchain_test
		EVMChainInfo aldchain_test = new EVMChainInfo(
				EVMChain.ALDCHAINTEST.toString(), 
				"ALDChain Testnet", 
				96737205180L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("ALDChain Testnet Gas Token", "ALD", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.aldrickb.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-explorer.aldrickb.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.aldrickb.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/96737205180");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ALDCHAINTEST, aldchain_test);
		
		// zephyr_test
		EVMChainInfo zephyr_test = new EVMChainInfo(
				EVMChain.ZEPHYRTEST.toString(), 
				"Zephyr Testnet", 
				1417429182L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Zephyr Testnet Gas Token", "Z", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://zephyr-rpc.eu-north-2.gateway.fm");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://zephyr-blockscout.eu-north-2.gateway.fm");
				}},
				new ArrayList<String>() {{
					this.add("https://zephyr-faucet.eu-north-2.gateway.fm");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1417429182");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZEPHYRTEST, zephyr_test);

		
		// the_test
		EVMChainInfo the_test = new EVMChainInfo(
				EVMChain.THETINGTEST.toString(), 
				"The Ting Blockchain Testnet Explorer", 
				6666689L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("The Ting Blockchain Testnet Explorer Gas Token", "Ton", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet.tingchain.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://tingscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/6666689");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.THETINGTEST, the_test);
		
		// recall_test
		EVMChainInfo recall_test = new EVMChainInfo(
				EVMChain.RECALLTEST.toString(), 
				"Recall Testnet", 
				2481632L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Recall Testnet Gas Token", "RECALL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://evm.v013.node-0.testnet.recall.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.recall.network");
				}},
				new ArrayList<String>() {{
					this.add("faucet.recall.network");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2481632");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.RECALLTEST, recall_test);
		
		// naga_test
		EVMChainInfo naga_test = new EVMChainInfo(
				EVMChain.NAGATEST.toString(), 
				"Naga Testnet", 
				1008686L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Naga Testnet Gas Token", "Naga", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.nagafintech.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.nagafintech.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1008686");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.NAGATEST, naga_test);
		
		// hetu_test
		EVMChainInfo hetu_test = new EVMChainInfo(
				EVMChain.HETUTEST.toString(), 
				"Hetu Testnet", 
				560000L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Hetu Testnet Gas Token", "tETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testchainv1.hetuscan.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testchainv1.hetuscan.com");
				}},
				new ArrayList<String>() {{
					this.add("https:/testchainv1.hetuscan.com");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/560000");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.HETUTEST, hetu_test);
		
		// wonder_test
		EVMChainInfo wonder_test = new EVMChainInfo(
				EVMChain.WONDERTEST.toString(), 
				"Wonder Testnet", 
				96371L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Wonder Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.wonderchain.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.wonderchain.org");
				}},
				new ArrayList<String>() {{
					this.add("https://wonderchain.org/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/96371");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.WONDERTEST, wonder_test);
		
		// somnia_test
		EVMChainInfo somnia_test = new EVMChainInfo(
				EVMChain.SOMNIATEST.toString(), 
				"Somnia Testnet", 
				50312L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Somnia Testnet Gas Token", "STT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://dream-rpc.somnia.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://somnia-testnet.socialscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/50312");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SOMNIATEST, somnia_test);
		
		// somnia_test
		EVMChainInfo somniadev_test = new EVMChainInfo(
				EVMChain.SOMNIADEVTEST.toString(), 
				"Somnia Devnet", 
				50311L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Somnia Devnet Gas Token", "STT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://dream-rpc.somnia.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://somnia-devnet.socialscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/50311");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SOMNIADEVTEST, somniadev_test);
		
		// carrchain_test
		EVMChainInfo carrchain_test = new EVMChainInfo(
				EVMChain.CARRCHAINTEST.toString(), 
				"Carrchain Testnet", 
				77652L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Carrchain Testnet Gas Token", "CARR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnetcarrchain.artiffine.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-testnetcarrchain.artiffine.com");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet-testnetcarrchain.artiffine.com");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/77652");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CARRCHAINTEST, carrchain_test);
		
		// nexera_test
		EVMChainInfo nexera_test = new EVMChainInfo(
				EVMChain.NEXERATEST.toString(), 
				"Nexera Testnet", 
				72080L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Nexera Testnet Gas Token", "tNXRA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.nexera.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.nexera.network");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/72080");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.NEXERATEST, nexera_test);
		
		// treasure_test
		EVMChainInfo treasure_test = new EVMChainInfo(
				EVMChain.TREASURETEST.toString(), 
				"Treasure Ruby", 
				978657L, 
				BlockchainType.BORKED.toString(),
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
		networks.put(EVMChain.TREASURETEST, treasure_test);
		
		// graphite_test
		EVMChainInfo graphite_test = new EVMChainInfo(
				EVMChain.GRAPHITETEST.toString(), 
				"Graphite Testnet", 
				54170L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Graphite Testnet Gas Token", "@G", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://anon-entrypoint-test-1.atgraphite.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://test.atgraphite.com");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.atgraphite.com/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/54170");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.GRAPHITETEST, graphite_test);
		
		// stb_test
		EVMChainInfo stb_test = new EVMChainInfo(
				EVMChain.STBTEST.toString(), 
				"STB Testnet", 
				50505L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("STB Testnet Gas Token", "STB", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.quorum.sps.dev.kode.ru/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.quorum.sps.dev.kode.ru");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/50505");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.STBTEST, stb_test);


		
		// wmc_test
		EVMChainInfo wmc_test = new EVMChainInfo(
				EVMChain.WMCTEST.toString(), 
				"WMC Testnet", 
				42070L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("WMC Testnet Gas Token", "WMTx", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet-base.worldmobile.net");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-testnet-base.worldmobile.net");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet-testnet-base.worldmobile.net");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/42070");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.WMCTEST, wmc_test);
		
		// fluent_test
		EVMChainInfo fluent_test = new EVMChainInfo(
				EVMChain.FLUENTTEST.toString(), 
				"Fluent Developer Preview", 
				20993L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Fluent Developer Preview Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.dev.gblend.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://blockscout.dev.gblend.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.dev.gblend.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/20993");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FLUENTTEST, fluent_test);
		
		// inevm_test
		EVMChainInfo inevm_test = new EVMChainInfo(
				EVMChain.INEVMTEST.toString(), 
				"inEVM Testnet", 
				2424L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("inEVM Testnet Gas Token", "INJ", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet.rpc.inevm.com/http");
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
					this.add("https://chainlist.org/chain/2424");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.INEVMTEST, inevm_test);
		
		// chain_test
		EVMChainInfo chain_test = new EVMChainInfo(
				EVMChain.CHAINTEST.toString(), 
				"Chain Opera Testnet", 
				10066L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Chain Opera Testnet Gas Token", "CO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("http://40.78.123.6:8545");
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
					this.add("https://chainlist.org/chain/10066");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CHAINTEST, chain_test);
		
		// exorium_test
		EVMChainInfo exorium_test = new EVMChainInfo(
				EVMChain.EXORIUMTEST.toString(), 
				"Exorium Testnet", 
				7957L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Exorium Testnet Gas Token", "tEXOR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-1-testnet.exorium.net");
					this.add("https://rpc-2-testnet.exorium.net");
					this.add("https://rpc-testnet.exoscan.net/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.exoscan.net");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet-testnet.exorium.net");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/7957");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.EXORIUMTEST, exorium_test);
		
		// pandasea_test
		EVMChainInfo pandasea_test = new EVMChainInfo(
				EVMChain.PANDASEATEST.toString(), 
				"PandaSea Testnet", 
				7770L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("PandaSea Testnet Gas Token", "PANDA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.pandasea.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://test.pandaseascan.com");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.pandasea.io");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/7770");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PANDASEATEST, pandasea_test);

		
		// initverse_test
		EVMChainInfo initverse_test = new EVMChainInfo(
				EVMChain.INITVERSETEST.toString(), 
				"InitVerse genesis testnet", 
				7234L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("InitVerse genesis testnet Gas Token", "INI", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("http://rpc-testnet.inichain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://genesis-testnet.iniscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/7234");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.INITVERSETEST, initverse_test);
		
		// xyl_test
		EVMChainInfo xyl_test = new EVMChainInfo(
				EVMChain.XYLTEST.toString(), 
				"XYL TestNet", 
				6934L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("XYL TestNet Gas Token", "XYL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://xyl-testnet.glitch.me/rpc/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://debxylen.github.io/BlockExplorer");
				}},
				new ArrayList<String>() {{
					this.add("https://debxylen.github.io/XYL_TestNet/faucet.html");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/6934");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.XYLTEST, xyl_test);
		
		// matr1x_test
		EVMChainInfo matr1x_test = new EVMChainInfo(
				EVMChain.MATR1XTEST.toString(), 
				"Matr1x Testnet", 
				88866L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Matr1x Testnet Gas Token", "MAX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.m1chain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-scan.m1chain.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/88866");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MATR1XTEST, matr1x_test);
		
		return networks;

	}

}
