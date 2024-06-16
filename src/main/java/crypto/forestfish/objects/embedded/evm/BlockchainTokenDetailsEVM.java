package crypto.forestfish.objects.embedded.evm;

import java.util.ArrayList;
import java.util.HashMap;

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
import crypto.forestfish.objects.evm.model.erc20.ERC20TokenIndex;
import crypto.forestfish.objects.evm.model.erc20.EVMERC20TokenInfo;
import crypto.forestfish.objects.evm.model.nft.EVMERC1155TokenInfo;
import crypto.forestfish.objects.evm.model.nft.EVMERC721TokenInfo;
import crypto.forestfish.objects.evm.model.nft.EVMNFTIndex;
import crypto.forestfish.utils.JSONUtils;

public class BlockchainTokenDetailsEVM {

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

	public static String generateEVMChainIndexJSON() {
		EVMChainIndex idx = BlockchainDetailsEVM.generateEVMChainIndex();
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
