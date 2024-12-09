package crypto.forestfish.objects.avm.connector;

import java.io.File;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.algorand.algosdk.v2.client.common.AlgodClient;
import com.algorand.algosdk.v2.client.common.IndexerClient;

import crypto.forestfish.enums.avm.AVMChain;
import crypto.forestfish.objects.avm.AlgoIndexerNode;
import crypto.forestfish.objects.avm.AlgoRelayNode;
import crypto.forestfish.objects.avm.model.chain.AVMChainInfo;
import crypto.forestfish.utils.*;

public class AVMBlockChainConnector {

	private static final Logger LOGGER = LoggerFactory.getLogger(AVMBlockChainConnector.class);

	private AVMChain chain;
	private AVMChainInfo chaininfo;
	private AlgoRelayNode relayNode;
	private AlgodClient provider_instance;
	private AlgoIndexerNode indexerNode;
	private IndexerClient indexer_instance;

	private HashMap<String, Boolean> deadnodes = new HashMap<>();

	public AVMBlockChainConnector(AVMChain _chain, boolean _nodeOptimized) {
		super();
		LOGGER.debug("Creating a new AVMBlockChainConnector");

		// Basic info
		this.chain = _chain;
		this.chaininfo = AVMUtils.getAVMChainInfo(_chain);

		// Check if we have preferred custom network settings first
		String prefPath = ".avm/networks/" + _chain.toString();
		LOGGER.debug("Checking for preferred chainInfo details at " + prefPath);
		File f = new File(prefPath);
		if (f.exists()) {
			LOGGER.info("Found custom network config at " + prefPath);
			String json = FilesUtils.readStringFromFile(prefPath);
			AVMChainInfo chainInfo = JSONUtils.createPOJOFromJSON(json, AVMChainInfo.class);
			this.chaininfo = chainInfo;

			for (AlgoRelayNode node: chaininfo.getNodes()) {
				this.relayNode = node;
			}

			for (AlgoIndexerNode node: chaininfo.getIdxnodes()) {
				this.indexerNode = node;
			}

		} else {

			LOGGER.debug("Getting relay node");
			if (_nodeOptimized) {
				LOGGER.info("Finding optimal relay node for public AVM blockchain " + chain);
				this.relayNode = selectSpeedyRelayNode();
			} else {
				LOGGER.info("Finding random relay node for public AVM blockchain " + chain);
				this.relayNode = selectRandomRelayNode();
			}

			LOGGER.debug("Getting indexer node");
			if (_nodeOptimized) {
				LOGGER.info("Finding optimal indexer node for public AVM blockchain " + chain);
				this.indexerNode = selectSpeedyIndexerNode();
			} else {
				LOGGER.info("Finding random indexer node for public AVM blockchain " + chain);
				this.indexerNode = selectRandomIndexerNode();
			}

		}

		LOGGER.info("------------------------------------------------");

		if (null == this.relayNode) {
			LOGGER.error("Unable to find valid algorand relay node for chain " + _chain);
			SystemUtils.halt();
		} else {
			LOGGER.info("Using relaynode " + this.relayNode.getUrl());
		}
		this.provider_instance = new AlgodClient(this.getRelayNode().getUrl(), this.getRelayNode().getPort(), this.getRelayNode().getAuthtoken(), this.getRelayNode().getAuthtoken_key());

		if (null == this.indexerNode) {
			LOGGER.warn("Unable to find valid algorand indexer node for chain " + _chain);
		} else {
			LOGGER.info("Using indexer " + this.indexerNode.getUrl());
			this.indexer_instance = new IndexerClient(this.getIndexerNode().getUrl(), this.getIndexerNode().getPort(), this.getIndexerNode().getAuthtoken(), this.getIndexerNode().getAuthtoken_key());
		}

		System.out.println("");

	}

	public AVMBlockChainConnector(AVMChain _chain, AlgoRelayNode _relaynode) {
		super();
		this.chain = _chain;
		this.chaininfo = AVMUtils.getAVMChainInfo(_chain);

		this.relayNode = _relaynode;
		this.provider_instance = new AlgodClient(this.getRelayNode().getUrl(), this.getRelayNode().getPort(), this.getRelayNode().getAuthtoken(), this.getRelayNode().getAuthtoken_key());
	}

