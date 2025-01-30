package crypto.forestfish.objects.evm.connector;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

import crypto.forestfish.enums.evm.EVMChain;
import crypto.forestfish.objects.evm.model.chain.EVMChainInfo;
import crypto.forestfish.utils.*;

public class EVMBlockChainConnector {

	private static final Logger LOGGER = LoggerFactory.getLogger(EVMBlockChainConnector.class);

	private EVMChain chain;
	private EVMChainInfo chaininfo;
	private String current_nodeURL;
	private String current_blockexplorerURL;
	private Web3j provider_instance;

	private HashMap<String, Boolean> deadnodes = new HashMap<>();

	// call defaults
	int callRetryThreshold = 3;
	int confirmTimeInSecondsBeforeRetry = 20;
	boolean haltOnFailedCall = true;

	// tx defaults
	int txRetryThreshold = 3;

	public EVMBlockChainConnector(EVMChain _chain, String _forced_nodeURL, boolean _haltOnRPCNodeSelectionFail) {
		super();
		this.chain = _chain;
		this.chaininfo = EVMUtils.getEVMChainInfo(_chain);

		boolean initialization_complete = false;
		int randomAttemptCounter = 0;
		while (!initialization_complete && (randomAttemptCounter<=10)) {
			Web3j web3j_cand = Web3j.build(new HttpService(_forced_nodeURL));
			long init = System.currentTimeMillis();
			Long latestblocknr = EVMUtils.getLatestBlockNumberFromNodeAsHealthCheck(this.chain, _forced_nodeURL, web3j_cand);
			//System.out.println("latestblocknr: " + latestblocknr);
			long resp = System.currentTimeMillis() - init;
			if ((null != latestblocknr) && (latestblocknr>0L)) {
				LOGGER.info("node URL " + _forced_nodeURL + " looks fine for " + this.chain);
				LOGGER.info("latestblock='" + latestblocknr + "', response_time=" + resp + " ms");
				this.provider_instance = web3j_cand;
				this.current_nodeURL = _forced_nodeURL;
				initialization_complete = true;
			} else {
				LOGGER.info("Failed attempt using node " + _forced_nodeURL + ", randomAttemptCounter=" + randomAttemptCounter);
			}
			randomAttemptCounter++;
		}
		
		if (!initialization_complete) {
			if (_haltOnRPCNodeSelectionFail) {
				LOGGER.error("Unable to get an RPC connection for chain " + this.chain + " using forced node " + _haltOnRPCNodeSelectionFail);
				SystemUtils.halt();
			} else {
				LOGGER.warn("Unable to get an RPC connection for chain " + this.chain + " using forced node " + _haltOnRPCNodeSelectionFail);
			}
		}
	}

	public EVMBlockChainConnector(EVMChain _chain, boolean _haltOnRPCNodeSelectionFail) {
		super();
		this.chain = _chain;
		this.chaininfo = EVMUtils.getEVMChainInfo(_chain);
		selectRandomNodeURL(_haltOnRPCNodeSelectionFail);
	}

	public EVMBlockChainConnector(EVMChain _chain, boolean _nodeOptimized, boolean _haltOnRPCNodeSelectionFail) {
		super();
		this.chain = _chain;
		this.chaininfo = EVMUtils.getEVMChainInfo(_chain);
		if (_nodeOptimized) {
			selectSpeedyNodeURL(_haltOnRPCNodeSelectionFail);
		} else {
			selectRandomNodeURL(_haltOnRPCNodeSelectionFail);
		}
	}

	public void selectRandomNodeURL(boolean _haltOnRPCNodeSelectionFail) {
		this.setHaltOnFailedCall(_haltOnRPCNodeSelectionFail);
		
		// verify and select RPC connection
		LOGGER.info("We need to get 1 of these candidates working, gonna go random:");
		int candindex = 1;
		for (String nodeURL: this.chaininfo.getNodeURLs()) {
			LOGGER.info(" #" + candindex + ": " + nodeURL);
			candindex++;
		}
		boolean selection_complete = false;
		int randomAttemptCounter = 0;
		while (!selection_complete && (randomAttemptCounter<=3)) {
			String candidate = getRandom_nodeURL_candidate();
			Web3j web3j_cand = Web3j.build(new HttpService(candidate));
			long init = System.currentTimeMillis();
			Long latestblocknr = EVMUtils.getLatestBlockNumberFromNodeAsHealthCheck(this.chain, candidate, web3j_cand);
			//System.out.println("latestblocknr: " + latestblocknr);
			long resp = System.currentTimeMillis() - init;
			if ( (null != latestblocknr) && (latestblocknr>0L)) {
				LOGGER.info("node URL " + candidate + " looks fine for " + this.chain + ", will use it");
				LOGGER.info("latestblock='" + latestblocknr + "', response_time=" + resp + " ms");
				this.provider_instance = web3j_cand;
				this.current_nodeURL = candidate;
				selection_complete = true;
			} else {
				LOGGER.info("Failed attempt using node " + candidate + ", randomAttemptCounter=" + randomAttemptCounter);
			}
			randomAttemptCounter++;
		}

		if (!selection_complete) {
			if (_haltOnRPCNodeSelectionFail) {
				LOGGER.error("Unable to get an RPC connection for chain " + this.chain);
				SystemUtils.halt();
			} else {
				LOGGER.warn("Unable to get an RPC connection for chain " + this.chain);
			}
		}
	}

