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
		
		// somnia_test
		EVMChainInfo somnia_test = new EVMChainInfo(
				EVMChain.SOMNIATEST.toString(), 
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
		networks.put(EVMChain.SOMNIATEST, somnia_test);
		
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
