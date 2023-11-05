package crypto.forestfish.utils;

import java.io.File;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import crypto.forestfish.enums.avm.AVMNFTStandard;
import crypto.forestfish.objects.avm.model.nft.metadata.ARC3MetaData;
import crypto.forestfish.objects.avm.model.nft.metadata.ARC69ARC19MetaData;
import crypto.forestfish.objects.evm.model.nft.metadata.ERC721MetaData;
import crypto.forestfish.objects.evm.model.nft.metadata.OpenSeaTrait;
import crypto.forestfish.objects.ipfs.connector.IPFSConnector;

public class NFTUtils {

	private static final Logger LOGGER = LoggerFactory.getLogger(ContractMapper.class);

	public static ARC69ARC19MetaData convertMetadata_ERC721_to_ARC69(IPFSConnector _ipfs_connector, ERC721MetaData erc721metadata) {

		/**
		 * ARC69 base metadata
		 */
		String name = erc721metadata.getName();
		String description = erc721metadata.getDescription();

		@SuppressWarnings("unused")
		Integer decimals = null; // Assume ERC721 not fractional, but optional in the metadata
		String background_color = erc721metadata.getBackground_color();		

		String image = erc721metadata.getImage();
		String external_url = erc721metadata.getExternal_url();
		String animation_url = erc721metadata.getAnimation_url();
		String image_data = erc721metadata.getImage_data();

		//ArrayList<OpenSeaTrait> attributes = erc721metadata.getAttributes(); // we need to get below 1024, using properties instead

		ARC69ARC19MetaData arc69_metadata = new ARC69ARC19MetaData();
		arc69_metadata.setName(name);
		arc69_metadata.setDescription(description);
		arc69_metadata.setBackground_color(background_color);
		arc69_metadata.setImage(image);
		arc69_metadata.setExternal_url(external_url);
		arc69_metadata.setAnimation_url(animation_url);
		//arc69_metadata.setAttributes(attributes); // we need to get below 1024, using properties instead
		arc69_metadata.setImage_data(image_data);

		// attempt to convert ERC721 attributes to properties
		if (null != erc721metadata.getAttributes()) {
			HashMap<String, Object> properties = new HashMap<>();
			for (OpenSeaTrait ost: erc721metadata.getAttributes()) {
				properties.put(ost.getTrait_type(), ost.getValue());

			}
			arc69_metadata.setProperties(properties);
		}

		return arc69_metadata;
	}
	
