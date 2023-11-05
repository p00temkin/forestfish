package crypto.forestfish.objects.embedded.avm;

import java.util.ArrayList;
import java.util.HashMap;

import crypto.forestfish.enums.AddressCategory;
import crypto.forestfish.enums.CustomContractCategory;
import crypto.forestfish.enums.avm.AVMChain;
import crypto.forestfish.objects.avm.AVMKnownAccountAddress;
import crypto.forestfish.objects.avm.AVMKnownCustomContractAddress;

public class AccountDetailsAVM {

	@SuppressWarnings("serial")
	public static HashMap<String, AVMKnownAccountAddress> getKnownAVMWalletAddresses() {
		HashMap<String, AVMKnownAccountAddress> addresses = new HashMap<>();

		// zero address
		AVMKnownAccountAddress zero = new AVMKnownAccountAddress(
				"Algorand encoded address of 32 zero bytes",
				"AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAY5HFKQ ", 
				AddressCategory.CORE,
				new ArrayList<String>() {{
					this.add("https://developer.algorand.org/docs/get-details/accounts/");
					this.add("https://algoexplorer.io/address/AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAY5HFKQ");
				}});
		addresses.put(zero.getAddress(), zero);
		
		// testnetdispenser1
		AVMKnownAccountAddress testnetdispenser1 = new AVMKnownAccountAddress(
				"Algorand Testnet Dispenser",
				"HZ57J3K46JIJXILONBBZOHX6BKPXEM2VVXNRFSUED6DKFD5ZD24PMJ3MVA ", 
				AddressCategory.CORE,
				new ArrayList<String>() {{
					this.add("https://testnet.algoexplorer.io/address/HZ57J3K46JIJXILONBBZOHX6BKPXEM2VVXNRFSUED6DKFD5ZD24PMJ3MVA");
					this.add("https://dispenser.testnet.aws.algodev.network");
				}});
		addresses.put(testnetdispenser1.getAddress(), testnetdispenser1);

		return addresses;
	}

	@SuppressWarnings("serial")
	public static HashMap<String, AVMKnownCustomContractAddress> getKnownAVMCustomContractAddressesBSC() {
		HashMap<String, AVMKnownCustomContractAddress> addresses = new HashMap<>();

		// test
		AVMKnownCustomContractAddress stargate_busd_staking = new AVMKnownCustomContractAddress(
				"Stargate",
				"0xe2fc31f816a9b94326492132018c3aecc4a93ae1", 
				AVMChain.MAINNET,
				CustomContractCategory.STAKING,
				new ArrayList<String>() {{
					this.add("https://bscscan.com/address/0x3052a0f6ab15b4ae1df39962d5ddefaca86dab47");
				}});
		addresses.put(stargate_busd_staking.getAddress(), stargate_busd_staking);

		return addresses;
	}
}
