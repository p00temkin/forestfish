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