	public static ARC3MetaData convertMetadata_ERC721_to_ARC3(IPFSConnector _ipfs_connector, ERC721MetaData erc721metadata) {

		/**
		 * ARC3 base metadata
		 */
		String name = erc721metadata.getName();
		String description = erc721metadata.getDescription();

		Integer decimals = null; // Assume ERC721 not fractional, but optional in the metadata
		String background_color = erc721metadata.getBackground_color();		

		String image = erc721metadata.getImage();
		String external_url = erc721metadata.getExternal_url();
		String animation_url = erc721metadata.getAnimation_url();
		String image_data = erc721metadata.getImage_data();

		HashMap<String, Object> properties_empty = new HashMap<>();

		ARC3MetaData arc3_metadata = new ARC3MetaData(name, description, decimals, background_color, image, external_url, animation_url, properties_empty);
		arc3_metadata.setImage_data(image_data);
		
		// image properties
		if ((null != image) && isSupportedURISchema(image)) {

			// add image mimetype
			String image_mimetype = determine_mimetype_from_ext(image);
			if (null != image_mimetype) arc3_metadata.setImage_data_mimetype(image_mimetype);

			// download the image and calculate integrity field (base64 of sha256)
			byte[] image_bytes = _ipfs_connector.getBinaryContent(arc3_metadata.getImage());
			byte[] image_sha256 = CryptUtils.calculateSHA256FromByteArray(image_bytes);
			String image_sha256_base64 = StringsUtils.encodeBytesToBase64(image_sha256);
			if (null != image_sha256_base64) arc3_metadata.setImage_data_integrity("sha256-" + image_sha256_base64);
		}

		// animation_url properties
		if ((null != animation_url) && isSupportedURISchema(animation_url)) {

			// add animation_url mimetype
			String animation_url_mimetype = determine_mimetype_from_ext(animation_url);
			if (null != animation_url_mimetype) arc3_metadata.setAnimation_url_mimetype(animation_url_mimetype);

			// download the animation_url and calculate integrity field (base64 of sha256)
			byte[] animation_url_bytes = _ipfs_connector.getBinaryContent(arc3_metadata.getAnimation_url());
			byte[] animation_url_sha256 = CryptUtils.calculateSHA256FromByteArray(animation_url_bytes);
			String animation_url_sha256_base64 = StringsUtils.encodeBytesToBase64(animation_url_sha256);
			if (null != animation_url_sha256_base64) arc3_metadata.setAnimation_url_integrity("sha256-" + animation_url_sha256_base64);
		}
		
		// external_url properties
		if ((null != external_url) && isSupportedURISchema(external_url)) {

			// add external_url mimetype
			String external_url_mimetype = determine_mimetype_from_ext(external_url);
			if (null != external_url_mimetype) arc3_metadata.setExternal_url_mimetype(external_url_mimetype);

			// download the animation_url and calculate integrity field (base64 of sha256)
			byte[] external_url_bytes = _ipfs_connector.getBinaryContent(arc3_metadata.getExternal_url());
			byte[] external_url_sha256 = CryptUtils.calculateSHA256FromByteArray(external_url_bytes);
			String external_url_sha256_base64 = StringsUtils.encodeBytesToBase64(external_url_sha256);
			if (null != external_url_sha256_base64) arc3_metadata.setExternal_url_integrity("sha256-" + external_url_sha256_base64);
		}

		// attempt to convert ERC721 attributes to properties
		if (null != erc721metadata.getAttributes()) {
			HashMap<String, Object> properties = new HashMap<>();
			for (OpenSeaTrait ost: erc721metadata.getAttributes()) {
				properties.put(ost.getTrait_type(), ost.getValue());

			}
			arc3_metadata.setProperties(properties);
		}

		return arc3_metadata;
	}

	private static boolean isSupportedURISchema(String _str) {
		if (_str.startsWith("http://")) return true;
		if (_str.startsWith("https://")) return true;
		if (_str.startsWith("ipfs://")) return true;
		return false;
	}

	public static String determine_mimetype_from_ext(String _str) {

		// image
		if (_str.endsWith(".png")) return "image/png";
		if (_str.endsWith(".jpg")) return "image/jpeg";
		if (_str.endsWith(".jpeg")) return "image/jpeg";

		// audio
		if (_str.endsWith(".ogg")) return "audio/ogg";

		// video
		if (_str.endsWith(".mp4")) return "video/mp4";

		return null;
	}