	public void selectRandomNodeURL(String _skipthisNodeURL) {
		// verify and select RPC connection
		if (null == _skipthisNodeURL) {
			LOGGER.info("We need to get 1 of these candidates working, gonna go random");
			_skipthisNodeURL = "";
		} else {
			LOGGER.info("We need to get 1 of these candidates working, gonna go random without " + _skipthisNodeURL);
		}
		int candindex = 1;
		for (String nodeURL: this.chaininfo.getNodeURLs()) {
			LOGGER.info(" #" + candindex + ": " + nodeURL);
			candindex++;
		}
		boolean morethan1Candidate = true;
		if (this.chaininfo.getNodeURLs().size() == 1) morethan1Candidate = false;
		boolean selection_complete = false;
		int randomAttemptCounter = 0;
		while (!selection_complete && (randomAttemptCounter<=3)) {
			String candidate = getRandom_nodeURL_candidate();
			if (morethan1Candidate && _skipthisNodeURL.equals(candidate)) {
				// lets pick a different node
			} else if (!morethan1Candidate && _skipthisNodeURL.equals(candidate)) {
				// early exit
				if (!morethan1Candidate) randomAttemptCounter = 100;
			} else {	
				Web3j web3j_cand = Web3j.build(new HttpService(candidate));
				long init = System.currentTimeMillis();
				Long latestblocknr = EVMUtils.getLatestBlockNumberFromNodeAsHealthCheck(this.chain, candidate, web3j_cand);
				long resp = System.currentTimeMillis() - init;
				if ( (null != latestblocknr) && (latestblocknr>0L)) {
					LOGGER.info("node URL " + candidate + " looks fine for " + this.chain + ", will use it");
					LOGGER.info("latestblock='" + latestblocknr + "', response_time=" + resp + " ms");
					this.provider_instance = web3j_cand;
					this.current_nodeURL = candidate;
					selection_complete = true;
				}
			}
			randomAttemptCounter++;
		}
	}

	public String getRandom_nodeURL_candidate() {
		int size = this.chaininfo.getNodeURLs().size();
		if (size == 0) {
			LOGGER.error("We have no nodeURL candidates available. We should not be instantiated at at this point ..");
			SystemUtils.halt();
		} else if (size == 1) {
			return this.chaininfo.getNodeURLs().get(0);
		} else {
			int selection = NumUtils.randomNumWithinRangeAsInt(1, size);
			int index = 1;
			for (String nodeURL: this.chaininfo.getNodeURLs()) {
				if (selection == index) return nodeURL;
				index++;
			}
			return this.chaininfo.getNodeURLs().get(0);
		}
		LOGGER.error("We have no nodeURL candidates available. We should not be instantiated at at this point ..");
		SystemUtils.halt();
		return null;
	}

