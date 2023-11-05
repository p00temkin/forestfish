package crypto.forestfish.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import crypto.forestfish.objects.ipfs.IPFSNode;
import io.ipfs.api.IPFS;
import io.ipfs.api.MerkleNode;
import io.ipfs.api.NamedStreamable;
import io.ipfs.multihash.Multihash;

public class IPFSUtils {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(IPFSUtils.class);
    
    public static String readUTF8TextFileFromIPFS(IPFSNode ipfs_node, String base58Hash) {
        IPFS ipfs = new IPFS(ipfs_node.getApi_address());
        try {
            Multihash filePointer = Multihash.fromBase58(base58Hash); 
            byte[] fileContents = ipfs.cat(filePointer);
            LOGGER.info("just read " + fileContents.length + " bytes");
            String s2 = new String(fileContents, StandardCharsets.UTF_8);
            return s2;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static void readFileFromIPFS(IPFSNode ipfs_node, String base58Hash, File targetFile) {
        IPFS ipfs = new IPFS(ipfs_node.getApi_address());
        try {
            Multihash filePointer = Multihash.fromBase58(base58Hash); 
            byte[] fileContents = ipfs.cat(filePointer);
            
            try (FileOutputStream fos = new FileOutputStream(targetFile.getAbsolutePath())) {
                fos.write(fileContents);
             }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static String writeFileToIPFS(IPFSNode ipfs_node, File f) {
        IPFS ipfs = new IPFS(ipfs_node.getApi_address());
        try {
            NamedStreamable.FileWrapper file = new NamedStreamable.FileWrapper(f);
            MerkleNode addResult = ipfs.add(file).get(0);
            Multihash pointer = addResult.hash;
            LOGGER.info("Wrote " + f.getName() + " to IPFS with BASE58 file hash: " + pointer.toBase58());
            return pointer.toBase58();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static void printIPFSNodeInfo(IPFSNode ipfs_node) {
        try {
            IPFS ipfs = new IPFS(ipfs_node.getApi_address());
            System.out.println("IPFS node version: " + ipfs.version());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
	public static String extractCIDFromURL(String _ipfsUrl) {
		if (null == _ipfsUrl) return "";
		if (!_ipfsUrl.contains("/ipfs/")) return "";
		try {
			String cid = _ipfsUrl.split("/ipfs/")[1].split("[^a-zA-Z0-9']+")[0];
			if (isValidCIDV0(cid) || isValidCIDV1(cid)) return cid;
		} catch (Exception e) {
			return "";
		}
		return "";
	}

    public static boolean isValidCIDV0(String s) {
    	if (null == s) return false;
    	if (!s.startsWith("Qm")) return false;
    	if (!StringsUtils.isValidBase58(s)) return false;
        return s.matches("^[a-zA-Z0-9]{46}$");
    }

    public static boolean isValidCIDV1(String s) {
    	if (null == s) return false;
        return s.matches("^[a-zA-Z0-9]{59}$"); // base can vary, first char for base32 'b'
    }
	
}
