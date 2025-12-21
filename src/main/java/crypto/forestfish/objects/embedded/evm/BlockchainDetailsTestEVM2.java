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
	
		// celes_test
		EVMChainInfo celes_test = new EVMChainInfo(
				EVMChain.CELESTEST.toString(), 
				"Celes Testnet", 
				22225L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Celes Testnet Gas Token", "CLES", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.celeschain.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-explorer.celeschain.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/22225");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CELESTEST, celes_test);
		
		// dogeos_test
		EVMChainInfo dogeos_test = new EVMChainInfo(
				EVMChain.DOGEOSTEST.toString(), 
				"DogeOS Chikyū Testnet", 
				6281971L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("DogeOS Chikyū Testnet Gas Token", "DOGE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.dogeos.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://blockscout.testnet.dogeos.com");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.testnet.dogeos.com");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/6281971");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DOGEOSTEST, dogeos_test);
		
		// iic_test
		EVMChainInfo iic_test = new EVMChainInfo(
				EVMChain.IICTEST.toString(), 
				"IIC Blockchain Testnet", 
				1650L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("IIC Blockchain Testnet Gas Token", "SAYA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.iic-blockchain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.iic-blockchain.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1650");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.IICTEST, iic_test);
		
		// stable_test
		EVMChainInfo stable_test = new EVMChainInfo(
				EVMChain.STABLETEST.toString(), 
				"Stable Testnet", 
				2201L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Stable Testnet Gas Token", "gUSDT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.stable.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.stablescan.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.stable.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2201");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.STABLETEST, stable_test);
		
		// quantum_test
		EVMChainInfo quantum_test = new EVMChainInfo(
				EVMChain.QUANTUMTEST.toString(), 
				"Quantum Sharded Network Testnet", 
				99991L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Quantum Sharded Network Testnet Gas Token", "tQSN", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://node.qsnchain.com/testnet/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://qsnscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/99991");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.QUANTUMTEST, quantum_test);
		
		// alpha_test
		EVMChainInfo alpha_test = new EVMChainInfo(
				EVMChain.ALPHATEST.toString(), 
				"Alpha Chain Testnet", 
				511111L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Alpha Chain Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.goalpha.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-scan.goalpha.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/511111");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ALPHATEST, alpha_test);
		
		// world_test
		EVMChainInfo world_test = new EVMChainInfo(
				EVMChain.WORLDMOBILETEST.toString(), 
				"World Mobile Chain Testnet", 
				323432L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("World Mobile Chain Testnet Gas Token", "WOMOX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://worldmobile-testnet.g.alchemy.com/public");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-explorer.worldmobile.net");
				}},
				new ArrayList<String>() {{
					this.add("https://testnet-faucet.worldmobile.net");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/323432");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.WORLDMOBILETEST, world_test);

		// codex_test
		EVMChainInfo codex_test = new EVMChainInfo(
				EVMChain.CODEXTEST.toString(), 
				"Codex Testnet", 
				812242L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Codex Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.codex-stg.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.codex-stg.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/812242");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CODEXTEST, codex_test);
		
		// taikohoodi_test
		EVMChainInfo taikohoodi_test = new EVMChainInfo(
				EVMChain.TAIKOHOODITEST.toString(), 
				"Taiko Hoodi", 
				167013L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Taiko Hoodi Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.hoodi.taiko.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://hoodi.taikoscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/167013");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TAIKOHOODITEST, taikohoodi_test);
		
		// cpchain_test
		EVMChainInfo cpchain_test = new EVMChainInfo(
				EVMChain.CPCHAINTEST.toString(), 
				"CpChain Testnet", 
				86606L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("CpChain Testnet Gas Token", "CP", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.cpchain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-testnet.cpchain.com");
				}},
				new ArrayList<String>() {{
					this.add("https://cpchain-test.pages.dev/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/86606");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CPCHAINTEST, cpchain_test);
		
		// tempo_test
		EVMChainInfo tempo_test = new EVMChainInfo(
				EVMChain.TEMPOTEST.toString(), 
				"Tempo Testnet", 
				42429L, 
				BlockchainType.BORKED.toString(), // native tx not supported
				new EVMCurrency("Tempo Testnet Gas Token", "USD", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.tempo.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.tempo.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://docs.tempo.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/42429");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TEMPOTEST, tempo_test);
		
		// wirex_test
		EVMChainInfo wirex_test = new EVMChainInfo(
				EVMChain.WIREXTEST.toString(), 
				"Wirex Pay Testnet", 
				1001996L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Wirex Pay Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-dev.wirexpaychain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-dev.wirexpaychain.com");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet-dev.wirexpaychain.com");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1001996");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.WIREXTEST, wirex_test);
		
		// recordercoin_test
		EVMChainInfo recordercoin_test = new EVMChainInfo(
				EVMChain.RECORDERCOINTEST.toString(), 
				"RecorderCoin Testnet", 
				18882L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("RecorderCoin Testnet Gas Token", "tRECR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.recordercoin.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-testnet.recordercoin.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/18882");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.RECORDERCOINTEST, recordercoin_test);
		
		// etherlink_test
		EVMChainInfo etherlink_test = new EVMChainInfo(
				EVMChain.ETHERLINKTEST.toString(), 
				"Etherlink Shadownet Testnet", 
				127823L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Etherlink Shadownet Testnet Gas Token", "XTZ", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://node.shadownet.etherlink.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://shadownet.explorer.etherlink.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/127823");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ETHERLINKTEST, etherlink_test);
		
		// xo_test
		EVMChainInfo xo_test = new EVMChainInfo(
				EVMChain.XOTEST.toString(), 
				"XO Chain Testnet", 
				1000101L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("XO Chain Testnet Gas Token", "XO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc-1.xo.market");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-testnet.xo.market");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1000101");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.XOTEST, xo_test);
		
		// potos_test
		EVMChainInfo potos_test = new EVMChainInfo(
				EVMChain.POTOSTEST.toString(), 
				"POTOS Testnet", 
				60600L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("POTOS Testnet Gas Token", "POT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.potos.hk");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan-testnet.potos.hk");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet-testnet.potos.hk");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/60600");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.POTOSTEST, potos_test);
		
		// redbelly_test
		EVMChainInfo redbelly_test = new EVMChainInfo(
				EVMChain.REDBELLYTEST.toString(), 
				"Redbelly Network Testnet", 
				153L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Redbelly Network Testnet Gas Token", "RBNT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://governors.testnet.redbelly.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://redbelly.testnet.routescan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/153");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.REDBELLYTEST, redbelly_test);
		
		// jasmy_test
		EVMChainInfo jasmy_test = new EVMChainInfo(
				EVMChain.JASMYTEST.toString(), 
				"JASMY Chain Testnet", 
				681L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("JASMY Chain Testnet Gas Token", "JASMY", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://jasmy-chain-testnet.alt.technology");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://jasmy-chain-testnet-explorer.alt.technology");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.janction.ai");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/681");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.JASMYTEST, jasmy_test);
		
		// watr_test
		EVMChainInfo watr_test = new EVMChainInfo(
				EVMChain.WATRTEST.toString(), 
				"Watr Testnet", 
				92870L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Watr Testnet Gas Token", "WATR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.watr.org/ext/bc/2ZZiR6T2sJjebQguABb53rRpzme8zfK4R9zt5vMM8MX1oUm3g/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.watr.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/92870");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.WATRTEST, watr_test);
		
		// autonomys_test
		EVMChainInfo autonomys_test2 = new EVMChainInfo(
				EVMChain.AUTONOMYSCHRONOSTEST.toString(), 
				"Autonomys Chronos Testnet", 
				8700L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Autonomys Chronos Testnet Gas Token", "tAI3", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://auto-evm.chronos.autonomys.xyz/ws");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.auto-evm.chronos.autonomys.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://autonomysfaucet.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/8700");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.AUTONOMYSCHRONOSTEST, autonomys_test2);
		
		// haqqsepolia_test
		EVMChainInfo haqqsepolia_test = new EVMChainInfo(
				EVMChain.HAQQSEPOLIATEST.toString(), 
				"HAQQ Testethiq (L2 Sepolia Testnet)", 
				853211L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("HAQQ Testethiq (L2 Sepolia Testnet) Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testethiq.haqq.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testethiq.haqq.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/853211");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.HAQQSEPOLIATEST, haqqsepolia_test);
		
		// zilliqa_test
		EVMChainInfo zilliqa_test1 = new EVMChainInfo(
				EVMChain.ZILLIQATEST.toString(), 
				"Zilliqa 2 Testnet", 
				33101L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Zilliqa 2 Testnet Gas Token", "ZIL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://api.testnet.zilliqa.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.zilliqa.blockscout.com");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.testnet.zilliqa.com");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/33101");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZILLIQATEST, zilliqa_test1);
		
		// zilliqa_test
		EVMChainInfo zilliqa_test = new EVMChainInfo(
				EVMChain.ZILLIQA33469TEST.toString(), 
				"Zilliqa 2 Devnet", 
				33469L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Zilliqa 2 Devnet Gas Token", "ZIL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://api.zq2-devnet.zilliqa.com");
					this.add("https://api.testnet.zilliqa.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://otterscan.zq2-devnet.zilliqa.com");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.zq2-devnet.zilliqa.com");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/33469");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZILLIQA33469TEST, zilliqa_test);
		
		// hashfire_test
		EVMChainInfo hashfire_test = new EVMChainInfo(
				EVMChain.HASHFIRETEST.toString(), 
				"Hashfire Testnet", 
				4227L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Hashfire Testnet Gas Token", "HASHD", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/hashfire/testnet/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://subnets-test.avax.network/hashfire/");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/4227");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.HASHFIRETEST, hashfire_test);
		
		
		
		// lightchainai_test
		EVMChainInfo lightchainai_test = new EVMChainInfo(
				EVMChain.LIGHTCHAINAITEST.toString(), 
				"LightchainAI Testnet", 
				504L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("LightchainAI Testnet Gas Token", "LCAI", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://light-testnet-rpc.lightchain.ai");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.lightscan.app");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/504");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.LIGHTCHAINAITEST, lightchainai_test);
		
		// propulence_test
		EVMChainInfo propulence_test = new EVMChainInfo(
				EVMChain.PROPULENCETEST.toString(), 
				"Propulence Testnet", 
				202500L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Propulence Testnet Gas Token", "PROPX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.thepropulence.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.thepropulence.com");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.testnet.thepropulence.com");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/202500");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PROPULENCETEST, propulence_test);
		
		// realchain_test
		EVMChainInfo realchain_test = new EVMChainInfo(
				EVMChain.REALCHAINTEST.toString(), 
				"RealChain Testnet", 
				2098L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("RealChain Testnet Gas Token", "RT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rlc.devlab.vip/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://rlc.devlab.vip/");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2098");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.REALCHAINTEST, realchain_test);
		
		// juchain_test
		EVMChainInfo juchain_test = new EVMChainInfo(
				EVMChain.JUCHAINTEST.toString(), 
				"JuChain Testnet", 
				202599L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("JuChain Testnet Gas Token", "JU", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.juchain.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.juscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/202599");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.JUCHAINTEST, juchain_test);
		
		// sonic_test
		EVMChainInfo sonic_test = new EVMChainInfo(
				EVMChain.SONICTEST.toString(), 
				"Sonic Testnet", 
				14601L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Sonic Testnet Gas Token", "S", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.soniclabs.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.soniclabs.com");
				}},
				new ArrayList<String>() {{
					this.add("https://testnet.soniclabs.com/account");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/14601");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SONICTEST, sonic_test);
		
		// vflow_test
		EVMChainInfo vflow_test = new EVMChainInfo(
				EVMChain.VFLOWTEST.toString(), 
				"VFlow Volta Testnet", 
				1409L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("VFlow Volta Testnet Gas Token", "tVFY", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://vflow-volta-rpc.zkverify.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://vflow-testnet.subscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1409");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.VFLOWTEST, vflow_test);
		
		// intuition_test
		EVMChainInfo intuition_test = new EVMChainInfo(
				EVMChain.INTUITIONTEST.toString(), 
				"Intuition Testnet", 
				13579L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Intuition Testnet Gas Token", "TTRUST", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet.rpc.intuition.systems");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.explorer.intuition.systems");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/13579");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.INTUITIONTEST, intuition_test);
		
		// ethereal_test
		EVMChainInfo ethereal_test = new EVMChainInfo(
				EVMChain.ETHEREALTEST.toString(), 
				"Ethereal Testnet", 
				13374202L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Ethereal Testnet Gas Token", "USDe", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.etherealtest.net");
					this.add("https://rpc-ethereal-testnet-0.t.conduit.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.etherealtest.net");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/13374202");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ETHEREALTEST, ethereal_test);
		
		// roonchain_test
		EVMChainInfo roonchain_test = new EVMChainInfo(
				EVMChain.ROONCHAINTEST.toString(), 
				"RoonChain Testnet", 
				13145201L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("RoonChain Testnet Gas Token", "ROON", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.roonchain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnets.roonchain.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/13145201");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ROONCHAINTEST, roonchain_test);
		
		// ecm_test
		EVMChainInfo ecm_test = new EVMChainInfo(
				EVMChain.ECMTEST.toString(), 
				"ECM Chain Testnet", 
				1124L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("ECM Chain Testnet Gas Token", "ECM", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.ecmscan.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.ecmscan.io/");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.testnet.ecmscan.io/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1124");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ECMTEST, ecm_test);

		
		// awakening_test
		EVMChainInfo awakening_test = new EVMChainInfo(
				EVMChain.AWAKENINGTEST.toString(), 
				"Awakening Testnet", 
				1043L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Awakening Testnet Gas Token", "BDAG", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.awakening.bdagscan.com");
					this.add("https://relay.awakening.bdagscan.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://awakening.bdagscan.com/");
				}},
				new ArrayList<String>() {{
					this.add("https://awakening.bdagscan.com/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1043");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.AWAKENINGTEST, awakening_test);
		
		// ozone_test
		EVMChainInfo ozone_test = new EVMChainInfo(
				EVMChain.OZONETEST.toString(), 
				"Ozone Testnet", 
				10120L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Ozone Testnet Gas Token", "tOZONE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.ozonescan.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.ozonescan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/10120");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.OZONETEST, ozone_test);
		
		// nitrograph_test
		EVMChainInfo nitrograph_test = new EVMChainInfo(
				EVMChain.NITROGRAPHTEST.toString(), 
				"NitroGraph Testnet", 
				200024L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("NitroGraph Testnet Gas Token", "NOS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.nitrograph.foundation");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-testnet.nitrograph.foundation");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet-testnet.nitrograph.foundation");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/200024");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.NITROGRAPHTEST, nitrograph_test);

		
		// doma_test
		EVMChainInfo doma_test = new EVMChainInfo(
				EVMChain.DOMATEST.toString(), 
				"Doma Testnet", 
				97476L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Doma Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.doma.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-testnet.doma.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/97476");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DOMATEST, doma_test);
		
		// kasplex_test
		EVMChainInfo kasplex_test = new EVMChainInfo(
				EVMChain.KASPLEXTEST.toString(), 
				"Kasplex zkEVM Testnet", 
				167012L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Kasplex zkEVM Testnet Gas Token", "KAS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.kasplextest.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.kasplextest.xyz/");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/167012");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.KASPLEXTEST, kasplex_test);
		
		// igra_test
		EVMChainInfo igra_test = new EVMChainInfo(
				EVMChain.IGRATEST.toString(), 
				"Igra Caravel Testnet", 
				19416L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Igra Caravel Testnet Gas Token", "IGRA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://caravel.igralabs.com:8545");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.caravel.igralabs.com/");
				}},
				new ArrayList<String>() {{
					this.add("https://igra-faucet-ec24dbd67d05.herokuapp.com");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/19416");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.IGRATEST, igra_test);
		
		// hppsepolia_test
		EVMChainInfo hppsepolia_test = new EVMChainInfo(
				EVMChain.HPPSEPOLIATEST.toString(), 
				"HPP Sepolia", 
				181228L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("HPP Sepolia Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://sepolia.hpp.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sepolia-explorer.hpp.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/181228");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.HPPSEPOLIATEST, hppsepolia_test);
		
		// quai_test
		EVMChainInfo quai_test = new EVMChainInfo(
				EVMChain.QUAITEST.toString(), 
				"Quai Network Testnet", 
				15000L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Quai Network Testnet Gas Token", "QUAI", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://orchard.rpc.quai.network/cyprus1");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://orchard.quaiscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/15000");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.QUAITEST, quai_test);
		
		// injective_test
		EVMChainInfo injective_test = new EVMChainInfo(
				EVMChain.INJECTIVETEST.toString(), 
				"Injective Testnet", 
				1439L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Injective Testnet Gas Token", "INJ", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://injectiveevm-testnet-rpc.polkachu.com");
					this.add("https://k8s.testnet.json-rpc.injective.network");
					this.add("https://testnet.sentry.chain.json-rpc.injective.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.blockscout.injective.network");
				}},
				new ArrayList<String>() {{
					this.add("https://testnet.faucet.injective.network");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1439");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.INJECTIVETEST, injective_test);
		
		// jovaysepolia_test
		EVMChainInfo jovaysepolia_test = new EVMChainInfo(
				EVMChain.JOVAYSEPOLIATEST.toString(), 
				"Jovay Sepolia Testnet", 
				2019775L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Jovay Sepolia Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://api.zan.top/public/jovay-testnet");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sepolia-explorer.jovay.io/l2");
				}},
				new ArrayList<String>() {{
					this.add("https://zan.top/faucet/jovay");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2019775");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.JOVAYSEPOLIATEST, jovaysepolia_test);
		

		// giwasepolia_test
		EVMChainInfo giwasepolia_test = new EVMChainInfo(
				EVMChain.GIWASEPOLIATEST.toString(), 
				"GIWA Sepolia Testnet", 
				91342L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("GIWA Sepolia Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://sepolia-rpc.giwa.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sepolia-explorer.giwa.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.giwa.io");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/91342");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.GIWASEPOLIATEST, giwasepolia_test);
		
		// ZEROggalileo_test
		EVMChainInfo ZEROggalileo_test = new EVMChainInfo(
				EVMChain.ZEROGGALILEOTEST.toString(), 
				"0G-Testnet-Galileo", 
				16602L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("0G-Testnet-Galileo Gas Token", "0G", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://evmrpc-testnet.0g.ai");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://chainscan-galileo.0g.ai");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.0g.ai");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/16602");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZEROGGALILEOTEST, ZEROggalileo_test);
		
		// ZEROggalileo_test
		EVMChainInfo ZEROggalileo16601_test = new EVMChainInfo(
				EVMChain.ZEROGGALILEO16601TEST.toString(), 
				"0G-Galileo-Testnet", 
				16601L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("0G-Galileo-Testnet Gas Token", "A0GI", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://evmrpc-testnet.0g.ai");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://chainscan-galileo.0g.ai");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.0g.ai");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/16601");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZEROGGALILEO16601TEST, ZEROggalileo16601_test);
		
		// celosepolia_test
		EVMChainInfo celosepolia_test = new EVMChainInfo(
				EVMChain.CELOSEPOLIATEST.toString(), 
				"Celo Sepolia Testnet", 
				11142220L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Celo Sepolia Testnet Gas Token", "CELO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://forno.celo-sepolia.celo-testnet.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://celo-sepolia.blockscout.com");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.celo.org");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/11142220");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CELOSEPOLIATEST, celosepolia_test);
		
		// sovasepolia_test
		EVMChainInfo sovasepolia_test = new EVMChainInfo(
				EVMChain.SOVASEPOLIATEST.toString(), 
				"Sova Sepolia Testnet", 
				120893L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Sova Sepolia Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.sova.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.sova.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/120893");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SOVASEPOLIATEST, sovasepolia_test);
		
		// lumia_test
		EVMChainInfo lumia_test = new EVMChainInfo(
				EVMChain.LUMIABEAMTEST.toString(), 
				"Lumia Beam Testnet", 
				2030232745L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Lumia Beam Testnet Gas Token", "LUMIA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://beam-rpc.lumia.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://beam-explorer.lumia.org");
				}},
				new ArrayList<String>() {{
					this.add("https://beam-faucet.lumia.org/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2030232745");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.LUMIABEAMTEST, lumia_test);
		
		// humanity_test
		EVMChainInfo humanity_test = new EVMChainInfo(
				EVMChain.HUMANITYTEST.toString(), 
				"Humanity Protocol testnet", 
				7080969L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Humanity Protocol testnet Gas Token", "tHP", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.humanity.org");
					this.add("https://humanity-testnet.g.alchemy.com/public");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://humanity-testnet.explorer.alchemy.com");
				}},
				new ArrayList<String>() {{
					this.add("https://faucets.alchemy.com/faucets/humanity-testnet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/7080969");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.HUMANITYTEST, humanity_test);
		
		// eni_test
		EVMChainInfo eni_test = new EVMChainInfo(
				EVMChain.ENITEST.toString(), 
				"ENI Testnet", 
				6912115L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("ENI Testnet Gas Token", "ENI", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.eniac.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan-testnet.eniac.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/6912115");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ENITEST, eni_test);
		
		// tatara_test
		EVMChainInfo tatara_test = new EVMChainInfo(
				EVMChain.TATARATEST.toString(), 
				"Tatara Testnet", 
				129399L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Tatara Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.tatara.katanarpc.com/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.tatara.katana.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/129399");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TATARATEST, tatara_test);
		
		// rome_test
		EVMChainInfo rome_test = new EVMChainInfo(
				EVMChain.ROMECAELIANTEST.toString(), 
				"Rome Testnet Caelian", 
				121215L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Rome Testnet Caelian Gas Token", "RSOL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://caelian-i.testnet.romeprotocol.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://romescout-caelian-i.testnet.romeprotocol.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://deposit.testnet.romeprotocol.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/121215");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ROMECAELIANTEST, rome_test);

		
		// rome_test
		EVMChainInfo rome_test3 = new EVMChainInfo(
				EVMChain.ROMEMARTIUSTEST.toString(), 
				"Rome Testnet Martius", 
				121214L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Rome Testnet Martius Gas Token", "RSOL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://martius-i.testnet.romeprotocol.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://romescout-martius-i.testnet.romeprotocol.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://deposit.testnet.romeprotocol.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/121214");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ROMEMARTIUSTEST, rome_test3);
		
		// rome_test
		EVMChainInfo rome_test2 = new EVMChainInfo(
				EVMChain.ROMESUBURATEST.toString(), 
				"Rome Devnet Subura", 
				121213L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Rome Devnet Subura Gas Token", "RSOL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://subura-i.devnet.romeprotocol.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://romescout-subura-i.devnet.romeprotocol.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://deposit.devnet.romeprotocol.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/121213");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ROMESUBURATEST, rome_test2);
		
		// rome_test
		EVMChainInfo rome_test1 = new EVMChainInfo(
				EVMChain.ROMEESQUILINETEST.toString(), 
				"Rome Devnet Esquiline", 
				121212L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Rome Devnet Esquiline Gas Token", "RSOL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://esquiline-i.devnet.romeprotocol.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://romescout-esquiline-i.devnet.romeprotocol.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://deposit.devnet.romeprotocol.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/121212");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ROMEESQUILINETEST, rome_test1);
		
		// polynomialsepolia_test
		EVMChainInfo polynomialsepolia_test = new EVMChainInfo(
				EVMChain.POLYNOMIALSEPOLIATEST.toString(), 
				"Polynomial Sepolia", 
				80008L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Polynomial Sepolia Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.sepolia.polynomial.fi");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sepolia.polynomialscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/80008");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.POLYNOMIALSEPOLIATEST, polynomialsepolia_test);
		
		// arenaz_test
		EVMChainInfo arenaz_test = new EVMChainInfo(
				EVMChain.ARENAZTEST.toString(), 
				"Arena-Z-Testnet", 
				9899L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Arena-Z-Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.arena-z.gg");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-explorer.arena-z.gg");
				}},
				new ArrayList<String>() {{
					this.add("https://testnet-faucet.arena-z.gg");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/9899");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ARENAZTEST, arenaz_test);
		
		// trex_test
		EVMChainInfo trex_test = new EVMChainInfo(
				EVMChain.TREXTEST.toString(), 
				"T-Rex Testnet", 
				1962L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("T-Rex Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnetrpc.trex.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.trex.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1962");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TREXTEST, trex_test);
		
		// deinfra_test
		EVMChainInfo deinfra_test = new EVMChainInfo(
				EVMChain.DEINFRATEST.toString(), 
				"DeInfra Devnet3", 
				1000000003L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("DeInfra Devnet3 Gas Token", "dSK", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://c3n1.thepower.io:1446/jsonrpc");
					this.add("https://c3n1.thepower.io/jsonrpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://bs.thepower.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.thepower.io/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1000000003");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DEINFRATEST, deinfra_test);
		
		// plasma_test
		EVMChainInfo plasma_test = new EVMChainInfo(
				EVMChain.PLASMATEST.toString(), 
				"Plasma Testnet", 
				9746L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Plasma Testnet Gas Token", "tXPL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://ultra-quick-paper.plasma-testnet.quiknode.pro");
					this.add("https://testnet-rpc.plasma.to");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://plasma.gas.zip");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/9746");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PLASMATEST, plasma_test);
		
		// realio_test
		EVMChainInfo realio_test = new EVMChainInfo(
				EVMChain.REALIOTEST.toString(), 
				"Realio Testnet", 
				3300L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Realio Testnet Gas Token", "RIO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://json-rpc.realiostage.network");
					this.add("https://realio-testnet.json-rpc.decentrio.ventures");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.realiostage.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/3300");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.REALIOTEST, realio_test);
		
		// tacsaintpetersburg_test
		EVMChainInfo tacsaintpetersburg_test = new EVMChainInfo(
				EVMChain.TACSAINTPETERSBURGTEST.toString(), 
				"TAC Saint Petersburg", 
				2391L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("TAC Saint Petersburg Gas Token", "TAC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://spb.rpc.tac.build");
					this.add("https://rpc.ankr.com/tac_spb");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://spb.explorer.tac.build");
				}},
				new ArrayList<String>() {{
					this.add("https://spb.faucet.tac.build/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2391");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TACSAINTPETERSBURGTEST, tacsaintpetersburg_test);
		
		// r5_test
		EVMChainInfo r5_test = new EVMChainInfo(
				EVMChain.R5TEST.toString(), 
				"R5 Network Testnet", 
				33710L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("R5 Network Testnet Gas Token", "TR5", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.r5.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-testnet.r5.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/33710");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.R5TEST, r5_test);

		// ethereumhoodi_test
		EVMChainInfo ethereumhoodi_test = new EVMChainInfo(
				EVMChain.ETHEREUMHOODITEST.toString(), 
				"Ethereum Hoodi", 
				560048L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Ethereum Hoodi Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.hoodi.ethpandaops.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://light-hoodi.beaconcha.in");
				}},
				new ArrayList<String>() {{
					this.add("https://hoodi-faucet.pk910.de/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/560048");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ETHEREUMHOODITEST, ethereumhoodi_test);

		// rise_test
		EVMChainInfo rise_test = new EVMChainInfo(
				EVMChain.RISETEST.toString(), 
				"RISE Testnet", 
				11155931L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("RISE Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet.riselabs.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.riselabs.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.testnet.riselabs.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/11155931");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.RISETEST, rise_test);
		
		// mezo_test
		EVMChainInfo mezo_test = new EVMChainInfo(
				EVMChain.MEZOTEST.toString(), 
				"Mezo Testnet", 
				31611L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Mezo Testnet Gas Token", "BTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.test.mezo.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.test.mezo.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/31611");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MEZOTEST, mezo_test);
		
		// helios_test
		EVMChainInfo helios_test = new EVMChainInfo(
				EVMChain.HELIOSTEST.toString(), 
				"Helios Chain Testnet", 
				42000L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Helios Chain Testnet Gas Token", "HLS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet1.helioschainlabs.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.helioschainlabs.org");
				}},
				new ArrayList<String>() {{
					this.add("https://testnet.helioschain.network");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/42000");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.HELIOSTEST, helios_test);
		
		// teasepolia_test
		EVMChainInfo teasepolia_test = new EVMChainInfo(
				EVMChain.TEASEPOLIATEST.toString(), 
				"Tea Sepolia Testnet", 
				10218L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Tea Sepolia Testnet Gas Token", "TEA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://tea-sepolia.g.alchemy.com/public");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sepolia.tea.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet-sepolia.tea.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/10218");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TEASEPOLIATEST, teasepolia_test);
		
		// shardeum_test
		EVMChainInfo shardeum_test = new EVMChainInfo(
				EVMChain.SHARDEUMTEST.toString(), 
				"Shardeum Testnet", 
				8083L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Shardeum Testnet Gas Token", "SHM", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://api-testnet.shardeum.org/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-testnet.shardeum.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/8083");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SHARDEUMTEST, shardeum_test);
		
		// kii_test
		EVMChainInfo kii_test = new EVMChainInfo(
				EVMChain.KIIOROTEST.toString(), 
				"Kii Testnet Oro", 
				1336L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Kii Testnet Oro Gas Token", "KII", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://json-rpc.uno.sentry.testnet.v3.kiivalidator.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.kiichain.io/testnet");
				}},
				new ArrayList<String>() {{
					this.add("https://explorer.kiichain.io/testnet/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1336");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.KIIOROTEST, kii_test);
		
		// reddio_test
		EVMChainInfo reddio_test = new EVMChainInfo(
				EVMChain.REDDIOTEST.toString(), 
				"Reddio Testnet", 
				50341L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Reddio Testnet Gas Token", "RDO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://reddio-dev.reddio.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://reddio-devnet.l2scan.co");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/50341");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.REDDIOTEST, reddio_test);
		
		// b20_test
		EVMChainInfo b20_test = new EVMChainInfo(
				EVMChain.B20TEST.toString(), 
				"B20 Testnet", 
				223344L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("B20 Testnet Gas Token", "TBOC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.beonescan.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://beonescan.com");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.beonechain.com/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/223344");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.B20TEST, b20_test);
		
		// winr_test
		EVMChainInfo winr_test = new EVMChainInfo(
				EVMChain.WINRTEST.toString(), 
				"Winr Protocol Testnet", 
				66666666L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Winr Protocol Testnet Gas Token", "WINR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-devnet.winr.games");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-winrprotocoltestnet-wmwv59m23g.t.conduit.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/66666666");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.WINRTEST, winr_test);
		
		// skalesepolia_test
		EVMChainInfo skalesepolia_test = new EVMChainInfo(
				EVMChain.SKALESEPOLIATEST.toString(), 
				"SKALE Base Sepolia", 
				324705682L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("SKALE Base Sepolia Gas Token", "CREDIT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://base-sepolia-testnet.skalenodes.com/v1/jubilant-horrible-ancha");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://base-sepolia-testnet-explorer.skalenodes.com");
				}},
				new ArrayList<String>() {{
					this.add("http://base-sepolia-faucet.skale.space");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/324705682");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SKALESEPOLIATEST, skalesepolia_test);
		
		// platon_test
		EVMChainInfo platon_test = new EVMChainInfo(
				EVMChain.PLATONTEST.toString(), 
				"PlatON Dev Testnet", 
				20250407L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("PlatON Dev Testnet Gas Token", "lat", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://devnet3openapi.platon.network/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://devnet3scan.platon.network");
				}},
				new ArrayList<String>() {{
					this.add("https://devnet3faucet.platon.network/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/20250407");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PLATONTEST, platon_test);
		
		// xrpl_test
		EVMChainInfo xrpl_devtest = new EVMChainInfo(
				EVMChain.XRPLDEVTEST.toString(), 
				"XRPL EVM Sidechain Devnet", 
				1440002L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("XRPL EVM Sidechain Devnet Gas Token", "XRP", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.xrplevm.org");
					this.add("https://rpc.devnet.xrplevm.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.xrplevm.org");
				}},
				new ArrayList<String>() {{
					this.add("https://chains.tools/faucet/xrplevm");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1440002");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.XRPLDEVTEST, xrpl_devtest);
		
		// xrpl_test
		EVMChainInfo xrpl_test = new EVMChainInfo(
				EVMChain.XRPLTEST.toString(), 
				"XRPL EVM Sidechain Testnet", 
				1449000L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("XRPL EVM Sidechain Testnet Gas Token", "XRP", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.xrplevm.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.xrplevm.org");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.xrplevm.org");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1449000");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.XRPLTEST, xrpl_test);
		
		// hoodi_test
		EVMChainInfo hoodi_test = new EVMChainInfo(
				EVMChain.HOODITEST.toString(), 
				"Hoodi testnet", 
				560048L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Hoodi testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.hoodi.ethpandaops.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://light-hoodi.beaconcha.in");
				}},
				new ArrayList<String>() {{
					this.add("https://hoodi-faucet.pk910.de/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/560048");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.HOODITEST, hoodi_test);
		
		// megaeth_test
		EVMChainInfo megaeth_test = new EVMChainInfo(
				EVMChain.MEGAETHTEST.toString(), 
				"MegaETH Testnet", 
				6342L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("MegaETH Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://carrot.megaeth.com/rpc");
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
					this.add("https://chainlist.org/chain/6342");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MEGAETHTEST, megaeth_test);
		
		// perennialsepolia_test
		EVMChainInfo perennialsepolia_test = new EVMChainInfo(
				EVMChain.PERENNIALSEPOLIATEST.toString(), 
				"Perennial Sepolia", 
				60850L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Perennial Sepolia Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-sepolia.perennial.foundation");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-sepolia.perennial.foundation");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/60850");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PERENNIALSEPOLIATEST, perennialsepolia_test);
		
		// qubetics_test
		EVMChainInfo qubetics_test = new EVMChainInfo(
				EVMChain.QUBETICSTEST.toString(), 
				"Qubetics Testnet", 
				9029L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Qubetics Testnet Gas Token", "TICS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.qubetics.work/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.qubetics.work");
				}},
				new ArrayList<String>() {{
					this.add("https://testnet.qubetics.work/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/9029");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.QUBETICSTEST, qubetics_test);
		
		// edge_test
		EVMChainInfo edge_test = new EVMChainInfo(
				EVMChain.EDGETEST.toString(), 
				"Edge Testnet", 
				33431L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Edge Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://edge-testnet.g.alchemy.com/public");
					this.add("https://rpc.testnet.tempo.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://edge-testnet.explorer.alchemy.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/33431");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.EDGETEST, edge_test);

		
		// h2_test
		EVMChainInfo h2_test = new EVMChainInfo(
				EVMChain.H2TEST.toString(), 
				"H2 Chain Testnet Lambda", 
				25821L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("H2 Chain Testnet Lambda Gas Token", "H2", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.h-1.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://lambda.h2scan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/25821");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.H2TEST, h2_test);
		
		// trustivon_test
		EVMChainInfo trustivon_test = new EVMChainInfo(
				EVMChain.TRUSTIVONTEST.toString(), 
				"Trustivon Testnet", 
				19478L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Trustivon Testnet Gas Token", "TC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.trustivon.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.trustivon.com");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.trustivon.com");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/19478");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TRUSTIVONTEST, trustivon_test);
		
		// xylume_test
		EVMChainInfo xylume_test = new EVMChainInfo(
				EVMChain.XYLUMETEST.toString(), 
				"Xylume TestNet", 
				6934L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Xylume TestNet Gas Token", "XYL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://xyl-testnet.glitch.me/rpc/");
					this.add("https://xylume-testnet.sparked.network/rpc/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://debxylen.github.io/XylumeExplorer");
				}},
				new ArrayList<String>() {{
					this.add("https://debxylen.github.io/XYL_TestNet/faucet.html");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/6934");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.XYLUMETEST, xylume_test);
		
		// statussepolia_test
		EVMChainInfo statussepolia_test = new EVMChainInfo(
				EVMChain.STATUSSEPOLIATEST.toString(), 
				"Status Network Sepolia", 
				1660990954L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Status Network Sepolia Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://public.sepolia.rpc.status.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sepoliascan.status.network");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.status.network/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1660990954");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.STATUSSEPOLIATEST, statussepolia_test);
		
		// electroneum_test
		EVMChainInfo electroneum_test = new EVMChainInfo(
				EVMChain.ELECTRONEUMTEST.toString(), 
				"Electroneum Testnet", 
				5201420L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Electroneum Testnet Gas Token", "ETN", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.ankr.com/electroneum_testnet");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-blockexplorer.electroneum.com");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.electroneum.com");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/5201420");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ELECTRONEUMTEST, electroneum_test);
		
		// pundi_test
		EVMChainInfo pundi_test = new EVMChainInfo(
				EVMChain.PUNDITEST.toString(), 
				"Pundi AIFX Omnilayer Testnet", 
				90001L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Pundi AIFX Omnilayer Testnet Gas Token", "PUNDAI", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-fx-json-web3.functionx.io:8545");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.pundiscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/90001");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PUNDITEST, pundi_test);
		
		// zircuit_test
		EVMChainInfo zircuit_test = new EVMChainInfo(
				EVMChain.ZIRCUITGARFIELDTTEST.toString(), 
				"Zircuit Garfield Testnet", 
				48898L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Zircuit Garfield Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://garfield-testnet.zircuit.com/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.garfield-testnet.zircuit.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/48898");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZIRCUITGARFIELDTTEST, zircuit_test);
		
		// hemiseptest
		EVMChainInfo hemiseptest = new EVMChainInfo(
				EVMChain.HEMISEPOLIATEST.toString(), 
				"Hemi Sepolia", 
				743111L, 
				BlockchainType.BORKED.toString(),
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
		networks.put(EVMChain.HEMISEPOLIATEST, hemiseptest);
		
		// nibiru_test
		EVMChainInfo nibiru_test2 = new EVMChainInfo(
				EVMChain.NIBIRU2TEST.toString(), 
				"Nibiru testnet-2", 
				6911L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Nibiru testnet-2 Gas Token", "NIBI", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://evm-rpc.testnet-2.nibiru.fi");
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
					this.add("https://chainlist.org/chain/6911");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.NIBIRU2TEST, nibiru_test2);
		
		// seismic_test
		EVMChainInfo seismic_test = new EVMChainInfo(
				EVMChain.SEISMICTEST.toString(), 
				"Seismic devnet", 
				5124L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Seismic devnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://node-2.seismicdev.net/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-2.seismicdev.net");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet-2.seismicdev.net/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/5124");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SEISMICTEST, seismic_test);
		
		// blackfort_test
		EVMChainInfo blackfort_test = new EVMChainInfo(
				EVMChain.BLACKFORTTEST.toString(), 
				"BlackFort Exchange Network Testnet DEPRECATED", 
				4777L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("BlackFort Exchange Network Testnet DEPRECATED Gas Token", "TBXN", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet.blackfort.network/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-explorer.blackfort.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/4777");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BLACKFORTTEST, blackfort_test);
		
		// telosxkevm_test
		EVMChainInfo telosxkevm_test = new EVMChainInfo(
				EVMChain.TELOSZKEVMTEST.toString(), 
				"Telos zkEVM Testnet", 
				331L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Telos zkEVM Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://zkrpc.testnet.telos.net");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://zkexplorer.testnet.telos.net");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/331");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TELOSZKEVMTEST, telosxkevm_test);
		
		// okto_test
		EVMChainInfo okto_test = new EVMChainInfo(
				EVMChain.OKTOTEST.toString(), 
				"Okto Testnet", 
				8801L, 
				BlockchainType.BORKED.toString(),
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
		
		// anubis_test
		EVMChainInfo anubis_test = new EVMChainInfo(
				EVMChain.ANUBISTEST.toString(), 
				"ANUBIS Testnet", 
				2526L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("ANUBIS Testnet Gas Token", "ANUBI", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://test-rpc.anubispace.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://test-scan.anubispace.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2526");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ANUBISTEST, anubis_test);
		
		// cross_test
		EVMChainInfo cross_test = new EVMChainInfo(
				EVMChain.CROSSTEST.toString(), 
				"CROSS Testnet", 
				612044L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("CROSS Testnet Gas Token", "tCROSS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet.crosstoken.io:22001");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.crossscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/612044");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CROSSTEST, cross_test);
		
		// marketcapy_test
		EVMChainInfo marketcapy_test = new EVMChainInfo(
				EVMChain.MARKETCAPYTEST.toString(), 
				"MarketCapy TestNet 1", 
				586L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("MarketCapy TestNet 1 Gas Token", "CAPY", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://fraa-flashbox-4646-rpc.a.stagenet.tanssi.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.marketcapy.xyz/");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/586");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MARKETCAPYTEST, marketcapy_test);
		
		// dos_test
		EVMChainInfo dos_test = new EVMChainInfo(
				EVMChain.DOSTEST.toString(), 
				"DOS Testnet", 
				3939L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("DOS Testnet Gas Token", "DOS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://test.doschain.com/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://test.doscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/3939");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DOSTEST, dos_test);
		
		// denergy_test
		EVMChainInfo denergy_test = new EVMChainInfo(
				EVMChain.DENERGYTEST.toString(), 
				"Denergy Testnet", 
				4442L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Denergy Testnet Gas Token", "WATT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.denergytestnet.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.denergytestnet.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/4442");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DENERGYTEST, denergy_test);
		
		// sophon_test
		EVMChainInfo sophon_testz = new EVMChainInfo(
				EVMChain.SOPHONZK531050204TEST.toString(), 
				"Sophon zkSync-OS Testnet", 
				531050204L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Sophon zkSync-OS Testnet Gas Token", "SOPH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://zksync-os-testnet-sophon.zksync.dev");
					this.add("https://rpc.testnet.os.sophon.com");

				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://block-explorer.zksync-os-testnet-sophon.zksync.dev/");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/531050204");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SOPHONZK531050204TEST, sophon_testz);
		
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
					this.add("https://testnet-rpc.mocachain.org");
					this.add("https://devnet-rpc.mocachain.org");
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
				BlockchainType.BORKED.toString(),
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
					this.add("https://rpc.warehouse.dkargo.io");
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
				BlockchainType.BORKED.toString(),
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
				BlockchainType.BORKED.toString(),
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
				BlockchainType.BORKED.toString(),
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
				BlockchainType.BORKED.toString(),
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
		
		// xchain_test
		EVMChainInfo xchain_test = new EVMChainInfo(
				EVMChain.XCHAINTEST.toString(), 
				"XCHAIN Testnet", 
				64002L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("XCHAIN Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://xchain-testnet-rpc.kuma.bid");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://xchain-testnet-explorer.kuma.bid");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/64002");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.XCHAINTEST, xchain_test);
		

		// berachain_test
		EVMChainInfo berachain_test = new EVMChainInfo(
				EVMChain.BERACHAINTEST.toString(), 
				"Berachain Bepolia", 
				80069L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Berachain Bepolia Gas Token", "BERA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://bepolia.rpc.berachain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://bepolia.beratrail.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/80069");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BERACHAINTEST, berachain_test);
		
		// xsollasepolia_test
		EVMChainInfo xsollasepolia_test = new EVMChainInfo(
				EVMChain.XSOLLASEPOLIATEST.toString(), 
				"Xsolla ZK Sepolia Testnet", 
				555777L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Xsolla ZK Sepolia Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://zkrpc-sepolia.xsollazk.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://x.la/explorer");
				}},
				new ArrayList<String>() {{
					this.add("https://xsollazk.com/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/555777");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.XSOLLASEPOLIATEST, xsollasepolia_test);
		
		// pyrope_test
		EVMChainInfo pyrope_test = new EVMChainInfo(
				EVMChain.PYROPETEST.toString(), 
				"Pyrope Testnet", 
				695569L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Pyrope Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.pyropechain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://pyrope.blockscout.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/695569");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PYROPETEST, pyrope_test);
		
		// surge_test
		EVMChainInfo surge_test = new EVMChainInfo(
				EVMChain.SURGETEST.toString(), 
				"Surge Testnet", 
				763375L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Surge Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://l2-rpc.hoodi.surge.wtf");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.hoodi.surge.wtf");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/763375");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SURGETEST, surge_test);

		// surge_test
		EVMChainInfo surged_test = new EVMChainInfo(
				EVMChain.SURGEDEPRECATEDTEST.toString(), 
				"Surge deprecated Testnet", 
				763374L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Surge Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://l2-rpc.surge.staging-nethermind.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.holesky.surge.wtf");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/763374");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SURGEDEPRECATEDTEST, surged_test);
		
		// gpt_test
		EVMChainInfo gpt_test = new EVMChainInfo(
				EVMChain.GPTTEST.toString(), 
				"GPT Testnet", 
				476462898L, 
				BlockchainType.BORKED.toString(),
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
				BlockchainType.BORKED.toString(),
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
				BlockchainType.BORKED.toString(),
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
				BlockchainType.BORKED.toString(),
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
				BlockchainType.BORKED.toString(),
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
				BlockchainType.BORKED.toString(),
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
		EVMChainInfo autonomys_test1 = new EVMChainInfo(
				EVMChain.AUTONOMYSTAURUSTEST.toString(), 
				"Autonomys Taurus Testnet", 
				490000L, 
				BlockchainType.BORKED.toString(),
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
		networks.put(EVMChain.AUTONOMYSTAURUSTEST, autonomys_test1);
		
		// autonomys_test
		EVMChainInfo autonomys_test = new EVMChainInfo(
				EVMChain.AUTONOMYSTEST.toString(), 
				"Autonomys Chronos Testnet", 
				8700L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Autonomys Chronos Testnet Gas Token", "AI3", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://auto-evm.chronos.autonomys.xyz/ws");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.auto-evm.chronos.autonomys.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/8700");
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
				BlockchainType.BORKED.toString(),
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
		EVMChainInfo autonity_test1 = new EVMChainInfo(
				EVMChain.AUTONITYPICADILLYTEST.toString(), 
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
		networks.put(EVMChain.AUTONITYPICADILLYTEST, autonity_test1);
		
		// autonity_test
		EVMChainInfo autonity_test = new EVMChainInfo(
				EVMChain.AUTONITYBAKERLOONILETEST.toString(), 
				"Autonity Bakerloo (Nile) Testnet", 
				65010004L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Autonity Bakerloo (Nile) Testnet Gas Token", "ATN", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://autonity.rpc.web3cdn.network/testnet");
					this.add("https://bakerloo.autonity-apis.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://bakerloo.autonity.org");
				}},
				new ArrayList<String>() {{
					this.add("https://autonity.faucetme.pro");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/65010004");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.AUTONITYBAKERLOONILETEST, autonity_test);
		
		// uniocean_test
		EVMChainInfo uniocean_test = new EVMChainInfo(
				EVMChain.UNIOCEANTEST.toString(), 
				"Uniocean Testnet", 
				684L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Uniocean Testnet Gas Token", "OCEANX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc1.testnet.uniocean.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.uniocean.network");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.testnet.uniocean.network");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/684");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.UNIOCEANTEST, uniocean_test);
		
		// pharos_test
		EVMChainInfo pharos_test1 = new EVMChainInfo(
				EVMChain.PHAROSTEST.toString(), 
				"Pharos Testnet", 
				688688L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Pharos Testnet Gas Token", "PHRS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet.dplabs-internal.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.pharosscan.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/688688");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PHAROSTEST, pharos_test1);
		
		// pharos_test
		EVMChainInfo pharos_test = new EVMChainInfo(
				EVMChain.PHAROSATLANTICTEST.toString(), 
				"Pharos Atlantic Testnet", 
				688689L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Pharos Atlantic Testnet Gas Token", "PHRS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://atlantic.dplabs-internal.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://atlantic.pharosscan.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/688689");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PHAROSATLANTICTEST, pharos_test);
		
		// capx_test
		EVMChainInfo capx_test = new EVMChainInfo(
				EVMChain.CAPXTEST.toString(), 
				"CAPX Testnet", 
				756L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("CAPX Testnet Gas Token", "CAPX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://capx-testnet-c1.rpc.caldera.xyz/http");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.capxscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/756");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CAPXTEST, capx_test);
		
		// omachain_test
		EVMChainInfo omachain_test = new EVMChainInfo(
				EVMChain.OMACHAINTEST.toString(), 
				"OMAChain Testnet", 
				66238L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("OMAChain Testnet Gas Token", "OMA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.chain.oma3.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.chain.oma3.org/");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.testnet.chain.oma3.org/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/66238");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.OMACHAINTEST, omachain_test);
		
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
				BlockchainType.BORKED.toString(),
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
				BlockchainType.BORKED.toString(),
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
				BlockchainType.BORKED.toString(),
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
				BlockchainType.BORKED.toString(),
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
				BlockchainType.BORKED.toString(),
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
				BlockchainType.BORKED.toString(),
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
				BlockchainType.BORKED.toString(),
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
				BlockchainType.BORKED.toString(),
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
		EVMChainInfo qubetics_testa = new EVMChainInfo(
				EVMChain.QUBETICSALPHATEST.toString(), 
				"Qubetics Alpha Testnet", 
				9003L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Qubetics Alpha Testnet Gas Token", "TICS", 18), 
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
					this.add("https://alphatestnet-explorer.qubetics.work/dashboard");
				}},
				new ArrayList<String>() {{
					this.add("https://alphatestnet-explorer.qubetics.work/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/9003");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.QUBETICSALPHATEST, qubetics_testa);
		
		// ab_test
		EVMChainInfo ab_test = new EVMChainInfo(
				EVMChain.ABTEST.toString(), 
				"AB Core Testnet", 
				26888L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("AB Core Testnet Gas Token", "AB", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.core.testnet.ab.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.core.testnet.ab.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/26888");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ABTEST, ab_test);
		
		// incentiv_test
		EVMChainInfo incentiv_test = new EVMChainInfo(
				EVMChain.INCENTIV28802TEST.toString(), 
				"Incentiv Testnet", 
				28802L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Incentiv Testnet Gas Token", "TCENT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc3.testnet.incentiv.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-testnet.incentiv.io/");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/28802");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.INCENTIV28802TEST, incentiv_test);
		
		// splendor_test
		EVMChainInfo splendor_test = new EVMChainInfo(
				EVMChain.SPLENDORTEST.toString(), 
				"Splendor Testnet", 
				2692L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Splendor Testnet Gas Token", "SPLDT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.splendor.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-explorer.splendor.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2692");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SPLENDORTEST, splendor_test);
		
		// kub_test
		EVMChainInfo kub_test2 = new EVMChainInfo(
				EVMChain.KUBL2TEST.toString(), 
				"KUB Layer 2 Testnet", 
				259251L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("KUB Layer 2 Testnet Gas Token", "tKUB", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://kublayer2.testnet.kubchain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://kublayer2.testnet.kubscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/259251");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.KUBL2TEST, kub_test2);
		
		// kub_test
		EVMChainInfo kub_test = new EVMChainInfo(
				EVMChain.KUBTEST.toString(), 
				"KUB Testnet", 
				25925L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("KUB Testnet Gas Token", "tKUB", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.bitkubchain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.kubscan.com");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.kubchain.com");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/25925");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.KUBTEST, kub_test);
		
		// qubetics_test
		EVMChainInfo qubetics_test1 = new EVMChainInfo(
				EVMChain.QUBETICS9003TEST.toString(), 
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
		networks.put(EVMChain.QUBETICS9003TEST, qubetics_test1);
		
		// newton_test
		EVMChainInfo newton_test = new EVMChainInfo(
				EVMChain.NEWTONTEST.toString(), 
				"Newton Finance Testnet", 
				26988L, 
				BlockchainType.BORKED.toString(),
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
				BlockchainType.BORKED.toString(),
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

		// steem_test
		EVMChainInfo steem_test = new EVMChainInfo(
				EVMChain.STEEMTEST.toString(), 
				"Steem Virtual Machine Testnet", 
				8163L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Steem Virtual Machine Testnet Gas Token", "STEEM", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://evmrpc.blazescanner.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://svmscan.blazeapps.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/8163");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.STEEMTEST, steem_test);
		
		// ethereumsepolia_test
		EVMChainInfo ethereumsepolia_test = new EVMChainInfo(
				EVMChain.ETHEREUMSEPOLIATEST.toString(), 
				"Ethereum Sepolia", 
				11155111L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Ethereum Sepolia Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.sepolia.org");
					this.add("https://rpc-sepolia.rockx.com");
					this.add("https://rpc.sepolia.ethpandaops.io");
					this.add("https://sepolia.gateway.tenderly.co");
					this.add("https://ethereum-sepolia-rpc.publicnode.com");
					this.add("https://sepolia.drpc.org");
					this.add("https://rpc-sepolia.rockx.com");
					this.add("https://eth-sepolia.g.alchemy.com/v2/WddzdzI2o9S3COdT73d5w6AIogbKq4X-");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://11155111.testnet.routescan.io");
				}},
				new ArrayList<String>() {{
					this.add("http://fauceth.komputing.org?chain=11155111&address=${ADDRESS}");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/11155111");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ETHEREUMSEPOLIATEST, ethereumsepolia_test);

		
		// the_test
		EVMChainInfo the_test = new EVMChainInfo(
				EVMChain.THETINGTEST.toString(), 
				"The Ting Blockchain Testnet Explorer", 
				6666689L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("The Ting Blockchain Testnet Explorer Gas Token", "Ton", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet.tingchain.org");
					this.add("https://public.0xrpc.com/6666689");
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
				BlockchainType.BORKED.toString(),
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
				BlockchainType.BORKED.toString(),
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
				BlockchainType.BORKED.toString(),
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
				BlockchainType.BORKED.toString(),
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
				BlockchainType.BORKED.toString(),
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
		
		// horizen_test
		EVMChainInfo horizen_test = new EVMChainInfo(
				EVMChain.HORIZENTEST.toString(), 
				"Horizen Testnet", 
				845320009L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Horizen Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://horizen-rpc-testnet.appchain.base.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://horizen-explorer-testnet.appchain.base.org/");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/845320009");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.HORIZENTEST, horizen_test);
		
		// galactica_test
		EVMChainInfo galactica_test = new EVMChainInfo(
				EVMChain.GALACTICATEST.toString(), 
				"Galactica Testnet", 
				843843L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Galactica Testnet Gas Token", "GNET", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://galactica-cassiopeia.g.alchemy.com/public");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://galactica-cassiopeia.explorer.alchemy.com");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet-cassiopeia.galactica.com");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/843843");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.GALACTICATEST, galactica_test);
		

		// lerax_test
		EVMChainInfo lerax_test = new EVMChainInfo(
				EVMChain.LERAXTEST.toString(), 
				"Lerax Chain Testnet", 
				8125L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Lerax Chain Testnet Gas Token", "tLRX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet-dataseed.lerax.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.leraxscan.com/");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/8125");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.LERAXTEST, lerax_test);
		
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
					this.add("https://rpc-testnet.carrchain.io");
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
				BlockchainType.BORKED.toString(),
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
				BlockchainType.BORKED.toString(),
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
		
		// sshivansh
		EVMChainInfo sshivansh = new EVMChainInfo(
				EVMChain.SSHIVANSH.toString(), 
				"SSHIVANSH Mainnet", 
				222345L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("SSHIVANSH Mainnet Gas Token", "SIVZ", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://apiprod.sshivanshcoin.com/ext/bc/2XWN3PW4Qdjw3AtG6eqH8PCzj49G9Qay6SLNWbGLjsDF1qPgsW/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.sshivanshcoin.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/222345");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SSHIVANSH, sshivansh);
		
		// arc_test
		EVMChainInfo arc_test = new EVMChainInfo(
				EVMChain.ARCTEST.toString(), 
				"Arc Testnet", 
				5042002L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Arc Testnet Gas Token", "USDC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.arc.network");
					this.add("https://rpc.quicknode.testnet.arc.network");
					this.add("https://rpc.blockdaemon.testnet.arc.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.arcscan.app/");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.circle.com/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/5042002");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ARCTEST, arc_test);

		// ctc_test
		EVMChainInfo ctc_test = new EVMChainInfo(
				EVMChain.CTCTEST.toString(), 
				"CTC Chain Testnet", 
				12302L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("CTC Chain Testnet Gas Token", "CTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://test-rpc.tantin.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://test-scan.tantin.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/12302");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CTCTEST, ctc_test);
		
		// cx_test
		EVMChainInfo cx_test = new EVMChainInfo(
				EVMChain.CXTEST.toString(), 
				"CX Chain Testnet", 
				70707L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("CX Chain Testnet Gas Token", "CX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/cxctestnet/testnet/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://subnets-test.avax.network/cxctestnet");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/70707");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CXTEST, cx_test);
		
		// mawari_test
		EVMChainInfo mawari_test = new EVMChainInfo(
				EVMChain.MAWARITEST.toString(), 
				"Mawari Testnet", 
				576L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Mawari Testnet Gas Token", "MAWARI", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.mawari.net/http");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.mawari.net/");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/576");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MAWARITEST, mawari_test);
		
		// eden_test
		EVMChainInfo eden_test = new EVMChainInfo(
				EVMChain.EDENTEST.toString(), 
				"Eden testnet", 
				3735928814L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Eden testnet Gas Token", "TIA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.eden.gateway.fm");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://eden-testnet.blockscout.com");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet-eden-testnet.binarybuilders.services");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/3735928814");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.EDENTEST, eden_test);
		
		// datahaven_test
		EVMChainInfo datahaven_test = new EVMChainInfo(
				EVMChain.DATAHAVENTEST.toString(), 
				"DataHaven Testnet", 
				55931L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("DataHaven Testnet Gas Token", "MOCK", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://services.datahaven-testnet.network/testnet");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.dhscan.io");
				}},
				new ArrayList<String>() {{
					this.add("https://apps.datahaven.xyz/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/55931");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DATAHAVENTEST, datahaven_test);
		
		// riche_test
		EVMChainInfo riche_test = new EVMChainInfo(
				EVMChain.RICHETEST.toString(), 
				"Riche Chain Testnet", 
				45578L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Riche Chain Testnet Gas Token", "RIC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpcrichechain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://richescan-testnet.com/");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/45578");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.RICHETEST, riche_test);
		
		// morphhoodi_test
		EVMChainInfo morphhoodi_test = new EVMChainInfo(
				EVMChain.MORPHHOODITEST.toString(), 
				"Morph Hoodi", 
				2910L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Morph Hoodi Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-hoodi.morphl2.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-hoodi.morphl2.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2910");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MORPHHOODITEST, morphhoodi_test);
		
		// ibvm_test
		EVMChainInfo ibvm_test = new EVMChainInfo(
				EVMChain.IBVMTEST.toString(), 
				"IBVM Testnet", 
				2107L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("IBVM Testnet Gas Token", "BTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.ibvm.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-explorer.ibvm.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.ibvm.io");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2107");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.IBVMTEST, ibvm_test);
		
		// pruv_test
		EVMChainInfo pruv_test = new EVMChainInfo(
				EVMChain.PRUVTEST.toString(), 
				"Pruv Testnet", 
				7336L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Pruv Testnet Gas Token", "PRUV", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.pruv.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.pruv.network");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.testnet.pruv.network");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/7336");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PRUVTEST, pruv_test);
		
		// billions_test
		EVMChainInfo billions_test = new EVMChainInfo(
				EVMChain.BILLIONSTEST.toString(), 
				"billions-testnet", 
				6913L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("billions-testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://billions-testnet-rpc.eu-north-2.gateway.fm");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://billions-testnet-blockscout.eu-north-2.gateway.fm");
				}},
				new ArrayList<String>() {{
					this.add("https://billions-testnet-faucet.eu-north-2.gateway.fm");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/6913");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BILLIONSTEST, billions_test);
		
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
		
		// fluent_test
		EVMChainInfo fluent_test2 = new EVMChainInfo(
				EVMChain.FLUENT20994TEST.toString(), 
				"Fluent Testnet", 
				20994L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Fluent Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.fluent.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.fluentscan.xyz/");
				}},
				new ArrayList<String>() {{
					this.add("https://testnet.fluent.xyz/dev-portal");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/20994");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FLUENT20994TEST, fluent_test2);
		
		// fluent_test
		EVMChainInfo fluentdev_test = new EVMChainInfo(
				EVMChain.FLUENTDEVTEST.toString(), 
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
		networks.put(EVMChain.FLUENTDEVTEST, fluentdev_test);
		
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
				BlockchainType.BORKED.toString(),
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
				BlockchainType.BORKED.toString(),
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

		// basecamp
		EVMChainInfo basecamp = new EVMChainInfo(
				EVMChain.BASECAMP.toString(), 
				"Basecamp", 
				123420001114L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Basecamp Gas Token", "CAMP", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.basecamp.t.raas.gelato.cloud");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://basecamp.cloud.blockscout.com");
				}},
				new ArrayList<String>() {{
					this.add("https://www.campnetwork.xyz/faucet_l1");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/123420001114");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BASECAMP, basecamp);
		
		// initverse_test
		EVMChainInfo initverse_test = new EVMChainInfo(
				EVMChain.INITVERSETEST.toString(), 
				"InitVerse genesis testnet", 
				7234L, 
				BlockchainType.BORKED.toString(),
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
				BlockchainType.BORKED.toString(),
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
				BlockchainType.BORKED.toString(),
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
		
		// mantrachain_test
		EVMChainInfo mantrachain_test = new EVMChainInfo(
				EVMChain.MANTRACHAINTEST.toString(), 
				"MANTRACHAIN Testnet", 
				5887L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("MANTRACHAIN Testnet Gas Token", "OM", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://evm.dukong.mantrachain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("http://mantrascan.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.dukong.mantrachain.io");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/5887");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MANTRACHAINTEST, mantrachain_test);
		
		return networks;

	}

}