package crypto.forestfish.objects.embedded.evm;

import java.util.ArrayList;
import java.util.HashMap;

import crypto.forestfish.enums.BlockchainType;
import crypto.forestfish.enums.TokenCategory;
import crypto.forestfish.enums.evm.ArbitrumONEERC20Token;
import crypto.forestfish.enums.evm.ArbitrumONEERC721Token;
import crypto.forestfish.enums.evm.AvaxERC20Token;
import crypto.forestfish.enums.evm.BSCBEP20Token;
import crypto.forestfish.enums.evm.BSCERC721Token;
import crypto.forestfish.enums.evm.BaseERC20Token;
import crypto.forestfish.enums.evm.BitkubERC721Token;
import crypto.forestfish.enums.evm.BitkubKAP20Token;
import crypto.forestfish.enums.evm.BoraChainKIP7Token;
import crypto.forestfish.enums.evm.CeloERC20Token;
import crypto.forestfish.enums.evm.ConfluxERC20Token;
import crypto.forestfish.enums.evm.ConfluxTestnetERC20Token;
import crypto.forestfish.enums.evm.CoreERC20Token;
import crypto.forestfish.enums.evm.EVMChain;
import crypto.forestfish.enums.evm.EVMPriceMechanism;
import crypto.forestfish.enums.evm.EthereumERC20Token;
import crypto.forestfish.enums.evm.EthereumERC721Token;
import crypto.forestfish.enums.evm.FantomERC20Token;
import crypto.forestfish.enums.evm.GnosisERC20Token;
import crypto.forestfish.enums.evm.GoerliERC20Token;
import crypto.forestfish.enums.evm.GoerliERC721Token;
import crypto.forestfish.enums.evm.KavaTestERC20Token;
import crypto.forestfish.enums.evm.KlaytnKIP7Token;
import crypto.forestfish.enums.evm.LineaERC20Token;
import crypto.forestfish.enums.evm.LineaERC721Token;
import crypto.forestfish.enums.evm.MantaERC20Token;
import crypto.forestfish.enums.evm.MantleERC20Token;
import crypto.forestfish.enums.evm.MantleERC721Token;
import crypto.forestfish.enums.evm.MantleTestnetERC20Token;
import crypto.forestfish.enums.evm.MetisERC20Token;
import crypto.forestfish.enums.evm.MilkomedaA1ERC20Token;
import crypto.forestfish.enums.evm.MilkomedaC1ERC20Token;
import crypto.forestfish.enums.evm.MilkomedaC1ERC721Token;
import crypto.forestfish.enums.evm.MoonbeamERC20Token;
import crypto.forestfish.enums.evm.MoonbeamERC721Token;
import crypto.forestfish.enums.evm.MumbaiERC20Token;
import crypto.forestfish.enums.evm.OptimismERC20Token;
import crypto.forestfish.enums.evm.PolygonERC1155Token;
import crypto.forestfish.enums.evm.PolygonERC20Token;
import crypto.forestfish.enums.evm.PolygonERC721Token;
import crypto.forestfish.enums.evm.PulsechainERC20Token;
import crypto.forestfish.enums.evm.ScrollERC20Token;
import crypto.forestfish.enums.evm.WemixERC20Token;
import crypto.forestfish.enums.evm.ZKEVMERC20Token;
import crypto.forestfish.enums.evm.ZKFairERC20Token;
import crypto.forestfish.enums.evm.ZKSyncEraERC721Token;
import crypto.forestfish.enums.evm.ZkSyncERC20Token;
import crypto.forestfish.objects.evm.model.chain.EVMChainIndex;
import crypto.forestfish.objects.evm.model.chain.EVMChainInfo;
import crypto.forestfish.objects.evm.model.chain.EVMCurrency;
import crypto.forestfish.objects.evm.model.erc20.ERC20TokenIndex;
import crypto.forestfish.objects.evm.model.erc20.EVMERC20TokenInfo;
import crypto.forestfish.objects.evm.model.nft.EVMERC1155TokenInfo;
import crypto.forestfish.objects.evm.model.nft.EVMERC721TokenInfo;
import crypto.forestfish.objects.evm.model.nft.EVMNFTIndex;
import crypto.forestfish.utils.JSONUtils;

public class BlockchainDetailsEVM {

	public static EVMChainIndex generateEVMChainIndex() {
		HashMap<EVMChain, EVMChainInfo> networks = new HashMap<>();
		HashMap<EVMChain, EVMChainInfo> mainnets = BlockchainDetailsMainEVM.getMainnetEVMNetworks();
		HashMap<EVMChain, EVMChainInfo> testnets = BlockchainDetailsTestEVM.getTestnetEVMNetworks();
		networks.putAll(mainnets);
		networks.putAll(testnets);
		return new EVMChainIndex(networks);
	}

	public static String generateEVMChainIndexJSON() {
		EVMChainIndex idx = generateEVMChainIndex();
		return JSONUtils.createJSONFromPOJO(idx);
	}

}
