package crypto.forestfish.objects.embedded.avm;

import java.util.ArrayList;
import java.util.HashMap;

import crypto.forestfish.enums.BlockchainType;
import crypto.forestfish.enums.TokenCategory;
import crypto.forestfish.enums.avm.AVMChain;
import crypto.forestfish.enums.avm.AVMNFTStandard;
import crypto.forestfish.enums.avm.AVMNFTState;
import crypto.forestfish.enums.avm.AVMNFTType;
import crypto.forestfish.enums.avm.MainnetARC69;
import crypto.forestfish.enums.avm.MainnetASA;
import crypto.forestfish.enums.avm.TestnetASA;
import crypto.forestfish.objects.avm.AlgoRelayNode;
import crypto.forestfish.objects.avm.AlgoIndexerNode;
import crypto.forestfish.objects.avm.model.asa.ASAIndex;
import crypto.forestfish.objects.avm.model.asa.AVMASAInfo;
import crypto.forestfish.objects.avm.model.chain.AVMChainIndex;
import crypto.forestfish.objects.avm.model.chain.AVMChainInfo;
import crypto.forestfish.objects.avm.model.chain.AVMCurrency;
import crypto.forestfish.objects.avm.model.nft.ARC3Info;
import crypto.forestfish.objects.avm.model.nft.ARC69Info;
import crypto.forestfish.objects.avm.model.nft.AVMNFTIndex;
import crypto.forestfish.utils.JSONUtils;

public class BlockchainDetailsAVM {

	public static AVMNFTIndex generateDummyNFTIndex() {
		HashMap<String, ARC3Info> arc3s = new HashMap<>();
		HashMap<String, ARC69Info> arc69s = new HashMap<>();
		return new AVMNFTIndex(arc3s, arc69s);
	}

	public static ASAIndex generateDummyASAIndex() {
		HashMap<String, AVMASAInfo> tokens = new HashMap<>();
		return new ASAIndex(tokens);
	}

