package crypto.forestfish.objects.evm.model.nft.metadata;

import java.util.ArrayList;
import java.util.HashMap;

public class ERC1155MetaData {

	/**
	 *  https://eips.ethereum.org/EIPS/eip-721
	 */
	private String name;
	private String description;
	private String image; // Supports {id}
	private Integer decimals;
	
	private ArrayList<HashMap<String, Object>> properties;
	// Common properties keys:
	// - String file_url
	
	private HashMap<String, Object> localization;
	// Required localization keys:
	// - String uri (supports {locale})
	// - String default
	// - ArrayList<String> locales
	
	/**
	 *  https://docs.opensea.io/docs/metadata-standards
	 */
	//private String name;
	//private String description;
	//private String image; // Supports {id}
	private String background_color;
	private String image_data;
	private String external_url; // Supports {id}
	private String animation_url;
	private String youtube_url;

	private ArrayList<OpenSeaTrait> attributes;

	public ERC1155MetaData() {
		super();
	}

	public ERC1155MetaData(String _name, String _description, Integer _decimals, String _background_color,
			String _image, String _image_data,
			String _external_url, String _animation_url, String _youtube_url, 
			ArrayList<OpenSeaTrait> _attributes, ArrayList<HashMap<String, Object>> _properties, HashMap<String, Object> _localization) {
		super();
		this.name = _name;
		this.description = _description;
		this.decimals = _decimals;
		this.background_color = _background_color;
		this.image = _image;
		this.image_data = _image_data;
		this.external_url = _external_url;
		this.animation_url = _animation_url;
		this.youtube_url = _youtube_url;
		this.attributes = _attributes;
		this.properties = _properties;
		this.localization = _localization;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public ArrayList<HashMap<String, Object>> getProperties() {
		return properties;
	}

	public void setProperties(ArrayList<HashMap<String, Object>> properties) {
		this.properties = properties;
	}

	public String getBackground_color() {
		return background_color;
	}

	public void setBackground_color(String background_color) {
		this.background_color = background_color;
	}

	public String getImage_data() {
		return image_data;
	}

	public void setImage_data(String image_data) {
		this.image_data = image_data;
	}

	public String getExternal_url() {
		return external_url;
	}

	public void setExternal_url(String external_url) {
		this.external_url = external_url;
	}

	public String getAnimation_url() {
		return animation_url;
	}

	public void setAnimation_url(String animation_url) {
		this.animation_url = animation_url;
	}

	public String getYoutube_url() {
		return youtube_url;
	}

	public void setYoutube_url(String youtube_url) {
		this.youtube_url = youtube_url;
	}

	public HashMap<String, Object> getLocalization() {
		return localization;
	}

	public void setLocalization(HashMap<String, Object> localization) {
		this.localization = localization;
	}

	public Integer getDecimals() {
		return decimals;
	}

	public void setDecimals(Integer decimals) {
		this.decimals = decimals;
	}

	public ArrayList<OpenSeaTrait> getAttributes() {
		return attributes;
	}

	public void setAttributes(ArrayList<OpenSeaTrait> attributes) {
		this.attributes = attributes;
	}
	
}
