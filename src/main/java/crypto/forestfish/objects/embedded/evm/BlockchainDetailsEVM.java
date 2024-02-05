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

	@SuppressWarnings("serial")
	public static ERC20TokenIndex generateAvaxTokenIndex() {

		HashMap<String, EVMERC20TokenInfo> tokens = new HashMap<>();

		// stg
		EVMERC20TokenInfo stg = new EVMERC20TokenInfo(
				AvaxERC20Token.STG.toString(), 
				"0x2f6f07cdcf3588944bf4c42ac74ff24bf56e7590",
				"StarGate token",
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.AVAX.toString(),
				new ArrayList<String>() {{
					this.add("https://snowtrace.io/address/0x2f6f07cdcf3588944bf4c42ac74ff24bf56e7590");
					this.add("https://www.coingecko.com/en/coins/stargate-finance");
				}});
		tokens.put(AvaxERC20Token.STG.toString(), stg);

		// png
		EVMERC20TokenInfo png = new EVMERC20TokenInfo(
				AvaxERC20Token.PNG.toString(), 
				"0x60781c2586d68229fde47564546784ab3faca982",
				"PNG token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.AVAX.toString(),
				new ArrayList<String>() {{
					this.add("https://snowtrace.io/address/0x60781c2586d68229fde47564546784ab3faca982");
					this.add("https://www.coingecko.com/en/coins/pangolin");
				}});
		tokens.put(AvaxERC20Token.PNG.toString(), png);

		// usdc
		EVMERC20TokenInfo usdc = new EVMERC20TokenInfo(
				AvaxERC20Token.USDC.toString(), 
				"0xb97ef9ef8734c71904d8002f8b6bc66dd9c48a6e",
				"USDC stablecoin token", 
				6,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.AVAX.toString(),
				new ArrayList<String>() {{
					this.add("https://snowtrace.io/address/0xb97ef9ef8734c71904d8002f8b6bc66dd9c48a6e");
					this.add("https://www.coingecko.com/en/coins/usd-coin");
				}});
		tokens.put(AvaxERC20Token.USDC.toString(), usdc);

		// dai
		EVMERC20TokenInfo dai = new EVMERC20TokenInfo(
				AvaxERC20Token.DAI.toString(), 
				"0xd586e7f844cea2f87f50152665bcbc2c279d8d70",
				"DAI stablecoin token", 
				18,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.AVAX.toString(),
				new ArrayList<String>() {{
					this.add("https://snowtrace.io/address/0xd586e7f844cea2f87f50152665bcbc2c279d8d70");
					this.add("https://www.coingecko.com/en/coins/dai");
				}});
		tokens.put(AvaxERC20Token.DAI.toString(), dai);

		// usdt
		EVMERC20TokenInfo usdt = new EVMERC20TokenInfo(
				AvaxERC20Token.USDT.toString(), 
				"0x9702230a8ea53601f5cd2dc00fdbc13d4df4a8c7",
				"Tether stablecoin token", 
				18,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.AVAX.toString(),
				new ArrayList<String>() {{
					this.add("https://snowtrace.io/address/0x9702230a8ea53601f5cd2dc00fdbc13d4df4a8c7");
					this.add("https://www.coingecko.com/en/coins/tether");
				}});
		tokens.put(AvaxERC20Token.USDT.toString(), usdt);

		return new ERC20TokenIndex(tokens);
	}

	@SuppressWarnings("serial")
	public static EVMNFTIndex generateBitkubNFTIndex() {
		HashMap<String, EVMERC721TokenInfo> erc721tokens = new HashMap<>();
		HashMap<String, EVMERC1155TokenInfo> erc1155tokens = new HashMap<>();

		// mmv item
		EVMERC721TokenInfo mmv_item = new EVMERC721TokenInfo(
				BitkubERC721Token.MMV_ITEM.toString(), 
				"0xd08ac40b3a0a7fb20b026a3b6cd5d7cfadc3d6f5",
				0L,
				"Morning Moon Village game item", 
				TokenCategory.GAMING.toString(),
				EVMChain.BITKUB.toString(),
				new ArrayList<String>() {{
					this.add("https://www.bkcscan.com/address/0xd08ac40b3a0a7fb20b026a3b6cd5d7cfadc3d6f5");
					this.add("https://morningmoonvillage.com/");
					this.add("https://mmv.megaland.io/");
				}});
		erc721tokens.put(BitkubERC721Token.MMV_ITEM.toString(), mmv_item);	

		// sandx
		EVMERC721TokenInfo sandx = new EVMERC721TokenInfo(
				BitkubERC721Token.SANDX.toString(), 
				"0x998c4a4f5231b10ad867bd5d99fa181495f34cd8",
				0L,
				"SandX NFT", 
				TokenCategory.NFT.toString(),
				EVMChain.BITKUB.toString(),
				new ArrayList<String>() {{
					this.add("https://www.bkcscan.com/address/0x998c4a4f5231b10ad867bd5d99fa181495f34cd8");
					this.add("https://www.megaland.io/");

				}});
		erc721tokens.put(BitkubERC721Token.SANDX.toString(), sandx);

		return new EVMNFTIndex(erc721tokens, erc1155tokens);
	}

	@SuppressWarnings("serial")
	public static ERC20TokenIndex generateZKFairTokenIndex() {

		HashMap<String, EVMERC20TokenInfo> tokens = new HashMap<>();

		// zkfair
		EVMERC20TokenInfo zkfair = new EVMERC20TokenInfo(
				ZKFairERC20Token.ZKFAIR.toString(), 
				"0x1cD3E2A23C45A690a18Ed93FD1412543f464158F",
				"ZKFair token", 
				18,
				TokenCategory.DAO.toString(),
				EVMChain.ZKFAIR.toString(),
				new ArrayList<String>() {{
					this.add("https://scan.zkfair.io/address/0x1cD3E2A23C45A690a18Ed93FD1412543f464158F");
				}});
		tokens.put(ZKFairERC20Token.ZKFAIR.toString(), zkfair);

		return new ERC20TokenIndex(tokens);
	}

	@SuppressWarnings("serial")
	public static ERC20TokenIndex generateBorachainTokenIndex() {

		HashMap<String, EVMERC20TokenInfo> tokens = new HashMap<>();

		// tBORA
		EVMERC20TokenInfo tbora = new EVMERC20TokenInfo(
				BoraChainKIP7Token.tBORA.toString(), 
				"0x797115bcdbD85DC865222724eD67d473CE168962",
				"tBORA token", 
				18,
				TokenCategory.GASCURRENCY.toString(),
				EVMChain.BORACHAIN.toString(),
				new ArrayList<String>() {{
					this.add("https://scope.boraportal.com/token/0x797115bcdbd85dc865222724ed67d473ce168962");
				}});
		tokens.put(BoraChainKIP7Token.tBORA.toString(), tbora);

		// bluesalt
		EVMERC20TokenInfo bluesalt = new EVMERC20TokenInfo(
				BoraChainKIP7Token.BSLT.toString(), 
				"0xcfdbf6a1f765c295d8d557e841c1304019318525",
				"ArcheWorld Blue Salt game token", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.BORACHAIN.toString(),
				new ArrayList<String>() {{
					this.add("https://scope.boraportal.com/address/0xcFdbf6a1f765C295d8D557E841C1304019318525");
				}});
		tokens.put(BoraChainKIP7Token.BSLT.toString(), bluesalt);

		// test
		EVMERC20TokenInfo test = new EVMERC20TokenInfo(
				BoraChainKIP7Token.TEST.toString(), 
				"0x7769cf946c011BB3A22d20ba6bF7f0bC419c722f",
				//"0x7769cf946c011BB3A22d20ba6bF7f0bC419c722f", // BIRDIE token :)
				"TEST token", 
				18,
				TokenCategory.TEST.toString(),
				EVMChain.KLAYTN.toString(),
				new ArrayList<String>() {{
					this.add("https://scope.boraportal.com/token/0x7769cf946c011BB3A22d20ba6bF7f0bC419c722f");
				}});
		tokens.put(BoraChainKIP7Token.TEST.toString(), test);

		return new ERC20TokenIndex(tokens);
	}

	@SuppressWarnings("serial")
	public static EVMNFTIndex generateZKSyncEraNFTIndex() {
		HashMap<String, EVMERC721TokenInfo> erc721tokens = new HashMap<>();
		HashMap<String, EVMERC1155TokenInfo> erc1155tokens = new HashMap<>();

		// zkape
		EVMERC721TokenInfo zkape = new EVMERC721TokenInfo(
				ZKSyncEraERC721Token.ZKAPE.toString(), 
				"0x5e6f0f1d604d7300c10933aa8834afa034d448ea",
				0L,
				"ZKSyncEra Ape", 
				TokenCategory.SOCIAL.toString(),
				EVMChain.ZKSYNCERA.toString(),
				new ArrayList<String>() {{
					this.add("https://explorer.zksync.io/address/0x5e6f0f1d604d7300c10933aa8834afa034d448ea");
					this.add("https://zkape.io");
					this.add("https://mintsquare.io/collection/zksync/0x5e6f0f1d604d7300c10933aa8834afa034d448ea");
				}});
		erc721tokens.put(ZKSyncEraERC721Token.ZKAPE.toString(), zkape);

		// eranameservice
		EVMERC721TokenInfo eranameservice = new EVMERC721TokenInfo(
				ZKSyncEraERC721Token.ERANAMESERVICE.toString(), 
				"0x935442AF47F3dc1c11F006D551E13769F12eab13",
				0L,
				"ERA Name service", 
				TokenCategory.NAMESERVICE.toString(),
				EVMChain.ZKSYNCERA.toString(),
				new ArrayList<String>() {{
					this.add("https://explorer.zksync.io/address/0x935442AF47F3dc1c11F006D551E13769F12eab13");
					this.add("https://era.name");
				}});
		erc721tokens.put(ZKSyncEraERC721Token.ERANAMESERVICE.toString(), eranameservice);


		return new EVMNFTIndex(erc721tokens, erc1155tokens);
	}

	@SuppressWarnings("serial")
	public static EVMNFTIndex generateBSCNFTIndex() {
		HashMap<String, EVMERC721TokenInfo> erc721tokens = new HashMap<>();
		HashMap<String, EVMERC1155TokenInfo> erc1155tokens = new HashMap<>();

		// outerringmmoweapon
		EVMERC721TokenInfo outerringmmo_weapon = new EVMERC721TokenInfo(
				BSCERC721Token.OUTERRINGMMO_WEAPON.toString(), 
				"0xeb1aca4e9aa3448b7fecb2b555301325b5931ad9",
				0L,
				"Outer Ring MMO Weapon", 
				TokenCategory.GAMING.toString(),
				EVMChain.BSC.toString(),
				new ArrayList<String>() {{
					this.add("https://bscscan.com/token/0xeb1aca4e9aa3448b7fecb2b555301325b5931ad9");
					this.add("https://babylons.io/outerringofficial");
				}});
		erc721tokens.put(BSCERC721Token.OUTERRINGMMO_WEAPON.toString(), outerringmmo_weapon);

		// outerringmmolandvehicle
		EVMERC721TokenInfo outerringmmolandvehicle = new EVMERC721TokenInfo(
				BSCERC721Token.OUTERRINGMMO_LANDVEH.toString(), 
				"0x21d7d56350fcf7470e4ac38bb2f32c1461a73d8c",
				0L,
				"Outer Ring MMO Land Vehicle", 
				TokenCategory.GAMING.toString(),
				EVMChain.BSC.toString(),
				new ArrayList<String>() {{
					this.add("https://bscscan.com/token/0x21d7d56350fcf7470e4ac38bb2f32c1461a73d8c");
					this.add("https://babylons.io/outerringofficial");
				}});
		erc721tokens.put(BSCERC721Token.OUTERRINGMMO_LANDVEH.toString(), outerringmmolandvehicle);

		// outerringmmospacevehicle
		EVMERC721TokenInfo outerringmmospacevehicle = new EVMERC721TokenInfo(
				BSCERC721Token.OUTERRINGMMO_SPACEVEH.toString(), 
				"0xceaac6759038d4d3b8791683b27b1021efa57003",
				0L,
				"Outer Ring MMO Space Vehicle", 
				TokenCategory.GAMING.toString(),
				EVMChain.BSC.toString(),
				new ArrayList<String>() {{
					this.add("https://bscscan.com/token/0xceaac6759038d4d3b8791683b27b1021efa57003");
					this.add("https://babylons.io/outerringofficial");
				}});
		erc721tokens.put(BSCERC721Token.OUTERRINGMMO_SPACEVEH.toString(), outerringmmospacevehicle);

		// outerringmmoarmor
		EVMERC721TokenInfo outerringmmoarmor = new EVMERC721TokenInfo(
				BSCERC721Token.OUTERRINGMMO_ARMOR.toString(), 
				"0x0b36f379d7b3b4588f8b8e7e65091b2c44fa6dde",
				0L,
				"Outer Ring MMO Armor", 
				TokenCategory.GAMING.toString(),
				EVMChain.BSC.toString(),
				new ArrayList<String>() {{
					this.add("https://bscscan.com/token/0x0b36f379d7b3b4588f8b8e7e65091b2c44fa6dde");
					this.add("https://babylons.io/outerringofficial");
				}});
		erc721tokens.put(BSCERC721Token.OUTERRINGMMO_ARMOR.toString(), outerringmmoarmor);

		// outerringmmoexocredits
		EVMERC721TokenInfo outerringmmoexocredits = new EVMERC721TokenInfo(
				BSCERC721Token.OUTERRINGMMO_EXOCRED.toString(), 
				"0x3fb6e0dd0eefff9615f186a6bb3a66a396ed0a58",
				0L,
				"Outer Ring MMO Exocredits", 
				TokenCategory.GAMING.toString(),
				EVMChain.BSC.toString(),
				new ArrayList<String>() {{
					this.add("https://bscscan.com/address/0x3fb6e0dd0eefff9615f186a6bb3a66a396ed0a58");
					this.add("https://babylons.io/outerringofficial");
				}});
		erc721tokens.put(BSCERC721Token.OUTERRINGMMO_EXOCRED.toString(), outerringmmoexocredits);

		// dreamcard
		EVMERC721TokenInfo dreamcard = new EVMERC721TokenInfo(
				BSCERC721Token.DREAMCARD.toString(), 
				"0xe6965b4f189dbdb2bd65e60abaeb531b6fe9580b",
				0L,
				"X World Games Dreamcard", 
				TokenCategory.GAMING.toString(),
				EVMChain.BSC.toString(),
				new ArrayList<String>() {{
					this.add("https://bscscan.com/address/0xe6965b4f189dbdb2bd65e60abaeb531b6fe9580b");
					this.add("https://babylons.io/outerringofficial");
				}},
				new ArrayList<String>() {{
					this.add(EVMChain.BSC.toString() + ":" + BSCBEP20Token.XWG.toString());
				}});
		erc721tokens.put(BSCERC721Token.DREAMCARD.toString(), dreamcard);

		// stellafantasy
		EVMERC721TokenInfo stellafantasy = new EVMERC721TokenInfo(
				BSCERC721Token.STELLAFANTASY_ASSET.toString(), 
				"0x80461f88de22b2363113226f0749a7a59cc2225a",
				0L,
				"Stella Fantasy Asset", 
				TokenCategory.GAMING.toString(),
				EVMChain.BSC.toString(),
				new ArrayList<String>() {{
					this.add("https://bscscan.com/token/0x80461f88de22b2363113226f0749a7a59cc2225a");
					this.add("https://www.stellafantasy.io/");
				}},
				new ArrayList<String>() {{
					this.add(EVMChain.BSC.toString() + ":" + BSCBEP20Token.SFTY.toString());
				}});
		erc721tokens.put(BSCERC721Token.STELLAFANTASY_ASSET.toString(), stellafantasy);

		return new EVMNFTIndex(erc721tokens, erc1155tokens);
	}

	@SuppressWarnings("serial")
	public static ERC20TokenIndex generateBSCTokenIndex() {

		HashMap<String, EVMERC20TokenInfo> tokens = new HashMap<>();

		// metis
		EVMERC20TokenInfo metis = new EVMERC20TokenInfo(
				BSCBEP20Token.METIS.toString(), 
				"0xe552fb52a4f19e44ef5a967632dbc320b0820639",
				"METIS token on BSC", 
				18,
				TokenCategory.GASCURRENCY.toString(),
				EVMChain.BSC.toString(),
				new ArrayList<String>() {{
					this.add("https://bscscan.com/address/0xe552fb52a4f19e44ef5a967632dbc320b0820639");
					this.add("https://www.coingecko.com/en/coins/metis-token");
				}});
		tokens.put(BSCBEP20Token.METIS.toString(), metis);

		// sups
		EVMERC20TokenInfo sups = new EVMERC20TokenInfo(
				BSCBEP20Token.SUPS.toString(), 
				"0xc99cfaa8f5d9bd9050182f29b83cc9888c5846c4",
				"Supremacy game token", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.BSC.toString(),
				new ArrayList<String>() {{
					this.add("https://bscscan.com/address/0xc99cfaa8f5d9bd9050182f29b83cc9888c5846c4");
					this.add("https://www.coingecko.com/en/coins/supremacy");
				}});
		tokens.put(BSCBEP20Token.SUPS.toString(), sups);

		// mobox
		EVMERC20TokenInfo mobox = new EVMERC20TokenInfo(
				BSCBEP20Token.MOBOX.toString(), 
				"0x3203c9e46ca618c8c1ce5dc67e7e9d75f5da2377",
				"MOBOX game token", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.BSC.toString(),
				new ArrayList<String>() {{
					this.add("https://bscscan.com/address/0x3203c9e46ca618c8c1ce5dc67e7e9d75f5da2377");
					this.add("https://www.coingecko.com/en/coins/mobox");
				}});
		tokens.put(BSCBEP20Token.MOBOX.toString(), mobox);

		// sck
		EVMERC20TokenInfo sck = new EVMERC20TokenInfo(
				BSCBEP20Token.SCK.toString(), 
				"0x227a3ef4d41d0215123f3197faa087bf71d2236a",
				"Space Corsair Key", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.BSC.toString(),
				new ArrayList<String>() {{
					this.add("https://bscscan.com/address/0x227a3ef4d41d0215123f3197faa087bf71d2236a");
					this.add("https://www.coingecko.com/en/coins/space-corsair-key");
				}});
		tokens.put(BSCBEP20Token.SCK.toString(), sck);

		// tron
		EVMERC20TokenInfo tron = new EVMERC20TokenInfo(
				BSCBEP20Token.TRON.toString(), 
				"0x85eac5ac2f758618dfa09bdbe0cf174e7d574d5b",
				"TRON TRX token", 
				18,
				TokenCategory.SCAM.toString(),
				EVMChain.BSC.toString(),
				new ArrayList<String>() {{
					this.add("https://coinmarketcap.com/currencies/tron/");
				}});
		tokens.put(BSCBEP20Token.TRON.toString(), tron);

		// catgirl
		EVMERC20TokenInfo catgirl = new EVMERC20TokenInfo(
				BSCBEP20Token.CATGIRL.toString(), 
				"0x79ebc9a2ce02277a4b5b3a768b1c0a4ed75bd936",
				"Catgirl NFT Token", 
				18,
				TokenCategory.NFT.toString(),
				EVMChain.BSC.toString(),
				new ArrayList<String>() {{
					this.add("https://bscscan.com/address/0x79ebc9a2ce02277a4b5b3a768b1c0a4ed75bd936");
					this.add("https://www.coingecko.com/en/coins/catgirl");
				}});
		tokens.put(BSCBEP20Token.CATGIRL.toString(), catgirl);

		// gq
		EVMERC20TokenInfo gq = new EVMERC20TokenInfo(
				BSCBEP20Token.GQ.toString(), 
				"0xf700d4c708c2be1463e355f337603183d20e0808",
				"Outer Ring MMO Game Token", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.BSC.toString(),
				new ArrayList<String>() {{
					this.add("https://bscscan.com/address/0xf700d4c708c2be1463e355f337603183d20e0808");
					this.add("https://www.coingecko.com/en/coins/outer-ring");
				}});
		tokens.put(BSCBEP20Token.GQ.toString(), gq);

		// plu
		EVMERC20TokenInfo plu = new EVMERC20TokenInfo(
				BSCBEP20Token.PLU.toString(), 
				"0x07958be5d12365db62a6535d0a88105944a2e81e",
				"Outer Ring MMO Plutonium Token", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.BSC.toString(),
				new ArrayList<String>() {{
					this.add("https://bscscan.com/token/0x07958be5d12365db62a6535d0a88105944a2e81e");
				}});
		tokens.put(BSCBEP20Token.PLU.toString(), plu);

		// vanadium
		EVMERC20TokenInfo vanadium = new EVMERC20TokenInfo(
				BSCBEP20Token.VAN.toString(), 
				"0xd3dbf84f7aed90d5f56e8d7cab2f43004e9ef6a6",
				"Outer Ring MMO Vanadium Token", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.BSC.toString(),
				new ArrayList<String>() {{
					this.add("https://bscscan.com/token/0xd3dbf84f7aed90d5f56e8d7cab2f43004e9ef6a6");
				}});
		tokens.put(BSCBEP20Token.VAN.toString(), vanadium);

		// carbon
		EVMERC20TokenInfo carbon = new EVMERC20TokenInfo(
				BSCBEP20Token.CAR.toString(), 
				"0x253b7a24003684f7b4fe87e531a017c7382a3894",
				"Outer Ring MMO Carbon Token", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.BSC.toString(),
				new ArrayList<String>() {{
					this.add("https://bscscan.com/token/0x253b7a24003684f7b4fe87e531a017c7382a3894");
				}});
		tokens.put(BSCBEP20Token.CAR.toString(), carbon);

		// nickel
		EVMERC20TokenInfo nickel = new EVMERC20TokenInfo(
				BSCBEP20Token.NIC.toString(), 
				"0xf9a71cba51e260e184a72d9edf888d3f99f3bac1",
				"Outer Ring MMO Nickel Token", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.BSC.toString(),
				new ArrayList<String>() {{
					this.add("https://bscscan.com/token/0xf9a71cba51e260e184a72d9edf888d3f99f3bac1");
				}});
		tokens.put(BSCBEP20Token.NIC.toString(), nickel);

		// methane
		EVMERC20TokenInfo methane = new EVMERC20TokenInfo(
				BSCBEP20Token.MET.toString(), 
				"0x03697caf2e5458c7c2a8d9f8818079c2ae72f353",
				"Outer Ring MMO Methane Token", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.BSC.toString(),
				new ArrayList<String>() {{
					this.add("https://bscscan.com/token/0x03697caf2e5458c7c2a8d9f8818079c2ae72f353");
				}});
		tokens.put(BSCBEP20Token.MET.toString(), methane);

		// acetylene 
		EVMERC20TokenInfo acetylene = new EVMERC20TokenInfo(
				BSCBEP20Token.ACE.toString(), 
				"0x6bf6c2b429421a55d90a02c56b2d8bffbc636039",
				"Outer Ring MMO Acetylene Token", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.BSC.toString(),
				new ArrayList<String>() {{
					this.add("https://bscscan.com/token/0x6bf6c2b429421a55d90a02c56b2d8bffbc636039");
				}});
		tokens.put(BSCBEP20Token.ACE.toString(), acetylene);

		// argon 
		EVMERC20TokenInfo argon = new EVMERC20TokenInfo(
				BSCBEP20Token.ARG.toString(), 
				"0x0efcf1737b81ce89325b17eafae2686a8afe8bd4",
				"Outer Ring MMO Acetylene Token", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.BSC.toString(),
				new ArrayList<String>() {{
					this.add("https://bscscan.com/token/0x0efcf1737b81ce89325b17eafae2686a8afe8bd4");
				}});
		tokens.put(BSCBEP20Token.ARG.toString(), argon);

		// copper 
		EVMERC20TokenInfo copper = new EVMERC20TokenInfo(
				BSCBEP20Token.COP.toString(), 
				"0x892f23e32b82ef0d5394cf33dcd4dff7f4b274b0",
				"Outer Ring MMO Copper Token", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.BSC.toString(),
				new ArrayList<String>() {{
					this.add("https://bscscan.com/token/0x892f23e32b82ef0d5394cf33dcd4dff7f4b274b0");
				}});
		tokens.put(BSCBEP20Token.COP.toString(), copper);

		// iron 
		EVMERC20TokenInfo iron = new EVMERC20TokenInfo(
				BSCBEP20Token.IRON.toString(), 
				"0xbd1945cd85a2be93a6475381c9f5edf19407a921",
				"Outer Ring MMO Iron Token", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.BSC.toString(),
				new ArrayList<String>() {{
					this.add("https://bscscan.com/token/0xbd1945cd85a2be93a6475381c9f5edf19407a921");
				}});
		tokens.put(BSCBEP20Token.IRON.toString(), iron);

		// venus
		EVMERC20TokenInfo venus = new EVMERC20TokenInfo(
				BSCBEP20Token.XVS.toString(), 
				"0xcf6bb5389c92bdda8a3747ddb454cb7a64626c63",
				"Venus Token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.BSC.toString(),
				new ArrayList<String>() {{
					this.add("https://bscscan.com/address/0xcf6bb5389c92bdda8a3747ddb454cb7a64626c63");
					this.add("https://www.coingecko.com/en/coins/venus");
				}});
		tokens.put(BSCBEP20Token.XVS.toString(), venus);

		// chmb
		EVMERC20TokenInfo chmb = new EVMERC20TokenInfo(
				BSCBEP20Token.CHMB.toString(), 
				"0x5492ef6aeeba1a3896357359ef039a8b11621b45",
				"Chumbi Valley Game Token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.BSC.toString(),
				new ArrayList<String>() {{
					this.add("https://bscscan.com/token/0x5492ef6aeeba1a3896357359ef039a8b11621b45");
					this.add("https://www.coingecko.com/en/coins/chumbai-valley");
				}});
		tokens.put(BSCBEP20Token.CHMB.toString(), chmb);

		// xwg
		EVMERC20TokenInfo xwg = new EVMERC20TokenInfo(
				BSCBEP20Token.XWG.toString(), 
				"0x6b23c89196deb721e6fd9726e6c76e4810a464bc",
				"X World Games Token", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.BSC.toString(),
				new ArrayList<String>() {{
					this.add("https://bscscan.com/address/0x6b23c89196deb721e6fd9726e6c76e4810a464bc");
					this.add("https://www.coingecko.com/en/coins/x-world-games");
				}});
		tokens.put(BSCBEP20Token.XWG.toString(), xwg);

		// nftart
		EVMERC20TokenInfo nftart = new EVMERC20TokenInfo(
				BSCBEP20Token.NFTART.toString(), 
				"0xf7844cb890f4c339c497aeab599abdc3c874b67a",
				"NFT Art Token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.BSC.toString(),
				new ArrayList<String>() {{
					this.add("https://bscscan.com/address/0xf7844cb890f4c339c497aeab599abdc3c874b67a");
					this.add("https://www.coingecko.com/en/coins/nft-art-finance");
				}});
		tokens.put(BSCBEP20Token.NFTART.toString(), nftart);

		// vikingswap
		EVMERC20TokenInfo vikingswap = new EVMERC20TokenInfo(
				BSCBEP20Token.VIKINGSWAP.toString(), 
				"0x896ede222d3f7f3414e136a2791bdb08aaa25ce0",
				"Vikingswap Token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.BSC.toString(),
				new ArrayList<String>() {{
					this.add("https://bscscan.com/address/0x896ede222d3f7f3414e136a2791bdb08aaa25ce0");
					this.add("https://www.coingecko.com/en/coins/viking-swap");
				}});
		tokens.put(BSCBEP20Token.VIKINGSWAP.toString(), vikingswap);

		// babycake
		EVMERC20TokenInfo babycake = new EVMERC20TokenInfo(
				BSCBEP20Token.BABYCAKE.toString(), 
				"0xdb8d30b74bf098af214e862c90e647bbb1fcc58c",
				"BABYCAKE DEFI reflection Token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.BSC.toString(),
				new ArrayList<String>() {{
					this.add("https://bscscan.com/token/0xdb8d30b74bf098af214e862c90e647bbb1fcc58c");
					this.add("https://www.coingecko.com/en/coins/baby-cake");
				}});
		tokens.put(BSCBEP20Token.BABYCAKE.toString(), babycake);

		// cake
		EVMERC20TokenInfo cake = new EVMERC20TokenInfo(
				BSCBEP20Token.CAKE.toString(), 
				"0x0e09fabb73bd3ade0a17ecc321fd13a19e81ce82",
				"Pancakeswap DEFI Token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.BSC.toString(),
				new ArrayList<String>() {{
					this.add("https://bscscan.com/token/0x0e09fabb73bd3ade0a17ecc321fd13a19e81ce82");
					this.add("https://www.coingecko.com/en/coins/pancakeswap");
				}});
		tokens.put(BSCBEP20Token.CAKE.toString(), cake);

		// stg
		EVMERC20TokenInfo stg = new EVMERC20TokenInfo(
				BSCBEP20Token.STG.toString(), 
				"0xb0d502e938ed5f4df2e681fe6e419ff29631d62b",
				"StarGate token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.BSC.toString(),
				new ArrayList<String>() {{
					this.add("https://bscscan.com/address/0xb0d502e938ed5f4df2e681fe6e419ff29631d62b");
					this.add("https://www.coingecko.com/en/coins/stargate-finance");
				}});
		tokens.put(BSCBEP20Token.STG.toString(), stg);

		// usdc
		EVMERC20TokenInfo usdc = new EVMERC20TokenInfo(
				BSCBEP20Token.USDC.toString(), 
				"0x8ac76a51cc950d9822d68b83fe1ad97b32cd580d",
				"USDC stablecoin token", 
				6,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.BSC.toString(),
				new ArrayList<String>() {{
					this.add("https://bscscan.com/address/0x8ac76a51cc950d9822d68b83fe1ad97b32cd580d");
					this.add("https://www.coingecko.com/en/coins/usd-coin");
				}});
		tokens.put(BSCBEP20Token.USDC.toString(), usdc);

		// dai
		EVMERC20TokenInfo dai = new EVMERC20TokenInfo(
				BSCBEP20Token.DAI.toString(), 
				"0x1af3f329e8be154074d8769d1ffa4ee058b1dbc3",
				"DAI stablecoin token", 
				18,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.BSC.toString(),
				new ArrayList<String>() {{
					this.add("https://bscscan.com/address/0x1af3f329e8be154074d8769d1ffa4ee058b1dbc3");
					this.add("https://www.coingecko.com/en/coins/dai");
				}});
		tokens.put(BSCBEP20Token.DAI.toString(), dai);

		// usdt
		EVMERC20TokenInfo usdt = new EVMERC20TokenInfo(
				BSCBEP20Token.USDT.toString(), 
				"0x55d398326f99059ff775485246999027b3197955",
				"Tether stablecoin token", 
				18,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.BSC.toString(),
				new ArrayList<String>() {{
					this.add("https://bscscan.com/address/0x55d398326f99059ff775485246999027b3197955");
					this.add("https://www.coingecko.com/en/coins/tether");
				}});
		tokens.put(BSCBEP20Token.USDT.toString(), usdt);

		// busd stargate LP, staking contract: https://bscscan.com/address/0x3052a0f6ab15b4ae1df39962d5ddefaca86dab47#code
		EVMERC20TokenInfo busdsglp = new EVMERC20TokenInfo(
				BSCBEP20Token.STARGATE_BUSD_LP.toString(), 
				"0x98a5737749490856b401db5dc27f522fc314a4e1",
				"StarGate sBUSD Pool token", 
				18,
				TokenCategory.LIQUIDITY_PROVIDER.toString(),
				EVMChain.BSC.toString(),
				new ArrayList<String>() {{
					this.add("https://bscscan.com/token/0x98a5737749490856b401db5dc27f522fc314a4e1");
				}});
		tokens.put(BSCBEP20Token.STARGATE_BUSD_LP.toString(), busdsglp);

		// busd
		EVMERC20TokenInfo busd = new EVMERC20TokenInfo(
				BSCBEP20Token.BUSD.toString(), 
				"0xe9e7cea3dedca5984780bafc599bd69add087d56",
				"Binance stablecoin token", 
				18,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.BSC.toString(),
				new ArrayList<String>() {{
					this.add("https://bscscan.com/address/0xe9e7cea3dedca5984780bafc599bd69add087d56");
					this.add("https://www.coingecko.com/en/coins/binance-usd");
				}});
		tokens.put(BSCBEP20Token.BUSD.toString(), busd);

		// sfty
		EVMERC20TokenInfo sfty = new EVMERC20TokenInfo(
				BSCBEP20Token.SFTY.toString(), 
				"0xe9d6d6d7cde5c7d45927f8c37460d932e612c902",
				"Stella Fantasy gaming token", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.BSC.toString(),
				new ArrayList<String>() {{
					this.add("https://bscscan.com/address/0xe9d6d6d7cde5c7d45927f8c37460d932e612c902");
					this.add("https://www.coingecko.com/en/coins/stella-fantasy-token");
				}});
		tokens.put(BSCBEP20Token.SFTY.toString(), sfty);

		// test
		EVMERC20TokenInfo test = new EVMERC20TokenInfo(
				BSCBEP20Token.TEST.toString(), 
				"0x1c3c3941acb8a9be35e50f086fae6a481f7d9df7",
				//"0x1c3c3941acb8a9be35e50f086fae6a481f7d9df7", // SQUID token :)
				"TEST token", 
				18,
				TokenCategory.TEST.toString(),
				EVMChain.BSC.toString(),
				new ArrayList<String>() {{
					this.add("https://bscscan.com/token/0xMOJO");
				}});
		tokens.put(BSCBEP20Token.TEST.toString(), test);

		return new ERC20TokenIndex(tokens);
	}

	@SuppressWarnings("serial")
	public static ERC20TokenIndex generateMantaTokenIndex() {

		HashMap<String, EVMERC20TokenInfo> tokens = new HashMap<>();

		// stone
		EVMERC20TokenInfo stone = new EVMERC20TokenInfo(
				MantaERC20Token.STONE.toString(), 
				"0xEc901DA9c68E90798BbBb74c11406A32A70652C3",
				"StakeStone Ether (STONE) token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.MANTA.toString(),
				new ArrayList<String>() {{
					this.add("https://pacific-explorer.manta.network/address/0xEc901DA9c68E90798BbBb74c11406A32A70652C3");
				}});
		tokens.put(MantaERC20Token.STONE.toString(), stone);

		return new ERC20TokenIndex(tokens);
	}

	@SuppressWarnings("serial")
	public static EVMNFTIndex generateMoonbeamNFTIndex() {
		HashMap<String, EVMERC721TokenInfo> erc721tokens = new HashMap<>();
		HashMap<String, EVMERC1155TokenInfo> erc1155tokens = new HashMap<>();

		// snakesoldier
		EVMERC721TokenInfo snakesoldier = new EVMERC721TokenInfo(
				MoonbeamERC721Token.SNAKESOLDIERS.toString(), 
				"0x3ab955216bdd76f51fbe02a3fe237d6612bbd09f",
				0L,
				"ZKSyncEra Ape", 
				TokenCategory.SOCIAL.toString(),
				EVMChain.MOONBEAM.toString(),
				new ArrayList<String>() {{
					this.add("https://moonscan.io/token/0x3ab955216bdd76f51fbe02a3fe237d6612bbd09f");
					this.add("https://snakesoldiers.com");
				}});
		erc721tokens.put(MoonbeamERC721Token.SNAKESOLDIERS.toString(), snakesoldier);


		return new EVMNFTIndex(erc721tokens, erc1155tokens);
	}

	@SuppressWarnings("serial")
	public static EVMNFTIndex generateArbitrumNFTIndex() {
		HashMap<String, EVMERC721TokenInfo> erc721tokens = new HashMap<>();
		HashMap<String, EVMERC1155TokenInfo> erc1155tokens = new HashMap<>();

		// treasuretag
		EVMERC721TokenInfo treasuretag = new EVMERC721TokenInfo(
				ArbitrumONEERC721Token.TREASURETAG.toString(), 
				"0xe50abe4756809b51b0041bb5ab12ec4c5c67af47",
				0L,
				"MAGIC Treasuretag NFT", 
				TokenCategory.GAMING.toString(),
				EVMChain.ARBITRUMONE.toString(),
				new ArrayList<String>() {{
					this.add("https://arbiscan.io/token/0xe50abe4756809b51b0041bb5ab12ec4c5c67af47");
					this.add("https://app.treasure.lol/treasuretag");
				}});
		erc721tokens.put(ArbitrumONEERC721Token.TREASURETAG.toString(), treasuretag);


		return new EVMNFTIndex(erc721tokens, erc1155tokens);
	}

	public static EVMNFTIndex generateDummyNFTIndex() {
		HashMap<String, EVMERC721TokenInfo> erc721tokens = new HashMap<>();
		HashMap<String, EVMERC1155TokenInfo> erc1155tokens = new HashMap<>();
		return new EVMNFTIndex(erc721tokens, erc1155tokens);
	}

	public static ERC20TokenIndex generateDummyTokenIndex() {
		HashMap<String, EVMERC20TokenInfo> tokens = new HashMap<>();
		return new ERC20TokenIndex(tokens);
	}

	@SuppressWarnings("serial")
	public static EVMNFTIndex generateEthereumNFTIndex() {
		HashMap<String, EVMERC721TokenInfo> erc721tokens = new HashMap<>();
		HashMap<String, EVMERC1155TokenInfo> erc1155tokens = new HashMap<>();

		// lucha
		EVMERC721TokenInfo lucha = new EVMERC721TokenInfo(
				EthereumERC721Token.LUCHADORES.toString(), 
				"0x8b4616926705fb61e9c4eeac07cd946a5d4b0760",
				0L,
				"Luchadores game NFT", 
				TokenCategory.GAMING.toString(),
				EVMChain.ETH.toString(),
				new ArrayList<String>() {{
					this.add("https://etherscan.io/address/0x8b4616926705fb61e9c4eeac07cd946a5d4b0760");
					this.add("https://opensea.io/collection/luchadores-io");
				}},
				new ArrayList<String>() {{
					this.add(EVMChain.POLYGON.toString() + ":" + PolygonERC20Token.LUCHA.toString());
				}});
		erc721tokens.put(EthereumERC721Token.LUCHADORES.toString(), lucha);

		// www_land
		EVMERC721TokenInfo www_land = new EVMERC721TokenInfo(
				EthereumERC721Token.WWW_LAND.toString(), 
				"0xa1d4657e0e6507d5a94d06da93e94dc7c8c44b51",
				0L,
				"World Wide Webb game NFT", 
				TokenCategory.GAMING.toString(),
				EVMChain.ETH.toString(),
				new ArrayList<String>() {{
					this.add("https://etherscan.io/address/0xa1d4657e0e6507d5a94d06da93e94dc7c8c44b51");
					this.add("https://opensea.io/collection/worldwidewebbland");
				}});
		erc721tokens.put(EthereumERC721Token.WWW_LAND.toString(), www_land);

		// bored ape
		EVMERC721TokenInfo bored_ape = new EVMERC721TokenInfo(
				EthereumERC721Token.BORED_APE.toString(), 
				"0xbc4ca0eda7647a8ab7c2061c2e118a18a936f13d",
				0L,
				"Bored Ape NFT", 
				TokenCategory.GAMING.toString(),
				EVMChain.ETH.toString(),
				new ArrayList<String>() {{
					this.add("https://etherscan.io/address/0xbc4ca0eda7647a8ab7c2061c2e118a18a936f13d");
					this.add("https://opensea.io/collection/boredapeyachtclub");
				}},
				new ArrayList<String>() {{
					this.add(EVMChain.ETH.toString() + ":" + EthereumERC20Token.APECOIN.toString());
				}});
		erc721tokens.put(EthereumERC721Token.BORED_APE.toString(), bored_ape);

		// unstoppable_domain
		EVMERC721TokenInfo unstoppable_domain = new EVMERC721TokenInfo(
				EthereumERC721Token.UNSTOPPABLE_DOMAIN.toString(), 
				"0x049aba7510f45ba5b64ea9e658e342f904db358d",
				0L,
				"Unstoppable Domains NFT", 
				TokenCategory.NAMESERVICE.toString(),
				EVMChain.ETH.toString(),
				new ArrayList<String>() {{
					this.add("https://etherscan.io/token/0x049aba7510f45ba5b64ea9e658e342f904db358d");
					this.add("https://opensea.io/collection/unstoppable-domains");
				}});
		erc721tokens.put(EthereumERC721Token.UNSTOPPABLE_DOMAIN.toString(), unstoppable_domain);

		// ensdomain
		EVMERC721TokenInfo ensdomain = new EVMERC721TokenInfo(
				EthereumERC721Token.ENS_DOMAIN.toString(), 
				"0x57f1887a8bf19b14fc0df6fd9b2acc9af147ea85",
				0L,
				"Ethereum Name Service Domain NFT", 
				TokenCategory.NAMESERVICE.toString(),
				EVMChain.ETH.toString(),
				new ArrayList<String>() {{
					this.add("https://etherscan.io/token/0x57f1887a8bf19b14fc0df6fd9b2acc9af147ea85");
					this.add("https://opensea.io/collection/ens");
				}});
		erc721tokens.put(EthereumERC721Token.ENS_DOMAIN.toString(), ensdomain);

		return new EVMNFTIndex(erc721tokens, erc1155tokens);
	}

	@SuppressWarnings("serial")
	public static ERC20TokenIndex generateEthereumTokenIndex() {

		HashMap<String, EVMERC20TokenInfo> tokens = new HashMap<>();

		// cult
		EVMERC20TokenInfo cult = new EVMERC20TokenInfo(
				EthereumERC20Token.CULT.toString(), 
				"0xf0f9d895aca5c8678f706fb8216fa22957685a13",
				"The CULT DAO token", 
				18,
				TokenCategory.MEME.toString(),
				EVMChain.ETH.toString(),
				new ArrayList<String>() {{
					this.add("https://etherscan.io/address/0xf0f9d895aca5c8678f706fb8216fa22957685a13");
					this.add("https://www.coingecko.com/en/coins/cult-dao");
				}});
		tokens.put(EthereumERC20Token.CULT.toString(), cult);

		// dobe
		EVMERC20TokenInfo dobe = new EVMERC20TokenInfo(
				EthereumERC20Token.DOBE.toString(), 
				"0xe7ab45162f5979f09b0bda1cc7dfc97c270ea3d5",
				"The Dobermann token", 
				18,
				TokenCategory.MEME.toString(),
				EVMChain.ETH.toString(),
				new ArrayList<String>() {{
					this.add("https://etherscan.io/address/0xe7ab45162f5979f09b0bda1cc7dfc97c270ea3d5");
					this.add("https://www.coingecko.com/en/coins/dobermann");
				}});
		tokens.put(EthereumERC20Token.DOBE.toString(), dobe);

		// jshiba
		EVMERC20TokenInfo jshiba = new EVMERC20TokenInfo(
				EthereumERC20Token.JSHIBA.toString(), 
				"0x1426cc6d52d1b14e2b3b1cb04d57ea42b39c4c7c",
				"The Jomon Shiba token", 
				18,
				TokenCategory.MEME.toString(),
				EVMChain.ETH.toString(),
				new ArrayList<String>() {{
					this.add("https://etherscan.io/address/0x1426cc6d52d1b14e2b3b1cb04d57ea42b39c4c7c");
					this.add("https://www.coingecko.com/en/coins/jomon-shiba");
				}});
		tokens.put(EthereumERC20Token.JSHIBA.toString(), jshiba);

		// jindoge
		EVMERC20TokenInfo jindoge = new EVMERC20TokenInfo(
				EthereumERC20Token.JINDOGE.toString(), 
				"0x3f4cd830543db25254ec0f05eac058d4d6e86166",
				"The Jindoge token", 
				18,
				TokenCategory.MEME.toString(),
				EVMChain.ETH.toString(),
				new ArrayList<String>() {{
					this.add("https://etherscan.io/address/0x3f4cd830543db25254ec0f05eac058d4d6e86166");
					this.add("https://www.coingecko.com/en/coins/jindoge");
				}});
		tokens.put(EthereumERC20Token.JINDOGE.toString(), jindoge);

		// nb
		EVMERC20TokenInfo nb = new EVMERC20TokenInfo(
				EthereumERC20Token.NB.toString(), 
				"0x20be82943e8d9c682580e11d424ec15db95b4a24",
				"The No Bull token", 
				18,
				TokenCategory.MEME.toString(),
				EVMChain.ETH.toString(),
				new ArrayList<String>() {{
					this.add("https://etherscan.io/address/0x20be82943e8d9c682580e11d424ec15db95b4a24");
					this.add("https://www.coingecko.com/en/coins/no-bull");
				}});
		tokens.put(EthereumERC20Token.NB.toString(), nb);

		// dojo
		EVMERC20TokenInfo dojo = new EVMERC20TokenInfo(
				EthereumERC20Token.DOJO.toString(), 
				"0x180dae91d6d56235453a892d2e56a3e40ba81df8",
				"The DOJO token", 
				18,
				TokenCategory.MEME.toString(),
				EVMChain.ETH.toString(),
				new ArrayList<String>() {{
					this.add("https://etherscan.io/address/0x180dae91d6d56235453a892d2e56a3e40ba81df8");
					this.add("https://www.coingecko.com/en/coins/dojo");
				}});
		tokens.put(EthereumERC20Token.DOJO.toString(), dojo);

		// shushky
		EVMERC20TokenInfo shushky = new EVMERC20TokenInfo(
				EthereumERC20Token.SHUSHKY.toString(), 
				"0x236d53148f83706c3d670064809577385f923a75",
				"The Siberian Husky token", 
				18,
				TokenCategory.MEME.toString(),
				EVMChain.ETH.toString(),
				new ArrayList<String>() {{
					this.add("https://etherscan.io/address/0x236d53148f83706c3d670064809577385f923a75");
					this.add("https://www.coingecko.com/en/coins/siberian-husky");
				}});
		tokens.put(EthereumERC20Token.SHUSHKY.toString(), shushky);

		// dinu
		EVMERC20TokenInfo dinu = new EVMERC20TokenInfo(
				EthereumERC20Token.DINU.toString(), 
				"0xbb1ee07d6c7baeb702949904080eb61f5d5e7732",
				"The Dogey-Inu token", 
				18,
				TokenCategory.MEME.toString(),
				EVMChain.ETH.toString(),
				new ArrayList<String>() {{
					this.add("https://etherscan.io/address/0xbb1ee07d6c7baeb702949904080eb61f5d5e7732");
					this.add("https://www.coingecko.com/en/coins/dogey-inu");
				}});
		tokens.put(EthereumERC20Token.DINU.toString(), dinu);

		// sos
		EVMERC20TokenInfo sos = new EVMERC20TokenInfo(
				EthereumERC20Token.SOS.toString(), 
				"0x3b484b82567a09e2588a13d54d032153f0c0aee0",
				"The OpenDAO SOS token", 
				18,
				TokenCategory.NFT.toString(),
				EVMChain.ETH.toString(),
				new ArrayList<String>() {{
					this.add("https://etherscan.io/address/0x3b484b82567a09e2588a13d54d032153f0c0aee0");
					this.add("https://www.coingecko.com/en/coins/opendao");
				}});
		tokens.put(EthereumERC20Token.SOS.toString(), sos);

		// sora
		EVMERC20TokenInfo sora = new EVMERC20TokenInfo(
				EthereumERC20Token.XOR.toString(), 
				"0x40fd72257597aa14c7231a7b1aaa29fce868f677",
				"The SORA token", 
				18,
				TokenCategory.UNKNOWN.toString().toString(),
				EVMChain.ETH.toString(),
				new ArrayList<String>() {{
					this.add("https://etherscan.io/address/0x40fd72257597aa14c7231a7b1aaa29fce868f677");
					this.add("https://www.coingecko.com/en/coins/sora");
				}});
		tokens.put(EthereumERC20Token.XOR.toString(), sora);

		// usdc
		EVMERC20TokenInfo usdc = new EVMERC20TokenInfo(
				EthereumERC20Token.USDC.toString(), 
				"0xa0b86991c6218b36c1d19d4a2e9eb0ce3606eb48",
				"USDC stablecoin token", 
				6,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.ETH.toString(),
				new ArrayList<String>() {{
					this.add("https://etherscan.io/address/0xa0b86991c6218b36c1d19d4a2e9eb0ce3606eb48");
					this.add("https://www.coingecko.com/en/coins/usd-coin");
				}});
		tokens.put(EthereumERC20Token.USDC.toString(), usdc);

		// fwb
		EVMERC20TokenInfo fwb = new EVMERC20TokenInfo(
				EthereumERC20Token.FWB.toString(), 
				"0x35bd01fc9d6d5d81ca9e055db88dc49aa2c699a8",
				"Friends With Benefits token", 
				18,
				TokenCategory.SOCIAL.toString(),
				EVMChain.ETH.toString(),
				new ArrayList<String>() {{
					this.add("https://etherscan.io/address/0x35bd01fc9d6d5d81ca9e055db88dc49aa2c699a8");
					this.add("https://www.coingecko.com/en/coins/friends-with-benefits-pro");
				}});
		tokens.put(EthereumERC20Token.FWB.toString(), fwb);

		// vidya
		EVMERC20TokenInfo vidya = new EVMERC20TokenInfo(
				EthereumERC20Token.VIDYA.toString(), 
				"0x3d3d35bb9bec23b06ca00fe472b50e7a4c692c30",
				"VIDYA token", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.ETH.toString(),
				new ArrayList<String>() {{
					this.add("https://etherscan.io/address/0x3d3d35bb9bec23b06ca00fe472b50e7a4c692c30");
					this.add("https://www.coingecko.com/en/coins/vidya");
				}});
		tokens.put(EthereumERC20Token.VIDYA.toString(), vidya);

		// unidex
		EVMERC20TokenInfo unidex = new EVMERC20TokenInfo(
				EthereumERC20Token.UNIDX.toString(), 
				"0x95b3497bbcccc46a8f45f5cf54b0878b39f8d96c",
				"UniDex token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.ETH.toString(),
				new ArrayList<String>() {{
					this.add("https://etherscan.io/address/0x95b3497bbcccc46a8f45f5cf54b0878b39f8d96c");
					this.add("https://www.coingecko.com/en/coins/unidex");
				}});
		tokens.put(EthereumERC20Token.UNIDX.toString(), unidex);

		// serum
		EVMERC20TokenInfo serum = new EVMERC20TokenInfo(
				EthereumERC20Token.SERUM.toString(), 
				"0x476c5e26a75bd202a9683ffd34359c0cc15be0ff",
				"Serum token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.ETH.toString(),
				new ArrayList<String>() {{
					this.add("https://etherscan.io/address/0x476c5e26a75bd202a9683ffd34359c0cc15be0ff");
					this.add("https://www.coingecko.com/en/coins/serum");
				}});
		tokens.put(EthereumERC20Token.SERUM.toString(), serum);

		// trac
		EVMERC20TokenInfo trac = new EVMERC20TokenInfo(
				EthereumERC20Token.TRAC.toString(), 
				"0xaa7a9ca87d3694b5755f213b5d04094b8d0f0a6f",
				"OriginTrail token", 
				18,
				TokenCategory.SUPPLYCHAIN.toString(),
				EVMChain.ETH.toString(),
				new ArrayList<String>() {{
					this.add("https://etherscan.io/address/0xaa7a9ca87d3694b5755f213b5d04094b8d0f0a6f");
					this.add("https://www.coingecko.com/en/coins/origintrail");
				}});
		tokens.put(EthereumERC20Token.TRAC.toString(), trac);

		// dai
		EVMERC20TokenInfo dai = new EVMERC20TokenInfo(
				EthereumERC20Token.DAI.toString(), 
				"0x6b175474e89094c44da98b954eedeac495271d0f",
				"DAI stablecoin token", 
				18,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.ETH.toString(),
				new ArrayList<String>() {{
					this.add("https://etherscan.io/address/0x6b175474e89094c44da98b954eedeac495271d0f");
					this.add("https://www.coingecko.com/en/coins/dai");
				}});
		tokens.put(EthereumERC20Token.DAI.toString(), dai);

		// usdt
		EVMERC20TokenInfo usdt = new EVMERC20TokenInfo(
				EthereumERC20Token.USDT.toString(), 
				"0xdac17f958d2ee523a2206206994597c13d831ec7",
				"Tether stablecoin token", 
				6,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.ETH.toString(),
				new ArrayList<String>() {{
					this.add("https://etherscan.io/address/0xdac17f958d2ee523a2206206994597c13d831ec7");
					this.add("https://www.coingecko.com/en/coins/tether");
				}});
		tokens.put(EthereumERC20Token.USDT.toString(), usdt);

		// apecoin
		EVMERC20TokenInfo apecoin = new EVMERC20TokenInfo(
				EthereumERC20Token.APECOIN.toString(), 
				"0x4d224452801aced8b2f0aebe155379bb5d594381",
				"Bored Ape game token", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.ETH.toString(),
				new ArrayList<String>() {{
					this.add("https://www.coingecko.com/en/coins/apecoin");
					this.add("https://etherscan.io/address/0x4d224452801aced8b2f0aebe155379bb5d594381");
				}});
		tokens.put(EthereumERC20Token.APECOIN.toString(), apecoin);

		// test
		EVMERC20TokenInfo test = new EVMERC20TokenInfo(
				EthereumERC20Token.TEST.toString(), 
				"0x2b591e99afe9f32eaa6214f7b7629768c40eeb39",
				//"0x2b591e99afe9f32eaa6214f7b7629768c40eeb39", // HEX :)
				"TEST token", 
				18,
				TokenCategory.TEST.toString(),
				EVMChain.ETH.toString(),
				new ArrayList<String>() {{
					this.add("https://etherscan.io/token/0xMOJO");
				}});
		tokens.put(EthereumERC20Token.TEST.toString(), test);

		return new ERC20TokenIndex(tokens);
	}

	@SuppressWarnings("serial")
	public static EVMChainIndex generateEVMChainIndex() {

		HashMap<EVMChain, EVMChainInfo> networks = new HashMap<>();

		// cmrangers
		EVMChainInfo cmrangers = new EVMChainInfo(
				EVMChain.CMRANGERS.toString(), 
				"Rangers Protocol ConnectorManager", 
				38400L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Rangers Protocol ConnectorManager Gas Token", "cmRPG", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"9000000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://cm.rangersprotocol.com/api/jsonrpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.rangersprotocol.com");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge.rangersprotocol.com");
				}},
				new ArrayList<String>() {{
					this.add("https://rangersprotocol.com");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.CMRANGERS, cmrangers);

		// cmrangers_test
		EVMChainInfo cmrangers_test = new EVMChainInfo(
				EVMChain.CMRANGERSTEST.toString(), 
				"Rangers ConnectorManager Testnet", 
				38401L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Rangers ConnectorManager Testnet Token Gas Token", "ttRPG", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"9000000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://robin-cm.rangersprotocol.com/api/jsonrpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://robin-rangersscan.rangersprotocol.com");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge.rangersprotocol.com");
				}},
				new ArrayList<String>() {{
					this.add("https://rangersprotocol.com");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.CMRANGERSTEST, cmrangers_test);

		// rangers_test
		EVMChainInfo rangers_test = new EVMChainInfo(
				EVMChain.RANGERSTEST.toString(), 
				"Rangers Protocol Testnet Robin", 
				9527L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Rangers Protocol Testnet Robin Gas Token", "tRPG", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"9000000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://mainnet.rangersprotocol.com/api/jsonrpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.rangersprotocol.com");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge.rangersprotocol.com");
				}},
				new ArrayList<String>() {{
					this.add("https://rangersprotocol.com");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.RANGERSTEST, rangers_test);

		// rangers
		EVMChainInfo rangers = new EVMChainInfo(
				EVMChain.RANGERS.toString(), 
				"Rangers Protocol Mainnet", 
				2025L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Rangers Protocol Mainnet Gas Token", "RPG", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"9000000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://mainnet.rangersprotocol.com/api/jsonrpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.rangersprotocol.com");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge.rangersprotocol.com");
				}},
				new ArrayList<String>() {{
					this.add("https://rangersprotocol.com");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.RANGERS, rangers);

		// siberium_test
		EVMChainInfo siberium_test = new EVMChainInfo(
				EVMChain.SIBERIUMTEST.toString(), 
				"Siberium Test Network", 
				111000L, 
				BlockchainType.BORKED.toString(), // single node unstable
				new EVMCurrency("Siberium Test Network Gas Token", "SIBR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"32000000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.test.siberium.net");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.test.siberium.net");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/111000");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.SIBERIUMTEST, siberium_test);

		// rari_test
		EVMChainInfo rari_test = new EVMChainInfo(
				EVMChain.RARITEST.toString(), 
				"RARI Testnet", 
				1918988905L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("RARI Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"32000000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://testnet.rpc.rarichain.org/http");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.rarichain.org/");
				}},
				new ArrayList<String>() {{
					this.add("Arbitrum Sepolia -> Rari: https://bridge.rarichain.org/");
					this.add("https://info.rarichain.org/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://info.rarichain.org/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.RARITEST, rari_test);

		// siberium
		EVMChainInfo siberium = new EVMChainInfo(
				EVMChain.SIBERIUM.toString(), 
				"Siberium Network", 
				111111L, 
				BlockchainType.BORKED.toString(), // all nodes gone
				new EVMCurrency("Siberium Network Gas Token", "SIBR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"32000000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.main.siberium.net");
					this.add("https://rpc.main.siberium.net.ru");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.main.siberium.net");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/111111");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.SIBERIUM, siberium);

		// flare_test
		EVMChainInfo flare_test = new EVMChainInfo(
				EVMChain.FLARECOSTONTEST.toString(), 
				"Flare Testnet Coston", 
				16L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Flare Testnet Coston Gas Token", "CFLR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"32000000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://coston-api.flare.network/ext/bc/C/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://coston-explorer.flare.network");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/16");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.FLARECOSTONTEST, flare_test);

		// flare_test2
		EVMChainInfo flare_test2 = new EVMChainInfo(
				EVMChain.FLARECOSTON2TEST.toString(), 
				"Flare Testnet Coston2", 
				114L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Flare Testnet Coston2 Gas Token", "C2FLR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"3200000", 
				new ArrayList<String>() {{
					this.add("https://coston2-api.flare.network/ext/bc/C/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://coston2-explorer.flare.network");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/114");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.FLARECOSTON2TEST, flare_test2);

		// flare
		EVMChainInfo flare = new EVMChainInfo(
				EVMChain.FLARE.toString(), 
				"Flare Mainnet", 
				14L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Flare Mainnet Gas Token", "FLR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"32000000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://flare.public-rpc.com");
					this.add("https://flare-api.flare.network/ext/C/rpc");
					this.add("https://rpc.ftso.au/flare");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://flare-explorer.flare.network");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/14");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.FLARE, flare);

		// eiob
		EVMChainInfo eiob = new EVMChainInfo(
				EVMChain.EIOB.toString(), 
				"EIOB Mainnet", 
				612L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("EIOB Mainnet Gas Token", "EIOB", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"3200000", // +0 gives exceeds block gas limit 
				new ArrayList<String>() {{
					this.add("https://rpc.eiob.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.eiob.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/612");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.EIOB, eiob);

		// jono12
		EVMChainInfo jono12 = new EVMChainInfo(
				EVMChain.JONO12.toString(), 
				"Jono12 Subnet", 
				955081L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Jono12 Subnet Gas Token", "JONO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"3200000", // +0 gives exceeds block gas limit 
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/jono12/testnet/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://subnets-test.avax.network/jono12");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/955081");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.JONO12, jono12);

		// jono11
		EVMChainInfo jono11 = new EVMChainInfo(
				EVMChain.JONO11.toString(), 
				"Jono11 Subnet", 
				20765L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Jono11 Subnet Gas Token", "JONO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"3200000", // +0 gives exceeds block gas limit 
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/jono11/testnet/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://subnets-test.avax.network/jono11");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/20765");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.JONO11, jono11);

		// w3gamezholesky_test
		EVMChainInfo w3gamezholesky_test = new EVMChainInfo(
				EVMChain.W3GAMEZTEST.toString(), 
				"W3Gamez Holesky Testnet", 
				32001L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("W3Gamez Holesky Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"3200000", // +0 gives exceeds block gas limit 
				new ArrayList<String>() {{
					this.add("https://rpc-holesky.w3gamez.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://w3gamez-holesky.web3games.com");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/32001");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.W3GAMEZTEST, w3gamezholesky_test);

		// holesky_test
		EVMChainInfo holesky_test = new EVMChainInfo(
				EVMChain.HOLESKYTEST.toString(), 
				"Holesky Test Network", 
				17000L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Holesky Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"3200000", // +0 gives exceeds block gas limit 
				new ArrayList<String>() {{
					this.add("https://1rpc.io/holesky");
					this.add("https://rpc.holesky.ethpandaops.io");
					this.add("https://ethereum-holesky.publicnode.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://holesky.beaconcha.in");
				}},
				new ArrayList<String>() {{
					this.add("https://holesky-faucet.pk910.de");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/17000");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.HOLESKYTEST, holesky_test);

		// taiko6_test
		EVMChainInfo taiko6_test = new EVMChainInfo(
				EVMChain.TAIKOALPHA6TEST.toString(), 
				"Taiko Katla L2 Test Network", 
				167008L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Taiko Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"3200000",
				new ArrayList<String>() {{
					this.add("https://rpc.katla.taiko.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.katla.taiko.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge.katla.taiko.xyz/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/167008");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.TAIKOALPHA6TEST, taiko6_test);

		// filecoin_calibration_test
		EVMChainInfo filecoin_calibration_test = new EVMChainInfo(
				EVMChain.FILECOINCALIBRATIONTEST.toString(), 
				"Filecoin - Calibration testnet", 
				314159L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Filecoin Calibration testnet Gas Token", "tFIL", 18), 
				EVMPriceMechanism.EIP1559.toString(),
				30, // confirmation timeout in seconds
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"32000000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://api.calibration.node.glif.io/rpc/v1");
					this.add("https://rpc.ankr.com/filecoin_testnet");
					this.add("https://filecoin-calibration.chainup.net/rpc/v1");
					this.add("https://calibration.filfox.info/rpc/v1");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://filecoin-calibration.chainup.net/rpc/v1");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://calibration.filscan.io");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.FILECOINCALIBRATIONTEST, filecoin_calibration_test);

		// filecoin
		EVMChainInfo filecoin = new EVMChainInfo(
				EVMChain.FILECOIN.toString(), 
				"Filecoin Mainnet", 
				314L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Filecoin Mainnet Gas Token", "FIL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"32000000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://api.node.glif.io/");
					this.add("https://rpc.ankr.com/filecoin");
					this.add("https://filfox.info/rpc/v1");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://filfox.info/en");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://filfox.info/en");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.FILECOIN, filecoin);

		// zkamoeba_test
		EVMChainInfo zkamoeba_test = new EVMChainInfo(
				EVMChain.ZKAMOEBATEST.toString(), 
				"Filecoin L2 Testnet (ZKAMOEBA)", 
				380L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("ZKAMOEBA Testnet Gas Token", "tFIL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"32000000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.zkamoeba.com:4050/");
					this.add("https://rpc1.testnet.zkamoeba.com:4050/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.zkamoeba.com/");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://www.zkamoeba.com/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.ZKAMOEBATEST, zkamoeba_test);

		// kinto
		EVMChainInfo kinto = new EVMChainInfo(
				EVMChain.KINTO.toString(), 
				"Kinto Mainnet", 
				7887L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Kinto Mainnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"32000000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.kinto.xyz/http");
					this.add("https://kinto-mainnet.calderachain.xyz/http");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.kinto.xyz/");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/7887");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.KINTO, kinto);

		// liquidlayer_test
		EVMChainInfo liquidlayer_test = new EVMChainInfo(
				EVMChain.LIQUIDLAYERTEST.toString(), 
				"LiquidLayer Testnet", 
				93572L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("LiquidLayer Testnet Gas Token", "LILA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"32000000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://testnet.liquidlayer.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-scan.liquidlayer.network");
				}},
				new ArrayList<String>() {{
					this.add("https://claim.liquidlayer.network/");
				}},
				new ArrayList<String>() {{
					this.add("https://liquidlayer.network");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.LIQUIDLAYERTEST, liquidlayer_test);

		// avax_eclipse_test
		EVMChainInfo avax_eclipse_test = new EVMChainInfo(
				EVMChain.ECLIPSETEST.toString(), 
				"Eclipse Subnet", 
				17172L, 
				BlockchainType.BORKED.toString(), // single node often offline atm
				new EVMCurrency("Eclipse Subnet Gas Token", "ECLP", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"32000000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/eclipse/testnet/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://subnets-test.avax.network/eclipse");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://subnets-test.avax.network/eclipse");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.ECLIPSETEST, avax_eclipse_test);

		// avax_eclipse_test
		EVMChainInfo innovatorchain = new EVMChainInfo(
				EVMChain.INOV8.toString(), 
				"Innovator Chain", 
				129L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Innovator Chain Gas Token", "INOV8", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"32000000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.innovatorchain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://evm.innovatorchain.com");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://innovatorchain.com");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.INOV8, innovatorchain);

		// liquidlayer
		EVMChainInfo liquidlayer = new EVMChainInfo(
				EVMChain.LIQUIDLAYER.toString(), 
				"LiquidLayer Mainnet", 
				25186L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Kinto Mainnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"32000000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://mainnet.liquidlayer.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.liquidlayer.network");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://liquidlayer.network");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.LIQUIDLAYER, liquidlayer);

		// xdc
		EVMChainInfo xdc = new EVMChainInfo(
				EVMChain.XDC.toString(), 
				"XDC Network", 
				50L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Flare Mainnet Gas Token", "XDC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"32000000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.xdcrpc.com");
					this.add("https://erpc.xinfin.network");
					this.add("https://rpc.xinfin.network");
					this.add("https://rpc1.xinfin.network");
					this.add("https://rpc-xdc.icecreamswap.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://xdcscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/50");
					this.add("https://xinfin.network/#stats");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.XDC, xdc);

		// xdc_test
		EVMChainInfo xdc_test = new EVMChainInfo(
				EVMChain.XDCAPOTHEMTEST.toString(), 
				"XDC Apothem Network", 
				51L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("XDC Apothem Network Gas Token", "TXDC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"32000000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.apothem.network");
					this.add("https://erpc.apothem.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://apothem.xinfinscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/51");
					this.add("https://xinfin.network/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.XDCAPOTHEMTEST, xdc_test);

		// telos
		EVMChainInfo telos = new EVMChainInfo(
				EVMChain.TELOS.toString(), 
				"Telos EVM Mainnet", 
				40L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Telos EVM Mainnet Gas Token", "TLOS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"32000000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc1.us.telos.net/evm");
					this.add("https://mainnet.telos.net/evm");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://teloscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/40");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.TELOS, telos);

		// telos_test
		EVMChainInfo telos_test = new EVMChainInfo(
				EVMChain.TELOSTEST.toString(), 
				"Telos EVM Testnet", 
				41L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Telos EVM Testnet Gas Token", "TLOS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"32000000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://testnet.telos.net/evm");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.teloscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/41");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.TELOSTEST, telos_test);

		// shibachain
		EVMChainInfo shibachain = new EVMChainInfo(
				EVMChain.SHIBACHAIN.toString(), 
				"ShibaChain", 
				27L, 
				BlockchainType.BORKED.toString(), // nodes dead
				new EVMCurrency("ShibaChain Gas Token", "SHIB", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"32000000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.shibchain.org");
					this.add("https://rpc.shibachain.net");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://exp.shibchain.org");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/27");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.SHIBACHAIN, shibachain);

		// dogechain
		EVMChainInfo dogechain = new EVMChainInfo(
				EVMChain.DOGECHAINTEST.toString(), 
				"Dogechain Mainnet", 
				2000L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Dogechain Mainnet Gas Token", "DOGE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"32000000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc-sg.dogechain.dog");
					this.add("https://rpc.dogechain.dog");
					this.add("https://rpc01-sg.dogechain.dog");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.dogechain.dog");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://dogechain.dog");
					this.add("https://chainlist.org/chain/2000");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.DOGECHAIN, dogechain);

		// dogechain_test
		EVMChainInfo dogechain_test = new EVMChainInfo(
				EVMChain.DOGECHAINTEST.toString(), 
				"Dogechain Testnet", 
				568L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Dogechain Testnet Gas Token", "DOGE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"32000000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.dogechain.dog");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-testnet.dogechain.dog");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://dogechain.dog");
					this.add("https://chainlist.org/chain/568");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.DOGECHAINTEST, dogechain_test);

		// fncy
		EVMChainInfo fncy = new EVMChainInfo(
				EVMChain.FNCY.toString(), 
				"FNCY Mainnet", 
				73L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("FNCY Mainnet Gas Token", "FNCY", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"32000000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://fncy-seed1.fncy.world");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://fncyscan.fncy.world");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://www.coingecko.com/en/coins/fncy");
					this.add("https://fncy.world/");
					this.add("https://chainlist.org/chain/73");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.FNCY, fncy);

		// fncy_test
		EVMChainInfo fncy_test = new EVMChainInfo(
				EVMChain.FNCYTEST.toString(), 
				"FNCY Testnet", 
				923018L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("FNCY Testnet Gas Token", "FNCY", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"32000000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://fncy-testnet-seed.fncy.world");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://fncyscan-testnet.fncy.world");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://www.coingecko.com/en/coins/fncy");
					this.add("https://fncy.world/");
					this.add("https://chainlist.org/chain/923018");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.FNCYTEST, fncy_test);

		// milkc1_test
		EVMChainInfo milkc1_test = new EVMChainInfo(
				EVMChain.MILKOMEDAC1TEST.toString(), 
				"Milkomeda C1 Testnet", 
				200101L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Milkomeda C1 Testnet Gas Token", "mTAda", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"32000000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc-devnet-cardano-evm.c1.milkomeda.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer-devnet-cardano-evm.c1.milkomeda.com");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/200101");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.MILKOMEDAC1TEST, milkc1_test);

		// blastsepolia_test
		EVMChainInfo blastsepolia_test = new EVMChainInfo(
				EVMChain.BLASTSEPOLIATEST.toString(), 
				"Blast Sepolia Testnet", 
				168587773L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Blast Sepolia Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"32000000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://sepolia.blast.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.blastscan.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.quicknode.com/blast/sepolia");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/168587773");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.BLASTSEPOLIATEST, blastsepolia_test);

		// arbitrumsep
		EVMChainInfo arbitrumsep = new EVMChainInfo(
				EVMChain.ARBITRUMSEPOLIATEST.toString(), 
				"Arbitrum Sepolia", 
				421614L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Arbitrum Sepolia Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"32000000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://arbitrum-sepolia.blockpi.network/v1/rpc/public");
					this.add("https://sepolia-rollup.arbitrum.io/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sepolia-explorer.arbitrum.io");
				}},
				new ArrayList<String>() {{
					this.add("https://bwarelabs.com/faucets/arbitrum-sepolia");
					this.add("Sepolia -> Arbitrum Sepolia: https://bridge.arbitrum.io/?l2ChainId=421614");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/421614");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.ARBITRUMSEPOLIATEST, arbitrumsep);

		// hedera
		EVMChainInfo hedera = new EVMChainInfo(
				EVMChain.HEDERA.toString(), 
				"Hedera Mainnet", 
				295L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Hedera Mainnet Gas Token", "HBAR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"32000000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://mainnet.hashio.io/api");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://hashscan.io/mainnet");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://hedera.com/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.HEDERA, hedera);

		// hedera_test
		EVMChainInfo hedera_test = new EVMChainInfo(
				EVMChain.HEDERATEST.toString(), 
				"Hedera Testnet", 
				296L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Hedera Testnet Gas Token", "HBAR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"32000000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://testnet.hashio.io/api");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://hashscan.io/testnet");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://hedera.com/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.HEDERATEST, hedera_test);

		// joc_test
		EVMChainInfo joc_test = new EVMChainInfo(
				EVMChain.JOCTEST.toString(), 
				"Japan Open Chain Testnet", 
				10081L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Japan Open Chain Gas Token", "JOCT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"32000000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc-1.testnet.japanopenchain.org:8545");
					this.add("https://rpc-2.testnet.japanopenchain.org:8545");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.japanopenchain.org");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://japanopenchain.org");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.JOCTEST, joc_test);

		// joc
		EVMChainInfo joc = new EVMChainInfo(
				EVMChain.JOC.toString(), 
				"Japan Open Chain Mainnet", 
				81L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Japan Open Chain Gas Token", "JOC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"32000000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc-1.japanopenchain.org:8545");
					this.add("https://rpc-2.japanopenchain.org:8545");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.japanopenchain.org");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://japanopenchain.org");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.JOC, joc);

		// zkfair
		EVMChainInfo zkfair = new EVMChainInfo(
				EVMChain.ZKFAIR.toString(), 
				"ZKFair Mainnet", 
				42766L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("ZKFair Mainnet Gas Token", "USDC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"32000000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.zkfair.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.zkfair.io");
				}},
				new ArrayList<String>() {{
					this.add("https://wallet.zkfair.io/");
				}},
				new ArrayList<String>() {{
					this.add("https://zkfair.io");
				}},
				generateZKFairTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.ZKFAIR, zkfair);

		// zkfair_test
		EVMChainInfo zkfair_test = new EVMChainInfo(
				EVMChain.ZKFAIRTEST.toString(), 
				"ZKFair Testnet", 
				43851L, 
				BlockchainType.BORKED.toString(), // single node gone
				new EVMCurrency("ZKFair Testnet Gas Token", "USDC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"32000000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.zkfair.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-scan.zkfair.io");
				}},
				new ArrayList<String>() {{
					this.add("https://testnet-wallet.zkfair.io/");
				}},
				new ArrayList<String>() {{
					this.add("https://zkfair.io");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.ZKFAIRTEST, zkfair_test);

		// xai_test
		EVMChainInfo xai_test = new EVMChainInfo(
				EVMChain.XAITEST.toString(), 
				"Xai Orbit Goerli Testnet", 
				47279324479L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("XAI Testnet Gas Token", "GETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"32000000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://testnet.xai-chain.net/rpc");
					this.add("https://xai-goerli-orbit.rpc.thirdweb.com/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-explorer.xai-chain.net/");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge.arbitrum.io/?l2ChainId=47279324479");
				}},
				new ArrayList<String>() {{
					this.add("https://xai-foundation.gitbook.io/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.XAITEST, xai_test);

		// ubiq
		EVMChainInfo ubiq = new EVMChainInfo(
				EVMChain.UBIQ.toString(), 
				"Ubiq Mainnet", 
				8L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Ubiq Gas Token", "UBQ", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.octano.dev");
					this.add("https://pyrus2.ubiqscan.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://ubiqscan.io/");
				}},
				new ArrayList<String>() {{
					this.add("<todo insert faucet>");
				}},
				new ArrayList<String>() {{
					this.add("https://ubiqsmart.com/");
					this.add("https://www.coingecko.com/en/coins/ubiq");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.UBIQ, ubiq);

		// neon
		EVMChainInfo neon = new EVMChainInfo(
				EVMChain.NEON.toString(), 
				"Neon EVM Mainnet", 
				245022934L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("NEON Gas Token", "NEON", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://neon-proxy-mainnet.solana.p2p.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://neonscan.org");
				}},
				new ArrayList<String>() {{
					this.add("<todo insert faucet>");
				}},
				new ArrayList<String>() {{
					this.add("https://neonevm.org/");
					this.add("https://www.coingecko.com/en/coins/neon");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.NEON, neon);

		// manta_test
		EVMChainInfo manta_test = new EVMChainInfo(
				EVMChain.MANTATEST.toString(), 
				"Manta Pacific Testnet", 
				3441005L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Manta Gas Token", "MANTA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://manta-testnet.calderachain.xyz/http");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://manta-testnet.calderaexplorer.xyz");
				}},
				new ArrayList<String>() {{
					this.add("<todo insert faucet>");
				}},
				new ArrayList<String>() {{
					this.add("https://manta.network");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.MANTATEST, manta_test);

		// manta
		EVMChainInfo manta = new EVMChainInfo(
				EVMChain.MANTA.toString(), 
				"Manta Pacific Mainnet", 
				169L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Manta Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://pacific-rpc.manta.network/http");
					this.add("https://1rpc.io/manta");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://pacific-explorer.manta.network");
				}},
				new ArrayList<String>() {{
					this.add("<todo insert faucet>");
				}},
				new ArrayList<String>() {{
					this.add("https://manta.network");
				}},
				generateMantaTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.MANTA, manta);

		// zkatana_test
		EVMChainInfo zkatana_test = new EVMChainInfo(
				EVMChain.ZKATANATEST.toString(), 
				"zKatana Testnet", 
				1261120L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("zKatana Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.startale.com/zkatana");
					this.add("https://rpc.zkatana.gelato.digital");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://zkatana.explorer.startale.com");
				}},
				new ArrayList<String>() {{
					this.add("<todo insert faucet>");
				}},
				new ArrayList<String>() {{
					this.add("https://portal.astar.network");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.ZKATANATEST, zkatana_test);

		// openfabric_test
		EVMChainInfo openfabric_test = new EVMChainInfo(
				EVMChain.OPENFABRICTEST.toString(), 
				"OpenFabric Testnet", 
				185947263L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("OpenFabric Gas Token", "tstOFN", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.openfabric.dev");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.openfabric.dev/");
				}},
				new ArrayList<String>() {{
					this.add("<todo insert faucet>");
				}},
				new ArrayList<String>() {{
					this.add("https://openfabric.dev");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.OPENFABRICTEST, openfabric_test);

		// gnosis_test
		EVMChainInfo gnosis_test = new EVMChainInfo(
				EVMChain.GNOSISTEST.toString(), 
				"Gnosis Chiado Testnet", 
				10200L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Gnosis Gas Token", "xDai", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://1rpc.io/gnosis");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://blockscout.chiadochain.net");
				}},
				new ArrayList<String>() {{
					this.add("https://www.gnosisfaucet.com/");
				}},
				new ArrayList<String>() {{
					this.add("https://www.gnosis.io/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.GNOSISTEST, gnosis_test);

		// immutable_test
		EVMChainInfo immutable_test = new EVMChainInfo(
				EVMChain.IMMUTABLEZKEVMTEST.toString(), 
				"Immutable zkEVM Testnet", 
				13473L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Immutable zkEVM Testnet Gas Token", "tIMX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.immutable.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.immutable.com");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://immutable.com");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.IMMUTABLEZKEVMTEST, immutable_test);

		// eos_test
		EVMChainInfo eos_test = new EVMChainInfo(
				EVMChain.EOSEVMTEST.toString(), 
				"EOS EVM Network", 
				15557L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("EOS EVM Network Gas Token", "EOS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://api.evm.eosnetwork.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.evm.eosnetwork.com");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://eosnetwork.com");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.EOSEVMTEST, eos_test);

		// eos
		EVMChainInfo eos = new EVMChainInfo(
				EVMChain.EOSEVM.toString(), 
				"EOS EVM Network", 
				17777L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("EOS EVM Network Gas Token", "EOS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://api.evm.eosnetwork.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.evm.eosnetwork.com");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://eosnetwork.com");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.EOSEVM, eos);

		// gnosis
		EVMChainInfo gnosis = new EVMChainInfo(
				EVMChain.GNOSIS.toString(), 
				"Gnosis Chain", 
				100L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Gnosis Gas Token", "xDai", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.gnosischain.com/");
					this.add("https://gnosis.oat.farm");
					this.add("https://gnosis.publicnode.com");
					this.add("https://rpc.gnosischain.com");
					this.add("https://rpc.gnosis.gateway.fm");
					this.add("https://rpc.ankr.com/gnosis");
					this.add("https://gnosis-mainnet.public.blastapi.io");
					this.add("https://gnosis.api.onfinality.io/public");
					this.add("https://gnosis.blockpi.network/v1/rpc/public");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://gnosisscan.io/");
				}},
				new ArrayList<String>() {{
					this.add("https://www.gnosisfaucet.com/");
					this.add("https://bridge.gnosischain.com/");
					this.add("https://hop.exchange/");
				}},
				new ArrayList<String>() {{
					this.add("https://www.gnosis.io/");
				}},
				generateGnosisTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.GNOSIS, gnosis);

		// lamina1_betanet
		EVMChainInfo lamina1_betanet = new EVMChainInfo(
				EVMChain.LAMINA1BETATEST.toString(), 
				"Lamina1 Betanet", 
				7649L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Lamina1 Gas Token", "L1", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc-betanet.lamina1.com/ext/bc/C/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.lamina1.com");
				}},
				new ArrayList<String>() {{
					this.add("<todo bridge/faucet>");
				}},
				new ArrayList<String>() {{
					this.add("https://www.mantle.xyz/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.LAMINA1BETATEST, lamina1_betanet);

		// mantle
		EVMChainInfo mantle = new EVMChainInfo(
				EVMChain.MANTLE.toString(), 
				"Mantle Mainnet", 
				5000L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Mantle Gas Token", "MNT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.mantle.xyz");
					this.add("https://mantle.publicnode.com");
					this.add("https://mantle-mainnet.public.blastapi.io");
					this.add("https://mantle.drpc.org");
					this.add("https://rpc.ankr.com/mantle");
					this.add("https://1rpc.io/mantle");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.mantle.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge.mantle.xyz/");
				}},
				new ArrayList<String>() {{
					this.add("https://www.mantle.xyz/");
				}},
				generateMantleTokenIndex(),
				generateMantleNFTIndex());
		networks.put(EVMChain.MANTLE, mantle);

		// mantle_testnet
		EVMChainInfo mantletest = new EVMChainInfo(
				EVMChain.MANTLETEST.toString(), 
				"Mantle Testnet", 
				5001L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Mantle Gas Token", "MNT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.mantle.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.mantle.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.testnet.mantle.xyz");
					this.add("https://bridge.testnet.mantle.xyz");
					this.add("https://goerli.etherscan.io/address/0xc1dc2d65a2243c22344e725677a3e3bebd26e604#writeProxyContract mint()");
				}},
				new ArrayList<String>() {{
					this.add("https://www.mantle.xyz/");
				}},
				generateMantleTestnetTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.MANTLETEST, mantletest);

		// mantlesepolia_testnet
		EVMChainInfo mantlesepolia_testnet = new EVMChainInfo(
				EVMChain.MANTLESEPOLIATEST.toString(), 
				"Mantle Sepolia Testnet", 
				5003L, 
				BlockchainType.BORKED.toString(), // unstable
				new EVMCurrency("Mantle Gas Token", "MNT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.sepolia.mantle.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.sepolia.mantle.xyz");
				}},
				new ArrayList<String>() {{
					this.add("faucet todo");
				}},
				new ArrayList<String>() {{
					this.add("https://www.mantle.xyz/");
				}},
				generateMantleTestnetTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.MANTLESEPOLIATEST, mantlesepolia_testnet);

		// opbnb
		EVMChainInfo opbnb = new EVMChainInfo(
				EVMChain.OPBNB.toString(), 
				"opBNB Mainnet", 
				204L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("opBNB Gas Token", "BNB", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://opbnb.publicnode.com");
					this.add("https://opbnb-mainnet.nodereal.io/v1/64a9df0874fb4a93b9d0a3849de012d3");
					this.add("https://opbnb-mainnet-rpc.bnbchain.org");
					this.add("https://opbnb-mainnet.nodereal.io/v1/e9a36765eb8a40b9bd12e680a1fd2bc5");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://mainnet.opbnbscan.com");
				}},
				new ArrayList<String>() {{
					this.add("https://opbnb-bridge.bnbchain.org/deposit");
				}},
				new ArrayList<String>() {{
					this.add("https://opbnb.bnbchain.org");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.OPBNB, opbnb);

		// opbnb_test
		EVMChainInfo opbnb_test = new EVMChainInfo(
				EVMChain.OPBNBTEST.toString(), 
				"opBNB Testnet", 
				5611L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("opBNB Gas Token", "tBNB", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1000000000", //1 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://opbnb-testnet-rpc.bnbchain.org");
					this.add("https://opbnb-testnet.nodereal.io/v1/64a9df0874fb4a93b9d0a3849de012d3");
					this.add("https://opbnb-testnet.nodereal.io/v1/e9a36765eb8a40b9bd12e680a1fd2bc5");		
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.opbnbscan.com");
				}},
				new ArrayList<String>() {{
					this.add("https://opbnb-testnet-bridge.bnbchain.org/deposit");
				}},
				new ArrayList<String>() {{
					this.add("https://opbnb.bnbchain.org");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.OPBNBTEST, opbnb_test);

		// zora
		EVMChainInfo zora = new EVMChainInfo(
				EVMChain.ZORA.toString(), 
				"Zora Mainnet", 
				7777777L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Zora Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.zora.energy/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.zora.energy");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge.zora.energy/");
				}},
				new ArrayList<String>() {{
					this.add("https://zora.energy");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.ZORA, zora);

		// kroma
		EVMChainInfo kroma = new EVMChainInfo(
				EVMChain.KROMA.toString(), 
				"Kroma Mainnet", 
				255L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Kroma Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://api.kroma.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://blockscout.kroma.network");
				}},
				new ArrayList<String>() {{
					this.add("https://kroma.network/bridge");
					this.add("https://owlto.finance/?to=Kroma");
				}},
				new ArrayList<String>() {{
					this.add("kroma.network");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.KROMA, kroma);

		// kroma sepolia
		EVMChainInfo kromasep = new EVMChainInfo(
				EVMChain.KROMASEPOLIATEST.toString(), 
				"Kroma Sepolia", 
				2358L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Kroma Sepolia Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://api.sepolia.kroma.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://blockscout.sepolia.kroma.network");
				}},
				new ArrayList<String>() {{
					this.add("https://kroma.network/bridge");
				}},
				new ArrayList<String>() {{
					this.add("kroma.network");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.KROMASEPOLIATEST, kromasep);

		// zora sepolia
		EVMChainInfo zorasep = new EVMChainInfo(
				EVMChain.ZORASEPOLIATEST.toString(), 
				"Zora Sepolia Testnet", 
				999999999L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Zora Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://sepolia.rpc.zora.energy");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sepolia.explorer.zora.energy");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge.zora.energy/");
				}},
				new ArrayList<String>() {{
					this.add("https://zora.energy");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.ZORASEPOLIATEST, zorasep);

		// zora goerli
		EVMChainInfo zoratest = new EVMChainInfo(
				EVMChain.ZORAGOERLITEST.toString(), 
				"Zora Goerli Testnet", 
				999L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Zora Testnet Gas Token", "GöETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://testnet.rpc.zora.co");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.explorer.zora.co");
					this.add("https://goerli.etherscan.io/address/0xDb9F51790365e7dc196e7D072728df39Be958ACe");
				}},
				new ArrayList<String>() {{
					this.add("https://bridgetozora.world/");
				}},
				new ArrayList<String>() {{
					this.add("https://zora.energy");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.ZORAGOERLITEST, zoratest);

		// tomochain
		EVMChainInfo tomochain = new EVMChainInfo(
				EVMChain.TOMOCHAIN.toString(), 
				"Tomochain Mainnet", 
				88L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Tomo Gas Token", "TOMO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.tomochain.com");
					this.add("https://tomo.blockpi.network/v1/rpc/public");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://tomoscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<todo faucet>");
				}},
				new ArrayList<String>() {{
					this.add("https://tomochain.com");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.TOMOCHAIN, tomochain);

		// tomochain_test
		EVMChainInfo tomochain_test = new EVMChainInfo(
				EVMChain.TOMOCHAINTEST.toString(), 
				"Tomochain Mainnet", 
				89L, 
				BlockchainType.BORKED.toString(), // single node no longer resolves
				new EVMCurrency("Tomo Gas Token", "TOMO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.tomochain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.testnet.tomochain.com");
				}},
				new ArrayList<String>() {{
					this.add("<todo faucet>");
				}},
				new ArrayList<String>() {{
					this.add("https://tomochain.com");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.TOMOCHAINTEST, tomochain_test);

		// tenet
		EVMChainInfo tenet = new EVMChainInfo(
				EVMChain.TENET.toString(), 
				"Tenet Mainnet", 
				1559L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("TENET Gas Token", "TENET", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.tenet.org");
					this.add("https://tenet-evm.publicnode.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://tenetscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<todo faucet>");
				}},
				new ArrayList<String>() {{
					this.add("https://ethereumpow.org/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.TENET, tenet);

		// tenettest
		EVMChainInfo tenettest = new EVMChainInfo(
				EVMChain.TENETTEST.toString(), 
				"Tenet Testnet", 
				155L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("TENET Gas Token", "TENET", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.tenet.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.tenetscan.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.testnet.tenet.org/");
				}},
				new ArrayList<String>() {{
					this.add("https://tenet.org");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.TENETTEST, tenettest);

		// ethhw
		EVMChainInfo ethw = new EVMChainInfo(
				EVMChain.ETHW.toString(), 
				"ETH PoW Mainnet", 
				10001L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("ETHW Gas Token", "ETHW", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://mainnet.ethereumpow.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://mainnet.ethwscan.com/");
				}},
				new ArrayList<String>() {{
					this.add("<todo faucet>");
				}},
				new ArrayList<String>() {{
					this.add("https://ethereumpow.org/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.ETHW, ethw);

		// kardiachain
		EVMChainInfo kardiachain = new EVMChainInfo(
				EVMChain.KARDIACHAIN.toString(), 
				"KARURA Mainnet", 
				24L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("KARDIACHAIN Gas Token", "KAI", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.kardiachain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.kardiachain.io/");
				}},
				new ArrayList<String>() {{
					this.add("<todo faucet>");
				}},
				new ArrayList<String>() {{
					this.add("https://kardiachain.io/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.KARDIACHAIN, kardiachain);

		// karura_test
		EVMChainInfo karura_test = new EVMChainInfo(
				EVMChain.KARURATEST.toString(), 
				"KARURA Testnet", 
				596L, 
				BlockchainType.BORKED.toString(), // no rpcs
				new EVMCurrency("KARURA Test Token", "KAR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://eth-rpc-karura-testnet.aca-staging.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("todo block explorer");
				}},
				new ArrayList<String>() {{
					this.add("todo faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://acala.network/karura");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.KARURATEST, karura_test);

		// karura
		EVMChainInfo karura = new EVMChainInfo(
				EVMChain.KARURA.toString(), 
				"KARURA Mainnet", 
				686L, 
				BlockchainType.BORKED.toString(), // rpc incomp? issue calling ethGetBalance()
				new EVMCurrency("KARURA Gas Token", "KAR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.evm.karura.network");
					this.add("https://eth-rpc-karura.aca-api.network");
					this.add("https://eth-rpc-karura.aca-staging.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://karura.network");
				}},
				new ArrayList<String>() {{
					this.add("<todo faucet>");
				}},
				new ArrayList<String>() {{
					this.add("https://acala.network/karura");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.KARURA, karura);

		// lukso_test
		EVMChainInfo lukso_test = new EVMChainInfo(
				EVMChain.LUKSOTEST.toString(), 
				"LUKSO Testnet", 
				4201L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("LUKSO Test Token", "LYXt", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.lukso.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.execution.testnet.lukso.network");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.testnet.lukso.network/");
				}},
				new ArrayList<String>() {{
					this.add("https://lukso.network/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.LUKSOTEST, lukso_test);

		// lukso
		EVMChainInfo lukso = new EVMChainInfo(
				EVMChain.LUKSO.toString(), 
				"LUKSO Mainnet", 
				42L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("LUKSO Gas Token", "LYX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.mainnet.lukso.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.execution.mainnet.lukso.network");
				}},
				new ArrayList<String>() {{
					this.add("<todo faucet>");
				}},
				new ArrayList<String>() {{
					this.add("https://lukso.network/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.LUKSO, lukso);

		// fuse_test
		EVMChainInfo fuse_test = new EVMChainInfo(
				EVMChain.FUSESPARKTEST.toString(), 
				"FUSE Spark Testnet", 
				123L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("FUSE Test Token", "FUSE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"10000000000", //10 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.fusespark.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.fusespark.io");
				}},
				new ArrayList<String>() {{
					this.add("https://get.fusespark.io/");
				}},
				new ArrayList<String>() {{
					this.add("https://www.fuse.io/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.FUSESPARKTEST, fuse_test);

		// fuse
		EVMChainInfo fuse = new EVMChainInfo(
				EVMChain.FUSE.toString(), 
				"FUSE Mainnet", 
				122L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("FUSE Gas Token", "FUSE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"10000000000", //10 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://fuse-mainnet.chainstacklabs.com");
					this.add("https://rpc.fuse.io");
					this.add("https://fuse-rpc.gateway.pokt.network");
					this.add("https://fuse.api.onfinality.io/public");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.fuse.io/");
				}},
				new ArrayList<String>() {{
					this.add("<todo faucet>");
				}},
				new ArrayList<String>() {{
					this.add("https://www.fuse.io/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.FUSE, fuse);

		// coredao_test
		EVMChainInfo coredao_test = new EVMChainInfo(
				EVMChain.CORETEST.toString(), 
				"Core DAO Testnet", 
				1115L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Core Test Token", "tCORE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.test.btcs.network/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.test.btcs.network");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge.coredao.org/");
				}},
				new ArrayList<String>() {{
					this.add("https://coredao.org/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.CORETEST, coredao_test);

		// rootstock_test
		EVMChainInfo rootstock_test = new EVMChainInfo(
				EVMChain.ROOTSTOCKTEST.toString(), 
				"Rootstock Testnet", 
				31L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Rootstock Gas Token", "tRBTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://public-node.testnet.rsk.co");
					this.add("https://mycrypto.testnet.rsk.co");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.rsk.co");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://www.rsk.co");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.ROOTSTOCKTEST, rootstock_test);

		// rootstock
		EVMChainInfo rootstock = new EVMChainInfo(
				EVMChain.ROOTSTOCK.toString(), 
				"Rootstock Mainnet", 
				30L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Rootstock Gas Token", "RBTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://public-node.rsk.co");
					this.add("https://mycrypto.rsk.co");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.rsk.co");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://www.rsk.co");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.ROOTSTOCK, rootstock);

		// quadrans
		EVMChainInfo quadrans = new EVMChainInfo(
				EVMChain.QUADRANS.toString(), 
				"Quadrans Blockchain", 
				10946L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Quadrans Gas Token", "QDC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.quadrans.io");
					this.add("https://rpcna.quadrans.io");
					this.add("https://rpceu.quadrans.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.quadrans.io");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://quadrans.io");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.QUADRANS, quadrans);

		// quadrans_test
		EVMChainInfo quadrans_test = new EVMChainInfo(
				EVMChain.QUADRANSTEST.toString(), 
				"Quadrans Blockchain Testnet", 
				10947L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Quadrans Gas Token", "tQDC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpctest.quadrans.io");
					this.add("https://rpctest2.quadrans.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.quadrans.io");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://quadrans.io");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.QUADRANSTEST, quadrans_test);

		// torus_test
		EVMChainInfo torus_test = new EVMChainInfo(
				EVMChain.TORUSTEST.toString(), 
				"Torus Mainnet", 
				8194L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Torus Mainnet Gas Token", "TTQF", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.toruschain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.toruscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://toruschain.com");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.TORUSTEST, torus_test);

		// torus
		EVMChainInfo torus = new EVMChainInfo(
				EVMChain.TORUS.toString(), 
				"Torus Mainnet", 
				8192L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Torus Mainnet Gas Token", "TQF", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.toruschain.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://toruscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://toruschain.com");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.TORUS, torus);

		// satoshivm_test
		EVMChainInfo satoshivm_test = new EVMChainInfo(
				EVMChain.SATOSHIVMTEST.toString(), 
				"SatoshiVM Testnet", 
				3110L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("SatoshiVM Testnet Gas Token", "tBTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://test-rpc-node-http.svmscan.io/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.svmscan.io/");
				}},
				new ArrayList<String>() {{
					this.add("https://bitcoinfaucet.uo1.net/send.php"); // tBTC
					this.add("https://coinfaucet.eu/en/btc-testnet/"); // tBTC
				}},
				new ArrayList<String>() {{
					this.add("https://docs.satoshivm.io/user-guide/network-information#network-configuration");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.SATOSHIVMTEST, satoshivm_test);

		// playa3ull_games
		EVMChainInfo playa3ull_games = new EVMChainInfo(
				EVMChain.PLAYA3ULL.toString(), 
				"PLAYA3ULL GAMES Mainnet", 
				3011L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("PLAYA3ULL GAMES Mainnet Gas Token", "3ULL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://api.mainnet.playa3ull.games");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://3011.routescan.io/");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://app.playa3ull.games/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.PLAYA3ULL, playa3ull_games);

		// alveychain
		EVMChainInfo alveychain = new EVMChainInfo(
				EVMChain.ALVEYCHAIN.toString(), 
				"AlveyChain Mainnet", 
				3797L, 
				BlockchainType.PUBLIC.toString(), // unstable
				new EVMCurrency("AlveyChain Mainnet Gas Token", "BSTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://elves-core1.alvey.io");
					this.add("https://elves-core2.alvey.io");
					this.add("https://elves-core3.alvey.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://alveyscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://www.alveychain.com/");
					this.add("https://chainlist.org/chain/3797");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.ALVEYCHAIN, alveychain);

		// bpx
		EVMChainInfo bpx = new EVMChainInfo(
				EVMChain.BPX.toString(), 
				"BPX Blockchain", 
				279L, 
				BlockchainType.PUBLIC.toString(), // scam?
				new EVMCurrency("BPX Blockchain Gas Token", "BPX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://bpx-dataseed.infinex.cc");
					this.add("https://rpc.mainnet.bpxchain.cc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://beta.shibariumtech.com/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://bpxchain.cc");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.BPX, bpx);
		
		// zeta
		EVMChainInfo zeta = new EVMChainInfo(
				EVMChain.ZETA.toString(), 
				"Mint Testnet", 
				7000L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("ZetaChain Mainnet Gas Token", "ZETA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://zetachain-evm.blockpi.network/v1/rpc/public");
					this.add("https://zetachain-mainnet-archive.allthatnode.com:8545");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.mainnet.zetachain.com");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://zetachain.com");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.ZETA, zeta);
		
		// mint_test
		EVMChainInfo mint_test = new EVMChainInfo(
				EVMChain.MINTTEST.toString(), 
				"Mint Testnet", 
				1686L, 
				BlockchainType.PUBLIC.toString(), // scam?
				new EVMCurrency("Mint Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.mintchain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-explorer.mintchain.io");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://mintchain.io");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.MINTTEST, mint_test);
		
		// lovely_test
		EVMChainInfo lovely_test = new EVMChainInfo(
				EVMChain.LOVELYTEST.toString(), 
				"Lovely Network Testnet", 
				307L, 
				BlockchainType.PUBLIC.toString(), // scam?
				new EVMCurrency("Lovely Network Testnet Gas Token", "LOVELY", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://trpc.lovely.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://tscan.lovely.network");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.lovely.network");
				}},
				new ArrayList<String>() {{
					this.add("https://lovely.finance/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.LOVELYTEST, lovely_test);
		
		// lovely
		EVMChainInfo lovely = new EVMChainInfo(
				EVMChain.LOVELY.toString(), 
				"Lovely Network Mainnet", 
				730L, 
				BlockchainType.PUBLIC.toString(), // scam?
				new EVMCurrency("Lovely Network Mainnet Gas Token", "LOVELY", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.lovely.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.lovely.network");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.lovely.network");
				}},
				new ArrayList<String>() {{
					this.add("https://lovely.finance/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.LOVELY, lovely);
		
		// puppynet_test
		EVMChainInfo puppynet_test = new EVMChainInfo(
				EVMChain.SHIBARIUMPUPPYNETTEST.toString(), 
				"Puppynet Shibarium", 
				157L, 
				BlockchainType.PUBLIC.toString(), // scam?
				new EVMCurrency("Puppynet Shibarium Gas Token", "BONE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://puppynet.shibrpc.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://puppyscan.shib.io");
				}},
				new ArrayList<String>() {{
					this.add("https://beta.shibariumtech.com/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://shibariumtech.com");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.SHIBARIUMPUPPYNETTEST, puppynet_test);
		
		// bloom_test
		EVMChainInfo bloom_test = new EVMChainInfo(
				EVMChain.BLOOMTEST.toString(), 
				"Bloom Genesis Testnet", 
				323213L, 
				BlockchainType.PUBLIC.toString(), // unstable
				new EVMCurrency("Bloom Genesis Testnet Gas Token", "BGBC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.bloomgenesis.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.bloomgenesis.com");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.bloomgenesis.com");
				}},
				new ArrayList<String>() {{
					this.add("https://bloomgenesis.com");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.BLOOMTEST, bloom_test);
		
		// sei_test
		EVMChainInfo sei_test = new EVMChainInfo(
				EVMChain.SEITEST.toString(), 
				"Sei Devnet", 
				713715L, 
				BlockchainType.PUBLIC.toString(), // unstable
				new EVMCurrency("Sei Devnet Gas Token", "SEI", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://evm-rpc.arctic-1.seinetwork.io");
					this.add("https://evm-rpc-arctic-1.sei-apis.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://seitrace.com");
				}},
				new ArrayList<String>() {{
					this.add("https://sei-evm.faucetme.pro");
					this.add("https://sei-faucet.nima.enterprises/");
				}},
				new ArrayList<String>() {{
					this.add("https://www.sei.io/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.SEITEST, sei_test);
		
		// aurorapowergold
		EVMChainInfo aurorapowergold = new EVMChainInfo(
				EVMChain.AURORAPOWERGOLD.toString(), 
				"PowerGold", 
				1313161560L, 
				BlockchainType.PUBLIC.toString(), // unstable
				new EVMCurrency("PowerGold Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://powergold.aurora.dev");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.powergold.aurora.dev");
				}},
				new ArrayList<String>() {{
					this.add("<faucet todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://aurora.dev/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.AURORAPOWERGOLD, aurorapowergold);
		
		// syndr_test
		EVMChainInfo syndr_test = new EVMChainInfo(
				EVMChain.SYNDRTEST.toString(), 
				"Syndr L3 Sepolia", 
				444444L, 
				BlockchainType.PUBLIC.toString(), // unstable
				new EVMCurrency("Syndr L3 Sepolia Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://sepolia.syndr.com/http");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sepolia-explorer.syndr.com");
				}},
				new ArrayList<String>() {{
					this.add("<faucet todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://syndr.com");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.SYNDRTEST, syndr_test);
		
		// bloom
		EVMChainInfo bloom = new EVMChainInfo(
				EVMChain.BLOOM.toString(), 
				"Bloom Genesis Mainnet", 
				333313L, 
				BlockchainType.PUBLIC.toString(), // unstable
				new EVMCurrency("Bloom Genesis Mainnet Gas Token", "BGBC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://mainnet-rpc.bloomgenesis.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.bloomgenesis.com");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://bloomgenesis.com");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.BLOOM, bloom);
		
		// metadap_test
		EVMChainInfo metadap_test = new EVMChainInfo(
				EVMChain.METADAPTEST.toString(), 
				"MetaDAP Enterprise Testnet", 
				119139L, 
				BlockchainType.PUBLIC.toString(), // unstable
				new EVMCurrency("MetaDAP Enterprise Testnet Gas Token", "DOID", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.chain.metadap.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.chain.metadap.io");
				}},
				new ArrayList<String>() {{
					this.add("<bridge to do>");
				}},
				new ArrayList<String>() {{
					this.add("https://metadap.io");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.METADAPTEST, metadap_test);
		
		// metadap
		EVMChainInfo metadap = new EVMChainInfo(
				EVMChain.METADAP.toString(), 
				"MetaDAP Enterprise Mainnet", 
				91120L, 
				BlockchainType.PUBLIC.toString(), // unstable
				new EVMCurrency("MetaDAP Enterprise Mainnet Gas Token", "DOID", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.chain.metadap.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.chain.metadap.io");
				}},
				new ArrayList<String>() {{
					this.add("<bridge to do>");
				}},
				new ArrayList<String>() {{
					this.add("https://metadap.io");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.METADAP, metadap);
		
		// doid
		EVMChainInfo doid = new EVMChainInfo(
				EVMChain.DOID.toString(), 
				"DOID", 
				53277L, 
				BlockchainType.PUBLIC.toString(), // unstable
				new EVMCurrency("DOID Gas Token", "DOID", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.doid.tech");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.doid.tech");
				}},
				new ArrayList<String>() {{
					this.add("<bridge to do>");
				}},
				new ArrayList<String>() {{
					this.add("https://doid.tech");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.DOID, doid);
		
		// doid_test
		EVMChainInfo doid_test = new EVMChainInfo(
				EVMChain.DOIDTEST.toString(), 
				"DOID Testnet", 
				56797L, 
				BlockchainType.PUBLIC.toString(), // unstable
				new EVMCurrency("DOID Testnet Gas Token", "DOID", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.doid.tech");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.testnet.doid.tech");
				}},
				new ArrayList<String>() {{
					this.add("<bridge to do>");
				}},
				new ArrayList<String>() {{
					this.add("https://doid.tech");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.DOIDTEST, doid_test);
	
		// vrcscan
		EVMChainInfo vrcscan = new EVMChainInfo(
				EVMChain.VRCSCAN.toString(), 
				"Vrcscan Mainnet", 
				713L, 
				BlockchainType.PUBLIC.toString(), // unstable
				new EVMCurrency("Vrcscan Mainnet Gas Token", "VRC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc-mainnet-5.vrcscan.com");
					this.add("https://rpc-mainnet-6.vrcscan.com");
					this.add("https://rpc-mainnet-7.vrcscan.com");
					this.add("https://rpc-mainnet-8.vrcscan.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://dxb.vrcscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<bridge to do>");
				}},
				new ArrayList<String>() {{
					this.add("https://vrcscan.com/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.VRCSCAN, vrcscan);
		
		// xenon_test
		EVMChainInfo xenon_test = new EVMChainInfo(
				EVMChain.XENONTEST.toString(), 
				"Xenon Chain Testnet", 
				2941L, 
				BlockchainType.PUBLIC.toString(), // unstable
				new EVMCurrency("Xenon Chain Testnet Gas Token", "TXEN", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://testnet-chain.xenonchain.com/");
					this.add("https://testnet-dev.xenonchain.com/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.xenonchain.com");
				}},
				new ArrayList<String>() {{
					this.add("https://xfaucet.xenonchain.com");
				}},
				new ArrayList<String>() {{
					this.add("https://xenonchain.com");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.XENONTEST, xenon_test);
		
		// lisk_test
		EVMChainInfo lisk_test = new EVMChainInfo(
				EVMChain.LISKTEST.toString(), 
				"Lisk Sepolia Testnet", 
				4202L, 
				BlockchainType.PUBLIC.toString(), // unstable
				new EVMCurrency("Lisk Sepolia Testnet Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.sepolia-api.lisk.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sepolia-blockscout.lisk.com");
				}},
				new ArrayList<String>() {{
					this.add("<faucet>");
				}},
				new ArrayList<String>() {{
					this.add("https://lisk.com");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.LISKTEST, lisk_test);
		
		// bevm_test
		EVMChainInfo bevm_test = new EVMChainInfo(
				EVMChain.BEVMTEST.toString(), 
				"BEVM Testnet", 
				11503L, 
				BlockchainType.PUBLIC.toString(), // unstable
				new EVMCurrency("BEVM Testnet Gas Token", "BTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://testnet.bevm.io/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan-testnet.bevm.io");
				}},
				new ArrayList<String>() {{
					this.add("<bridge to do>");
				}},
				new ArrayList<String>() {{
					this.add("https://bevm.io/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.BEVMTEST, bevm_test);
		
		// mapprotocol
		EVMChainInfo mapprotocol = new EVMChainInfo(
				EVMChain.MAPPROTOCOL.toString(), 
				"MAPO Makalu Testnet", 
				22776L, 
				BlockchainType.PUBLIC.toString(), // unstable
				new EVMCurrency("MAPO Mainnet Gas Token", "MAPO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.maplabs.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://maposcan.io");
				}},
				new ArrayList<String>() {{
					this.add("<bridge to do>");
				}},
				new ArrayList<String>() {{
					this.add("https://mapprotocol.io/");
					this.add("https://www.coingecko.com/en/coins/map-protocol");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.MAPPROTOCOL, mapprotocol);
		
		// mapprotocol_test
		EVMChainInfo mapprotocol_test = new EVMChainInfo(
				EVMChain.MAPPROTOCOLTEST.toString(), 
				"MAPO Makalu Testnet", 
				212L, 
				BlockchainType.PUBLIC.toString(), // unstable
				new EVMCurrency("MAPO Makalu Testnet Gas Token", "MAPO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.maplabs.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.maposcan.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.mapprotocol.io");
				}},
				new ArrayList<String>() {{
					this.add("https://mapprotocol.io/");
					this.add("https://www.coingecko.com/en/coins/map-protocol");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.MAPPROTOCOLTEST, mapprotocol_test);
		
		// ancient8_test
		EVMChainInfo ancient8_test = new EVMChainInfo(
				EVMChain.ANCIENT8TEST.toString(), 
				"Ancient8 Testnet", 
				28122024L, 
				BlockchainType.PUBLIC.toString(), // unstable
				new EVMCurrency("Ancient8 Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpcv2-testnet.ancient8.gg");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scanv2-testnet.ancient8.gg");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("hhttps://ancient8.gg");
					this.add("https://chainlist.org/chain/28122024");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.ANCIENT8TEST, ancient8_test);
		
		// ancient8
		EVMChainInfo ancient8 = new EVMChainInfo(
				EVMChain.ANCIENT8.toString(), 
				"Ancient8", 
				888888888L, 
				BlockchainType.PUBLIC.toString(), // unstable
				new EVMCurrency("Ancient8 Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.ancient8.gg");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.ancient8.gg");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("hhttps://ancient8.gg");
					this.add("https://chainlist.org/chain/888888888");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.ANCIENT8, ancient8);
		
		// bstchain
		EVMChainInfo bstchain = new EVMChainInfo(
				EVMChain.BSTCHAIN.toString(), 
				"BST Chain", 
				7007L, 
				BlockchainType.PUBLIC.toString(), // unstable
				new EVMCurrency("BST Chain Gas Token", "BSTC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.bstchain.io/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://bstscan.com");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("hhttps://rpc.bstchain.io");
					this.add("https://chainlist.org/chain/323");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.BSTCHAIN, bstchain);

		// cosvm_mainnet
		EVMChainInfo cosvm_mainnet = new EVMChainInfo(
				EVMChain.COSVM.toString(), 
				"Cosvm Mainnet", 
				323L, 
				BlockchainType.BORKED.toString(), // expired ssl cert from only public node
				new EVMCurrency("Cosvm Mainnet Gas Token", "CVM", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.cosvm.net");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.cosvm.net");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://cosvm.network");
					this.add("https://chainlist.org/chain/323");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.COSVM, cosvm_mainnet);

		// bitfinity_test
		EVMChainInfo bitfinity_test = new EVMChainInfo(
				EVMChain.BITFINITYTEST.toString(), 
				"Bitfinity Network Testnet", 
				355113L, 
				BlockchainType.BORKED.toString(), // unstable
				new EVMCurrency("Bitfinity Network Testnet Gas Token", "BFT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://testnet.bitfinity.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.bitfinity.network");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/355113");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.BITFINITYTEST, bitfinity_test);

		// fibonacci
		EVMChainInfo fibonacci = new EVMChainInfo(
				EVMChain.FIBONACCI.toString(), 
				"Fibonacci Mainnet", 
				12306L, 
				BlockchainType.BORKED.toString(), // unstable
				new EVMCurrency("Fibonacci Mainnet Gas Token", "FIBO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://node1.fibo-api.asia");
					this.add("https://node2.fibo-api.asia");
					this.add("https://node1.fibo-rpc.asia");
					this.add("https://node2.fibo-rpc.asia");
					this.add("https://node3.fibo-rpc.asia");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.fibochain.org");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://fibochain.org");
					this.add("https://www.coingecko.com/en/coins/fibonacci");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.FIBONACCI, fibonacci);

		// mind
		EVMChainInfo mind = new EVMChainInfo(
				EVMChain.MIND.toString(), 
				"Mind Smart Chain Mainnet", 
				9996L, 
				BlockchainType.BORKED.toString(), // all nodes very unstable
				new EVMCurrency("Mind Smart Chain Mainnet Gas Token", "MIND", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc-msc.mindchain.info/");
					this.add("https://seednode.mindchain.info");
					this.add("https://archive.mindchain.info/");
					this.add("https://mind-smart-chain.rpc.thirdweb.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://mainnet.mindscan.info");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://mindscan.info");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.MIND, mind);

		// mind_test
		EVMChainInfo mind_test = new EVMChainInfo(
				EVMChain.MINDTEST.toString(), 
				"Mind Smart Chain Testnet", 
				9977L, 
				BlockchainType.BORKED.toString(), // single node dead
				new EVMCurrency("Mind Smart Chain Testnet Gas Token", "tMIND", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://testnet-msc.mindchain.info/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://mainnet.mindscan.info");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://mindscan.info");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.MINDTEST, mind_test);

		// hypra
		EVMChainInfo hypra = new EVMChainInfo(
				EVMChain.HYPRA.toString(), 
				"Hypra Mainnet", 
				622277L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Hypra Mainnet Gas Token", "HYP", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.hypra.network");
					this.add("https://rpc.rthcentral.org");
					this.add("https://hypra.rpc.thirdweb.com");
					this.add("https://rpc.rethereum.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.hypra.network");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://hypra.network");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.HYPRA, hypra);

		// soma_test
		EVMChainInfo soma_test = new EVMChainInfo(
				EVMChain.SOMATEST.toString(), 
				"SOMA Network Testnet", 
				2323L, 
				BlockchainType.BORKED.toString(), // 502 ... 502 ..
				new EVMCurrency("SOMA Network Testnet Gas Token", "tSMA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://data-testnet-v1.somanetwork.io/");
					this.add("https://testnet-au-server-2.somanetwork.io");
					this.add("https://testnet-au-server-1.somanetwork.io");
					this.add("https://testnet-sg-server-1.somanetwork.io");
					this.add("https://testnet-sg-server-2.somanetwork.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.somascan.io");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://somanetwork.io");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.SOMATEST, soma_test);

		// rotw_test
		EVMChainInfo rotw_test = new EVMChainInfo(
				EVMChain.ROTWTEST.toString(), 
				"Rise of the Warbots Testnet", 
				7777L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Rise of the Warbots Testnet Gas Token", "NMAC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://testnet1.rotw.games");
					this.add("https://testnet1.riseofthewarbots.com");
					this.add("https://testnet2.riseofthewarbots.com");
					this.add("https://testnet3.riseofthewarbots.com");
					this.add("https://testnet4.riseofthewarbots.com");
					this.add("https://testnet5.riseofthewarbots.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet.avascan.info/blockchain/2mZ9doojfwHzXN3VXDQELKnKyZYxv7833U8Yq5eTfFx3hxJtiy");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://riseofthewarbots.com/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.ROTWTEST, rotw_test);

		// quartzunique
		EVMChainInfo uniquequartz = new EVMChainInfo(
				EVMChain.QUARTZUNIQUE.toString(), 
				"Quartz by Unique", 
				8881L, 
				BlockchainType.BORKED.toString(), // online but borked
				new EVMCurrency("Quartz by Unique Gas Token", "QTZ", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc-quartz.unique.network");
					this.add("https://eu-rpc-quartz.unique.network");
					this.add("https://asia-rpc-quartz.unique.network");
					this.add("https://us-rpc-quartz.unique.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://uniquescan.io/quartz");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("unique.network");
					this.add("https://www.coingecko.com/en/coins/unique-network");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.QUARTZUNIQUE, uniquequartz);

		// unique
		EVMChainInfo unique = new EVMChainInfo(
				EVMChain.UNIQUE.toString(), 
				"Unique", 
				8880L, 
				BlockchainType.BORKED.toString(), // online but borked
				new EVMCurrency("Unique Gas Token", "UNQ", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.unique.network");
					this.add("https://eu-rpc.unique.network");
					this.add("https://asia-rpc.unique.network");
					this.add("https://us-rpc.unique.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://uniquescan.io/unique");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("unique.network");
					this.add("https://www.coingecko.com/en/coins/unique-network");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.UNIQUE, unique);

		// ontology_test
		EVMChainInfo ontology_test = new EVMChainInfo(
				EVMChain.ONTOLOGYTEST.toString(), 
				"Ontology Testnet", 
				5851L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Ontology Mainnet Gas Token", "ONG", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://polaris1.ont.io:10339");
					this.add("http://polaris1.ont.io:20339");
					this.add("http://polaris2.ont.io:20339");
					this.add("http://polaris3.ont.io:20339");
					this.add("http://polaris4.ont.io:20339");
					this.add("https://polaris2.ont.io:10339");
					this.add("https://polaris3.ont.io:10339");
					this.add("https://polaris4.ont.io:10339");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.ont.io/testnet");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://ont.io/");
					this.add("https://www.coingecko.com/en/coins/ontology");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.ONTOLOGYTEST, ontology_test);

		// ontology
		EVMChainInfo ontology = new EVMChainInfo(
				EVMChain.ONTOLOGY.toString(), 
				"Ontology Mainnet", 
				58L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Ontology Mainnet Gas Token", "UNQ", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://dappnode1.ont.io:10339");
					this.add("http://dappnode1.ont.io:20339");
					this.add("http://dappnode2.ont.io:20339");
					this.add("http://dappnode3.ont.io:20339");
					this.add("http://dappnode4.ont.io:20339");
					this.add("https://dappnode2.ont.io:10339");
					this.add("https://dappnode3.ont.io:10339");
					this.add("https://dappnode4.ont.io:10339");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.ont.io");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://ont.io/");
					this.add("https://www.coingecko.com/en/coins/ontology");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.ONTOLOGY, ontology);

		// edgeware
		EVMChainInfo edgeware = new EVMChainInfo(
				EVMChain.EDGEWARE.toString(), 
				"Unique", 
				2021L, 
				BlockchainType.BORKED.toString(), // online but weird
				new EVMCurrency("Unique Gas Token", "UNQ", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://mainnet2.edgewa.re/evm");
					this.add("https://edgeware-evm.jelliedowl.net");
					this.add("https://mainnet3.edgewa.re/evm");
					this.add("https://mainnet4.edgewa.re/evm");
					this.add("https://mainnet5.edgewa.re/evm");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://edgscan.live");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://www.edgeware.io/");
					this.add("https://www.coingecko.com/en/coins/edgeware");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.EDGEWARE, edgeware);

		// bitgert
		EVMChainInfo bitgert = new EVMChainInfo(
				EVMChain.BITGERT.toString(), 
				"Bitgert Mainnet", 
				32520L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Bitgert Mainnet Gas Token", "Brise", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.icecreamswap.com");
					this.add("https://mainnet-rpc.brisescan.com");
					this.add("https://chainrpc.com");
					this.add("https://serverrpc.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.hypra.network");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://brisescan.com");
					this.add("https://www.coingecko.com/en/coins/bitgert");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.BITGERT, bitgert);

		// eluvio
		EVMChainInfo eluvio = new EVMChainInfo(
				EVMChain.ELUVIO.toString(), 
				"Eluvio Content Fabric", 
				955305L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Eluvio Content Fabric Gas Token", "ELV", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://host-76-74-28-226.contentfabric.io/eth");
					this.add("https://host-76-74-29-35.contentfabric.io/eth/");
					this.add("https://host-154-14-211-98.contentfabric.io/eth/");
					this.add("https://host-154-14-192-66.contentfabric.io/eth/");
					this.add("https://host-64-235-250-98.contentfabric.io/eth/");
					this.add("https://host-76-74-28-232.contentfabric.io/eth/");
					this.add("https://host-76-74-29-2.contentfabric.io/eth/");
					this.add("https://host-76-74-29-8.contentfabric.io/eth/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.hypra.network");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://explorer.eluv.io");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.ELUVIO, eluvio);

		// defichain
		EVMChainInfo defichain = new EVMChainInfo(
				EVMChain.DEFICHAIN.toString(), 
				"DeFiChain EVM Network Mainnet", 
				1130L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("DeFiChain Gas Token", "DFI", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://dmc.mydefichain.com/mainnet");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://meta.defichain.com/");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://defichain.com/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.DEFICHAIN, defichain);

		// defichain_test
		EVMChainInfo defichain_test = new EVMChainInfo(
				EVMChain.DEFICHAINTEST.toString(), 
				"DeFiChain EVM Network Mainnet", 
				1131L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("DeFiChain Testnet Gas Token", "DFI", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://dmc.mydefichain.com/testnet");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://meta.defichain.com/");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://defichain.com/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.DEFICHAINTEST, defichain_test);

		// coredao
		EVMChainInfo coredao = new EVMChainInfo(
				EVMChain.CORE.toString(), 
				"Core DAO Mainnet", 
				1116L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Core Gas Token", "CORE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.coredao.org/");
					this.add("https://rpc-core.icecreamswap.com");	
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.coredao.org");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge.coredao.org/");
				}},
				new ArrayList<String>() {{
					this.add("https://coredao.org/");
				}},
				generateCoreTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.CORE, coredao);

		// metadium_test
		EVMChainInfo metadium_test = new EVMChainInfo(
				EVMChain.METADIUMTEST.toString(), 
				"Metadium Testsnet", 
				12L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Metadium Testnet Gas Token", "KAL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://api.metadium.com/dev");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.metadium.com/");
				}},
				new ArrayList<String>() {{
					this.add("<faucet-todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://metadium.com");
					this.add("https://www.coingecko.com/en/coins/metadium");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.METADIUMTEST, metadium_test);

		// metadium
		EVMChainInfo metadium = new EVMChainInfo(
				EVMChain.METADIUM.toString(), 
				"Metadium Mainnet", 
				11L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Metadium Gas Token", "META", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://api.metadium.com/prod");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.metadium.com/");
				}},
				new ArrayList<String>() {{
					this.add("<faucet-todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://metadium.com");
					this.add("https://www.coingecko.com/en/coins/metadium");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.METADIUM, metadium);

		// optimism
		EVMChainInfo optimism = new EVMChainInfo(
				EVMChain.OPTIMISM.toString(), 
				"Optimism Mainnet", 
				10L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Optimism Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://mainnet.optimism.io");
					this.add("https://optimism.publicnode.com");
					this.add("https://optimism.gateway.tenderly.co");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://optimistic.etherscan.io");
				}},
				new ArrayList<String>() {{
					this.add("<faucet-todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://www.optimism.io/");
					this.add("https://chainid.link/?network=optimism");
				}},
				generateOptimismTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.OPTIMISM, optimism);

		// optimism_goerli_test
		EVMChainInfo optimism_goerli_test = new EVMChainInfo(
				EVMChain.OPTIMISMGOERLITEST.toString(), 
				"Optimism Goerli Testnet", 
				420L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Optimism Gas Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://endpoints.omniatech.io/v1/op/goerli/public");
					this.add("https://opt-goerli.g.alchemy.com/v2/demo");
					this.add("https://goerli.optimism.io");
					this.add("https://optimism-goerli.public.blastapi.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://optimistic.etherscan.io/");
				}},
				new ArrayList<String>() {{
					this.add("https://goerli.hop.exchange/");
				}},
				new ArrayList<String>() {{
					this.add("https://www.optimism.io/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.OPTIMISMGOERLITEST, optimism_goerli_test);

		// mode_test
		EVMChainInfo mode_test = new EVMChainInfo(
				EVMChain.MODETEST.toString(), 
				"MODE Testnet", 
				919L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Mode Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers ..
				new ArrayList<String>() {{
					this.add("https://sepolia.mode.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sepolia.explorer.mode.network");
				}},
				new ArrayList<String>() {{
					this.add("https://www.mode.network");
				}},
				new ArrayList<String>() {{
					this.add("https://confluxnetwork.org/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.MODETEST, mode_test);

		// conflux_test
		EVMChainInfo conflux_test = new EVMChainInfo(
				EVMChain.CONFLUXTEST.toString(), 
				"Conflux Testnet", 
				71L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Conflux Token", "CFX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers ..
				new ArrayList<String>() {{
					this.add("https://evmtestnet.confluxrpc.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://evmtestnet.confluxscan.net");
				}},
				new ArrayList<String>() {{
					this.add("https://efaucet.confluxnetwork.org/");
				}},
				new ArrayList<String>() {{
					this.add("https://confluxnetwork.org/");
				}},
				generateConfluxTestnetTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.CONFLUXTEST, conflux_test);

		// conflux
		EVMChainInfo conflux = new EVMChainInfo(
				EVMChain.CONFLUX.toString(), 
				"Conflux eSpace", 
				1030L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Conflux Token", "CFX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://evm.confluxrpc.com");
					this.add("https://conflux-espace-public.unifra.io"); // quickly gives 429 rate limit ..
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://evm.confluxscan.net");
					this.add("https://conflux-espace-public.unifra.io");
				}},
				new ArrayList<String>() {{
					this.add("faucet todo");
				}},
				new ArrayList<String>() {{
					this.add("https://confluxnetwork.org/");
				}},
				generateConfluxTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.CONFLUX, conflux);

		// zetachain_athens_testnet
		EVMChainInfo zetachain_athens_testnet = new EVMChainInfo(
				EVMChain.ZETAATHENSTEST.toString(), 
				"ZetaChain Athens Testnet", 
				7001L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Zetachain Testnet Token", "aZETA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://zetachain-athens-evm.blockpi.network/v1/rpc/public");
					this.add("https://rpc.ankr.com/zetachain_evm_athens_testnet");

					// https://www.zetachain.com/docs/reference/api/
					this.add("https://rpc.ankr.com/zetachain_evm_testnet");
					//this.add("https://api.athens2.zetachain.com/evm"); // gives incorrect nonce quite often
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://athens3.explorer.zetachain.com");
					this.add("https://explorer.athens.zetachain.com");
				}},
				new ArrayList<String>() {{
					this.add("https://labs.zetachain.com/get-zeta");
				}},
				new ArrayList<String>() {{
					this.add("https://www.zetachain.com/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.ZETAATHENSTEST, zetachain_athens_testnet);

		// kava
		EVMChainInfo kava = new EVMChainInfo(
				EVMChain.KAVA.toString(), 
				"KAVA Evm Mainnet", 
				2222L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("KAVA Token", "KAVA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers ..
				new ArrayList<String>() {{
					this.add("https://evm2.kava.io");
					this.add("https://evm.kava.io");
					this.add("https://kava-rpc.gateway.pokt.network");
					this.add("https://evm.kava.chainstacklabs.com");
					this.add("https://kava-evm.publicnode.com");
					this.add("https://evm.kava-rpc.com");
					this.add("https://rpc.ankr.com/kava_evm");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.kava.io/");
				}},
				new ArrayList<String>() {{
					this.add("faucet-todo");
				}},
				new ArrayList<String>() {{
					this.add("https://kava.io");
					this.add("https://docs.kava.io/docs/ethereum/metamask/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.KAVA, kava);

		// kavatest
		EVMChainInfo kavatest = new EVMChainInfo(
				EVMChain.KAVATEST.toString(), 
				"KAVA Evm Testnet", 
				2221L, 
				BlockchainType.BORKED.toString(), // unstable
				new EVMCurrency("KAVA Testnet Token", "KAVA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"30000", //only give enough to enable transfers .. gas limit too low: 21000 (gas limit) < 21596 (intrinsic gas): out of gas:gas limit too low: 21000 (gas limit) < 21596 (intrinsic gas): out of gas:gas limit too low: 21000 (gas limit) < 21596 (intrinsic gas): out of gas:
				new ArrayList<String>() {{
					this.add("https://evm.testnet.kava.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.kava.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.kava.io/");
				}},
				new ArrayList<String>() {{
					this.add("https://kava.io");
					this.add("https://docs.kava.io/docs/ethereum/metamask/");
				}},
				generateKavaTestTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.KAVATEST, kavatest);

		// scroll_alphatest
		EVMChainInfo scroll_alphatest = new EVMChainInfo(
				EVMChain.SCROLLALPHATEST.toString(), 
				"Scroll Alpha Testnet", 
				534353L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Scroll Alpha Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://alpha-rpc.scroll.io/l2");
					this.add("https://scroll-alphanet.public.blastapi.io");
					this.add("https://scroll-testnet.blockpi.network/v1/rpc/public");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://blockscout.scroll.io");
				}},
				new ArrayList<String>() {{
					this.add("https://scroll.io/alpha/bridge");
				}},
				new ArrayList<String>() {{
					this.add("https://scroll.io");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.SCROLLALPHATEST, scroll_alphatest);

		// scroll
		EVMChainInfo scroll = new EVMChainInfo(
				EVMChain.SCROLL.toString(), 
				"Scroll Mainnet", 
				534352L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Scroll Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://scroll.blockpi.network/v1/rpc/public");
					this.add("https://rpc-scroll.icecreamswap.com");
					this.add("https://rpc.scroll.io");
					this.add("https://1rpc.io/scroll");
					this.add("https://rpc.ankr.com/scroll");
					this.add("https://scroll-mainnet.chainstacklabs.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://blockscout.scroll.io");
				}},
				new ArrayList<String>() {{
					this.add("https://scroll.io/bridge");
				}},
				new ArrayList<String>() {{
					this.add("https://scroll.io");
				}},
				generateScrollTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.SCROLL, scroll);

		// etc
		EVMChainInfo etc = new EVMChainInfo(
				EVMChain.ETC.toString(), 
				"Ethereum Classic Mainnet", 
				61L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Ethereum Classic Gas Token", "ETC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://etc.rivet.link");
					this.add("https://etc.etcdesktop.com");
					this.add("https://etc.mytokenpocket.vip");
					this.add("https://besu-at.etc-network.info");
					this.add("https://besu-de.etc-network.info");
					this.add("https://geth-at.etc-network.info");
					this.add("https://geth-de.etc-network.info");
					this.add("https://rpc.etcinscribe.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://blockscout.com/etc/mainnet");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://www.coingecko.com/en/coins/ethereum-classic");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.ETC, etc);

		// etc_mordor_test
		EVMChainInfo etc_mordor_test = new EVMChainInfo(
				EVMChain.ETCMORDORTEST.toString(), 
				"Mordor Testnet, for Ethereum Classic", 
				63L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Ethereum Classic Mordor Testnet Gas Token", "METC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://geth-mordor.etc-network.info");
					this.add("https://rpc.mordor.etccooperative.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://blockscout.com/etc/mordor");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://www.coingecko.com/en/coins/ethereum-classic");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.ETCMORDORTEST, etc_mordor_test);

		// okx
		EVMChainInfo okx = new EVMChainInfo(
				EVMChain.OKX.toString(), 
				"OKXChain Mainnet", 
				66L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("OKXChain Mainnet Gas Token", "OKT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://exchainrpc.okex.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://www.oklink.com/en/okc");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://www.okx.com/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.OKX, okx);

		// okx_test
		EVMChainInfo okx_test = new EVMChainInfo(
				EVMChain.OKXTEST.toString(), 
				"OKXChain Testnet", 
				65L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("OKXChain Testnet Gas Token", "OKT", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://exchaintestrpc.okex.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://www.oklink.com/en/okc");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://www.okx.com/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.OKXTEST, okx_test);

		// scroll_sepoliatest
		EVMChainInfo scroll_sepoliatest = new EVMChainInfo(
				EVMChain.SCROLLSEPOLIATEST.toString(), 
				"Scroll Sepolia Testnet", 
				534351L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Scroll Testnet Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://scroll-sepolia.blockpi.network/v1/rpc/public");
					this.add("https://sepolia-rpc.scroll.io");
					this.add("https://scroll-public.scroll-testnet.quiknode.pro");
					this.add("https://rpc.ankr.com/scroll_sepolia_testnet");
					this.add("https://scroll-testnet-public.unifra.io");
					this.add("https://1rpc.io/scroll/sepolia");
					this.add("https://scroll-sepolia.chainstacklabs.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://sepolia.scrollscan.dev");
				}},
				new ArrayList<String>() {{
					this.add("https://sepolia.scroll.io/bridge");
				}},
				new ArrayList<String>() {{
					this.add("https://scroll.io");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.SCROLLSEPOLIATEST, scroll_sepoliatest);

		// linea
		EVMChainInfo linea = new EVMChainInfo(
				EVMChain.LINEA.toString(), 
				"Linea Mainnet", 
				59144L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Linea Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1600000000", //1.6 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.linea.build");
					this.add("https://linea.drpc.org");
					this.add("https://linea.blockpi.network/v1/rpc/public");
					this.add("https://1rpc.io/linea");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://lineascan.build");
				}},
				new ArrayList<String>() {{
					this.add("faucet-todo");
				}},
				new ArrayList<String>() {{
					this.add("https://linea.build/");
				}},
				generateLineaTokenIndex(),
				generateLineaNFTIndex());
		networks.put(EVMChain.LINEA, linea);

		// bifrost
		EVMChainInfo bifrost = new EVMChainInfo(
				EVMChain.BIFROST.toString(), 
				"Bifrost Mainnet", 
				3068L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Bifrost Token", "BFC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1600000000", //1.6 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://public-01.mainnet.thebifrost.io/rpc");
					this.add("https://public-02.mainnet.thebifrost.io/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.mainnet.thebifrost.io");
				}},
				new ArrayList<String>() {{
					this.add("faucet-todo");
				}},
				new ArrayList<String>() {{
					this.add("https://www.coingecko.com/en/coins/bifrost");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.BIFROST, bifrost);

		// xodex
		EVMChainInfo xodex = new EVMChainInfo(
				EVMChain.XODEX.toString(), 
				"XODEX", 
				2415L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Bifrost Token", "XODEX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1600000000", //1.6 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://mainnet.xo-dex.com/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.xo-dex.com");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge.xodex.app/transfer");
				}},
				new ArrayList<String>() {{
					this.add("https://www.xo-dex.com/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.XODEX, xodex);

		// bifrost_test
		EVMChainInfo bifrost_test = new EVMChainInfo(
				EVMChain.BIFROSTTEST.toString(), 
				"Bifrost Testnet", 
				49088L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Bifrost Testnet Token", "BFC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1600000000", //1.6 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://public-01.testnet.thebifrost.io/rpc");
					this.add("https://public-02.testnet.thebifrost.io/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.thebifrost.io");
				}},
				new ArrayList<String>() {{
					this.add("https://www.bifrostnetwork.com/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://www.coingecko.com/en/coins/bifrost");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.BIFROSTTEST, bifrost_test);

		// linea_test
		EVMChainInfo linea_test = new EVMChainInfo(
				EVMChain.LINEATEST.toString(), 
				"Linea Testnet", 
				59140L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Linea Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"1600000000", //1.6 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. 
				new ArrayList<String>() {{
					this.add("https://rpc.goerli.linea.build"); // only one, unstable
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.goerli.linea.build");
				}},
				new ArrayList<String>() {{
					this.add("faucet-todo");
				}},
				new ArrayList<String>() {{
					this.add("https://linea.build/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.LINEATEST, linea_test);

		// pulsechain
		EVMChainInfo pulsechain = new EVMChainInfo(
				EVMChain.PULSECHAIN.toString(), 
				"PulseChain", 
				369L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("PulseChain Token", "PLS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. crazy usage atm
				new ArrayList<String>() {{
					this.add("https://rpc.pulsechain.com");
					this.add("https://rpc-pulsechain.g4mm4.io");
					this.add("https://pulsechain.publicnode.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.pulsechain.com");
				}},
				new ArrayList<String>() {{
					this.add("faucet-todo");
				}},
				new ArrayList<String>() {{
					this.add("https://pulsechain.com/");
				}},
				generatePulsechainTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.PULSECHAIN, pulsechain);

		// pulsechain4_test
		EVMChainInfo pulsechain4_test = new EVMChainInfo(
				EVMChain.PULSECHAIN4TEST.toString(), 
				"PulseChain Testnet v4", 
				943L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("PulseChain Testnet Token", "tPLS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. crazy usage atm
				new ArrayList<String>() {{
					this.add("https://pulsetest-s.projectpi.xyz");
					this.add("https://rpc.v4.testnet.pulsechain.com");
					this.add("https://pulsechain-testnet.publicnode.com");
					this.add("https://rpc-testnet-pulsechain.g4mm4.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.v4.testnet.pulsechain.com");
				}},
				new ArrayList<String>() {{
					this.add("faucet-todo");
				}},
				new ArrayList<String>() {{
					this.add("https://pulsechain.com/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.PULSECHAIN4TEST, pulsechain4_test);

		// satoshichain
		EVMChainInfo satoshichain = new EVMChainInfo(
				EVMChain.SATOSHICHAIN.toString(), 
				"SatoshiChain Mainnet", 
				12009L, 
				BlockchainType.BORKED.toString(), 
				new EVMCurrency("SATS Token", "SATS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"550030000000000", //550030 gwei, recommended 550k+ gwei default?
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. crazy usage atm
				new ArrayList<String>() {{
					this.add("https://mainnet-rpc.satoshichain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://satoshiscan.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.satoshichain.io/");
				}},
				new ArrayList<String>() {{
					this.add("https://satoshichain.medium.com/important-announcement-regarding-satoshichain-transitioning-forward-cf320190f2dc");
					this.add("https://satoshix.io/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.SATOSHICHAIN, satoshichain);

		// satoshichaintest
		EVMChainInfo satoshichaintest = new EVMChainInfo(
				EVMChain.SATOSHICHAINTEST.toString(), 
				"SatoshiChain Testnet", 
				5758L, 
				BlockchainType.BORKED.toString(), // not ready
				new EVMCurrency("SATS Token", "SATS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"550030000000000", //550030 gwei, recommended 550k+ gwei default?
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. crazy usage atm
				new ArrayList<String>() {{
					this.add("https://testnet-rpc.satoshichain.io/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://satoshiscan.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.satoshichain.io/");
				}},
				new ArrayList<String>() {{
					this.add("https://satoshichain.medium.com/important-announcement-regarding-satoshichain-transitioning-forward-cf320190f2dc");
					this.add("https://satoshix.io/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.SATOSHICHAINTEST, satoshichaintest);

		// zkevm
		EVMChainInfo zkevm = new EVMChainInfo(
				EVMChain.ZKEVM.toString(), 
				"Polygon ZKEVM Network", 
				1101L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("ETH Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://zkevm-rpc.com");
					this.add("https://rpc.polygon-zkevm.gateway.fm");
					this.add("https://rpc.ankr.com/polygon_zkevm");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://zkevm.polygonscan.com/");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge.zkevm-rpc.com/");
				}},
				new ArrayList<String>() {{
					this.add("https://wiki.polygon.technology/docs/zkEVM/develop");
				}},
				generateZKEVMTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.ZKEVM, zkevm);

		// zkevmtest
		EVMChainInfo zkevmtest = new EVMChainInfo(
				EVMChain.ZKEVMTEST.toString(), 
				"Polygon ZKEVM Test Network", 
				1442L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("ETH Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.public.zkevm-test.net");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-zkevm.polygonscan.com");
				}},
				new ArrayList<String>() {{
					this.add("https://wallet.polygon.technology/zkEVM-Bridge/bridge");
				}},
				new ArrayList<String>() {{
					this.add("https://wiki.polygon.technology/docs/zkEVM/develop");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.ZKEVMTEST, zkevmtest);

		// ethotest
		EVMChainInfo ethotest = new EVMChainInfo(
				EVMChain.ETHOTEST.toString(), 
				"ETHO HC Test Network", 
				27292L, 
				BlockchainType.PUBLIC.toString(), // not ready
				new EVMCurrency("ETHOTest Token", "ETHO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnetrpc.ethoprotocol.com/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnetexplorer.ethoprotocol.com/");
				}},
				new ArrayList<String>() {{
					this.add("<faucet to do>");
				}},
				new ArrayList<String>() {{
					this.add("https://docs.ethoprotocol.com/install-metamask");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.ETHOTEST, ethotest);

		// basetest
		EVMChainInfo basetest = new EVMChainInfo(
				EVMChain.BASEGOERLITEST.toString(), 
				"Base Goerli Test Network", 
				84531L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Base Goerli Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://goerli.base.org");
					this.add("https://base-goerli.public.blastapi.io");
					this.add("https://base-goerli.diamondswap.org/rpc");
					this.add("https://1rpc.io/base-goerli");
					this.add("https://base-goerli.publicnode.com");
					this.add("https://base-goerli.gateway.tenderly.co");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://goerli.basescan.org");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge.base.org/");
				}},
				new ArrayList<String>() {{
					this.add("https://base.org/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.BASEGOERLITEST, basetest);

		// xpla
		EVMChainInfo xpla = new EVMChainInfo(
				EVMChain.XPLA.toString(), 
				"Xpla Mainnet", 
				37L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Xpla Gas Token", "XPLA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://dimension-evm-rpc.xpla.dev");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.xpla.io/mainnet");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://xpla.io/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.XPLA, xpla);

		// beam_test
		EVMChainInfo beam_test = new EVMChainInfo(
				EVMChain.BEAMTEST.toString(), 
				"Beam Testnet", 
				13337L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Beam Gas Token", "BEAM", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/beam/testnet/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://subnets-test.avax.network/beam");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://meritcircle.io/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.BEAMTEST, beam_test);

		// beam
		EVMChainInfo beam = new EVMChainInfo(
				EVMChain.BEAM.toString(), 
				"Beam Mainnet", 
				4337L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Beam Gas Token", "BEAM", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/beam/mainnet/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://subnets.avax.network/beam");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://meritcircle.io/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.BEAM, beam);

		// zilliqa
		EVMChainInfo zilliqa = new EVMChainInfo(
				EVMChain.ZILLIQA.toString(), 
				"Zilliqa Mainnet", 
				32769L, 
				BlockchainType.BORKED.toString(), // single node down
				new EVMCurrency("Zilliqa Gas Token", "ZIL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://api.zilliqa.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://evmx.zilliqa.com");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/32769");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.ZILLIQA, zilliqa);

		// zilliqa_test
		EVMChainInfo zilliqa_test = new EVMChainInfo(
				EVMChain.ZILLIQATEST.toString(), 
				"Zilliqa Testnet", 
				33101L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Zilliqa Testnet Gas Token", "ZIL", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://dev-api.zilliqa.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://evmx.zilliqa.com");
				}},
				new ArrayList<String>() {{
					this.add("<todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/33101");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.ZILLIQATEST, zilliqa_test);

		// opsep
		EVMChainInfo opsep = new EVMChainInfo(
				EVMChain.OPTIMISMSEPOLIATEST.toString(), 
				"OP Sepolia Testnet", 
				11155420L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("OP Sepolia Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://sepolia.optimism.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://optimism-sepolia.blockscout.com");
				}},
				new ArrayList<String>() {{
					this.add("<faucet>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/11155420");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.OPTIMISMSEPOLIATEST, opsep);

		// basesep
		EVMChainInfo basesep = new EVMChainInfo(
				EVMChain.BASESEPOLIATEST.toString(), 
				"Base Sepolia Test Network", 
				84532L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Base Sepolia Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://sepolia.base.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://base-sepolia.blockscout.com");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge.base.org/");
				}},
				new ArrayList<String>() {{
					this.add("https://base.org/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.BASESEPOLIATEST, basesep);

		// oasissapphiretest
		EVMChainInfo oasissapphiretest = new EVMChainInfo(
				EVMChain.OASISSAPPHIRETEST.toString(), 
				"Oasis Sapphire Test Network", 
				23295L, 
				BlockchainType.BORKED.toString(), // not ready
				new EVMCurrency("Oasis Test Token", "TEST", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet.sapphire.oasis.dev");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.sapphire.oasis.io/");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.testnet.oasis.dev/");
				}},
				new ArrayList<String>() {{
					this.add("https://oasisprotocol.org/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.OASISSAPPHIRETEST, oasissapphiretest);

		// oasisemerald
		EVMChainInfo oasisemeraldtest = new EVMChainInfo(
				EVMChain.OASISEMERALDTEST.toString(), 
				"Oasis Emerald Test Network", 
				42261L, 
				BlockchainType.BORKED.toString(), // testnet.emerald.oasis.dev often unavailable
				new EVMCurrency("Oasis Test Token", "TEST", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet.emerald.oasis.dev/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.emerald.oasis.dev/");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.testnet.oasis.dev/");
				}},
				new ArrayList<String>() {{
					this.add("https://oasisprotocol.org/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.OASISEMERALDTEST, oasisemeraldtest);

		// oasissapphire
		EVMChainInfo oasissapphire = new EVMChainInfo(
				EVMChain.OASISSAPPHIRE.toString(), 
				"Oasis Sapphire Network", 
				23294L, 
				BlockchainType.PUBLIC.toString(), 
				new EVMCurrency("Oasis Token", "ROSE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://sapphire.oasis.io");
					this.add("https://1rpc.io/oasis/sapphire");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.sapphire.oasis.io/");
				}},
				new ArrayList<String>() {{
					this.add("faucet-todo");
				}},
				new ArrayList<String>() {{
					this.add("https://oasisprotocol.org/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.OASISSAPPHIRE, oasissapphire);

		// oasisemerald
		EVMChainInfo oasisemerald = new EVMChainInfo(
				EVMChain.OASISEMERALD.toString(), 
				"Oasis Emerald Network", 
				42262L, 
				BlockchainType.PUBLIC.toString(), 
				new EVMCurrency("Oasis Token", "ROSE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://emerald.oasis.dev");
					this.add("https://1rpc.io/oasis/emerald");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.emerald.oasis.dev/");
				}},
				new ArrayList<String>() {{
					this.add("faucet-todo");
				}},
				new ArrayList<String>() {{
					this.add("https://oasisprotocol.org/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.OASISEMERALD, oasisemerald);

		// oasischain
		EVMChainInfo oasischain = new EVMChainInfo(
				EVMChain.OASISCHAIN.toString(), 
				"Oasis Chain", 
				26863L, 
				BlockchainType.PUBLIC.toString(), 
				new EVMCurrency("Oasis Token", "OAC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc1.oasischain.io");
					this.add("https://rpc2.oasischain.io");
					this.add("https://rpc3.oasischain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://scan.oasischain.io/");
				}},
				new ArrayList<String>() {{
					this.add("faucet-todo");
				}},
				new ArrayList<String>() {{
					this.add("https://oasischain.io/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.OASISCHAIN, oasischain);

		// canto
		EVMChainInfo canto = new EVMChainInfo(
				EVMChain.CANTO.toString(), 
				"Canto Network", 
				7700L, 
				BlockchainType.PUBLIC.toString(), 
				new EVMCurrency("Canto Token", "CANTO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://canto.gravitychain.io");
					this.add("https://canto.slingshot.finance/");
					this.add("https://canto.evm.chandrastation.com/");
					this.add("https://jsonrpc.canto.nodestake.top");
					this.add("https://canto.slingshot.finance");
					this.add("https://mainnode.plexnode.org:8545");
					this.add("https://canto.gravitychain.io/");
					this.add("https://jsonrpc.canto.nodestake.top/");

					//this.add("https://canto.neobase.one/"); // dead
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://tuber.build/");
				}},
				new ArrayList<String>() {{
					this.add("faucet-todo");
				}},
				new ArrayList<String>() {{
					this.add("https://docs.canto.io/user-guides/connecting-to-canto");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.CANTO, canto);

		// cantotest
		EVMChainInfo cantotest = new EVMChainInfo(
				EVMChain.CANTOTEST.toString(), 
				"Canto Test Network", 
				7701L, 
				BlockchainType.BORKED.toString(), // single rpc node is down
				new EVMCurrency("Canto Test Token", "CANTO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"21000", //only give enough to enable transfers .. crazy usage atm
				new ArrayList<String>() {{
					this.add("https://eth.plexnode.wtf");
					this.add("https://testnet-archive.plexnode.wtf");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://testnet-explorer.canto.neobase.one/");
				}},
				new ArrayList<String>() {{
					this.add("https://discord.com/invite/canto, social-faucet channel");
				}},
				new ArrayList<String>() {{
					this.add("https://docs.canto.io/user-guides/connecting-to-canto");
					this.add("https://chainlist.org/chain/740");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.CANTOTEST, cantotest);

		// taikotest_alpha2
		EVMChainInfo taikotest_alpha5 = new EVMChainInfo(
				EVMChain.TAIKOALPHA5TEST.toString(), 
				"Taiko Ethereum A5 Test Network", 
				167007L, 
				BlockchainType.BORKED.toString(), // next alphanet
				new EVMCurrency("Taiko A5 Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://taiko-jolnir.blockpi.network/v1/rpc/public");
					//this.add("https://rpc.jolnir.taiko.xyz"); // old account balance reply but latestblocknr?  
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.jolnir.taiko.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge.jolnir.taiko.xyz/");
				}},
				new ArrayList<String>() {{
					this.add("https://taiko.xyz");
					this.add("https://chainlist.org/chain/167007");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.TAIKOALPHA5TEST, taikotest_alpha5);

		// taikotest_alpha2
		EVMChainInfo taikotest_alpha2 = new EVMChainInfo(
				EVMChain.TAIKOALPHA2TEST.toString(), 
				"Taiko Ethereum A2 Test Network", 
				167004L, 
				BlockchainType.BORKED.toString(), // now alpha3
				new EVMCurrency("Taiko A2 Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.a2.taiko.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.a2.taiko.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge.test.taiko.xyz/");
				}},
				new ArrayList<String>() {{
					this.add("https://taiko.xyz");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.TAIKOALPHA2TEST, taikotest_alpha2);

		// taikotest_alpha3
		EVMChainInfo taikotest_alpha3 = new EVMChainInfo(
				EVMChain.TAIKOALPHA3TEST.toString(), 
				"Taiko Ethereum A3 Test Network", 
				167005L, 
				BlockchainType.BORKED.toString(),
				new EVMCurrency("Taiko A3 Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.test.taiko.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://explorer.test.taiko.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://bridge.test.taiko.xyz/");
				}},
				new ArrayList<String>() {{
					this.add("https://taiko.xyz");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.TAIKOALPHA3TEST, taikotest_alpha3);

		// taikotest_alpha
		EVMChainInfo taikotest_alpha = new EVMChainInfo(
				EVMChain.TAIKOALPHATEST.toString(), 
				"Taiko Ethereum A1 Test Network", 
				167003L, 
				BlockchainType.BORKED.toString(), // endpoints/explorers from docs no longer resolve
				new EVMCurrency("Taiko A1 Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://l2rpc.a1.taiko.xyz");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://l2explorer.a1.taiko.xyz");
				}},
				new ArrayList<String>() {{
					this.add("https://l2faucet.a1.taiko.xyz/");
				}},
				new ArrayList<String>() {{
					this.add("https://taiko.xyz/docs/alpha-1-testnet/configure-wallet");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.TAIKOALPHATEST, taikotest_alpha);

		// syscoin_test
		EVMChainInfo syscoin_test = new EVMChainInfo(
				EVMChain.SYSCOINTEST.toString(), 
				"Syscoin Tanenbaum Testnet", 
				5700L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Syscoin test token", "tSYS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					//this.add("https://rollux.rpc.tanenbaum.io"); // ??
					this.add("https://rpc.tanenbaum.io");
					this.add("https://syscoin-tanenbaum-evm.publicnode.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://explorer.syscoin.org");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.syscoin.org/");
				}},
				new ArrayList<String>() {{
					this.add("https://tanenbaum.io");
					this.add("https://www.coingecko.com/en/coins/syscoin");
					this.add("https://bridge.syscoin.org");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.SYSCOINTEST, syscoin_test);

		// syscoin
		EVMChainInfo syscoin = new EVMChainInfo(
				EVMChain.SYSCOIN.toString(), 
				"SYSCoin Mainnet", 
				57L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("SYS", "SYS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.syscoin.org");
					this.add("https://syscoin-evm.publicnode.com");
					this.add("https://rpc.ankr.com/syscoin");
					this.add("https://syscoin.public-rpc.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://explorer.syscoin.org");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.syscoin.org/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/57");
					this.add("https://syscoin.medium.com/setting-up-metamask-for-syscoin-nevm-ea0012d6d1c8");
					this.add("https://www.coingecko.com/en/coins/syscoin");
					this.add("https://bridge.syscoin.org");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.SYSCOIN, syscoin);

		// milkomediaC1
		EVMChainInfo milkomedaC1 = new EVMChainInfo(
				EVMChain.MILKOMEDAC1.toString(), 
				"Milkomeda Cardano mainnet", 
				2001L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("milkADA", "mADA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-mainnet-cardano-evm.c1.milkomeda.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://explorer-mainnet-cardano-evm.c1.milkomeda.com/");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2001");
					this.add("https://app.blueshift.fi/#/bridge");
				}},
				generateMilkomedaC1TokenIndex(),
				generateMilkomedaC1NFTIndex());
		networks.put(EVMChain.MILKOMEDAC1, milkomedaC1);

		// milkomediaA1
		EVMChainInfo milkomediaA1 = new EVMChainInfo(
				EVMChain.MILKOMEDAA1.toString(), 
				"Milkomeda Algorand mainnet", 
				2002L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("milkALGO", "milkALGO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-mainnet-algorand-rollup.a1.milkomeda.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://explorer-mainnet-algorand-rollup.a1.milkomeda.com");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/2002");
					this.add("https://dcspark.github.io/milkomeda-documentation/algorand/for-end-users/configuring-metamask/");
					this.add("https://algorand-bridge.milkomeda.com/mainnet");
				}},
				generateMilkomedaA1TokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.MILKOMEDAA1, milkomediaA1);

		// milkomediatestA1
		EVMChainInfo milkomediatestA1 = new EVMChainInfo(
				EVMChain.MILKOMEDAA1TEST.toString(), 
				"Milkomeda Algorand testnet", 
				200202L, 
				BlockchainType.BORKED.toString(), // closing down in 2023, mainnet 2024
				new EVMCurrency("milkTALGO", "milkTALGO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-devnet-algorand-rollup.a1.milkomeda.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://testnet-algorand-rollup.a1.milkomeda.com");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/200202");
					this.add("https://dcspark.github.io/milkomeda-documentation/algorand/for-end-users/configuring-metamask/");
					this.add("https://algorand-bridge.milkomeda.com/devnet/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.MILKOMEDAA1TEST, milkomediatestA1);

		// wemix_test
		EVMChainInfo wemix_test = new EVMChainInfo(
				EVMChain.WEMIXTEST.toString(), 
				"WEMIX3.0 Testnet", 
				1112L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("WEMIX", "tWEMIX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"101000000000", //101 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://api.test.wemix.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://microscope.test.wemix.com");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1112");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.WEMIXTEST, wemix_test);

		// wemix
		EVMChainInfo wemix = new EVMChainInfo(
				EVMChain.WEMIX.toString(), 
				"WEMIX mainnet", 
				1111L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("WEMIX", "WEMIX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"101000000000", //101 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://api.wemix.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://explorer.wemix.com");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1111");
					this.add("https://medium.com/wemix-communication/metamask-wemix3-0-mainnet-setting-guide-1a249fcaf866");
				}},
				generateWemixTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.WEMIX, wemix);

		// arbitrum one
		EVMChainInfo arbitrum_one = new EVMChainInfo(
				EVMChain.ARBITRUMONE.toString(), 
				"Arbitrum ONE mainnet", 
				42161L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("ETH", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://arb1.arbitrum.io/rpc");
					this.add("https://arbitrum.llamarpc.com");
					this.add("https://arbitrum.drpc.org");
					this.add("https://arbitrum-one.publicnode.com");
					this.add("https://arbitrum-one.public.blastapi.io");
					this.add("https://rpc.arb1.arbitrum.gateway.fm");
					this.add("https://1rpc.io/arb");
					this.add("https://rpc.ankr.com/arbitrum");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://arb1.arbitrum.io/rpc");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/42161");
				}},
				generateArbitrumONETokenIndex(),
				generateArbitrumNFTIndex());
		networks.put(EVMChain.ARBITRUMONE, arbitrum_one);

		// shibuya test network
		EVMChainInfo shibuya = new EVMChainInfo(
				EVMChain.SHIBUYATEST.toString(), 
				"ASTAR Testnet", 
				81L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("SBY", "SBY", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://evm.shibuya.astar.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://shibuya.subscan.io");
				}},
				new ArrayList<String>() {{
					this.add("https://portal.astar.network");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/81");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.SHIBUYATEST, shibuya);

		// astar
		EVMChainInfo astar = new EVMChainInfo(
				EVMChain.ASTAR.toString(), 
				"ASTAR Mainnet", 
				592L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("ASTR", "ASTR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://astar.public.blastapi.io");
					this.add("https://evm.astar.network");
					this.add("https://1rpc.io/astr");	
					this.add("https://astar-rpc.dwellir.com");

					//this.add("https://rpc.astar.network:8545"); // continously times out
					//this.add("https://astar-mainnet.g.alchemy.com/v2/demo"); // gone
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://astar.subscan.io");
					this.add("https://blockscout.com/astar");
				}},
				new ArrayList<String>() {{
					this.add("https://portal.astar.network");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/592");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.ASTAR, astar);

		// astar_zkevm
		EVMChainInfo astar_zkevm = new EVMChainInfo(
				EVMChain.ASTARZKEVM.toString(), 
				"ASTAR ZKEVM Mainnet", 
				12611L, 
				BlockchainType.BORKED.toString(), // still pending
				new EVMCurrency("ETH", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					//this.add("https://...");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					//this.add("..."); // pending
				}},
				new ArrayList<String>() {{
					this.add("https://docs.astar.network/docs/build/zkEVM");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/12611");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.ASTARZKEVM, astar_zkevm);

		// evmos
		EVMChainInfo evmos = new EVMChainInfo(
				EVMChain.EVMOS.toString(), 
				"EVMOS Mainnet", 
				9001L, 
				BlockchainType.BORKED.toString(), // so many issues ..
				new EVMCurrency("EVMOS", "EVMOS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://evmos-json-rpc.agoranodes.com");
					this.add("https://json-rpc.evmos.blockhunters.org");
					this.add("https://evmos-mainnet.public.blastapi.io");
					this.add("https://evmos-evm.publicnode.com");
					this.add("https://evmos-json-rpc.stakely.io");
					this.add("https://evmos-mainnet.gateway.pokt.network/v1/lb/627586ddea1b320039c95205");
					this.add("https://evmos.lava.build");
					//this.add("https://eth.bd.evmos.org:8545"); // timeout
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://www.mintscan.io/evmos");
					this.add("https://escan.live/");
				}},
				new ArrayList<String>() {{
					this.add("https://stakely.io/en/faucet/evmos-evm");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/9001");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.EVMOS, evmos);

		// evmostest
		EVMChainInfo evmostest = new EVMChainInfo(
				EVMChain.EVMOSTEST.toString(), 
				"EVMOS Testnet", 
				9000L, 
				BlockchainType.BORKED.toString(), // so many issues ..
				new EVMCurrency("tEVMOS", "tEVMOS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://eth.bd.evmos.dev:8545");
					this.add("https://evmos-testnet.lava.build");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://escan.live/");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.evmos.dev/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/9000");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.EVMOSTEST, evmostest);

		// polygon
		EVMChainInfo polygon = new EVMChainInfo(
				EVMChain.POLYGON.toString(), 
				"Polygon Mainnet", 
				137L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("MATIC", "MATIC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				"31000000000", // 30 gwei threshold for miner.gasprice/txpool.pricelimit, enforced since Oct 2021: https://medium.com/stakingbits/polygon-minimum-gas-fee-is-now-30-gwei-to-curb-spam-8bd4313c83a2
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://polygon-rpc.com/");
					this.add("https://rpc-mainnet.matic.quiknode.pro");
					this.add("https://rpc-mainnet.maticvigil.com");
					this.add("https://poly-rpc.gateway.pokt.network");
					this.add("https://polygon-mainnet.public.blastapi.io");
					this.add("https://rpc.ankr.com/polygon");
					this.add("https://1rpc.io/matic");
					this.add("https://polygon-bor.publicnode.com");
					this.add("https://polygon.llamarpc.com");
					this.add("https://polygon.rpc.blxrbdn.com");
					this.add("https://polygon.blockpi.network/v1/rpc/public");
					this.add("https://endpoints.omniatech.io/v1/matic/mainnet/public");
					this.add("https://polygon.api.onfinality.io/public");
					this.add("https://polygon.gateway.tenderly.co");

					//this.add("https://matic-mainnet.chainstacklabs.com");
					//this.add("https://polygon-mainnet-public.unifra.io");
					//this.add("https://matic-mainnet-full-rpc.bwarelabs.com");
					//this.add("https://matic-mainnet-archive-rpc.bwarelabs.com");
					//this.add("https://polygon-mainnet.g.alchemy.com/v2/demo"); // dead node
					//this.add("https://polygon-mainnet.rpcfast.com"); // consistently timeout
					//this.add("https://polygonapi.terminet.io/rpc"); // consistently slow
					//this.add("https://rpc-mainnet.matic.network"); // just unstable at times
				}}, 
				new ArrayList<String>() {{
					this.add("https://polygon-mainnet.g.alchemy.com/v2/<api key>"); // archive node
				}},
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://polygonscan.com");
					//this.add("https://explorer.matic.network"); // discontinued
				}},
				new ArrayList<String>() {{
					this.add("https://matic.supply");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/137");
				}},
				generatePolygonTokenIndex(),
				generatePolygonNFTIndex());
		networks.put(EVMChain.POLYGON, polygon);

		// mumbai
		EVMChainInfo mumbai = new EVMChainInfo(
				EVMChain.MUMBAITEST.toString(), 
				"Polygon Test Network", 
				80001L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Polygon Test Token", "MATIC", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				"31000000000", // some mumbai nodes actually implement the 30 gwei min threshold as mainnet (see polygon object)
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-mumbai.maticvigil.com");
					this.add("https://rpc.ankr.com/polygon_mumbai");
					this.add("https://rpc-mumbai.maticvigil.com");
					this.add("https://polygon-testnet.public.blastapi.io");
					this.add("https://polygon-mumbai-bor.publicnode.com");
					this.add("https://polygon-mumbai.gateway.tenderly.co");
					//this.add("https://matic-mumbai.chainstacklabs.com");
					//this.add("https://matic-testnet-archive-rpc.bwarelabs.com"); // dead
					//this.add("https://polygontestapi.terminet.io/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://mumbai.polygonscan.com");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.polygon.technology/");
					this.add("https://mumbaifaucet.com/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/80001");
				}},
				generateMumbaiTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.MUMBAITEST, mumbai);

		// zksyncera
		EVMChainInfo zksyncera = new EVMChainInfo(
				EVMChain.ZKSYNCERA.toString(), 
				"zkSync Era Mainnet", 
				324L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("zkSync Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"250000000", //0.25 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://mainnet.era.zksync.io");
					this.add("https://zksync.drpc.org");
					this.add("https://zksync-era.blockpi.network/v1/rpc/public");
					this.add("https://zksync.meowrpc.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://explorer.zksync.io");
				}},
				new ArrayList<String>() {{
					this.add("brige test funds from goerli using https://portal.zksync.io/bridge");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/324");
				}},
				generateZkSyncTokenIndex(),
				generateZKSyncEraNFTIndex());
		networks.put(EVMChain.ZKSYNCERA, zksyncera);

		// zksynceratest
		EVMChainInfo zksynceratest = new EVMChainInfo(
				EVMChain.ZKSYNCERASEPOLIATEST.toString(), 
				"zkSync Sepolia Testnet", 
				300L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("zkSync Era Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://sepolia.era.zksync.dev");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://sepolia.explorer.zksync.io");
				}},
				new ArrayList<String>() {{
					this.add("https://sepolia.era.zksync.dev");
					this.add("https://goerli.portal.zksync.io/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/300");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.ZKSYNCERASEPOLIATEST, zksynceratest);

		// stylussepolia_test
		EVMChainInfo stylussepolia_test = new EVMChainInfo(
				EVMChain.STYLUSSEPOLIATEST.toString(), 
				"Stylus Sepolia", 
				23011913L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Stylus Sepolia Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://stylus-testnet.arbitrum.io/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://stylus-testnet-explorer.arbitrum.io");
				}},
				new ArrayList<String>() {{
					this.add("https://arbitrum.io/stylus");
				}},
				new ArrayList<String>() {{
					this.add("https://arbitrum.io/stylus");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.STYLUSSEPOLIATEST, stylussepolia_test);

		// ropsten
		EVMChainInfo ropsten = new EVMChainInfo(
				EVMChain.ROPSTENTEST.toString(), 
				"Ropsten Test Network", 
				3L, 
				BlockchainType.BORKED.toString(), // Network decommissioned, please use Goerli or Sepolia instead
				new EVMCurrency("Ropsten Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://ropsten.infura.io/v3/9aa3d95b3bc440fa88ea12eaa4456161"); 
					this.add("https://rpc.ankr.com/eth_ropsten");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://ropsten.etherscan.io");
				}},
				new ArrayList<String>() {{
					this.add("decomissioned");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/3");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.ROPSTENTEST, ropsten);

		// sepolia
		EVMChainInfo sepolia = new EVMChainInfo(
				EVMChain.SEPOLIATEST.toString(), 
				"Sepolia Test Network", 
				11155111L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Sepolia Test Token", "SEP", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.sepolia.org"); 
					this.add("https://rpc2.sepolia.org"); 
					this.add("https://ethereum-sepolia.blockpi.network/v1/rpc/public"); 
					this.add("https://eth-sepolia.public.blastapi.io"); 
					this.add("https://gateway.tenderly.co/public/sepolia"); 
					this.add("https://eth-sepolia.public.blastapi.io"); 
					this.add("https://endpoints.omniatech.io/v1/eth/sepolia/public"); 
					this.add("https://eth-sepolia-public.unifra.io"); 
					this.add("https://rpc.notadegen.com/sepolia");
					this.add("https://rpc-sepolia.rockx.com");
					this.add("https://rpc.sepolia.ethpandaops.io");
					this.add("https://sepolia.gateway.tenderly.co");
					this.add("https://ethereum-sepolia.publicnode.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://sepolia.etherscan.io/");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.sepolia.dev/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/11155111");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.SEPOLIATEST, sepolia);

		// arbitrumgoerli
		EVMChainInfo arbitrumgoerli = new EVMChainInfo(
				EVMChain.ARBITRUMGOERLITEST.toString(), 
				"Arbitrum Goerli Test Network", 
				421613L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Arbitrum Goerli ETH Test Token", "AGOR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"20000000", //20M units .. Arbitrum is weird
				new ArrayList<String>() {{
					this.add("https://goerli-rollup.arbitrum.io/rpc");
					this.add("https://arbitrum-goerli.public.blastapi.io");
					this.add("https://endpoints.omniatech.io/v1/arbitrum/goerli/public");
					this.add("https://arbitrum-goerli.publicnode.com");
					//this.add("https://arb-goerli.g.alchemy.com/v2/demo"); // dead
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(),
				new ArrayList<String>(),
				new ArrayList<String>() {{
					this.add("https://goerli.arbiscan.io/");
					this.add("https://goerli-rollup-explorer.arbitrum.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucetttt");
					this.add("https://bridge.arbitrum.io");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/421613");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.ARBITRUMGOERLITEST, arbitrumgoerli);

		// goerli
		EVMChainInfo goerli = new EVMChainInfo(
				EVMChain.GOERLITEST.toString(), 
				"Goerli Test Network", 
				5L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Goerli ETH Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://goerli.infura.io/v3/9aa3d95b3bc440fa88ea12eaa4456161");
					this.add("https://rpc.ankr.com/eth_goerli");
					this.add("https://ethereum-goerli.publicnode.com");
					this.add("https://goerli.gateway.tenderly.co");

					//this.add("https://rpc.goerli.mudit.blog"); // lagging/dead node
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>() {{
					this.add("https://rpc-goerli.flashbots.net");
				}},
				new ArrayList<String>() {{
					this.add("https://relay-goerli.flashbots.net");
					//this.add("https://goerli-relay.securerpc.com"); // untested
				}}, 
				new ArrayList<String>() {{
					this.add("https://goerli.etherscan.io");
				}},
				new ArrayList<String>() {{
					this.add("https://goerli-faucet.mudit.blog/");
					this.add("https://faucets.chain.link/goerli");
					this.add("https://goerli-faucet.slock.it/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/5");
				}},
				generateGoerliTokenIndex(),
				generateGoerliNFTIndex());
		networks.put(EVMChain.GOERLITEST, goerli);

		// fuji
		EVMChainInfo fuji = new EVMChainInfo(
				EVMChain.FUJITEST.toString(), 
				"Avalanche Fuji Test Network", 
				43113L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("AVAX FUJI Test Token", "AVAX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://api.avax-test.network/ext/bc/C/rpc");
					this.add("https://avalanche-fuji-c-chain.publicnode.com");
					this.add("https://ava-testnet.public.blastapi.io/ext/bc/C/rpc");
					this.add("https://rpc.ankr.com/avalanche_fuji");
					this.add("https://endpoints.omniatech.io/v1/avax/fuji/public");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://testnet.snowtrace.io");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.avax.network/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/43113");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.FUJITEST, fuji);

		// rinkeby
		EVMChainInfo rinkeby = new EVMChainInfo(
				EVMChain.RINKEBYTEST.toString(), 
				"Rinkeby Test Network", 
				4L, 
				BlockchainType.BORKED.toString(), // Discontinued/readonly since 2022-10-05
				new EVMCurrency("Rinkeby Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.ankr.com/eth_rinkeby");
					this.add("https://rinkeby.infura.io/v3/9aa3d95b3bc440fa88ea12eaa4456161	");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://rinkeby.etherscan.io");
				}},
				new ArrayList<String>() {{
					this.add("discontinued");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/4");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.RINKEBYTEST, rinkeby);

		// kovan, https://chainlist.org/chain/42
		EVMChainInfo kovan = new EVMChainInfo(
				EVMChain.KOVANTEST.toString(), 
				"Kovan Test Network", 
				42L, 
				BlockchainType.BORKED.toString(), // discontinued test network since September 1, 2022
				new EVMCurrency("Kovan Test Token", "KOV", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://kovan.infura.io/v3/9aa3d95b3bc440fa88ea12eaa4456161");
					this.add("https://kovan.poa.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://kovan.etherscan.io");
				}},
				new ArrayList<String>() {{
					this.add("discontinued");
				}},
				new ArrayList<String>() {{
					this.add("https://rpc.info/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.KOVANTEST, kovan);

		// cronostest
		EVMChainInfo cronostest = new EVMChainInfo(
				EVMChain.CRONOSTEST.toString(), 
				"Cronos Test Network", 
				338L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("CRONOS Test Token", "TCRO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"2000000000000", // 2000 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://evm-t3.cronos.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://testnet.cronoscan.com/");
				}},
				new ArrayList<String>() {{
					this.add("https://cronos.org/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/338");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.CRONOSTEST, cronostest);

		// cronos
		EVMChainInfo cronos = new EVMChainInfo(
				EVMChain.CRONOS.toString(), 
				"Cronos Main Network", 
				25L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("CRONOS Main Token", "CRO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://cronosrpc-1.xstaking.sg");
					this.add("https://evm.cronos.org");
					this.add("https://cronos.blockpi.network/v1/rpc/public");
					this.add("https://cronos-evm.publicnode.com");
					//this.add("https://cronos-rpc.elk.finance"); // dead
					//this.add("https://cronos-rpc.heavenswail.one"); // dead

				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://cronoscan.com/");
				}},
				new ArrayList<String>() {{
					this.add("https://cronos.org/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/25");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.CRONOS, cronos);

		// eth
		EVMChainInfo eth = new EVMChainInfo(
				EVMChain.ETH.toString(), 
				"Ethereum Main Network", 
				1L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Ethereum Main Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://mainnet.infura.io/v3/9aa3d95b3bc440fa88ea12eaa4456161");
					this.add("https://eth-mainnet.public.blastapi.io");
					this.add("https://rpc.ankr.com/eth");
					this.add("https://eth-rpc.gateway.pokt.network");
					this.add("https://eth-mainnet.gateway.pokt.network/v1/5f3453978e354ab992c4da79");
					this.add("https://cloudflare-eth.com");
					this.add("https://nodes.mewapi.io/rpc/eth");
					this.add("https://rpc.mevblocker.io");

					this.add("https://ethereum.publicnode.com");
					this.add("https://mainnet.gateway.tenderly.co");
					this.add("https://rpc.blocknative.com/boost");
					this.add("https://rpc.flashbots.net");
					this.add("https://rpc.flashbots.net/fast");
					this.add("https://rpc.mevblocker.io/fast");
					this.add("https://rpc.mevblocker.io/noreverts");
					this.add("https://rpc.mevblocker.io/fullprivacy");

					//this.add("https://main-rpc.linkpool.io"); // invalid cert
					//this.add("https://main-light.eth.linkpool.io"); // invalid cert
					//this.add("https://api.mycryptoapi.com/eth"); // consistent 403
					//this.add("https://ethereumnodelight.app.runonflux.io"); // consistent rpc errors
					//this.add("https://eth-mainnet.nodereal.io/v1/1659dfb40aa24bbb8153a677b98064d7");
					//this.add("https://mainnet-nethermind.blockscout.com"); // gone, resolve issues
					//this.add("https://mainnet.eth.cloud.ava.do"); // just unstable
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>() {{
					this.add("https://rpc.flashbots.net");
				}}, 
				new ArrayList<String>() {{
					this.add("https://relay.flashbots.net");
					//this.add("https://mainnet-relay.securerpc.com"); // untested
				}}, 
				new ArrayList<String>() {{
					this.add("https://etherscan.io");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1");
				}},
				generateEthereumTokenIndex(),
				generateEthereumNFTIndex());
		networks.put(EVMChain.ETH, eth);

		// avax
		EVMChainInfo avax = new EVMChainInfo(
				EVMChain.AVAX.toString(), 
				"Avalanche C-Chain", 
				43114L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Avalanche Native Token", "AVAX", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://api.avax.network/ext/bc/C/rpc");
					this.add("https://rpc.ankr.com/avalanche");
					this.add("https://ava-mainnet.public.blastapi.io/ext/bc/C/rpc");
					this.add("https://avax.meowrpc.com");
					this.add("https://avalanche-c-chain.publicnode.com");
					//this.add("https://avalancheapi.terminet.io/ext/bc/C/rpc"); // keps pushing 500 internal server error
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://snowtrace.io/");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/43114");
				}},
				generateAvaxTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.AVAX, avax);

		// bobabnb
		EVMChainInfo bobabnb = new EVMChainInfo(
				EVMChain.BOBABNB.toString(), 
				"Boba BNB Mainnet", 
				56288L, 
				BlockchainType.PUBLIC.toString(), // missing good rpcs
				new EVMCurrency("Boba BNB Token", "BOBA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://bnb.boba.network");
					this.add("https://boba-bnb.gateway.tenderly.co/");
					this.add("https://gateway.tenderly.co/public/boba-bnb");
					this.add("https://replica.bnb.boba.network");
				}}, 
				new ArrayList<String>() {{
					this.add("https://blockexplorer.bnb.boba.network");
				}},
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://gateway.testnet.bnb.boba.network/wallet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/56288");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.BOBABNB, bobabnb);

		// boba
		EVMChainInfo boba = new EVMChainInfo(
				EVMChain.BOBA.toString(), 
				"Boba Network", 
				288L, 
				BlockchainType.PUBLIC.toString(), // missing good rpcs
				new EVMCurrency("Boba Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://lightning-replica.boba.network");
					this.add("https://replica.boba.network");
					this.add("https://boba-ethereum.gateway.tenderly.co");
					this.add("https://gateway.tenderly.co/public/boba-ethereum");

					//this.add("https://boba-mainnet.gateway.pokt.network/v1/lb/623ad21b20354900396fed7f"); // timeout
					this.add("https://mainnet.boba.network"); // was temp stuck at block 951796
					//this.add("https://lighting-replica.boba.network"); // does not resolve
				}}, 
				new ArrayList<String>() {{
					this.add("https://blockexplorer.boba.network");
					this.add("https://mainnet.boba.network	");
					this.add("https://boba-mainnet.gateway.pokt.network/v1/lb/623ad21b20354900396fed7f	");
				}},
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://gateway.testnet.bnb.boba.network/wallet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/288");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.BOBA, boba);

		// bobarinkeby
		EVMChainInfo bobarinkeby = new EVMChainInfo(
				EVMChain.BOBARINKEBYTEST.toString(), 
				"Boba Rinkeby Test Token", 
				28L, 
				BlockchainType.BORKED.toString(), // node no longer resolves, no replacement found
				new EVMCurrency("Boba Rinkeby Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rinkeby.boba.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://blockexplorer.rinkeby.boba.network");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/28");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.BOBARINKEBYTEST, bobarinkeby);

		// bobabnb
		EVMChainInfo bobabnbtest = new EVMChainInfo(
				EVMChain.BOBABNBTEST.toString(), 
				"Boba BNB Test Token", 
				9728L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Boba BNB Test Token", "BOBA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://testnet.bnb.boba.network");
					this.add("https://boba-bnb.gateway.tenderly.co/");
					this.add("https://gateway.tenderly.co/public/boba-bnb");
					this.add("https://replica.bnb.boba.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://blockexplorer.testnet.bnb.boba.network");
				}},
				new ArrayList<String>() {{
					this.add("https://gateway.testnet.bnb.boba.network/wallet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/9728");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.BOBABNBTEST, bobabnbtest);

		// bitkub 
		EVMChainInfo bitkub = new EVMChainInfo(
				EVMChain.BITKUB.toString(),
				"Bitkub Network", 
				96L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Bitkub Native Token", "KUB", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.bitkubchain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://bkcscan.com");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://support.bitkub.com/hc/en-us/articles/360061315771-How-to-connect-an-online-wallet-to-Bitkub-Chain-Metamask"); // NEXT Smart Chain? https://chainlist.org/chain/96
				}},
				generateBitkubTokenIndex(),
				generateBitkubNFTIndex());
		networks.put(EVMChain.BITKUB, bitkub);

		// bitkub_test
		EVMChainInfo bitkub_test = new EVMChainInfo(
				EVMChain.BITKUBTEST.toString(),
				"Bitkub Test Network", 
				25925L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Bitkub Native Token", "tKUB", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet.bitkubchain.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://testnet.bkcscan.com");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.bitkubchain.com");
				}},
				new ArrayList<String>() {{
					this.add("https://bitkub.com");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.BITKUBTEST, bitkub_test);

		// moonbeam
		EVMChainInfo moonbeam = new EVMChainInfo(
				EVMChain.MOONBEAM.toString(), 
				"Moonbeam Network", 
				1284L, 
				BlockchainType.PUBLIC.toString(), // All nodes just give Value must be in format 0x[1-9]+[0-9]* or 0x0 errors ..
				new EVMCurrency("Moonbeam Native Token", "GLMR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.api.moonbeam.network");
					this.add("https://rpc.ankr.com/moonbeam");
					this.add("https://moonbeam.public.blastapi.io");
					this.add("https://moonbeam.unitedbloc.com:3000");
					this.add("https://moonbeam.api.onfinality.io/public");
					this.add("https://moonbeam.publicnode.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://moonscan.io");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1284");
				}},
				generateMoonbeamTokenIndex(),
				generateMoonbeamNFTIndex());
		networks.put(EVMChain.MOONBEAM, moonbeam);

		// moonriver
		EVMChainInfo moonriver = new EVMChainInfo(
				EVMChain.MOONRIVER.toString(), 
				"Moonbeam Network", 
				1285L, 
				BlockchainType.PUBLIC.toString(), // All nodes just give Value must be in format 0x[1-9]+[0-9]* or 0x0 errors ..
				new EVMCurrency("MoonRiver Native Token", "MOVR", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://moonriver.unitedbloc.com:2000");
					this.add("https://moonriver.public.blastapi.io");
					this.add("https://rpc.api.moonriver.moonbeam.network");
					this.add("https://moonriver.api.onfinality.io/public");
					this.add("https://moonriver.publicnode.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://moonriver.moonscan.io");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1285");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.MOONRIVER, moonriver);

		// taraxa
		EVMChainInfo taraxa = new EVMChainInfo(
				EVMChain.TARAXA.toString(), 
				"Taraxa Mainnet", 
				841L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Taraxa Native Token", "TARA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.mainnet.taraxa.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://explorer.mainnet.taraxa.io");
				}},
				new ArrayList<String>() {{
					this.add("<faucet todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/841");
					this.add("https://www.coingecko.com/sv/coins/taraxa");
					this.add("https://www.taraxa.io/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.TARAXA, taraxa);

		// taraxatest
		EVMChainInfo taraxatest = new EVMChainInfo(
				EVMChain.TARAXATEST.toString(), 
				"Taraxa Testnet", 
				842L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Taraxa Native Token", "TARA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.testnet.taraxa.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.taraxa.io");
				}},
				new ArrayList<String>() {{
					this.add("https://testnet.explorer.taraxa.io/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/842");
					this.add("https://www.coingecko.com/sv/coins/taraxa");
					this.add("https://www.taraxa.io/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.TARAXATEST, taraxatest);

		// fantom
		EVMChainInfo fantom = new EVMChainInfo(
				EVMChain.FANTOM.toString(), 
				"Fantom Network", 
				250L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Fantom Native Token", "FTM", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.ftm.tools");
					this.add("https://fantom-mainnet.gateway.pokt.network/v1/lb/62759259ea1b320039c9e7ac");
					this.add("https://rpc.ankr.com/fantom");
					this.add("https://rpc2.fantom.network");
					this.add("https://rpcapi.fantom.network");
					this.add("https://fantom-mainnet.public.blastapi.io");
					this.add("https://rpcapi.fantom.network");
					this.add("https://endpoints.omniatech.io/v1/fantom/mainnet/public");
					this.add("https://fantom-pokt.nodies.app");
					this.add("https://rpc.fantom.network");
					this.add("https://rpc3.fantom.network");
					this.add("https://1rpc.io/ftm");
					this.add("https://fantom.blockpi.network/v1/rpc/public");					
					this.add("https://fantom.publicnode.com");
					this.add("https://rpc.fantom.gateway.fm");
					this.add("https://fantom.api.onfinality.io/public	");
					this.add("https://fantom.drpc.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://ftmscan.com");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.fantom.network/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/250");
				}},
				generateFantomTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.FANTOM, fantom);

		// fantomtest
		EVMChainInfo fantomtest = new EVMChainInfo(
				EVMChain.FANTOMTEST.toString(), 
				"Fantom Test Network", 
				4002L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Fantom Native Token", "FTM", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://fantom-testnet.public.blastapi.io");
					this.add("https://rpc.testnet.fantom.network");
					this.add("https://rpc.ankr.com/fantom_testnet");
					this.add("https://endpoints.omniatech.io/v1/fantom/testnet/public");
					this.add("https://fantom-testnet.publicnode.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://testnet.ftmscan.com/");
				}},
				new ArrayList<String>() {{
					this.add("https://faucet.fantom.network/");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/4002");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.FANTOMTEST, fantomtest);

		// harmony, https://chainlist.org/chain/1666600000
		EVMChainInfo harmony = new EVMChainInfo(
				EVMChain.HARMONY.toString(), 
				"Harmony Mainnet Shard 0", 
				1666600000L, 
				BlockchainType.BORKED.toString(), // address convertion oneXXXX 
				new EVMCurrency("Harmony Native Token", "ONE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://api.harmony.one");
					this.add("https://harmony-0-rpc.gateway.pokt.network");
					this.add("https://harmony-mainnet.chainstacklabs.com");
					this.add("https://api.s0.t.hmny.io");
					this.add("https://rpc.ankr.com/harmony");
					this.add("https://a.api.s0.t.hmny.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://explorer.harmony.one");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1666600000");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.HARMONY, harmony);

		// etho
		EVMChainInfo etho = new EVMChainInfo(
				EVMChain.ETHO.toString(), 
				"ETHO Network", 
				1313114L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("ETHO Native Token", "ETHO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					//this.add("https://rpc.ether1.org"); // discontinued
					this.add("https://rpc.ethoprotocol.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://explorer.ethoprotocol.com");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1313114");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.ETHO, etho);

		// bsc
		EVMChainInfo bsc = new EVMChainInfo(
				EVMChain.BSC.toString(), 
				"Binance Smart Chain Mainnet", 
				56L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Binance Chain Native Token", "BNB", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"500000", //500k units
				new ArrayList<String>() {{
					this.add("https://bsc-dataseed.binance.org");
					this.add("https://bsc-dataseed1.binance.org");
					this.add("https://bsc-dataseed2.binance.org");
					this.add("https://bsc-dataseed3.binance.org");
					this.add("https://bsc-dataseed4.binance.org");
					this.add("https://bsc-dataseed1.defibit.io");
					this.add("https://bsc-dataseed2.defibit.io");
					this.add("https://bsc-dataseed3.defibit.io");
					this.add("https://bsc-dataseed4.defibit.io");
					this.add("https://bsc-dataseed1.ninicoin.io");
					this.add("https://bsc-dataseed2.ninicoin.io");
					this.add("https://bsc-dataseed3.ninicoin.io");
					this.add("https://bsc-dataseed4.ninicoin.io");
					this.add("https://bsc-dataseed1.bnbchain.org");
					this.add("https://bsc-dataseed2.bnbchain.org");
					this.add("https://bsc-dataseed3.bnbchain.org");
					this.add("https://bsc-dataseed4.bnbchain.org");
					this.add("https://bsc.publicnode.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://bscscan.com");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/56");
				}},
				generateBSCTokenIndex(),
				generateBSCNFTIndex());
		networks.put(EVMChain.BSC, bsc);

		// bsctest
		EVMChainInfo bsctest = new EVMChainInfo(
				EVMChain.BSCTEST.toString(), 
				"Binance Smart Chain Testnet", 
				97L, 
				BlockchainType.BORKED.toString(), // execution reverted for simple interaction?
				new EVMCurrency("Binance Chain Test Native Token", "tBNB", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://data-seed-prebsc-1-s1.binance.org:8545");
					this.add("https://data-seed-prebsc-1-s2.binance.org:8545");
					this.add("https://data-seed-prebsc-1-s3.binance.org:8545");
					this.add("https://data-seed-prebsc-2-s2.binance.org:8545");
					this.add("https://bsc-testnet.public.blastapi.io");
					this.add("https://bsc-testnet.publicnode.com");
					this.add("https://bsc-testnet.blockpi.network/v1/rpc/public");
					this.add("https://data-seed-prebsc-1-s1.bnbchain.org:8545");
					this.add("https://data-seed-prebsc-2-s1.bnbchain.org:8545");
					this.add("https://data-seed-prebsc-1-s2.bnbchain.org:8545");
					this.add("https://data-seed-prebsc-2-s2.bnbchain.org:8545");
					this.add("https://data-seed-prebsc-1-s3.bnbchain.org:8545");
					this.add("https://data-seed-prebsc-2-s3.bnbchain.org:8545");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://testnet.bscscan.com");
				}},
				new ArrayList<String>() {{
					this.add("https://testnet.binance.org/faucet-smart");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/97");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.BSCTEST, bsctest);

		// metis
		EVMChainInfo metis = new EVMChainInfo(
				EVMChain.METIS.toString(), 
				"Metis Mainnet", 
				1088L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Metis Native Token", "METIS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://andromeda.metis.io/?owner=1088");
					this.add("https://metis-mainnet.public.blastapi.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://andromeda-explorer.metis.io/");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1088");
				}},
				generateMetisTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.METIS, metis);

		// metisgoerli_test
		EVMChainInfo metisgoerli_test = new EVMChainInfo(
				EVMChain.METISGOERLITEST.toString(), 
				"Metis Goerli Testnet", 
				599L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Metis Goerli Test Token", "METIS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://goerli.gateway.metisdevops.link");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://goerli.explorer.metisdevops.link");
				}},
				new ArrayList<String>() {{
					this.add("https://goerli.faucet.metisdevops.link/");
					this.add("bridge assets from goerli https://bridge.metis.io/home");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/599");
				}},
				generateMetisTestTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.METISGOERLITEST, metisgoerli_test);

		// nexablock
		EVMChainInfo nexablock = new EVMChainInfo(
				EVMChain.NEXABLOCK.toString(), 
				"Nexa Block", 
				9025L,
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Nexa Block Token", "NEXB", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-nodes.nexablockscan.io ");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("<faucet todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://nexablockscan.io");
				}},
				new ArrayList<String>() {{
					this.add("https://nexa.org/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.NEXABLOCK, nexablock);	

		// nexablock
		EVMChainInfo nexablock_test = new EVMChainInfo(
				EVMChain.NEXABLOCKTEST.toString(), 
				"Nexa Block Testnet", 
				9024L,
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Nexa Block Token", "NEXB", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc-testnet-nodes.nexablockscan.io");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://nexablockscan.io/faucet");
				}},
				new ArrayList<String>() {{
					this.add("https://testnet.nexablockscan.io/");
				}},
				new ArrayList<String>() {{
					this.add("https://nexa.org/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.NEXABLOCKTEST, nexablock_test);

		// berachainartio_test
		EVMChainInfo berachainartio_test = new EVMChainInfo(
				EVMChain.BERACHAINARTIOTEST.toString(), 
				"Berachain Artio", 
				80085L, 
				BlockchainType.BORKED.toString(), // early
				new EVMCurrency("Berachain Arti Test Token", "BERA", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://artio.rpc.berachain.com");
					this.add("https://rpc.ankr.com/berachain_testnet");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://artio.faucet.berachain.com");
				}},
				new ArrayList<String>() {{
					this.add("https://artio.beratrail.io");
				}},
				new ArrayList<String>() {{
					this.add("https://berachain.com");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.BERACHAINARTIOTEST, berachainartio_test);	

		// metissepolia_test
		EVMChainInfo metissepolia_test = new EVMChainInfo(
				EVMChain.METISSEPOLIATEST.toString(), 
				"Metis Sepolia Testnet", 
				59901L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Metis Sepolia Test Token", "METIS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://sepolia.rpc.metisdevops.link");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://sepolia.explorer.metisdevops.link");
				}},
				new ArrayList<String>() {{
					this.add("https://sepolia.faucet.metisdevops.link/");
					this.add("bridge assets from goerli https://bridge.metis.io/home");
				}},
				new ArrayList<String>() {{
					this.add("https://decentralize.metis.io/");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.METISSEPOLIATEST, metissepolia_test);	

		// metisstardust_test
		EVMChainInfo metisstardust_test = new EVMChainInfo(
				EVMChain.METISSTARDUSTTEST.toString(), 
				"Metis Stardust Testnet", 
				588L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Metis Test Token", "METIS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://stardust.metis.io/?owner=588");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://sepolia.explorer.metisdevops.link");
				}},
				new ArrayList<String>() {{
					this.add("https://sepolia.faucet.metisdevops.link/");
					this.add("bridge assets from goerli https://bridge.metis.io/home");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/588");
				}},
				generateMetisTestTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.METISSTARDUSTTEST, metisstardust_test);		

		// alph
		EVMChainInfo alph = new EVMChainInfo(
				EVMChain.ALPH.toString(), 
				"Alph Network", 
				8738L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Alph Network Gas Token", "ALPH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://rpc.alph.network");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://explorer.alph.network");
				}},
				new ArrayList<String>() {{
					this.add("<faucet todo>");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/8738");
				}},
				generateMetisTestTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.ALPH, alph);

		// shibarium
		EVMChainInfo shibarium = new EVMChainInfo(
				EVMChain.SHIBARIUM.toString(), 
				"Shibarium Mainnet", 
				109L, 
				// https://www.tradingview.com/news/u_today:02fb7b457094b:0-key-reason-behind-shib-s-sudden-plunge-after-shibarium-s-launch
				BlockchainType.BORKED.toString(), 
				new EVMCurrency("Shibarium Token", "BONE", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://www.shibrpc.com");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://www.shibariumscan.io");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/109");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.SHIBARIUM, shibarium);

		// aurora
		EVMChainInfo aurora = new EVMChainInfo(
				EVMChain.AURORA.toString(), 
				"Aurora Mainnet", 
				1313161554L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Aurora Token", "AETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://mainnet.aurora.dev");
					this.add("https://1rpc.io/aurora");
					this.add("https://aurora.drpc.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://aurorascan.dev/");
					this.add("https://explorer.mainnet.aurora.dev/");
					this.add("https://explorer.aurorachain.io/");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1313161554");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.AURORA, aurora);

		// aurora_test
		EVMChainInfo aurora_test = new EVMChainInfo(
				EVMChain.AURORATEST.toString(), 
				"Aurora Testnet", 
				1313161555L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("Aurora Token", "AETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://endpoints.omniatech.io/v1/aurora/testnet/public");
					this.add("https://1rpc.io/aurora");
					this.add("https://testnet.aurora.dev/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.aurora.dev/");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/1313161555");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.AURORATEST, aurora_test);

		// ganache
		EVMChainInfo ganache8545_1337 = new EVMChainInfo(
				EVMChain.GANACHE8545_1337.toString(), 
				"Ganache Test Chain, default local port 8545 and chainid 1337", 
				1337L, 
				BlockchainType.LOCAL.toString(),
				new EVMCurrency("Development Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("http://127.0.0.1:8545");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://blockexplorer.x");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://gsthina.medium.com/the-default-chain-id-for-ganache-metamask-is-1337-can-you-try-to-override-it-de5ad1bcb3ab");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.GANACHE8545_1337, ganache8545_1337);

		// ganache
		EVMChainInfo ganache7545 = new EVMChainInfo(
				EVMChain.GANACHE7545_1337.toString(), 
				"Ganache Test Chain, default local port 7545 and chainid 1337", 
				1337L, 
				BlockchainType.LOCAL.toString(),
				new EVMCurrency("Development Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("http://127.0.0.1:7545");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://blockexplorer.x");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://gsthina.medium.com/the-default-chain-id-for-ganache-metamask-is-1337-can-you-try-to-override-it-de5ad1bcb3ab");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.GANACHE7545_1337, ganache7545);

		// ganache
		EVMChainInfo ganache8545_5777 = new EVMChainInfo(
				EVMChain.GANACHE8545_5777.toString(), 
				"Ganache Test Chain, default local port 8545 and chainid 5777", 
				5777L, 
				BlockchainType.LOCAL.toString(),
				new EVMCurrency("Development Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("http://127.0.0.1:8545");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://blockexplorer.x");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://gsthina.medium.com/the-default-chain-id-for-ganache-metamask-is-1337-can-you-try-to-override-it-de5ad1bcb3ab");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.GANACHE8545_5777, ganache8545_5777);

		// ganache
		EVMChainInfo ganache7545_5777 = new EVMChainInfo(
				EVMChain.GANACHE7545_5777.toString(), 
				"Ganache Test Chain, default local port 7545 and chainid 5777", 
				5777L, 
				BlockchainType.LOCAL.toString(),
				new EVMCurrency("Development Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("http://127.0.0.1:7545");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://blockexplorer.x");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://gsthina.medium.com/the-default-chain-id-for-ganache-metamask-is-1337-can-you-try-to-override-it-de5ad1bcb3ab");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.GANACHE7545_5777, ganache7545_5777);

		// hardhat
		EVMChainInfo hardhat443_31337 = new EVMChainInfo(
				EVMChain.HARDHAT443_31337.toString(), 
				"Hardhat Test Chain, default local https port 443 and chainid 31337", 
				31337L, 
				BlockchainType.LOCAL.toString(),
				new EVMCurrency("Development Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://localhost");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://blockexplorer.x");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://hardhat.org/hardhat-network/docs/reference");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.HARDHAT443_31337, hardhat443_31337);

		// hardhat
		EVMChainInfo hardhat8545_31337 = new EVMChainInfo(
				EVMChain.HARDHAT8545_31337.toString(), 
				"Hardhat Test Chain, default local port 8545 and chainid 31337", 
				31337L, 
				BlockchainType.LOCAL.toString(),
				new EVMCurrency("Development Test Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("http://127.0.0.1:8545");
					this.add("http://127.0.0.1:8545/rpc");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://blockexplorer.x");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://hardhat.org/hardhat-network/docs/reference");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.HARDHAT8545_31337, hardhat8545_31337);

		// celo
		EVMChainInfo celo = new EVMChainInfo(
				EVMChain.CELO.toString(), 
				"Celo Mainnet", 
				42220L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("CELO Native Token", "CELO", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://forno.celo.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://explorer.celo.org");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/42220");
				}},
				generateCeloTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.CELO, celo);

		// base
		EVMChainInfo base = new EVMChainInfo(
				EVMChain.BASE.toString(), 
				"BASE Mainnet", 
				8453L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("BASE Native Token", "ETH", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://base.blockpi.network/v1/rpc/public");
					this.add("https://developer-access-mainnet.base.org/");
					this.add("https://base-mainnet.public.blastapi.io");
					this.add("https://base.meowrpc.com");
					this.add("https://base.publicnode.com");
					this.add("https://1rpc.io/base");
					this.add("https://mainnet.base.org/");
					this.add("https://rpc.notadegen.com/base");
					this.add("https://base-mainnet.diamondswap.org/rpc");
					this.add("https://base.gateway.tenderly.co");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://basescan.org");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/8453");
					this.add("https://base.org/");
				}},
				generateBaseTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.BASE, base);

		// klaytn
		EVMChainInfo klay = new EVMChainInfo(
				EVMChain.KLAYTN.toString(), 
				"KLAYTN Mainnet", 
				8217L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("KLAYTN Native Token", "KLAY", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://public-node-api.klaytnapi.com/v1/cypress");
					this.add("https://klaytn.blockpi.network/v1/rpc/public");
					this.add("https://klaytn.api.onfinality.io/public");
					this.add("https://klaytn.drpc.org");

				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://scope.klaytn.com");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://chainlist.org/chain/8217");
					this.add("https://medium.com/klaytn/how-to-add-klaytn-to-metamask-b3bdd970c0e8");
				}},
				generateKlaytnTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.KLAYTN, klay);

		// borachain
		EVMChainInfo borachain = new EVMChainInfo(
				EVMChain.BORACHAIN.toString(), 
				"Bora Chain, gaming side-chain of KLAYTN", 
				77001L, 
				BlockchainType.PUBLIC.toString(),
				new EVMCurrency("BORAChain Native Token", "BGAS", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://public-node.api.boraportal.io/bora/mainnet"); // fails to reply to node rpc version
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://scope.boraportal.com/");
				}},
				new ArrayList<String>() {{
					this.add("faucet-to-be-inserted");
				}},
				new ArrayList<String>() {{
					this.add("https://medium.com/@DAO_FE/1-add-rpc-network-name-borachain-mainnet-network-url-https-public-node-api-boraportal-io-b-59f422588926");
				}},
				generateBorachainTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.BORACHAIN, borachain);

		// shardeum15
		EVMChainInfo shardeum15 = new EVMChainInfo(
				EVMChain.SHARDEUMLIBERTY1xTEST.toString(), 
				"Shardeum Liberty 1.5", 
				8080L, 
				BlockchainType.BORKED.toString(), // very unstable atm, inconsistent results
				new EVMCurrency("Shardeum Native Token", "SHM", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://liberty10.shardeum.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://explorer.liberty10.shardeum.org");
				}},
				new ArrayList<String>() {{
					this.add("https://docs.shardeum.org/faucet/claim");
				}},
				new ArrayList<String>() {{
					this.add("https://docs.shardeum.org/wallets/MetaMask/add-shardeum-network");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.SHARDEUMLIBERTY1xTEST, shardeum15);

		// shardeum20
		EVMChainInfo shardeum20 = new EVMChainInfo(
				EVMChain.SHARDEUMLIBERTY2xTEST.toString(), 
				"Shardeum Liberty 2.0", 
				8081L, 
				BlockchainType.BORKED.toString(), // very unstable atm
				new EVMCurrency("Shardeum Native Token", "SHM", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://liberty20.shardeum.org");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://explorer.liberty20.shardeum.org");
				}},
				new ArrayList<String>() {{
					this.add("https://docs.shardeum.org/faucet/claim");
				}},
				new ArrayList<String>() {{
					this.add("https://docs.shardeum.org/wallets/MetaMask/add-shardeum-network");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.SHARDEUMLIBERTY2xTEST, shardeum20);

		// shardeum20
		EVMChainInfo shardeumsphinx10 = new EVMChainInfo(
				EVMChain.SHARDEUMSPHINX1xTEST.toString(), 
				"Shardeum Sphinx 1.x", 
				8082L, 
				BlockchainType.BORKED.toString(), // very unstable atm
				new EVMCurrency("Shardeum Native Token", "SHM", 18), 
				EVMPriceMechanism.LEGACY.toString(),30,
				"30000000000", //30 gwei
				null, // enforced min gasprice
				"300000", //300k units
				new ArrayList<String>() {{
					this.add("https://sphinx.shardeum.org/");
				}}, 
				new ArrayList<String>(), // archive nodes (if available)
				new ArrayList<String>(), // flashbot nodes (if available)
				new ArrayList<String>(), // flashbot relay nodes (if available)
				new ArrayList<String>() {{
					this.add("https://explorer-sphinx.shardeum.org");
				}},
				new ArrayList<String>() {{
					this.add("https://docs.shardeum.org/faucet/claim");
				}},
				new ArrayList<String>() {{
					this.add("https://docs.shardeum.org/wallets/MetaMask/add-shardeum-network");
				}},
				generateDummyTokenIndex(),
				generateDummyNFTIndex());
		networks.put(EVMChain.SHARDEUMSPHINX1xTEST, shardeumsphinx10);

		return new EVMChainIndex(networks);

	}

	public static String generateEVMChainIndexJSON() {
		EVMChainIndex idx = generateEVMChainIndex();
		return JSONUtils.createJSONFromPOJO(idx);
	}

	@SuppressWarnings("serial")
	public static ERC20TokenIndex generateFantomTokenIndex() {

		HashMap<String, EVMERC20TokenInfo> tokens = new HashMap<>();

		// stg
		EVMERC20TokenInfo stg = new EVMERC20TokenInfo(
				FantomERC20Token.STG.toString(), 
				"0x2f6f07cdcf3588944bf4c42ac74ff24bf56e7590",
				"StarGate token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.FANTOM.toString(),
				new ArrayList<String>() {{
					this.add("https://ftmscan.com/address/0x2f6f07cdcf3588944bf4c42ac74ff24bf56e7590");
					this.add("https://www.coingecko.com/en/coins/stargate-finance");
				}});
		tokens.put(FantomERC20Token.STG.toString(), stg);

		// usdc
		EVMERC20TokenInfo usdc = new EVMERC20TokenInfo(
				FantomERC20Token.USDC.toString(), 
				"0x04068da6c83afcfa0e13ba15a6696662335d5b75",
				"USDC stablecoin token", 
				6,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.FANTOM.toString(),
				new ArrayList<String>() {{
					this.add("https://ftmscan.com/address/0x04068da6c83afcfa0e13ba15a6696662335d5b75");
					this.add("https://www.coingecko.com/en/coins/usd-coin");
				}});
		tokens.put(FantomERC20Token.USDC.toString(), usdc);

		// multi
		EVMERC20TokenInfo multi = new EVMERC20TokenInfo(
				FantomERC20Token.MULTI.toString(), 
				"0x9fb9a33956351cf4fa040f65a13b835a3c8764e3",
				"Multichain token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.FANTOM.toString(),
				new ArrayList<String>() {{
					this.add("https://ftmscan.com/address/0x9fb9a33956351cf4fa040f65a13b835a3c8764e3");
					this.add("https://www.coingecko.com/en/coins/multichain");
				}});
		tokens.put(FantomERC20Token.MULTI.toString(), multi);

		// dai
		EVMERC20TokenInfo dai = new EVMERC20TokenInfo(
				FantomERC20Token.DAI.toString(), 
				"0x8d11ec38a3eb5e956b052f67da8bdc9bef8abf3e",
				"DAI stablecoin token", 
				18,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.FANTOM.toString(),
				new ArrayList<String>() {{
					this.add("https://ftmscan.com/address/0x8d11ec38a3eb5e956b052f67da8bdc9bef8abf3e");
					this.add("https://www.coingecko.com/en/coins/dai");
				}});
		tokens.put(FantomERC20Token.DAI.toString(), dai);

		// usdt
		EVMERC20TokenInfo usdt = new EVMERC20TokenInfo(
				FantomERC20Token.USDT.toString(), 
				"0x049d68029688eabf473097a2fc38ef61633a3c7a",
				"Tether stablecoin token", 
				18,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.FANTOM.toString(),
				new ArrayList<String>() {{
					this.add("https://ftmscan.com/address/0x049d68029688eabf473097a2fc38ef61633a3c7a");
					this.add("https://www.coingecko.com/en/coins/tether");
				}});
		tokens.put(FantomERC20Token.USDT.toString(), usdt);

		// spookyswap_ftm_multi
		EVMERC20TokenInfo spookyswap_ftm_multi = new EVMERC20TokenInfo(
				FantomERC20Token.SPOOKYSWAP_FTM_MULTI_LP.toString(), 
				"0x297C8990134bf1eE08aE5D8805042fbac8781201",
				"Spookyswap FTM+MULTI LP token", 
				18,
				TokenCategory.LIQUIDITY_PROVIDER.toString(),
				EVMChain.FANTOM.toString(),
				new ArrayList<String>() {{
					this.add("https://ftmscan.com/token/0x297c8990134bf1ee08ae5d8805042fbac8781201?a=0xf0803b4cf6359d64913ec6a0b8227640afe69b2a");
					this.add("https://spooky.fi/#/add/FTM/0x9Fb9a33956351cf4fa040f65A13b835A3C8764E3");
				}});
		tokens.put(FantomERC20Token.SPOOKYSWAP_FTM_MULTI_LP.toString(), spookyswap_ftm_multi);

		// test
		EVMERC20TokenInfo test = new EVMERC20TokenInfo(
				FantomERC20Token.TEST.toString(), 
				"0x62b65f4b89e9a56b687ccebb57b4afeafa933894",
				//"0x62b65f4b89e9a56b687ccebb57b4afeafa933894", // BLOOM scam token
				"TEST token", 
				18,
				TokenCategory.TEST.toString(),
				EVMChain.FANTOM.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/token/0xMOJO");
				}});
		tokens.put(FantomERC20Token.TEST.toString(), test);

		return new ERC20TokenIndex(tokens);
	}

	@SuppressWarnings("serial")
	public static ERC20TokenIndex generateGoerliTokenIndex() {

		HashMap<String, EVMERC20TokenInfo> tokens = new HashMap<>();

		// mantle
		EVMERC20TokenInfo mantle = new EVMERC20TokenInfo(
				GoerliERC20Token.MNT.toString(), 
				"0xc1dC2d65A2243c22344E725677A3E3BEBD26E604",
				"Mantle ERC-20 token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.GOERLITEST.toString(),
				new ArrayList<String>() {{
					this.add("https://goerli.etherscan.io/token/0xc1dC2d65A2243c22344E725677A3E3BEBD26E604");
				}});
		tokens.put(GoerliERC20Token.MNT.toString(), mantle);

		// zeta
		EVMERC20TokenInfo zeta = new EVMERC20TokenInfo(
				GoerliERC20Token.ZETA.toString(), 
				"0xCc7bb2D219A0FC08033E130629C2B854b7bA9195",
				"ZETA swap/bridge gas token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.GOERLITEST.toString(),
				new ArrayList<String>() {{
					this.add("https://goerli.etherscan.io/token/0xCc7bb2D219A0FC08033E130629C2B854b7bA9195");
				}});
		tokens.put(GoerliERC20Token.ZETA.toString(), zeta);


		// usdc
		EVMERC20TokenInfo usdc = new EVMERC20TokenInfo(
				GoerliERC20Token.USDC.toString(), 
				"0x07865c6e87b9f70255377e024ace6630c1eaa37f",
				"USDC Stable token", 
				6,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.GOERLITEST.toString(),
				new ArrayList<String>() {{
					this.add("https://goerli.etherscan.io/token/0x07865c6e87b9f70255377e024ace6630c1eaa37f");
				}});
		tokens.put(GoerliERC20Token.USDC.toString(), usdc);

		// weth
		EVMERC20TokenInfo weth = new EVMERC20TokenInfo(
				GoerliERC20Token.WETH.toString(), 
				"0xb4fbf271143f4fbf7b91a5ded31805e42b2208d6",
				"Wrapped ETH token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.GOERLITEST.toString(),
				new ArrayList<String>() {{
					this.add("https://goerli.etherscan.io/address/0xb4fbf271143f4fbf7b91a5ded31805e42b2208d6");
				}});
		tokens.put(GoerliERC20Token.WETH.toString(), weth);

		// dai
		EVMERC20TokenInfo dai = new EVMERC20TokenInfo(
				GoerliERC20Token.DAI.toString(), 
				"0x11fe4b6ae13d2a6055c8d9cf65c55bac32b5d844",
				"DAI USD stablecoin token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.GOERLITEST.toString(),
				new ArrayList<String>() {{
					this.add("https://goerli.etherscan.io/address/0x11fe4b6ae13d2a6055c8d9cf65c55bac32b5d844");
				}});
		tokens.put(GoerliERC20Token.DAI.toString(), dai);

		// tst4
		EVMERC20TokenInfo tst4 = new EVMERC20TokenInfo(
				GoerliERC20Token.TST4.toString(), 
				"0x3f152b63ec5ca5831061b2dccfb29a874c317502",
				"Official Goerli ERC-20 TST token", 
				18,
				TokenCategory.TEST.toString(),
				EVMChain.GOERLITEST.toString(),
				new ArrayList<String>() {{
					this.add("https://goerli.etherscan.io/token/0x3f152b63ec5ca5831061b2dccfb29a874c317502");
				}});
		tokens.put(GoerliERC20Token.TST4.toString(), tst4);

		// tstv4
		EVMERC20TokenInfo tstv4 = new EVMERC20TokenInfo(
				GoerliERC20Token.TSTv4.toString(), 
				"0x499d11E0b6eAC7c0593d8Fb292DCBbF815Fb29Ae",
				"Goerli ERC-20 TST token", 
				18,
				TokenCategory.TEST.toString(),
				EVMChain.GOERLITEST.toString(),
				new ArrayList<String>() {{
					this.add("https://goerli.etherscan.io/token/0x499d11E0b6eAC7c0593d8Fb292DCBbF815Fb29Ae");
				}});
		tokens.put(GoerliERC20Token.TSTv4.toString(), tstv4);

		// test
		EVMERC20TokenInfo test = new EVMERC20TokenInfo(
				GoerliERC20Token.TEST.toString(), 
				"0x3f152b63ec5ca5831061b2dccfb29a874c317502",
				//"0x3f152b63ec5ca5831061b2dccfb29a874c317502", //...
				"TEST token", 
				18,
				TokenCategory.TEST.toString(),
				EVMChain.GOERLITEST.toString(),
				new ArrayList<String>() {{
					this.add("https://goerli.etherscan.io/token/0xMOJO");
				}});
		tokens.put(GoerliERC20Token.TEST.toString(), test);

		return new ERC20TokenIndex(tokens);
	}

	@SuppressWarnings("serial")
	public static ERC20TokenIndex generateKlaytnTokenIndex() {

		HashMap<String, EVMERC20TokenInfo> tokens = new HashMap<>();

		// ksp
		EVMERC20TokenInfo ksp = new EVMERC20TokenInfo(
				KlaytnKIP7Token.KSP.toString(), 
				"0xc6a2ad8cc6e4a7e08fc37cc5954be07d499e7654",
				"Klay Swap token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.KLAYTN.toString(),
				new ArrayList<String>() {{
					this.add("https://scope.klaytn.com/token/0xc6a2ad8cc6e4a7e08fc37cc5954be07d499e7654");
					this.add("https://www.coingecko.com/en/coins/klayswap-protocol");
				}});
		tokens.put(KlaytnKIP7Token.KSP.toString(), ksp);

		// wemix
		EVMERC20TokenInfo wemix = new EVMERC20TokenInfo(
				KlaytnKIP7Token.WEMIX.toString(), 
				"0x5096db80b21ef45230c9e423c373f1fc9c0198dd",
				"WEMIX game token", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.KLAYTN.toString(),
				new ArrayList<String>() {{
					this.add("https://scope.klaytn.com/token/0x5096db80b21ef45230c9e423c373f1fc9c0198dd");
					this.add("https://www.coingecko.com/en/coins/wemix-token");
				}});
		tokens.put(KlaytnKIP7Token.WEMIX.toString(), wemix);

		// bora
		EVMERC20TokenInfo bora = new EVMERC20TokenInfo(
				KlaytnKIP7Token.BORA.toString(), 
				"0x02cbe46fb8a1f579254a9b485788f2d86cad51aa",
				"BORA game token", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.KLAYTN.toString(),
				new ArrayList<String>() {{
					this.add("https://scope.klaytn.com/token/0x02cbe46fb8a1f579254a9b485788f2d86cad51aa");
					this.add("https://www.coingecko.com/en/coins/bora");
				}});
		tokens.put(KlaytnKIP7Token.BORA.toString(), bora);

		// test
		EVMERC20TokenInfo test = new EVMERC20TokenInfo(
				KlaytnKIP7Token.TEST.toString(), 
				"0x7f1712f846a69bf2a9dbc4d48f45f1d52ca32e28",
				//"0x7f1712f846a69bf2a9dbc4d48f45f1d52ca32e28", // UFO token :)
				"TEST token", 
				18,
				TokenCategory.TEST.toString(),
				EVMChain.KLAYTN.toString(),
				new ArrayList<String>() {{
					this.add("https://scope.klaytn.com/token/0xMOJO");
				}});
		tokens.put(KlaytnKIP7Token.TEST.toString(), test);

		return new ERC20TokenIndex(tokens);
	}

	@SuppressWarnings("serial")
	public static ERC20TokenIndex generateMetisTokenIndex() {

		HashMap<String, EVMERC20TokenInfo> tokens = new HashMap<>();

		// usdt
		EVMERC20TokenInfo usdt = new EVMERC20TokenInfo(
				MetisERC20Token.USDT.toString(), 
				"0xbB06DCA3AE6887fAbF931640f67cab3e3a16F4dC",
				"USDT stable token", 
				6,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.METIS.toString(),
				new ArrayList<String>() {{
					this.add("https://andromeda-explorer.metis.io/token/0xbB06DCA3AE6887fAbF931640f67cab3e3a16F4dC");
				}});
		tokens.put(MetisERC20Token.USDT.toString(), usdt);

		// usdc
		EVMERC20TokenInfo usdc = new EVMERC20TokenInfo(
				MetisERC20Token.USDC.toString(), 
				"0xEA32A96608495e54156Ae48931A7c20f0dcc1a21",
				"USDC stable token", 
				6,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.METIS.toString(),
				new ArrayList<String>() {{
					this.add("https://andromeda-explorer.metis.io/address/0xEA32A96608495e54156Ae48931A7c20f0dcc1a21");
				}});
		tokens.put(MetisERC20Token.USDC.toString(), usdc);

		// VAMM_METIS_USDC_LP
		EVMERC20TokenInfo vamm_metis_usdc_lp = new EVMERC20TokenInfo(
				MetisERC20Token.HERMES_M_USDC_LP.toString(),
				"0x5ab390084812E145b619ECAA8671d39174a1a6d1",
				"VolatileV1 AMM - Metis/m.USDC LP token", 
				18,
				TokenCategory.LIQUIDITY_PROVIDER.toString(),
				EVMChain.METIS.toString(),
				new ArrayList<String>() {{
					this.add("https://andromeda-explorer.metis.io/address/0x5ab390084812E145b619ECAA8671d39174a1a6d1");
				}});
		tokens.put(MetisERC20Token.HERMES_M_USDC_LP.toString(), vamm_metis_usdc_lp);

		return new ERC20TokenIndex(tokens);
	}

	@SuppressWarnings("serial")
	public static ERC20TokenIndex generateMetisTestTokenIndex() {

		HashMap<String, EVMERC20TokenInfo> tokens = new HashMap<>();

		// weth
		EVMERC20TokenInfo weth = new EVMERC20TokenInfo(
				MetisERC20Token.WETH.toString(), 
				"0x420000000000000000000000000000000000000A",
				"Wrapped ETH token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.METISSTARDUSTTEST.toString(),
				new ArrayList<String>() {{
					this.add("https://bscscan.com/address/0x420000000000000000000000000000000000000A");
					this.add("https://www.coingecko.com/en/coins/weth");
				}});
		tokens.put(MetisERC20Token.WETH.toString(), weth);

		return new ERC20TokenIndex(tokens);
	}

	@SuppressWarnings("serial")
	public static ERC20TokenIndex generateMumbaiTokenIndex() {

		HashMap<String, EVMERC20TokenInfo> tokens = new HashMap<>();

		// ricochet fTUSDx
		EVMERC20TokenInfo ricochet_tusd = new EVMERC20TokenInfo(
				MumbaiERC20Token.RICOCHET_fTUSDx.toString(), 
				"0x918E0d5C96cAC79674E2D38066651212be3C9C48",
				"Ricochet fTUSD token, fTUSDx", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.MUMBAITEST.toString(),
				new ArrayList<String>() {{
					this.add("https://mumbai.polygonscan.com/token/0x918E0d5C96cAC79674E2D38066651212be3C9C48");
					this.add("https://docs.superfluid.finance/superfluid/developers/networks");
				}});
		tokens.put(MumbaiERC20Token.RICOCHET_fTUSDx.toString(), ricochet_tusd);

		// fTUSD
		EVMERC20TokenInfo ftusd = new EVMERC20TokenInfo(
				MumbaiERC20Token.fTUSD.toString(), 
				"0xA794C9ee519FD31BbCE643e8D8138f735E97D1DB",
				"Flux fTUSD stablecoin", 
				18,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.MUMBAITEST.toString(),
				new ArrayList<String>() {{
					this.add("https://mumbai.polygonscan.com/token/0xA794C9ee519FD31BbCE643e8D8138f735E97D1DB");
					this.add("https://docs.superfluid.finance/superfluid/developers/networks");
				}});
		tokens.put(MumbaiERC20Token.fTUSD.toString(), ftusd);

		// ricochet fDAIx
		EVMERC20TokenInfo ricochet_fdai = new EVMERC20TokenInfo(
				MumbaiERC20Token.RICOCHET_fDAIx.toString(), 
				"0x15F0Ca26781C3852f8166eD2ebce5D18265cceb7",
				"Ricochet fDAI token, fDAIx", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.MUMBAITEST.toString(),
				new ArrayList<String>() {{
					this.add("https://mumbai.polygonscan.com/token/0x15F0Ca26781C3852f8166eD2ebce5D18265cceb7");
					this.add("https://docs.superfluid.finance/superfluid/developers/networks");
				}});
		tokens.put(MumbaiERC20Token.RICOCHET_fDAIx.toString(), ricochet_fdai);

		// fDAI
		EVMERC20TokenInfo fdaix = new EVMERC20TokenInfo(
				MumbaiERC20Token.fDAI.toString(), 
				"0x15F0Ca26781C3852f8166eD2ebce5D18265cceb7",
				"Flux fDAI stablecoin", 
				18,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.MUMBAITEST.toString(),
				new ArrayList<String>() {{
					this.add("https://mumbai.polygonscan.com/token/0x15F0Ca26781C3852f8166eD2ebce5D18265cceb7");
					this.add("https://docs.superfluid.finance/superfluid/developers/networks");
				}});
		tokens.put(MumbaiERC20Token.fDAI.toString(), fdaix);

		// ricochet MATICx
		EVMERC20TokenInfo ricochet_maticx = new EVMERC20TokenInfo(
				MumbaiERC20Token.RICOCHET_MATICx.toString(), 
				"0x96B82B65ACF7072eFEb00502F45757F254c2a0D4",
				"Ricochet MATIC token, MATICx", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.MUMBAITEST.toString(),
				new ArrayList<String>() {{
					this.add("https://mumbai.polygonscan.com/token/0x96B82B65ACF7072eFEb00502F45757F254c2a0D4");
					this.add("https://docs.superfluid.finance/superfluid/developers/networks");
				}});
		tokens.put(MumbaiERC20Token.RICOCHET_MATICx.toString(), ricochet_maticx);

		// ricochet fUSDCx
		EVMERC20TokenInfo ricochet_fusdcx = new EVMERC20TokenInfo(
				MumbaiERC20Token.RICOCHET_fUSDCx.toString(), 
				"0x42bb40bF79730451B11f6De1CbA222F17b87Afd7",
				"Ricochet fUSDC token, fUSDCx", 
				18, // !!!!!!!
				TokenCategory.DEFI.toString(),
				EVMChain.MUMBAITEST.toString(),
				new ArrayList<String>() {{
					this.add("https://mumbai.polygonscan.com/token/0x42bb40bF79730451B11f6De1CbA222F17b87Afd7");
					this.add("https://docs.superfluid.finance/superfluid/developers/networks");
				}});
		tokens.put(MumbaiERC20Token.RICOCHET_fUSDCx.toString(), ricochet_fusdcx);

		// fUSDC
		EVMERC20TokenInfo fusdc = new EVMERC20TokenInfo(
				MumbaiERC20Token.fUSDC.toString(), 
				"0xbe49ac1EadAc65dccf204D4Df81d650B50122aB2",
				"Flux fUSDC token", 
				18, // !!!!!!
				TokenCategory.DEFI.toString(),
				EVMChain.MUMBAITEST.toString(),
				new ArrayList<String>() {{
					this.add("https://mumbai.polygonscan.com/token/0xbe49ac1EadAc65dccf204D4Df81d650B50122aB2");
					this.add("https://docs.superfluid.finance/superfluid/developers/networks");
				}});
		tokens.put(MumbaiERC20Token.fUSDC.toString(), fusdc);

		// link
		EVMERC20TokenInfo link = new EVMERC20TokenInfo(
				MumbaiERC20Token.LINK.toString(), 
				"0x326C977E6efc84E512bB9C30f76E30c160eD06FB",
				"LINK token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.MUMBAITEST.toString(),
				new ArrayList<String>() {{
					this.add("https://mumbai.polygonscan.com/token/0x326c977e6efc84e512bb9c30f76e30c160ed06fb");
					this.add("https://www.coingecko.com/en/coins/chainlink");
				}});
		tokens.put(MumbaiERC20Token.LINK.toString(), link);

		// tst
		EVMERC20TokenInfo tst = new EVMERC20TokenInfo(
				MumbaiERC20Token.TST.toString(), 
				"0x2d7882bedcbfddce29ba99965dd3cdf7fcb10a1e",
				"Official Mumbai ERC-20 TST token", 
				18,
				TokenCategory.TEST.toString(),
				EVMChain.MUMBAITEST.toString(),
				new ArrayList<String>() {{
					this.add("https://mumbai.polygonscan.com/address/0x2d7882bedcbfddce29ba99965dd3cdf7fcb10a1e");
				}});
		tokens.put(MumbaiERC20Token.TST.toString(), tst);

		// derc20
		EVMERC20TokenInfo derc20 = new EVMERC20TokenInfo(
				MumbaiERC20Token.DERC20.toString(), 
				"0x2d7882bedcbfddce29ba99965dd3cdf7fcb10a1e",
				"Official Mumbai ERC-20 Dummy ERC20 token", 
				18,
				TokenCategory.TEST.toString(),
				EVMChain.MUMBAITEST.toString(),
				new ArrayList<String>() {{
					this.add("https://mumbai.polygonscan.com/token/0xfe4f5145f6e09952a5ba9e956ed0c25e3fa4c7f1");
				}});
		tokens.put(MumbaiERC20Token.DERC20.toString(), derc20);

		// test
		EVMERC20TokenInfo test = new EVMERC20TokenInfo(
				MumbaiERC20Token.TEST.toString(), 
				"0xeedb61304686f4b544baa1cb19f87c30bb8d38b9",
				//"0xeedb61304686f4b544baa1cb19f87c30bb8d38b9", // FAN :)
				"TEST token", 
				18,
				TokenCategory.TEST.toString(),
				EVMChain.MUMBAITEST.toString(),
				new ArrayList<String>() {{
					this.add("https://mumbai.polygonscan.com/token/0xMOJO");
				}});
		tokens.put(MumbaiERC20Token.TEST.toString(), test);

		return new ERC20TokenIndex(tokens);
	}

	public static String generateNFTIndexJSON(EVMNFTIndex idx) {
		return JSONUtils.createJSONFromPOJO(idx);
	}

	@SuppressWarnings("serial")
	public static EVMNFTIndex generatePolygonNFTIndex() {
		HashMap<String, EVMERC721TokenInfo> erc721tokens = new HashMap<>();
		HashMap<String, EVMERC1155TokenInfo> erc1155tokens = new HashMap<>();

		// mycryptoheroes
		EVMERC721TokenInfo mch = new EVMERC721TokenInfo(
				PolygonERC721Token.MYCRYPTOHEROES.toString(), 
				"0x77bd275ff2b3dc007475aac9ce7f408f5a800188",
				16765971L,
				"My Crypto Heroes NFT", 
				TokenCategory.GAMING.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/address/0x77bd275ff2b3dc007475aac9ce7f408f5a800188");
				}});
		erc721tokens.put(PolygonERC721Token.MYCRYPTOHEROES.toString(), mch);

		// trump
		EVMERC721TokenInfo trump = new EVMERC721TokenInfo(
				PolygonERC721Token.TRUMP.toString(), 
				"0x24a11e702cd90f034ea44faf1e180c0c654ac5d9",
				0L,
				"Trump Digital Trading Card NFT", 
				TokenCategory.SCAM.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/address/0x24a11e702cd90f034ea44faf1e180c0c654ac5d9");
				}});
		erc721tokens.put(PolygonERC721Token.TRUMP.toString(), trump);

		// uniswap v3 position
		EVMERC721TokenInfo uniswap_v3_pos = new EVMERC721TokenInfo(
				PolygonERC721Token.UNISWAPV3_POSITION.toString(), 
				"0xC36442b4a4522E871399CD717aBDD847Ab11FE88",
				0L,
				"Uniswap v3 position NFT", 
				TokenCategory.DEFI.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/token/0xc36442b4a4522e871399cd717abdd847ab11fe88");
				}});
		erc721tokens.put(PolygonERC721Token.UNISWAPV3_POSITION.toString(), uniswap_v3_pos);

		// unioverse
		EVMERC721TokenInfo unioverse = new EVMERC721TokenInfo(
				PolygonERC721Token.UNIOVERSE.toString(), 
				"0xed55e4477b795eaa9bb4bca24df42214e1a05c18",
				0L,
				"Unioverse Collectibles", 
				TokenCategory.NFT.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/address/0xed55e4477b795eaa9bb4bca24df42214e1a05c18");
				}});
		erc721tokens.put(PolygonERC721Token.UNIOVERSE.toString(), unioverse);

		// uapx alien
		EVMERC721TokenInfo uapxalien = new EVMERC721TokenInfo(
				PolygonERC721Token.UAPX_ALIEN.toString(), 
				"0xd8f000eac06cebab3b967eeb137fbcac842a1472",
				0L,
				"UAPx alien NFT (formerly Terra)", 
				TokenCategory.NFT.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/address/0xd8f000eac06cebab3b967eeb137fbcac842a1472");
				}});
		erc721tokens.put(PolygonERC721Token.UAPX_ALIEN.toString(), uapxalien);

		// uapx ship
		EVMERC721TokenInfo uapxship = new EVMERC721TokenInfo(
				PolygonERC721Token.UAPX_SHIP.toString(), 
				"0x2148da6c55c10ea3d9b33311d19a065592abd24b",
				0L,
				"UAPx ship NFT (formerly Terra)", 
				TokenCategory.NFT.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/address/0x2148da6c55c10ea3d9b33311d19a065592abd24b");
				}});
		erc721tokens.put(PolygonERC721Token.UAPX_SHIP.toString(), uapxship);

		// uapx song
		EVMERC721TokenInfo uapxsong = new EVMERC721TokenInfo(
				PolygonERC721Token.UAPX_SONG.toString(), 
				"0x86c47873dd7d2186f5bd87da4757aecf1e16ac2e",
				0L,
				"UAPx song NFT (formerly Terra)", 
				TokenCategory.NFT.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/address/0x86c47873dd7d2186f5bd87da4757aecf1e16ac2e");
				}});
		erc721tokens.put(PolygonERC721Token.UAPX_SONG.toString(), uapxsong);

		// aaveogotchi_land
		EVMERC721TokenInfo aaveogotchi_land = new EVMERC721TokenInfo(
				PolygonERC721Token.AAVEGOTCHI_LAND.toString(), 
				"0x1d0360bac7299c86ec8e99d0c1c9a95fefaf2a11",
				0L,
				"AAvegotchi game LAND NFT", 
				TokenCategory.GAMING.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/address/0x1d0360bac7299c86ec8e99d0c1c9a95fefaf2a11");
				}},
				new ArrayList<String>() {{
					this.add(EVMChain.POLYGON.toString() + ":" + PolygonERC20Token.GHST.toString());
					this.add(EVMChain.POLYGON.toString() + ":" + PolygonERC20Token.KEK.toString());
					this.add(EVMChain.POLYGON.toString() + ":" + PolygonERC20Token.ALPHA.toString());
					this.add(EVMChain.POLYGON.toString() + ":" + PolygonERC20Token.FOMO.toString());
					this.add(EVMChain.POLYGON.toString() + ":" + PolygonERC20Token.FUD.toString());
					this.add(EVMChain.POLYGON.toString() + ":" + PolygonERC20Token.GLTR.toString());
				}});
		erc721tokens.put(PolygonERC721Token.AAVEGOTCHI_LAND.toString(), aaveogotchi_land);

		// aavegotchi
		EVMERC721TokenInfo aaveogotchi = new EVMERC721TokenInfo(
				PolygonERC721Token.AAVEGOTCHI.toString(), 
				"0x86935f11c86623dec8a25696e1c19a8659cbf95d",
				0L,
				"AAvegotchi game NFT", 
				TokenCategory.GAMING.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/token/0x86935f11c86623dec8a25696e1c19a8659cbf95d");
				}},
				new ArrayList<String>() {{
					this.add(EVMChain.POLYGON.toString() + ":" + PolygonERC20Token.GHST.toString());
					this.add(EVMChain.POLYGON.toString() + ":" + PolygonERC20Token.KEK.toString());
					this.add(EVMChain.POLYGON.toString() + ":" + PolygonERC20Token.ALPHA.toString());
					this.add(EVMChain.POLYGON.toString() + ":" + PolygonERC20Token.FOMO.toString());
					this.add(EVMChain.POLYGON.toString() + ":" + PolygonERC20Token.FUD.toString());
					this.add(EVMChain.POLYGON.toString() + ":" + PolygonERC20Token.GLTR.toString());
				}});
		erc721tokens.put(PolygonERC721Token.AAVEGOTCHI.toString(), aaveogotchi);

		// aavegotchi_install
		EVMERC1155TokenInfo aavegotchi_install = new EVMERC1155TokenInfo(
				PolygonERC1155Token.AAVEGOTCHI_INSTALLATION.toString(), 
				"0x9216c31d8146bcb3ea5a9162dc1702e8aedca355",
				0L,
				"AAvegotchi game land installation NFT", 
				TokenCategory.GAMING.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/address/0x9216c31d8146bcb3ea5a9162dc1702e8aedca355");
					this.add("https://opensea.io/collection/gotchiverse-installations");
				}},
				new ArrayList<String>() {{
					this.add(EVMChain.POLYGON.toString() + ":" + PolygonERC20Token.GHST.toString());
					this.add(EVMChain.POLYGON.toString() + ":" + PolygonERC20Token.KEK.toString());
					this.add(EVMChain.POLYGON.toString() + ":" + PolygonERC20Token.ALPHA.toString());
					this.add(EVMChain.POLYGON.toString() + ":" + PolygonERC20Token.FOMO.toString());
					this.add(EVMChain.POLYGON.toString() + ":" + PolygonERC20Token.FUD.toString());
					this.add(EVMChain.POLYGON.toString() + ":" + PolygonERC20Token.GLTR.toString());
				}});
		erc1155tokens.put(PolygonERC1155Token.AAVEGOTCHI_INSTALLATION.toString(), aavegotchi_install);

		// aavegotchi_gmi
		EVMERC721TokenInfo aavegotchi_gmi = new EVMERC721TokenInfo(
				PolygonERC721Token.AAVEGOTCHI_GMI.toString(), 
				"0x3f0e22b827e51ff567d7388c2b598e2eabfa74be",
				0L,
				"AAvegotchi GMI NFT", 
				TokenCategory.GAMING.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/address/0x3f0e22b827e51ff567d7388c2b598e2eabfa74be");
				}},
				new ArrayList<String>() {{
					this.add(EVMChain.POLYGON.toString() + ":" + PolygonERC20Token.GHST.toString());
					this.add(EVMChain.POLYGON.toString() + ":" + PolygonERC20Token.KEK.toString());
					this.add(EVMChain.POLYGON.toString() + ":" + PolygonERC20Token.ALPHA.toString());
					this.add(EVMChain.POLYGON.toString() + ":" + PolygonERC20Token.FOMO.toString());
					this.add(EVMChain.POLYGON.toString() + ":" + PolygonERC20Token.FUD.toString());
					this.add(EVMChain.POLYGON.toString() + ":" + PolygonERC20Token.GLTR.toString());
				}});
		erc721tokens.put(PolygonERC721Token.AAVEGOTCHI_GMI.toString(), aavegotchi_gmi);

		// unstoppable domains
		EVMERC721TokenInfo unstoppable = new EVMERC721TokenInfo(
				PolygonERC721Token.UNSTOPPABLE_DOMAIN.toString(), 
				"0xa9a6a3626993d487d2dbda3173cf58ca1a9d9e9f",
				0L,
				"Unstoppable domains NFT", 
				TokenCategory.GAMING.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/address/0xa9a6a3626993d487d2dbda3173cf58ca1a9d9e9f");
				}});
		erc721tokens.put(PolygonERC721Token.UNSTOPPABLE_DOMAIN.toString(), unstoppable);

		// lensprotocolprofile
		EVMERC721TokenInfo lensprotocolprofile = new EVMERC721TokenInfo(
				PolygonERC721Token.LENSPROTOCOLPROFILE.toString(), 
				"0xdb46d1dc155634fbc732f92e853b10b288ad5a1d",
				0L,
				"Lens Protocol Profile NFT", 
				TokenCategory.GAMING.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/address/0xdb46d1dc155634fbc732f92e853b10b288ad5a1d");
				}});
		erc721tokens.put(PolygonERC721Token.LENSPROTOCOLPROFILE.toString(), lensprotocolprofile);

		// sandboxland
		EVMERC721TokenInfo sandboxland = new EVMERC721TokenInfo(
				PolygonERC721Token.SANDBOX_LAND.toString(), 
				"0x9d305a42a3975ee4c1c57555bed5919889dce63f",
				0L,
				"The Sandbox LAND NFT", 
				TokenCategory.GAMING.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/address/0x9d305a42a3975ee4c1c57555bed5919889dce63f");
					this.add("https://opensea.io/collection/sandbox");
				}},
				new ArrayList<String>() {{
					this.add(EVMChain.POLYGON.toString() + ":" + PolygonERC20Token.SAND.toString());
				}});
		erc721tokens.put(PolygonERC721Token.SANDBOX_LAND.toString(), sandboxland);

		return new EVMNFTIndex(erc721tokens, erc1155tokens);
	}


	@SuppressWarnings("serial")
	public static EVMNFTIndex generateGoerliNFTIndex() {
		HashMap<String, EVMERC721TokenInfo> erc721tokens = new HashMap<>();
		HashMap<String, EVMERC1155TokenInfo> erc1155tokens = new HashMap<>();

		// multifaucetNFT
		EVMERC721TokenInfo multifaucetNFT = new EVMERC721TokenInfo(
				GoerliERC721Token.MFNFT.toString(), 
				"0xf5de760f2e916647fd766b4ad9e85ff943ce3a2b",
				0L,
				"MultiFaucet NFT", 
				TokenCategory.DEFI.toString(),
				EVMChain.GOERLITEST.toString(),
				new ArrayList<String>() {{
					this.add("https://goerli.etherscan.io/token/0xf5de760f2e916647fd766b4ad9e85ff943ce3a2b");
				}});
		erc721tokens.put(GoerliERC721Token.MFNFT.toString(), multifaucetNFT);

		return new EVMNFTIndex(erc721tokens, erc1155tokens);
	}


	@SuppressWarnings("serial")
	public static ERC20TokenIndex generatePolygonTokenIndex() {

		HashMap<String, EVMERC20TokenInfo> tokens = new HashMap<>();

		// dquick
		EVMERC20TokenInfo dquick = new EVMERC20TokenInfo(
				PolygonERC20Token.dQUICK.toString(), 
				"0x958d208cdf087843e9ad98d23823d32e17d723a1",
				"Dragon QUICK token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/token/0x958d208cdf087843e9ad98d23823d32e17d723a1");
					this.add("https://www.coingecko.com/en/exchanges/quickswap");
				}});
		tokens.put(PolygonERC20Token.dQUICK.toString(), dquick);

		// maticx
		EVMERC20TokenInfo maticx = new EVMERC20TokenInfo(
				PolygonERC20Token.MATICX.toString(), 
				"0xfa68fb4628dff1028cfec22b4162fccd0d45efb6",
				"Stader Liquid Staking Matic (PoS) token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/token/0xfa68fb4628dff1028cfec22b4162fccd0d45efb6");
					this.add("https://www.coingecko.com/en/coins/stader-maticx");
				}});
		tokens.put(PolygonERC20Token.MATICX.toString(), maticx);

		// reth
		EVMERC20TokenInfo reth = new EVMERC20TokenInfo(
				PolygonERC20Token.rETH.toString(), 
				"0x0266f4f08d82372cf0fcbccc0ff74309089c74d1",
				"Rocketpool ETH token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/token/0x0266f4f08d82372cf0fcbccc0ff74309089c74d1");
					this.add("https://rocketpool.net/");
				}});
		tokens.put(PolygonERC20Token.rETH.toString(), reth);

		// virtuswap
		EVMERC20TokenInfo virtuswap = new EVMERC20TokenInfo(
				PolygonERC20Token.VRSW.toString(), 
				"0x57999936fc9a9ec0751a8d146cce11901be8bed0",
				"Virtuswap token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/token/0x57999936fc9a9ec0751a8d146cce11901be8bed0");
				}});
		tokens.put(PolygonERC20Token.VRSW.toString(), virtuswap);

		// bgem
		EVMERC20TokenInfo bgem = new EVMERC20TokenInfo(
				PolygonERC20Token.BGEM.toString(), 
				"0x1386617A1Bb2A6AA712AB3616bCAF1211152D1e8",
				"BitGem gaming token", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/token/0x1386617A1Bb2A6AA712AB3616bCAF1211152D1e8");
					this.add("https://boomland.io/daily");
				}});
		tokens.put(PolygonERC20Token.BGEM.toString(), bgem);

		// ricochet WBTCx
		EVMERC20TokenInfo ricochet_wbtcx = new EVMERC20TokenInfo(
				PolygonERC20Token.RICOCHET_WBTCx.toString(), 
				"0x4086eBf75233e8492F1BCDa41C7f2A8288c2fB92",
				"Ricochet WBTC token, WBTCx", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/token/0x4086eBf75233e8492F1BCDa41C7f2A8288c2fB92");
					this.add("https://docs.superfluid.finance/superfluid/developers/networks");
				}});
		tokens.put(PolygonERC20Token.RICOCHET_WBTCx.toString(), ricochet_wbtcx);

		// ricochet DAIx
		EVMERC20TokenInfo ricochet_daix = new EVMERC20TokenInfo(
				PolygonERC20Token.RICOCHET_DAIx.toString(), 
				"0x8f3cf7ad23cd3cadbd9735aff958023239c6a063",
				"Ricochet DAI token, DAIx", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/token/0x8f3cf7ad23cd3cadbd9735aff958023239c6a063");
					this.add("https://docs.superfluid.finance/superfluid/developers/networks");
				}});
		tokens.put(PolygonERC20Token.RICOCHET_DAIx.toString(), ricochet_daix);

		// ricochet ETHx
		EVMERC20TokenInfo ricochet_ethx = new EVMERC20TokenInfo(
				PolygonERC20Token.RICOCHET_ETHx.toString(), 
				"0x27e1e4E6BC79D93032abef01025811B7E4727e85",
				"Ricochet ETH token, ETHx", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/token/0x27e1e4E6BC79D93032abef01025811B7E4727e85");
					this.add("https://docs.superfluid.finance/superfluid/developers/networks");
				}});
		tokens.put(PolygonERC20Token.RICOCHET_ETHx.toString(), ricochet_ethx);

		// ricochet MATICx
		EVMERC20TokenInfo ricochet_maticx = new EVMERC20TokenInfo(
				PolygonERC20Token.RICOCHET_MATICx.toString(), 
				"0x3aD736904E9e65189c3000c7DD2c8AC8bB7cD4e3",
				"Ricochet MATIC token, MATICx", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/token/0x3aD736904E9e65189c3000c7DD2c8AC8bB7cD4e3");
					this.add("https://docs.superfluid.finance/superfluid/developers/networks");
				}});
		tokens.put(PolygonERC20Token.RICOCHET_MATICx.toString(), ricochet_maticx);

		// ricochet USDCx
		EVMERC20TokenInfo ricochet_usdcx = new EVMERC20TokenInfo(
				PolygonERC20Token.RICOCHET_USDCx.toString(), 
				"0xcaa7349cea390f89641fe306d93591f87595dc1f",
				"Ricochet USDC token, USDCx", 
				18, // !!!!!!!!
				TokenCategory.DEFI.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/token/0xcaa7349cea390f89641fe306d93591f87595dc1f");
					this.add("https://docs.superfluid.finance/superfluid/developers/networks");
				}});
		tokens.put(PolygonERC20Token.RICOCHET_USDCx.toString(), ricochet_usdcx);

		// ricochet
		EVMERC20TokenInfo ricochet = new EVMERC20TokenInfo(
				PolygonERC20Token.RICOCHET.toString(), 
				"0x263026e7e53dbfdce5ae55ade22493f828922965",
				"Ricochet reward token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/address/0x263026e7e53dbfdce5ae55ade22493f828922965");
					this.add("https://www.coingecko.com/en/coins/ricochet");
				}});
		tokens.put(PolygonERC20Token.RICOCHET.toString(), ricochet);

		// cxdoge
		EVMERC20TokenInfo cxdoge = new EVMERC20TokenInfo(
				PolygonERC20Token.CXDOGE.toString(), 
				"0x9bd9ad490dd3a52f096d229af4483b94d63be618",
				"CelsiusX Wrapped DOGE token (wrecked)", 
				18,
				TokenCategory.WRECKED.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/address/0x9bd9ad490dd3a52f096d229af4483b94d63be618");
					this.add("https://www.coingecko.com/en/coins/celsiusx-wrapped-doge");
				}});
		tokens.put(PolygonERC20Token.CXDOGE.toString(), cxdoge);

		// synapse
		EVMERC20TokenInfo syn = new EVMERC20TokenInfo(
				PolygonERC20Token.SYNAPSE.toString(), 
				"0xf8f9efc0db77d8881500bb06ff5d6abc3070e695",
				"Synapse Defi token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/token/0xf8f9efc0db77d8881500bb06ff5d6abc3070e695");
					this.add("https://www.coingecko.com/en/coins/synapse");
				}});
		tokens.put(PolygonERC20Token.SYNAPSE.toString(), syn);

		// ghst
		EVMERC20TokenInfo ghst = new EVMERC20TokenInfo(
				PolygonERC20Token.GHST.toString(), 
				"0x385eeac5cb85a38a9a07a70c73e0a3271cfb54a7",
				"Aavegotchi GHST game token", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/address/0x385eeac5cb85a38a9a07a70c73e0a3271cfb54a7");
					this.add("https://www.coingecko.com/en/coins/aavegotchi");
				}});
		tokens.put(PolygonERC20Token.GHST.toString(), ghst);

		// tower
		EVMERC20TokenInfo tower = new EVMERC20TokenInfo(
				PolygonERC20Token.TOWER.toString(), 
				"0x2bc07124d8dac638e290f401046ad584546bc47b",
				"Crazy Defense Heroes game token", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/address/0x2bc07124d8dac638e290f401046ad584546bc47b");
					this.add("https://www.coingecko.com/en/coins/tower");
				}});
		tokens.put(PolygonERC20Token.TOWER.toString(), tower);


		// lucha
		EVMERC20TokenInfo lucha = new EVMERC20TokenInfo(
				PolygonERC20Token.LUCHA.toString(), 
				"0x6749441fdc8650b5b5a854ed255c82ef361f1596",
				"Luchadores game token", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/address/0x6749441fdc8650b5b5a854ed255c82ef361f1596");
					this.add("https://www.coingecko.com/en/coins/lucha");
				}});
		tokens.put(PolygonERC20Token.LUCHA.toString(), lucha);

		// aghst
		EVMERC20TokenInfo aghst = new EVMERC20TokenInfo(
				PolygonERC20Token.AGHST.toString(), 
				"0x8eb270e296023e9d92081fdf967ddd7878724424",
				"AAve Aavegotchi GHST game token", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/address/0x8eb270e296023e9d92081fdf967ddd7878724424");
					this.add("https://www.coingecko.com/en/coins/aavegotchi");
				}});
		tokens.put(PolygonERC20Token.AGHST.toString(), aghst);

		// kek
		EVMERC20TokenInfo kek = new EVMERC20TokenInfo(
				PolygonERC20Token.KEK.toString(), 
				"0x42e5e06ef5b90fe15f853f59299fc96259209c5c",
				"Aavegotchi KEK game token", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/address/0x42e5e06ef5b90fe15f853f59299fc96259209c5c");
					this.add("https://www.coingecko.com/en/coins/aavegotchi-kek");
				}});
		tokens.put(PolygonERC20Token.KEK.toString(), kek);

		// gltr
		EVMERC20TokenInfo gltr = new EVMERC20TokenInfo(
				PolygonERC20Token.GLTR.toString(), 
				"0x3801c3b3b5c98f88a9c9005966aa96aa440b9afc",
				"GAX Liquidity Token Reward, Aavegotchi game token", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/token/0x3801c3b3b5c98f88a9c9005966aa96aa440b9afc");
					this.add("https://www.coingecko.com/en/coins/gax-liquidity-token-reward");
				}});
		tokens.put(PolygonERC20Token.GLTR.toString(), gltr);

		// alpha
		EVMERC20TokenInfo alpha = new EVMERC20TokenInfo(
				PolygonERC20Token.ALPHA.toString(), 
				"0x6a3e7c3c6ef65ee26975b12293ca1aad7e1daed2",
				"Aavegotchi ALPHA game token", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/address/0x6a3e7c3c6ef65ee26975b12293ca1aad7e1daed2");
					this.add("https://www.coingecko.com/en/coins/aavegotchi-alpha");
				}});
		tokens.put(PolygonERC20Token.ALPHA.toString(), alpha);

		// fud
		EVMERC20TokenInfo fud = new EVMERC20TokenInfo(
				PolygonERC20Token.FUD.toString(), 
				"0x403e967b044d4be25170310157cb1a4bf10bdd0f",
				"Aavegotchi FUD game token", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/address/0x403e967b044d4be25170310157cb1a4bf10bdd0f");
					this.add("https://www.coingecko.com/en/coins/aavegotchi-fud");
				}});
		tokens.put(PolygonERC20Token.FUD.toString(), fud);

		// fomo
		EVMERC20TokenInfo fomo = new EVMERC20TokenInfo(
				PolygonERC20Token.FOMO.toString(), 
				"0x44a6e0be76e1d9620a7f76588e4509fe4fa8e8c8",
				"Aavegotchi FOMO game token", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/address/0x44a6e0be76e1d9620a7f76588e4509fe4fa8e8c8");
					this.add("https://www.coingecko.com/en/coins/aavegotchi-fomo");
				}});
		tokens.put(PolygonERC20Token.FOMO.toString(), fomo);

		// sand
		EVMERC20TokenInfo sand = new EVMERC20TokenInfo(
				PolygonERC20Token.SAND.toString(), 
				"0xbbba073c31bf03b8acf7c28ef0738decf3695683",
				"The Sandbox SAND game token", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/address/0xbbba073c31bf03b8acf7c28ef0738decf3695683");
					this.add("https://www.coingecko.com/en/coins/the-sandbox");
				}});
		tokens.put(PolygonERC20Token.SAND.toString(), sand);

		// modefi
		EVMERC20TokenInfo modefi = new EVMERC20TokenInfo(
				PolygonERC20Token.MOD.toString(), 
				"0x8346ab8d5ea7a9db0209aed2d1806afa0e2c4c21",
				"MOD token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://www.coingecko.com/en/coins/modefi");
					this.add("https://polygonscan.com/token/0x8346ab8d5ea7a9db0209aed2d1806afa0e2c4c21");
					this.add("https://modefi.io/");
				}});
		tokens.put(PolygonERC20Token.MOD.toString(), modefi);

		// idex
		EVMERC20TokenInfo idex = new EVMERC20TokenInfo(
				PolygonERC20Token.IDEX.toString(), 
				"0x9cb74c8032b007466865f060ad2c46145d45553d",
				"IDEX token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/token/0x9cb74c8032b007466865f060ad2c46145d45553d");
				}});
		tokens.put(PolygonERC20Token.IDEX.toString(), idex);

		// titan
		EVMERC20TokenInfo titan = new EVMERC20TokenInfo(
				PolygonERC20Token.TITAN.toString(), 
				"0xaaa5b9e6c589642f98a1cda99b9d024b8407285a",
				"IRON TITAN scam token", 
				18,
				TokenCategory.SCAM.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/token/0xaaa5b9e6c589642f98a1cda99b9d024b8407285a");
				}});
		tokens.put(PolygonERC20Token.TITAN.toString(), titan);

		// stg
		EVMERC20TokenInfo stg = new EVMERC20TokenInfo(
				PolygonERC20Token.STG.toString(), 
				"0x2f6f07cdcf3588944bf4c42ac74ff24bf56e7590",
				"StarGate token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/token/0x2f6f07cdcf3588944bf4c42ac74ff24bf56e7590");
					this.add("https://www.coingecko.com/en/coins/stargate-finance");
				}});
		tokens.put(PolygonERC20Token.STG.toString(), stg);

		// wmatic/ghst quickswap LP
		EVMERC20TokenInfo quickswap_awmatic_ghst_lp = new EVMERC20TokenInfo(
				PolygonERC20Token.QUICKSWAP_aWMATIC_GHST_LP.toString(), 
				"0x2ef46196d7d25b5111ca1fcba206b248fee32d8d",
				"WMATIC/GHST Quickswap Pool token", 
				18,
				TokenCategory.LIQUIDITY_PROVIDER.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/token/0x2ef46196d7d25b5111ca1fcba206b248fee32d8d");
				}});
		tokens.put(PolygonERC20Token.QUICKSWAP_aWMATIC_GHST_LP.toString(), quickswap_awmatic_ghst_lp);

		// usdc stargate LP // staking contract: https://polygonscan.com/address/0x8731d54e9d02c286767d56ac03e8037c07e01e98#code
		EVMERC20TokenInfo susdc = new EVMERC20TokenInfo(
				PolygonERC20Token.STARGATE_USDC_LP.toString(), 
				"0x1205f31718499dbf1fca446663b532ef87481fe1",
				"StarGate USDC Pool token", 
				6,
				TokenCategory.DEFI.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/token/0x1205f31718499dbf1fca446663b532ef87481fe1");
				}});
		tokens.put(PolygonERC20Token.STARGATE_USDC_LP.toString(), susdc);

		// link
		EVMERC20TokenInfo link = new EVMERC20TokenInfo(
				PolygonERC20Token.LINK.toString(), 
				"0x53e0bca35ec356bd5dddfebbd1fc0fd03fabad39",
				"LINK token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/address/0x53e0bca35ec356bd5dddfebbd1fc0fd03fabad39");
					this.add("https://www.coingecko.com/en/coins/chainlink");
				}});
		tokens.put(PolygonERC20Token.LINK.toString(), link);

		// amlink
		EVMERC20TokenInfo amlink = new EVMERC20TokenInfo(
				PolygonERC20Token.amLINK.toString(), 
				"0x0ca2e42e8c21954af73bc9af1213e4e81d6a669a",
				"Aave LINK token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/token/0x0ca2e42e8c21954af73bc9af1213e4e81d6a669a");
					this.add("https://www.coingecko.com/en/coins/chainlink");
				}});
		tokens.put(PolygonERC20Token.amLINK.toString(), amlink);

		// amwmatic
		EVMERC20TokenInfo amwmatic = new EVMERC20TokenInfo(
				PolygonERC20Token.amWMATIC.toString(), 
				"0x8df3aad3a84da6b69a4da8aec3ea40d9091b2ac4",
				"Aave WMATIC token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/token/0x8df3aad3a84da6b69a4da8aec3ea40d9091b2ac4");
					this.add("https://www.coingecko.com/en/coins/aave-polygon-wmatic");
				}});
		tokens.put(PolygonERC20Token.amWMATIC.toString(), amwmatic);

		// wmatic
		EVMERC20TokenInfo wmatic = new EVMERC20TokenInfo(
				PolygonERC20Token.WMATIC.toString(), 
				"0x0d500b1d8e8ef31e21c99d1db9a6444d3adf1270",
				"WMATIC token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/address/0x0d500b1d8e8ef31e21c99d1db9a6444d3adf1270");
					this.add("https://www.coingecko.com/en/coins/wmatic");
				}});
		tokens.put(PolygonERC20Token.WMATIC.toString(), wmatic);

		// weth
		EVMERC20TokenInfo weth = new EVMERC20TokenInfo(
				PolygonERC20Token.WETH.toString(), 
				"0x7ceb23fd6bc0add59e62ac25578270cff1b9f619",
				"Wrapped ETH token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/token/0x7ceb23fd6bc0add59e62ac25578270cff1b9f619");
					this.add("https://www.coingecko.com/en/coins/weth");
				}});
		tokens.put(PolygonERC20Token.WETH.toString(), weth);

		// usdc
		EVMERC20TokenInfo usdc = new EVMERC20TokenInfo(
				PolygonERC20Token.USDC.toString(), 
				"0x2791bca1f2de4661ed88a30c99a7a9449aa84174",
				"USDC stablecoin token", 
				6,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/address/0x2791bca1f2de4661ed88a30c99a7a9449aa84174");
					this.add("https://www.coingecko.com/en/coins/usd-coin");
				}});
		tokens.put(PolygonERC20Token.USDC.toString(), usdc);

		// dai
		EVMERC20TokenInfo dai = new EVMERC20TokenInfo(
				PolygonERC20Token.DAI.toString(), 
				"0x8f3cf7ad23cd3cadbd9735aff958023239c6a063",
				"DAI stablecoin token", 
				18,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/address/0x8f3cf7ad23cd3cadbd9735aff958023239c6a063");
					this.add("https://www.coingecko.com/en/coins/dai");
				}});
		tokens.put(PolygonERC20Token.DAI.toString(), dai);

		EVMERC20TokenInfo gdai = new EVMERC20TokenInfo(
				PolygonERC20Token.gDAI.toString(), 
				"0x91993f2101cc758d0deb7279d41e880f7defe827",
				"GAINS Network DAI token", 
				18,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/address/0x91993f2101cc758d0deb7279d41e880f7defe827");
				}});
		tokens.put(PolygonERC20Token.gDAI.toString(), gdai);

		// usdt
		EVMERC20TokenInfo usdt = new EVMERC20TokenInfo(
				PolygonERC20Token.USDT.toString(), 
				"0xc2132d05d31c914a87c6611c10748aeb04b58e8f",
				"Tether stablecoin token", 
				18,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/address/0xc2132d05d31c914a87c6611c10748aeb04b58e8f");
					this.add("https://www.coingecko.com/en/coins/tether");
				}});
		tokens.put(PolygonERC20Token.USDT.toString(), usdt);

		// roll
		EVMERC20TokenInfo roll = new EVMERC20TokenInfo(
				PolygonERC20Token.ROLL.toString(), 
				"0xC68e83a305b0FaD69E264A1769a0A070F190D2d6",
				"ROLL SCAM token", 
				18,
				TokenCategory.DUST.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/token/0xc68e83a305b0fad69e264a1769a0a070f190d2d6#comments");
					this.add("https://polyroll.org/");
				}});
		tokens.put(PolygonERC20Token.ROLL.toString(), roll);

		// Sandbox WMATIC+SAND LP Token
		EVMERC20TokenInfo sandbox_wmatic_sand_lp = new EVMERC20TokenInfo(
				PolygonERC20Token.SANDBOX_WMATIC_SAND_LP.toString(), 
				"0x4ab071c42c28c4858c4bac171f06b13586b20f30",
				"Sandbox WMATIC+SAND LP Token",
				18,
				TokenCategory.LIQUIDITY_PROVIDER.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/token/0x4ab071c42c28c4858c4bac171f06b13586b20f30");
					this.add("https://medium.com/sandbox-game/introducing-msand-matic-staking-at-the-sandbox-319f983d20a4");
				}});
		tokens.put(PolygonERC20Token.SANDBOX_WMATIC_SAND_LP.toString(), sandbox_wmatic_sand_lp);

		// test
		EVMERC20TokenInfo test = new EVMERC20TokenInfo(
				PolygonERC20Token.TEST.toString(), 
				"0x23D29D30e35C5e8D321e1dc9A8a61BFD846D4C5C",
				//"0x23D29D30e35C5e8D321e1dc9A8a61BFD846D4C5C", // HEX :)
				"TEST token", 
				18,
				TokenCategory.TEST.toString(),
				EVMChain.POLYGON.toString(),
				new ArrayList<String>() {{
					this.add("https://polygonscan.com/token/0xMOJO");
				}});
		tokens.put(PolygonERC20Token.TEST.toString(), test);

		return new ERC20TokenIndex(tokens);
	}


	@SuppressWarnings("serial")
	public static ERC20TokenIndex generateArbitrumONETokenIndex() {

		HashMap<String, EVMERC20TokenInfo> tokens = new HashMap<>();

		// winr
		EVMERC20TokenInfo winr = new EVMERC20TokenInfo(
				ArbitrumONEERC20Token.WINR.toString(), 
				"0xd77b108d4f6cefaa0cae9506a934e825becca46e",
				"WINR token", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.ARBITRUMONE.toString(),
				new ArrayList<String>() {{
					this.add("https://arbiscan.io/address/0xd77b108d4f6cefaa0cae9506a934e825becca46e");
					this.add("https://www.coingecko.com/en/coins/winr-protocol");
				}});
		tokens.put(ArbitrumONEERC20Token.WINR.toString(), winr);

		// reth
		EVMERC20TokenInfo reth = new EVMERC20TokenInfo(
				ArbitrumONEERC20Token.rETH.toString(), 
				"0xEC70Dcb4A1EFa46b8F2D97C310C9c4790ba5ffA8",
				"Rocketpool ETH token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.ARBITRUMONE.toString(),
				new ArrayList<String>() {{
					this.add("https://arbiscan.io/address/0xec70dcb4a1efa46b8f2d97c310c9c4790ba5ffa8");
					this.add("https://rocketpool.net/");
				}});
		tokens.put(ArbitrumONEERC20Token.rETH.toString(), reth);

		// magic
		EVMERC20TokenInfo magic = new EVMERC20TokenInfo(
				ArbitrumONEERC20Token.MAGIC.toString(), 
				"0x539bde0d7dbd336b79148aa742883198bbf60342",
				"MAGIC gaming token", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.ARBITRUMONE.toString(),
				new ArrayList<String>() {{
					this.add("https://arbiscan.io/address/0x539bde0d7dbd336b79148aa742883198bbf60342");
					this.add("https://www.coingecko.com/en/coins/magic");
				}});
		tokens.put(ArbitrumONEERC20Token.MAGIC.toString(), magic);

		// usdce
		EVMERC20TokenInfo usdce = new EVMERC20TokenInfo(
				ArbitrumONEERC20Token.USDCe.toString(), 
				"0xff970a61a04b1ca14834a43f5de4533ebddb5cc8",
				"Bridged USDC stablecoin token (USDC.e)", 
				6,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.ARBITRUMONE.toString(),
				new ArrayList<String>() {{
					this.add("https://arbiscan.io/address/0xff970a61a04b1ca14834a43f5de4533ebddb5cc8");
					this.add("https://www.coingecko.com/en/coins/usd-coin-ethereum-bridged");
				}});
		tokens.put(ArbitrumONEERC20Token.USDCe.toString(), usdce);

		// usdc
		EVMERC20TokenInfo usdc = new EVMERC20TokenInfo(
				ArbitrumONEERC20Token.USDC.toString(), 
				"0xaf88d065e77c8cc2239327c5edb3a432268e5831",
				"USDC stablecoin token", 
				6,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.ARBITRUMONE.toString(),
				new ArrayList<String>() {{
					this.add("https://arbiscan.io/address/0xaf88d065e77c8cc2239327c5edb3a432268e5831");
					this.add("https://www.coingecko.com/en/coins/usd-coin");
				}});
		tokens.put(ArbitrumONEERC20Token.USDC.toString(), usdc);


		// dai
		EVMERC20TokenInfo dai = new EVMERC20TokenInfo(
				ArbitrumONEERC20Token.DAI.toString(), 
				"0xda10009cbd5d07dd0cecc66161fc93d7c9000da1",
				"DAI stablecoin token", 
				18,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.ARBITRUMONE.toString(),
				new ArrayList<String>() {{
					this.add("https://arbiscan.io/address/0xda10009cbd5d07dd0cecc66161fc93d7c9000da1");
					this.add("https://www.coingecko.com/en/coins/dai");
				}});
		tokens.put(ArbitrumONEERC20Token.DAI.toString(), dai);

		// bal
		EVMERC20TokenInfo bal = new EVMERC20TokenInfo(
				ArbitrumONEERC20Token.BAL.toString(), 
				"0x040d1edc9569d4bab2d15287dc5a4f10f56a56b8",
				"Balancer DEFI GOV token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.ARBITRUMONE.toString(),
				new ArrayList<String>() {{
					this.add("https://arbiscan.io/token/0x040d1edc9569d4bab2d15287dc5a4f10f56a56b8");
				}});
		tokens.put(ArbitrumONEERC20Token.BAL.toString(), bal);

		// arb
		EVMERC20TokenInfo arb = new EVMERC20TokenInfo(
				ArbitrumONEERC20Token.ARBITRUM.toString(), 
				"0x912ce59144191c1204e64559fe8253a0e49e6548",
				"Arbitrum GOV token", 
				18,
				TokenCategory.GOVERNANCE.toString(),
				EVMChain.ARBITRUMONE.toString(),
				new ArrayList<String>() {{
					this.add("https://arbiscan.io/address/0x912ce59144191c1204e64559fe8253a0e49e6548");
				}});
		tokens.put(ArbitrumONEERC20Token.ARBITRUM.toString(), arb);

		// bal_5050_magic_usdc_lp
		EVMERC20TokenInfo bal_5050_magic_usdc_lp = new EVMERC20TokenInfo(
				ArbitrumONEERC20Token.BAL_MAGICUSDC_LP.toString(), 
				"0xb3028ca124b80cfe6e9ca57b70ef2f0ccc41ebd4",
				"Balancer 50/50 MAGIC/USDC LP token", 
				18,
				TokenCategory.LIQUIDITY_PROVIDER.toString(),
				EVMChain.ARBITRUMONE.toString(),
				new ArrayList<String>() {{
					this.add("https://arbiscan.io/token/0xb3028ca124b80cfe6e9ca57b70ef2f0ccc41ebd4");
				}});
		tokens.put(ArbitrumONEERC20Token.BAL_MAGICUSDC_LP.toString(), bal_5050_magic_usdc_lp);

		// gdai
		EVMERC20TokenInfo gdai = new EVMERC20TokenInfo(
				ArbitrumONEERC20Token.gDAI.toString(), 
				"0xd85E038593d7A098614721EaE955EC2022B9B91B",
				"GAINS Network DAI token", 
				18,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.ARBITRUMONE.toString(),
				new ArrayList<String>() {{
					this.add("https://arbiscan.io/address/0xd85e038593d7a098614721eae955ec2022b9b91b");
				}});
		tokens.put(ArbitrumONEERC20Token.gDAI.toString(), gdai);

		// usdt
		EVMERC20TokenInfo usdt = new EVMERC20TokenInfo(
				ArbitrumONEERC20Token.USDT.toString(), 
				"0xfd086bc7cd5c481dcc9c85ebe478a1c0b69fcbb9",
				"Tether stablecoin token", 
				6, // !!!!!
				TokenCategory.STABLECOIN.toString(),
				EVMChain.ARBITRUMONE.toString(),
				new ArrayList<String>() {{
					this.add("https://arbiscan.io/address/0xfd086bc7cd5c481dcc9c85ebe478a1c0b69fcbb9");
					this.add("https://www.coingecko.com/en/coins/tether");
				}});
		tokens.put(ArbitrumONEERC20Token.USDT.toString(), usdt);

		// gns
		EVMERC20TokenInfo gns = new EVMERC20TokenInfo(
				ArbitrumONEERC20Token.GNS.toString(), 
				"0x18c11fd286c5ec11c3b683caa813b77f5163a122",
				"Gains token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.ARBITRUMONE.toString(),
				new ArrayList<String>() {{
					this.add("https://arbiscan.io/address/0x18c11fd286c5ec11c3b683caa813b77f5163a122");
					this.add("https://www.coingecko.com/en/coins/gains-network");
				}});
		tokens.put(ArbitrumONEERC20Token.GNS.toString(), gns);

		// gmx
		EVMERC20TokenInfo gmx = new EVMERC20TokenInfo(
				ArbitrumONEERC20Token.GMX.toString(), 
				"0xfc5A1A6EB076a2C7aD06eD22C90d7E710E35ad0a",
				"GMX token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.ARBITRUMONE.toString(),
				new ArrayList<String>() {{
					this.add("https://arbiscan.io/address/0xfc5a1a6eb076a2c7ad06ed22c90d7e710e35ad0a");
					this.add("https://www.coingecko.com/en/coins/gmx");
				}});
		tokens.put(ArbitrumONEERC20Token.GMX.toString(), gmx);

		// dmt
		EVMERC20TokenInfo dmt = new EVMERC20TokenInfo(
				ArbitrumONEERC20Token.DMT.toString(), 
				"0x8b0e6f19ee57089f7649a455d89d7bc6314d04e8",
				"DMT gaming token", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.ARBITRUMONE.toString(),
				new ArrayList<String>() {{
					this.add("https://arbiscan.io/token/0x8b0e6f19ee57089f7649a455d89d7bc6314d04e8");
					this.add("https://www.coingecko.com/en/coins/dream-machine-token");
				}});
		tokens.put(ArbitrumONEERC20Token.DMT.toString(), dmt);

		return new ERC20TokenIndex(tokens);
	}

	@SuppressWarnings("serial")
	public static ERC20TokenIndex generateWemixTokenIndex() {

		HashMap<String, EVMERC20TokenInfo> tokens = new HashMap<>();

		// klay
		EVMERC20TokenInfo klay = new EVMERC20TokenInfo(
				WemixERC20Token.KLAY.toString(), 
				"0x461d52769884ca6235B685EF2040F47d30C94EB5",
				"Wrapped KLAY token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.WEMIX.toString(),
				new ArrayList<String>() {{
					this.add("https://explorer.wemix.com/address/0x461d52769884ca6235B685EF2040F47d30C94EB5");
				}});
		tokens.put(WemixERC20Token.KLAY.toString(), klay);

		// wemix $
		EVMERC20TokenInfo wemix$ = new EVMERC20TokenInfo(
				WemixERC20Token.WEMIX$.toString(), 
				"0x8e81fcc2d4a3baa0ee9044e0d7e36f59c9bba9c1",
				"WEMIX USD token", 
				18,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.WEMIX.toString(),
				new ArrayList<String>() {{
					this.add("https://explorer.wemix.com/token/0x8e81fcc2d4a3baa0ee9044e0d7e36f59c9bba9c1/transfers");
				}});
		tokens.put(WemixERC20Token.WEMIX$.toString(), wemix$);

		return new ERC20TokenIndex(tokens);
	}

	@SuppressWarnings("serial")
	public static ERC20TokenIndex generateMilkomedaC1TokenIndex() {

		HashMap<String, EVMERC20TokenInfo> tokens = new HashMap<>();

		// wada
		EVMERC20TokenInfo wada = new EVMERC20TokenInfo(
				MilkomedaC1ERC20Token.WADA.toString(), 
				"0xAE83571000aF4499798d1e3b0fA0070EB3A3E3F9",
				"Wrapped ADA token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.MILKOMEDAC1.toString(),
				new ArrayList<String>() {{
					this.add("https://explorer-mainnet-cardano-evm.c1.milkomeda.com/address/0xAE83571000aF4499798d1e3b0fA0070EB3A3E3F9");
				}});
		tokens.put(MilkomedaC1ERC20Token.WADA.toString(), wada);

		// blues
		EVMERC20TokenInfo blues = new EVMERC20TokenInfo(
				MilkomedaC1ERC20Token.BLUES.toString(), 
				"0x8c008BBA2Dd56b99f4A6aB276bE3a478cB075F0C",
				"Blueshift token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.MILKOMEDAC1.toString(),
				new ArrayList<String>() {{
					this.add("https://explorer-mainnet-cardano-evm.c1.milkomeda.com/address/0x8c008BBA2Dd56b99f4A6aB276bE3a478cB075F0C");
				}});
		tokens.put(MilkomedaC1ERC20Token.BLUES.toString(), blues);

		// Blueshift LP Token 006
		EVMERC20TokenInfo blueshift_lp_006 = new EVMERC20TokenInfo(
				MilkomedaC1ERC20Token.BLUESHIFT_mADA_BLUES_LP.toString(), 
				"0x4a2360fD03eD50C9496cbEB4FD3e1776FA90F04c",
				"Blueshift LP 006 (mADA/BLUES) token", 
				18,
				TokenCategory.LIQUIDITY_PROVIDER.toString(),
				EVMChain.MILKOMEDAC1.toString(),
				new ArrayList<String>() {{
					this.add("https://explorer-mainnet-cardano-evm.c1.milkomeda.com/address/0x4a2360fD03eD50C9496cbEB4FD3e1776FA90F04c");
				}});
		tokens.put(MilkomedaC1ERC20Token.BLUESHIFT_mADA_BLUES_LP.toString(), blueshift_lp_006);



		return new ERC20TokenIndex(tokens);
	}

	@SuppressWarnings("serial")
	public static ERC20TokenIndex generateMilkomedaA1TokenIndex() {

		HashMap<String, EVMERC20TokenInfo> tokens = new HashMap<>();

		// usdc
		EVMERC20TokenInfo usdc = new EVMERC20TokenInfo(
				MilkomedaA1ERC20Token.USDC.toString(), 
				"0xBc31960A049Fe10297Ed8432Fb61DD734fEAd4ea",
				"USDC stable token", 
				6,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.MILKOMEDAA1.toString(),
				new ArrayList<String>() {{
					this.add("https://explorer-mainnet-algorand-rollup.a1.milkomeda.com/address/0xBc31960A049Fe10297Ed8432Fb61DD734fEAd4ea");
				}});
		tokens.put(MilkomedaA1ERC20Token.USDC.toString(), usdc);

		// blues
		EVMERC20TokenInfo blues = new EVMERC20TokenInfo(
				MilkomedaA1ERC20Token.USDC.toString(), 
				"0xc9BAA8cfdDe8E328787E29b4B078abf2DaDc2055",
				"BlueShift DEFI token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.MILKOMEDAA1.toString(),
				new ArrayList<String>() {{
					this.add("https://explorer-mainnet-algorand-rollup.a1.milkomeda.com/address/0xc9BAA8cfdDe8E328787E29b4B078abf2DaDc2055");
				}});
		tokens.put(MilkomedaA1ERC20Token.BLUES.toString(), blues);

		return new ERC20TokenIndex(tokens);
	}

	public static String generateTokenIndexJSON(ERC20TokenIndex idx) {
		return JSONUtils.createJSONFromPOJO(idx);
	}

	@SuppressWarnings("serial")
	public static ERC20TokenIndex generateZkSyncTokenIndex() {

		HashMap<String, EVMERC20TokenInfo> tokens = new HashMap<>();

		// zkusd
		EVMERC20TokenInfo zkusd = new EVMERC20TokenInfo(
				ZkSyncERC20Token.zkUSD.toString(), 
				"0xfC7E56298657B002b3e656400E746b7212912757",
				"zkUSD stablecoin token", 
				6,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.ZKSYNCERA.toString(),
				new ArrayList<String>() {{
					this.add("https://explorer.zksync.io/address/0xfC7E56298657B002b3e656400E746b7212912757");
				}});
		tokens.put(ZkSyncERC20Token.zkUSD.toString(), zkusd);

		// usdc
		EVMERC20TokenInfo usdc = new EVMERC20TokenInfo(
				ZkSyncERC20Token.USDC.toString(), 
				"0x3355df6D4c9C3035724Fd0e3914dE96A5a83aaf4",
				"USDC stablecoin token", 
				6,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.ZKSYNCERA.toString(),
				new ArrayList<String>() {{
					this.add("https://explorer.zksync.io/address/0x3355df6D4c9C3035724Fd0e3914dE96A5a83aaf4");
					this.add("https://www.coingecko.com/en/coins/usd-coin");
				}});
		tokens.put(ZkSyncERC20Token.USDC.toString(), usdc);

		// mute
		EVMERC20TokenInfo mute = new EVMERC20TokenInfo(
				ZkSyncERC20Token.MUTE.toString(), 
				"0x0e97C7a0F8B2C9885C8ac9fC6136e829CbC21d42",
				"MUTE token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.ZKSYNCERA.toString(),
				new ArrayList<String>() {{
					this.add("https://explorer.zksync.io/address/0x0e97C7a0F8B2C9885C8ac9fC6136e829CbC21d42");
					this.add("https://www.coingecko.com/en/coins/mute");
				}});
		tokens.put(ZkSyncERC20Token.MUTE.toString(), mute);

		// ysync
		EVMERC20TokenInfo ysync = new EVMERC20TokenInfo(
				ZkSyncERC20Token.YSYNC.toString(), 
				"0xE0eF1c039a36eC77339E7277ECd4D48e57b61eec",
				"YSYNC token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.ZKSYNCERA.toString(),
				new ArrayList<String>() {{
					this.add("https://explorer.zksync.io/address/0xE0eF1c039a36eC77339E7277ECd4D48e57b61eec");
					this.add("https://syncswap.xyz");
				}});
		tokens.put(ZkSyncERC20Token.YSYNC.toString(), ysync);

		// syncswap_lp_usdc_weth
		EVMERC20TokenInfo syncswap_lp_usdc_weth = new EVMERC20TokenInfo(
				ZkSyncERC20Token.SYNCSWAP_USDC_WETH_LP.toString(), 
				"0x80115c708E12eDd42E504c1cD52Aea96C547c05c",
				"Syncswap USDC/WETH LP position", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.ZKSYNCERA.toString(),
				new ArrayList<String>() {{
					this.add("https://explorer.zksync.io/address/0x80115c708E12eDd42E504c1cD52Aea96C547c05c");
					this.add("https://syncswap.xyz");
				}});
		tokens.put(ZkSyncERC20Token.SYNCSWAP_USDC_WETH_LP.toString(), syncswap_lp_usdc_weth);

		// furucombo
		EVMERC20TokenInfo furucombo = new EVMERC20TokenInfo(
				ZkSyncERC20Token.COMBO.toString(), 
				"0xc2B13Bb90E33F1E191b8aA8F44Ce11534D5698E3",
				"COMBO token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.ZKSYNCERA.toString(),
				new ArrayList<String>() {{
					this.add("https://explorer.zksync.io/address/0xc2B13Bb90E33F1E191b8aA8F44Ce11534D5698E3");
					this.add("https://www.coingecko.com/en/coins/furucombo");
				}});
		tokens.put(ZkSyncERC20Token.COMBO.toString(), furucombo);

		// perp
		EVMERC20TokenInfo perp = new EVMERC20TokenInfo(
				ZkSyncERC20Token.PERP.toString(), 
				"0x42c1c56be243c250AB24D2ecdcC77F9cCAa59601",
				"PERP token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.ZKSYNCERA.toString(),
				new ArrayList<String>() {{
					this.add("https://explorer.zksync.io/address/0x42c1c56be243c250AB24D2ecdcC77F9cCAa59601");
					this.add("https://www.coingecko.com/en/coins/perpetual-protocol");
				}});
		tokens.put(ZkSyncERC20Token.PERP.toString(), perp);

		// zat
		EVMERC20TokenInfo zat = new EVMERC20TokenInfo(
				ZkSyncERC20Token.ZAT.toString(), 
				"0x47EF4A5641992A72CFd57b9406c9D9cefEE8e0C4",
				"zkApes token", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.ZKSYNCERA.toString(),
				new ArrayList<String>() {{
					this.add("https://explorer.zksync.io/address/0x47EF4A5641992A72CFd57b9406c9D9cefEE8e0C4");
					this.add("https://zkape.io");
				}});
		tokens.put(ZkSyncERC20Token.ZAT.toString(), zat);

		// velocore
		EVMERC20TokenInfo vc = new EVMERC20TokenInfo(
				ZkSyncERC20Token.VC.toString(), 
				"0x99bBE51be7cCe6C8b84883148fD3D12aCe5787F2",
				"Velocore token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.ZKSYNCERA.toString(),
				new ArrayList<String>() {{
					this.add("https://explorer.zksync.io/address/0x99bBE51be7cCe6C8b84883148fD3D12aCe5787F2");
					this.add("https://zksync-v2.velocore.xyz");
				}});
		tokens.put(ZkSyncERC20Token.VC.toString(), vc);

		return new ERC20TokenIndex(tokens);
	}

	@SuppressWarnings("serial")
	public static ERC20TokenIndex generateMoonbeamTokenIndex() {

		HashMap<String, EVMERC20TokenInfo> tokens = new HashMap<>();

		// mGLMR
		EVMERC20TokenInfo moonwell_glmr = new EVMERC20TokenInfo(
				MoonbeamERC20Token.mGLMR.toString(), 
				"0x091608f4e4a15335145be0A279483C0f8E4c7955",
				"Moonwell GLMR token", 
				8,
				TokenCategory.DEFI.toString(),
				EVMChain.MOONBEAM.toString(),
				new ArrayList<String>() {{
					this.add("https://moonscan.io/token/0x091608f4e4a15335145be0a279483c0f8e4c7955");
					this.add("https://moonwell.fi/artemis/GLMR");
				}});
		tokens.put(MoonbeamERC20Token.mGLMR.toString(), moonwell_glmr);

		// well
		EVMERC20TokenInfo well = new EVMERC20TokenInfo(
				MoonbeamERC20Token.WELL.toString(), 
				"0x511ab53f793683763e5a8829738301368a2411e3",
				"Moonwell WELL token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.MOONBEAM.toString(),
				new ArrayList<String>() {{
					this.add("https://moonscan.io/address/0x511ab53f793683763e5a8829738301368a2411e3");
					this.add("https://www.coingecko.com/en/coins/moonwell");
				}});
		tokens.put(MoonbeamERC20Token.WELL.toString(), well);

		return new ERC20TokenIndex(tokens);
	}

	@SuppressWarnings("serial")
	public static ERC20TokenIndex generatePulsechainTokenIndex() {

		HashMap<String, EVMERC20TokenInfo> tokens = new HashMap<>();

		// plsx
		EVMERC20TokenInfo plsx = new EVMERC20TokenInfo(
				PulsechainERC20Token.PLSX.toString(), 
				"0x95B303987A60C71504D99Aa1b13B4DA07b0790ab",
				"Pulsechain PLSX token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.PULSECHAIN.toString(),
				new ArrayList<String>() {{
					this.add("https://scan.pulsechain.com/address/0x95B303987A60C71504D99Aa1b13B4DA07b0790ab");
				}});
		tokens.put(PulsechainERC20Token.PLSX.toString(), plsx);

		return new ERC20TokenIndex(tokens);
	}

	@SuppressWarnings("serial")
	public static ERC20TokenIndex generateLineaTokenIndex() {

		HashMap<String, EVMERC20TokenInfo> tokens = new HashMap<>();

		// weth
		EVMERC20TokenInfo weth = new EVMERC20TokenInfo(
				LineaERC20Token.WETH.toString(), 
				"0xe5d7c2a44ffddf6b295a15c148167daaaf5cf34f",
				"WETH token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.LINEA.toString(),
				new ArrayList<String>() {{
					this.add("https://lineascan.build/address/0xe5d7c2a44ffddf6b295a15c148167daaaf5cf34f");
				}});
		tokens.put(LineaERC20Token.WETH.toString(), weth);

		// matic
		EVMERC20TokenInfo matic = new EVMERC20TokenInfo(
				LineaERC20Token.MATIC.toString(), 
				"0x265b25e22bcd7f10a5bd6e6410f10537cc7567e8",
				"MATIC token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.LINEA.toString(),
				new ArrayList<String>() {{
					this.add("https://lineascan.build/token/0x265b25e22bcd7f10a5bd6e6410f10537cc7567e8");
				}});
		tokens.put(LineaERC20Token.MATIC.toString(), matic);

		// USDC
		EVMERC20TokenInfo usdc = new EVMERC20TokenInfo(
				LineaERC20Token.USDC.toString(), 
				"0x176211869ca2b568f2a7d4ee941e073a821ee1ff",
				"USDC stable token", 
				6,
				TokenCategory.DEFI.toString(),
				EVMChain.LINEA.toString(),
				new ArrayList<String>() {{
					this.add("https://lineascan.build/token/0x176211869ca2b568f2a7d4ee941e073a821ee1ff");
				}});
		tokens.put(LineaERC20Token.USDC.toString(), usdc);

		// LVC
		EVMERC20TokenInfo lvc = new EVMERC20TokenInfo(
				LineaERC20Token.LVC.toString(), 
				"0xcc22f6aa610d1b2a0e89ef228079cb3e1831b1d1",
				"Velocore token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.LINEA.toString(),
				new ArrayList<String>() {{
					this.add("https://lineascan.build/token/0xcc22f6aa610d1b2a0e89ef228079cb3e1831b1d1");
				}});
		tokens.put(LineaERC20Token.LVC.toString(), lvc);

		// veLVC
		EVMERC20TokenInfo velvc = new EVMERC20TokenInfo(
				LineaERC20Token.veLVC.toString(), 
				"0xaec06345b26451bda999d83b361beaad6ea93f87",
				"Locked Velocore token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.LINEA.toString(),
				new ArrayList<String>() {{
					this.add("https://lineascan.build/token/0xaec06345b26451bda999d83b361beaad6ea93f87");
				}});
		tokens.put(LineaERC20Token.veLVC.toString(), velvc);

		return new ERC20TokenIndex(tokens);
	}

	@SuppressWarnings("serial")
	public static ERC20TokenIndex generateKavaTestTokenIndex() {

		HashMap<String, EVMERC20TokenInfo> tokens = new HashMap<>();

		// usdc
		EVMERC20TokenInfo usdc = new EVMERC20TokenInfo(
				KavaTestERC20Token.USDC.toString(), 
				"0x43D8814FdFB9B8854422Df13F1c66e34E4fa91fD",
				"USDC token", 
				6,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.KAVATEST.toString(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.kava.io/address/0x43D8814FdFB9B8854422Df13F1c66e34E4fa91fD");
				}});
		tokens.put(KavaTestERC20Token.USDC.toString(), usdc);

		return new ERC20TokenIndex(tokens);
	}

	@SuppressWarnings("serial")
	public static ERC20TokenIndex generateOptimismTokenIndex() {

		HashMap<String, EVMERC20TokenInfo> tokens = new HashMap<>();

		// SNX
		EVMERC20TokenInfo snx = new EVMERC20TokenInfo(
				OptimismERC20Token.SNX.toString(), 
				"0x8700daec35af8ff88c16bdf0418774cb3d7599b4",
				"SNX token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.OPTIMISM.toString(),
				new ArrayList<String>() {{
					this.add("https://optimistic.etherscan.io/token/0x8700daec35af8ff88c16bdf0418774cb3d7599b4");
				}});
		tokens.put(OptimismERC20Token.SNX.toString(), snx);

		// SDS
		EVMERC20TokenInfo sds = new EVMERC20TokenInfo(
				OptimismERC20Token.SDS.toString(), 
				"0x45c55bf488d3cb8640f12f63cbedc027e8261e79",
				"Synthetix Debt Shares token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.OPTIMISM.toString(),
				new ArrayList<String>() {{
					this.add("https://optimistic.etherscan.io/token/0x45c55bf488d3cb8640f12f63cbedc027e8261e79");
				}});
		tokens.put(OptimismERC20Token.SDS.toString(), sds);

		// SNX
		EVMERC20TokenInfo susd = new EVMERC20TokenInfo(
				OptimismERC20Token.SUSD.toString(), 
				"0x8c6f28f2f1a3c87f0f938b96d27520d9751ec8d9",
				"sUSD stablecoin token", 
				18,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.OPTIMISM.toString(),
				new ArrayList<String>() {{
					this.add("https://optimistic.etherscan.io/token/0x8c6f28f2f1a3c87f0f938b96d27520d9751ec8d9");
				}});
		tokens.put(OptimismERC20Token.SUSD.toString(), susd);

		return new ERC20TokenIndex(tokens);
	}

	@SuppressWarnings("serial")
	public static ERC20TokenIndex generateConfluxTestnetTokenIndex() {

		HashMap<String, EVMERC20TokenInfo> tokens = new HashMap<>();

		// USDT
		EVMERC20TokenInfo usdt = new EVMERC20TokenInfo(
				ConfluxTestnetERC20Token.USDT.toString(), 
				"0x7d682e65efc5c13bf4e394b8f376c48e6bae0355",
				"Tether stable coin", 
				18,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.CONFLUXTEST.toString(),
				new ArrayList<String>() {{
					this.add("https://evmtestnet.confluxscan.net/address/0x7d682e65efc5c13bf4e394b8f376c48e6bae0355");
				}});
		tokens.put(ConfluxTestnetERC20Token.USDT.toString(), usdt);

		// VST
		EVMERC20TokenInfo vswap = new EVMERC20TokenInfo(
				ConfluxTestnetERC20Token.VSWAP.toString(), 
				"0x2c0230516cfcddcd2a5256400c4593deaa243259",
				"Vswap token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.CONFLUXTEST.toString(),
				new ArrayList<String>() {{
					this.add("https://evmtestnet.confluxscan.io/address/0x2c0230516cfcddcd2a5256400c4593deaa243259");
					this.add("https://app-testnet.vswap.finance");
				}});
		tokens.put(ConfluxTestnetERC20Token.VSWAP.toString(), vswap);

		// WETH
		EVMERC20TokenInfo weth = new EVMERC20TokenInfo(
				ConfluxTestnetERC20Token.WETH.toString(), 
				"0xcd71270f82f319e0498ff98af8269c3f0d547c65",
				"Wrapped ETH token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.CONFLUXTEST.toString(),
				new ArrayList<String>() {{
					this.add("https://evmtestnet.confluxscan.io/address/0xcd71270f82f319e0498ff98af8269c3f0d547c65");
				}});
		tokens.put(ConfluxTestnetERC20Token.WETH.toString(), weth);

		// USDC
		EVMERC20TokenInfo usdc = new EVMERC20TokenInfo(
				ConfluxTestnetERC20Token.USDC.toString(), 
				"0x349298b0e20df67defd6efb8f3170cf4a32722ef",
				"USDC stable coin", 
				18, // !!!
				TokenCategory.STABLECOIN.toString(),
				EVMChain.CONFLUXTEST.toString(),
				new ArrayList<String>() {{
					this.add("https://evmtestnet.confluxscan.io/address/0x349298b0e20df67defd6efb8f3170cf4a32722ef");
				}});
		tokens.put(ConfluxTestnetERC20Token.USDC.toString(), usdc);

		return new ERC20TokenIndex(tokens);
	}

	@SuppressWarnings("serial")
	public static ERC20TokenIndex generateConfluxTokenIndex() {

		HashMap<String, EVMERC20TokenInfo> tokens = new HashMap<>();

		// USDT
		EVMERC20TokenInfo usdt = new EVMERC20TokenInfo(
				ConfluxERC20Token.USDT.toString(), 
				"0xfe97e85d13abd9c1c33384e796f10b73905637ce",
				"Tether stable token", 
				18,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.CONFLUX.toString(),
				new ArrayList<String>() {{
					this.add("https://evm.confluxscan.io/token/0xfe97e85d13abd9c1c33384e796f10b73905637ce");
				}});
		tokens.put(ConfluxERC20Token.USDT.toString(), usdt);

		// WCFX
		EVMERC20TokenInfo wcfx = new EVMERC20TokenInfo(
				ConfluxERC20Token.WCFX.toString(), 
				"0x14b2d3bc65e74dae1030eafd8ac30c533c976a9b",
				"Wrapped Conflux token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.CONFLUX.toString(),
				new ArrayList<String>() {{
					this.add("https://evm.confluxscan.io/token/0x14b2d3bc65e74dae1030eafd8ac30c533c976a9b");
				}});
		tokens.put(ConfluxERC20Token.WCFX.toString(), wcfx);

		// PPI
		EVMERC20TokenInfo swappi = new EVMERC20TokenInfo(
				ConfluxERC20Token.PPI.toString(), 
				"0x22f41abf77905f50df398f21213290597e7414dd",
				"Swappi token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.CONFLUX.toString(),
				new ArrayList<String>() {{
					this.add("https://evm.confluxscan.io/token/0x22f41abf77905f50df398f21213290597e7414dd");
					this.add("https://app.swappi.io/");
				}});
		tokens.put(ConfluxERC20Token.PPI.toString(), swappi);

		// ve_swappi
		EVMERC20TokenInfo ve_swappi = new EVMERC20TokenInfo(
				ConfluxERC20Token.vePPI.toString(), 
				"0xf270e44105c1270bc7a4ffedbcb699486ada7a6a",
				"Swappi Vote Escrowed token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.CONFLUX.toString(),
				new ArrayList<String>() {{
					this.add("https://evm.confluxscan.io/address/0xf270e44105c1270bc7a4ffedbcb699486ada7a6a");
				}});
		tokens.put(ConfluxERC20Token.vePPI.toString(), ve_swappi);

		// swappi_cfx_ppi_lp
		EVMERC20TokenInfo swappi_cfx_ppi_lp = new EVMERC20TokenInfo(
				ConfluxERC20Token.SWAPPI_CFX_PPI_LP.toString(), 
				"0x1112a6c61a2eec4bd3aec78bd5bf3396bdd37d57",
				"Swappi CFX-PPI LP token", 
				18,
				TokenCategory.LIQUIDITY_PROVIDER.toString(),
				EVMChain.CONFLUX.toString(),
				new ArrayList<String>() {{
					this.add("https://evm.confluxscan.io/token/0x1112a6c61a2eec4bd3aec78bd5bf3396bdd37d57");
				}});
		tokens.put(ConfluxERC20Token.SWAPPI_CFX_PPI_LP.toString(), swappi_cfx_ppi_lp);

		return new ERC20TokenIndex(tokens);
	}

	@SuppressWarnings("serial")
	public static ERC20TokenIndex generateZKEVMTokenIndex() {

		HashMap<String, EVMERC20TokenInfo> tokens = new HashMap<>();

		// dai
		EVMERC20TokenInfo dai = new EVMERC20TokenInfo(
				ZKEVMERC20Token.DAI.toString(), 
				"0xc5015b9d9161dca7e18e32f6f25c4ad850731fd4",
				"DAI stablecoin token", 
				18,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.ZKEVM.toString(),
				new ArrayList<String>() {{
					this.add("https://zkevm.polygonscan.com/address/0xc5015b9d9161dca7e18e32f6f25c4ad850731fd4");
					this.add("https://www.coingecko.com/en/coins/dai");
				}});
		tokens.put(ZKEVMERC20Token.DAI.toString(), dai);

		// usdc
		EVMERC20TokenInfo usdc = new EVMERC20TokenInfo(
				ZKEVMERC20Token.USDC.toString(), 
				"0xa8ce8aee21bc2a48a5ef670afcc9274c7bbbc035",
				"USDC stablecoin token", 
				6,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.ZKEVM.toString(),
				new ArrayList<String>() {{
					this.add("https://zkevm.polygonscan.com/token/0xa8ce8aee21bc2a48a5ef670afcc9274c7bbbc035");
					this.add("https://www.coingecko.com/en/coins/usd-coin");
				}});
		tokens.put(ZKEVMERC20Token.USDC.toString(), usdc);

		// usdt
		EVMERC20TokenInfo usdt = new EVMERC20TokenInfo(
				ZKEVMERC20Token.USDT.toString(), 
				"0x1e4a5963abfd975d8c9021ce480b42188849d41d",
				"USDT stablecoin token", 
				6, // !!
				TokenCategory.STABLECOIN.toString(),
				EVMChain.ZKEVM.toString(),
				new ArrayList<String>() {{
					this.add("https://zkevm.polygonscan.com/token/0x1e4a5963abfd975d8c9021ce480b42188849d41d");
					this.add("https://www.coingecko.com/en/coins/tether");
				}});
		tokens.put(ZKEVMERC20Token.USDT.toString(), usdt);

		// ausdc_dai
		EVMERC20TokenInfo ausdc_dai = new EVMERC20TokenInfo(
				ZKEVMERC20Token.GAMMA_aUSDC_DAI_LP.toString(), 
				"0xafad6e114cfbc8a19e91b8d7d04da740a7698595",
				"aUSDC-DAI LP token", 
				18,
				TokenCategory.LIQUIDITY_PROVIDER.toString(),
				EVMChain.ZKEVM.toString(),
				new ArrayList<String>() {{
					this.add("https://zkevm.polygonscan.com/token/0xafad6e114cfbc8a19e91b8d7d04da740a7698595");
				}});
		tokens.put(ZKEVMERC20Token.GAMMA_aUSDC_DAI_LP.toString(), ausdc_dai);

		return new ERC20TokenIndex(tokens);
	}

	@SuppressWarnings("serial")
	public static EVMNFTIndex generateMantleNFTIndex() {
		HashMap<String, EVMERC721TokenInfo> erc721tokens = new HashMap<>();
		HashMap<String, EVMERC1155TokenInfo> erc1155tokens = new HashMap<>();

		// MTK
		EVMERC721TokenInfo citizen = new EVMERC721TokenInfo(
				MantleERC721Token.CITIZEN.toString(), 
				"0x7cf4aC414C94E03Ecb2A7d6EA8F79087453cAEf0",
				0L,
				"Citizen of Mantle", 
				TokenCategory.CHAINMASCOT.toString(),
				EVMChain.MANTLE.toString(),
				new ArrayList<String>() {{
					this.add("https://explorer.mantle.xyz/token/0x7cf4aC414C94E03Ecb2A7d6EA8F79087453cAEf0");
					this.add("https://journey.mantle.xyz/");
				}});
		erc721tokens.put(MantleERC721Token.CITIZEN.toString(), citizen);

		return new EVMNFTIndex(erc721tokens, erc1155tokens);
	}

	@SuppressWarnings("serial")
	public static ERC20TokenIndex generateCoreTokenIndex() {

		HashMap<String, EVMERC20TokenInfo> tokens = new HashMap<>();

		// USDT
		EVMERC20TokenInfo usdt = new EVMERC20TokenInfo(
				CoreERC20Token.USDT.toString(), 
				"0x900101d06a7426441ae63e9ab3b9b0f63be145f1",
				"Tether stable token", 
				6, // !!!
				TokenCategory.STABLECOIN.toString(),
				EVMChain.CORE.toString(),
				new ArrayList<String>() {{
					this.add("https://scan.coredao.org/token/0x900101d06a7426441ae63e9ab3b9b0f63be145f1");
				}});
		tokens.put(CoreERC20Token.USDT.toString(), usdt);

		return new ERC20TokenIndex(tokens);
	}

	@SuppressWarnings("serial")
	public static EVMNFTIndex generateMilkomedaC1NFTIndex() {
		HashMap<String, EVMERC721TokenInfo> erc721tokens = new HashMap<>();
		HashMap<String, EVMERC1155TokenInfo> erc1155tokens = new HashMap<>();

		// paima_volcaneers
		EVMERC721TokenInfo paima_volcaneers = new EVMERC721TokenInfo(
				MilkomedaC1ERC721Token.PAIMA_VOLCANEERS.toString(), 
				"0xa335d662BB47409e04F06dC7Fd03cEc854530172",
				0L,
				"Paima Volcaneers (PV)", 
				TokenCategory.GAMING.toString(),
				EVMChain.MILKOMEDAC1.toString(),
				new ArrayList<String>() {{
					this.add("https://explorer-mainnet-cardano-evm.c1.milkomeda.com/address/0xa335d662BB47409e04F06dC7Fd03cEc854530172");
				}});
		erc721tokens.put(MilkomedaC1ERC721Token.PAIMA_VOLCANEERS.toString(), paima_volcaneers);

		return new EVMNFTIndex(erc721tokens, erc1155tokens);
	}

	@SuppressWarnings("serial")
	public static ERC20TokenIndex generateBaseTokenIndex() {

		HashMap<String, EVMERC20TokenInfo> tokens = new HashMap<>();

		// zkusd
		EVMERC20TokenInfo weth = new EVMERC20TokenInfo(
				BaseERC20Token.WETH.toString(), 
				"0x4200000000000000000000000000000000000006",
				"Wrapped ETH token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.BASE.toString(),
				new ArrayList<String>() {{
					this.add("https://basescan.org/address/0x4200000000000000000000000000000000000006");
				}});
		tokens.put(BaseERC20Token.WETH.toString(), weth);

		// dai
		EVMERC20TokenInfo dai = new EVMERC20TokenInfo(
				BaseERC20Token.DAI.toString(), 
				"0x50c5725949a6f0c72e6c4a641f24049a917db0cb",
				"DAI stablecoin token", 
				18,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.BASE.toString(),
				new ArrayList<String>() {{
					this.add("https://basescan.org/address/0x50c5725949a6f0c72e6c4a641f24049a917db0cb");
					this.add("https://www.coingecko.com/en/coins/dai");
				}});
		tokens.put(BaseERC20Token.DAI.toString(), dai);

		// aero
		EVMERC20TokenInfo aero = new EVMERC20TokenInfo(
				BaseERC20Token.AERO.toString(), 
				"0x940181a94a35a4569e4529a3cdfb74e38fd98631",
				"AERO DEFI token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.BASE.toString(),
				new ArrayList<String>() {{
					this.add("https://basescan.org/address/0x940181a94a35a4569e4529a3cdfb74e38fd98631");
				}});
		tokens.put(BaseERC20Token.AERO.toString(), aero);

		// aerodome_lp_dai_weth
		EVMERC20TokenInfo aerodome_lp_dai_weth = new EVMERC20TokenInfo(
				BaseERC20Token.AERODOME_DAI_WETH_LP.toString(), 
				"0x9287c921f5d920ceee0d07d7c58d476e46acc640",
				"Aerodome Finance DAI/WETH LP position", 
				18,
				TokenCategory.LIQUIDITY_PROVIDER.toString(),
				EVMChain.BASE.toString(),
				new ArrayList<String>() {{
					this.add("https://basescan.org/token/0x9287c921f5d920ceee0d07d7c58d476e46acc640");
					this.add("https://aerodrome.finance/");
				}});
		tokens.put(BaseERC20Token.AERODOME_DAI_WETH_LP.toString(), aerodome_lp_dai_weth);

		// aerodome_lp_aero_weth
		EVMERC20TokenInfo aerodome_lp_aero_weth = new EVMERC20TokenInfo(
				BaseERC20Token.AERODOME_AERO_WETH_LP.toString(), 
				"0x7f670f78b17dec44d5ef68a48740b6f8849cc2e6",
				"Aerodome Finance AERO/WETH LP position", 
				18,
				TokenCategory.LIQUIDITY_PROVIDER.toString(),
				EVMChain.BASE.toString(),
				new ArrayList<String>() {{
					this.add("https://basescan.org/token/0x7f670f78b17dec44d5ef68a48740b6f8849cc2e6");
					this.add("https://aerodrome.finance/");
				}});
		tokens.put(BaseERC20Token.AERODOME_AERO_WETH_LP.toString(), aerodome_lp_aero_weth);


		// usdc
		EVMERC20TokenInfo usdc = new EVMERC20TokenInfo(
				BaseERC20Token.USDC.toString(), 
				"0x833589fcd6edb6e08f4c7c32d4f71b54bda02913",
				"USDC stablecoin token", 
				6,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.BASE.toString(),
				new ArrayList<String>() {{
					this.add("https://basescan.org/address/0x833589fcd6edb6e08f4c7c32d4f71b54bda02913");
					this.add("https://www.coingecko.com/en/coins/usd-coin");
				}});
		tokens.put(BaseERC20Token.USDC.toString(), usdc);

		// usdbc
		EVMERC20TokenInfo usdbc = new EVMERC20TokenInfo(
				BaseERC20Token.USDbC.toString(), 
				"0xd9aaec86b65d86f6a7b5b1b0c42ffa531710b6ca",
				"USDbC stablecoin token", 
				6,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.BASE.toString(),
				new ArrayList<String>() {{
					this.add("https://basescan.org/address/0xd9aaec86b65d86f6a7b5b1b0c42ffa531710b6ca");
				}});
		tokens.put(BaseERC20Token.USDbC.toString(), usdbc);

		return new ERC20TokenIndex(tokens);

	}

	@SuppressWarnings("serial")
	public static ERC20TokenIndex generateScrollTokenIndex() {

		HashMap<String, EVMERC20TokenInfo> tokens = new HashMap<>();

		// USDC
		EVMERC20TokenInfo usdc = new EVMERC20TokenInfo(
				ScrollERC20Token.USDC.toString(), 
				"0x06eFdBFf2a14a7c8E15944D1F4A48F9F95F663A4",
				"USDC stable token", 
				6,
				TokenCategory.DEFI.toString(),
				EVMChain.SCROLL.toString(),
				new ArrayList<String>() {{
					this.add("https://blockscout.scroll.io/address/0x06eFdBFf2a14a7c8E15944D1F4A48F9F95F663A4");
				}});
		tokens.put(ScrollERC20Token.USDC.toString(), usdc);

		// PAPYRUS
		EVMERC20TokenInfo papyrus = new EVMERC20TokenInfo(
				ScrollERC20Token.PAPYRUS.toString(), 
				"0x0Fc479e2f9b7310BfB1Db606CF565deA6910eedc",
				"Papyrus token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.SCROLL.toString(),
				new ArrayList<String>() {{
					this.add("https://blockscout.scroll.io/address/0x0Fc479e2f9b7310BfB1Db606CF565deA6910eedc");
				}});
		tokens.put(ScrollERC20Token.PAPYRUS.toString(), papyrus);

		// gPAPYRUS
		EVMERC20TokenInfo gpapyrus = new EVMERC20TokenInfo(
				ScrollERC20Token.gPAPYRUS.toString(), 
				"0xf4BA885557b8E0dCE70e14CCD1a4A73E4a09793e",
				"Papyrus locked token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.SCROLL.toString(),
				new ArrayList<String>() {{
					this.add("https://blockscout.scroll.io/address/0xf4BA885557b8E0dCE70e14CCD1a4A73E4a09793e");
				}});
		tokens.put(ScrollERC20Token.gPAPYRUS.toString(), gpapyrus);

		return new ERC20TokenIndex(tokens);
	}

	@SuppressWarnings("serial")
	public static ERC20TokenIndex generateMantleTokenIndex() {

		HashMap<String, EVMERC20TokenInfo> tokens = new HashMap<>();

		// USDT
		EVMERC20TokenInfo usdt = new EVMERC20TokenInfo(
				MantleERC20Token.USDT.toString(), 
				"0x201EBa5CC46D216Ce6DC03F6a759e8E766e956aE",
				"Tether stable coin", 
				6, // !!!
				TokenCategory.STABLECOIN.toString(),
				EVMChain.MANTLE.toString(),
				new ArrayList<String>() {{
					this.add("https://explorer.mantle.xyz/token/0x201EBa5CC46D216Ce6DC03F6a759e8E766e956aE");
				}});
		tokens.put(MantleERC20Token.USDT.toString(), usdt);

		// WMNT
		EVMERC20TokenInfo wmnt = new EVMERC20TokenInfo(
				MantleERC20Token.WMNT.toString(), 
				"0x78c1b0C915c4FAA5FffA6CAbf0219DA63d7f4cb8",
				"Wrapped MANTLE token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.MANTLE.toString(),
				new ArrayList<String>() {{
					this.add("https://explorer.mantle.xyz/token/0x78c1b0C915c4FAA5FffA6CAbf0219DA63d7f4cb8");
				}});
		tokens.put(MantleERC20Token.WMNT.toString(), wmnt);

		// METH
		EVMERC20TokenInfo meth = new EVMERC20TokenInfo(
				MantleERC20Token.METH.toString(), 
				"0xcDA86A272531e8640cD7F1a92c01839911B90bb0",
				"Wrapped ETH token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.MANTLE.toString(),
				new ArrayList<String>() {{
					this.add("https://explorer.mantle.xyz/token/0xcDA86A272531e8640cD7F1a92c01839911B90bb0/token-transfers");
				}});
		tokens.put(MantleERC20Token.METH.toString(), meth);

		// WETH
		EVMERC20TokenInfo weth = new EVMERC20TokenInfo(
				MantleERC20Token.WETH.toString(), 
				"0xdEAddEaDdeadDEadDEADDEAddEADDEAddead1111",
				"Wrapped ETH token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.MANTLE.toString(),
				new ArrayList<String>() {{
					this.add("https://explorer.mantle.xyz/token/0xdEAddEaDdeadDEadDEADDEAddEADDEAddead1111");
					this.add("https://www.coingecko.com/en/coins/wrapped-ether-mantle-bridge");
				}});
		tokens.put(MantleERC20Token.WETH.toString(), weth);

		// USDC
		EVMERC20TokenInfo usdc = new EVMERC20TokenInfo(
				MantleERC20Token.USDC.toString(), 
				"0x09Bc4E0D864854c6aFB6eB9A9cdF58aC190D0dF9",
				"USDC stable coin", 
				6,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.MANTLE.toString(),
				new ArrayList<String>() {{
					this.add("https://explorer.mantle.xyz/address/0x09Bc4E0D864854c6aFB6eB9A9cdF58aC190D0dF9");
				}});
		tokens.put(MantleERC20Token.USDC.toString(), usdc);

		return new ERC20TokenIndex(tokens);
	}

	@SuppressWarnings("serial")
	public static EVMNFTIndex generateLineaNFTIndex() {
		HashMap<String, EVMERC721TokenInfo> erc721tokens = new HashMap<>();
		HashMap<String, EVMERC1155TokenInfo> erc1155tokens = new HashMap<>();

		// HorizonDEX LP
		EVMERC721TokenInfo horizondexLP = new EVMERC721TokenInfo(
				LineaERC721Token.HRZNLP.toString(), 
				"0x438670d41d5118003b2f42cc0466fbadd760dbf4",
				0L,
				"HorizonDEX Reinvestment Token", 
				TokenCategory.LIQUIDITY_PROVIDER.toString(),
				EVMChain.LINEA.toString(),
				new ArrayList<String>() {{
					this.add("https://lineascan.build/token/0x438670d41d5118003b2f42cc0466fbadd760dbf4");
				}});
		erc721tokens.put(LineaERC721Token.HRZNLP.toString(), horizondexLP);

		// BattleMon PickAxe
		EVMERC721TokenInfo bm_pickaxe = new EVMERC721TokenInfo(
				LineaERC721Token.BATTLEMON_PAXE.toString(), 
				"0x35d42d4bdc36cfe33a5ea6672a1b81752a963d6d",
				0L,
				"BattleMon PickAxe", 
				TokenCategory.GAMING.toString(),
				EVMChain.LINEA.toString(),
				new ArrayList<String>() {{
					this.add("https://lineascan.build/token/0x35d42d4bdc36cfe33a5ea6672a1b81752a963d6d");
					this.add("https://battlemon.com/");
				}});
		erc721tokens.put(LineaERC721Token.BATTLEMON_PAXE.toString(), bm_pickaxe);

		// BattleMon Lemon GEM
		EVMERC721TokenInfo bm_lemon_gem = new EVMERC721TokenInfo(
				LineaERC721Token.BATTLEMON_LGEM.toString(), 
				"0x6bf309ad2b7c0ebe44e69a53bb2cced79f17fc66",
				0L,
				"BattleMon Lemon GEM", 
				TokenCategory.GAMING.toString(),
				EVMChain.LINEA.toString(),
				new ArrayList<String>() {{
					this.add("https://lineascan.build/token/0x6bf309ad2b7c0ebe44e69a53bb2cced79f17fc66");
					this.add("https://battlemon.com/");
				}});
		erc721tokens.put(LineaERC721Token.BATTLEMON_LGEM.toString(), bm_lemon_gem);

		return new EVMNFTIndex(erc721tokens, erc1155tokens);
	}

	@SuppressWarnings("serial")
	public static ERC20TokenIndex generateMantleTestnetTokenIndex() {

		HashMap<String, EVMERC20TokenInfo> tokens = new HashMap<>();

		// USDT
		EVMERC20TokenInfo usdt = new EVMERC20TokenInfo(
				MantleTestnetERC20Token.USDT.toString(), 
				"0x093790D873e87B45Cee9CA70B12056C705861ecD",
				"Tether stable coin", 
				6, // !!!
				TokenCategory.STABLECOIN.toString(),
				EVMChain.MANTLETEST.toString(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.mantle.xyz/token/0x093790D873e87B45Cee9CA70B12056C705861ecD");
				}});
		tokens.put(MantleTestnetERC20Token.USDT.toString(), usdt);

		// WETH
		EVMERC20TokenInfo weth = new EVMERC20TokenInfo(
				MantleTestnetERC20Token.WETH.toString(), 
				"0xdEAddEaDdeadDEadDEADDEAddEADDEAddead1111",
				"Wrapped ETH token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.MANTLETEST.toString(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.mantle.xyz/token/0xdEAddEaDdeadDEadDEADDEAddEADDEAddead1111");
				}});
		tokens.put(MantleTestnetERC20Token.WETH.toString(), weth);

		// USDC
		EVMERC20TokenInfo usdc = new EVMERC20TokenInfo(
				MantleTestnetERC20Token.USDC.toString(), 
				"0xbAF72402f98f16e77638Ce5FCC5689CD1627E8ff",
				"USDC stable coin", 
				6,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.MANTLETEST.toString(),
				new ArrayList<String>() {{
					this.add("https://explorer.testnet.mantle.xyz/token/0xbAF72402f98f16e77638Ce5FCC5689CD1627E8ff/");
				}});
		tokens.put(MantleTestnetERC20Token.USDC.toString(), usdc);

		return new ERC20TokenIndex(tokens);
	}

	@SuppressWarnings("serial")
	public static ERC20TokenIndex generateGnosisTokenIndex() {

		HashMap<String, EVMERC20TokenInfo> tokens = new HashMap<>();

		// sDAI
		EVMERC20TokenInfo sdai = new EVMERC20TokenInfo(
				GnosisERC20Token.sDAI.toString(), 
				"0xaf204776c7245bf4147c2612bf6e5972ee483701",
				"Savings xDAI", 
				18,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.GNOSIS.toString(),
				new ArrayList<String>() {{
					this.add("https://agave.finance/sdai/");
					this.add("https://www.coingecko.com/en/coins/savings-xdai");
					this.add("https://gnosisscan.io/address/0xaf204776c7245bf4147c2612bf6e5972ee483701");
				}});
		tokens.put(GnosisERC20Token.sDAI.toString(), sdai);

		// WXDAI
		EVMERC20TokenInfo wxdai = new EVMERC20TokenInfo(
				GnosisERC20Token.WXDAI.toString(), 
				"0xe91d153e0b41518a2ce8dd3d7944fa863463a97d",
				"Wrapped xDAI token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.GNOSIS.toString(),
				new ArrayList<String>() {{
					this.add("https://gnosisscan.io/address/0xe91d153e0b41518a2ce8dd3d7944fa863463a97d");
					this.add("https://www.coingecko.com/en/coins/wrapped-xdai");
				}});
		tokens.put(GnosisERC20Token.WXDAI.toString(), wxdai);

		return new ERC20TokenIndex(tokens);
	}

	@SuppressWarnings("serial")
	public static ERC20TokenIndex generateCeloTokenIndex() {

		HashMap<String, EVMERC20TokenInfo> tokens = new HashMap<>();

		// cUSD
		EVMERC20TokenInfo cusd = new EVMERC20TokenInfo(
				CeloERC20Token.cUSD.toString(), 
				"0x765DE816845861e75A25fCA122bb6898B8B1282a",
				"CELO USD stable token", 
				18,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.CELO.toString(),
				new ArrayList<String>() {{
					this.add("https://explorer.celo.org/token/0x765DE816845861e75A25fCA122bb6898B8B1282a");
					this.add("https://www.coingecko.com/en/coins/celo-dollar");
				}});
		tokens.put(CeloERC20Token.cUSD.toString(), cusd);

		EVMERC20TokenInfo zerocasino = new EVMERC20TokenInfo(
				CeloERC20Token.ZEROCASINO.toString(), 
				"0xbccEc3bfd4639440b1714a502bb3940F407b890A",
				"0CASINO token", 
				18,
				TokenCategory.TEST.toString(),
				EVMChain.CELO.toString(),
				new ArrayList<String>() {{
					this.add("https://explorer.celo.org/token/0xbccEc3bfd4639440b1714a502bb3940F407b890A");
				}});
		tokens.put(CeloERC20Token.ZEROCASINO.toString(), zerocasino);

		// test
		/*
		EVMERC20TokenInfo test = new EVMERC20TokenInfo(
				CeloERC20Token.TEST.toString(), 
				"0xbccEc3bfd4639440b1714a502bb3940F407b890A",
				"TEST token", 
				18,
				TokenCategory.TEST.toString(),
				EVMChain.CELO.toString(),
				new ArrayList<String>() {{
					this.add("https://explorer.celo.org/token/0xMOJO");
				}});
		tokens.put(CeloERC20Token.TEST.toString(), test);
		 */

		return new ERC20TokenIndex(tokens);
	}

	@SuppressWarnings("serial")
	public static ERC20TokenIndex generateBitkubTokenIndex() {

		HashMap<String, EVMERC20TokenInfo> tokens = new HashMap<>();

		// wrapped bitkub (KKUB)
		EVMERC20TokenInfo kkub = new EVMERC20TokenInfo(
				BitkubKAP20Token.KKUB.toString(), 
				"0x67eBD850304c70d983B2d1b93ea79c7CD6c3F6b5",
				"Wrapped KUB (KKUB) token", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.BITKUB.toString(),
				new ArrayList<String>() {{
					this.add("https://www.bkcscan.com/tokens/0x67eBD850304c70d983B2d1b93ea79c7CD6c3F6b5/token-transfers");
				}});
		tokens.put(BitkubKAP20Token.KKUB.toString(), kkub);

		// mmv diamon LP
		EVMERC20TokenInfo diamonLP = new EVMERC20TokenInfo(
				BitkubKAP20Token.MMV_DIAMON_LP.toString(), 
				"0x7Bf51541208A70b784006eF7Bd6F774F4012Cd38",
				"Morning Moon Village diamon LP", 
				18,
				TokenCategory.DEFI.toString(),
				EVMChain.BITKUB.toString(),
				new ArrayList<String>() {{
					this.add("https://www.bkcscan.com/tokens/0x7Bf51541208A70b784006eF7Bd6F774F4012Cd38/token-transfers");
				}});
		tokens.put(BitkubKAP20Token.MMV_DIAMON_LP.toString(), diamonLP);

		// mmv rag
		EVMERC20TokenInfo mmv_rag = new EVMERC20TokenInfo(
				BitkubKAP20Token.MMV_RAG.toString(), 
				"0x1F14690e6c7D02fCeB67c6b818aa2C093e16fe27",
				"Morning Moon Village game item", 
				0,
				TokenCategory.DEFI.toString(),
				EVMChain.BITKUB.toString(),
				new ArrayList<String>() {{
					this.add("https://www.bkcscan.com/tokens/0x1F14690e6c7D02fCeB67c6b818aa2C093e16fe27/token-transfers");
					this.add("https://morningmoonvillage.com/");
				}});
		tokens.put(BitkubKAP20Token.MMV_RAG.toString(), mmv_rag);

		// mmv leather piece
		EVMERC20TokenInfo mmv_leather_piece = new EVMERC20TokenInfo(
				BitkubKAP20Token.MMV_LEATHER_PIECE.toString(), 
				"0x15aa87eb74069d3800f8e75A93FC04fda79AA24d",
				"Morning Moon Village game item", 
				0,
				TokenCategory.DEFI.toString(),
				EVMChain.BITKUB.toString(),
				new ArrayList<String>() {{
					this.add("https://www.bkcscan.com/tokens/0x15aa87eb74069d3800f8e75A93FC04fda79AA24d/token-transfers");
					this.add("https://morningmoonvillage.com/");
				}});
		tokens.put(BitkubKAP20Token.MMV_LEATHER_PIECE.toString(), mmv_leather_piece);

		// mmv white button mushroom
		EVMERC20TokenInfo mmv_white_button_mushroom = new EVMERC20TokenInfo(
				BitkubKAP20Token.MMV_WBUTTON_MUSHROOM.toString(), 
				"0xcb74a1A9dB4285E97D4dE8aa4B61cd10277Ab479",
				"Morning Moon Village game item", 
				0,
				TokenCategory.GAMING.toString(),
				EVMChain.BITKUB.toString(),
				new ArrayList<String>() {{
					this.add("https://www.bkcscan.com/tokens/0xcb74a1A9dB4285E97D4dE8aa4B61cd10277Ab479/token-transfers");
					this.add("https://morningmoonvillage.com/");
				}});
		tokens.put(BitkubKAP20Token.MMV_WBUTTON_MUSHROOM.toString(), mmv_white_button_mushroom);

		// mmv tomato soup
		EVMERC20TokenInfo mmv_tomato_soup = new EVMERC20TokenInfo(
				BitkubKAP20Token.MMV_TOMATOSOUP.toString(), 
				"0xbE46a81D181069aC0Ff18F4F7239Df10422E6DC3",
				"Morning Moon Village game item", 
				0,
				TokenCategory.GAMING.toString(),
				EVMChain.BITKUB.toString(),
				new ArrayList<String>() {{
					this.add("https://www.bkcscan.com/tokens/0xbE46a81D181069aC0Ff18F4F7239Df10422E6DC3/token-transfers");
					this.add("https://morningmoonvillage.com/");
				}});
		tokens.put(BitkubKAP20Token.MMV_TOMATOSOUP.toString(), mmv_tomato_soup);

		// mmv tomato seed
		EVMERC20TokenInfo mmv_tomato_seed = new EVMERC20TokenInfo(
				BitkubKAP20Token.MMV_TOMATOSEED.toString(), 
				"0xe991151Bf43bD712beAC33e5cFF2580841c9b440",
				"Morning Moon Village game item", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.BITKUB.toString(),
				new ArrayList<String>() {{
					this.add("https://www.bkcscan.com/tokens/0xe991151Bf43bD712beAC33e5cFF2580841c9b440/token-transfers");
					this.add("https://morningmoonvillage.com/");
				}});
		tokens.put(BitkubKAP20Token.MMV_TOMATOSEED.toString(), mmv_tomato_seed);

		// mmv stir fried cabbage
		EVMERC20TokenInfo mmv_sf_cabbage = new EVMERC20TokenInfo(
				BitkubKAP20Token.MMV_SF_CABBAGE.toString(), 
				"0xc2990515610028139f68016b321a0c36a5101104",
				"Morning Moon Village game item", 
				0,
				TokenCategory.GAMING.toString(),
				EVMChain.BITKUB.toString(),
				new ArrayList<String>() {{
					this.add("https://www.bkcscan.com/tokens/0xc2990515610028139f68016b321a0c36a5101104/token-transfers");
					this.add("https://morningmoonvillage.com/");
				}});
		tokens.put(BitkubKAP20Token.MMV_SF_CABBAGE.toString(), mmv_sf_cabbage);

		// mmv silver key
		EVMERC20TokenInfo mmv_silver_key = new EVMERC20TokenInfo(
				BitkubKAP20Token.MMV_SILVERKEY.toString(), 
				"0x73d05f935534918bbc87cb353928cb957ed03697",
				"Morning Moon Village game item", 
				0,
				TokenCategory.GAMING.toString(),
				EVMChain.BITKUB.toString(),
				new ArrayList<String>() {{
					this.add("https://www.bkcscan.com/tokens/0x73d05f935534918bbc87cb353928cb957ed03697/token-transfers");
					this.add("https://morningmoonvillage.com/");
				}});
		tokens.put(BitkubKAP20Token.MMV_SILVERKEY.toString(), mmv_silver_key);

		// mmv shitake mushroom
		EVMERC20TokenInfo mmv_shitake_mushroom = new EVMERC20TokenInfo(
				BitkubKAP20Token.MMV_SHITAKE_MUSHROOM.toString(), 
				"0xd3b314b101b26fa2bd19df0d845a632d72c4fc44",
				"Morning Moon Village game item", 
				0,
				TokenCategory.GAMING.toString(),
				EVMChain.BITKUB.toString(),
				new ArrayList<String>() {{
					this.add("https://www.bkcscan.com/tokens/0xd3b314b101b26fa2bd19df0d845a632d72c4fc44/token-transfers");
					this.add("https://morningmoonvillage.com/");
				}});
		tokens.put(BitkubKAP20Token.MMV_SHITAKE_MUSHROOM.toString(), mmv_shitake_mushroom);

		// mmv salad
		EVMERC20TokenInfo mmv_salad = new EVMERC20TokenInfo(
				BitkubKAP20Token.MMV_SALAD.toString(), 
				"0x2944d051dc66669e04629b827ae9e3ebcb1e48d9",
				"Morning Moon Village game item", 
				0,
				TokenCategory.GAMING.toString(),
				EVMChain.BITKUB.toString(),
				new ArrayList<String>() {{
					this.add("https://www.bkcscan.com/tokens/0x2944d051dc66669e04629b827ae9e3ebcb1e48d9/token-transfers");
					this.add("https://morningmoonvillage.com/");
				}});
		tokens.put(BitkubKAP20Token.MMV_SALAD.toString(), mmv_salad);

		// mmv lumi
		EVMERC20TokenInfo mmv_lumi = new EVMERC20TokenInfo(
				BitkubKAP20Token.MMV_LUMI.toString(), 
				"0x95013dcb6a561e6c003aed9c43fb8b64008aa361",
				"Morning Moon Village game item", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.BITKUB.toString(),
				new ArrayList<String>() {{
					this.add("https://www.bkcscan.com/tokens/0x95013dcb6a561e6c003aed9c43fb8b64008aa361/token-transfers");
					this.add("https://morningmoonvillage.com/");
				}});
		tokens.put(BitkubKAP20Token.MMV_LUMI.toString(), mmv_lumi);

		// mmv king trumpet mushroom
		EVMERC20TokenInfo mmv_king_trumpet_mushroom = new EVMERC20TokenInfo(
				BitkubKAP20Token.MMV_KTRUMPET_MUSHROOM.toString(), 
				"0xc14f24835efe355106ab8725488f16f93c8c5f96",
				"Morning Moon Village game item", 
				0,
				TokenCategory.GAMING.toString(),
				EVMChain.BITKUB.toString(),
				new ArrayList<String>() {{
					this.add("https://www.bkcscan.com/tokens/0xc14f24835efe355106ab8725488f16f93c8c5f96/token-transfers");
					this.add("https://morningmoonvillage.com/");
				}});
		tokens.put(BitkubKAP20Token.MMV_KTRUMPET_MUSHROOM.toString(), mmv_king_trumpet_mushroom);

		// mmv honey
		EVMERC20TokenInfo mmv_honey = new EVMERC20TokenInfo(
				BitkubKAP20Token.MMV_HONEY.toString(), 
				"0x575d7bfdbdf255d5741571334f159d903de1544f",
				"Morning Moon Village game item", 
				0,
				TokenCategory.GAMING.toString(),
				EVMChain.BITKUB.toString(),
				new ArrayList<String>() {{
					this.add("https://www.bkcscan.com/tokens/0x575d7bfdbdf255d5741571334f159d903de1544f/token-transfers");
					this.add("https://morningmoonvillage.com/");
				}});
		tokens.put(BitkubKAP20Token.MMV_HONEY.toString(), mmv_honey);

		// mmv greenapple
		EVMERC20TokenInfo mmv_greenapple = new EVMERC20TokenInfo(
				BitkubKAP20Token.MMV_GREENAPPLE.toString(), 
				"0x417e28bd41cd45d9f996b69450f81b02821a6d64",
				"Morning Moon Village game item", 
				0,
				TokenCategory.GAMING.toString(),
				EVMChain.BITKUB.toString(),
				new ArrayList<String>() {{
					this.add("https://www.bkcscan.com/tokens/0x417e28bd41cd45d9f996b69450f81b02821a6d64/token-transfers");
					this.add("https://morningmoonvillage.com/");
				}});
		tokens.put(BitkubKAP20Token.MMV_GREENAPPLE.toString(), mmv_greenapple);

		// mmv driedapple
		EVMERC20TokenInfo mmv_driedapple = new EVMERC20TokenInfo(
				BitkubKAP20Token.MMV_DRIEDAPPLE.toString(), 
				"0xb035c229903a0cff939be36b532d8c11204e6837",
				"Morning Moon Village game item", 
				0,
				TokenCategory.GAMING.toString(),
				EVMChain.BITKUB.toString(),
				new ArrayList<String>() {{
					this.add("https://www.bkcscan.com/tokens/0xb035c229903a0cff939be36b532d8c11204e6837/token-transfers");
					this.add("https://morningmoonvillage.com/");
				}});
		tokens.put(BitkubKAP20Token.MMV_DRIEDAPPLE.toString(), mmv_driedapple);

		// mmv corn soup
		EVMERC20TokenInfo mmv_cornsoup = new EVMERC20TokenInfo(
				BitkubKAP20Token.MMV_CORNSOUP.toString(), 
				"0x2b09ae76dfc601210407560502b340e104787b34",
				"Morning Moon Village game item", 
				0,
				TokenCategory.GAMING.toString(),
				EVMChain.BITKUB.toString(),
				new ArrayList<String>() {{
					this.add("https://www.bkcscan.com/tokens/0x2b09ae76dfc601210407560502b340e104787b34/token-transfers");
					this.add("https://morningmoonvillage.com/");
				}});
		tokens.put(BitkubKAP20Token.MMV_CORNSOUP.toString(), mmv_cornsoup);

		// mmv corn seed
		EVMERC20TokenInfo mmv_cornseed = new EVMERC20TokenInfo(
				BitkubKAP20Token.MMV_CORNSEED.toString(), 
				"0xe27aebed61be207e83fc05fbc408420c737881da",
				"Morning Moon Village game item", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.BITKUB.toString(),
				new ArrayList<String>() {{
					this.add("https://www.bkcscan.com/tokens/0xe27aebed61be207e83fc05fbc408420c737881da/token-transfers");
					this.add("https://morningmoonvillage.com/");
				}});
		tokens.put(BitkubKAP20Token.MMV_CORNSEED.toString(), mmv_cornseed);

		// mmv carrot seed
		EVMERC20TokenInfo mmv_carrotseed = new EVMERC20TokenInfo(
				BitkubKAP20Token.MMV_CARROTSEED.toString(), 
				"0x7b263d648fff39142abecb07a1bb85297e09982d",
				"Morning Moon Village game item", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.BITKUB.toString(),
				new ArrayList<String>() {{
					this.add("https://www.bkcscan.com/tokens/0x7b263d648fff39142abecb07a1bb85297e09982d/token-transfers");
					this.add("https://morningmoonvillage.com/");
				}});
		tokens.put(BitkubKAP20Token.MMV_CARROTSEED.toString(), mmv_carrotseed);

		// mmv cabbage seed
		EVMERC20TokenInfo mmv_cabbageseed = new EVMERC20TokenInfo(
				BitkubKAP20Token.MMV_CABBAGESEED.toString(), 
				"0x1f8b5af0ec97c44b24366b36c40f2d4aca2c73e2",
				"Morning Moon Village game item", 
				18,
				TokenCategory.GAMING.toString(),
				EVMChain.BITKUB.toString(),
				new ArrayList<String>() {{
					this.add("https://www.bkcscan.com/tokens/0x1f8b5af0ec97c44b24366b36c40f2d4aca2c73e2/token-transfers");
					this.add("https://morningmoonvillage.com/");
				}});
		tokens.put(BitkubKAP20Token.MMV_CABBAGESEED.toString(), mmv_cabbageseed);

		// green herb
		EVMERC20TokenInfo mmv_greenherb = new EVMERC20TokenInfo(
				BitkubKAP20Token.MMV_GREENHERB.toString(), 
				"0xde496524c30c460922e7810ddc6c806c0e2c5354",
				"Morning Moon Village game item", 
				0,
				TokenCategory.GAMING.toString(),
				EVMChain.BITKUB.toString(),
				new ArrayList<String>() {{
					this.add("https://www.bkcscan.com/tokens/0xde496524c30c460922e7810ddc6c806c0e2c5354/token-transfers");
					this.add("https://morningmoonvillage.com/");
				}});
		tokens.put(BitkubKAP20Token.MMV_GREENHERB.toString(), mmv_greenherb);

		// lesser health potion
		EVMERC20TokenInfo mmv_lhealth_potion = new EVMERC20TokenInfo(
				BitkubKAP20Token.MMV_LHEALTHPOTION.toString(), 
				"0xe66f21d817af8f99129af6023332dd7b37503b9d",
				"Morning Moon Village game item", 
				0,
				TokenCategory.GAMING.toString(),
				EVMChain.BITKUB.toString(),
				new ArrayList<String>() {{
					this.add("https://www.bkcscan.com/tokens/0xe66f21d817af8f99129af6023332dd7b37503b9d/token-transfers");
					this.add("https://morningmoonvillage.com/");
				}});
		tokens.put(BitkubKAP20Token.MMV_LHEALTHPOTION.toString(), mmv_lhealth_potion);

		// health potion
		EVMERC20TokenInfo mmv_health_potion = new EVMERC20TokenInfo(
				BitkubKAP20Token.MMV_HEALTHPOTION.toString(), 
				"0xbd60c8caf6e22907576d9e363ab1f91b43aaf769",
				"Morning Moon Village game item", 
				0,
				TokenCategory.GAMING.toString(),
				EVMChain.BITKUB.toString(),
				new ArrayList<String>() {{
					this.add("https://www.bkcscan.com/tokens/0xbd60c8caf6e22907576d9e363ab1f91b43aaf769/token-transfers");
					this.add("https://morningmoonvillage.com/");
				}});
		tokens.put(BitkubKAP20Token.MMV_HEALTHPOTION.toString(), mmv_health_potion);

		// silver key
		EVMERC20TokenInfo mmv_silverkey = new EVMERC20TokenInfo(
				BitkubKAP20Token.MMV_LHEALTHPOTION.toString(), 
				"0xe66f21d817af8f99129af6023332dd7b37503b9d",
				"Morning Moon Village game item", 
				0,
				TokenCategory.GAMING.toString(),
				EVMChain.BITKUB.toString(),
				new ArrayList<String>() {{
					this.add("https://www.bkcscan.com/tokens/0xe66f21d817af8f99129af6023332dd7b37503b9d/token-transfers");
					this.add("https://morningmoonvillage.com/");
				}});
		tokens.put(BitkubKAP20Token.MMV_LHEALTHPOTION.toString(), mmv_silverkey);

		// red herb
		EVMERC20TokenInfo mmv_redherb = new EVMERC20TokenInfo(
				BitkubKAP20Token.MMV_REDHERB.toString(), 
				"0x3F69C740456150268C5e23bD05a2A10Bf9e5c3CB",
				"Morning Moon Village game item", 
				0,
				TokenCategory.GAMING.toString(),
				EVMChain.BITKUB.toString(),
				new ArrayList<String>() {{
					this.add("https://www.bkcscan.com/tokens/0x3F69C740456150268C5e23bD05a2A10Bf9e5c3CB/token-transfers");
					this.add("https://morningmoonvillage.com/");
				}});
		tokens.put(BitkubKAP20Token.MMV_REDHERB.toString(), mmv_redherb);

		// mmv banana
		EVMERC20TokenInfo mmv_banana = new EVMERC20TokenInfo(
				BitkubKAP20Token.MMV_BANANA.toString(), 
				"0x0944882cf373adc8c3de740821fb14c8669e89eb",
				"Morning Moon Village game item", 
				0,
				TokenCategory.GAMING.toString(),
				EVMChain.BITKUB.toString(),
				new ArrayList<String>() {{
					this.add("https://www.bkcscan.com/tokens/0x0944882cf373adc8c3de740821fb14c8669e89eb/token-transfers");
					this.add("https://morningmoonvillage.com/");
				}});
		tokens.put(BitkubKAP20Token.MMV_BANANA.toString(), mmv_banana);

		// bitkub peg USDT
		EVMERC20TokenInfo usdt = new EVMERC20TokenInfo(
				BitkubKAP20Token.USDT.toString(), 
				"0x7d984c24d2499d840eb3b7016077164e15e5faa6",
				"Morning Moon Village game item", 
				18,
				TokenCategory.STABLECOIN.toString(),
				EVMChain.BITKUB.toString(),
				new ArrayList<String>() {{
					this.add("https://www.bkcscan.com/tokens/0x7d984c24d2499d840eb3b7016077164e15e5faa6/token-transfers");
				}});
		tokens.put(BitkubKAP20Token.USDT.toString(), usdt);

		// test
		/*
		EVMERC20TokenInfo test = new EVMERC20TokenInfo(
				BitkubKAP20Token.TEST.toString(), 
				"0x2b591e99afe9f32eaa6214f7b7629768c40eeb39",
				//"0x2b591e99afe9f32eaa6214f7b7629768c40eeb39", // HEX :)
				"TEST token", 
				18,
				TokenCategory.TEST.toString(),
				EVMChain.BITKUB.toString(),
				new ArrayList<String>() {{
					this.add("https://www.bkcscan.com/tokens/0xMOJO");
				}});
		tokens.put(BitkubKAP20Token.TEST.toString(), test);
		 */

		return new ERC20TokenIndex(tokens);
	}

}