	public void selectSpeedyNodeURL(boolean _haltOnRPCNodeSelectionFail) {
		// verify and select RPC connection
		String winner = "";
		if (this.chaininfo.getNodeURLs().size() == 1) {

			// verify that the one we have works though
			String candidate = this.getChaininfo().getNodeURLs().get(0);
			Web3j web3j_cand = Web3j.build(new HttpService(candidate));
			Long latestblocknr = EVMUtils.getLatestBlockNumberFromNodeAsHealthCheck(this.chain, candidate, web3j_cand);
			if ( (null != latestblocknr) && (latestblocknr>0L)) {
				winner = this.chaininfo.getNodeURLs().get(0);
				this.current_nodeURL = winner;
				LOGGER.info("We only have one node candidate (and it works fine) so lets move forward with " + winner);
			} else {
				if (_haltOnRPCNodeSelectionFail) {
					LOGGER.error("Unable to get an RPC connection for chain " + this.chain);
					SystemUtils.halt();
				} else {
					LOGGER.warn("Unable to get an RPC connection for chain " + this.chain);
				}
			}
		} else {

			LOGGER.info("We need to get 1 of these candidates working, gonna optimize:");
			int candindex = 1;
			for (String nodeURL: this.chaininfo.getNodeURLs()) {
				LOGGER.info(" #" + candindex + ": " + nodeURL);
				candindex++;
			}

			boolean nondead_winner_found = false;
			int nodescancounter = 0;
			while (!nondead_winner_found) {

				HashMap<String, Long> candidate_blockstate = new HashMap<>();

				long maxBlockNR = Long.MIN_VALUE;
				long minDiff = Long.MAX_VALUE;
				for (String candidate: this.getChaininfo().getNodeURLs()) {
					// make sure to disregard dead nodes
					if (null == deadnodes.get(candidate)) {
						Web3j web3j_cand = Web3j.build(new HttpService(candidate));
						long init = System.currentTimeMillis();
						Long latestblocknr = EVMUtils.getLatestBlockNumberFromNodeAsHealthCheck(this.chain, candidate, web3j_cand);
						//System.out.println("version: " + version);
						long resp = System.currentTimeMillis() - init;
						if ( (null != latestblocknr) && (latestblocknr>0L)) {
							this.current_nodeURL = candidate;
							if (resp<minDiff) {
								winner = candidate;
								minDiff = resp;
							}
							LOGGER.info("latestblocknr=" + latestblocknr + " response_time=" + resp + " ms : " + candidate);
							candidate_blockstate.put(candidate, latestblocknr);
							if (maxBlockNR < latestblocknr) maxBlockNR = latestblocknr;
						} else {
							LOGGER.info("Registering dead node: " + candidate);
							deadnodes.put(candidate, true);
						}
					}
				}

				if ("".equals(winner)) {
					LOGGER.error("Unable to find a valid node for " + this.chain);
					SystemUtils.halt();
				} else {

					// Verify that our winner node is not outdated
					for (String cand: candidate_blockstate.keySet()) {
						Long blocknr = candidate_blockstate.get(cand);
						Long diff = Math.abs(maxBlockNR - blocknr);
						if (diff > candidate_blockstate.keySet().size()) {
							LOGGER.warn("Found dead/lagging node, blockdiff=" + diff + ": " + cand);
							deadnodes.put(cand, true);
						}
					}

					if (null == deadnodes.get(winner)) {
						LOGGER.info("node URL " + winner + " seems best option for " + this.chain + ", response_time=" + minDiff + " ms");
						nondead_winner_found = true;
					} else {
						LOGGER.info("We need to re-run, found dead nodes (" + deadnodes.size() + ") in our list of candidates (" + this.getChaininfo().getNodeURLs().size() + ") .. [nodescancounter: " + nodescancounter + "]");
						LOGGER.info("deadnodes: " + deadnodes.keySet());
						if (this.getChaininfo().getNodeURLs().size() == deadnodes.size()) {
							LOGGER.error("All RPC node candidates are dead?");
							SystemUtils.halt();
						}
						if (nodescancounter > 10) {
							LOGGER.error("All RPC node candidates are dead? Giving up after 10 scans");
							SystemUtils.halt();
						}
					}

				}
				nodescancounter++;
			}

		}

		if ("".equals(winner)) {
			if (_haltOnRPCNodeSelectionFail) {
				LOGGER.error("Unable to get an RPC connection for chain " + this.chain);
				SystemUtils.halt();
			} else {
				LOGGER.warn("Unable to get an RPC connection for chain " + this.chain);
			}
		} else {
			this.provider_instance = Web3j.build(new HttpService(winner));
		}

	}

	public EVMChainInfo getChaininfo() {
		return chaininfo;
	}

	public void setChaininfo(EVMChainInfo chaininfo) {
		this.chaininfo = chaininfo;
	}

	public String getCurrent_nodeURL() {
		return current_nodeURL;
	}

	public void setCurrent_nodeURL(String current_nodeURL) {
		this.current_nodeURL = current_nodeURL;
	}

	public String getCurrent_blockexplorerURL() {
		return current_blockexplorerURL;
	}

	public void setCurrent_blockexplorerURL(String current_blockexplorerURL) {
		this.current_blockexplorerURL = current_blockexplorerURL;
	}

	public EVMChain getChain() {
		return chain;
	}

	public void setChain(EVMChain chain) {
		this.chain = chain;
	}

	public Web3j getProvider_instance() {
		return provider_instance;
	}

	public void setProvider_instance(Web3j provider_instance) {
		this.provider_instance = provider_instance;
	}

	public int getConfirmTimeInSecondsBeforeRetry() {
		return confirmTimeInSecondsBeforeRetry;
	}

	public void setConfirmTimeInSecondsBeforeRetry(int confirmTimeInSecondsBeforeRetry) {
		this.confirmTimeInSecondsBeforeRetry = confirmTimeInSecondsBeforeRetry;
	}

	public boolean isHaltOnFailedCall() {
		return haltOnFailedCall;
	}

	public void setHaltOnFailedCall(boolean haltOnFailedCall) {
		this.haltOnFailedCall = haltOnFailedCall;
	}

	public HashMap<String, Boolean> getDeadnodes() {
		return deadnodes;
	}

	public void setDeadnodes(HashMap<String, Boolean> deadnodes) {
		this.deadnodes = deadnodes;
	}

	public int getTxRetryThreshold() {
		return txRetryThreshold;
	}

	public void setTxRetryThreshold(int txRetryThreshold) {
		this.txRetryThreshold = txRetryThreshold;
	}

}