	public AVMBlockChainConnector(AVMChain _chain, AlgoIndexerNode _idxnode) {
		super();
		this.chain = _chain;
		this.chaininfo = AVMUtils.getAVMChainInfo(_chain);

		this.indexerNode = _idxnode;
		this.indexer_instance = new IndexerClient(this.getIndexerNode().getUrl(), this.getIndexerNode().getPort(), this.getIndexerNode().getAuthtoken(), this.getIndexerNode().getAuthtoken_key());
	}

	public AVMBlockChainConnector(AVMChainInfo _chainInfo) {
		super();
		this.chain = AVMChain.valueOf(_chainInfo.getShortName());
		this.chaininfo = AVMUtils.getAVMChainInfo(this.chain);

		if (_chainInfo.getNodes().isEmpty()) {
			LOGGER.error("No nodes part of the chainInfo provided");
			SystemUtils.halt();
		}
		this.relayNode = _chainInfo.getNodes().get(0);
		this.provider_instance = new AlgodClient(this.getRelayNode().getUrl(), this.getRelayNode().getPort(), this.getRelayNode().getAuthtoken(), this.getRelayNode().getAuthtoken_key());

		if (_chainInfo.getIdxnodes().isEmpty()) {
			LOGGER.warn("Unable to find valid algorand indexer node for chain " + this.chain);
		} else {
			this.indexerNode = _chainInfo.getIdxnodes().get(0);
			this.indexer_instance = new IndexerClient(this.getIndexerNode().getUrl(), this.getIndexerNode().getPort(), this.getIndexerNode().getAuthtoken(), this.getIndexerNode().getAuthtoken_key());
		}
	}

	public void reinitializeConnector() {
		if (null != this.getRelayNode()) {
			if (null != this.getRelayNode().getUrl()) {
				LOGGER.info("connector re-init with relay node " + this.getRelayNode().getUrl());
				this.provider_instance = new AlgodClient(this.getRelayNode().getUrl(), this.getRelayNode().getPort(), this.getRelayNode().getAuthtoken(), this.getRelayNode().getAuthtoken_key());
			}
		}
		if (null != this.getIndexerNode()) {
			if (null != this.getIndexerNode().getUrl()) {
				LOGGER.info("connector re-init with indexer node " + this.getIndexerNode().getUrl());
				this.indexer_instance = new IndexerClient(this.getIndexerNode().getUrl(), this.getIndexerNode().getPort(), this.getIndexerNode().getAuthtoken(), this.getIndexerNode().getAuthtoken_key());
			}
		}
	}

	public AlgoRelayNode selectSpeedyRelayNode() {
		// verify and select node
		AlgoRelayNode winner = null;
		if (this.chaininfo.getNodes().size() == 1) {
			winner = this.chaininfo.getNodes().get(0);
			LOGGER.info("We only have one relay node candidate so lets move forward with " + winner.getUrl());
			return winner;
		} else {

			LOGGER.info("We need to get 1 of these relay candidates working, gonna optimize:");
			int candindex = 1;
			for (AlgoRelayNode node: this.chaininfo.getNodes()) {
				LOGGER.info(" #" + candindex + ": " + node.getUrl());
				candindex++;
			}

			boolean nondead_winner_found = false;
			while (!nondead_winner_found) {

				HashMap<String, Long> candidate_blockstate = new HashMap<>();

				long maxRoundNR = Long.MIN_VALUE;
				long minDiff = Long.MAX_VALUE;
				for (AlgoRelayNode candidate: this.getChaininfo().getNodes()) {
					// make sure to disregard dead nodes
					if (null == deadnodes.get(candidate.getUrl())) {

						AVMBlockChainConnector connector = new AVMBlockChainConnector(chain, candidate);
						long init = System.currentTimeMillis();
						Long lastRound = AVMUtils.getLastRound(connector);
						//System.out.println("lastRound: " + lastRound);
						long resp = System.currentTimeMillis() - init;

						if ( (null != lastRound) && (lastRound>0L)) {
							winner = candidate;
							if (resp<minDiff) {
								winner = candidate;
								minDiff = resp;
							}
							LOGGER.info("lastRound=" + lastRound + " response_time=" + resp + " ms : " + candidate.getUrl());
							candidate_blockstate.put(candidate.getUrl(), lastRound);
							if (maxRoundNR < lastRound) maxRoundNR = lastRound;
						} else {
							LOGGER.info("Registering dead node: " + candidate);
							deadnodes.put(candidate.getUrl(), true);
						}
					}


				}

				if (null == winner) {
					LOGGER.error("Unable to find a valid node for " + this.chain);
					SystemUtils.halt();
				} else {

					// Verify that our winner node is not outdated
					for (String cand_url: candidate_blockstate.keySet()) {
						Long roundnr = candidate_blockstate.get(cand_url);
						Long diff = Math.abs(maxRoundNR - roundnr);
						if (diff > candidate_blockstate.keySet().size()) {
							LOGGER.warn("Found dead/lagging node, rounddiff=" + diff + ": " + cand_url);
							deadnodes.put(cand_url, true);
						}
					}

					if (null == deadnodes.get(winner.getUrl())) {
						LOGGER.info("relay node URL " + winner.getUrl() + " seems best option for " + this.chain + ", response_time=" + minDiff + " ms");
						nondead_winner_found = true;
					} else {
						LOGGER.info("We need to re-run, found dead nodes (" + deadnodes.size() + ") in our list ..");
						LOGGER.info("deadnodes: " + deadnodes.keySet());
						if (this.getChaininfo().getNodes().size() == deadnodes.size()) {
							LOGGER.error("All node candidates are dead?");
							SystemUtils.halt();
						}
					}

				}

			}

		}
		return winner;
	}