	@SuppressWarnings("serial")
	public static AVMChainIndex generateAVMChainIndex() {

		HashMap<AVMChain, AVMChainInfo> networks = new HashMap<>();

		// mainnet
		AVMChainInfo mainnet = new AVMChainInfo(
				AVMChain.MAINNET.toString(), 
				"Algorand Mainnet", 
				BlockchainType.PUBLIC.toString(),
				"mainnet-v1.0",
				"wGHE2Pwdvd7S12BL5FaOP20EGYesN73ktiC1qzkkit8=",
				new AVMCurrency("ALGO", "ALGO", 6), 
				new ArrayList<AlgoRelayNode>() {{
					this.add(new AlgoRelayNode("https://mainnet-api.algonode.network", 443, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "X-API-Key"));
					this.add(new AlgoRelayNode("https://mainnet-api.algonode.cloud", 443, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "X-API-Key"));
					this.add(new AlgoRelayNode("https://xna-mainnet-api.algonode.cloud", 443, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "X-API-Key"));
					this.add(new AlgoRelayNode("https:/mainnet-api.4160.nodely.dev", 443, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "X-API-Key"));
				}}, 
				new ArrayList<AlgoIndexerNode>() {{
					this.add(new AlgoIndexerNode("https://mainnet-idx.algonode.network", 443, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "X-API-Key"));
					this.add(new AlgoIndexerNode("https://mainnet-idx.algonode.cloud", 443, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "X-API-Key"));
					this.add(new AlgoIndexerNode("https:/mainnet-idx.4160.nodely.dev", 443, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "X-API-Key"));
				}}, 
				new ArrayList<String>() {{
					// TODO
				}},
				new ArrayList<String>() {{
					this.add("no faucet available");
				}},
				new ArrayList<String>() {{
					this.add("https://www.algorand.com");
				}},
				generateMainnetASAIndex(),
				generateMainnetNFTIndex());
		networks.put(AVMChain.MAINNET, mainnet);

		// testnet
		AVMChainInfo testnet = new AVMChainInfo(
				AVMChain.TESTNET.toString(), 
				"Algorand Testnet", 
				BlockchainType.PUBLIC.toString(),
				"testnet-v1.0",
				"SGO1GKSzyE7IEPItTxCByw9x8FmnrCDexi9/cOUJOiI=",
				new AVMCurrency("ALGO", "ALGO", 6), 
				new ArrayList<AlgoRelayNode>() {{
					this.add(new AlgoRelayNode("https://testnet-api.algonode.cloud", 443, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "X-API-Key"));
					this.add(new AlgoRelayNode("https://testnet-api.4160.nodely.dev", 443, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "X-API-Key"));
				}}, 
				new ArrayList<AlgoIndexerNode>() {{
					this.add(new AlgoIndexerNode("https://testnet-idx.algonode.cloud", 443, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "X-API-Key"));
					this.add(new AlgoIndexerNode("https://testnet-idx.4160.nodely.dev", 443, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "X-API-Key"));
				}}, 
				new ArrayList<String>() {{
					// TODO
				}},
				new ArrayList<String>() {{
					this.add("https://dispenser.testnet.aws.algodev.network");
					this.add("https://testnet.algoexplorer.io/dispenser");
				}},
				new ArrayList<String>() {{
					this.add("https://www.algorand.com");
				}},
				generateTestnetASAIndex(),
				generateDummyNFTIndex());
		networks.put(AVMChain.TESTNET, testnet);
		
		// betanet
		AVMChainInfo betanet = new AVMChainInfo(
				AVMChain.BETANET.toString(), 
				"Algorand Betanet", 
				BlockchainType.PUBLIC.toString(),
				"betanet-v1.0",
				"mFgazF+2uRS1tMiL9dsj01hJGySEmPN28B/TjjvpVW0=",
				new AVMCurrency("ALGO", "ALGO", 6), 
				new ArrayList<AlgoRelayNode>() {{
					this.add(new AlgoRelayNode("https://betanet-api.algonode.cloud", 443, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "X-API-Key"));
					this.add(new AlgoRelayNode("https://betanet-api.4160.nodely.dev", 443, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "X-API-Key"));
				}}, 
				new ArrayList<AlgoIndexerNode>() {{
					this.add(new AlgoIndexerNode("https://betanet-idx.algonode.cloud", 443, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "X-API-Key"));
					this.add(new AlgoIndexerNode("https://betanet-api.4160.nodely.dev", 443, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "X-API-Key"));
				}}, 
				new ArrayList<String>() {{
					// TODO
				}},
				new ArrayList<String>() {{
					this.add("https://betanet.algoexplorer.io/dispenser");
					this.add("https://bank.betanet.algodev.network/");
				}},
				new ArrayList<String>() {{
					this.add("https://www.algorand.com");
				}},
				generateDummyASAIndex(),
				generateDummyNFTIndex());
		networks.put(AVMChain.BETANET, betanet);

		// localtestnet
		AVMChainInfo localtestnet = new AVMChainInfo(
				AVMChain.TESTNET_SANDBOX4001.toString(), 
				"Algorand Testnet", 
				BlockchainType.LOCAL.toString(),
				"testnet-v1.0",
				"SGO1GKSzyE7IEPItTxCByw9x8FmnrCDexi9/cOUJOiI=",
				new AVMCurrency("ALGO", "ALGO", 6), 
				new ArrayList<AlgoRelayNode>() {{
					this.add(new AlgoRelayNode("http://localhost", 4001, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "X-Algo-API-Token"));
				}}, 
				new ArrayList<AlgoIndexerNode>() {{
					//this.add(new AlgoIndexerNode("http://..", 4.., "<api-key>", "X-Algo-API-Token"));
				}}, 
				new ArrayList<String>() {{
					// TODO
				}},
				new ArrayList<String>() {{
					this.add("https://dispenser.testnet.aws.algodev.network");
					this.add("https://testnet.algoexplorer.io/dispenser");
					this.add("https://bank.testnet.algorand.network");
				}},
				new ArrayList<String>() {{
					this.add("https://www.algorand.com");
				}},
				generateTestnetASAIndex(),
				generateDummyNFTIndex());
		networks.put(AVMChain.TESTNET_SANDBOX4001, localtestnet);

		// voi_testnet // legacy incentivized testnet? DNS failure for only public node from 2025-11-24 
		AVMChainInfo voi_testnet = new AVMChainInfo(
				AVMChain.VOI_TESTNET.toString(), 
				"Voi Testnet", 
				BlockchainType.PUBLIC.toString(),
				"voitest-v1",
				"IXnoWtviVVJW5LGivNFc0Dq14V3kqaXuK2u5OQrdVZo=",
				new AVMCurrency("VOI", "VOI", 6), 
				new ArrayList<AlgoRelayNode>() {{
					//this.add(new AlgoRelayNode("https://testnet-api.voi.nodely.dev", 443, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "X-Algo-API-Token"));
				}}, 
				new ArrayList<AlgoIndexerNode>() {{
					//this.add(new AlgoIndexerNode("https://testnet-idx.voi.nodely.dev", 443, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "X-Algo-API-Token"));
				}}, 
				new ArrayList<String>() {{
					this.add("https://voitest-explorer.k1-fi.a-wallet.net/dashboard/home");
					this.add("https://app.dappflow.org/explorer/home");
				}},
				new ArrayList<String>() {{
					this.add("Google form https://forms.gle/Trhib6toVZb6uf2HA");
				}},
				new ArrayList<String>() {{
					this.add("https://voi.network");
				}},
				generateDummyASAIndex(),
				generateDummyNFTIndex());
		networks.put(AVMChain.VOI_TESTNET, voi_testnet);
		
		// voi_mainnet
		AVMChainInfo voi_mainnet = new AVMChainInfo(
				AVMChain.VOI_MAINNET.toString(), 
				"Voi Mainet", 
				BlockchainType.PUBLIC.toString(),
				"voimain-v1",
				"r20fSQI8gWe/kFZziNonSPCXLwcQmH/nxROvnnueWOk=",
				new AVMCurrency("VOI", "VOI", 6), 
				new ArrayList<AlgoRelayNode>() {{
					this.add(new AlgoRelayNode("https://mainnet-api.voi.nodely.dev", 443, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "X-Algo-API-Token"));
				}}, 
				new ArrayList<AlgoIndexerNode>() {{
					this.add(new AlgoIndexerNode("https://testnet-idx.voi.nodely.dev", 443, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "X-Algo-API-Token"));
				}}, 
				new ArrayList<String>() {{
					this.add("https://avmexplorer.com/");
				}},
				new ArrayList<String>() {{
					this.add("Google form https://forms.gle/Trhib6toVZb6uf2HA");
				}},
				new ArrayList<String>() {{
					this.add("https://voi.network");
				}},
				generateDummyASAIndex(),
				generateDummyNFTIndex());
		networks.put(AVMChain.VOI_MAINNET, voi_mainnet);
		
		return new AVMChainIndex(networks);

	}

