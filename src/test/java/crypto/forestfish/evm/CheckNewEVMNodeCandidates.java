package crypto.forestfish.evm;

import java.util.HashMap;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

import crypto.forestfish.enums.evm.EVMChain;
import crypto.forestfish.objects.evm.model.chain.EVMChainInfo;
import crypto.forestfish.objects.evm.model.chainext.ExtEVMChainEntry;
import crypto.forestfish.utils.EVMUtils;
import crypto.forestfish.utils.HttpRequestUtils;
import crypto.forestfish.utils.JSONUtils;
import crypto.forestfish.utils.SystemUtils;

public class CheckNewEVMNodeCandidates {

	private static final Logger LOGGER = LoggerFactory.getLogger(CheckNewEVMNodeCandidates.class);

	@SuppressWarnings("serial")
	@Test
	public void check() {

		boolean debug = false;

		HashMap<String, EVMChain> chain_map = new HashMap<String, EVMChain>() {{
			this.put("Ethereum Mainnet", EVMChain.ETH);
			this.put("Goerli", EVMChain.GOERLITEST);
			this.put("Ubiq", EVMChain.UBIQ);
			this.put("OP Mainnet", EVMChain.OPTIMISM);
			this.put("Metadium Mainnet", EVMChain.METADIUM);
			this.put("Metadium Testnet", EVMChain.METADIUMTEST);
			this.put("Cronos Mainnet", EVMChain.CRONOS);
			this.put("KardiaChain Mainnet", EVMChain.KARDIACHAIN);
			this.put("Boba Network Rinkeby Testnet", EVMChain.BOBARINKEBYTEST);
			this.put("LUKSO Mainnet", EVMChain.LUKSO);
			this.put("BNB Smart Chain Mainnet", EVMChain.BSC);
			this.put("Syscoin Mainnet", EVMChain.SYSCOIN);
			this.put("Ethereum Classic Mainnet", EVMChain.ETC);
			this.put("Ethereum Classic Testnet Mordor", EVMChain.ETCMORDORTEST);
			this.put("TomoChain", EVMChain.TOMOCHAIN);
			this.put("TomoChain Testnet", EVMChain.TOMOCHAINTEST);
			this.put("Gnosis", EVMChain.GNOSIS);
			this.put("Shibarium", EVMChain.SHIBARIUM);
			this.put("OKExChain Testnet", EVMChain.OKXTEST);
			this.put("OKXChain Mainnet", EVMChain.OKX);
			this.put("Conflux eSpace (Testnet)", EVMChain.CONFLUXTEST);
			this.put("Conflux eSpace", EVMChain.CONFLUX);
			this.put("Bitkub Chain", EVMChain.BITKUB);
			this.put("BNB Smart Chain Testnet", EVMChain.BSCTEST);
			this.put("Aurora Mainnet", EVMChain.AURORA);
			this.put("Aurora Testnet", EVMChain.AURORATEST);
			this.put("Sepolia", EVMChain.SEPOLIATEST);
			this.put("Etho Protocol", EVMChain.ETHO);
			this.put("zKatana", EVMChain.ZKATANATEST);
			this.put("Scroll", EVMChain.SCROLL);
			this.put("Scroll Sepolia Testnet", EVMChain.SCROLLSEPOLIATEST);
			this.put("Scroll Alpha Testnet", EVMChain.SCROLLALPHATEST);
			this.put("Arbitrum Goerli", EVMChain.ARBITRUMGOERLITEST);
			this.put("Japan Open Chain Mainnet", EVMChain.JOC);
			this.put("Japan Open Chain Testnet", EVMChain.JOCTEST);
			this.put("Arbitrum Sepolia", EVMChain.ARBITRUMSEPOLIATEST);
			this.put("Milkomeda A1 Testnet", EVMChain.MILKOMEDAA1TEST);
			this.put("Milkomeda C1 Testnet", EVMChain.MILKOMEDAC1TEST);
			this.put("Taiko Jolnir L2", EVMChain.TAIKOALPHA5TEST);
			this.put("Taiko (Alpha-2 Testnet)", EVMChain.TAIKOALPHA2TEST);
			this.put("Base Goerli Testnet", EVMChain.BASEGOERLITEST);
			this.put("Base Sepolia Testnet", EVMChain.BASESEPOLIATEST);
			this.put("OP Sepolia Testnet", EVMChain.OPTIMISMSEPOLIATEST);
			this.put("Zilliqa EVM", EVMChain.ZILLIQA);
			this.put("Zilliqa EVM Testnet", EVMChain.ZILLIQATEST);
			this.put("Beam", EVMChain.BEAM);
			this.put("Mumbai", EVMChain.MUMBAITEST);
			this.put("Linea", EVMChain.LINEA);
			this.put("Linea Testnet", EVMChain.LINEATEST);
			this.put("Avalanche C-Chain", EVMChain.AVAX);
			this.put("Avalanche Fuji Testnet", EVMChain.FUJITEST);
			this.put("Oasis Emerald", EVMChain.OASISEMERALD);
			this.put("Oasis Emerald Testnet", EVMChain.OASISEMERALDTEST);
			this.put("Celo Mainnet", EVMChain.CELO);
			this.put("Arbitrum One", EVMChain.ARBITRUMONE);
			this.put("OasisChain Mainnet", EVMChain.OASISCHAIN);
			this.put("Bitkub Chain Testnet", EVMChain.BITKUBTEST);
			this.put("Oasis Sapphire", EVMChain.OASISSAPPHIRE);
			this.put("Oasis Sapphire Testnet", EVMChain.OASISSAPPHIRETEST);
			this.put("Astar zkEVM", EVMChain.ASTARZKEVM);
			this.put("Evmos", EVMChain.EVMOS);
			this.put("Evmos Testnet", EVMChain.EVMOSTEST);
			this.put("Base", EVMChain.BASE);
			this.put("Klaytn Mainnet Cypress", EVMChain.KLAYTN);
			this.put("Shardeum Liberty 1.X", EVMChain.SHARDEUMLIBERTY1xTEST);
			this.put("Shardeum Liberty 2.X", EVMChain.SHARDEUMLIBERTY2xTEST);
			this.put("Shardeum Sphinx 1.X", EVMChain.SHARDEUMSPHINX1xTEST);
			this.put("Canto", EVMChain.CANTO);
			this.put("Canto Tesnet", EVMChain.CANTOTEST);
			this.put("opBNB Testnet", EVMChain.OPBNBTEST);
			this.put("Mantle Testnet", EVMChain.MANTLETEST);
			this.put("LUKSO Testnet", EVMChain.LUKSOTEST);
			this.put("Fantom Testnet", EVMChain.FANTOMTEST);
			this.put("ZetaChain Athens 3 Testnet", EVMChain.ZETAATHENSTEST);
			this.put("Milkomeda C1 Mainnet", EVMChain.MILKOMEDAC1);
			this.put("Milkomeda A1 Mainnet", EVMChain.MILKOMEDAA1);
			this.put("Tenet", EVMChain.TENET);
			this.put("Polygon zkEVM Testnet", EVMChain.ZKEVMTEST);
			this.put("WEMIX3.0 Mainnet", EVMChain.WEMIX);
			this.put("PulseChain", EVMChain.PULSECHAIN);
			this.put("zkSync Era Mainnet", EVMChain.ZKSYNCERA);
			this.put("Hedera Mainnet", EVMChain.HEDERA);
			this.put("Hedera Testnet", EVMChain.HEDERATEST);
			this.put("Boba Network", EVMChain.BOBA);
			this.put("zkSync Era Testnet", EVMChain.ZKSYNCERATEST);
			this.put("Fantom Opera", EVMChain.FANTOM);
			this.put("opBNB Mainnet", EVMChain.OPBNB);
			this.put("Tenet Testnet", EVMChain.TENETTEST);
			this.put("Polygon Mainnet", EVMChain.POLYGON);
			this.put("Syscoin Tanenbaum Testnet", EVMChain.SYSCOINTEST); 
			this.put("Xpla Mainnet", EVMChain.XPLA); 
			this.put("Zora", EVMChain.ZORA);
			this.put("Zora Sepolia Testnet", EVMChain.ZORASEPOLIATEST);
			this.put("Moonbeam", EVMChain.MOONBEAM); 
			this.put("Moonriver", EVMChain.MOONRIVER); 
			this.put("Mantle", EVMChain.MANTLE); 
			this.put("Immutable zkEVM Testnet", EVMChain.IMMUTABLEZKEVMTEST); 
			this.put("ZKFair Testnet", EVMChain.ZKFAIRTEST); 
			this.put("Manta Pacific Testnet", EVMChain.MANTATEST);
			this.put("Neon EVM Mainnet", EVMChain.NEON);
			this.put("FNCY Testnet", EVMChain.FNCYTEST);
			this.put("FNCY", EVMChain.FNCY);
			this.put("Dogechain Mainnet", EVMChain.DOGECHAIN);
			this.put("Dogechain Testnet", EVMChain.DOGECHAINTEST);
			this.put("WEMIX3.0 Testnet", EVMChain.WEMIXTEST);
			this.put("Metis Goerli Testnet", EVMChain.METISSTARDUSTTEST);
			this.put("Boba BNB Mainnet", EVMChain.BOBABNB); 
			this.put("Siberium Network", EVMChain.SIBERIUM);
			this.put("Siberium Test Network", EVMChain.SIBERIUMTEST); 
			this.put("Kava Testnet", EVMChain.KAVATEST); 
			this.put("Kava", EVMChain.KAVA); 
			this.put("Syscoin Tanenbaum Testnet", EVMChain.SYSCOINTEST);
			this.put("Flare Mainnet", EVMChain.FLARE); 
			this.put("Flare Testnet Coston", EVMChain.FLARECOSTONTEST); 
			this.put("Flare Testnet Coston2", EVMChain.FLARECOSTON2TEST); 
			this.put("ShibaChain", EVMChain.SHIBACHAIN); 
			this.put("Ethereum Classic", EVMChain.ETC); 
			this.put("XDC Network", EVMChain.XDC); 
			this.put("XDC Apothem Network", EVMChain.XDCAPOTHEMTEST);
			this.put("Telos EVM Mainnet", EVMChain.TELOS);
			this.put("Telos EVM Testnet", EVMChain.TELOSTEST);
			this.put("Polygon zkEVM", EVMChain.ZKEVM);
			this.put("Core Blockchain Mainnet", EVMChain.CORE);
			this.put("Core Blockchain Testnet", EVMChain.CORETEST);
			this.put("Rangers Protocol Mainnet", EVMChain.RANGERS);
			this.put("Rangers Protocol Testnet", EVMChain.RANGERSTEST);
			this.put("Kroma Sepolia", EVMChain.KROMASEPOLIATEST);
			this.put("DeFiChain EVM Network Mainnet", EVMChain.DEFICHAIN);
			this.put("DeFiChain EVM Network Testnet", EVMChain.DEFICHAINTEST);
			this.put("Torus Mainnet", EVMChain.TORUS);
			this.put("Torus Testnet", EVMChain.TORUSTEST);
			this.put("Quadrans Blockchain", EVMChain.QUADRANS);
			this.put("Quadrans Blockchain Testnet", EVMChain.QUADRANSTEST);
			this.put("Rootstock Mainnet", EVMChain.ROOTSTOCK);
			this.put("Rootstock Testnet", EVMChain.ROOTSTOCKTEST);
			this.put("PulseChain Testnet v4", EVMChain.PULSECHAIN4TEST);
			this.put("ZKFair Mainnet", EVMChain.ZKFAIR);
			this.put("Hypra Mainnet", EVMChain.HYPRA);
			this.put("Eluvio Content Fabric", EVMChain.ELUVIO);
			this.put("Bitgert Mainnet", EVMChain.BITGERT);
			this.put("Mind Smart Chain Mainnet", EVMChain.MIND);
			this.put("Mind Smart Chain Testnet", EVMChain.MINDTEST);
			this.put("Unique", EVMChain.UNIQUE);
			this.put("Quartz by Unique", EVMChain.QUARTZUNIQUE);
			this.put("Rise of the Warbots Testnet", EVMChain.ROTWTEST);
			this.put("SOMA Network Testnet", EVMChain.SOMATEST);
			this.put("Edgeware EdgeEVM Mainnet", EVMChain.EDGEWARE);
			this.put("Ontology Mainnet", EVMChain.ONTOLOGY);
			this.put("Ontology Testnet", EVMChain.ONTOLOGYTEST);
						
			//this.put("DeBank Testnet", EVMChain.GNOSIS); // single dead node
			//this.put("Mantle Sepolia Testnet", EVMChain.MANTLESEPOLIATEST); //dead nodes only
			//this.put("ZetaChain Mainnet", EVMChain.ZE); // not live yet
		}};

		HashMap<String, Boolean> skipnodes = new HashMap<String, Boolean>() {{
			this.put("https://api.metadium.com/dev", true); // incorrectly added as Metadium mainnet node
			this.put("https://rpc.jolnir.taiko.xyz", true); // old account balance reply but latestblocknr?  
		}};

		String jsonarr = HttpRequestUtils.getBodyUsingGETUrlRequest("https://chainid.network/chains.json");
		if (jsonarr.startsWith("[{")) {
			LOGGER.info("Received JSON");
			ExtEVMChainEntry[] arr = JSONUtils.createPOJOFromJSON(jsonarr, ExtEVMChainEntry[].class);
			if (null == arr) {
				LOGGER.error("Unable to parse JSON");
				SystemUtils.halt();
			}
			for (ExtEVMChainEntry eece: arr) {
					if (debug) System.out.println("chain: " + eece.getName());
					EVMChain evmchain = chain_map.get(eece.getName());
					
					HashMap<String, Boolean> forestfish_nodes = new HashMap<>();
					if (null != evmchain) {
						EVMChainInfo chaininfo = EVMUtils.getEVMChainInfo(evmchain);
						
						// Sanitycheck
						if (!chaininfo.getChainId().equals(eece.getChainId())) {
							LOGGER.warn("Incorrect chain ID for " + chaininfo.getChainName() + "?");
							LOGGER.warn("forestfish ID: " + chaininfo.getChainId());
							LOGGER.warn("chainlist ID: " + eece.getChainId());
							SystemUtils.halt();
						}
						
						for (String nodeURL: chaininfo.getNodeURLs()) {
							if (debug) System.out.println(" - forestfish node: " + nodeURL);
							forestfish_nodes.put(nodeURL, true);
						}
						if (debug) System.out.println("----------------------------------");
						int newnode_count = 0;
						for (String nodeURL: eece.getRpc()) {
							if (nodeURL.startsWith("http")) {
								if (!nodeURL.contains("API_KEY")) {
									if (null == forestfish_nodes.get(nodeURL)) {
										if (null == skipnodes.get(nodeURL)) {
											Web3j web3j_cand = Web3j.build(new HttpService(nodeURL));
											Long latestblocknr = EVMUtils.getLatestBlockNumberFromNodeAsHealthCheck(evmchain, nodeURL, web3j_cand);
											if ((null != latestblocknr) && (latestblocknr>0L)) {
												System.out.println("this.add(\"" + nodeURL + "\");");
												newnode_count++;
											}
										}
									}
								}
							}
						}

						if (newnode_count > 0) {
							LOGGER.info("Add the new " + newnode_count + " nodes for EVMChain." + evmchain.toString() + " in BlockchainDetailsEVM and re-run");
							SystemUtils.halt();
						}
					} else {
						
						int nodeCount = 0;
						int activeNodeCount = 0;
						for (String nodeURL: eece.getRpc()) {
							if (nodeURL.startsWith("http")) {
								if (!nodeURL.contains("API_KEY")) {
									nodeCount++;
									Web3j web3j_cand = Web3j.build(new HttpService(nodeURL));
									Long latestblocknr = EVMUtils.getLatestBlockNumberFromNodeAsHealthCheck(evmchain, nodeURL, web3j_cand);
									if ((null != latestblocknr) && (latestblocknr>0L)) {
										activeNodeCount++;
									}
								}
							}
						}
						
						if (activeNodeCount != 0) LOGGER.info("Skipping active/candidate chain: " + eece.getName() + " [activeNodeCount: " + activeNodeCount + "/" + nodeCount + "]");
						SystemUtils.sleepInSeconds(5);
					}	
			}

		} else {
			LOGGER.error("Unable to get a proper JSON reply");
		}

		LOGGER.info("fin.all.rpc.nodes.up.to.date");
	}

}
