package crypto.forestfish.objects.avm.connector;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import crypto.forestfish.enums.BlockchainType;
import crypto.forestfish.enums.avm.AVMChain;
import crypto.forestfish.objects.avm.model.chain.AVMChainInfo;
import crypto.forestfish.utils.AVMUtils;
import crypto.forestfish.utils.SystemUtils;

public class AVMBlockChainUltraConnector {

	private static final Logger LOGGER = LoggerFactory.getLogger(AVMBlockChainUltraConnector.class);

	private HashMap<AVMChain, AVMBlockChainConnector> connectors = new HashMap<>();
	private BlockchainType chainType;

	public AVMBlockChainUltraConnector(BlockchainType _chainType) {
		super();
		
		this.chainType = _chainType;
		
		//Initiate an rpc connection to every public blockchain we known of
		for (AVMChain chain: AVMChain.values()) {
			AVMChainInfo chainInfo = AVMUtils.getAVMChainInfo(chain);
			if (chainInfo == null) {
				LOGGER.error("No chainInfo for chain " + chain + "?");
				SystemUtils.halt();
			}
			if (BlockchainType.valueOf(chainInfo.getType()) == chainType) {
				AVMBlockChainConnector connector = new AVMBlockChainConnector(chain, true);
				connectors.put(chain, connector);
			}
		}

	}

	public AVMBlockChainUltraConnector(BlockchainType _chainType, HashMap<String, Boolean> _chainlimit) {
		super();
		
		this.chainType = _chainType;

		if (_chainlimit.keySet().isEmpty()) {
			LOGGER.error("Empty chain limitation passed as argument");
			SystemUtils.halt();
		}

		//Initiate an rpc connection to every public blockchain we known of
		for (AVMChain chain: AVMChain.values()) {
			if (null != _chainlimit.get(chain.toString())) {
				AVMChainInfo chainInfo = AVMUtils.getAVMChainInfo(chain);
				if (BlockchainType.valueOf(chainInfo.getType()) == chainType) {
					AVMBlockChainConnector connector = new AVMBlockChainConnector(chain, true);
					connectors.put(chain, connector);
				}
			}
		}

	}

	public HashMap<AVMChain, AVMBlockChainConnector> getConnectors() {
		return connectors;
	}

	public void setConnectors(HashMap<AVMChain, AVMBlockChainConnector> connectors) {
		this.connectors = connectors;
	}

	public BlockchainType getChainType() {
		return chainType;
	}

	public void setChainType(BlockchainType chainType) {
		this.chainType = chainType;
	}

}