	public static String generateAVMChainIndexJSON() {
		AVMChainIndex idx = generateAVMChainIndex();
		return JSONUtils.createJSONFromPOJO(idx);
	}

	@SuppressWarnings("serial")
	public static ASAIndex generateMainnetASAIndex() {
		HashMap<String, AVMASAInfo> tokens = new HashMap<>();

		// usdc
		AVMASAInfo usdc = new AVMASAInfo(
				MainnetASA.USDC.toString(), 
				31566704L,
				"USDC stablecoin token", 
				6,
				TokenCategory.STABLECOIN.toString(),
				AVMChain.MAINNET.toString(),
				new ArrayList<String>() {{
					this.add("https://algoexplorer.io/asset/31566704");
					this.add("https://www.coingecko.com/en/coins/usd-coin");
				}});
		tokens.put("31566704", usdc);
		
		// coop
		AVMASAInfo coop = new AVMASAInfo(
				MainnetASA.COOP.toString(), 
				796425061L,
				"COOP coin", 
				6,
				TokenCategory.MEME.toString(),
				AVMChain.MAINNET.toString(),
				new ArrayList<String>() {{
					this.add("https://algoexplorer.io/asset/796425061");
				}});
		tokens.put("796425061", coop);
		
		// opul
		AVMASAInfo opul = new AVMASAInfo(
				MainnetASA.OPUL.toString(), 
				287867876L,
				"Opulous token", 
				10,
				TokenCategory.MFT.toString(),
				AVMChain.MAINNET.toString(),
				new ArrayList<String>() {{
					this.add("https://algoexplorer.io/asset/287867876");
					this.add("https://opulous.org/");
				}});
		tokens.put("287867876", opul);

		return new ASAIndex(tokens);
	}

	public static String generateNFTIndexJSON(AVMNFTIndex idx) {
		return JSONUtils.createJSONFromPOJO(idx);
	}

	@SuppressWarnings("serial")
	public static ASAIndex generateTestnetASAIndex() {
		HashMap<String, AVMASAInfo> tokens = new HashMap<>();

		// usdc
		AVMASAInfo usdc = new AVMASAInfo(
				TestnetASA.USDC.toString(), 
				10458941L,
				"USDC stablecoin token", 
				6,
				TokenCategory.STABLECOIN.toString(),
				AVMChain.TESTNET_SANDBOX4001.toString(),
				new ArrayList<String>() {{
					this.add("https://testnet.algoexplorer.io/asset/10458941");
					this.add("https://www.coingecko.com/en/coins/usd-coin");
					this.add("https://dispenser.testnet.aws.algodev.network");
				}});
		tokens.put("10458941", usdc);

		return new ASAIndex(tokens);
	}

	@SuppressWarnings("serial")
	public static AVMNFTIndex generateMainnetNFTIndex() {
		HashMap<String, ARC3Info> arc3s = new HashMap<>();
		HashMap<String, ARC69Info> arc69s = new HashMap<>();

		// IMMUTABLE = nofreeze, noclawback
		
		// Alchemon ZIP
		ARC69Info alchemon_zip = new ARC69Info(
				MainnetARC69.ALCH0046.toString(), 
				"OJGTHEJ2O5NXN7FVXDZZEEJTUEQHHCIYIE5MWY6BEFVVLZ2KANJODBOKGA",
				AVMNFTStandard.ARC69,
				AVMNFTType.FRACTIONAL,
				AVMNFTState.MUTABLE,
				"Alchemon NFT Zip (ALCH0046)", 
				TokenCategory.GAMING.toString(),
				AVMChain.MAINNET.toString(),
				new ArrayList<String>() {{
					this.add("https://algoexplorer.io/address/OJGTHEJ2O5NXN7FVXDZZEEJTUEQHHCIYIE5MWY6BEFVVLZ2KANJODBOKGA");
				}});
		arc69s.put(MainnetARC69.ALCH0046.toString(), alchemon_zip);

		return new AVMNFTIndex(arc3s, arc69s);
	}

	public static String generateASAIndexJSON(ASAIndex idx) {
		return JSONUtils.createJSONFromPOJO(idx);
	}

}