	public static boolean convertERC721MetadataFolderToARC(IPFSConnector _ipfs_connector, String _from_folder, String _to_folder, AVMNFTStandard _standard, boolean _debug) {

		boolean result = true;

		// initial sanity checks
		File from_folder_file = new File (_from_folder);
		if (!from_folder_file.exists()) return false;
		File to_folder_file = new File (_to_folder);
		if (!to_folder_file.exists()) {
			if (!to_folder_file.mkdirs()) {
				LOGGER.error("Target folder " + _to_folder + " did not exist and was unable to create it");
				SystemUtils.halt();
			}
		}

		for (File from_file: FilesUtils.getAllFileNamesInFolderAsFiles(_from_folder)) {
			if (from_file.getName().endsWith(".json")) {

				// read the erc721 metadata
				String erc721_json = FilesUtils.readAllFromFile(from_file);
				System.out.println("------------------------ ERC721 metadata ------------------------");
				System.out.println(JSONUtils.prettyPrint(erc721_json));
				System.out.println("-----------------------------------------------------------------");


				// parse the erc721 metadata
				ERC721MetaData erc721_metadata = JSONUtils.createPOJOFromJSON(erc721_json, ERC721MetaData.class);
				if (_debug) {
					System.out.println("------------------------ ERC721 metadata ------------------------");
					System.out.println("name: " + erc721_metadata.getName());
					System.out.println("description: " + erc721_metadata.getDescription());
					System.out.println("external_url: " + erc721_metadata.getExternal_url());
					if (null != erc721_metadata.getAttributes()) {
						for (OpenSeaTrait ost: erc721_metadata.getAttributes()) {
							System.out.println(" - attribute: trait_type=" + ost.getTrait_type() + " value=" + ost.getValue());
						}
					}
					System.out.println("-----------------------------------------------------------------");
				}

				// convert the erc721 metadata to arc3
				if (AVMNFTStandard.ARC3 == _standard) {
					ARC3MetaData arc3_metadata = NFTUtils.convertMetadata_ERC721_to_ARC3(_ipfs_connector, erc721_metadata);
					if (null == arc3_metadata) {
						LOGGER.warn("Failed to convert metadata file " + from_file.getName());
						result = false;
					} else {
						String arc3_json = JSONUtils.createJSONFromPOJO(arc3_metadata);
						String arc3_json_prettyprint = JSONUtils.prettyPrint(arc3_json);
						FilesUtils.writeToFileUNIXHaltOnException(arc3_json_prettyprint, _to_folder + "/" + from_file.getName());

						System.out.println("--------------- ERC721 -> ARC3, metadata results ---------------");
						System.out.println(arc3_json_prettyprint);
						System.out.println("----------------------------------------------------------------");
					}
				}
				
				// convert the erc721 metadata to arc69
				if (AVMNFTStandard.ARC69 == _standard) {
					ARC69ARC19MetaData arc69_metadata = NFTUtils.convertMetadata_ERC721_to_ARC69(_ipfs_connector, erc721_metadata);
					if (null == arc69_metadata) {
						LOGGER.warn("Failed to convert metadata file " + from_file.getName());
						result = false;
					} else {
						String arc69_json = JSONUtils.createJSONFromPOJO(arc69_metadata);
						String arc69_json_prettyprint = JSONUtils.prettyPrint(arc69_json);
						FilesUtils.writeToFileUNIXHaltOnException(arc69_json_prettyprint, _to_folder + "/" + from_file.getName());

						System.out.println("--------------- ERC721 -> ARC69, metadata results ---------------");
						System.out.println(arc69_json_prettyprint);
						System.out.println("----------------------------------------------------------------");
					}
				}
			}
		}

		return result;
	}

	public static String createUnitNameFromName(String _name) {
		if (_name.length() <= 8) return _name;
		
		// Attempt to just shorten by clean ..
		String clean = StringsUtils.onlykeepAlphaNumeric(_name);
		if (clean.length() <= 8) return clean;
		
		StringBuffer sb1 = new StringBuffer();
		String[] parts = clean.split(" ");
		boolean first = true;
		for (String part: parts) {
			if (StringsUtils.isOnlyAlpha(part)) {
				if (first) {
					sb1.append(part.charAt(0));
					first = false;
				} else {
					sb1.append(part.charAt(0));
				}
			} else {
				sb1.append("_" + part);
			}
		}
		String short1 = sb1.toString().toUpperCase();
		if (short1.length() <= 8) return short1;
		
		String short2 = short1.replace("_", "");
		if (short2.length() <= 8) return short2;
		
		// out of options
		return "";
	}

	public static String determinefragmentFromMimetype(String _url_mimetype) {
		if (_url_mimetype.toLowerCase().contains("audio")) return "#a";
		if (_url_mimetype.toLowerCase().contains("image")) return "#i";
		if (_url_mimetype.toLowerCase().contains("video")) return "#v";
		if (_url_mimetype.toLowerCase().contains("pdf")) return "#p";
		if (_url_mimetype.toLowerCase().contains("text/html")) return "#h";
		return null;
	}

}
