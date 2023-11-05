package crypto.forestfish.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import crypto.forestfish.enums.evm.PolygonERC20Token;

public class ContractMapper {

	private static final Logger LOGGER = LoggerFactory.getLogger(ContractMapper.class);

	public static String resolveContractAddressFor(PolygonERC20Token token) {
		if (PolygonERC20Token.GHST == token) return "0x385eeac5cb85a38a9a07a70c73e0a3271cfb54a7";

		LOGGER.error("Unable to resolve contract address for token " + token.toString());
		SystemUtils.halt();
		return null;
	}
}
