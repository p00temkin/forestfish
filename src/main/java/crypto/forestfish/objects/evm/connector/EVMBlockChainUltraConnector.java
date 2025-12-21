package crypto.forestfish.objects.evm.connector;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import crypto.forestfish.enums.BlockchainType;
import crypto.forestfish.enums.evm.EVMChain;
import crypto.forestfish.objects.evm.model.chain.EVMChainInfo;
import crypto.forestfish.utils.EVMUtils;
import crypto.forestfish.utils.SystemUtils;

public class EVMBlockChainUltraConnector {

	private static final Logger LOGGER = LoggerFactory.getLogger(EVMBlockChainUltraConnector.class);

	private HashMap<EVMChain, EVMBlockChainConnector> connectors = new HashMap<>();
	private BlockchainType chainType;

	public EVMBlockChainUltraConnector(BlockchainType _chainType, boolean _haltOnRPCNodeSelectionFail) {
		super();
		
		this.chainType = _chainType;
		
		//Initiate an rpc connection to every public blockchain we known of
		for (EVMChain chain: EVMChain.values()) {
			EVMChainInfo chainInfo = EVMUtils.getEVMChainInfo(chain);
			if (chainInfo == null) {
				LOGGER.error("No chainInfo for chain " + chain + "?");
				SystemUtils.halt();
			}
			if (BlockchainType.valueOf(chainInfo.getType()) == chainType) {
				LOGGER.info("Finding optimal node for public EVM blockchain " + chain);
				EVMBlockChainConnector connector = new EVMBlockChainConnector(chain, _haltOnRPCNodeSelectionFail);
				connectors.put(chain, connector);
			}
		}

	}
	
	public EVMBlockChainUltraConnector(BlockchainType _chainType, boolean _nodeOptimized, boolean _haltOnRPCNodeSelectionFail, boolean _earlyMoveOnIfErrors) {
		super();
		
		this.chainType = _chainType;
		
		//Initiate an rpc connection to every public blockchain we known of
		for (EVMChain chain: EVMChain.values()) {
			EVMChainInfo chainInfo = EVMUtils.getEVMChainInfo(chain);
			if (chainInfo == null) {
				LOGGER.error("No chainInfo for chain " + chain + "?");
				SystemUtils.halt();
			}
			if (BlockchainType.valueOf(chainInfo.getType()) == chainType) {
				LOGGER.debug("Finding optimal node for EVM blockchain " + chain);
				EVMBlockChainConnector connector = new EVMBlockChainConnector(chain, _nodeOptimized, _haltOnRPCNodeSelectionFail, _earlyMoveOnIfErrors);
				connectors.put(chain, connector);
			}
		}

	}
	
	public EVMBlockChainUltraConnector(BlockchainType _chainType, HashMap<String, Boolean> _chainlimit, boolean _isnodeOptimized, boolean _haltOnRPCNodeSelectionFail, boolean _earlyMoveOnIfErrors) {
		super();
		
		this.chainType = _chainType;

		if (_chainlimit.keySet().isEmpty()) {
			LOGGER.error("Empty chain limitation passed as argument");
			SystemUtils.halt();
		}

		//Initiate an rpc connection to every public blockchain we known of
		for (EVMChain chain: EVMChain.values()) {
			if (null != _chainlimit.get(chain.toString())) {
				EVMChainInfo chainInfo = EVMUtils.getEVMChainInfo(chain);
				if (BlockchainType.valueOf(chainInfo.getType()) == chainType) {
					if (_isnodeOptimized) LOGGER.info("Getting optimal node for " + chainType + " EVM blockchain " + chain);
					if (!_isnodeOptimized) LOGGER.info("Getting first healthy node for " + chainType + " EVM blockchain " + chain);
					EVMBlockChainConnector connector = new EVMBlockChainConnector(chain, _isnodeOptimized, _haltOnRPCNodeSelectionFail, _earlyMoveOnIfErrors);
					connectors.put(chain, connector);
				}
			}
		}

	}

	public EVMBlockChainUltraConnector(BlockchainType _chainType, HashMap<String, Boolean> _chainlimit, boolean _haltOnRPCNodeSelectionFail) {
		super();
		
		this.chainType = _chainType;

		if (_chainlimit.keySet().isEmpty()) {
			LOGGER.error("Empty chain limitation passed as argument");
			SystemUtils.halt();
		}

		//Initiate an rpc connection to every public blockchain we known of
		for (EVMChain chain: EVMChain.values()) {
			if (null != _chainlimit.get(chain.toString())) {
				EVMChainInfo chainInfo = EVMUtils.getEVMChainInfo(chain);
				if (BlockchainType.valueOf(chainInfo.getType()) == chainType) {
					LOGGER.info("Adding optimal node for public EVM blockchain " + chain);
					EVMBlockChainConnector connector = new EVMBlockChainConnector(chain, _haltOnRPCNodeSelectionFail);
					connectors.put(chain, connector);
				}
			}
		}

	}

	public HashMap<EVMChain, EVMBlockChainConnector> getConnectors() {
		return connectors;
	}

	public void setConnectors(HashMap<EVMChain, EVMBlockChainConnector> connectors) {
		this.connectors = connectors;
	}

	public BlockchainType getChainType() {
		return chainType;
	}

	public void setChainType(BlockchainType chainType) {
		this.chainType = chainType;
	}

}
