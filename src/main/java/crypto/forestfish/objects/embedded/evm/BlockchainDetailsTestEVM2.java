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
				BlockchainType.PUBLIC.toString(),
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
				BlockchainType.PUBLIC.toString(),
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
				BlockchainType.PUBLIC.toString(),
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
				BlockchainType.PUBLIC.toString(),
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
				BlockchainType.PUBLIC.toString(),
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
				BlockchainType.PUBLIC.toString(),
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
				BlockchainType.PUBLIC.toString(),
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
				BlockchainType.PUBLIC.toString(),
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
				BlockchainType.PUBLIC.toString(),
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
				BlockchainType.PUBLIC.toString(),
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
				763374L, 
				BlockchainType.PUBLIC.toString(),
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
		networks.put(EVMChain.SURGETEST, surge_test);
		
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
		
		// kub_test
		EVMChainInfo kub_test = new EVMChainInfo(
				EVMChain.KUBTEST.toString(), 
				"KUB Testnet", 
				25925L, 
				BlockchainType.PUBLIC.toString(),
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
				BlockchainType.PUBLIC.toString(),
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