	public AlgoIndexerNode selectSpeedyIndexerNode() {
		// verify and select node
		AlgoIndexerNode winner = null;
		if (this.chaininfo.getIdxnodes().size() == 1) {
			winner = this.chaininfo.getIdxnodes().get(0);
			LOGGER.info("We only have one indexer node candidate so lets move forward with " + winner.getUrl());
			return winner;
		} else {

			LOGGER.info("We need to get 1 of these indexer candidates working, gonna optimize:");
			int candindex = 1;
			for (AlgoIndexerNode node: this.chaininfo.getIdxnodes()) {
				LOGGER.info(" #" + candindex + ": " + node.getUrl());
				candindex++;
			}

			boolean nondead_winner_found = false;
			while (!nondead_winner_found) {

				HashMap<String, Long> candidate_blockstate = new HashMap<>();

				long maxRoundNR = Long.MIN_VALUE;
				long minDiff = Long.MAX_VALUE;
				for (AlgoIndexerNode candidate: this.getChaininfo().getIdxnodes()) {
					// make sure to disregard dead nodes
					if (null == deadnodes.get(candidate.getUrl())) {

						AVMBlockChainConnector connector = new AVMBlockChainConnector(chain, candidate);
						long init = System.currentTimeMillis();
						Long lastRound = AVMUtils.getIndexerHealthCheck(connector);
						//System.out.println("lastRound: " + lastRound);
						long resp = System.currentTimeMillis() - init;

						if ( (null != lastRound) && (lastRound>0L)) {
							winner = candidate;
							if (resp<minDiff) {
								winner = candidate;
								minDiff = resp;
							}
							LOGGER.info("lastRound=" + lastRound + " response_time=" + resp + " ms : " + candidate.getUrl());
							candidate_blockstate.put(candidate.getUrl(), lastRound);
							if (maxRoundNR < lastRound) maxRoundNR = lastRound;
						} else {
							LOGGER.info("Registering dead node: " + candidate);
							deadnodes.put(candidate.getUrl(), true);
						}
					}


				}

				if (null == winner) {
					LOGGER.error("Unable to find a valid node for " + this.chain);
					SystemUtils.halt();
				} else {

					// Verify that our winner node is not outdated
					for (String cand_url: candidate_blockstate.keySet()) {
						Long roundnr = candidate_blockstate.get(cand_url);
						Long diff = Math.abs(maxRoundNR - roundnr);
						if (diff > candidate_blockstate.keySet().size()) {
							LOGGER.warn("Found dead/lagging node, rounddiff=" + diff + ": " + cand_url);
							deadnodes.put(cand_url, true);
						}
					}

					if (null == deadnodes.get(winner.getUrl())) {
						LOGGER.info("indexer node URL " + winner.getUrl() + " seems best option for " + this.chain + ", response_time=" + minDiff + " ms");
						nondead_winner_found = true;
					} else {
						LOGGER.info("We need to re-run, found dead nodes (" + deadnodes.size() + ") in our list ..");
						LOGGER.info("deadnodes: " + deadnodes.keySet());
						if (this.getChaininfo().getNodes().size() == deadnodes.size()) {
							LOGGER.error("All node candidates are dead?");
							SystemUtils.halt();
						}
					}

				}

			}

		}
		return winner;
	}


