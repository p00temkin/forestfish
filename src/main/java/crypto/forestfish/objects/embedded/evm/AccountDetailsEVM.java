package crypto.forestfish.objects.embedded.evm;

import java.util.ArrayList;
import java.util.HashMap;

import crypto.forestfish.enums.AddressCategory;
import crypto.forestfish.enums.CustomContractCategory;
import crypto.forestfish.enums.evm.EVMChain;
import crypto.forestfish.objects.evm.EVMKnownAccountAddress;
import crypto.forestfish.objects.evm.EVMKnownCustomContractAddress;

public class AccountDetailsEVM {

	@SuppressWarnings("serial")
	public static HashMap<String, EVMKnownAccountAddress> getKnownEVMWalletAddresses() {
		HashMap<String, EVMKnownAccountAddress> addresses = new HashMap<>();

		// binance exchange hot wallet
		EVMKnownAccountAddress binancehotwallet007 = new EVMKnownAccountAddress(
				"Binance Hot Wallet",
				"0xe2fc31f816a9b94326492132018c3aecc4a93ae1", 
				AddressCategory.EXCHANGE,
				new ArrayList<String>() {{
					this.add("https://bscscan.com/address/0xe2fc31f816a9b94326492132018c3aecc4a93ae1");
					this.add("https://www.coingecko.com/en/coins/aavegotchi-fomo");
				}});
		addresses.put(binancehotwallet007.getAddress(), binancehotwallet007);

		return addresses;
	}

	@SuppressWarnings("serial")
	public static HashMap<String, EVMKnownCustomContractAddress> getKnownEVMCustomContractAddressesBSC() {
		HashMap<String, EVMKnownCustomContractAddress> addresses = new HashMap<>();

		// binance hot wallet
		EVMKnownCustomContractAddress stargate_busd_staking = new EVMKnownCustomContractAddress(
				"Stargate",
				"0xe2fc31f816a9b94326492132018c3aecc4a93ae1", 
				EVMChain.BSC,
				CustomContractCategory.STAKING,
				new ArrayList<String>() {{
					this.add("https://bscscan.com/address/0x3052a0f6ab15b4ae1df39962d5ddefaca86dab47");
				}});
		addresses.put(stargate_busd_staking.getAddress(), stargate_busd_staking);
		
		// railgun deposit
		EVMKnownCustomContractAddress railgun = new EVMKnownCustomContractAddress(
				"Railgun deposit address",
				"0x57F5925FeB79B1fd7Cc491F858D7fBc65502D3FE", 
				EVMChain.GOERLITEST,
				CustomContractCategory.PRIVACY,
				new ArrayList<String>() {{
					this.add("https://goerli.etherscan.io/address/0x57f5925feb79b1fd7cc491f858d7fbc65502d3fe");
				}});
		addresses.put(railgun.getAddress(), railgun);

		return addresses;
	}
	
	
}
