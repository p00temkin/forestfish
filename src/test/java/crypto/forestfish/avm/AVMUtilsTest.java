package crypto.forestfish.avm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.algorand.algosdk.account.Account;

import crypto.forestfish.utils.AVMUtils;

public class AVMUtilsTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(AVMUtilsTest.class);

	@Test
	public void testRandomAccountCreation() {

		Account acc1 = AVMUtils.createNewRandomAccount();
		
		LOGGER.info("Generated account with address: " + acc1.getAddress());
		assertEquals("Ensure proper Algorand address generated", 58, acc1.getAddress().toString().length());
		
        LOGGER.info("Mnemonic: " + acc1.toMnemonic());
        assertEquals("Ensure proper Algorand mnemonic generated", 25, acc1.toMnemonic().split(" ").length);
	}


	@Test
	public void testCIDv0EncodeToReserveAddress_TESTNET_FROMARCSPEC() {

		/**
		 * ENCODE (testnet)
		 *  - CID version 0/base58
		 *  - Encode from CID QmQZyq4b89RfaUw8GESPd2re4hJqB8bnm4kVHNtyQrHnnK -> reserve address EEQYWGGBHRDAMTEVDPVOSDVX3HJQIG6K6IVNR3RXHYOHV64ZWAEISS4CTI
		 *  - with template-ipfs://{ipfscid:0:dag-pb:reserve:sha2-256}
		 *  - https://github.com/algorandfoundation/ARCs/blob/main/ARCs/arc-0019.md
		 *  - https://testnet.algoexplorer.io/asset/66753108
		 *  - https://cid.ipfs.tech/#QmQZyq4b89RfaUw8GESPd2re4hJqB8bnm4kVHNtyQrHnnK
		 *  - verify with https://hex2algo.vercel.app/
		 */
		String cid_str = "QmQZyq4b89RfaUw8GESPd2re4hJqB8bnm4kVHNtyQrHnnK";
		String target_reserve_addr = "EEQYWGGBHRDAMTEVDPVOSDVX3HJQIG6K6IVNR3RXHYOHV64ZWAEISS4CTI"; 
		
		String derived_reserve_addr = AVMUtils.arc19EncodeCIDv0ToAlgorandAddress(cid_str);
		assertEquals("Ensure proper encoding of IPFS CID v0 address to reserve address", target_reserve_addr, derived_reserve_addr);
		
	}
	
	@Test
	public void testDecodeReserveAddressToCIDv0_TESTNET_FROM_ARCSPEC() {

		/**
		 * DECODE (testnet)
		 *  - CID version 0/base58
		 *  - Decode from reserve address EEQYWGGBHRDAMTEVDPVOSDVX3HJQIG6K6IVNR3RXHYOHV64ZWAEISS4CTI --> CID QmQZyq4b89RfaUw8GESPd2re4hJqB8bnm4kVHNtyQrHnnK
		 *  - with template-ipfs://{ipfscid:0:dag-pb:reserve:sha2-256}
		 *  - https://github.com/algorandfoundation/ARCs/blob/main/ARCs/arc-0019.md
		 *  - https://testnet.algoexplorer.io/asset/66753108
		 *  - https://cid.ipfs.tech/#QmQZyq4b89RfaUw8GESPd2re4hJqB8bnm4kVHNtyQrHnnK
		 *  - verify with https://hex2algo.vercel.app/
		 *  
		 *  Metadata at ipfs://QmQZyq4b89RfaUw8GESPd2re4hJqB8bnm4kVHNtyQrHnnK
				{
				    "name": "MIRROR INSIDE",
				    "decimals": 0,
				    "description": "They are here to show me who I am. ",
				    "image": "ipfs://QmfM89SDKizrDec6JoohuoZVBJGBUDCMRumJRHD5Q99Ffk",
				    "image_integrity": "sha256-v0ZAr+nh9AzTleNtKXlVlc0ysYUriITpkiNfNB3rwAs=",
				    "image_mimetype": ".jpg",
				    "unitName": "MRR",
				    "assetName": "MIRROR INSIDE",
				    "properties": {
				        "creator": {
				            "name": "nsmshms",
				            "description": "",
				            "address": "DXA7CQ64VD324G6F7UYZFFRYTVBOMEPTVS5SWMTS3XU4KMS6WN7GTKWDIY"
				        },
				        "royalties": [{
				                "name": "creator",
				                "addr": "DXA7CQ64VD324G6F7UYZFFRYTVBOMEPTVS5SWMTS3XU4KMS6WN7GTKWDIY",
				                "share": 5
				            }
				        ],
				        "keyWords": [],
				        "publisher": "dartroom.xyz",
				        "itemListElement": 1,
				        "numberOfItems": 1,
				        "arc69": {
				            "standard": "arc69",
				            "attributes": []
				        }
				    }
				}
		 *  
		 */
		String reserve_addr = "EEQYWGGBHRDAMTEVDPVOSDVX3HJQIG6K6IVNR3RXHYOHV64ZWAEISS4CTI"; 
		String target_cid_str = "QmQZyq4b89RfaUw8GESPd2re4hJqB8bnm4kVHNtyQrHnnK";

		String derived_cid = AVMUtils.arc19DecodeAlgorandAddressToCIDv0(reserve_addr);
		assertEquals("Ensure proper decoding of ARC19 reserve address to IPFS CID v0 address", derived_cid, target_cid_str);
		
	}
	
	@Test
	public void testCIDv0EncodeToReserveAddress_AlgoAstros_MAINNET() {

		/**
		 * ENCODE (mainnet)
		 *  - CID version 0/base58
		 *  - Encode from CID QmPntG5UdzPifpDaxMAwi1Fdh4e9Nr6jeeHApLSsrV7LJo -> reserve address FH7B2P3Y2CHSRPPKX33TWDZEEBQXM2O26P7D7P33DU3JOXCMVDIKRPBIHA
		 *  - with template-ipfs://{ipfscid:0:dag-pb:reserve:sha2-256}
		 *  - https://algoexplorer.io/asset/708106509
		 *  - https://www.reddit.com/r/HEADLINECrypto/comments/u7dxrf/using_arc19_to_make_upgradable_nfts/
		 *  - https://cid.ipfs.tech/#QmPntG5UdzPifpDaxMAwi1Fdh4e9Nr6jeeHApLSsrV7LJo
		 *  - verify with https://hex2algo.vercel.app/
		 */
		String cid_str = "QmRAaAXa6cG4G9AaS3shPgrq6DgSAntYN1mCg1ZANKVQCw"; 
		String target_reserve_addr = "FH7B2P3Y2CHSRPPKX33TWDZEEBQXM2O26P7D7P33DU3JOXCMVDIKRPBIHA"; 
		
		String derived_reserve_addr = AVMUtils.arc19EncodeCIDv0ToAlgorandAddress(cid_str);
		assertEquals("Ensure proper encoding of IPFS CID v0 address to reserve address", target_reserve_addr, derived_reserve_addr);
		
	}
	
	@Test
	public void testDecodeReserveAddressToCIDv0_AlgoAstros_MAINNET() {

		/**
		 * DECODE (mainnet)
		 *  - CID version 0/base58
		 *  - Decode from reserve address FH7B2P3Y2CHSRPPKX33TWDZEEBQXM2O26P7D7P33DU3JOXCMVDIKRPBIHA --> CID QmRAaAXa6cG4G9AaS3shPgrq6DgSAntYN1mCg1ZANKVQCw
		 *  - with template-ipfs://{ipfscid:0:dag-pb:reserve:sha2-256}
		 *  - https://algoexplorer.io/asset/708106509
		 *  - https://www.reddit.com/r/HEADLINECrypto/comments/u7dxrf/using_arc19_to_make_upgradable_nfts/
		 *  - https://cid.ipfs.tech/#QmRAaAXa6cG4G9AaS3shPgrq6DgSAntYN1mCg1ZANKVQCw
		 *  - verify with https://hex2algo.vercel.app/
		 *  
		   Metadata available on QmRAaAXa6cG4G9AaS3shPgrq6DgSAntYN1mCg1ZANKVQCw:
			{
			    "name": "Astro #220",
			    "description": "Algo Astros, An NFT Collection from the HEADLINE Team.",
			    "image": "ipfs://QmPntG5UdzPifpDaxMAwi1Fdh4e9Nr6jeeHApLSsrV7LJo",
			    "decimals": 0,
			    "unitName": "ASTRO220",
			    "image_integrity": "(sha256-18C15D17D33E6AA1C8579F740F9684C069F56C5F8750745C157F79FA528AC997",
			    "image_mimetype": "image/jpeg",
			    "properties": {
			        "Logo": "NFDomains",
			        "Background": "Code"
			    }
			}

		 *  
		 */
		String reserve_addr = "FH7B2P3Y2CHSRPPKX33TWDZEEBQXM2O26P7D7P33DU3JOXCMVDIKRPBIHA"; 
		String target_cid_str = "QmRAaAXa6cG4G9AaS3shPgrq6DgSAntYN1mCg1ZANKVQCw";

		String derived_cid = AVMUtils.arc19DecodeAlgorandAddressToCIDv0(reserve_addr);
		assertEquals("Ensure proper decoding of ARC19 reserve address to IPFS CID v0 address", derived_cid, target_cid_str);
		
	}
	
	@Test
	public void testCIDv1EncodeToReserveAddress_Example_MAINNET() {
		
		/**
		 * ENCODE
		 *  - CID version 1/base32
		 *  - Encode from CID bafybeidhlz7iznf5rpxwj5xfukppvkizxf4yp3cnpipjcmvbjkg7rwwwau -> reserve address 6562RSECCFMAUO5MNFCMED4ZKWY7KUB2LTH2SIIFYNZ6BUQTYZ4BQHLQBU
		 *  - with template-ipfs://{ipfscid:1:raw:reserve:sha2-256}
		 *  - https://github.com/algorandfoundation/ARCs/blob/main/ARCs/arc-0019.md
		 *  - https://algoexplorer.io/asset/865610737
		 *  - https://cid.ipfs.tech/#bafybeidhlz7iznf5rpxwj5xfukppvkizxf4yp3cnpipjcmvbjkg7rwwwau
		 *  - verify with https://hex2algo.vercel.app/
		 */
		String cid_str = "bafybeidhlz7iznf5rpxwj5xfukppvkizxf4yp3cnpipjcmvbjkg7rwwwau"; // image ipfs cid here is not metadata!!!!!!!!!!!!! FIX FIND THE metadata json cid and insert here
		String target_reserve_addr = "M5PH5DFUXWF66ZHW4WRJ56VJDG4XTB7MJV5B5EJSUFFI36G22YC57SXYKA"; // !! update to actual 6562RSECCFMAUO5MNFCMED4ZKWY7KUB2LTH2SIIFYNZ6BUQTYZ4BQHLQBU
		
		String derived_reserve_addr = AVMUtils.encodeCIDv1ToARC19AlgorandAddress(cid_str);
		assertEquals("Ensure proper encoding of IPFS CIDS v1 address to reserve address", target_reserve_addr, derived_reserve_addr);
		
	}
	
	@Test
	public void testDecodeReserveAddressToCIDv1_Example_MAINNET() {

		/**
		 * DECODE (mainnet)
		 *  - CID version 1/base32
		 *  - Decode from reserve address 6562RSECCFMAUO5MNFCMED4ZKWY7KUB2LTH2SIIFYNZ6BUQTYZ4BQHLQBU -> CID v1 .. 
		 *  - with template-ipfs://{ipfscid:1:raw:reserve:sha2-256}
		 *  - https://github.com/algorandfoundation/ARCs/blob/main/ARCs/arc-0019.md
		 *  - https://algoexplorer.io/asset/865610737
		 *  - https://cid.ipfs.tech/#...
		 *  - verify with https://hex2algo.vercel.app/
		 *  
		   Metadata available on CIDv1 bafkreihxpwumraqrlafdxldjitba7gkvwh2vaos4z6uscbodopqnee6gpa:
			{
			    "assetName": "Anon 220",
			    "unitName": "S1ANON",
			    "description": "",
			    "image": "ipfs://bafybeidhlz7iznf5rpxwj5xfukppvkizxf4yp3cnpipjcmvbjkg7rwwwau",
			    "external_url": "",
			    "properties": {
			        "background color": "grey",
			        "background style": "solid",
			        "mask color": "grey",
			        "skin tone": "dark"
			    },
			    "royalty": 0.05,
			    "register": "Minted by KinnDAO"
			}

		 */
		String reserve_addr = "6562RSECCFMAUO5MNFCMED4ZKWY7KUB2LTH2SIIFYNZ6BUQTYZ4BQHLQBU"; 
		String target_cid_str = "bafkreihxpwumraqrlafdxldjitba7gkvwh2vaos4z6uscbodopqnee6gpa";

		String derived_cid = AVMUtils.arc19DecodeAlgorandAddressToCIDv1(reserve_addr);
		assertEquals("Ensure proper decoding of ARC19 reserve address to IPFS CID v1 address", derived_cid, target_cid_str);
		
	}
}