	public AlgoRelayNode selectRandomRelayNode() {
		AlgoRelayNode selected = null;
		if (this.chaininfo.getNodes().size() == 1) {
			selected = this.chaininfo.getNodes().get(0);
			LOGGER.info("We only have one relay node candidate so lets move forward with " + selected.getUrl());
			return selected;
		}
		LOGGER.info("We need to get 1 of these relay candidates working, gonna go random:");
		int candindex = 1;
		for (AlgoRelayNode node: this.chaininfo.getNodes()) {
			LOGGER.info(" #" + candindex + ": " + node.getUrl());
			candindex++;
		}
		boolean selection_complete = false;
		int randomAttemptCounter = 0;
		while (!selection_complete && (randomAttemptCounter<=10)) {
			AlgoRelayNode candidate = getRandom_relaynode_candidate();

			AVMBlockChainConnector connector = new AVMBlockChainConnector(chain, candidate);
			long init = System.currentTimeMillis();
			Long lastRound = AVMUtils.getLastRound(connector);
			//System.out.println("lastRound: " + lastRound);
			long resp = System.currentTimeMillis() - init;

			if ( (null != lastRound) && (lastRound>0L)) {
				LOGGER.info("node " + candidate.getUrl() + " looks fine for " + this.chain + ", will use it");
				LOGGER.info("lastRound='" + lastRound + "', response_time=" + resp + " ms");
				selected = candidate;
				selection_complete = true;
			} else {
				LOGGER.info("Failed attempt using node " + candidate.getUrl() + ", randomAttemptCounter=" + randomAttemptCounter);
			}
			randomAttemptCounter++;
		}

		return selected;
	}

	public AlgoIndexerNode selectRandomIndexerNode() {
		AlgoIndexerNode selected = null;
		if (this.chaininfo.getIdxnodes().size() == 1) {
			selected = this.chaininfo.getIdxnodes().get(0);
			LOGGER.info("We only have one indexer node candidate so lets move forward with " + selected.getUrl());
			return selected;
		}
		LOGGER.info("We need to get 1 of these indexer candidates working, gonna go random:");
		int candindex = 1;
		for (AlgoIndexerNode node: this.chaininfo.getIdxnodes()) {
			LOGGER.info(" #" + candindex + ": " + node.getUrl());
			candindex++;
		}
		boolean selection_complete = false;
		int randomAttemptCounter = 0;
		while (!selection_complete && (randomAttemptCounter<=10)) {
			AlgoIndexerNode candidate = getRandom_idxnode_candidate();
			AVMBlockChainConnector connector = new AVMBlockChainConnector(chain, candidate);
			long init = System.currentTimeMillis();
			Long lastRound = AVMUtils.getIndexerHealthCheck(connector);
			//System.out.println("lastRound: " + lastRound);
			long resp = System.currentTimeMillis() - init;

			if ( (null != lastRound) && (lastRound>0L)) {
				LOGGER.info("node URL " + candidate.getUrl() + " looks fine for " + this.chain + ", will use it");
				LOGGER.info("lastRound='" + lastRound + "', response_time=" + resp + " ms");
				selected = candidate;
				selection_complete = true;
			} else {
				LOGGER.info("Failed attempt using node " + candidate.getUrl() + ", randomAttemptCounter=" + randomAttemptCounter);
			}
			randomAttemptCounter++;
		}
		return selected;
	}

