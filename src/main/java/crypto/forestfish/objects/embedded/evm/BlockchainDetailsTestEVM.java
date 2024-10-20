package crypto.forestfish.objects.embedded.evm;

import java.util.ArrayList;
import java.util.HashMap;

import crypto.forestfish.enums.BlockchainType;
import crypto.forestfish.enums.evm.EVMChain;
import crypto.forestfish.enums.evm.EVMPriceMechanism;
import crypto.forestfish.objects.evm.model.chain.EVMChainInfo;
import crypto.forestfish.objects.evm.model.chain.EVMCurrency;

public class BlockchainDetailsTestEVM {

	@SuppressWarnings("serial")
	public static HashMap<EVMChain, EVMChainInfo> getTestnetEVMNetworks() {

		HashMap<EVMChain, EVMChainInfo> networks = new HashMap<>();

		// haust_test
		EVMChainInfo haust_test = new EVMChainInfo(
				EVMChain.HAUSTTEST.toString(), 
				"Haust Testnet", 
				1570754601L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Haust Testnet Gas Token", "HAUST", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-test.haust.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://haust-testnet-blockscout.eu-north-2.gateway.fm");
				}},
				new ArrayList<String>() {{
					this.add("https://haust-testnet-faucet.eu-north-2.gateway.fm");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1570754601");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.HAUSTTEST, haust_test);

		// lumia_test
		EVMChainInfo lumia_test = new EVMChainInfo(
				EVMChain.LUMIATEST.toString(), 
				"Lumia Testnet", 
				1952959480L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Lumia Testnet Gas Token", "LUMIA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.lumia.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-explorer.lumia.org");
				}},
				new ArrayList<String>() {{
					this.add("https://testnet-faucet.lumia.org");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1952959480");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.LUMIATEST, lumia_test);
		
		// darwin_test
		EVMChainInfo darwin_test = new EVMChainInfo(
				EVMChain.DARWINTEST.toString(), 
				"Darwin Devnet", 
				610L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Darwin Devnet Gas Token", "DNA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://devnet-rpc.darwinchain.ai");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.darwinchain.ai");
				}},
				new ArrayList<String>() {{
					this.add("https://devnet-rpc.darwinchain.ai/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/610");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DARWINTEST, darwin_test);
		
		// unichain_test
		EVMChainInfo unichain_test = new EVMChainInfo(
				EVMChain.UNICHAINTEST.toString(), 
				"Unichain Sepolia Testnet", 
				1301L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Unichain Sepolia Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://sepolia.unichain.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sepolia.uniscan.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1301");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.UNICHAINTEST, unichain_test);
		
		// adf_test
		EVMChainInfo adf_test = new EVMChainInfo(
				EVMChain.ADFTEST.toString(), 
				"ADF Chain Testnet", 
				1212L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("ADF Chain Testnet Gas Token", "tADF", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet.adftechnology.com/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-explorer.adftechnology.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1212");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ADFTEST, adf_test);
		
		// zenchain_test
		EVMChainInfo zenchain_test = new EVMChainInfo(
				EVMChain.ZENCHAINTEST.toString(), 
				"Zenchain Testnet", 
				8408L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Zenchain Testnet Gas Token", "ZCX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://zenchain-testnet.api.onfinality.io/public");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://zentrace.io");
				}},
				new ArrayList<String>() {{
					this.add("https://facuet.zenchain.io");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/8408");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZENCHAINTEST, zenchain_test);
		
		// sec_test
		EVMChainInfo sec_test = new EVMChainInfo(
				EVMChain.SECTEST.toString(), 
				"SEC Testnet", 
				19515L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("SEC Testnet Gas Token", "SEP", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.secexplorer.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.secexplorer.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.secexplorer.io");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/19515");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SECTEST, sec_test);
		
		// wadzchain_test
		EVMChainInfo wadzchain_test = new EVMChainInfo(
				EVMChain.WADZCHAINTEST.toString(), 
				"Wadzchain Testnet", 
				71117L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Wadzchain Testnet Gas Token", "WTK", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.wadzchain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan-testnet.wadzchain.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet-testnet.wadzchain.io");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/71117");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.WADZCHAINTEST, wadzchain_test);
		
		// tabi_test
		EVMChainInfo tabi_test2 = new EVMChainInfo(
				EVMChain.TABIV2TEST.toString(), 
				"Tabi Testnetv2", 
				9788L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Tabi Testnetv2 Gas Token", "TABI", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnetv2.tabichain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnetv2.tabiscan.com");
				}},
				new ArrayList<String>() {{
					this.add("https://carnival.tabichain.com");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/9788");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TABIV2TEST, tabi_test2);
		
		// vexon_test
		EVMChainInfo vexon_test = new EVMChainInfo(
				EVMChain.VEXONTEST.toString(), 
				"Vexon Testnet", 
				7879L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Vexon Testnet Gas Token", "tVEX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet-europe1.vexonhub.org");
					this.add("https://rpc-testnet-01.vexonhub.org");
					this.add("https://rpc-testnet-asia1.vexonhub.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.vexonhub.org");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet-drip.vexonhub.org");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/7879");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.VEXONTEST, vexon_test);
		
		// matchain_test
		EVMChainInfo matchain_test = new EVMChainInfo(
				EVMChain.MATCHAINTEST.toString(), 
				"Matchain Testnet", 
				699L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Matchain Testnet Gas Token", "BNB", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.matchain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.matchscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/699");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MATCHAINTEST, matchain_test);
		
		// near_test
		EVMChainInfo near_test = new EVMChainInfo(
				EVMChain.NEARTEST.toString(), 
				"NEAR Protocol Testnet", 
				398L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("NEAR Protocol Testnet Gas Token", "NEAR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://eth-rpc.testnet.near.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://eth-explorer-testnet.near.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/398");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.NEARTEST, near_test);
		
		// story_test
		EVMChainInfo story_test = new EVMChainInfo(
				EVMChain.STORYTEST.toString(), 
				"Story Testnet", 
				1513L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Story Testnet Gas Token", "IP", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet.storyrpc.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.storyscan.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.story.foundation");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1513");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.STORYTEST, story_test);
		
		// 5irechain_test
		EVMChainInfo fiveirechain_test = new EVMChainInfo(
				EVMChain.FIVEIRECHAINTEST.toString(), 
				"5ireChain Thunder Testnet", 
				997L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("5ireChain Thunder Testnet Gas Token", "T5IRE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.5ire.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.5irescan.io");
				}},
				new ArrayList<String>() {{
					this.add("https://testnet.5irescan.io/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/997");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FIVEIRECHAINTEST, fiveirechain_test);
		
		// laika_test
		EVMChainInfo laika_test = new EVMChainInfo(
				EVMChain.LAIKATEST.toString(), 
				"Laika Testnet", 
				4269L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Laika Testnet Gas Token", "DOGE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnetrpc1.laikachain.dog");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.laikachain.dog");
				}},
				new ArrayList<String>() {{
					this.add("https://laikachain.dog/faucets");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/4269");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.LAIKATEST, laika_test);
		
		// hashkey_test
		EVMChainInfo hashkey_test = new EVMChainInfo(
				EVMChain.HASHKEYTEST.toString(), 
				"HashKey Chain Testnet", 
				133L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("HashKey Chain Testnet Gas Token", "HSK", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://hashkeychain-testnet.alt.technology");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://hashkeychain-testnet-explorer.alt.technology");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/133");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.HASHKEYTEST, hashkey_test);
		
		// esync_test
		EVMChainInfo esync_test = new EVMChainInfo(
				EVMChain.ESYNCTEST.toString(), 
				"eSync Network Testnet", 
				63002L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("eSync Network Testnet Gas Token", "ECS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.tst.esync.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.tst.esync.network");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.tst.ecredits.com");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/63002");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ESYNCTEST, esync_test);
		
		// creator_test
		EVMChainInfo creator_test = new EVMChainInfo(
				EVMChain.CREATORTEST.toString(), 
				"Creator Chain Testnet", 
				66665L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Creator Chain Testnet Gas Token", "CETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.creatorchain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.creatorchain.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/66665");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CREATORTEST, creator_test);
		
		// overprotocol_test
		EVMChainInfo overprotocol_test = new EVMChainInfo(
				EVMChain.OVERPROTOCOLTEST.toString(), 
				"OverProtocol Testnet", 
				541764L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("OverProtocol Testnet Gas Token", "OVER", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://wallet-dolphin.rpc.over.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://dolphin.view.over.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/541764");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.OVERPROTOCOLTEST, overprotocol_test);

		// silicon_test
		EVMChainInfo silicon_test = new EVMChainInfo(
				EVMChain.SILICONTEST.toString(), 
				"Silicon zkEVM Sepolia Testnet", 
				1722641160L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Silicon zkEVM Sepolia Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://silicon-testnet.nodeinfra.com");
					this.add("https://rpc-sepolia.silicon.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scope-sepolia.silicon.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1722641160");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SILICONTEST, silicon_test);
		
		// duckchain_test
		EVMChainInfo duckchain_test = new EVMChainInfo(
				EVMChain.DUCKCHAINTEST.toString(), 
				"DuckChain Testnet", 
				202105L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("DuckChain Testnet Gas Token", "TON", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc-hk.duckchain.io");
					this.add("https://testnet-rpc.duckchain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://www.oklink.com/duckchain-testnet");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/202105");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DUCKCHAINTEST, duckchain_test);
		
		// asset_test
		EVMChainInfo asset_test = new EVMChainInfo(
				EVMChain.ASSETTEST.toString(), 
				"Asset Chain Testnet", 
				42421L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Asset Chain Testnet Gas Token", "RWA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://enugu-rpc.assetchain.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan-testnet.assetchain.org");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.assetchain.org");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/42421");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ASSETTEST, asset_test);
		
		// metacces_test
		EVMChainInfo metacces_test = new EVMChainInfo(
				EVMChain.METACCESTEST.toString(), 
				"Metacces Testnet", 
				1260L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Metacces Testnet Gas Token", "ACCES", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://tapi.accesscan.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.accesscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1260");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.METACCESTEST, metacces_test);
		
		// kaia_test
		EVMChainInfo kaia_test = new EVMChainInfo(
				EVMChain.KAIATEST.toString(), 
				"Kaia Testnet Kairos", 
				1001L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Kaia Testnet Kairos Gas Token", "KAIA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://public-en.kairos.node.kaia.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://baobab.klaytnfinder.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.kaia.io");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1001");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.KAIATEST, kaia_test);
		
		// connext_test
		EVMChainInfo connext_test = new EVMChainInfo(
				EVMChain.CONNEXTTEST.toString(), 
				"Connext Sepolia", 
				6398L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Connext Sepolia Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.connext-sepolia.gelato.digital/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://connext-sepolia.blockscout.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/6398");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CONNEXTTEST, connext_test);
		
		// zeus_test
		EVMChainInfo zeus_test = new EVMChainInfo(
				EVMChain.ZEUSTEST.toString(), 
				"ZEUS Testnet", 
				7244L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("ZEUS Testnet Gas Token", "ZEUS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.zeuschainscan.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-explorer.zeuschainscan.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.zeuschainscan.io");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/7244");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZEUSTEST, zeus_test);
		
		// nibiru_test
		EVMChainInfo nibiru_test = new EVMChainInfo(
				EVMChain.NIBIRUTEST.toString(), 
				"Nibiru Devnet-3", 
				7222L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Nibiru Devnet-3 Gas Token", "NIBI", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://evm-rpc.devnet-3.nibiru.fi");
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
					this.add("https://chainlist.org/chain/7222");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.NIBIRUTEST, nibiru_test);
		
		// apexfusion_test
		EVMChainInfo apexfusion_test = new EVMChainInfo(
				EVMChain.APEXFUSIONTEST.toString(), 
				"Apex Fusion - Nexus testnet", 
				9070L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Apex Fusion - Nexus testnet Gas Token", "tAP3X", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.nexus.testnet.apexfusion.org/");
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
					this.add("https://chainlist.org/chain/9070");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.APEXFUSIONTEST, apexfusion_test);
		
		// flamma_test
		EVMChainInfo flamma_test = new EVMChainInfo(
				EVMChain.FLAMMATEST.toString(), 
				"Flamma Testnet", 
				6550L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Flamma Testnet Gas Token", "FLA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnetrpc.flamma.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.flascan.net");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/6550");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FLAMMATEST, flamma_test);
		
		// maalchain_test
		EVMChainInfo maalchain_test = new EVMChainInfo(
				EVMChain.MAALCHAINTEST.toString(), 
				"MaalChain Testnet V2", 
				7863L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("MaalChain Testnet V2 Gas Token", "MAAL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://node-testnet.maalscan.io/");
					this.add("https://node2-testnet.maalscan.io/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://new-testnet.maalscan.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet-new-testnet.maalscan.io/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/7863");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MAALCHAINTEST, maalchain_test);
		
		// now_test
		EVMChainInfo now_test = new EVMChainInfo(
				EVMChain.NOWTEST.toString(), 
				"NOW Chain Testnet", 
				2014L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("NOW Chain Testnet Gas Token", "NOW", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.nowscan.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.nowscan.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.nowchain.co");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2014");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.NOWTEST, now_test);
		
		// bitcoin_test
		EVMChainInfo bitcoin_test = new EVMChainInfo(
				EVMChain.BITCOINTEST.toString(), 
				"Bitcoin Protocol Testnet", 
				1227L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Bitcoin Protocol Testnet Gas Token", "BTCP", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-chain.btcprotocol.io/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.btcprotocol.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1227");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BITCOINTEST, bitcoin_test);
		
		// binary_test
		EVMChainInfo binary_test = new EVMChainInfo(
				EVMChain.BINARYTEST.toString(), 
				"Binary Sepolia", 
				625L, 
				BlockchainType.BORKED.toString(), // nginx 502 from single
				new EVMCurrency("Binary Sepolia Gas Token", "BNRY", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.thebinaryholdings.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.sepolia.thebinaryholdings.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/625");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BINARYTEST, binary_test);
		
		// xl_test
		EVMChainInfo xl_test = new EVMChainInfo(
				EVMChain.XLTEST.toString(), 
				"XL Network Testnet", 
				3084L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("XL Network Testnet Gas Token", "XLN", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/xlnetworkt/testnet/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://subnets-test.avax.network/xlnetworkt");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/3084");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.XLTEST, xl_test);
		
		// runic_test
		EVMChainInfo runic_test = new EVMChainInfo(
				EVMChain.RUNICTEST.toString(), 
				"Runic Chain Testnet", 
				822L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Runic Chain Testnet Gas Token", "rBTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.runic.build");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.runic.build");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.runic.build");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/822");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.RUNICTEST, runic_test);

		// chakra_test
		EVMChainInfo chakra_test = new EVMChainInfo(
				EVMChain.CHAKRATEST.toString(), 
				"Chakra Testnet", 
				8545L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Chakra Testnet Gas Token", "CKR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpcv1-dn-1.chakrachain.io/");
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
					this.add("https://chainlist.org/chain/8545");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CHAKRATEST, chakra_test);
		
		// animechain_test
		EVMChainInfo animechain_test = new EVMChainInfo(
				EVMChain.ANIMECHAINTEST.toString(), 
				"Animechain Testnet", 
				2162L, 
				BlockchainType.BORKED.toString(), // Invalid response received: 503; {"jsonrpc":"2.0","error":{"code":-32011,"message":"no backends available for method"},"id":572}
				new EVMCurrency("Animechain Testnet Gas Token", "COIN", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.kanda.animechain.ai");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.kanda.animechain.ai");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2162");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ANIMECHAINTEST, animechain_test);
		

		// mechain_test
		EVMChainInfo mechain_test = new EVMChainInfo(
				EVMChain.MECHAINTEST.toString(), 
				"MeChain Testnet", 
				5151L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("MeChain Testnet Gas Token", "ZKME", 18), 
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
		networks.put(EVMChain.MECHAINTEST, mechain_test);
		
		// abey_test
		EVMChainInfo abey_test = new EVMChainInfo(
				EVMChain.ABEYTEST.toString(), 
				"ABEY Testnet", 
				178L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("ABEY Testnet Gas Token", "tABEY", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testrpc.abeychain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.abeyscan.com");
				}},
				new ArrayList<String>() {{
					this.add("https://testnet-faucet.abeychain.com");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/178");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ABEYTEST, abey_test);

		// dojima_test
		EVMChainInfo dojima_test = new EVMChainInfo(
				EVMChain.DOJIMATEST.toString(), 
				"Dojima Testnet", 
				184L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Dojima Testnet Gas Token", "DOJ", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-test-d11k.dojima.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-test.dojima.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/184");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DOJIMATEST, dojima_test);
		
		// guru_test
		EVMChainInfo guru_test = new EVMChainInfo(
				EVMChain.GURUTEST.toString(), 
				"Guru Network Testnet", 
				261L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Guru Network Testnet Gas Token", "tGURU", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.gurunetwork.ai/archive/261");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.gurunetwork.ai");
				}},
				new ArrayList<String>() {{
					this.add("https://v2.dex.guru/season-pass/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/261");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.GURUTEST, guru_test);

		// cycle_test
		EVMChainInfo cycle_jtest = new EVMChainInfo(
				EVMChain.CYCLEJELLYFISHTEST.toString(), 
				"Cycle Network Testnet Jellyfish", 
				1223L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Cycle Network Testnet Jellyfish Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://jellyfish-rpc-testnet.cyclenetwork.io");
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
					this.add("https://chainlist.org/chain/1223");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CYCLEJELLYFISHTEST, cycle_jtest);
		
		// starchain_test
		EVMChainInfo starchain_test = new EVMChainInfo(
				EVMChain.STARCHAINTEST.toString(), 
				"StarCHAIN Testnet", 
				1570L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("StarCHAIN Testnet Gas Token", "STARX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc1.starworksglobal.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.starchainscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1570");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.STARCHAINTEST, starchain_test);
		
		// b3_test
		EVMChainInfo b3_test = new EVMChainInfo(
				EVMChain.B3TEST.toString(), 
				"B3 Sepolia Testnet", 
				1993L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("B3 Sepolia Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://sepolia.b3.fun");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sepolia.explorer.b3.fun");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1993");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.B3TEST, b3_test);
		
		// race_test
		EVMChainInfo race_test = new EVMChainInfo(
				EVMChain.RACETEST.toString(), 
				"RACE Testnet", 
				6806L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("RACE Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://racetestnet.io/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.racescan.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.racetestnet.io/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/6806");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.RACETEST, race_test);
		
		// lif3_test
		EVMChainInfo lif3_test = new EVMChainInfo(
				EVMChain.LIF3TEST.toString(), 
				"Lif3 Chain Testnet", 
				1811L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Lif3 Chain Testnet Gas Token", "LIF3", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-evm.lif3.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.lif3scout.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1811");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.LIF3TEST, lif3_test);

		// oasys_test
		EVMChainInfo oasys_test = new EVMChainInfo(
				EVMChain.OASYSTEST.toString(), 
				"Oasys Testnet", 
				9372L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Oasys Testnet Gas Token", "OAS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.oasys.games");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.oasys.games");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/9372");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.OASYSTEST, oasys_test);

		// incentiv_test
		EVMChainInfo incentiv_test = new EVMChainInfo(
				EVMChain.INCENTIVTEST.toString(), 
				"Incentiv Devnet", 
				16350L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Incentiv Devnet Gas Token", "INC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.ankr.com/incentiv_devnet");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.incentiv-dev.ankr.network");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/16350");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.INCENTIVTEST, incentiv_test);

		// pivotal_test
		EVMChainInfo pivotal_test = new EVMChainInfo(
				EVMChain.PIVOTALTEST.toString(), 
				"Pivotal Sepolia", 
				16481L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Pivotal Sepolia Gas Token", "PLUS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://sepolia.pivotalprotocol.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sepolia.pivotalscan.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/16481");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PIVOTALTEST, pivotal_test);

		// mazze_test
		EVMChainInfo mazze_test = new EVMChainInfo(
				EVMChain.MAZZETEST.toString(), 
				"MAZZE Testnet", 
				199991L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("MAZZE Testnet Gas Token", "MAZZE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.mazze.io/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://mazzescan.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.mazze.io/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/199991");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MAZZETEST, mazze_test);

		// gemuchain_test
		EVMChainInfo gemuchain_test = new EVMChainInfo(
				EVMChain.GEMUCHAINTEST.toString(), 
				"Gemuchain Testnet", 
				1903648807L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Gemuchain Testnet Gas Token", "GEMU", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://gemutest-rpc.gemuchain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://gemutest-explorer.gemuchain.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.gemuchain.io/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1903648807");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.GEMUCHAINTEST, gemuchain_test);

		// chronicle_test
		EVMChainInfo chronicle_test2 = new EVMChainInfo(
				EVMChain.LITPCHRONICLETEST.toString(), 
				"Chronicle - Lit Protocol Testnet", 
				175177L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Chronicle - Lit Protocol Testnet Gas Token", "tstLIT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://chain-rpc.litprotocol.com/http");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://chain.litprotocol.com");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.litprotocol.com");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/175177");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.LITPCHRONICLETEST, chronicle_test2);

		// chronicle_test
		EVMChainInfo chronicle_test_y = new EVMChainInfo(
				EVMChain.CHRONICLEYELLOWSTONETEST.toString(), 
				"Chronicle Yellowstone - Lit Protocol Testnet", 
				175188L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Chronicle Yellowstone - Lit Protocol Testnet Gas Token", "tstLPX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://yellowstone-rpc.litprotocol.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://yellowstone-explorer.litprotocol.com");
				}},
				new ArrayList<String>() {{
					this.add("https://developer.litprotocol.com/support/intro");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/175188");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CHRONICLEYELLOWSTONETEST, chronicle_test_y);
		
		// cipherem_test
		EVMChainInfo cipherem_test = new EVMChainInfo(
				EVMChain.CIPHEREMTEST.toString(), 
				"Cipherem Testnet", 
				292003L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Cipherem Testnet Gas Token", "CIP", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet.cipherem.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://cipherscan.net");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/292003");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CIPHEREMTEST, cipherem_test);
		
		// waba_test
		EVMChainInfo waba_test = new EVMChainInfo(
				EVMChain.WABATEST.toString(), 
				"WABA Chain Testnet", 
				327126L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("WABA Chain Testnet Gas Token", "WABA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.wabaworld.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.wabaworld.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/327126");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.WABATEST, waba_test);
		
		// gobbl_test
		EVMChainInfo gobbl_test = new EVMChainInfo(
				EVMChain.GOBBLTEST.toString(), 
				"Gobbl Testnet", 
				486487L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Gobbl Testnet Gas Token", "GOBBL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.gobbl.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.gobbl.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.gobbl.io");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/486487");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.GOBBLTEST, gobbl_test);
		
		// automata_test
		EVMChainInfo automata_test = new EVMChainInfo(
				EVMChain.AUTOMATATEST.toString(), 
				"Automata Testnet", 
				1398243L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Automata Testnet Gas Token", "ATA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.ata.network");
					this.add("https://automata-testnet.alt.technology");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://automata-testnet-explorer.alt.technology");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1398243");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.AUTOMATATEST, automata_test);
		
		// altar_test
		EVMChainInfo altar_test = new EVMChainInfo(
				EVMChain.ALTARTEST.toString(), 
				"Altar Testnet", 
				4444444L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Altar Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://altar-rpc.ceremonies.ai/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://altar-explorer.ceremonies.ai");
				}},
				new ArrayList<String>() {{
					this.add("https://sepoliafaucet.com/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/4444444");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ALTARTEST, altar_test);
		
		// zero_test
		EVMChainInfo zero_s_test = new EVMChainInfo(
				EVMChain.ZEROSEPOLIATEST.toString(), 
				"ZERO Testnet (Sepolia)", 
				4457845L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("ZERO Testnet (Sepolia) Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.zerion.io/v1/zero-sepolia");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.zero.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/4457845");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZEROSEPOLIATEST, zero_s_test);
		
		// neox_test
		EVMChainInfo neox_test = new EVMChainInfo(
				EVMChain.NEOXT3TEST.toString(), 
				"NeoX Testnet T3", 
				12227331L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("NeoX Testnet T3 Gas Token", "GAS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://neoxseed1.ngd.network/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.scan.banelabs.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/12227331");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.NEOXT3TEST, neox_test);
		
		// deepbrainchain_test
		EVMChainInfo deepbrainchain_test = new EVMChainInfo(
				EVMChain.DEEPBRAINCHAINTEST.toString(), 
				"DeepBrainChain Testnet", 
				19850818L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("DeepBrainChain Testnet Gas Token", "DBC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.dbcwallet.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://blockscout-testnet.dbcscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/19850818");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DEEPBRAINCHAINTEST, deepbrainchain_test);
		
		// vcity_test
		EVMChainInfo vcity_test = new EVMChainInfo(
				EVMChain.VCITYTEST.toString(), 
				"Vcity Testnet", 
				20230825L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Vcity Testnet Gas Token", "VCITY", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet.vcity.app");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.vcity.app");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/20230825");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.VCITYTEST, vcity_test);
		
		// autonity_test
		EVMChainInfo autonity_test2 = new EVMChainInfo(
				EVMChain.AUTONITYPICCADILLYYAMUNATEST.toString(), 
				"Autonity Piccadilly (Yamuna) Testnet", 
				65100003L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Autonity Piccadilly (Yamuna) Testnet Gas Token", "ATN", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc1.piccadilly.autonity.org/");
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
					this.add("https://chainlist.org/chain/65100003");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.AUTONITYPICCADILLYYAMUNATEST, autonity_test2);

		// autonity_test
		EVMChainInfo autonity_test = new EVMChainInfo(
				EVMChain.AUTONITYBAKERLOOYAMUNATEST.toString(), 
				"Autonity Bakerloo (Yamuna) Testnet", 
				65010003L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Autonity Bakerloo (Yamuna) Testnet Gas Token", "ATN", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc1.bakerloo.autonity.org/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://bakerloo.autonity.org");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.autonity.org/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/65010003");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.AUTONITYBAKERLOOYAMUNATEST, autonity_test);
		
		// backstop_test
		EVMChainInfo backstop_test = new EVMChainInfo(
				EVMChain.BACKSTOPTEST.toString(), 
				"Backstop Testnet", 
				88558801L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Backstop Testnet Gas Token", "ZBS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet.rpc.backstop.technology");
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
					this.add("https://chainlist.org/chain/88558801");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BACKSTOPTEST, backstop_test);
		
		// neox_test
		EVMChainInfo neoxt4_test = new EVMChainInfo(
				EVMChain.NEOXT4TEST.toString(), 
				"NeoX Testnet T4", 
				12227332L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("NeoX Testnet T4 Gas Token", "GAS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet.rpc.banelabs.org/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.scan.banelabs.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/12227332");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.NEOXT4TEST, neoxt4_test);
		
		// chronicle_test
		EVMChainInfo chronicle_test = new EVMChainInfo(
				EVMChain.LITPCHRONICLEVESUVIUSTEST.toString(), 
				"Chronicle Vesuvius - Lit Protocol Testnet", 
				2311L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Chronicle Vesuvius - Lit Protocol Testnet Gas Token", "tstLPX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://vesuvius-rpc.litprotocol.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://vesuvius-explorer.litprotocol.com");
				}},
				new ArrayList<String>() {{
					this.add("https://developer.litprotocol.com/support/intro");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2311");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.LITPCHRONICLEVESUVIUSTEST, chronicle_test);

		// cuckoo_test
		EVMChainInfo cuckoo_test = new EVMChainInfo(
				EVMChain.CUCKOOTEST.toString(), 
				"Cuckoo Sepolia", 
				1210L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Cuckoo Sepolia Gas Token", "CAI", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"3000000", //3000k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.cuckoo.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-scan.cuckoo.network");
				}},
				new ArrayList<String>() {{
					this.add("https://cuckoo.network/portal/faucet/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1210");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CUCKOOTEST, cuckoo_test);

		// superseed_test
		EVMChainInfo superseed_test = new EVMChainInfo(
				EVMChain.SUPERSEEDTEST.toString(), 
				"Superseed Sepolia Testnet", 
				53302L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Superseed Sepolia Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://sepolia.superseed.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sepolia-explorer.superseed.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://sepoliafaucet.com");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/53302");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SUPERSEEDTEST, superseed_test);

		// xterio_test
		EVMChainInfo xterio_test = new EVMChainInfo(
				EVMChain.XTERIOTEST.toString(), 
				"Xterio Testnet", 
				1637450L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Xterio Testnet Gas Token", "tBNB", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://xterio-testnet.alt.technology");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.xterscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1637450");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.XTERIOTEST, xterio_test);

		// gm_test
		EVMChainInfo gm_test = new EVMChainInfo(
				EVMChain.GMTEST.toString(), 
				"GM Network Testnet", 
				202402181627L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("GM Network Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://gmnetwork-testnet.alt.technology/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://gmnetwork-testnet-explorer.alt.technology");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/202402181627");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.GMTEST, gm_test);

		// metal_test
		EVMChainInfo metal_test = new EVMChainInfo(
				EVMChain.METALTEST.toString(), 
				"Metal L2 Testnet", 
				1740L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Metal L2 Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet.rpc.metall2.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.explorer.metall2.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1740");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.METALTEST, metal_test);

		// itx_test
		EVMChainInfo itx_test = new EVMChainInfo(
				EVMChain.ITXTEST.toString(), 
				"ITX Testnet", 
				5321L, 
				BlockchainType.BORKED.toString(), // unstable single node
				new EVMCurrency("ITX Testnet Gas Token", "ITX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.itxchain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.itxchain.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/5321");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ITXTEST, itx_test);


		// hydra_test
		EVMChainInfo hydra_test = new EVMChainInfo(
				EVMChain.HYDRATEST.toString(), 
				"Hydra Chain Testnet", 
				8844L, 
				BlockchainType.BORKED.toString(), 
				new EVMCurrency("Hydra Chain Testnet Gas Token", "tHYDRA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.hydrachain.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://hydragon.hydrachain.org");
				}},
				new ArrayList<String>() {{
					this.add("https://app.testnet.hydrachain.org/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/8844");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.HYDRATEST, hydra_test);

		// aleph_test
		EVMChainInfo aleph_test = new EVMChainInfo(
				EVMChain.ALEPHTEST.toString(), 
				"Aleph Zero Testnet", 
				2039L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Aleph Zero Testnet Gas Token", "TZERO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.alephzero-testnet.gelato.digital");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://test.azero.dev/#/explorer");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2039");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ALEPHTEST, aleph_test);

		// oraichain
		EVMChainInfo oraichain = new EVMChainInfo(
				EVMChain.ORAICHAIN.toString(), 
				"Oraichain Mainnet", 
				108160679L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Oraichain Mainnet Gas Token", "ORAI", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://evm.orai.io");
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
					this.add("https://chainlist.org/chain/108160679");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ORAICHAIN, oraichain);

		// carbonium_test
		EVMChainInfo carbonium_test = new EVMChainInfo(
				EVMChain.CARBONIUMTEST.toString(), 
				"Carbonium Testnet Network", 
				4040L, 
				BlockchainType.BORKED.toString(), // unstable
				new EVMCurrency("Carbonium Testnet Network Gas Token", "tCBR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-dev.carbonium.network/");
					this.add("https://server-testnet.carbonium.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.carboniumscan.com");
				}},
				new ArrayList<String>() {{
					this.add("https://getfaucet.carbonium.network");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/4040");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CARBONIUMTEST, carbonium_test);

		// algen_test
		EVMChainInfo algen_test = new EVMChainInfo(
				EVMChain.ALGENTEST.toString(), 
				"Algen Testnet", 
				8912L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Algen Testnet Gas Token", "ALG", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.test.algen.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.test.algen.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/8912");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ALGENTEST, algen_test);

		// algenl2_test
		EVMChainInfo algenl2_test = new EVMChainInfo(
				EVMChain.ALGENL2TEST.toString(), 
				"Algen Layer2 Testnet", 
				8922L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Algen Layer2 Testnet Gas Token", "ALG", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.alg2-test.algen.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.alg2-test.algen.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/8922");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ALGENL2TEST, algenl2_test);	

		// cmrangers_test
		EVMChainInfo cmrangers_test = new EVMChainInfo(
				EVMChain.CMRANGERSTEST.toString(), 
				"Rangers ConnectorManager Testnet", 
				38401L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Rangers ConnectorManager Testnet Token Gas Token", "ttRPG", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"9000000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://robin-cm.rangersprotocol.com/api/jsonrpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://robin-rangersscan.rangersprotocol.com");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge.rangersprotocol.com");
				}},
				new ArrayList<String>() {{
					this.add("https://rangersprotocol.com");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CMRANGERSTEST, cmrangers_test);

		// rangers_test
		EVMChainInfo rangers_test = new EVMChainInfo(
				EVMChain.RANGERSTEST.toString(), 
				"Rangers Protocol Testnet Robin", 
				9527L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Rangers Protocol Testnet Robin Gas Token", "tRPG", 18), 
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
		networks.put(EVMChain.RANGERSTEST, rangers_test);

		// siberium_test
		EVMChainInfo siberium_test = new EVMChainInfo(
				EVMChain.SIBERIUMTEST.toString(), 
				"Siberium Test Network", 
				111000L, 
				BlockchainType.BORKED.toString(), // single node unstable
				new EVMCurrency("Siberium Test Network Gas Token", "SIBR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"8400000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.test.siberium.net");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.test.siberium.net");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/111000");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SIBERIUMTEST, siberium_test);

		// rari_test
		EVMChainInfo rari_test = new EVMChainInfo(
				EVMChain.RARITEST.toString(), 
				"RARI Testnet", 
				1918988905L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("RARI Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"8400000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://testnet.rpc.rarichain.org/http");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.rarichain.org/");
				}},
				new ArrayList<String>() {{
					this.add("Arbitrum Sepolia -> Rari: https://bridge.rarichain.org/");
					this.add("https://info.rarichain.org/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://info.rarichain.org/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.RARITEST, rari_test);

		// dchain_test
		EVMChainInfo dchain_test = new EVMChainInfo(
				EVMChain.DCHAINTEST.toString(), 
				"DCHAIN Testnet", 
				2713017997578000L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("DCHAIN Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://dchaintestnet-2713017997578000-1.jsonrpc.testnet.sagarpc.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://dchaintestnet-2713017997578000-1.testnet.sagaexplorer.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2713017997578000");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DCHAINTEST, dchain_test);

		// xai_test
		EVMChainInfo xai_test2 = new EVMChainInfo(
				EVMChain.XAITEST2.toString(), 
				"Xai Testnet v2", 
				37714555429L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Xai Testnet v2 Gas Token", "sXAI", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-v2.xai-chain.net/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-explorer-v2.xai-chain.net");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/37714555429");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.XAITEST2, xai_test2);

		// flare_test
		EVMChainInfo flare_test = new EVMChainInfo(
				EVMChain.FLARECOSTONTEST.toString(), 
				"Flare Testnet Coston", 
				16L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Flare Testnet Coston Gas Token", "CFLR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"8400000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://coston-api.flare.network/ext/bc/C/rpc");
					this.add("https://coston-api.flare.network/ext/C/rpc");
					this.add("https://songbird-testnet-coston.rpc.thirdweb.com");
					this.add("https://01-gravelines-004-01.rpc.tatum.io/ext/bc/C/rpc");
					this.add("https://02-chicago-004-02.rpc.tatum.io/ext/bc/C/rpc");
					this.add("https://02-tokyo-004-03.rpc.tatum.io/ext/bc/C/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://coston-explorer.flare.network");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/16");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FLARECOSTONTEST, flare_test);

		// flare_test2
		EVMChainInfo flare_test2 = new EVMChainInfo(
				EVMChain.FLARECOSTON2TEST.toString(), 
				"Flare Testnet Coston2", 
				114L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Flare Testnet Coston2 Gas Token", "C2FLR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"3200000", 
				new ArrayList<String>() {{
					this.add("https://coston2-api.flare.network/ext/bc/C/rpc");
					this.add("https://coston2-api.flare.network/ext/C/rpc");
					this.add("https://flare-testnet-coston2.rpc.thirdweb.com");
					this.add("https://flaretestnet-bundler.etherspot.io");
					this.add("https://coston2.enosys.global/ext/C/rpc");
					this.add("https://01-gravelines-005-01.rpc.tatum.io/ext/bc/C/rpc");
					this.add("https://02-chicago-005-02.rpc.tatum.io/ext/bc/C/rpc");
					this.add("https://02-tokyo-005-03.rpc.tatum.io/ext/bc/C/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://coston2-explorer.flare.network");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/114");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FLARECOSTON2TEST, flare_test2);

		// camdl_test
		EVMChainInfo camdl_test = new EVMChainInfo(
				EVMChain.CAMDLTEST.toString(), 
				"CamDL Testnet", 
				395L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("CamDL Testnet Gas Token", "CADL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc1.testnet.camdl.gov.kh/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.camdl.gov.kh");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.testnet.camdl.gov.kh/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/395");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CAMDLTEST, camdl_test);

		// game7_test
		EVMChainInfo game7_test = new EVMChainInfo(
				EVMChain.GAME7TEST.toString(), 
				"Game7 Testnet", 
				13746L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Game7 Testnet Gas Token", "TG7T", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.game7.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.game7.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/13746");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.GAME7TEST, game7_test);
		
		// astra_test
		EVMChainInfo astra_test = new EVMChainInfo(
				EVMChain.ASTRATEST.toString(), 
				"Astra Sepolia", 
				19777L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Astra Sepolia Gas Token", "ATX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-astra-9on2f72wzn.t.conduit.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-astra-9on2f72wzn.t.conduit.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/19777");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ASTRATEST, astra_test);
		
		// arcturus_test
		EVMChainInfo arcturus_test = new EVMChainInfo(
				EVMChain.ARCTURUSTEST.toString(), 
				"Arcturus Testneet", 
				5615L, 
				BlockchainType.BORKED.toString(), // 502 from single node
				new EVMCurrency("Arcturus Testneet Gas Token", "tARC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.arcturuschain.io/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.arcscan.net");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.arcturuschain.io");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/5615");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ARCTURUSTEST, arcturus_test);

		// w3gamezholesky_test
		EVMChainInfo w3gamezholesky_test = new EVMChainInfo(
				EVMChain.W3GAMEZTEST.toString(), 
				"W3Gamez Holesky Testnet", 
				32001L, 
				BlockchainType.BORKED.toString(), // unstable single node
				new EVMCurrency("W3Gamez Holesky Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"3200000", // +0 gives exceeds block gas limit 
				new ArrayList<String>() {{
					this.add("https://rpc-holesky.w3gamez.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://w3gamez-holesky.web3games.com");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/32001");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.W3GAMEZTEST, w3gamezholesky_test);

		// holesky_test
		EVMChainInfo holesky_test = new EVMChainInfo(
				EVMChain.HOLESKYTEST.toString(), 
				"Holesky Test Network", 
				17000L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Holesky Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"3200000", // +0 gives exceeds block gas limit 
				new ArrayList<String>() {{
					this.add("https://1rpc.io/holesky");
					this.add("https://rpc-holesky.rockx.com");
					this.add("https://rpc.holesky.ethpandaops.io");
					this.add("https://ethereum-holesky.publicnode.com");
					this.add("https://ethereum-holesky-rpc.publicnode.com");
					this.add("https://holesky.drpc.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://holesky.beaconcha.in");
				}},
				new ArrayList<String>() {{
					this.add("https://holesky-faucet.pk910.de");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/17000");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.HOLESKYTEST, holesky_test);

		// garnet
		EVMChainInfo garnet = new EVMChainInfo(
				EVMChain.GARNETTEST.toString(), 
				"Garnet Holesky", 
				17069L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Garnet Holesky Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.garnetchain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.garnetchain.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/17069");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.GARNETTEST, garnet);

		// dreyerx_test
		EVMChainInfo dreyerx_test = new EVMChainInfo(
				EVMChain.DREYERXTEST.toString(), 
				"DreyerX Testnet", 
				23452L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("DreyerX Testnet Gas Token", "DRX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.dreyerx.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-scan.dreyerx.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/23452");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DREYERXTEST, dreyerx_test);

		// vizing_test
		EVMChainInfo vizing_test = new EVMChainInfo(
				EVMChain.VIZINGTEST.toString(), 
				"Vizing Testnet", 
				28516L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Vizing Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-sepolia.vizing.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-sepolia.vizing.com");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge-sepolia.vizing.com/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/28516");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.VIZINGTEST, vizing_test);

		// kaichain_test
		EVMChainInfo kaichain_test = new EVMChainInfo(
				EVMChain.KAICHAINTEST.toString(), 
				"KaiChain Testnet", 
				29536L, 
				BlockchainType.BORKED.toString(), // single node giving 500 responses
				new EVMCurrency("KaiChain Testnet Gas Token", "KEC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.kaichain.net");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-explorer.kaichain.net");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.kaichain.net");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/29536");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.KAICHAINTEST, kaichain_test);


		// dodochain
		EVMChainInfo dodochain = new EVMChainInfo(
				EVMChain.DODOCHAINTEST.toString(), 
				"DODOchain testnet", 
				53457L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("DODOchain testnet Gas Token", "DODO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://dodochain-testnet.alt.technology");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-scan.dodochain.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/53457");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DODOCHAINTEST, dodochain);

		// testnet_test
		EVMChainInfo testnet_test = new EVMChainInfo(
				EVMChain.ZEROONETEST.toString(), 
				"Testnet Zeroone Subnet", 
				56400L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Testnet Zeroone Subnet Gas Token", "ZERO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/testnetzer/testnet/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://subnets-test.avax.network/testnetzer");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/56400");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZEROONETEST, testnet_test);

		// photon_test
		EVMChainInfo photon_test = new EVMChainInfo(
				EVMChain.PHOTONTEST.toString(), 
				"Photon Testnet", 
				54555L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Photon Testnet Gas Token", "PTON", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-test.photonchain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.photonchain.io");
				}},
				new ArrayList<String>() {{
					this.add("https://photonchain.io/airdrop");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/54555");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PHOTONTEST, photon_test);

		// linea
		EVMChainInfo linea_sep_test = new EVMChainInfo(
				EVMChain.LINEASEPOLIATEST.toString(), 
				"Linea Sepolia", 
				59141L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Linea Sepolia Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://linea-sepolia-rpc.publicnode.com");
					this.add("https://rpc.sepolia.linea.build");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.sepolia.linea.build");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/59141");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.LINEASEPOLIATEST, linea_sep_test);

		// optopia_test
		EVMChainInfo optopia_test = new EVMChainInfo(
				EVMChain.OPTOPIATEST.toString(), 
				"OPTOPIA Testnet", 
				62049L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("OPTOPIA Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.optopia.ai");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan-testnet.optopia.ai");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/62049");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.OPTOPIATEST, optopia_test);

		// icb_test
		EVMChainInfo icb_test = new EVMChainInfo(
				EVMChain.ICBTEST.toString(), 
				"ICB Testnet", 
				73114L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("ICB Testnet Gas Token", "ICBT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc2-testnet.icbnetwork.info/");
					this.add("https://rpc1-testnet.icbnetwork.info/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.icbscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/73114");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ICBTEST, icb_test);

		// zilliqa-2_test
		EVMChainInfo zilliqa2_test = new EVMChainInfo(
				EVMChain.ZILLIQA2TEST.toString(), 
				"Zilliqa-2 EVM Devnet", 
				33469L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Zilliqa-2 EVM Devnet Gas Token", "ZIL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://api.zq2-devnet.zilliqa.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.zq2-devnet.zilliqa.com");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.zq2-devnet.zilliqa.com");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/33469");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZILLIQA2TEST, zilliqa2_test);

		// boba_sepolia_test
		EVMChainInfo boba_sepolia_test = new EVMChainInfo(
				EVMChain.BOBASEPOLIATEST.toString(), 
				"Boba Sepolia", 
				28882L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Boba Sepolia Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://boba-sepolia.gateway.tenderly.co");
					this.add("https://gateway.tenderly.co/public/boba-sepolia");
					this.add("https://sepolia.boba.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.bobascan.com");
				}},
				new ArrayList<String>() {{
					this.add("https://www.l2faucet.com/boba");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/28882");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BOBASEPOLIATEST, boba_sepolia_test);

		// nanon_sepolia_test
		EVMChainInfo nanon_sepolia_test = new EVMChainInfo(
				EVMChain.NANONTEST.toString(), 
				"Nanon Sepolia", 
				27483L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Nanon Sepolia Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://sepolia-rpc.nanon.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sepolia-explorer.nanon.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/27483");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.NANONTEST, nanon_sepolia_test);

		// titan_test
		EVMChainInfo titan_test = new EVMChainInfo(
				EVMChain.TITANTEST.toString(), 
				"Titan (TKX) Testnet", 
				18889L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Titan (TKX) Testnet Gas Token", "TKX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://titan-testnet-json-rpc-1.tokenize-dev.com");
					this.add("https://titan-testnet-json-rpc-2.tokenize-dev.com");
					this.add("https://titan-testnet-json-rpc.titanlab.io");
					this.add("https://titan-testnet-json-rpc-1.titanlab.io");
					this.add("https://titan-testnet-json-rpc-2.titanlab.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://titan-testnet-explorer-light.tokenize-dev.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/18889");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TITANTEST, titan_test);

		// alveychain_test
		EVMChainInfo alveychain_test = new EVMChainInfo(
				EVMChain.ALVEYCHAINTEST.toString(), 
				"AlveyChain Testnet", 
				25839L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("AlveyChain Testnet Gas Token", "tALV", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.alvey.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://alveytestnet.com");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.alveytestnet.com");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/25839");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ALVEYCHAINTEST, alveychain_test);

		// taiko6_test
		EVMChainInfo taiko6_test = new EVMChainInfo(
				EVMChain.TAIKOALPHA6TEST.toString(), 
				"Taiko Katla L2 Test Network", 
				167008L, 
				BlockchainType.BORKED.toString(), // replaced by TAIKOALPHA7TEST
				new EVMCurrency("Taiko Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"3200000",
				new ArrayList<String>() {{
					this.add("https://rpc.katla.taiko.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.katla.taiko.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge.katla.taiko.xyz/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/167008");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TAIKOALPHA6TEST, taiko6_test);

		// filecoin_calibration_test
		EVMChainInfo filecoin_calibration_test = new EVMChainInfo(
				EVMChain.FILECOINCALIBRATIONTEST.toString(), 
				"Filecoin - Calibration testnet", 
				314159L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Filecoin Calibration testnet Gas Token", "tFIL", 18), 
				EVMPriceMechanism.EIP1559.toString(),
				30, // confirmation timeout in seconds
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"8400000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://api.calibration.node.glif.io/rpc/v1");
					this.add("https://rpc.ankr.com/filecoin_testnet");
					this.add("https://filecoin-calibration.chainup.net/rpc/v1");
					this.add("https://calibration.filfox.info/rpc/v1");
					this.add("https://filecoin-calibration.drpc.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://filecoin-calibration.chainup.net/rpc/v1");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://calibration.filscan.io");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FILECOINCALIBRATIONTEST, filecoin_calibration_test);

		// debank_test
		EVMChainInfo debank_test = new EVMChainInfo(
				EVMChain.DEBANKTEST.toString(), 
				"DeBank Sepolia Testnet", 
				20240324L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("DeBank Sepolia Testnet Gas Token", "USD", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://sepolia-rpc.testnet.debank.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sepolia-explorer.testnet.debank.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/20240324");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DEBANKTEST, debank_test);

		// galadriel_test
		EVMChainInfo galadriel_test = new EVMChainInfo(
				EVMChain.GALADRIELTEST.toString(), 
				"Galadriel Testnet", 
				696969L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Galadriel Testnet Gas Token", "GAL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet.galadriel.com");
					this.add("https://devnet.galadriel.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.galadriel.com");
				}},
				new ArrayList<String>() {{
					this.add("https://docs.galadriel.com/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/696969");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.GALADRIELTEST, galadriel_test);

		// zkamoeba_test
		EVMChainInfo zkamoeba_test = new EVMChainInfo(
				EVMChain.ZKAMOEBATEST.toString(), 
				"Filecoin L2 Testnet (ZKAMOEBA)", 
				380L, 
				BlockchainType.BORKED.toString(), // unstable
				new EVMCurrency("ZKAMOEBA Testnet Gas Token", "tFIL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"8400000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.zkamoeba.com:4050/");
					this.add("https://rpc1.testnet.zkamoeba.com:4050/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.zkamoeba.com/");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://www.zkamoeba.com/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZKAMOEBATEST, zkamoeba_test);

		// liquidlayer_test
		EVMChainInfo liquidlayer_test = new EVMChainInfo(
				EVMChain.LIQUIDLAYERTEST.toString(), 
				"LiquidLayer Testnet", 
				93572L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("LiquidLayer Testnet Gas Token", "LILA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://testnet.liquidlayer.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-scan.liquidlayer.network");
				}},
				new ArrayList<String>() {{
					this.add("https://claim.liquidlayer.network/");
				}},
				new ArrayList<String>() {{
					this.add("https://liquidlayer.network");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.LIQUIDLAYERTEST, liquidlayer_test);

		// eclipse_test
		EVMChainInfo eclipsecha_test = new EVMChainInfo(
				EVMChain.ECLIPSECHATEST.toString(), 
				"Eclipse Testnet", 
				555666L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Eclipse Testnet Gas Token", "ECLPS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/eclipsecha/testnet/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://subnets-test.avax.network/eclipsecha");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/555666");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ECLIPSECHATEST, eclipsecha_test);

		// avax_eclipse_test
		EVMChainInfo avax_eclipse_test = new EVMChainInfo(
				EVMChain.ECLIPSETEST.toString(), 
				"Eclipse Subnet", 
				17172L, 
				BlockchainType.BORKED.toString(), // single node often offline atm
				new EVMCurrency("Eclipse Subnet Gas Token", "ECLP", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"8400000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/eclipse/testnet/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://subnets-test.avax.network/eclipse");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://subnets-test.avax.network/eclipse");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ECLIPSETEST, avax_eclipse_test);

		// xdc_test
		EVMChainInfo xdc_test = new EVMChainInfo(
				EVMChain.XDCAPOTHEMTEST.toString(), 
				"XDC Apothem Network", 
				51L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("XDC Apothem Network Gas Token", "TXDC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"8400000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.apothem.network");
					this.add("https://erpc.apothem.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://apothem.xinfinscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/51");
					this.add("https://xinfin.network/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.XDCAPOTHEMTEST, xdc_test);

		// telos_test
		EVMChainInfo telos_test = new EVMChainInfo(
				EVMChain.TELOSTEST.toString(), 
				"Telos EVM Testnet", 
				41L, 
				BlockchainType.BORKED.toString(), // 503 from available nodes
				new EVMCurrency("Telos EVM Testnet Gas Token", "TLOS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"8400000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://testnet.telos.net/evm");
					this.add("https://telos-testnet.drpc.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.teloscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/41");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TELOSTEST, telos_test);

		// ethernity_test
		EVMChainInfo ethernity_test = new EVMChainInfo(
				EVMChain.ETHERNITYTEST.toString(), 
				"Ethernity Testnet", 
				233L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Ethernity Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet.ethernitychain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.ernscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/233");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ETHERNITYTEST, ethernity_test);
		
		// tobe_test
		EVMChainInfo tobe_test = new EVMChainInfo(
				EVMChain.TOBETEST.toString(), 
				"Tobe Chain Testnet", 
				4080L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Tobe Chain Testnet Gas Token", "TOBE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.tobescan.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.tobescan.com");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.tobescan.com/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/4080");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TOBETEST, tobe_test);
		
		// uxer_test
		EVMChainInfo uxer_test = new EVMChainInfo(
				EVMChain.UXERTEST.toString(), 
				"UXER TESTNET NETWORK", 
				9966L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("UXER TESTNET NETWORK Gas Token", "tUXER", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://dev-testnet.uxer.network");
					this.add("https://data-cloud-testnet.uxer.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.uxer.network");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.uxer.network");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/9966");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.UXERTEST, uxer_test);
		
		// lumoz_test
		EVMChainInfo lumoz_test = new EVMChainInfo(
				EVMChain.LUMOZTEST.toString(), 
				"Lumoz Quidditch Testnet", 
				58680L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Lumoz Quidditch Testnet Gas Token", "MOZ", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://quidditch-rpc.lumoz.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://quidditch.lumoz.info");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/58680");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.LUMOZTEST, lumoz_test);
		
		// toliman_test
		EVMChainInfo toliman_test = new EVMChainInfo(
				EVMChain.TOLIMANTEST.toString(), 
				"Toliman Suave Testnet", 
				33626250L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Toliman Suave Testnet Gas Token", "TEEth", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.toliman.suave.flashbots.net");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.toliman.suave.flashbots.net");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.toliman.suave.flashbots.net");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/33626250");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TOLIMANTEST, toliman_test);
		
		// dogechain_test
		EVMChainInfo dogechain_test = new EVMChainInfo(
				EVMChain.DOGECHAINTEST.toString(), 
				"Dogechain Testnet", 
				568L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Dogechain Testnet Gas Token", "DOGE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"8400000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.dogechain.dog");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-testnet.dogechain.dog");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://dogechain.dog");
					this.add("https://chainlist.org/chain/568");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DOGECHAINTEST, dogechain_test);

		// fncy_test
		EVMChainInfo fncy_test = new EVMChainInfo(
				EVMChain.FNCYTEST.toString(), 
				"FNCY Testnet", 
				923018L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("FNCY Testnet Gas Token", "FNCY", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"8400000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://fncy-testnet-seed.fncy.world");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://fncyscan-testnet.fncy.world");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://www.coingecko.com/en/coins/fncy");
					this.add("https://fncy.world/");
					this.add("https://chainlist.org/chain/923018");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FNCYTEST, fncy_test);

		// milkc1_test
		EVMChainInfo milkc1_test = new EVMChainInfo(
				EVMChain.MILKOMEDAC1TEST.toString(), 
				"Milkomeda C1 Testnet", 
				200101L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Milkomeda C1 Testnet Gas Token", "mTAda", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"8400000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc-devnet-cardano-evm.c1.milkomeda.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-devnet-cardano-evm.c1.milkomeda.com");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/200101");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MILKOMEDAC1TEST, milkc1_test);

		// blastsepolia_test
		EVMChainInfo blastsepolia_test = new EVMChainInfo(
				EVMChain.BLASTSEPOLIATEST.toString(), 
				"Blast Sepolia Testnet", 
				168587773L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Blast Sepolia Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"8400000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://sepolia.blast.io");
					this.add("https://blast-sepolia.drpc.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.blastscan.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.quicknode.com/blast/sepolia");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/168587773");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BLASTSEPOLIATEST, blastsepolia_test);

		// arbitrumsep
		EVMChainInfo arbitrumsep = new EVMChainInfo(
				EVMChain.ARBITRUMSEPOLIATEST.toString(), 
				"Arbitrum Sepolia", 
				421614L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Arbitrum Sepolia Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"8400000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://arbitrum-sepolia.blockpi.network/v1/rpc/public");
					this.add("https://sepolia-rollup.arbitrum.io/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sepolia-explorer.arbitrum.io");
				}},
				new ArrayList<String>() {{
					this.add("https://bwarelabs.com/faucets/arbitrum-sepolia");
					this.add("Sepolia -> Arbitrum Sepolia: https://bridge.arbitrum.io/?l2ChainId=421614");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/421614");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ARBITRUMSEPOLIATEST, arbitrumsep);

		// hedera_test
		EVMChainInfo hedera_test = new EVMChainInfo(
				EVMChain.HEDERATEST.toString(), 
				"Hedera Testnet", 
				296L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Hedera Testnet Gas Token", "HBAR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"8400000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://testnet.hashio.io/api");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://hashscan.io/testnet");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://hedera.com/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.HEDERATEST, hedera_test);

		// abstract_test
		EVMChainInfo abstract_test = new EVMChainInfo(
				EVMChain.ABSTRACTTEST.toString(), 
				"Abstract Testnet", 
				11124L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Abstract Testnet Gas Token", "ETH", 18), 
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
					this.add("https://explorer.testnet.abs.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.triangleplatform.com/abstract/testnet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/11124");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ABSTRACTTEST, abstract_test);
		
		// fuse_test
		EVMChainInfo fuse_test = new EVMChainInfo(
				EVMChain.FUSETEST.toString(), 
				"Fuse Testnet", 
				12001L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Fuse Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.flash.fuse.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.flash.fuse.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.flash.fuse.io");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/12001");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FUSETEST, fuse_test);
		
		// joc_test
		EVMChainInfo joc_test = new EVMChainInfo(
				EVMChain.JOCTEST.toString(), 
				"Japan Open Chain Testnet", 
				10081L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Japan Open Chain Gas Token", "JOCT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"8400000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc-3.testnet.japanopenchain.org");
					this.add("https://rpc-1.testnet.japanopenchain.org:8545");
					this.add("https://rpc-2.testnet.japanopenchain.org:8545");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.japanopenchain.org");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://japanopenchain.org");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.JOCTEST, joc_test);

		// zkfair_test
		EVMChainInfo zkfair_test = new EVMChainInfo(
				EVMChain.ZKFAIRTEST.toString(), 
				"ZKFair Testnet", 
				43851L, 
				BlockchainType.BORKED.toString(), // single node gone
				new EVMCurrency("ZKFair Testnet Gas Token", "USDC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"8400000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.zkfair.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-scan.zkfair.io");
				}},
				new ArrayList<String>() {{
					this.add("https://testnet-wallet.zkfair.io/");
				}},
				new ArrayList<String>() {{
					this.add("https://zkfair.io");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZKFAIRTEST, zkfair_test);

		// xai_test
		EVMChainInfo xai_test = new EVMChainInfo(
				EVMChain.XAITEST.toString(), 
				"Xai Orbit Goerli Testnet", 
				47279324479L, 
				BlockchainType.BORKED.toString(), // nodes gone
				new EVMCurrency("XAI Testnet Gas Token", "GETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"8400000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://testnet.xai-chain.net/rpc");
					this.add("https://xai-goerli-orbit.rpc.thirdweb.com/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-explorer.xai-chain.net/");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge.arbitrum.io/?l2ChainId=47279324479");
				}},
				new ArrayList<String>() {{
					this.add("https://xai-foundation.gitbook.io/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.XAITEST, xai_test);

		// manta_test_sepolia
		EVMChainInfo manta_test_sepolia = new EVMChainInfo(
				EVMChain.MANTASEPOLIATEST.toString(), 
				"Manta Pacific Sepolia Testnet", 
				3441006L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Manta Pacific Sepolia Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://pacific-rpc.sepolia-testnet.manta.network/http");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://pacific-explorer.sepolia-testnet.manta.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/3441006");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MANTASEPOLIATEST, manta_test_sepolia);

		// manta_test
		EVMChainInfo manta_test = new EVMChainInfo(
				EVMChain.MANTATEST.toString(), 
				"Manta Pacific Testnet", 
				3441005L, 
				BlockchainType.BORKED.toString(), // unstable nodes
				new EVMCurrency("Manta Gas Token", "MANTA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://manta-testnet.calderachain.xyz/http");
					this.add("https://manta-pacific-testnet.drpc.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://manta-testnet.calderaexplorer.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<todo insert faucet>");
				}},
				new ArrayList<String>() {{
					this.add("https://manta.network");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MANTATEST, manta_test);

		// zkatana_test
		EVMChainInfo zkatana_test = new EVMChainInfo(
				EVMChain.ZKATANATEST.toString(), 
				"zKatana Testnet", 
				1261120L, 
				BlockchainType.BORKED.toString(), // dead nodes or Invalid response received: 400; {"id":205,"jsonrpc":"2.0","error":{"message":"the method eth_blockNumber does not exist/is not available","code":32601}}
				new EVMCurrency("zKatana Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.startale.com/zkatana");
					this.add("https://astar-zkatana.drpc.org");
					this.add("https://rpc.zkatana.gelato.digital");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://zkatana.explorer.startale.com");
				}},
				new ArrayList<String>() {{
					this.add("<todo insert faucet>");
				}},
				new ArrayList<String>() {{
					this.add("https://portal.astar.network");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZKATANATEST, zkatana_test);

		// openfabric_test
		EVMChainInfo openfabric_test = new EVMChainInfo(
				EVMChain.OPENFABRICTEST.toString(), 
				"OpenFabric Testnet", 
				185947263L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("OpenFabric Gas Token", "tstOFN", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.openfabric.dev");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.openfabric.dev/");
				}},
				new ArrayList<String>() {{
					this.add("<todo insert faucet>");
				}},
				new ArrayList<String>() {{
					this.add("https://openfabric.dev");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.OPENFABRICTEST, openfabric_test);

		// gnosis_test
		EVMChainInfo gnosis_test = new EVMChainInfo(
				EVMChain.GNOSISTEST.toString(), 
				"Gnosis Chiado Testnet", 
				10200L, 
				BlockchainType.BORKED.toString(), // unstable
				new EVMCurrency("Gnosis Gas Token", "xDai", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://1rpc.io/gnosis");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://blockscout.chiadochain.net");
				}},
				new ArrayList<String>() {{
					this.add("https://www.gnosisfaucet.com/");
				}},
				new ArrayList<String>() {{
					this.add("https://www.gnosis.io/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.GNOSISTEST, gnosis_test);

		// immutable_test
		EVMChainInfo immutable_test = new EVMChainInfo(
				EVMChain.IMMUTABLEZKEVMTEST.toString(), 
				"Immutable zkEVM Testnet", 
				13473L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Immutable zkEVM Testnet Gas Token", "tIMX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.immutable.com");
					this.add("https://immutable-zkevm-testnet.drpc.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.immutable.com");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://immutable.com");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.IMMUTABLEZKEVMTEST, immutable_test);

		// eos_test
		EVMChainInfo eos_test = new EVMChainInfo(
				EVMChain.EOSEVMTEST.toString(), 
				"EOS EVM Network", 
				15557L, 
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
					this.add("https://explorer.testnet.evm.eosnetwork.com");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://eosnetwork.com");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.EOSEVMTEST, eos_test);

		// lamina1_betanet
		EVMChainInfo lamina1_betanet = new EVMChainInfo(
				EVMChain.LAMINA1BETATEST.toString(), 
				"Lamina1 Betanet", 
				7649L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Lamina1 Gas Token", "L1", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc-betanet.lamina1.com/ext/bc/C/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.lamina1.com");
				}},
				new ArrayList<String>() {{
					this.add("<todo bridge/faucet>");
				}},
				new ArrayList<String>() {{
					this.add("https://www.mantle.xyz/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.LAMINA1BETATEST, lamina1_betanet);

		// mantle_testnet
		EVMChainInfo mantletest = new EVMChainInfo(
				EVMChain.MANTLETEST.toString(), 
				"Mantle Testnet", 
				5001L, 
				BlockchainType.BORKED.toString(), // nonce incorrect at times
				new EVMCurrency("Mantle Testnet Gas Token", "MNT", 18),
				//EVMPriceMechanism.LEGACY.toString(),
				EVMPriceMechanism.EIP1559.toString(),
				30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"99000000", // mantle needs crazy thresholds for some reason
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.mantle.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.mantle.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.testnet.mantle.xyz");
					this.add("https://bridge.testnet.mantle.xyz");
					this.add("https://goerli.etherscan.io/address/0xc1dc2d65a2243c22344e725677a3e3bebd26e604#writeProxyContract mint()");
				}},
				new ArrayList<String>() {{
					this.add("https://www.mantle.xyz/");
				}},
				BlockchainTokenDetailsEVM.generateMantleTestnetTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MANTLETEST, mantletest);

		// mantlesepolia_testnet
		EVMChainInfo mantlesepolia_testnet = new EVMChainInfo(
				EVMChain.MANTLESEPOLIATEST.toString(), 
				"Mantle Sepolia Testnet", 
				5003L, 
				BlockchainType.BORKED.toString(), // unstable
				new EVMCurrency("Mantle Gas Token", "MNT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.sepolia.mantle.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.sepolia.mantle.xyz");
				}},
				new ArrayList<String>() {{
					this.add("faucet todo");
				}},
				new ArrayList<String>() {{
					this.add("https://www.mantle.xyz/");
				}},
				BlockchainTokenDetailsEVM.generateMantleTestnetTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MANTLESEPOLIATEST, mantlesepolia_testnet);

		// opbnb_test
		EVMChainInfo opbnb_test = new EVMChainInfo(
				EVMChain.OPBNBTEST.toString(), 
				"opBNB Testnet", 
				5611L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("opBNB Gas Token", "tBNB", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://opbnb-testnet-rpc.bnbchain.org");
					this.add("https://opbnb-testnet.nodereal.io/v1/64a9df0874fb4a93b9d0a3849de012d3");
					this.add("https://opbnb-testnet.nodereal.io/v1/e9a36765eb8a40b9bd12e680a1fd2bc5");	
					this.add("https://opbnb-testnet-rpc.publicnode.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.opbnbscan.com");
				}},
				new ArrayList<String>() {{
					this.add("https://opbnb-testnet-bridge.bnbchain.org/deposit");
				}},
				new ArrayList<String>() {{
					this.add("https://opbnb.bnbchain.org");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.OPBNBTEST, opbnb_test);

		// ethxy_test
		EVMChainInfo ethxy_test = new EVMChainInfo(
				EVMChain.ETHXYTEST.toString(), 
				"EthXY Testnet", 
				979L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("EthXY Testnet Gas Token", "SEXY", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.ethxy.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.ethxy.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/979");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ETHXYTEST, ethxy_test);

		// iota_test
		EVMChainInfo iota_test = new EVMChainInfo(
				EVMChain.IOTATEST.toString(), 
				"IOTA EVM Testnet", 
				1075L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("IOTA EVM Testnet Gas Token", "IOTA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://json-rpc.evm.testnet.iotaledger.net");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.evm.testnet.iotaledger.net");
				}},
				new ArrayList<String>() {{
					this.add("https://evm-toolkit.evm.testnet.iotaledger.net");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1075");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.IOTATEST, iota_test);

		// b2_test
		EVMChainInfo b2_test = new EVMChainInfo(
				EVMChain.B2TEST.toString(), 
				"B2 Testnet", 
				1123L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("B2 Testnet Gas Token", "BTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.ankr.com/b2_testnet");
					this.add("https://testnet-rpc.bsquared.network");
					this.add("https://b2-testnet.alt.technology");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-explorer.bsquared.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1123");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.B2TEST, b2_test);

		// cycle_test
		EVMChainInfo cycle_test = new EVMChainInfo(
				EVMChain.CYCLETEST.toString(), 
				"Cycle Network Testnet", 
				1221L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Cycle Network Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.cyclenetwork.io");
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
					this.add("https://chainlist.org/chain/1221");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CYCLETEST, cycle_test);

		// kroma sepolia
		EVMChainInfo kromasep = new EVMChainInfo(
				EVMChain.KROMASEPOLIATEST.toString(), 
				"Kroma Sepolia", 
				2358L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Kroma Sepolia Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://api.sepolia.kroma.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://blockscout.sepolia.kroma.network");
				}},
				new ArrayList<String>() {{
					this.add("https://kroma.network/bridge");
				}},
				new ArrayList<String>() {{
					this.add("kroma.network");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.KROMASEPOLIATEST, kromasep);

		// zora sepolia
		EVMChainInfo zorasep = new EVMChainInfo(
				EVMChain.ZORASEPOLIATEST.toString(), 
				"Zora Sepolia Testnet", 
				999999999L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Zora Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://sepolia.rpc.zora.energy");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sepolia.explorer.zora.energy");
				}},
				new ArrayList<String>() {{
					this.add("https://testnet.bridge.zora.energy/");
				}},
				new ArrayList<String>() {{
					this.add("https://zora.energy");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZORASEPOLIATEST, zorasep);

		// zora goerli
		EVMChainInfo zoratest = new EVMChainInfo(
				EVMChain.ZORAGOERLITEST.toString(), 
				"Zora Goerli Testnet", 
				999L, 
				BlockchainType.BORKED.toString(), // Unstable
				new EVMCurrency("Zora Testnet Gas Token", "GöETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://testnet.rpc.zora.co");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.explorer.zora.co");
					this.add("https://goerli.etherscan.io/address/0xDb9F51790365e7dc196e7D072728df39Be958ACe");
				}},
				new ArrayList<String>() {{
					this.add("https://bridgetozora.world/");
				}},
				new ArrayList<String>() {{
					this.add("https://zora.energy");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZORAGOERLITEST, zoratest);

		// tomochain_test
		EVMChainInfo tomochain_test = new EVMChainInfo(
				EVMChain.TOMOCHAINTEST.toString(), 
				"Tomochain Mainnet", 
				89L, 
				BlockchainType.BORKED.toString(), // single node no longer resolves
				new EVMCurrency("Tomo Gas Token", "TOMO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.tomochain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.testnet.tomochain.com");
				}},
				new ArrayList<String>() {{
					this.add("<todo faucet>");
				}},
				new ArrayList<String>() {{
					this.add("https://tomochain.com");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TOMOCHAINTEST, tomochain_test);

		// tenettest
		EVMChainInfo tenettest = new EVMChainInfo(
				EVMChain.TENETTEST.toString(), 
				"Tenet Testnet", 
				155L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("TENET Gas Token", "TENET", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.tenet.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.tenetscan.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.testnet.tenet.org/");
				}},
				new ArrayList<String>() {{
					this.add("https://tenet.org");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TENETTEST, tenettest);

		// karura_test
		EVMChainInfo karura_test = new EVMChainInfo(
				EVMChain.KARURATEST.toString(), 
				"KARURA Testnet", 
				596L, 
				BlockchainType.BORKED.toString(), // no rpcs
				new EVMCurrency("KARURA Test Token", "KAR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://eth-rpc-karura-testnet.aca-staging.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("todo block explorer");
				}},
				new ArrayList<String>() {{
					this.add("todo faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://acala.network/karura");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.KARURATEST, karura_test);

		// lukso_test
		EVMChainInfo lukso_test = new EVMChainInfo(
				EVMChain.LUKSOTEST.toString(), 
				"LUKSO Testnet", 
				4201L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("LUKSO Test Token", "LYXt", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.lukso.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.execution.testnet.lukso.network");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.testnet.lukso.network/");
				}},
				new ArrayList<String>() {{
					this.add("https://lukso.network/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.LUKSOTEST, lukso_test);

		// assetchain_test
		EVMChainInfo assetchain_test = new EVMChainInfo(
				EVMChain.ASSETCHAINTEST.toString(), 
				"AssetChain Testnet", 
				42421L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("AssetChain Testnet Gas Token", "RWA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://enugu-rpc.assetchain.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan-testnet.assetchain.org");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.assetchain.org");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/42421");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ASSETCHAINTEST, assetchain_test);
		
		// fusespark_test
		EVMChainInfo fusespark_test = new EVMChainInfo(
				EVMChain.FUSESPARKTEST.toString(), 
				"FUSE Spark Testnet", 
				123L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("FUSE Test Token", "FUSE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"10000000000", //10 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.fusespark.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.fusespark.io");
				}},
				new ArrayList<String>() {{
					this.add("https://get.fusespark.io/");
				}},
				new ArrayList<String>() {{
					this.add("https://www.fuse.io/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FUSESPARKTEST, fusespark_test);

		// coredao_test
		EVMChainInfo coredao_test = new EVMChainInfo(
				EVMChain.CORETEST.toString(), 
				"Core DAO Testnet", 
				1115L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Core Test Token", "tCORE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.test.btcs.network/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.test.btcs.network");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge.coredao.org/");
				}},
				new ArrayList<String>() {{
					this.add("https://coredao.org/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CORETEST, coredao_test);

		// rootstock_test
		EVMChainInfo rootstock_test = new EVMChainInfo(
				EVMChain.ROOTSTOCKTEST.toString(), 
				"Rootstock Testnet", 
				31L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Rootstock Gas Token", "tRBTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://public-node.testnet.rsk.co");
					this.add("https://mycrypto.testnet.rsk.co");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.rsk.co");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://www.rsk.co");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ROOTSTOCKTEST, rootstock_test);

		// quadrans_test
		EVMChainInfo quadrans_test = new EVMChainInfo(
				EVMChain.QUADRANSTEST.toString(), 
				"Quadrans Blockchain Testnet", 
				10947L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Quadrans Gas Token", "tQDC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpctest.quadrans.io");
					this.add("https://rpctest2.quadrans.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.quadrans.io");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://quadrans.io");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.QUADRANSTEST, quadrans_test);

		// torus_test
		EVMChainInfo torus_test = new EVMChainInfo(
				EVMChain.TORUSTEST.toString(), 
				"Torus Mainnet", 
				8194L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Torus Mainnet Gas Token", "TTQF", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.toruschain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.toruscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://toruschain.com");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TORUSTEST, torus_test);

		// gan_test
		EVMChainInfo gan_test = new EVMChainInfo(
				EVMChain.GANTEST.toString(), 
				"GAN Testnet", 
				4048L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("GAN Testnet Gas Token", "GP", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.gpu.net");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://ganscan.gpu.net");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/4048");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.GANTEST, gan_test);

		// mint_test
		EVMChainInfo mint_test = new EVMChainInfo(
				EVMChain.MINTTEST.toString(), 
				"Mint Testnet", 
				1686L, 
				BlockchainType.PUBLIC.toString(), // scam?
				new EVMCurrency("Mint Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.mintchain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-explorer.mintchain.io");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://mintchain.io");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MINTTEST, mint_test);

		// l3x_test
		EVMChainInfo l3x_test = new EVMChainInfo(
				EVMChain.L3XTEST.toString(), 
				"L3X Protocol Testnet", 
				12325L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("L3X Protocol Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.l3x.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-testnet.l3x.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/12325");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.L3XTEST, l3x_test);

		// playfair_test
		EVMChainInfo playfair_test = new EVMChainInfo(
				EVMChain.PLAYFAIRTEST.toString(), 
				"PlayFair Testnet Subnet", 
				12898L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("PlayFair Testnet Subnet Gas Token", "BTLT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.letsplayfair.ai/ext/bc/2hhXFNp1jR4RuqvCmWQnBtt9CZnCmmyGr7TNTkxt7XY7pAzHMY/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://subnets-test.avax.network/letsplayfair");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/12898");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PLAYFAIRTEST, playfair_test);

		// defiverse_test
		EVMChainInfo defiverse_test = new EVMChainInfo(
				EVMChain.DEFIVERSETEST.toString(), 
				"DeFiVerse Testnet", 
				17117L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("DeFiVerse Testnet Gas Token", "OAS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.defi-verse.org/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan-testnet.defi-verse.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/17117");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DEFIVERSETEST, defiverse_test);

		// dcpay_test
		EVMChainInfo dcpay_test = new EVMChainInfo(
				EVMChain.DCPAYTEST.toString(), 
				"DCpay Testnet", 
				21224L, 
				BlockchainType.BORKED.toString(), // single unstable
				new EVMCurrency("DCpay Testnet Gas Token", "DCP", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.dcpay.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.dcpay.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.dcpay.io");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/21224");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DCPAYTEST, dcpay_test);

		// gitagi_test
		EVMChainInfo gitagi_test = new EVMChainInfo(
				EVMChain.GITAGITEST.toString(), 
				"GitAGI Atlas Testnet", 
				210049L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("GitAGI Atlas Testnet Gas Token", "tGAGI", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.gitagi.org");
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
					this.add("https://chainlist.org/chain/210049");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.GITAGITEST, gitagi_test);

		// waterfall_test
		EVMChainInfo waterfall_test = new EVMChainInfo(
				EVMChain.WATERFALLTEST.toString(), 
				"Waterfall 8 Test Network", 
				8601152L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Waterfall 8 Test Network Gas Token", "WATER", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet8.waterfall.network/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.testnet8.waterfall.network");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/8601152");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.WATERFALLTEST, waterfall_test);

		// swan_test
		EVMChainInfo swan_test = new EVMChainInfo(
				EVMChain.SWANTEST.toString(), 
				"Swan Proxima Testnet", 
				20241133L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Swan Proxima Testnet Gas Token", "sETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-proxima.swanchain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://proxima-explorer.swanchain.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/20241133");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SWANTEST, swan_test);

		// alienx_test
		EVMChainInfo alienx_test = new EVMChainInfo(
				EVMChain.ALIENXTEST.toString(), 
				"ALIENX Hal Testnet", 
				10241025L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("ALIENX Hal Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://hal.rpc.caldera.xyz/http");
					this.add("https://hal-rpc.alienxchain.io/http");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://hal-explorer.alienxchain.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/10241025");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ALIENXTEST, alienx_test);

		// lovely_test
		EVMChainInfo lovely_test = new EVMChainInfo(
				EVMChain.LOVELYTEST.toString(), 
				"Lovely Network Testnet", 
				307L, 
				BlockchainType.BORKED.toString(), // scam?
				new EVMCurrency("Lovely Network Testnet Gas Token", "LOVELY", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://trpc.lovely.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://tscan.lovely.network");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.lovely.network");
				}},
				new ArrayList<String>() {{
					this.add("https://lovely.finance/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.LOVELYTEST, lovely_test);

		// puppynet_test
		EVMChainInfo puppynet_test = new EVMChainInfo(
				EVMChain.SHIBARIUMPUPPYNETTEST.toString(), 
				"Puppynet Shibarium", 
				157L, 
				BlockchainType.PUBLIC.toString(), // scam?
				new EVMCurrency("Puppynet Shibarium Gas Token", "BONE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
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
					this.add("https://beta.shibariumtech.com/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://shibariumtech.com");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SHIBARIUMPUPPYNETTEST, puppynet_test);

		// bloom_test
		EVMChainInfo bloom_test = new EVMChainInfo(
				EVMChain.BLOOMTEST.toString(), 
				"Bloom Genesis Testnet", 
				323213L, 
				BlockchainType.BORKED.toString(), // unstable
				new EVMCurrency("Bloom Genesis Testnet Gas Token", "BGBC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.bloomgenesis.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.bloomgenesis.com");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.bloomgenesis.com");
				}},
				new ArrayList<String>() {{
					this.add("https://bloomgenesis.com");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BLOOMTEST, bloom_test);

		// sei_test
		EVMChainInfo sei_test = new EVMChainInfo(
				EVMChain.SEITEST.toString(), 
				"Sei Testnet", 
				1328L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Sei Testnet Gas Token", "SEI", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://evm-rpc-testnet.sei-apis.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://seitrace.com");
				}},
				new ArrayList<String>() {{
					this.add("https://atlantic-2.app.sei.io/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1328");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SEITEST, sei_test);

		// sei_test
		EVMChainInfo sei_devtest = new EVMChainInfo(
				EVMChain.SEIDEVTEST.toString(), 
				"Sei Devnet", 
				713715L, 
				BlockchainType.PUBLIC.toString(), // unstable
				new EVMCurrency("Sei Devnet Gas Token", "SEI", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://evm-rpc.arctic-1.seinetwork.io");
					this.add("https://evm-rpc-arctic-1.sei-apis.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://seitrace.com");
				}},
				new ArrayList<String>() {{
					this.add("https://sei-evm.faucetme.pro");
					this.add("https://sei-faucet.nima.enterprises/");
				}},
				new ArrayList<String>() {{
					this.add("https://www.sei.io/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SEIDEVTEST, sei_devtest);

		// bigshortbets_test
		EVMChainInfo bigshortbets_test = new EVMChainInfo(
				EVMChain.BIGSHORTBETSTEST.toString(), 
				"BigShortBets Testnet", 
				2136L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("BigShortBets Testnet Gas Token", "Dolarz", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://test-market.bigsb.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://polkadot.js.org/apps/?rpc=wss://test-market.bigsb.network#/explorer");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2136");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BIGSHORTBETSTEST, bigshortbets_test);

		// ichain_test
		EVMChainInfo ichain_test = new EVMChainInfo(
				EVMChain.ICHAINTEST.toString(), 
				"iChain Testnet", 
				3645L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("iChain Testnet Gas Token", "ISLAMI", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://istanbul.ichainscan.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://test.ichainscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/3645");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ICHAINTEST, ichain_test);

		// vana_test
		EVMChainInfo vana_test = new EVMChainInfo(
				EVMChain.VANATEST.toString(), 
				"Vana Satori Testnet", 
				14801L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Vana Satori Testnet Gas Token", "DAT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("http://rpc.satori.vana.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://satori.vanascan.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.vana.org");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/14801");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.VANATEST, vana_test);

		// pentagon_test
		EVMChainInfo pentagon_test = new EVMChainInfo(
				EVMChain.PENTAGONTEST.toString(), 
				"Pentagon Testnet", 
				555555L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Pentagon Testnet Gas Token", "PEN", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.pentagon.games");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-testnet.pentagon.games");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge-testnet.pentagon.games");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/555555");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PENTAGONTEST, pentagon_test);

		// supernet_test
		EVMChainInfo supernet_test = new EVMChainInfo(
				EVMChain.SUPERNETTEST.toString(), 
				"Supernet Testnet", 
				998899L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Supernet Testnet Gas Token", "CHAIN", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.supernet.chaingames.io/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-explorer.supernet.chaingames.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.chaingames.io");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/998899");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SUPERNETTEST, supernet_test);

		// syndr_test
		EVMChainInfo syndr_test = new EVMChainInfo(
				EVMChain.SYNDRTEST.toString(), 
				"Syndr L3 Sepolia", 
				444444L, 
				BlockchainType.PUBLIC.toString(), // unstable
				new EVMCurrency("Syndr L3 Sepolia Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://sepolia.syndr.com/http");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sepolia-explorer.syndr.com");
				}},
				new ArrayList<String>() {{
					this.add("<faucet todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://syndr.com");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SYNDRTEST, syndr_test);

		// metadap_test
		EVMChainInfo metadap_test = new EVMChainInfo(
				EVMChain.METADAPTEST.toString(), 
				"MetaDAP Enterprise Testnet", 
				119139L, 
				BlockchainType.BORKED.toString(), // unstable
				new EVMCurrency("MetaDAP Enterprise Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.chain.metadap.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.chain.metadap.io");
				}},
				new ArrayList<String>() {{
					this.add("<bridge to do>");
				}},
				new ArrayList<String>() {{
					this.add("https://metadap.io");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.METADAPTEST, metadap_test);

		// doid_test
		EVMChainInfo doid_test = new EVMChainInfo(
				EVMChain.DOIDTEST.toString(), 
				"DOID Testnet", 
				56797L, 
				BlockchainType.BORKED.toString(), // unstable
				new EVMCurrency("DOID Testnet Gas Token", "DOID", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.doid.tech");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.testnet.doid.tech");
				}},
				new ArrayList<String>() {{
					this.add("<bridge to do>");
				}},
				new ArrayList<String>() {{
					this.add("https://doid.tech");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DOIDTEST, doid_test);

		// timetest
		EVMChainInfo timetest = new EVMChainInfo(
				EVMChain.TIMETEST.toString(), 
				"Elizabeth Testnet", 
				2731L, 
				BlockchainType.BORKED.toString(), // unstable
				new EVMCurrency("Elizabeth Testnet Gas Token", "TIME", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.timenetwork.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-scanner.timenetwork.io");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://anttime.net/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TIMETEST, timetest);

		// onigiri_test
		EVMChainInfo onigiri_test = new EVMChainInfo(
				EVMChain.ONIGIRITEST.toString(), 
				"ONIGIRI Test Subnet", 
				5039L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("ONIGIRI Test Subnet Gas Token", "ONGR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/onigiri/testnet/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://subnets-test.avax.network/onigiri");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/5039");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ONIGIRITEST, onigiri_test);

		// nollie_test
		EVMChainInfo nollie_test = new EVMChainInfo(
				EVMChain.NOLLIETEST.toString(), 
				"Nollie Skatechain Testnet", 
				5051L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Nollie Skatechain Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://nollie-rpc.skatechain.org/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://nolliescan.skatechain.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/5051");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.NOLLIETEST, nollie_test);

		// tao_test
		EVMChainInfo tao_test = new EVMChainInfo(
				EVMChain.TAOTEST.toString(), 
				"TAO EVM Testnet", 
				10324L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("TAO EVM Testnet Gas Token", "TAO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.taoevm.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.taoscan.org");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.taoevm.io");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/10324");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TAOTEST, tao_test);

		// binarychain_test
		EVMChainInfo binarychain_test = new EVMChainInfo(
				EVMChain.BINARYCHAINTEST.toString(), 
				"BinaryChain Testnet", 
				9876L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("BinaryChain Testnet Gas Token", "BNRY", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpctestnet.binarychain.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.binarychain.org");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.testnet.binarychain.org");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/9876");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BINARYCHAINTEST, binarychain_test);

		// xchain_test
		EVMChainInfo xchain_test = new EVMChainInfo(
				EVMChain.XCHAINTEST.toString(), 
				"Xchain Testnet", 
				31754L, 
				BlockchainType.BORKED.toString(), // unstable single node
				new EVMCurrency("Xchain Testnet Gas Token", "INTD", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.xchaintest.net");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://xchaintest.net");
				}},
				new ArrayList<String>() {{
					this.add("https://xchainfaucet.net");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/31754");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.XCHAINTEST, xchain_test);

		// entangle_test
		EVMChainInfo entangle_test = new EVMChainInfo(
				EVMChain.ENTANGLETEST.toString(), 
				"Entangle Testnet", 
				33133L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Entangle Testnet Gas Token", "NGL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://evm-testnet.entangle.fi");
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
					this.add("https://chainlist.org/chain/33133");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ENTANGLETEST, entangle_test);

		// chiliz_test
		EVMChainInfo chiliz_test = new EVMChainInfo(
				EVMChain.CHILIZTEST.toString(), 
				"Chiliz Spicy Testnet", 
				88882L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Chiliz Spicy Testnet Gas Token", "CHZ", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://spicy-rpc.chiliz.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.chiliscan.com");
				}},
				new ArrayList<String>() {{
					this.add("https://tatum.io/faucets/chiliz");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/88882");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CHILIZTEST, chiliz_test);

		// darwinia_test
		EVMChainInfo darwinia_test = new EVMChainInfo(
				EVMChain.DARWINIATEST.toString(), 
				"Darwinia Koi Testnet", 
				701L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Darwinia Koi Testnet Gas Token", "KRING", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://koi-rpc.darwinia.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://koi-scan.darwinia.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/701");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DARWINIATEST, darwinia_test);

		// green_test
		EVMChainInfo green_test = new EVMChainInfo(
				EVMChain.GREENTEST.toString(), 
				"Green Chain Testnet", 
				97531L, 
				BlockchainType.BORKED.toString(), // single unstable
				new EVMCurrency("Green Chain Testnet Gas Token", "GREEN", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://node.greenchain.app/rpc/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.greenchain.app");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/97531");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.GREENTEST, green_test);

		// plyr_test
		EVMChainInfo plyr_test = new EVMChainInfo(
				EVMChain.PLYRTEST.toString(), 
				"PLYR TAU Testnet", 
				62831L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("PLYR TAU Testnet Gas Token", "PLYR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/plyr/testnet/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://subnets-test.avax.network/plyr");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.avax.network/?subnet=plyr");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/62831");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PLYRTEST, plyr_test);


		// tanssi
		EVMChainInfo tanssi = new EVMChainInfo(
				EVMChain.TANSSITEST.toString(), 
				"Tanssi Demo", 
				5678L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Tanssi Demo Gas Token", "TANGO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://fraa-dancebox-3001-rpc.a.dancebox.tanssi.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://3001-blockscout.a.dancebox.tanssi.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/5678");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TANSSITEST, tanssi);

		// bouncebit_test
		EVMChainInfo bouncebit_test = new EVMChainInfo(
				EVMChain.BOUNCEBITTEST.toString(), 
				"BounceBit Testnet", 
				6000L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("BounceBit Testnet Gas Token", "BB", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://fullnode-testnet.bouncebitapi.com/");
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
					this.add("https://chainlist.org/chain/6000");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BOUNCEBITTEST, bouncebit_test);

		// aura_test
		EVMChainInfo aura_test = new EVMChainInfo(
				EVMChain.AURATEST.toString(), 
				"Aura Euphoria Testnet", 
				6321L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Aura Euphoria Testnet Gas Token", "eAura", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://jsonrpc.euphoria.aura.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://euphoria.aurascan.io");
				}},
				new ArrayList<String>() {{
					this.add("https://aura.faucetme.pro");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/6321");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.AURATEST, aura_test);

		// xenon_test
		EVMChainInfo xenon_test = new EVMChainInfo(
				EVMChain.XENONTEST.toString(), 
				"Xenon Chain Testnet", 
				2941L, 
				BlockchainType.BORKED.toString(), // unstable
				new EVMCurrency("Xenon Chain Testnet Gas Token", "TXEN", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://testnet-chain.xenonchain.com/");
					this.add("https://testnet-dev.xenonchain.com/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.xenonchain.com");
				}},
				new ArrayList<String>() {{
					this.add("https://xfaucet.xenonchain.com");
				}},
				new ArrayList<String>() {{
					this.add("https://xenonchain.com");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.XENONTEST, xenon_test);

		// lisk_test
		EVMChainInfo lisk_test = new EVMChainInfo(
				EVMChain.LISKTEST.toString(), 
				"Lisk Sepolia Testnet", 
				4202L, 
				BlockchainType.PUBLIC.toString(), // unstable
				new EVMCurrency("Lisk Sepolia Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.sepolia-api.lisk.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sepolia-blockscout.lisk.com");
				}},
				new ArrayList<String>() {{
					this.add("<faucet>");
				}},
				new ArrayList<String>() {{
					this.add("https://lisk.com");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.LISKTEST, lisk_test);

		// bevm_test
		EVMChainInfo bevm_test = new EVMChainInfo(
				EVMChain.BEVMTEST.toString(), 
				"BEVM Testnet", 
				11503L, 
				BlockchainType.PUBLIC.toString(), // unstable
				new EVMCurrency("BEVM Testnet Gas Token", "BTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://testnet.bevm.io/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan-testnet.bevm.io");
				}},
				new ArrayList<String>() {{
					this.add("<bridge to do>");
				}},
				new ArrayList<String>() {{
					this.add("https://bevm.io/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BEVMTEST, bevm_test);


		// mapprotocol_test
		EVMChainInfo mapprotocol_test = new EVMChainInfo(
				EVMChain.MAPPROTOCOLTEST.toString(), 
				"MAPO Makalu Testnet", 
				212L, 
				BlockchainType.PUBLIC.toString(), // unstable
				new EVMCurrency("MAPO Makalu Testnet Gas Token", "MAPO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.maplabs.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.maposcan.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.mapprotocol.io");
				}},
				new ArrayList<String>() {{
					this.add("https://mapprotocol.io/");
					this.add("https://www.coingecko.com/en/coins/map-protocol");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MAPPROTOCOLTEST, mapprotocol_test);

		// ancient8_test
		EVMChainInfo ancient8_test = new EVMChainInfo(
				EVMChain.ANCIENT8TEST.toString(), 
				"Ancient8 Testnet", 
				28122024L, 
				BlockchainType.BORKED.toString(), // unstable
				new EVMCurrency("Ancient8 Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpcv2-testnet.ancient8.gg");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scanv2-testnet.ancient8.gg");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("hhttps://ancient8.gg");
					this.add("https://chainlist.org/chain/28122024");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ANCIENT8TEST, ancient8_test);

		// bitfinity_test
		EVMChainInfo bitfinity_test = new EVMChainInfo(
				EVMChain.BITFINITYTEST.toString(), 
				"Bitfinity Network Testnet", 
				355113L, 
				BlockchainType.BORKED.toString(), // unstable
				new EVMCurrency("Bitfinity Network Testnet Gas Token", "BFT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://testnet.bitfinity.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.bitfinity.network");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/355113");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BITFINITYTEST, bitfinity_test);

		// mind_test
		EVMChainInfo mind_test = new EVMChainInfo(
				EVMChain.MINDTEST.toString(), 
				"Mind Network Testnet", 
				192940L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Mind Network Testnet Gas Token", "FHE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.mindnetwork.xyz");
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
					this.add("https://chainlist.org/chain/192940");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MINDTEST, mind_test);

		// mind_test
		EVMChainInfo mindsmart_test = new EVMChainInfo(
				EVMChain.MINDSMARTCHAINTEST.toString(), 
				"Mind Smart Chain Testnet", 
				9977L, 
				BlockchainType.BORKED.toString(), // single node dead
				new EVMCurrency("Mind Smart Chain Testnet Gas Token", "tMIND", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://testnet-msc.mindchain.info/");
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
		networks.put(EVMChain.MINDSMARTCHAINTEST, mindsmart_test);

		// eclat_test
		EVMChainInfo eclat_test = new EVMChainInfo(
				EVMChain.ECLATTEST.toString(), 
				"Eclat Testnet", 
				262371L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Eclat Testnet Gas Token", "ECLAT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.eclatscan.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-explorer.eclatscan.com");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.eclatscan.com");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/262371");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ECLATTEST, eclat_test);

		// soma_test
		EVMChainInfo soma_test = new EVMChainInfo(
				EVMChain.SOMATEST.toString(), 
				"SOMA Network Testnet", 
				2323L, 
				BlockchainType.BORKED.toString(), // 502 ... 502 ..
				new EVMCurrency("SOMA Network Testnet Gas Token", "tSMA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://data-testnet-v1.somanetwork.io/");
					this.add("https://testnet-au-server-2.somanetwork.io");
					this.add("https://testnet-au-server-1.somanetwork.io");
					this.add("https://testnet-sg-server-1.somanetwork.io");
					this.add("https://testnet-sg-server-2.somanetwork.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.somascan.io");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://somanetwork.io");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SOMATEST, soma_test);

		// rotw_test
		EVMChainInfo rotw_test = new EVMChainInfo(
				EVMChain.ROTWTEST.toString(), 
				"Rise of the Warbots Testnet", 
				7777L, 
				BlockchainType.BORKED.toString(), // just 404s ..
				new EVMCurrency("Rise of the Warbots Testnet Gas Token", "NMAC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://testnet1.rotw.games");
					this.add("https://testnet1.riseofthewarbots.com");
					this.add("https://testnet2.riseofthewarbots.com");
					this.add("https://testnet3.riseofthewarbots.com");
					this.add("https://testnet4.riseofthewarbots.com");
					this.add("https://testnet5.riseofthewarbots.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.avascan.info/blockchain/2mZ9doojfwHzXN3VXDQELKnKyZYxv7833U8Yq5eTfFx3hxJtiy");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://riseofthewarbots.com/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ROTWTEST, rotw_test);

		// ontology_test
		EVMChainInfo ontology_test = new EVMChainInfo(
				EVMChain.ONTOLOGYTEST.toString(), 
				"Ontology Testnet", 
				5851L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Ontology Mainnet Gas Token", "ONG", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://polaris1.ont.io:10339");
					this.add("http://polaris1.ont.io:20339");
					this.add("http://polaris2.ont.io:20339");
					this.add("http://polaris3.ont.io:20339");
					this.add("http://polaris4.ont.io:20339");
					this.add("https://polaris2.ont.io:10339");
					this.add("https://polaris3.ont.io:10339");
					this.add("https://polaris4.ont.io:10339");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.ont.io/testnet");
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
		networks.put(EVMChain.ONTOLOGYTEST, ontology_test);

		// oneness_test
		EVMChainInfo oneness_test = new EVMChainInfo(
				EVMChain.ONENESSTEST.toString(), 
				"Oneness TestNet", 
				2141L, 
				BlockchainType.BORKED.toString(), // unstable single
				new EVMCurrency("Oneness TestNet Gas Token", "BTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.onenesslabs.io/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.testnet.onenesslabs.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2141");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ONENESSTEST, oneness_test);

		// rss3_test
		EVMChainInfo rss3_test = new EVMChainInfo(
				EVMChain.RSS3TEST.toString(), 
				"RSS3 VSL Sepolia Testnet", 
				2331L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("RSS3 VSL Sepolia Testnet Gas Token", "RSS3", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.rss3.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.testnet.rss3.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2331");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.RSS3TEST, rss3_test);

		// nexis_test
		EVMChainInfo nexis_test = new EVMChainInfo(
				EVMChain.NEXISTEST.toString(), 
				"Nexis Network Testnet", 
				2370L, 
				BlockchainType.BORKED.toString(), // unstable single
				new EVMCurrency("Nexis Network Testnet Gas Token", "NZT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://evm-testnet.nexis.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://evm-testnet.nexscan.io");
				}},
				new ArrayList<String>() {{
					this.add("https://evm-faucet.nexis.network");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2370");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.NEXISTEST, nexis_test);

		// aie_test
		EVMChainInfo aie_test = new EVMChainInfo(
				EVMChain.AIETEST.toString(), 
				"AIE Testnet", 
				413413L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("AIE Testnet Gas Token", "tAIE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc1-testnet.aiechain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.aiescan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/413413");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.AIETEST, aie_test);

		// rebus_test
		EVMChainInfo rebus_test = new EVMChainInfo(
				EVMChain.REBUSTEST.toString(), 
				"Rebus Testnet", 
				3033L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Rebus Testnet Gas Token", "REBUS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet.rebus.money/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.rebus.money/rebustestnet");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/3033");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.REBUSTEST, rebus_test);

		// satoshivm
		EVMChainInfo satoshivm = new EVMChainInfo(
				EVMChain.SATOSHIVMALPHATEST.toString(), 
				"SatoshiVM Alpha Mainnet", 
				3109L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("SatoshiVM Alpha Mainnet Gas Token", "BTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://alpha-rpc-node-http.svmscan.io");
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
					this.add("https://chainlist.org/chain/3109");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SATOSHIVMALPHATEST, satoshivm);

		// morph
		EVMChainInfo morph_test = new EVMChainInfo(
				EVMChain.MORPHTEST.toString(), 
				"Morph Holesky", 
				2810L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Morph Holesky Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-holesky.morphl2.io");
					this.add("https://rpc-quicknode-holesky.morphl2.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-holesky.morphl2.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2810");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MORPHTEST, morph_test);

		// king_test
		EVMChainInfo king_test = new EVMChainInfo(
				EVMChain.KINGTEST.toString(), 
				"King Of Legends Devnet", 
				2425L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("King Of Legends Devnet Gas Token", "KOL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-devnet.kinggamer.org/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://devnet.kingscan.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2425");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.KINGTEST, king_test);

		// defichain_test
		EVMChainInfo defichain_test = new EVMChainInfo(
				EVMChain.DEFICHAINTEST.toString(), 
				"DeFiChain EVM Network Mainnet", 
				1131L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("DeFiChain Testnet Gas Token", "DFI", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://dmc.mydefichain.com/testnet");
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
		networks.put(EVMChain.DEFICHAINTEST, defichain_test);

		// metadium_test
		EVMChainInfo metadium_test = new EVMChainInfo(
				EVMChain.METADIUMTEST.toString(), 
				"Metadium Testsnet", 
				12L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Metadium Testnet Gas Token", "KAL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://api.metadium.com/dev");
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
		networks.put(EVMChain.METADIUMTEST, metadium_test);

		// optimism_goerli_test
		EVMChainInfo optimism_goerli_test = new EVMChainInfo(
				EVMChain.OPTIMISMGOERLITEST.toString(), 
				"Optimism Goerli Testnet", 
				420L, 
				BlockchainType.BORKED.toString(), // disc
				new EVMCurrency("Optimism Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://endpoints.omniatech.io/v1/op/goerli/public");
					this.add("https://opt-goerli.g.alchemy.com/v2/demo");
					this.add("https://goerli.optimism.io");
					this.add("https://optimism-goerli.public.blastapi.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://optimistic.etherscan.io/");
				}},
				new ArrayList<String>() {{
					this.add("https://goerli.hop.exchange/");
				}},
				new ArrayList<String>() {{
					this.add("https://www.optimism.io/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.OPTIMISMGOERLITEST, optimism_goerli_test);

		// mode_test
		EVMChainInfo mode_test = new EVMChainInfo(
				EVMChain.MODETEST.toString(), 
				"MODE Testnet", 
				919L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Mode Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers ..
				new ArrayList<String>() {{
					this.add("https://sepolia.mode.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sepolia.explorer.mode.network");
				}},
				new ArrayList<String>() {{
					this.add("https://www.mode.network");
				}},
				new ArrayList<String>() {{
					this.add("https://confluxnetwork.org/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MODETEST, mode_test);

		// conflux_test
		EVMChainInfo conflux_test = new EVMChainInfo(
				EVMChain.CONFLUXTEST.toString(), 
				"Conflux Testnet", 
				71L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Conflux Token", "CFX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers ..
				new ArrayList<String>() {{
					this.add("https://evmtestnet.confluxrpc.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://evmtestnet.confluxscan.net");
				}},
				new ArrayList<String>() {{
					this.add("https://efaucet.confluxnetwork.org/");
				}},
				new ArrayList<String>() {{
					this.add("https://confluxnetwork.org/");
				}},
				BlockchainTokenDetailsEVM.generateConfluxTestnetTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CONFLUXTEST, conflux_test);

		// zetachain_athens_testnet
		EVMChainInfo zetachain_athens_testnet = new EVMChainInfo(
				EVMChain.ZETAATHENSTEST.toString(), 
				"ZetaChain Athens Testnet", 
				7001L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Zetachain Testnet Token", "aZETA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://zetachain-athens-evm.blockpi.network/v1/rpc/public");
					this.add("https://zetachain-testnet-archive.allthatnode.com:8545");
					//this.add("https://rpc.ankr.com/zetachain_evm_athens_testnet");
					//this.add("https://rpc.ankr.com/zetachain_evm_testnet"); // https://www.zetachain.com/docs/reference/api/
					//this.add("https://api.athens2.zetachain.com/evm"); // gives incorrect nonce quite often
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://athens3.explorer.zetachain.com");
					this.add("https://explorer.athens.zetachain.com");
				}},
				new ArrayList<String>() {{
					this.add("https://labs.zetachain.com/get-zeta");
				}},
				new ArrayList<String>() {{
					this.add("https://www.zetachain.com/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZETAATHENSTEST, zetachain_athens_testnet);

		// zetachain_test
		EVMChainInfo zetachain_test = new EVMChainInfo(
				EVMChain.ZETACHAINTEST.toString(), 
				"ZetaChain Testnet", 
				7001L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("ZetaChain Testnet Gas Token", "ZETA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://zetachain-athens-evm.blockpi.network/v1/rpc/public");
					this.add("https://zetachain-testnet.public.blastapi.io");
					this.add("https://zetachain-athens.g.allthatnode.com/archive/evm");
					this.add("https://7001.rpc.thirdweb.com");
					this.add("https://zeta-chain-testnet.drpc.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://zetachain-athens-3.blockscout.com");
				}},
				new ArrayList<String>() {{
					this.add("https://www.zetachain.com/docs/reference/apps/get-testnet-zeta/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/7001");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZETACHAINTEST, zetachain_test);
		
		// shape_test
		EVMChainInfo shape_test = new EVMChainInfo(
				EVMChain.SHAPETEST.toString(), 
				"Shape Sepolia Testnet", 
				11011L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Shape Sepolia Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://sepolia.shape.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://shape-sepolia-explorer.alchemy.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/11011");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SHAPETEST, shape_test);
		
		// movement_test
		EVMChainInfo movement_test = new EVMChainInfo(
				EVMChain.MOVEMENTTEST.toString(), 
				"Movement EVM Testnet", 
				30732L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Movement EVM Testnet Gas Token", "MOVE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://mevm.testnet.imola.movementlabs.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.imola.movementlabs.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/30732");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MOVEMENTTEST, movement_test);
		
		// laos_test
		EVMChainInfo laos_test = new EVMChainInfo(
				EVMChain.LAOSTEST.toString(), 
				"LAOS Sigma Testnet", 
				62850L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("LAOS Sigma Testnet Gas Token", "SIGMA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.laossigma.laosfoundation.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sigma.explorer.laosnetwork.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/62850");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.LAOSTEST, laos_test);
		
		// skopje_test
		EVMChainInfo skopje_test = new EVMChainInfo(
				EVMChain.SKOPJETEST.toString(), 
				"Skopje Testnet", 
				476462898L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Skopje Testnet Gas Token", "SkpGPT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://skopje-rpc.gptprotocol.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://skopje-explorer.gptprotocol.io");
				}},
				new ArrayList<String>() {{
					this.add("https://skopje-faucet.gptprotocol.io");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/476462898");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SKOPJETEST, skopje_test);
		
		// weavevm_test
		EVMChainInfo weavevm_test = new EVMChainInfo(
				EVMChain.WEAVEVMTEST.toString(), 
				"WeaveVM Testnet", 
				9496L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("WeaveVM Testnet Gas Token", "tWVM", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet.wvm.dev");
					this.add("https://testnet-rpc.wvm.dev");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.wvm.dev");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/9496");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.WEAVEVMTEST, weavevm_test);
		
		// blockx_test
		EVMChainInfo blockx_test = new EVMChainInfo(
				EVMChain.BLOCKXTEST.toString(), 
				"BlockX Atlantis Testnet", 
				19077L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("BlockX Atlantis Testnet Gas Token", "BCX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://atlantis-web3.blockxnet.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://ping.blockxnet.com/blockx-atlantis-testnet");
				}},
				new ArrayList<String>() {{
					this.add("https://ping.blockxnet.com/blockx-atlantis-testnet/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/19077");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BLOCKXTEST, blockx_test);
		
		// kymtc_test
		EVMChainInfo kymtc_test = new EVMChainInfo(
				EVMChain.KYMTCTEST.toString(), 
				"KYMTC Testnet", 
				24076L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("KYMTC Testnet Gas Token", "KYMTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.kymaticscan.online");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-explorer.kymaticscan.online");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.kymaticscan.online");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/24076");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.KYMTCTEST, kymtc_test);
		
		// avenium_test
		EVMChainInfo avenium_test = new EVMChainInfo(
				EVMChain.AVENIUMTEST.toString(), 
				"Avenium Testnet", 
				8886L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Avenium Testnet Gas Token", "tAVE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://eu-testnet.avenium.io/");
					this.add("https://connect-testnet.avenium.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.avescan.net");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet-testnet.avenium.io");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/8886");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.AVENIUMTEST, avenium_test);
		
		// planq_test
		EVMChainInfo planq_test = new EVMChainInfo(
				EVMChain.PLANQTEST.toString(), 
				"Planq Atlas Testnet", 
				7077L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Planq Atlas Testnet Gas Token", "tPLQ", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://evm-rpc-atlas.planq.network");
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
					this.add("https://chainlist.org/chain/7077");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PLANQTEST, planq_test);

		// autonomys_test
		EVMChainInfo autonomys_test = new EVMChainInfo(
				EVMChain.AUTONOMYSTEST.toString(), 
				"Autonomys Testnet Nova Domain", 
				490000L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Autonomys Testnet Nova Domain Gas Token", "TATC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://nova-0.gemini-3h.subspace.network/ws");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://nova.subspace.network");
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

		// zilliqa2p_test
		EVMChainInfo zilliqa2p_test = new EVMChainInfo(
				EVMChain.ZILLIQA2PTEST.toString(), 
				"Zilliqa 2 EVM proto-testnet", 
				33103L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Zilliqa 2 EVM proto-testnet Gas Token", "ZIL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://api.zq2-prototestnet.zilliqa.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.zq2-prototestnet.zilliqa.com");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.zq2-prototestnet.zilliqa.com");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/33103");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZILLIQA2PTEST, zilliqa2p_test);

		// gdcc
		EVMChainInfo gdcc = new EVMChainInfo(
				EVMChain.GDCCTEST.toString(), 
				"GDCC TESTNET", 
				7775L, 
				BlockchainType.BORKED.toString(), // unstable
				new EVMCurrency("GDCC TESTNET Gas Token", "GDCC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc1.gdccscan.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.gdccscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/7775");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.GDCCTEST, gdcc);

		// one_test
		EVMChainInfo one_test = new EVMChainInfo(
				EVMChain.ONETEST.toString(), 
				"One World Chain Testnet", 
				552981L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("One World Chain Testnet Gas Token", "OWCT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.oneworldchain.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.oneworldchain.org");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.oneworldchain.org");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/552981");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ONETEST, one_test);

		// openex_test
		EVMChainInfo openex_test = new EVMChainInfo(
				EVMChain.OPENEXTEST.toString(), 
				"OpenEX LONG Testnet", 
				7798L, 
				BlockchainType.BORKED.toString(), // unstable
				new EVMCurrency("OpenEX LONG Testnet Gas Token", "USDT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://long.rpc.openex.network/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.long.openex.network");
				}},
				new ArrayList<String>() {{
					this.add("https://long.hub.openex.network/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/7798");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.OPENEXTEST, openex_test);

		// karak_sep_test
		EVMChainInfo karak_sep_test = new EVMChainInfo(
				EVMChain.KARAKSEPOLIATEST.toString(), 
				"Karak Sepolia", 
				8054L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Karak Sepolia Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.sepolia.karak.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.sepolia.karak.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/8054");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.KARAKSEPOLIATEST, karak_sep_test);

		// atleta_test
		EVMChainInfo atleta_test = new EVMChainInfo(
				EVMChain.ATLETATEST.toString(), 
				"Atleta Testnet", 
				2340L, 
				BlockchainType.BORKED.toString(), // single node unstable
				new EVMCurrency("Atleta Testnet Gas Token", "ATLA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://atleta-testnet-rpc.quark.blue:9944");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("http://185.234.69.18/?rpc=wss%3A%2F%2Fatleta-testnet-rpc.quark.blue%3A9944#/explorer");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.atleta.network");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2340");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ATLETATEST, atleta_test);

		// kavatest
		EVMChainInfo kavatest = new EVMChainInfo(
				EVMChain.KAVATEST.toString(), 
				"KAVA Evm Testnet", 
				2221L, 
				BlockchainType.BORKED.toString(), // unstable
				new EVMCurrency("KAVA Testnet Token", "KAVA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"30000", //only give enough to enable transfers .. gas limit too low: 21000 (gas limit) < 21596 (intrinsic gas): out of gas:gas limit too low: 21000 (gas limit) < 21596 (intrinsic gas): out of gas:gas limit too low: 21000 (gas limit) < 21596 (intrinsic gas): out of gas:
				new ArrayList<String>() {{
					this.add("https://evm.testnet.kava.io");
					this.add("https://kava-testnet.drpc.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.kava.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.kava.io/");
				}},
				new ArrayList<String>() {{
					this.add("https://kava.io");
					this.add("https://docs.kava.io/docs/ethereum/metamask/");
				}},
				BlockchainTokenDetailsEVM.generateKavaTestTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.KAVATEST, kavatest);

		// scroll_alphatest
		EVMChainInfo scroll_alphatest = new EVMChainInfo(
				EVMChain.SCROLLALPHATEST.toString(), 
				"Scroll Alpha Testnet", 
				534353L, 
				BlockchainType.BORKED.toString(), // replaced by Sepolia Scroll
				new EVMCurrency("Scroll Alpha Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://alpha-rpc.scroll.io/l2");
					this.add("https://scroll-alphanet.public.blastapi.io");
					this.add("https://scroll-testnet.blockpi.network/v1/rpc/public");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://blockscout.scroll.io");
				}},
				new ArrayList<String>() {{
					this.add("https://scroll.io/alpha/bridge");
				}},
				new ArrayList<String>() {{
					this.add("https://scroll.io");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SCROLLALPHATEST, scroll_alphatest);


		// etc_mordor_test
		EVMChainInfo etc_mordor_test = new EVMChainInfo(
				EVMChain.ETCMORDORTEST.toString(), 
				"Mordor Testnet, for Ethereum Classic", 
				63L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Ethereum Classic Mordor Testnet Gas Token", "METC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://geth-mordor.etc-network.info");
					this.add("https://rpc.mordor.etccooperative.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://blockscout.com/etc/mordor");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://www.coingecko.com/en/coins/ethereum-classic");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ETCMORDORTEST, etc_mordor_test);

		// okx_test
		EVMChainInfo okx_test = new EVMChainInfo(
				EVMChain.OKXTEST.toString(), 
				"OKXChain Testnet", 
				65L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("OKXChain Testnet Gas Token", "OKT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://exchaintestrpc.okex.org");
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
		networks.put(EVMChain.OKXTEST, okx_test);

		// scroll_sepoliatest
		EVMChainInfo scroll_sepoliatest = new EVMChainInfo(
				EVMChain.SCROLLSEPOLIATEST.toString(), 
				"Scroll Sepolia Testnet", 
				534351L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Scroll Testnet Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://scroll-sepolia.blockpi.network/v1/rpc/public");
					this.add("https://sepolia-rpc.scroll.io");
					this.add("https://scroll-public.scroll-testnet.quiknode.pro");
					this.add("https://rpc.ankr.com/scroll_sepolia_testnet");
					this.add("https://scroll-testnet-public.unifra.io");
					this.add("https://1rpc.io/scroll/sepolia");
					this.add("https://scroll-sepolia.chainstacklabs.com");
					this.add("https://scroll-sepolia-rpc.publicnode.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sepolia.scrollscan.dev");
				}},
				new ArrayList<String>() {{
					this.add("https://sepolia.scroll.io/bridge");
				}},
				new ArrayList<String>() {{
					this.add("https://scroll.io");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SCROLLSEPOLIATEST, scroll_sepoliatest);

		// zklink_test
		EVMChainInfo zklink_test = new EVMChainInfo(
				EVMChain.ZKLINKGOERLITEST.toString(), 
				"zkLink Nova Goerli Testnet", 
				810182L, 
				BlockchainType.BORKED.toString(), // deprecated
				new EVMCurrency("zkLink Nova Goerli Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://goerli.rpc.zklink.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://goerli.explorer.zklink.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/810182");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZKLINKGOERLITEST, zklink_test);

		// autonity_piccadilly_test
		EVMChainInfo autonity_piccadilly_test = new EVMChainInfo(
				EVMChain.AUTONITYPICCADILLYSUMIDATEST.toString(), 
				"Autonity Piccadilly (Sumida) Testnet", 
				65100002L, 
				BlockchainType.BORKED.toString(), // single unstable
				new EVMCurrency("Autonity Piccadilly (Sumida) Testnet Gas Token", "ATN", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc1.piccadilly.autonity.org/");
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
					this.add("https://chainlist.org/chain/65100002");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.AUTONITYPICCADILLYSUMIDATEST, autonity_piccadilly_test);


		// bifrost_test
		EVMChainInfo bifrost_test = new EVMChainInfo(
				EVMChain.BIFROSTTEST.toString(), 
				"Bifrost Testnet", 
				49088L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Bifrost Testnet Token", "BFC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1600000000", //1.6 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://public-01.testnet.thebifrost.io/rpc");
					this.add("https://public-02.testnet.thebifrost.io/rpc");
					this.add("https://public-01.testnet.bifrostnetwork.com/rpc");
					this.add("https://public-02.testnet.bifrostnetwork.com/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.thebifrost.io");
				}},
				new ArrayList<String>() {{
					this.add("https://www.bifrostnetwork.com/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://www.coingecko.com/en/coins/bifrost");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BIFROSTTEST, bifrost_test);

		// linea_test
		EVMChainInfo linea_test = new EVMChainInfo(
				EVMChain.LINEATEST.toString(), 
				"Linea Testnet", 
				59140L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Linea Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1600000000", //1.6 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.goerli.linea.build"); // only one, unstable
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.goerli.linea.build");
				}},
				new ArrayList<String>() {{
					this.add("faucet-todo");
				}},
				new ArrayList<String>() {{
					this.add("https://linea.build/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.LINEATEST, linea_test);

		// rupaya_test
		EVMChainInfo rupaya_test = new EVMChainInfo(
				EVMChain.RUPAYATEST.toString(), 
				"Rupaya Testnet", 
				799L, 
				BlockchainType.BORKED.toString(), // single node unstable
				new EVMCurrency("Rupaya Testnet Gas Token", "TRUPX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000",
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.rupaya.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.testnet.rupaya.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.testnet.rupaya.io");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/799");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.RUPAYATEST, rupaya_test);


		// pulsechain4_test
		EVMChainInfo pulsechain4_test = new EVMChainInfo(
				EVMChain.PULSECHAIN4TEST.toString(), 
				"PulseChain Testnet v4", 
				943L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("PulseChain Testnet Token", "tPLS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. crazy usage atm
				new ArrayList<String>() {{
					this.add("https://pulsetest-s.projectpi.xyz");
					this.add("https://rpc.v4.testnet.pulsechain.com");
					this.add("https://pulsechain-testnet.publicnode.com");
					this.add("https://rpc-testnet-pulsechain.g4mm4.io");
					this.add("https://pulsechain-testnet-rpc.publicnode.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.v4.testnet.pulsechain.com");
				}},
				new ArrayList<String>() {{
					this.add("faucet-todo");
				}},
				new ArrayList<String>() {{
					this.add("https://pulsechain.com/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PULSECHAIN4TEST, pulsechain4_test);

		// hybrid_test
		EVMChainInfo hybrid_test = new EVMChainInfo(
				EVMChain.HYBRIDTEST.toString(), 
				"Hybrid Testnet", 
				1225L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Hybrid Testnet Gas Token", "HYB", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://hybrid-testnet.rpc.caldera.xyz/http");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.buildonhybrid.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1225");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.HYBRIDTEST, hybrid_test);

		// satoshichaintest
		EVMChainInfo satoshichaintest = new EVMChainInfo(
				EVMChain.SATOSHICHAINTEST.toString(), 
				"SatoshiChain Testnet", 
				5758L, 
				BlockchainType.BORKED.toString(), // not ready
				new EVMCurrency("SATS Token", "SATS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"550030000000000", //550030 gwei, recommended 550k+ gwei default?
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. crazy usage atm
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.satoshichain.io/");
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
		networks.put(EVMChain.SATOSHICHAINTEST, satoshichaintest);


		// zkevmtest
		EVMChainInfo zkevmtest = new EVMChainInfo(
				EVMChain.ZKEVMTEST.toString(), 
				"Polygon ZKEVM Test Network", 
				1442L, 
				BlockchainType.BORKED.toString(), // unstable nodes
				new EVMCurrency("ETH Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rpc.public.zkevm-test.net");
					this.add("https://polygon-zkevm-testnet.drpc.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-zkevm.polygonscan.com");
				}},
				new ArrayList<String>() {{
					this.add("https://wallet.polygon.technology/zkEVM-Bridge/bridge");
				}},
				new ArrayList<String>() {{
					this.add("https://wiki.polygon.technology/docs/zkEVM/develop");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZKEVMTEST, zkevmtest);

		// ethotest
		EVMChainInfo ethotest = new EVMChainInfo(
				EVMChain.ETHOTEST.toString(), 
				"ETHO HC Test Network", 
				27292L, 
				BlockchainType.BORKED.toString(), // single node unstable
				new EVMCurrency("ETHOTest Token", "ETHO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://testnetrpc.ethoprotocol.com/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnetexplorer.ethoprotocol.com/");
				}},
				new ArrayList<String>() {{
					this.add("<faucet to do>");
				}},
				new ArrayList<String>() {{
					this.add("https://docs.ethoprotocol.com/install-metamask");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ETHOTEST, ethotest);

		// basetest
		EVMChainInfo basetest = new EVMChainInfo(
				EVMChain.BASEGOERLITEST.toString(), 
				"Base Goerli Test Network", 
				84531L, 
				BlockchainType.BORKED.toString(), // discont
				new EVMCurrency("Base Goerli Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://goerli.base.org");
					this.add("https://base-goerli.public.blastapi.io");
					this.add("https://base-goerli.diamondswap.org/rpc");
					this.add("https://1rpc.io/base-goerli");
					this.add("https://base-goerli.publicnode.com");
					this.add("https://base-goerli.gateway.tenderly.co");
					this.add("https://base-goerli-rpc.publicnode.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://goerli.basescan.org");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge.base.org/");
				}},
				new ArrayList<String>() {{
					this.add("https://base.org/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BASEGOERLITEST, basetest);

		// beam_test
		EVMChainInfo beam_test = new EVMChainInfo(
				EVMChain.BEAMTEST.toString(), 
				"Beam Testnet", 
				13337L, 
				BlockchainType.BORKED.toString(), // single node unstable
				new EVMCurrency("Beam Gas Token", "BEAM", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/beam/testnet/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://subnets-test.avax.network/beam");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://meritcircle.io/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BEAMTEST, beam_test);

		// unit_test
		EVMChainInfo unit0_test = new EVMChainInfo(
				EVMChain.UNIT0STAGETEST.toString(), 
				"Unit Zero Stagenet", 
				88819L, 
				BlockchainType.BORKED.toString(), // unstable single node
				new EVMCurrency("Unit Zero Stagenet Gas Token", "UNIT0", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-stagenet.unit0.dev");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-stagenet.unit0.dev");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/88819");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.UNIT0STAGETEST, unit0_test);

		// kakarot_test
		EVMChainInfo kakarot_test = new EVMChainInfo(
				EVMChain.KAKAROTTEST.toString(), 
				"Kakarot Sepolia", 
				1802203764L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Kakarot Sepolia Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://sepolia-rpc.kakarot.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sepolia.kakarotscan.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1802203764");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.KAKAROTTEST, kakarot_test);

		// ptcescan_test
		EVMChainInfo ptcescan_test = new EVMChainInfo(
				EVMChain.PTCESCANTEST.toString(), 
				"PTCESCAN Testnet", 
				889910245L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("PTCESCAN Testnet Gas Token", "PTCE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.ptcscan.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-testnet.ptcscan.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.ptcscan.io/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/889910245");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PTCESCANTEST, ptcescan_test);

		// pingaksha_test
		EVMChainInfo pingaksha_test = new EVMChainInfo(
				EVMChain.PINGAKSHATEST.toString(), 
				"Pingaksha testnet", 
				1377L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Pingaksha testnet Gas Token", "tRAMA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet.ramestta.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://pingaksha.ramascan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1377");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PINGAKSHATEST, pingaksha_test);

		// settlus_test
		EVMChainInfo settlus_test = new EVMChainInfo(
				EVMChain.SETTLUSTEST.toString(), 
				"Settlus Testnet", 
				5372L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Settlus Testnet Gas Token", "SETL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://settlus-test-eth.settlus.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.settlus.network");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.settlus.io");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/5372");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SETTLUSTEST, settlus_test);

		// jiritsu_test
		EVMChainInfo jiritsu_test = new EVMChainInfo(
				EVMChain.JIRITSUTEST.toString(), 
				"Jiritsu Testnet Subnet", 
				11227L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Jiritsu Testnet Subnet Gas Token", "TZW", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/jiritsutes/testnet/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://subnets-test.avax.network/jiritsutes");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/11227");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.JIRITSUTEST, jiritsu_test);

		// nahmii_test
		EVMChainInfo nahmii3_test = new EVMChainInfo(
				EVMChain.NAHMII3TEST.toString(), 
				"Nahmii 3 Testnet", 
				4062L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Nahmii 3 Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.nahmii.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.nahmii.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/4062");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.NAHMII3TEST, nahmii3_test);

		// plume_test
		EVMChainInfo plume_test = new EVMChainInfo(
				EVMChain.PLUMETEST.toString(), 
				"Plume Testnet", 
				161221135L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Plume Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"210000", // pure tx
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.plumenetwork.xyz/http");
					this.add("https://plume-testnet.rpc.caldera.xyz/http");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://plume-testnet.explorer.caldera.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://www.plumenetwork.xyz/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PLUMETEST, plume_test);

		// swanchain_test
		EVMChainInfo swanchain_test = new EVMChainInfo(
				EVMChain.SWANCHAINTEST.toString(), 
				"Swan Saturn Testnet", 
				2024L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Swan Saturn Testnet Gas Token", "SWAN", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://saturn-rpc.swanchain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://saturn-explorer.swanchain.io/");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge.swanchain.io/deposit");
				}},
				new ArrayList<String>() {{
					this.add("https://swanchain.io");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SWANCHAINTEST, swanchain_test);

		// citrea_test
		EVMChainInfo citrea_test2 = new EVMChainInfo(
				EVMChain.CITREA2TEST.toString(), 
				"Citrea Testnet", 
				5115L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Citrea Testnet Gas Token", "cBTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.citrea.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.citrea.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://citrea.xyz/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/5115");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CITREA2TEST, citrea_test2);

		// duckchain
		EVMChainInfo duckchain = new EVMChainInfo(
				EVMChain.DUCKCHAIN.toString(), 
				"DuckChain Mainnet", 
				5545L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("DuckChain Mainnet Gas Token", "TON", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-hk.duckchain.io");
					this.add("https://rpc.duckchain.io");
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
					this.add("https://chainlist.org/chain/5545");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DUCKCHAIN, duckchain);
		
		// bc_test
		EVMChainInfo bc_test = new EVMChainInfo(
				EVMChain.BCTEST.toString(), 
				"BC Hyper Chain Testnet", 
				6060L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("BC Hyper Chain Testnet Gas Token", "TVTCN", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.bchscan.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.bchscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/6060");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BCTEST, bc_test);
		
		// gdpr_test
		EVMChainInfo gdpr_test = new EVMChainInfo(
				EVMChain.GDPRTEST.toString(), 
				"GDPR Testnet", 
				85321L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("GDPR Testnet Gas Token", "GDPR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.gdprchain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.gdprchain.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/85321");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.GDPRTEST, gdpr_test);
		
		// selendra_test
		EVMChainInfo selendra_test = new EVMChainInfo(
				EVMChain.SELENDRATEST.toString(), 
				"Selendra Network Testnet", 
				1953L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Selendra Network Testnet Gas Token", "tSEL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.selendra.org");
					this.add("https://rpc0-testnet.selendra.org");
					this.add("https://rpc1-testnet.selendra.org");
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
					this.add("https://chainlist.org/chain/1953");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SELENDRATEST, selendra_test);

		// gitswarm_test
		EVMChainInfo gitswarm_test = new EVMChainInfo(
				EVMChain.GITSWARMTEST.toString(), 
				"GitSwarm Test Network", 
				28872323069L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("GitSwarm Test Network Gas Token", "GS-ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://gitswarm.com:2096");
					this.add("https://testnet.gitswarm.com:2096");
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
					this.add("https://chainlist.org/chain/28872323069");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.GITSWARMTEST, gitswarm_test);

		// viridis_test
		EVMChainInfo viridis_test = new EVMChainInfo(
				EVMChain.VIRIDISTEST.toString(), 
				"Viridis Testnet", 
				224L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Viridis Testnet Gas Token", "VRD", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.vrd.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://faucet.vrd.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/224");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.VIRIDISTEST, viridis_test);

		// checkdot_test
		EVMChainInfo checkdot_test = new EVMChainInfo(
				EVMChain.CHECKDOTTEST.toString(), 
				"CheckDot Blockchain Devnet", 
				831L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("CheckDot Blockchain Devnet Gas Token", "CDT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://devnet.checkdot.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.checkdot.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/831");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CHECKDOTTEST, checkdot_test);

		// emoney_test
		EVMChainInfo emoney_test = new EVMChainInfo(
				EVMChain.EMONEYTEST.toString(), 
				"Emoney Network Testnet", 
				4544L, 
				BlockchainType.BORKED.toString(), // single unstable node
				new EVMCurrency("Emoney Network Testnet Gas Token", "EMYC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://testnet.emoney.network/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://ethscan.emoney.network");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.emoney.network/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/4544");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.EMONEYTEST, emoney_test);

		// vanguard_test
		EVMChainInfo vanguard_test = new EVMChainInfo(
				EVMChain.VANGUARDTEST.toString(), 
				"Vanguard Testnet", 
				78600L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Vanguard Gas Token", "VG", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", // > 21k for pure tx
				new ArrayList<String>() {{
					this.add("https://rpc-vanguard.vanarchain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-vanguard.vanarchain.com");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.vanarchain.com");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/78600");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.VANGUARDTEST, vanguard_test);

		// polygon_test
		EVMChainInfo polygon_test = new EVMChainInfo(
				EVMChain.POLYGONCARDONATEST.toString(), 
				"Polygon zkEVM Cardona Testnet", 
				2442L, 
				BlockchainType.BORKED.toString(), // unstable single node
				new EVMCurrency("Polygon zkEVM Cardona Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rpc.cardona.zkevm-rpc.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://cardona-zkevm.polygonscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2442");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.POLYGONCARDONATEST, polygon_test);


		// karak_test
		EVMChainInfo karak_test = new EVMChainInfo(
				EVMChain.KARAKTEST.toString(), 
				"Karak Testnet", 
				2511L, 
				BlockchainType.BORKED.toString(), // unstable
				new EVMCurrency("Karak Testnet Gas Token", "KRK", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://goerli.node1.karak.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://goerli.scan.karak.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2511");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.KARAKTEST, karak_test);

		// whitechain_test
		EVMChainInfo whitechain_test = new EVMChainInfo(
				EVMChain.WHITECHAINTEST.toString(), 
				"Whitechain Testnet", 
				2625L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Whitechain Testnet Gas Token", "WBT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.whitechain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.whitechain.io");
				}},
				new ArrayList<String>() {{
					this.add("https://testnet.whitechain.io/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2625");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.WHITECHAINTEST, whitechain_test);

		// orenium_test
		EVMChainInfo orenium_test = new EVMChainInfo(
				EVMChain.ORENIUMTEST.toString(), 
				"Orenium Testnet Protocol", 
				8890L, 
				BlockchainType.BORKED.toString(), // single node unstable
				new EVMCurrency("Orenium Testnet Protocol Gas Token", "tORE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rpc-dev-testnet.orenium.org/");
					this.add("https://rpc-testnet.orenium.org/");
					this.add("https://rpc-orc.oredex.finance");
					this.add("https://testnet-rpc.oredex.finance");
					this.add("https://oredex-node.oredex.finance");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://faucetcoin.orenium.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/8890");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ORENIUMTEST, orenium_test);

		// dela_test
		EVMChainInfo dela_test = new EVMChainInfo(
				EVMChain.DELATEST.toString(), 
				"Dela Sepolia Testnet", 
				9393L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Dela Sepolia Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://sepolia-dela.deperp.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sepolia-delascan.deperp.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/9393");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DELATEST, dela_test);

		// cycle_test
		EVMChainInfo cycle_ctest = new EVMChainInfo(
				EVMChain.CYCLECUTTLEFISHTEST.toString(), 
				"Cycle Network Testnet Cuttlefish", 
				1228L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Cycle Network Testnet Cuttlefish Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://cuttlefish-rpc-testnet.cyclenetwork.io");
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
					this.add("https://chainlist.org/chain/1228");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CYCLECUTTLEFISHTEST, cycle_ctest);
		
		// nibiru_test
		EVMChainInfo nibiru1_test = new EVMChainInfo(
				EVMChain.NIBIRU1TEST.toString(), 
				"Nibiru Testnet-1", 
				7210L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Nibiru Testnet-1 Gas Token", "NIBI", 18), 
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
		networks.put(EVMChain.NIBIRU1TEST, nibiru1_test);
		
		// neo_test
		EVMChainInfo neo_test = new EVMChainInfo(
				EVMChain.NEOTEST.toString(), 
				"Neo X Testnet T4", 
				12227332L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Neo X Testnet T4 Gas Token", "GAS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet.rpc.banelabs.org/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://xt4scan.ngd.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/12227332");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.NEOTEST, neo_test);
		
		// zilliqa_test
		EVMChainInfo zilliqa_test = new EVMChainInfo(
				EVMChain.ZILLIQATEST.toString(), 
				"Zilliqa Testnet", 
				33101L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Zilliqa Testnet Gas Token", "ZIL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://dev-api.zilliqa.com");
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
					this.add("https://chainlist.org/chain/33101");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZILLIQATEST, zilliqa_test);

		// opsep
		EVMChainInfo opsep = new EVMChainInfo(
				EVMChain.OPTIMISMSEPOLIATEST.toString(), 
				"OP Sepolia Testnet", 
				11155420L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("OP Sepolia Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://optimism-sepolia.drpc.org");
					this.add("https://sepolia.optimism.io");
					this.add("https://optimism-sepolia.blockpi.network/v1/rpc/public");
					this.add("https://public.stackup.sh/api/v1/node/optimism-sepolia");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://optimism-sepolia.blockscout.com");
				}},
				new ArrayList<String>() {{
					this.add("<faucet>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/11155420");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.OPTIMISMSEPOLIATEST, opsep);

		// coti_test
		EVMChainInfo coti_test = new EVMChainInfo(
				EVMChain.COTITEST.toString(), 
				"COTI Testnet", 
				7082400L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("COTI Testnet Gas Token", "COTI", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet.coti.io/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.cotiscan.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.coti.io");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/7082400");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.COTITEST, coti_test);
		
		// coti_test
		EVMChainInfo coti_devtest = new EVMChainInfo(
				EVMChain.COTIDEVTEST.toString(), 
				"COTI Devnet", 
				13068200L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("COTI Devnet Gas Token", "COTI2", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://devnet.coti.io");
					this.add("https://devnet.coti.io/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.coti.io");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/13068200");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.COTIDEVTEST, coti_devtest);

		// SIXdegree_test
		EVMChainInfo SIXdegree_test = new EVMChainInfo(
				EVMChain.SIXDEGREETEST.toString(), 
				"6Degree of Outreach - Testnet", 
				24772477L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("6Degree of Outreach - Testnet Gas Token", "6DO-T", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.6do.world");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-testnet.6do.world");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/24772477");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SIXDEGREETEST, SIXdegree_test);
		
		// biz_test
		EVMChainInfo biz_test = new EVMChainInfo(
				EVMChain.BIZTEST.toString(), 
				"BIZ Smart Chain Testnet", 
				808080L, 
				BlockchainType.BORKED.toString(), // single unstable node
				new EVMCurrency("BIZ Smart Chain Testnet Gas Token", "tBIZT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.bizex.io/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.btscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/808080");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BIZTEST, biz_test);

		// lambda_test
		EVMChainInfo lambda_test = new EVMChainInfo(
				EVMChain.LAMBDATEST.toString(), 
				"Lambda Chain Testnet", 
				17000920L, 
				BlockchainType.BORKED.toString(), // unstable single node
				new EVMCurrency("Lambda Chain Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnrpc.lambda.im/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testscan.lambda.im");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/17000920");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.LAMBDATEST, lambda_test);

		// cyber_test
		EVMChainInfo cyber_test = new EVMChainInfo(
				EVMChain.CYBERTEST.toString(), 
				"Cyber Testnet", 
				111557560L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Cyber Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.cyber.co/");
					this.add("https://cyber-testnet.alt.technology/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.cyberscan.co");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/111557560");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CYBERTEST, cyber_test);

		// basesep
		EVMChainInfo basesep = new EVMChainInfo(
				EVMChain.BASESEPOLIATEST.toString(), 
				"Base Sepolia Test Network", 
				84532L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Base Sepolia Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://sepolia.base.org");
					this.add("https://base-sepolia-rpc.publicnode.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://base-sepolia.blockscout.com");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge.base.org/");
				}},
				new ArrayList<String>() {{
					this.add("https://base.org/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BASESEPOLIATEST, basesep);

		// masa_test
		EVMChainInfo masa_test = new EVMChainInfo(
				EVMChain.MASATEST.toString(), 
				"Masa Testnet", 
				103454L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Masa Testnet Gas Token", "MASA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/masatestne/testnet/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://subnets-test.avax.network/masatestnet");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/103454");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MASATEST, masa_test);

		// ymtech-besu_test
		EVMChainInfo ymtechbesu_test = new EVMChainInfo(
				EVMChain.YMTECHBESUTEST.toString(), 
				"YMTECH-BESU Testnet", 
				202401L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("YMTECH-BESU Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("http://39.119.118.216:8545");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("http://39.119.118.198");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/202401");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.YMTECHBESUTEST, ymtechbesu_test);

		// bitlayer_test
		EVMChainInfo bitlayer_test = new EVMChainInfo(
				EVMChain.BITLAYERTEST.toString(), 
				"Bitlayer Testnet", 
				200810L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Bitlayer Testnet Gas Token", "BTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.bitlayer.org");
					this.add("https://testnet-rpc.bitlayer-rpc.com");
					this.add("https://rpc.ankr.com/bitlayer_testnet");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-scan.bitlayer.org");
				}},
				new ArrayList<String>() {{
					this.add("https://www.bitlayer.org/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/200810");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BITLAYERTEST, bitlayer_test);

		// oasissapphiretest
		EVMChainInfo oasissapphiretest = new EVMChainInfo(
				EVMChain.OASISSAPPHIRETEST.toString(), 
				"Oasis Sapphire Test Network", 
				23295L, 
				BlockchainType.BORKED.toString(), // not ready
				new EVMCurrency("Oasis Test Token", "TEST", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://testnet.sapphire.oasis.dev");
					this.add("https://testnet.sapphire.oasis.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.sapphire.oasis.io/");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.testnet.oasis.dev/");
				}},
				new ArrayList<String>() {{
					this.add("https://oasisprotocol.org/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.OASISSAPPHIRETEST, oasissapphiretest);

		// hychain_test
		EVMChainInfo hychain_test = new EVMChainInfo(
				EVMChain.HYCHAINTEST.toString(), 
				"HYCHAIN Testnet", 
				29112L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("HYCHAIN Testnet Gas Token", "TOPIA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.hychain.com/http");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.explorer.hychain.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/29112");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.HYCHAINTEST, hychain_test);

		// oasisemerald
		EVMChainInfo oasisemeraldtest = new EVMChainInfo(
				EVMChain.OASISEMERALDTEST.toString(), 
				"Oasis Emerald Test Network", 
				42261L, 
				BlockchainType.BORKED.toString(), // testnet.emerald.oasis.dev often unavailable
				new EVMCurrency("Oasis Test Token", "TEST", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://testnet.emerald.oasis.dev/");
					this.add("https://testnet.emerald.oasis.io/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.emerald.oasis.dev/");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.testnet.oasis.dev/");
				}},
				new ArrayList<String>() {{
					this.add("https://oasisprotocol.org/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.OASISEMERALDTEST, oasisemeraldtest);

		// creditcoin_test
		EVMChainInfo creditcoin_devtest = new EVMChainInfo(
				EVMChain.CREDITCOINDEVTEST.toString(), 
				"Creditcoin Devnet", 
				102032L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Creditcoin Devnet Gas Token", "devCTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.cc3-devnet.creditcoin.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://creditcoin-devnet.blockscout.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/102032");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CREDITCOINDEVTEST, creditcoin_devtest);
		
		// thanos_test
		EVMChainInfo thanos_test = new EVMChainInfo(
				EVMChain.THANOSTEST.toString(), 
				"Thanos Sepolia", 
				111551119090L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Thanos Sepolia Gas Token", "TON", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.thanos-sepolia.tokamak.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.thanos-sepolia.tokamak.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/111551119090");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.THANOSTEST, thanos_test);
		
		// creditcoin_test
		EVMChainInfo creditcoin_test = new EVMChainInfo(
				EVMChain.CREDITCOINTEST.toString(), 
				"Creditcoin Testnet", 
				102031L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Creditcoin Testnet Gas Token", "tCTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.cc3-testnet.creditcoin.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://creditcoin-testnet.blockscout.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/102031");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CREDITCOINTEST, creditcoin_test);

		// camp_test
		EVMChainInfo camp_test = new EVMChainInfo(
				EVMChain.CAMPTEST.toString(), 
				"Camp Testnet", 
				90354L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Camp Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-camp-network-4xje7wy105.t.conduit.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorerl2new-camp-network-4xje7wy105.t.conduit.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://www.campnetwork.xyz/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/90354");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CAMPTEST, camp_test);

		// odyssey_test
		EVMChainInfo odyssey1_test = new EVMChainInfo(
				EVMChain.ODYSSEY1TEST.toString(), 
				"Odyssey Chain (Testnet)", 
				131313L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Odyssey Chain (Testnet) Gas Token", "DIONE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnode.dioneprotocol.com/ext/bc/D/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.dioneprotocol.com/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/131313");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ODYSSEY1TEST, odyssey1_test);

		// kakarot_test
		EVMChainInfo kakarot_test_sep = new EVMChainInfo(
				EVMChain.KAKAROTSEPOLIATEST.toString(), 
				"Kakarot Starknet Sepolia", 
				920637907288165L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Kakarot Starknet Sepolia Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://sepolia-rpc.kakarot.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sepolia-explorer.kakarot.org");
				}},
				new ArrayList<String>() {{
					this.add("https://sepolia-faucet.kakarot.org/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/920637907288165");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.KAKAROTSEPOLIATEST, kakarot_test_sep);
		
		// r0ar_test
		EVMChainInfo r0ar_test = new EVMChainInfo(
				EVMChain.R0ARTEST.toString(), 
				"R0AR Testnet", 
				11166111L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("R0AR Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet.rpc-r0ar.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.r0arscan.io");
				}},
				new ArrayList<String>() {{
					this.add("https://testnet.r0arfaucet.io");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/11166111");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.R0ARTEST, r0ar_test);
		
		// magape_test
		EVMChainInfo magape_test = new EVMChainInfo(
				EVMChain.MAGAPETEST.toString(), 
				"MagApe Testnet", 
				141319L, 
				BlockchainType.BORKED.toString(), // single unstable
				new EVMCurrency("MagApe Testnet Gas Token", "MAG", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-api.magape.io/chain/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("http://testnet-api.magape.io:81");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/141319");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MAGAPETEST, magape_test);

		// taiko
		EVMChainInfo taiko7 = new EVMChainInfo(
				EVMChain.TAIKOALPHA7TEST.toString(), 
				"Taiko Hekla L2", 
				167009L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Taiko Hekla L2 Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://taiko-hekla-rpc.publicnode.com");
					this.add("https://rpc.hekla.taiko.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://hekla.taikoscan.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/167009");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TAIKOALPHA7TEST, taiko7);

		// fxcore_test
		EVMChainInfo fxcore_test = new EVMChainInfo(
				EVMChain.FXCORETEST.toString(), 
				"F(x)Core Testnet Network", 
				90001L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("F(x)Core Testnet Network Gas Token", "FX", 18), 
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
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/90001");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FXCORETEST, fxcore_test);

		// unit_test
		EVMChainInfo unit_test = new EVMChainInfo(
				EVMChain.UNIT0TEST.toString(), 
				"Unit Zero Testnet", 
				88817L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Unit Zero Testnet Gas Token", "UNIT0", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.unit0.dev");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-testnet.unit0.dev");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/88817");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.UNIT0TEST, unit_test);

		// zillion_test
		EVMChainInfo zillion_test = new EVMChainInfo(
				EVMChain.ZILLIONTEST.toString(), 
				"Zillion Sepolia Testnet", 
				282828L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Zillion Sepolia Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://sepolia.zillnet.io/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sepolia.zillnet.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/282828");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZILLIONTEST, zillion_test);

		// amoy_test, will replace mumbai
		EVMChainInfo amoy_test = new EVMChainInfo(
				EVMChain.AMOYTEST.toString(), 
				"Amoy", 
				80002L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Amoy Gas Token", "MATIC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://polygon-amoy-bor-rpc.publicnode.com");
					this.add("https://rpc-amoy.polygon.technology");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://www.oklink.com/amoy");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.polygon.technology/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/80002");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.AMOYTEST, amoy_test);

		// cantotest
		EVMChainInfo cantotest = new EVMChainInfo(
				EVMChain.CANTOTEST.toString(), 
				"Canto Test Network", 
				7701L, 
				BlockchainType.BORKED.toString(), // single rpc node is down
				new EVMCurrency("Canto Test Token", "CANTO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. crazy usage atm
				new ArrayList<String>() {{
					this.add("https://eth.plexnode.wtf");
					this.add("https://testnet-archive.plexnode.wtf");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-explorer.canto.neobase.one/");
				}},
				new ArrayList<String>() {{
					this.add("https://discord.com/invite/canto, social-faucet channel");
				}},
				new ArrayList<String>() {{
					this.add("https://docs.canto.io/user-guides/connecting-to-canto");
					this.add("https://chainlist.org/chain/740");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CANTOTEST, cantotest);

		// taikotest_alpha2
		EVMChainInfo taikotest_alpha5 = new EVMChainInfo(
				EVMChain.TAIKOALPHA5TEST.toString(), 
				"Taiko Ethereum A5 Test Network", 
				167007L, 
				BlockchainType.BORKED.toString(), // next alphanet
				new EVMCurrency("Taiko A5 Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://taiko-jolnir.blockpi.network/v1/rpc/public");
					//this.add("https://rpc.jolnir.taiko.xyz"); // old account balance reply but latestblocknr?  
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.jolnir.taiko.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge.jolnir.taiko.xyz/");
				}},
				new ArrayList<String>() {{
					this.add("https://taiko.xyz");
					this.add("https://chainlist.org/chain/167007");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TAIKOALPHA5TEST, taikotest_alpha5);

		// taikotest_alpha2
		EVMChainInfo taikotest_alpha2 = new EVMChainInfo(
				EVMChain.TAIKOALPHA2TEST.toString(), 
				"Taiko Ethereum A2 Test Network", 
				167004L, 
				BlockchainType.BORKED.toString(), // now alpha3
				new EVMCurrency("Taiko A2 Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rpc.a2.taiko.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.a2.taiko.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge.test.taiko.xyz/");
				}},
				new ArrayList<String>() {{
					this.add("https://taiko.xyz");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TAIKOALPHA2TEST, taikotest_alpha2);

		// taikotest_alpha3
		EVMChainInfo taikotest_alpha3 = new EVMChainInfo(
				EVMChain.TAIKOALPHA3TEST.toString(), 
				"Taiko Ethereum A3 Test Network", 
				167005L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Taiko A3 Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rpc.test.taiko.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.test.taiko.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge.test.taiko.xyz/");
				}},
				new ArrayList<String>() {{
					this.add("https://taiko.xyz");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TAIKOALPHA3TEST, taikotest_alpha3);

		// taikotest_alpha
		EVMChainInfo taikotest_alpha = new EVMChainInfo(
				EVMChain.TAIKOALPHA1TEST.toString(), 
				"Taiko Ethereum A1 Test Network", 
				167003L, 
				BlockchainType.BORKED.toString(), // endpoints/explorers from docs no longer resolve
				new EVMCurrency("Taiko A1 Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://l2rpc.a1.taiko.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://l2explorer.a1.taiko.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://l2faucet.a1.taiko.xyz/");
				}},
				new ArrayList<String>() {{
					this.add("https://taiko.xyz/docs/alpha-1-testnet/configure-wallet");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TAIKOALPHA1TEST, taikotest_alpha);

		// syscoin_test
		EVMChainInfo syscoin_test = new EVMChainInfo(
				EVMChain.SYSCOINTEST.toString(), 
				"Syscoin Tanenbaum Testnet", 
				5700L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Syscoin test token", "tSYS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					//this.add("https://rollux.rpc.tanenbaum.io"); // ??
					this.add("https://rpc.tanenbaum.io");
					this.add("https://syscoin-tanenbaum-evm.publicnode.com");
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
					this.add("https://tanenbaum.io");
					this.add("https://www.coingecko.com/en/coins/syscoin");
					this.add("https://bridge.syscoin.org");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SYSCOINTEST, syscoin_test);


		// milkomediatestA1
		EVMChainInfo milkomediatestA1 = new EVMChainInfo(
				EVMChain.MILKOMEDAA1TEST.toString(), 
				"Milkomeda Algorand testnet", 
				200202L, 
				BlockchainType.BORKED.toString(), // closing down in 2023, mainnet 2024
				new EVMCurrency("milkTALGO", "milkTALGO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rpc-devnet-algorand-rollup.a1.milkomeda.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://testnet-algorand-rollup.a1.milkomeda.com");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/200202");
					this.add("https://dcspark.github.io/milkomeda-documentation/algorand/for-end-users/configuring-metamask/");
					this.add("https://algorand-bridge.milkomeda.com/devnet/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MILKOMEDAA1TEST, milkomediatestA1);

		// wemix_test
		EVMChainInfo wemix_test = new EVMChainInfo(
				EVMChain.WEMIXTEST.toString(), 
				"WEMIX3.0 Testnet", 
				1112L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("WEMIX", "tWEMIX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"101000000000", //101 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://api.test.wemix.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://microscope.test.wemix.com");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1112");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.WEMIXTEST, wemix_test);

		// shibuya test network
		EVMChainInfo shibuya = new EVMChainInfo(
				EVMChain.SHIBUYATEST.toString(), 
				"ASTAR Testnet", 
				81L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("SBY", "SBY", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://evm.shibuya.astar.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://shibuya.subscan.io");
				}},
				new ArrayList<String>() {{
					this.add("https://portal.astar.network");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/81");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SHIBUYATEST, shibuya);

		// apex_test
		EVMChainInfo apex_test = new EVMChainInfo(
				EVMChain.APEXTEST.toString(), 
				"APEX Testnet", 
				3993L, 
				BlockchainType.BORKED.toString(), // unstable
				new EVMCurrency("APEX Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.apexlayer.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://exp-testnet.apexlayer.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://sepoliafaucet.com/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/3993");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.APEXTEST, apex_test);

		// auroria_test
		EVMChainInfo auroria_test = new EVMChainInfo(
				EVMChain.AURORIATEST.toString(), 
				"Auroria Testnet", 
				205205L, 
				BlockchainType.BORKED.toString(), // single node unstable
				new EVMCurrency("Auroria Testnet Gas Token", "tSTRAX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://auroria.rpc.stratisevm.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://auroria.explorer.stratisevm.com");
				}},
				new ArrayList<String>() {{
					this.add("https://auroria.faucet.stratisevm.com");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/205205");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.AURORIATEST, auroria_test);

		// deepl_test
		EVMChainInfo deepl_test = new EVMChainInfo(
				EVMChain.DEEPLTEST.toString(), 
				"DeepL Testnet", 
				222666L, 
				BlockchainType.BORKED.toString(), // single node unstable
				new EVMCurrency("DeepL Testnet Gas Token", "DEEPL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://testnet.deeplnetwork.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-scan.deeplnetwork.org");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.deeplnetwork.org");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/222666");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DEEPLTEST, deepl_test);

		// crossfi_test
		EVMChainInfo crossfi_test = new EVMChainInfo(
				EVMChain.CROSSFITEST.toString(), 
				"CrossFi Testnet", 
				4157L, 
				BlockchainType.BORKED.toString(), // unstable single node
				new EVMCurrency("CrossFi Testnet Gas Token", "XFI", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.ms");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.testnet.ms");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/4157");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CROSSFITEST, crossfi_test);

		// gitgo_test
		EVMChainInfo gitgo_test = new EVMChainInfo(
				EVMChain.GITGOTEST.toString(), 
				"GitGo Testnet", 
				31337L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://odindev.gitgo.cloud/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://odindev.gitgo.cloud");
				}},
				new ArrayList<String>() {{
					this.add("<faucet todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://odindev.gitgo.cloud");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.GITGOTEST, gitgo_test);

		// autonity_bakerloo_test
		EVMChainInfo autonity_bakerloo_test = new EVMChainInfo(
				EVMChain.AUTONITYBAKERLOOSUMIDATEST.toString(), 
				"Autonity Bakerloo (Sumida) Testnet", 
				65010002L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Autonity Bakerloo (Sumida) Testnet Gas Token", "ATN", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rpc1.bakerloo.autonity.org/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://bakerloo.autonity.org");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.autonity.org/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/65010002");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.AUTONITYBAKERLOOSUMIDATEST, autonity_bakerloo_test);

		// layeredge_test
		EVMChainInfo layeredge_test = new EVMChainInfo(
				EVMChain.LAYEREDGETEST.toString(), 
				"LayerEdge testnet", 
				3456L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("LayerEdge testnet Gas Token", "BTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.layeredge.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-explorer.layeredge.io");
				}},
				new ArrayList<String>() {{
					this.add("https://testnet-faucet.layeredge.io");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/3456");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.LAYEREDGETEST, layeredge_test);

		// niza_test
		EVMChainInfo niza_test = new EVMChainInfo(
				EVMChain.NIZATEST.toString(), 
				"Niza Chain Testnet", 
				20073L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Niza Chain Testnet Gas Token", "NIZA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet.nizascan.io/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.nizascan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/20073");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.NIZATEST, niza_test);

		// space_test
		EVMChainInfo space_test = new EVMChainInfo(
				EVMChain.SPACETEST.toString(), 
				"Space Subnet Testnet", 
				48795L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Space Subnet Testnet Gas Token", "FUEL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/space/testnet/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://subnets-test.avax.network/space");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/48795");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SPACETEST, space_test);

		// photona_test
		EVMChainInfo photona_test = new EVMChainInfo(
				EVMChain.PHOTONAURORATEST.toString(), 
				"Photon Aurora Testnet", 
				55551L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Photon Aurora Testnet Gas Token", "PTON", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-test2.photonchain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet2.photonchain.io");
				}},
				new ArrayList<String>() {{
					this.add("https://photonchain.io/testnet2");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/55551");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PHOTONAURORATEST, photona_test);
		
		// polynomia_test
		EVMChainInfo polynomia_test = new EVMChainInfo(
				EVMChain.POLYNOMIATEST.toString(), 
				"Polynomia Sepolia", 
				80008L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Polynomia Sepolia Gas Token", "ETH", 18), 
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
		networks.put(EVMChain.POLYNOMIATEST, polynomia_test);
		
		// hemi_test
		EVMChainInfo hemi_test = new EVMChainInfo(
				EVMChain.HEMITEST.toString(), 
				"Hemi Testnet", 
				743111L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Hemi Testnet Gas Token", "ETH", 18), 
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
					this.add("https://testnet.explorer.hemi.xyz");
					this.add("https://testnet.explorer.hemi.xyz/api/v2/");
				}},
				new ArrayList<String>() {{
					this.add("https://app.hemi.xyz/en/tunnel/");
				}},
				new ArrayList<String>() {{
					this.add("https://docs.hemi.xyz/main/network-details");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.HEMITEST, hemi_test);
		
		// slingshot_test
		EVMChainInfo slingshot_test = new EVMChainInfo(
				EVMChain.SLINGSHOTTEST.toString(), 
				"SlingShot Testnet", 
				97435L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("SlingShot Testnet Gas Token", "SLINGT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-dependent-emerald-whippet-gh6kch3nen.t.conduit.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-dependent-emerald-whippet-gh6kch3nen.t.conduit.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/97435");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SLINGSHOTTEST, slingshot_test);
		
		// edgamatrix_test
		EVMChainInfo edgamatrix_test = new EVMChainInfo(
				EVMChain.EDGAMATRIXTEST.toString(), 
				"EdgaMatrix Chain Testnet", 
				99876L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("EdgaMatrix Chain Testnet Gas Token", "EMC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc1-testnet.emc.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.emcscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/99876");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.EDGAMATRIXTEST, edgamatrix_test);
		
		// ternoa_test
		EVMChainInfo ternoa_test = new EVMChainInfo(
				EVMChain.TERNOATEST.toString(), 
				"Ternoa Testnet", 
				752024L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Ternoa Testnet Gas Token", "CAPS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.zkevm.ternoa.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.zkevm.ternoa.network");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.zkevm.ternoa.network");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/752024");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TERNOATEST, ternoa_test);
		
		// bob_test
		EVMChainInfo bob_test = new EVMChainInfo(
				EVMChain.BOBTEST.toString(), 
				"BOB Sepolia", 
				808813L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("BOB Sepolia Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://bob-sepolia.rpc.gobob.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://bob-sepolia.explorer.gobob.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/808813");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BOBTEST, bob_test);
		
		// runevm_test
		EVMChainInfo runevm_test = new EVMChainInfo(
				EVMChain.RUNEVMTEST.toString(), 
				"RUNEVM Testnet", 
				840000L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("RUNEVM Testnet Gas Token", "tBTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.runevm.io/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.runevm.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.runevm.io/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/840000");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.RUNEVMTEST, runevm_test);
		
		// blessnet_test
		EVMChainInfo blessnet_test = new EVMChainInfo(
				EVMChain.BLESSNETTEST.toString(), 
				"Blessnet Sepolia", 
				11145513L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Blessnet Sepolia Gas Token", "BLESS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://blessnet-sepolia-testnet.rpc.caldera.xyz/http");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://blessnet-sepolia-testnet.explorer.caldera.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://blessnet-sepolia-testnet.hub.caldera.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/11145513");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BLESSNETTEST, blessnet_test);
		
		// memento_test
		EVMChainInfo memento_test = new EVMChainInfo(
				EVMChain.MEMENTOTEST.toString(), 
				"Memento Testnet", 
				12052024L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Memento Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://test-rpc.mementoblockchain.com/IRkghvI3FfEArEJMr4zC/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://test-explorer.mementoblockchain.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/12052024");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MEMENTOTEST, memento_test);
		
		// sophon_test
		EVMChainInfo sophon_test = new EVMChainInfo(
				EVMChain.SOPHONTEST.toString(), 
				"Sophon Testnet", 
				531050104L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Sophon Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.sophon.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.sophon.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/531050104");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SOPHONTEST, sophon_test);
		
		// arena-z-testnet_test
		EVMChainInfo arenaztestnet_test = new EVMChainInfo(
				EVMChain.ARENAZTEST.toString(), 
				"arena-z-testnet", 
				9897L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("arena-z-testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.arena-z.t.raas.gelato.cloud");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://arena-z.blockscout.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/9897");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ARENAZTEST, arenaztestnet_test);
		
		// dm2_test
		EVMChainInfo dm2_test = new EVMChainInfo(
				EVMChain.DM2TEST.toString(), 
				"DM2 Verse Testnet", 
				68775L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("DM2 Verse Testnet Gas Token", "OAS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.dm2verse.dmm.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.dm2verse.dmm.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/68775");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DM2TEST, dm2_test);
		
		// tetron_test
		EVMChainInfo tetron_test = new EVMChainInfo(
				EVMChain.TETRONTEST.toString(), 
				"Tetron Testnet Smart Chain", 
				97053L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Tetron Testnet Smart Chain Gas Token", "TSC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://test-rpc.tscscan.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.tscscan.org");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/97053");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TETRONTEST, tetron_test);
		
		// bethel
		EVMChainInfo bethel = new EVMChainInfo(
				EVMChain.BETHEL.toString(), 
				"Bethel Sydney", 
				202202L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Bethel Sydney Gas Token", "BECX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-sydney.bethel.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sydney.bethel.network");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet-sydney.bethel.network");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/202202");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BETHEL, bethel);

		// tixchain_test
		EVMChainInfo tixchain_test = new EVMChainInfo(
				EVMChain.TIXCHAINTEST.toString(), 
				"TixChain Testnet", 
				723107L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("TixChain Testnet Gas Token", "TIX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/tixchain/testnet/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://subnets-test.avax.network/tixchain");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/723107");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TIXCHAINTEST, tixchain_test);

		// automata_test
		EVMChainInfo automata_o_test = new EVMChainInfo(
				EVMChain.AUTOMATAORBITTEST.toString(), 
				"Automata Orbit Testnet", 
				1398244L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Automata Orbit Testnet Gas Token", "ATA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-orbit-testnet.ata.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://automata-orbit-testnet-explorer.alt.technology");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1398244");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.AUTOMATAORBITTEST, automata_o_test);
		
		// vana_test
		EVMChainInfo vana_m_test = new EVMChainInfo(
				EVMChain.VANAMOKSKATEST.toString(), 
				"Vana Moksha Testnet", 
				14800L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Vana Moksha Testnet Gas Token", "VANA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.moksha.vana.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://vanascan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/14800");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.VANAMOKSKATEST, vana_m_test);
		
		// world_test
		EVMChainInfo world_test = new EVMChainInfo(
				EVMChain.WORLDTEST.toString(), 
				"World Chain Sepolia Testnet", 
				4801L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("World Chain Sepolia Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://worldchain-sepolia.g.alchemy.com/public");
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
					this.add("https://chainlist.org/chain/4801");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.WORLDTEST, world_test);
		
		// lemonchaintestnet_test
		EVMChainInfo lemonchaintestnet_test = new EVMChainInfo(
				EVMChain.LEMONCHAINTEST.toString(), 
				"LemonChainTestnet", 
				1005L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("LemonChainTestnet Gas Token", "tLEMX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.allthingslemon.io");
					this.add("https://rpc.testnet.lemonchain.io");
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
					this.add("https://chainlist.org/chain/1005");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.LEMONCHAINTEST, lemonchaintestnet_test);
		
		// omni_test
		EVMChainInfo omni_test = new EVMChainInfo(
				EVMChain.OMNITEST.toString(), 
				"Omni Omega Testnet", 
				164L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Omni Omega Testnet Gas Token", "OMNI", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://omega.omni.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://omega.omniscan.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/164");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.OMNITEST, omni_test);
		
		// fluence_test
		EVMChainInfo fluence_test = new EVMChainInfo(
				EVMChain.FLUENCETEST.toString(), 
				"Fluence Testnet", 
				52164803L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Fluence Testnet Gas Token", "tFLT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"3000000", //3M units !
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.fluence.dev/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://blockscout.testnet.fluence.dev");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/52164803");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FLUENCETEST, fluence_test);
		
		// zeroth_test
		EVMChainInfo zeroth_test = new EVMChainInfo(
				EVMChain.ZEROTHTEST.toString(), 
				"Zeroth Testnet", 
				14088L, 
				BlockchainType.BORKED.toString(), // 502 for single node
				new EVMCurrency("Zeroth Testnet Gas Token", "ZRHt", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://test-my.zeroth.run");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://test-scan.zeroth.run");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/14088");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZEROTHTEST, zeroth_test);
		
		// fluence_test
		EVMChainInfo fluence_stest = new EVMChainInfo(
				EVMChain.FLUENCESTAGETEST.toString(), 
				"Fluence Stage", 
				123420000220L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Fluence Stage Gas Token", "tFLT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice // TODO lower gas price (12123000000)
				"1000000", //1M units
				new ArrayList<String>() {{
					this.add("https://rpc.stage.fluence.dev");
					this.add("https://rpc-123420000220.raas-testnet.gelato.digital/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://blockscout-123420000220.raas-testnet.gelato.digital");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/123420000220");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FLUENCESTAGETEST, fluence_stest);
		
		// edge_test
		EVMChainInfo edge_test = new EVMChainInfo(
				EVMChain.EDGETEST.toString(), 
				"Edge Matrix Chain Testnet", 
				99876L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Edge Matrix Chain Testnet Gas Token", "EMC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc1-testnet.emc.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.emcscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/99876");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.EDGETEST, edge_test);
		
		// stratovm_test
		EVMChainInfo stratovm_test = new EVMChainInfo(
				EVMChain.STRATOVMTEST.toString(), 
				"StratoVM Testnet", 
				93747L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("StratoVM Testnet Gas Token", "SVM", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.stratovm.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.stratovm.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/93747");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.STRATOVMTEST, stratovm_test);
		
		// xprotocol_test
		EVMChainInfo xprotocol_test = new EVMChainInfo(
				EVMChain.XPROTOCOLTEST.toString(), 
				"Xprotocol Testnet", 
				83144L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Xprotocol Testnet Gas Token", "KICK", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.xprotocol.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.xprotocol.org");
				}},
				new ArrayList<String>() {{
					this.add("https://xprotocol.org/faucets");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/83144");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.XPROTOCOLTEST, xprotocol_test);
		
		// cratd2c_test
		EVMChainInfo cratd2c_test = new EVMChainInfo(
				EVMChain.CRATD2CTEST.toString(), 
				"CratD2C Testnet", 
				65349L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("CratD2C Testnet Gas Token", "CRAT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://cratd2c-testnet-node1.cratd2csmartchain.io/");
					this.add("https://cratd2c-testnet-node2.cratd2csmartchain.io/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-testnet.cratd2csmartchain.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/65349");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CRATD2CTEST, cratd2c_test);
		
		// ducatusx_test
		EVMChainInfo ducatusx_test = new EVMChainInfo(
				EVMChain.DUCATUSXTEST.toString(), 
				"DucatusX Testnet", 
				26482L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("DucatusX Testnet Gas Token", "DUCX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://ducx-testnet-node2.rocknblock.io");
					this.add("https://ducx-testnet-node1.rocknblock.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-testnet.ducatusx.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/26482");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.DUCATUSXTEST, ducatusx_test);
		
		// tiktrix_test
		EVMChainInfo tiktrix_test = new EVMChainInfo(
				EVMChain.TIKTRIXTEST.toString(), 
				"TikTrix Testnet", 
				62092L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("TikTrix Testnet Gas Token", "tTTX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://tiktrix-rpc.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://tiktrix.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/62092");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TIKTRIXTEST, tiktrix_test);
		
		// xcoin
		EVMChainInfo xcoin = new EVMChainInfo(
				EVMChain.XCOIN.toString(), 
				"XCOIN", 
				158345L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("XCOIN Gas Token", "XCOIN", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-xcoin.cryptoxnetwork.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://cryptoxscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/158345");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.XCOIN, xcoin);
		
		// camp_test
		EVMChainInfo campv2_test = new EVMChainInfo(
				EVMChain.CAMPV2TEST.toString(), 
				"Camp Network Testnet V2", 
				325000L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Camp Network Testnet V2 Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-campnetwork.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://camp-network-testnet.blockscout.com");
				}},
				new ArrayList<String>() {{
					this.add("https://www.campnetwork.xyz/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/325000");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CAMPV2TEST, campv2_test);
		
		// polter_test
		EVMChainInfo polter_test = new EVMChainInfo(
				EVMChain.POLTERTEST.toString(), 
				"Polter Testnet", 
				631571L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Polter Testnet Gas Token", "GHST", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://geist-polter.g.alchemy.com/public");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://polter-testnet.explorer.alchemy.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/631571");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.POLTERTEST, polter_test);
		
		// exsat_test
		EVMChainInfo exsat_test = new EVMChainInfo(
				EVMChain.EXSATTEST.toString(), 
				"exSat Testnet", 
				839999L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("exSat Testnet Gas Token", "BTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://evm-tst3.exsat.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan-testnet.exsat.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/839999");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.EXSATTEST, exsat_test);
		
		// odyssey_test
		EVMChainInfo odyssey_test = new EVMChainInfo(
				EVMChain.ODYSSEYTEST.toString(), 
				"Odyssey Testnet", 
				911867L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Odyssey Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://odyssey.ithaca.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://odyssey-explorer.ithaca.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/911867");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ODYSSEYTEST, odyssey_test);
		
		// sorian_test
		EVMChainInfo sorian_test = new EVMChainInfo(
				EVMChain.SORIANTEST.toString(), 
				"Sorian Testnet", 
				210210L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Sorian Testnet Gas Token", "tSOR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.sorian.io");
					this.add("https://testnet.rpc.sorian.io");
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
					this.add("https://chainlist.org/chain/210210");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SORIANTEST, sorian_test);
		
		// zircuit_test
		EVMChainInfo zircuit_test = new EVMChainInfo(
				EVMChain.ZIRCUITTEST.toString(), 
				"Zircuit Testnet", 
				48899L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Zircuit Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("http://zircuit1-testnet.p2pify.com/");
					this.add("https://zircuit1.p2pify.com/");
					this.add("https://zircuit1-testnet.p2pify.com/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.zircuit.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/48899");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZIRCUITTEST, zircuit_test);

		// citrea_test
		EVMChainInfo citrea_test = new EVMChainInfo(
				EVMChain.CITREATEST.toString(), 
				"Citrea Devnet", 
				62298L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Citrea Devnet Gas Token", "cBTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.devnet.citrea.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.devnet.citrea.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://citrea.xyz/bridge");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/62298");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CITREATEST, citrea_test);

		// geek_test
		EVMChainInfo geek_test = new EVMChainInfo(
				EVMChain.GEEKTEST.toString(), 
				"GEEK Verse Testnet", 
				75513L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("GEEK Verse Testnet Gas Token", "GEEK", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.geekout-pte.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-testnet.geekout-pte.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/75513");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.GEEKTEST, geek_test);

		// optimusz7_test
		EVMChainInfo optimusz7_test = new EVMChainInfo(
				EVMChain.OPTIMUSZ7TEST.toString(), 
				"OptimusZ7 Testnet", 
				97970L, 
				BlockchainType.BORKED.toString(), // single node unstable
				new EVMCurrency("OptimusZ7 Testnet Gas Token", "OZ7", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.optimusz7.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.optimusz7.com");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.optimusz7.com");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/97970");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.OPTIMUSZ7TEST, optimusz7_test);

		// form_test
		EVMChainInfo form_test = new EVMChainInfo(
				EVMChain.FORMTEST.toString(), 
				"Form Testnet", 
				132902L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Form Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.form.network/http");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-explorer.form.network");
				}},
				new ArrayList<String>() {{
					this.add("https://info.form.network/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/132902");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FORMTEST, form_test);

		// orange_test
		EVMChainInfo orange_test = new EVMChainInfo(
				EVMChain.ORANGETEST.toString(), 
				"Orange Chain Testnet", 
				240515L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Orange Chain Testnet Gas Token", "BTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.orangechain.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-scan.orangechain.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/240515");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ORANGETEST, orange_test);

		// lamina1_test
		EVMChainInfo lamina1_test = new EVMChainInfo(
				EVMChain.LAMINA1TEST.toString(), 
				"Lamina1 Testnet", 
				764984L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Lamina1 Testnet Gas Token", "L1T", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/lamina1tes/testnet/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://subnets-test.avax.network/lamina1tes");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/764984");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.LAMINA1TEST, lamina1_test);

		// tsc_test
		EVMChainInfo tsc_test = new EVMChainInfo(
				EVMChain.TSCTEST.toString(), 
				"TSC Testnet", 
				820522L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("TSC Testnet Gas Token", "tTAS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet.tscscan.io/testrpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.tscscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/820522");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TSCTEST, tsc_test);

		// lamina1identity_test
		EVMChainInfo lamina1identity_test = new EVMChainInfo(
				EVMChain.LAMINA1IDENTITYTEST.toString(), 
				"Lamina1 Identity Testnet", 
				767368L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Lamina1 Identity Testnet Gas Token", "L1IDT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/lamina1id/testnet/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://subnets-test.avax.network/lamina1id");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/767368");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.LAMINA1IDENTITYTEST, lamina1identity_test);

		// evmostest
		EVMChainInfo evmostest = new EVMChainInfo(
				EVMChain.EVMOSTEST.toString(), 
				"EVMOS Testnet", 
				9000L, 
				BlockchainType.BORKED.toString(), // so many issues ..
				new EVMCurrency("tEVMOS", "tEVMOS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://evmos-testnet-evm-rpc.publicnode.com");
					this.add("https://eth.bd.evmos.dev:8545");
					this.add("https://evmos-testnet.lava.build");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://escan.live/");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.evmos.dev/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/9000");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.EVMOSTEST, evmostest);

		// roburna_test
		EVMChainInfo roburna_test = new EVMChainInfo(
				EVMChain.ROBURNATEST.toString(), 
				"Roburna Testnet", 
				159L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Roburna Testnet Gas Token", "RBAT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://preseed-testnet-1.roburna.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.rbascan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/159");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ROBURNATEST, roburna_test);

		// x_test
		EVMChainInfo x_test = new EVMChainInfo(
				EVMChain.XLAYERTEST.toString(), 
				"X Layer Testnet", 
				195L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("X Layer Testnet Gas Token", "OKB", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testrpc.xlayer.tech");
					this.add("https://xlayertestrpc.okx.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://www.oklink.com/xlayer-test");
				}},
				new ArrayList<String>() {{
					this.add("https://www.okx.com/xlayer/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/195");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.XLAYERTEST, x_test);

		// neura_test
		EVMChainInfo neura_test = new EVMChainInfo(
				EVMChain.NEURATEST.toString(), 
				"Neura Testnet", 
				267L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Neura Testnet Gas Token", "ANKR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.ankr.com/neura_testnet");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.neura-testnet.ankr.com");
				}},
				new ArrayList<String>() {{
					this.add("https://testnet.neuraprotocol.io/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/267");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.NEURATEST, neura_test);

		// gravity_test
		EVMChainInfo gravity_test = new EVMChainInfo(
				EVMChain.GRAVITYTEST.toString(), 
				"Gravity Alpha Testnet Sepolia", 
				13505L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Gravity Alpha Testnet Sepolia Gas Token", "G.", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-sepolia.gravity.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-sepolia.gravity.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/13505");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.GRAVITYTEST, gravity_test);

		// zkbase_test
		EVMChainInfo zkbase_test = new EVMChainInfo(
				EVMChain.ZKBASETEST.toString(), 
				"ZKBase Sepolia Testnet", 
				1789L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("ZKBase Sepolia Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://sepolia-rpc.zkbase.app");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sepolia-explorer.zkbase.app");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1789");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZKBASETEST, zkbase_test);

		// poodl_test
		EVMChainInfo poodl_test = new EVMChainInfo(
				EVMChain.POODLTEST.toString(), 
				"Poodl Testnet", 
				15257L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Poodl Testnet Gas Token", "POODL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.poodl.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.poodl.org");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.poodl.org");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/15257");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.POODLTEST, poodl_test);


		// satoshivm_test
		EVMChainInfo satoshivm_test = new EVMChainInfo(
				EVMChain.SATOSHIVMTEST.toString(), 
				"SatoshiVM Testnet", 
				3110L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("SatoshiVM Testnet Gas Token", "tBTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://test-rpc-node-http.svmscan.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.svmscan.io/");
				}},
				new ArrayList<String>() {{
					this.add("https://bitcoinfaucet.uo1.net/send.php"); // tBTC
					this.add("https://coinfaucet.eu/en/btc-testnet/"); // tBTC
				}},
				new ArrayList<String>() {{
					this.add("https://docs.satoshivm.io/user-guide/network-information#network-configuration");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SATOSHIVMTEST, satoshivm_test);

		// flag_test
		EVMChainInfo flag_test = new EVMChainInfo(
				EVMChain.FLAGTEST.toString(), 
				"Flag Testnet", 
				1147L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Flag Testnet Gas Token", "FLAG", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.flagscan.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-explorer.flagscan.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.flagscan.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1147");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FLAGTEST, flag_test);

		// zkcandy_test
		EVMChainInfo zkcandy_test = new EVMChainInfo(
				EVMChain.ZKCANDYTEST.toString(), 
				"zkCandy Sepolia Testnet", 
				302L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("zkCandy Sepolia Testnet Gas Token", "ETH", 18), 
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
		networks.put(EVMChain.ZKCANDYTEST, zkcandy_test);


		// cronos_test
		EVMChainInfo cronos_test = new EVMChainInfo(
				EVMChain.CRONOSZKEVMTEST.toString(), 
				"Cronos zkEVM Testnet", 
				282L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Cronos zkEVM Testnet Gas Token", "TCRO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-zkevm-t0.cronos.org");
					this.add("https://testnet.zkevm.cronos.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://zkevm-t0.cronos.org/explorer");
				}},
				new ArrayList<String>() {{
					this.add("https://zkevm-t0.cronos.org/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/282");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CRONOSZKEVMTEST, cronos_test);

		// b2hub_test
		EVMChainInfo b2hub_test = new EVMChainInfo(
				EVMChain.B2HUBTEST.toString(), 
				"B2 Hub Testnet", 
				1113L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("B2 Hub Testnet Gas Token", "B2", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-hub-rpc.bsquared.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-hub-explorer.bsquared.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1113");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.B2HUBTEST, b2hub_test);

		// edgeless_test
		EVMChainInfo edgeless_test = new EVMChainInfo(
				EVMChain.EDGELESSTEST.toString(), 
				"Edgeless Testnet", 
				202L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Edgeless Testnet Gas Token", "EwEth", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet.rpc.edgeless.network/http");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.explorer.edgeless.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/202");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.EDGELESSTEST, edgeless_test);

		// mumbai
		EVMChainInfo mumbai = new EVMChainInfo(
				EVMChain.MUMBAITEST.toString(), 
				"Polygon Test Network", 
				80001L, 
				BlockchainType.BORKED.toString(), // deprecated
				new EVMCurrency("Polygon Test Token", "MATIC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				"31000000000", // some mumbai nodes actually implement the 30 gwei min threshold as mainnet (see polygon object)
				"21000", // for pure tx
				new ArrayList<String>() {{
					//this.add("https://rpc-mumbai.maticvigil.com"); // deprecated
					this.add("https://rpc.ankr.com/polygon_mumbai");
					this.add("https://rpc-mumbai.maticvigil.com");
					this.add("https://polygon-testnet.public.blastapi.io");
					this.add("https://polygon-mumbai-bor.publicnode.com");
					this.add("https://polygon-mumbai.gateway.tenderly.co");
					this.add("https://polygon-mumbai-bor-rpc.publicnode.com");
					//this.add("https://matic-mumbai.chainstacklabs.com");
					//this.add("https://matic-testnet-archive-rpc.bwarelabs.com"); // dead
					//this.add("https://polygontestapi.terminet.io/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://mumbai.polygonscan.com");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.polygon.technology/");
					this.add("https://mumbaifaucet.com/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/80001");
				}},
				BlockchainTokenDetailsEVM.generateMumbaiTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MUMBAITEST, mumbai);

		// soraai_test
		EVMChainInfo soraai_test = new EVMChainInfo(
				EVMChain.SORAAITEST.toString(), 
				"SoraAI Testnet", 
				145L, 
				BlockchainType.BORKED.toString(), // single node unstable
				new EVMCurrency("SoraAI Testnet Gas Token", "SETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.soraai.bot");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.soraai.bot");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/145");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SORAAITEST, soraai_test);

		// zksynceratest
		EVMChainInfo zksynceratest = new EVMChainInfo(
				EVMChain.ZKSYNCERASEPOLIATEST.toString(), 
				"zkSync Sepolia Testnet", 
				300L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("zkSync Era Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"2100000", // 21k not enough for pure tx
				new ArrayList<String>() {{
					this.add("https://sepolia.era.zksync.dev");
					this.add("https://zksync-sepolia.drpc.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://sepolia.explorer.zksync.io");
				}},
				new ArrayList<String>() {{
					this.add("https://sepolia.era.zksync.dev");
					this.add("https://goerli.portal.zksync.io/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/300");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZKSYNCERASEPOLIATEST, zksynceratest);

		// ailayer_test
		EVMChainInfo ailayer_test = new EVMChainInfo(
				EVMChain.AILAYERTEST.toString(), 
				"AILayer Testnet", 
				2648L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("AILayer Testnet Gas Token", "BTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.ailayer.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-explorer.ailayer.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2648");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.AILAYERTEST, ailayer_test);

		// artela_test
		EVMChainInfo artela_test = new EVMChainInfo(
				EVMChain.ARTELATEST.toString(), 
				"Artela Testnet", 
				11822L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Artela Testnet Gas Token", "ART", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://betanet-rpc1.artela.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://betanet-scan.artela.network");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/11822");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ARTELATEST, artela_test);

		// stylussepolia_test
		EVMChainInfo stylussepolia_test = new EVMChainInfo(
				EVMChain.STYLUSSEPOLIATEST.toString(), 
				"Stylus Sepolia", 
				23011913L, 
				BlockchainType.BORKED.toString(), // single node unstable
				new EVMCurrency("Stylus Sepolia Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),
				30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"210000", // 21k+ needed for pure tx
				new ArrayList<String>() {{
					this.add("https://stylus-testnet.arbitrum.io/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://stylus-testnet-explorer.arbitrum.io");
				}},
				new ArrayList<String>() {{
					this.add("https://arbitrum.io/stylus");
				}},
				new ArrayList<String>() {{
					this.add("https://arbitrum.io/stylus");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.STYLUSSEPOLIATEST, stylussepolia_test);

		// ropsten
		EVMChainInfo ropsten = new EVMChainInfo(
				EVMChain.ROPSTENTEST.toString(), 
				"Ropsten Test Network", 
				3L, 
				BlockchainType.BORKED.toString(), // Network decommissioned, please use Goerli or Sepolia instead
				new EVMCurrency("Ropsten Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://ropsten.infura.io/v3/9aa3d95b3bc440fa88ea12eaa4456161"); 
					this.add("https://rpc.ankr.com/eth_ropsten");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://ropsten.etherscan.io");
				}},
				new ArrayList<String>() {{
					this.add("decomissioned");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/3");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ROPSTENTEST, ropsten);

		// sepolia
		EVMChainInfo sepolia = new EVMChainInfo(
				EVMChain.SEPOLIATEST.toString(), 
				"Sepolia Test Network", 
				11155111L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Sepolia Test Token", "SEP", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rpc.sepolia.org"); 
					this.add("https://rpc2.sepolia.org"); 
					this.add("https://ethereum-sepolia.blockpi.network/v1/rpc/public"); 
					this.add("https://eth-sepolia.public.blastapi.io"); 
					this.add("https://gateway.tenderly.co/public/sepolia"); 
					this.add("https://eth-sepolia.public.blastapi.io"); 
					this.add("https://endpoints.omniatech.io/v1/eth/sepolia/public"); 
					this.add("https://eth-sepolia-public.unifra.io"); 
					this.add("https://rpc.notadegen.com/sepolia");
					this.add("https://rpc-sepolia.rockx.com");
					this.add("https://rpc.sepolia.ethpandaops.io");
					this.add("https://sepolia.gateway.tenderly.co");
					this.add("https://ethereum-sepolia.publicnode.com");
					this.add("https://ethereum-sepolia-rpc.publicnode.com");
					this.add("https://sepolia.drpc.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://sepolia.etherscan.io/");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.sepolia.dev/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/11155111");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SEPOLIATEST, sepolia);

		// stability_test
		EVMChainInfo stability_test = new EVMChainInfo(
				EVMChain.STABILITYTEST.toString(), 
				"Stability Testnet", 
				20180427L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Stability Testnet Gas Token", "FREE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://free.testnet.stabilityprotocol.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://stability-testnet.blockscout.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/20180427");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.STABILITYTEST, stability_test);

		// agentlayer_test
		EVMChainInfo agentlayer_test = new EVMChainInfo(
				EVMChain.AGENTLAYERTEST.toString(), 
				"AgentLayer Testnet", 
				42072L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("AgentLayer Testnet Gas Token", "AGENT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.agentlayer.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-explorer.agentlayer.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/42072");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.AGENTLAYERTEST, agentlayer_test);

		// 0xhash_test
		EVMChainInfo hash_test = new EVMChainInfo(
				EVMChain.HASHTEST.toString(), 
				"0xHash Testnet", 
				77787778L, 
				BlockchainType.BORKED.toString(), // unstable single node
				new EVMCurrency("0xHash Testnet Gas Token", "HETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-test.0xhash.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://test.0xhashscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/77787778");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.HASHTEST, hash_test);

		// arbitrumgoerli
		EVMChainInfo arbitrumgoerli = new EVMChainInfo(
				EVMChain.ARBITRUMGOERLITEST.toString(), 
				"Arbitrum Goerli Test Network", 
				421613L, 
				BlockchainType.BORKED.toString(), // deprecated
				new EVMCurrency("Arbitrum Goerli ETH Test Token", "AGOR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"20000000", //20M units .. Arbitrum is weird
				new ArrayList<String>() {{
					this.add("https://goerli-rollup.arbitrum.io/rpc");
					this.add("https://arbitrum-goerli.public.blastapi.io");
					this.add("https://endpoints.omniatech.io/v1/arbitrum/goerli/public");
					this.add("https://arbitrum-goerli.publicnode.com");
					//this.add("https://arb-goerli.g.alchemy.com/v2/demo"); // dead
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://goerli.arbiscan.io/");
					this.add("https://goerli-rollup-explorer.arbitrum.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucetttt");
					this.add("https://bridge.arbitrum.io");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/421613");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ARBITRUMGOERLITEST, arbitrumgoerli);

		// goerli
		EVMChainInfo goerli = new EVMChainInfo(
				EVMChain.GOERLITEST.toString(), 
				"Goerli Test Network", 
				5L, 
				BlockchainType.BORKED.toString(), // decommissioned
				new EVMCurrency("Goerli ETH Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://goerli.infura.io/v3/9aa3d95b3bc440fa88ea12eaa4456161");
					this.add("https://rpc.ankr.com/eth_goerli");
					this.add("https://ethereum-goerli.publicnode.com");
					this.add("https://goerli.gateway.tenderly.co");
					this.add("https://ethereum-goerli-rpc.publicnode.com");

					//this.add("https://rpc.goerli.mudit.blog"); // lagging/dead node
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>() {{
					this.add("https://rpc-goerli.flashbots.net");
				}},
				new ArrayList<String>() {{
					this.add("https://relay-goerli.flashbots.net");
					//this.add("https://goerli-relay.securerpc.com"); // untested
				}}, 
				new ArrayList<String>() {{
					this.add("https://goerli.etherscan.io");
				}},
				new ArrayList<String>() {{
					this.add("https://goerli-faucet.mudit.blog/");
					this.add("https://faucets.chain.link/goerli");
					this.add("https://goerli-faucet.slock.it/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/5");
				}},
				BlockchainTokenDetailsEVM.generateGoerliTokenIndex(),
				BlockchainTokenDetailsEVM.generateGoerliNFTIndex());
		networks.put(EVMChain.GOERLITEST, goerli);

		// fuji
		EVMChainInfo fuji = new EVMChainInfo(
				EVMChain.FUJITEST.toString(), 
				"Avalanche Fuji Test Network", 
				43113L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("AVAX FUJI Test Token", "AVAX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://api.avax-test.network/ext/bc/C/rpc");
					this.add("https://avalanche-fuji-c-chain.publicnode.com");
					this.add("https://ava-testnet.public.blastapi.io/ext/bc/C/rpc");
					this.add("https://rpc.ankr.com/avalanche_fuji");
					this.add("https://endpoints.omniatech.io/v1/avax/fuji/public");
					this.add("https://avalanche-fuji-c-chain-rpc.publicnode.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://testnet.snowtrace.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.avax.network/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/43113");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FUJITEST, fuji);

		// rinkeby
		EVMChainInfo rinkeby = new EVMChainInfo(
				EVMChain.RINKEBYTEST.toString(), 
				"Rinkeby Test Network", 
				4L, 
				BlockchainType.BORKED.toString(), // Discontinued/readonly since 2022-10-05
				new EVMCurrency("Rinkeby Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rpc.ankr.com/eth_rinkeby");
					this.add("https://rinkeby.infura.io/v3/9aa3d95b3bc440fa88ea12eaa4456161	");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://rinkeby.etherscan.io");
				}},
				new ArrayList<String>() {{
					this.add("discontinued");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/4");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.RINKEBYTEST, rinkeby);

		// kovan, https://chainlist.org/chain/42
		EVMChainInfo kovan = new EVMChainInfo(
				EVMChain.KOVANTEST.toString(), 
				"Kovan Test Network", 
				42L, 
				BlockchainType.BORKED.toString(), // discontinued test network since September 1, 2022
				new EVMCurrency("Kovan Test Token", "KOV", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://kovan.infura.io/v3/9aa3d95b3bc440fa88ea12eaa4456161");
					this.add("https://kovan.poa.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://kovan.etherscan.io");
				}},
				new ArrayList<String>() {{
					this.add("discontinued");
				}},
				new ArrayList<String>() {{
					this.add("https://rpc.info/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.KOVANTEST, kovan);

		// maxi_test
		EVMChainInfo maxi_test = new EVMChainInfo(
				EVMChain.MAXITEST.toString(), 
				"MAXI Chain Testnet", 
				898L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("MAXI Chain Testnet Gas Token", "MAXI", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.maxi.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.maxi.network");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.maxi.network");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/898");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MAXITEST, maxi_test);

		// cronostest
		EVMChainInfo cronostest = new EVMChainInfo(
				EVMChain.CRONOSTEST.toString(), 
				"Cronos Test Network", 
				338L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("CRONOS Test Token", "TCRO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"2000000000000", // 2000 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://evm-t3.cronos.org");
					this.add("https://cronos-testnet.drpc.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://testnet.cronoscan.com/");
				}},
				new ArrayList<String>() {{
					this.add("https://cronos.org/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/338");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CRONOSTEST, cronostest);

		// gunz_test
		EVMChainInfo gunz_test = new EVMChainInfo(
				EVMChain.GUNZTEST.toString(), 
				"GUNZ Testnet", 
				49321L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("GUNZ Testnet Gas Token", "GUN", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rpc.gunz.dev/ext/bc/ryk9vkvNuKtewME2PeCgybo9sdWXGmCkBrrx4VPuZPdVdAak8/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.gunzscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/49321");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.GUNZTEST, gunz_test);

		// bobarinkeby
		EVMChainInfo bobarinkeby = new EVMChainInfo(
				EVMChain.BOBARINKEBYTEST.toString(), 
				"Boba Rinkeby Test Token", 
				28L, 
				BlockchainType.BORKED.toString(), // node no longer resolves, no replacement found
				new EVMCurrency("Boba Rinkeby Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rinkeby.boba.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://blockexplorer.rinkeby.boba.network");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/28");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BOBARINKEBYTEST, bobarinkeby);

		// bobabnb
		EVMChainInfo bobabnbtest = new EVMChainInfo(
				EVMChain.BOBABNBTEST.toString(), 
				"Boba BNB Test Token", 
				9728L, 
				BlockchainType.BORKED.toString(), // single 502 node
				new EVMCurrency("Boba BNB Test Token", "BOBA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://testnet.bnb.boba.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://blockexplorer.testnet.bnb.boba.network");
				}},
				new ArrayList<String>() {{
					this.add("https://gateway.testnet.bnb.boba.network/wallet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/9728");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BOBABNBTEST, bobabnbtest);


		// bitkub_test
		EVMChainInfo bitkub_test = new EVMChainInfo(
				EVMChain.BITKUBTEST.toString(),
				"Bitkub Test Network", 
				25925L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Bitkub Native Token", "tKUB", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.bitkubchain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://testnet.bkcscan.com");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.bitkubchain.com");
				}},
				new ArrayList<String>() {{
					this.add("https://bitkub.com");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BITKUBTEST, bitkub_test);

		// idos_test
		EVMChainInfo idos_test = new EVMChainInfo(
				EVMChain.IDOSTEST.toString(), 
				"iDos Games Chain Testnet", 
				1499L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("iDos Games Chain Testnet Gas Token", "IGC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.idos.games");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://igcscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1499");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.IDOSTEST, idos_test);

		// mint_sepolia_test
		EVMChainInfo mint_sepolia_test = new EVMChainInfo(
				EVMChain.MINTSEPOLIATEST.toString(), 
				"Mint Sepolia Testnet", 
				1687L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Mint Sepolia Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://sepolia-testnet-rpc.mintchain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sepolia-testnet-explorer.mintchain.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1687");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MINTSEPOLIATEST, mint_sepolia_test);

		// aiw3_test
		EVMChainInfo aiw3_test = new EVMChainInfo(
				EVMChain.AIW3TEST.toString(), 
				"AIW3 Testnet", 
				1956L, 
				BlockchainType.BORKED.toString(), // single node
				new EVMCurrency("AIW3 Testnet Gas Token", "BTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.aiw3.io/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan-testnet.aiw3.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1956");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.AIW3TEST, aiw3_test);

		// upb_test
		EVMChainInfo upb_test = new EVMChainInfo(
				EVMChain.UPBTEST.toString(), 
				"UPB CRESCDI Testnet", 
				1918L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("UPB CRESCDI Testnet Gas Token", "UPBEth", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet.crescdi.pub.ro");
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
					this.add("https://chainlist.org/chain/1918");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.UPBTEST, upb_test);

		// taraxatest
		EVMChainInfo taraxatest = new EVMChainInfo(
				EVMChain.TARAXATEST.toString(), 
				"Taraxa Testnet", 
				842L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Taraxa Native Token", "TARA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.taraxa.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.taraxa.io");
				}},
				new ArrayList<String>() {{
					this.add("https://testnet.explorer.taraxa.io/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/842");
					this.add("https://www.coingecko.com/sv/coins/taraxa");
					this.add("https://www.taraxa.io/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TARAXATEST, taraxatest);

		// fantomtest
		EVMChainInfo fantomtest = new EVMChainInfo(
				EVMChain.FANTOMTEST.toString(), 
				"Fantom Test Network", 
				4002L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Fantom Native Token", "FTM", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://fantom-testnet.public.blastapi.io");
					this.add("https://rpc.testnet.fantom.network");
					this.add("https://rpc.ankr.com/fantom_testnet");
					this.add("https://endpoints.omniatech.io/v1/fantom/testnet/public");
					this.add("https://fantom-testnet.publicnode.com");
					this.add("https://fantom-testnet-rpc.publicnode.com");
					this.add("https://fantom-testnet.drpc.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://testnet.ftmscan.com/");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.fantom.network/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/4002");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FANTOMTEST, fantomtest);

		// sic_test
		EVMChainInfo sic_test = new EVMChainInfo(
				EVMChain.SICTEST.toString(), 
				"SIC Testnet", 
				5102L, 
				BlockchainType.BORKED.toString(), // unstable single
				new EVMCurrency("SIC Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-sic-testnet-zvr7tlkzsi.t.conduit.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorerl2new-sic-testnet-zvr7tlkzsi.t.conduit.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/5102");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SICTEST, sic_test);

		// zklink_test
		EVMChainInfo zklink_septest = new EVMChainInfo(
				EVMChain.ZKLINKSEPOLIATEST.toString(), 
				"zkLink Nova Sepolia Testnet", 
				810181L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("zkLink Nova Sepolia Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://sepolia.rpc.zklink.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sepolia.explorer.zklink.io");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/810181");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZKLINKSEPOLIATEST, zklink_septest);

		// prm_test
		EVMChainInfo prm_test = new EVMChainInfo(
				EVMChain.PRMTEST.toString(), 
				"PRM Testnet", 
				839320L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("PRM Testnet Gas Token", "PRM", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.prmscan.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-explorer.prmscan.org");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.prmscan.org");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/839320");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PRMTEST, prm_test);

		// coordinape_test
		EVMChainInfo coordinape_test = new EVMChainInfo(
				EVMChain.COORDINAPETEST.toString(), 
				"Coordinape Testnet", 
				5103L, 
				BlockchainType.BORKED.toString(), // unstable
				new EVMCurrency("Coordinape Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-coordinape-testnet-vs9se3oc4v.t.conduit.xyz");
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
					this.add("https://chainlist.org/chain/5103");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.COORDINAPETEST, coordinape_test);

		// netmind_test
		EVMChainInfo netmind_test = new EVMChainInfo(
				EVMChain.NETMINDTEST.toString(), 
				"Netmind Chain Testnet", 
				1100789L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Netmind Chain Testnet Gas Token", "NMT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testblock.protago-dev.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testbrower.protago-dev.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1100789");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.NETMINDTEST, netmind_test);


		// playfi_test
		EVMChainInfo playfi_test = new EVMChainInfo(
				EVMChain.PLAYFITEST.toString(), 
				"PlayFi Albireo Testnet", 
				1612127L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("PlayFi Albireo Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://albireo-rpc.playfi.ai");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://albireo-explorer.playfi.ai");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1612127");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PLAYFITEST, playfi_test);

		// funki_test
		EVMChainInfo funki_test = new EVMChainInfo(
				EVMChain.FUNKITEST.toString(), 
				"Funki Sepolia Sandbox", 
				3397901L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Funki Sepolia Sandbox Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://funki-testnet.alt.technology");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sepolia-sandbox.funkichain.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/3397901");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.FUNKITEST, funki_test);

		// moonchain_test
		EVMChainInfo moonchain_test = new EVMChainInfo(
				EVMChain.MOONCHAINTEST.toString(), 
				"Moonchain Geneva Testnet", 
				5167004L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Moonchain Geneva Testnet Gas Token", "MXC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://geneva-rpc.moonchain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://geneva-explorer.moonchain.com");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/5167004");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.MOONCHAINTEST, moonchain_test);

		// charmverse_test
		EVMChainInfo charmverse_test = new EVMChainInfo(
				EVMChain.CHARMVERSETEST.toString(), 
				"Charmverse Testnet", 
				5104L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Charmverse Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-charmverse-testnet-g6blnaebes.t.conduit.xyz");
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
					this.add("https://chainlist.org/chain/5104");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.CHARMVERSETEST, charmverse_test);

		// superloyalty_test
		EVMChainInfo superloyalty_test = new EVMChainInfo(
				EVMChain.SUPERLOYALTYTEST.toString(), 
				"Superloyalty Testnet", 
				5105L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Superloyalty Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-superloyalty-testnet-1m5gwjbsv1.t.conduit.xyz");
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
					this.add("https://chainlist.org/chain/5105");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SUPERLOYALTYTEST, superloyalty_test);

		// evolve_test
		EVMChainInfo evolve_test = new EVMChainInfo(
				EVMChain.EVOLVETEST.toString(), 
				"EVOLVE Testnet", 
				14324L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("EVOLVE Testnet Gas Token", "EVO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.evolveblockchain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.evolveblockchain.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.evolveblockchain.io");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/14324");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.EVOLVETEST, evolve_test);

		// bsctest
		EVMChainInfo bsctest = new EVMChainInfo(
				EVMChain.BSCTEST.toString(), 
				"Binance Smart Chain Testnet", 
				97L, 
				BlockchainType.BORKED.toString(), // execution reverted for simple interaction?
				new EVMCurrency("Binance Chain Test Native Token", "tBNB", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://data-seed-prebsc-1-s1.binance.org:8545");
					this.add("https://data-seed-prebsc-1-s2.binance.org:8545");
					this.add("https://data-seed-prebsc-1-s3.binance.org:8545");
					this.add("https://data-seed-prebsc-2-s2.binance.org:8545");
					this.add("https://bsc-testnet.public.blastapi.io");
					this.add("https://bsc-testnet.publicnode.com");
					this.add("https://bsc-testnet.blockpi.network/v1/rpc/public");
					this.add("https://data-seed-prebsc-1-s1.bnbchain.org:8545");
					this.add("https://data-seed-prebsc-2-s1.bnbchain.org:8545");
					this.add("https://data-seed-prebsc-1-s2.bnbchain.org:8545");
					this.add("https://data-seed-prebsc-2-s2.bnbchain.org:8545");
					this.add("https://data-seed-prebsc-1-s3.bnbchain.org:8545");
					this.add("https://data-seed-prebsc-2-s3.bnbchain.org:8545");
					this.add("https://bsc-testnet-rpc.publicnode.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://testnet.bscscan.com");
				}},
				new ArrayList<String>() {{
					this.add("https://testnet.binance.org/faucet-smart");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/97");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BSCTEST, bsctest);


		// metisgoerli_test
		EVMChainInfo metisgoerli_test = new EVMChainInfo(
				EVMChain.METISGOERLITEST.toString(), 
				"Metis Goerli Testnet", 
				599L, 
				BlockchainType.BORKED.toString(), // no more?
				new EVMCurrency("Metis Goerli Test Token", "METIS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://goerli.gateway.metisdevops.link");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://goerli.explorer.metisdevops.link");
				}},
				new ArrayList<String>() {{
					this.add("https://goerli.faucet.metisdevops.link/");
					this.add("bridge assets from goerli https://bridge.metis.io/home");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/599");
				}},
				BlockchainTokenDetailsEVM.generateMetisTestTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.METISGOERLITEST, metisgoerli_test);


		// tabi_test
		EVMChainInfo tabi_test = new EVMChainInfo(
				EVMChain.TABITEST.toString(), 
				"Tabi Testnet", 
				9789L, 
				BlockchainType.BORKED.toString(), // unstable single node
				new EVMCurrency("Tabi Testnet Gas Token", "TABI", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.tabichain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.tabiscan.com");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.testnet.tabichain.com");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/9789");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.TABITEST, tabi_test);

		// worldland_test
		EVMChainInfo worldland_test = new EVMChainInfo(
				EVMChain.WORLDLANDTEST.toString(), 
				"WorldLand Testnet", 
				10395L, 
				BlockchainType.BORKED.toString(), // unstable
				new EVMCurrency("WorldLand Testnet Gas Token", "WLC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://gwangju.worldland.foundation");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testscan.worldland.foundation");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/10395");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.WORLDLANDTEST, worldland_test);

		// playdapp_test
		EVMChainInfo playdapp_test = new EVMChainInfo(
				EVMChain.PLAYDAPPTEST.toString(), 
				"Playdapp Testnet", 
				12781L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Playdapp Testnet Gas Token", "PDA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/playdappte/testnet/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://subnets-test.avax.network/playdappte");
				}},
				new ArrayList<String>() {{
					this.add("<TODO>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/12781");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.PLAYDAPPTEST, playdapp_test);

		// nexablock_test
		EVMChainInfo nexablock_test = new EVMChainInfo(
				EVMChain.NEXABLOCKTEST.toString(), 
				"Nexa Block Testnet", 
				9024L,
				BlockchainType.BORKED.toString(), // unstable
				new EVMCurrency("Nexa Block Token", "NEXB", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://rpc-testnet-nodes.nexablockscan.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://nexablockscan.io/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://testnet.nexablockscan.io/");
				}},
				new ArrayList<String>() {{
					this.add("https://nexa.org/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.NEXABLOCKTEST, nexablock_test);


		// berachainbartio_test
		EVMChainInfo berachainbartio_test = new EVMChainInfo(
				EVMChain.BERACHAINBARTIOTEST.toString(), 
				"Berachain bArtio", 
				80084L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Berachain bArtio Gas Token", "BERA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://bartio.rpc.berachain.com");
					this.add("https://bera-testnet.nodeinfra.com");
					this.add("https://bartio.rpc.b-harvest.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://bartio.beratrail.io");
				}},
				new ArrayList<String>() {{
					this.add("https://bartio.faucet.berachain.com");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/80084");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BERACHAINBARTIOTEST, berachainbartio_test);

		// zero_test
		EVMChainInfo zero_test = new EVMChainInfo(
				EVMChain.ZEROTEST.toString(), 
				"Zero Test network", 
				4457845L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Zero Test network Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"1000000", //1M units
				new ArrayList<String>() {{
					this.add("https://rpc.zerion.io/v1/zero-sepolia");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.zero.network");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge.zero.network/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/4457845");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.ZEROTEST, zero_test);

		// berachainartio_test
		EVMChainInfo berachainartio_test = new EVMChainInfo(
				EVMChain.BERACHAINARTIOTEST.toString(), 
				"Berachain Artio", 
				80085L, 
				BlockchainType.BORKED.toString(), // early
				new EVMCurrency("Berachain Arti Test Token", "BERA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://artio.rpc.berachain.com");
					this.add("https://rpc.ankr.com/berachain_testnet");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://artio.faucet.berachain.com");
				}},
				new ArrayList<String>() {{
					this.add("https://artio.beratrail.io");
				}},
				new ArrayList<String>() {{
					this.add("https://berachain.com");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.BERACHAINARTIOTEST, berachainartio_test);	

		// vechain_test
		EVMChainInfo vechain_test = new EVMChainInfo(
				EVMChain.VECHAINTEST.toString(), 
				"VeChain Testnet", 
				100010L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("VeChain Testnet Gas Token", "VET", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.vechain.energy");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explore-testnet.vechain.org");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.vecha.in");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/100010");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.VECHAINTEST, vechain_test);
		
		// metissepolia_test
		EVMChainInfo metissepolia_test = new EVMChainInfo(
				EVMChain.METISSEPOLIATEST.toString(), 
				"Metis Sepolia Testnet", 
				59901L, 
				BlockchainType.BORKED.toString(), // single node shaky at best
				new EVMCurrency("Metis Sepolia Test Token", "METIS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://sepolia.rpc.metisdevops.link");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://sepolia.explorer.metisdevops.link");
				}},
				new ArrayList<String>() {{
					this.add("https://sepolia.faucet.metisdevops.link/");
					this.add("bridge assets from goerli https://bridge.metis.io/home");
				}},
				new ArrayList<String>() {{
					this.add("https://decentralize.metis.io/");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.METISSEPOLIATEST, metissepolia_test);	

		// metis_test
		EVMChainInfo metis_test2 = new EVMChainInfo(
				EVMChain.METISSEPOLIA2TEST.toString(), 
				"Metis Sepolia Testnet", 
				59902L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Metis Sepolia Testnet Gas Token", "tMETIS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://sepolia.metisdevops.link");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sepolia-explorer.metisdevops.link");
				}},
				new ArrayList<String>() {{
					this.add("https://sepolia.faucet.metisdevops.link");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/59902");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.METISSEPOLIA2TEST, metis_test2);
		
		// viction_test
		EVMChainInfo viction_test = new EVMChainInfo(
				EVMChain.VICTIONTEST.toString(), 
				"Viction Testnet", 
				89L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Viction Testnet Gas Token", "VIC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.viction.xyz");
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
					this.add("https://chainlist.org/chain/89");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.VICTIONTEST, viction_test);

		// metisstardust_test
		EVMChainInfo metisstardust_test = new EVMChainInfo(
				EVMChain.METISSTARDUSTTEST.toString(), 
				"Metis Stardust Testnet", 
				588L, 
				BlockchainType.BORKED.toString(), // single node unstable
				new EVMCurrency("Metis Test Token", "METIS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://stardust.metis.io/?owner=588");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://sepolia.explorer.metisdevops.link");
				}},
				new ArrayList<String>() {{
					this.add("https://sepolia.faucet.metisdevops.link/");
					this.add("bridge assets from goerli https://bridge.metis.io/home");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/588");
				}},
				BlockchainTokenDetailsEVM.generateMetisTestTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.METISSTARDUSTTEST, metisstardust_test);		

		// aurora_test
		EVMChainInfo aurora_test = new EVMChainInfo(
				EVMChain.AURORATEST.toString(), 
				"Aurora Testnet", 
				1313161555L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Aurora Token", "AETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://endpoints.omniatech.io/v1/aurora/testnet/public");
					this.add("https://1rpc.io/aurora");
					this.add("https://testnet.aurora.dev/");
					this.add("https://aurora-testnet.drpc.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.aurora.dev/");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1313161555");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.AURORATEST, aurora_test);

		// ganache
		EVMChainInfo ganache8545_1337 = new EVMChainInfo(
				EVMChain.GANACHE8545_1337.toString(), 
				"Ganache Test Chain, default local port 8545 and chainid 1337", 
				1337L, 
				BlockchainType.LOCAL.toString(),
				new EVMCurrency("Development Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("http://127.0.0.1:8545");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://blockexplorer.x");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://gsthina.medium.com/the-default-chain-id-for-ganache-metamask-is-1337-can-you-try-to-override-it-de5ad1bcb3ab");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.GANACHE8545_1337, ganache8545_1337);

		// ganache
		EVMChainInfo ganache7545 = new EVMChainInfo(
				EVMChain.GANACHE7545_1337.toString(), 
				"Ganache Test Chain, default local port 7545 and chainid 1337", 
				1337L, 
				BlockchainType.LOCAL.toString(),
				new EVMCurrency("Development Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("http://127.0.0.1:7545");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://blockexplorer.x");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://gsthina.medium.com/the-default-chain-id-for-ganache-metamask-is-1337-can-you-try-to-override-it-de5ad1bcb3ab");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.GANACHE7545_1337, ganache7545);

		// ganache
		EVMChainInfo ganache8545_5777 = new EVMChainInfo(
				EVMChain.GANACHE8545_5777.toString(), 
				"Ganache Test Chain, default local port 8545 and chainid 5777", 
				5777L, 
				BlockchainType.LOCAL.toString(),
				new EVMCurrency("Development Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("http://127.0.0.1:8545");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://blockexplorer.x");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://gsthina.medium.com/the-default-chain-id-for-ganache-metamask-is-1337-can-you-try-to-override-it-de5ad1bcb3ab");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.GANACHE8545_5777, ganache8545_5777);

		// ganache
		EVMChainInfo ganache7545_5777 = new EVMChainInfo(
				EVMChain.GANACHE7545_5777.toString(), 
				"Ganache Test Chain, default local port 7545 and chainid 5777", 
				5777L, 
				BlockchainType.LOCAL.toString(),
				new EVMCurrency("Development Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("http://127.0.0.1:7545");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://blockexplorer.x");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://gsthina.medium.com/the-default-chain-id-for-ganache-metamask-is-1337-can-you-try-to-override-it-de5ad1bcb3ab");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.GANACHE7545_5777, ganache7545_5777);

		// hardhat
		EVMChainInfo hardhat443_31337 = new EVMChainInfo(
				EVMChain.HARDHAT443_31337.toString(), 
				"Hardhat Test Chain, default local https port 443 and chainid 31337", 
				31337L, 
				BlockchainType.LOCAL.toString(),
				new EVMCurrency("Development Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://localhost");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://blockexplorer.x");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://hardhat.org/hardhat-network/docs/reference");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.HARDHAT443_31337, hardhat443_31337);

		// hardhat
		EVMChainInfo hardhat8545_31337 = new EVMChainInfo(
				EVMChain.HARDHAT8545_31337.toString(), 
				"Hardhat Test Chain, default local port 8545 and chainid 31337", 
				31337L, 
				BlockchainType.LOCAL.toString(),
				new EVMCurrency("Development Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("http://127.0.0.1:8545");
					this.add("http://127.0.0.1:8545/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://blockexplorer.x");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://hardhat.org/hardhat-network/docs/reference");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.HARDHAT8545_31337, hardhat8545_31337);

		// vitruveo_test
		EVMChainInfo vitruveo_test = new EVMChainInfo(
				EVMChain.VITRUVEOTEST.toString(), 
				"Vitruveo Testnet", 
				14333L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Vitruveo Testnet Gas Token", "tVTRU", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://test-rpc.vitruveo.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://test-explorer.vitruveo.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.vitruveo.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/14333");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.VITRUVEOTEST, vitruveo_test);

		// shido_test
		EVMChainInfo shido_test = new EVMChainInfo(
				EVMChain.SHIDOTEST.toString(), 
				"Shido Testnet Block", 
				9007L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Shido Testnet Block Gas Token", "SHIDO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet-nodes.shidoscan.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.shidoscan.com");
				}},
				new ArrayList<String>() {{
					this.add("https://testnet.shidoscan.com/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/9007");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SHIDOTEST, shido_test);

		// shardeum15
		EVMChainInfo shardeum15 = new EVMChainInfo(
				EVMChain.SHARDEUMLIBERTY1xTEST.toString(), 
				"Shardeum Liberty 1.5", 
				8080L, 
				BlockchainType.BORKED.toString(), // very unstable atm, inconsistent results
				new EVMCurrency("Shardeum Native Token", "SHM", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://liberty10.shardeum.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://explorer.liberty10.shardeum.org");
				}},
				new ArrayList<String>() {{
					this.add("https://docs.shardeum.org/faucet/claim");
				}},
				new ArrayList<String>() {{
					this.add("https://docs.shardeum.org/wallets/MetaMask/add-shardeum-network");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SHARDEUMLIBERTY1xTEST, shardeum15);

		// shardeum20
		EVMChainInfo shardeum20 = new EVMChainInfo(
				EVMChain.SHARDEUMLIBERTY2xTEST.toString(), 
				"Shardeum Liberty 2.0", 
				8081L, 
				BlockchainType.BORKED.toString(), // very unstable atm
				new EVMCurrency("Shardeum Native Token", "SHM", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://liberty20.shardeum.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://explorer.liberty20.shardeum.org");
				}},
				new ArrayList<String>() {{
					this.add("https://docs.shardeum.org/faucet/claim");
				}},
				new ArrayList<String>() {{
					this.add("https://docs.shardeum.org/wallets/MetaMask/add-shardeum-network");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SHARDEUMLIBERTY2xTEST, shardeum20);

		// shardeum20
		EVMChainInfo shardeumsphinx10 = new EVMChainInfo(
				EVMChain.SHARDEUMSPHINX1xTEST.toString(), 
				"Shardeum Sphinx 1.x", 
				8082L, 
				BlockchainType.BORKED.toString(), // very unstable atm
				new EVMCurrency("Shardeum Native Token", "SHM", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", // pure tx
				new ArrayList<String>() {{
					this.add("https://sphinx.shardeum.org/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://explorer-sphinx.shardeum.org");
				}},
				new ArrayList<String>() {{
					this.add("https://docs.shardeum.org/faucet/claim");
				}},
				new ArrayList<String>() {{
					this.add("https://docs.shardeum.org/wallets/MetaMask/add-shardeum-network");
				}},
				BlockchainTokenDetailsEVM.generateDummyTokenIndex(),
				BlockchainTokenDetailsEVM.generateDummyNFTIndex());
		networks.put(EVMChain.SHARDEUMSPHINX1xTEST, shardeumsphinx10);

		return networks;

	}

}
