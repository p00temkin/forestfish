package crypto.forestfish.utils;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import crypto.forestfish.objects.evm.moralis.MoralisERC20ContractPriceInfo;
import crypto.forestfish.enums.evm.EVMChain;
import crypto.forestfish.objects.evm.moralis.MoralisERC20ContractMetaInfo;

public class MoralisUtils {

	private static final Logger LOGGER = LoggerFactory.getLogger(MoralisUtils.class);

	public static String mapEVMChainToMoralisChainAlias(EVMChain chain) {
		String chainAlias;
		switch (chain) {
		case ETH:  chainAlias = "eth";
		break;
		case POLYGON:  chainAlias = "polygon";
		break;
		case ROPSTENTEST:  chainAlias = "ropsten";
		break;
		case RINKEBYTEST:  chainAlias = "rinkeby";
		break;
		case GOERLITEST:  chainAlias = "goerli";
		break;
		case KOVANTEST:  chainAlias = "kovan";
		break;
		case MUMBAITEST:  chainAlias = "mumbai";
		break;
		case BSC:  chainAlias = "bsc";
		break;
		case AVAX:  chainAlias = "avalanche";
		break;
		case FANTOM: chainAlias = "fantom";
		break;
		case CRONOS: chainAlias = "cronos";
		break;
		default: chainAlias = null;
		LOGGER.warn("Unable to find Moralis mapping for chain " + chain);
		break;
		}
		return chainAlias;
	}

	public static MoralisERC20ContractMetaInfo getMoralisERC20ContractInfo(EVMChain chain, String erc20_address, String moralis_api_key) {
		final String baseURL = "https://deep-index.moralis.io/api/v2/erc20/metadata?";
		final String moralis_api_key_header = "X-API-Key";
		try {
			String chainMoralisAlias = MoralisUtils.mapEVMChainToMoralisChainAlias(chain);
			if (null != chainMoralisAlias) {
				String requestSTR = baseURL + 
						"chain=" + chainMoralisAlias + 
						"&addresses=" + erc20_address;
				String res = HttpRequestUtils.getBodyUsingGETUrlRequestWithCustomHeader(requestSTR, moralis_api_key_header, moralis_api_key);
				ArrayList<MoralisERC20ContractMetaInfo> repArr = JSONUtils.createFromMoralisERC20ContractQueryFromJSON(res);
				if (repArr.size() == 0) {
					return null;
				} else if (repArr.size() == 1) {
					return repArr.get(0);
				} else if (repArr.size() > 1) {
					return null;
				}
			}
		} catch (Exception e) {
			LOGGER.warn("Exception: " + e.getMessage());
		}
		return null;
	}

	public static MoralisERC20ContractPriceInfo getMoralisERC20ContractPriceInfo(EVMChain chain, String erc20_address, String moralis_api_key) {
		final String baseURL = "https://deep-index.moralis.io/api/v2/erc20/" + erc20_address + "/price?";
		final String moralis_api_key_header = "X-API-Key";
		try {
			String chainMoralisAlias = MoralisUtils.mapEVMChainToMoralisChainAlias(chain);
			if (null != chainMoralisAlias) {
				String requestSTR = baseURL + 
						"chain=" + chainMoralisAlias;
				String res = HttpRequestUtils.getBodyUsingGETUrlRequestWithCustomHeader(requestSTR, moralis_api_key_header, moralis_api_key);
				MoralisERC20ContractPriceInfo rep = JSONUtils.createPOJOFromJSON(res, MoralisERC20ContractPriceInfo.class);
				return rep;
			}
		} catch (Exception e) {
			LOGGER.warn("Exception: " + e.getMessage());
		}
		return null;
	}

}