	public AlgoIndexerNode selectRandomIndexerNode(String _skipthisNode) {
		LOGGER.info("We need to get 1 of these candidates working, gonna go random without " + _skipthisNode);
		AlgoIndexerNode selected = null;
		if (this.chaininfo.getIdxnodes().size() == 1) {
			selected = this.chaininfo.getIdxnodes().get(0);
			LOGGER.info("We only have one indexer node candidate so lets move forward with " + selected.getUrl());
			return selected;
		}
		LOGGER.info("We need to get 1 of these indexer candidates working, gonna go random:");
		int candindex = 1;
		for (AlgoIndexerNode node: this.chaininfo.getIdxnodes()) {
			if (!_skipthisNode.equals(node.getUrl())) {
				LOGGER.info(" #" + candindex + ": " + node.getUrl());
				candindex++;
			}
		}
		boolean morethan1Candidate = true;
		if (this.chaininfo.getIdxnodes().size() == 1) morethan1Candidate = false;
		boolean selection_complete = false;
		int randomAttemptCounter = 0;
		while (!selection_complete && (randomAttemptCounter<=10)) {
			AlgoIndexerNode candidate = getRandom_idxnode_candidate();

			if (morethan1Candidate && _skipthisNode.equals(candidate.getUrl())) {
				// lets pick a different node
			} else if (!morethan1Candidate && _skipthisNode.equals(candidate.getUrl())) {
				// early exit
				if (!morethan1Candidate) randomAttemptCounter = 100;
			} else {
				AVMBlockChainConnector connector = new AVMBlockChainConnector(chain, candidate);
				long init = System.currentTimeMillis();
				Long lastRound = AVMUtils.getIndexerHealthCheck(connector);
				//System.out.println("lastRound: " + lastRound);
				long resp = System.currentTimeMillis() - init;

				if ( (null != lastRound) && (lastRound>0L)) {
					LOGGER.info("node URL " + candidate.getUrl() + " looks fine for " + this.chain + ", will use it");
					LOGGER.info("lastRound='" + lastRound + "', response_time=" + resp + " ms");
					selected = candidate;
					selection_complete = true;
				} else {
					LOGGER.info("Failed attempt using node " + candidate.getUrl() + ", randomAttemptCounter=" + randomAttemptCounter);
				}
				randomAttemptCounter++;
			}
		}
		return selected;
	}


	private AlgoRelayNode getRandom_relaynode_candidate() {
		int size = this.chaininfo.getNodes().size();
		if (size == 0) {
			LOGGER.error("We have no node candidates available. We should not be instantiated at at this point ..");
			SystemUtils.halt();
		} else if (size == 1) {
			return this.chaininfo.getNodes().get(0);
		} else {
			int selection = NumUtils.randomNumWithinRangeAsInt(1, size);
			int index = 1;
			for (AlgoRelayNode node: this.chaininfo.getNodes()) {
				if (selection == index) return node;
				index++;
			}
			return this.chaininfo.getNodes().get(0);
		}
		LOGGER.error("We have no node candidates available. We should not be instantiated at at this point ..");
		SystemUtils.halt();
		return null;
	}

	private AlgoIndexerNode getRandom_idxnode_candidate() {
		int size = this.chaininfo.getNodes().size();
		if (size == 0) {
			LOGGER.error("We have no node candidates available. We should not be instantiated at at this point ..");
			SystemUtils.halt();
		} else if (size == 1) {
			return this.chaininfo.getIdxnodes().get(0);
		} else {
			int selection = NumUtils.randomNumWithinRangeAsInt(1, size);
			int index = 1;
			for (AlgoIndexerNode node: this.chaininfo.getIdxnodes()) {
				if (selection == index) return node;
				index++;
			}
			return this.chaininfo.getIdxnodes().get(0);
		}
		LOGGER.error("We have no node candidates available. We should not be instantiated at at this point ..");
		SystemUtils.halt();
		return null;
	}

	public AVMChain getChain() {
		return chain;
	}

	public void setChain(AVMChain chain) {
		this.chain = chain;
	}

	public AVMChainInfo getChaininfo() {
		return chaininfo;
	}

	public void setChaininfo(AVMChainInfo chaininfo) {
		this.chaininfo = chaininfo;
	}

	public AlgodClient getProvider_instance() {
		return provider_instance;
	}

	public void setProvider_instance(AlgodClient provider_instance) {
		this.provider_instance = provider_instance;
	}

	public HashMap<String, Boolean> getDeadnodes() {
		return deadnodes;
	}

	public void setDeadnodes(HashMap<String, Boolean> deadnodes) {
		this.deadnodes = deadnodes;
	}

	public AlgoRelayNode getRelayNode() {
		return relayNode;
	}

	public void setRelayNode(AlgoRelayNode relayNode) {
		this.relayNode = relayNode;
	}

	public AlgoIndexerNode getIndexerNode() {
		return indexerNode;
	}

	public void setIndexerNode(AlgoIndexerNode indexerNode) {
		this.indexerNode = indexerNode;
	}

	public IndexerClient getIndexer_instance() {
		return indexer_instance;
	}

	public void setIndexer_instance(IndexerClient indexer_instance) {
		this.indexer_instance = indexer_instance;
	}

}
