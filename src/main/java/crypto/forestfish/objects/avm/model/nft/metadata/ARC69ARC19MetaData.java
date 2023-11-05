package crypto.forestfish.objects.avm.model.nft.metadata;

import java.util.HashMap;

public class ARC69ARC19MetaData {

	/**
	 *  https://github.com/algorandfoundation/ARCs/blob/main/ARCs/arc-0069.md
	 */
	private String standard = "arc69";
	private String description;
	
	private String external_url; // Supports {id}
	private String media_url; // Supports {id}
	private String mime_type; // (au)
	private Integer decimals;
	
	private HashMap<String, Object> properties;
	// Common properties keys:
	// - String file_url
	
	/**
	 *  https://docs.opensea.io/docs/metadata-standards
	 */
	private String name;
	//private String description;
	private String background_color;
	
	private String image; // Supports {id}
	private String image_data;
	//private String external_url; // Supports {id}
	private String animation_url; // Supports {id}
	
	// deprecated but can be supported, ARC69 is limited to 1024 so skip by default
	//private ArrayList<OpenSeaTrait> attributes;
	
	public ARC69ARC19MetaData() {
		super();
	}
	
	// Pure constructor
	public ARC69ARC19MetaData(String _description, String _external_url, String _media_url, String _mime_type, Integer _decimals, HashMap<String, Object> _properties) {
		super();
		this.description = _description;
		this.external_url = _external_url;
		this.media_url = _media_url;
		this.mime_type = _mime_type;
		this.decimals = _decimals;
		this.properties = _properties;
	}
	
	// Full constructor
	public ARC69ARC19MetaData(String _name, String _description, Integer _decimals, String _background_color,
			String _image, String _image_data, String _external_url, String _animation_url, String _media_url, String _mime_type,
			HashMap<String, Object> _properties) {
		super();
		this.name = _name;
		this.description = _description;
		this.decimals = _decimals;
		this.background_color = _background_color;
		this.image = _image;
		this.image_data = _image_data;
		this.external_url = _external_url;
		this.animation_url = _animation_url;
		this.media_url = _media_url;
		this.mime_type = _mime_type;
		this.properties = _properties;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getExternal_url() {
		return external_url;
	}

	public void setExternal_url(String external_url) {
		this.external_url = external_url;
	}

	public String getMedia_url() {
		return media_url;
	}

	public void setMedia_url(String media_url) {
		this.media_url = media_url;
	}

	public String getMime_type() {
		return mime_type;
	}

	public void setMime_type(String mime_type) {
		this.mime_type = mime_type;
	}

	public Integer getDecimals() {
		return decimals;
	}

	public void setDecimals(Integer decimals) {
		this.decimals = decimals;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBackground_color() {
		return background_color;
	}

	public void setBackground_color(String background_color) {
		this.background_color = background_color;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getImage_data() {
		return image_data;
	}

	public void setImage_data(String image_data) {
		this.image_data = image_data;
	}

	public String getAnimation_url() {
		return animation_url;
	}

	public void setAnimation_url(String animation_url) {
		this.animation_url = animation_url;
	}

	public HashMap<String, Object> getProperties() {
		return properties;
	}

	public void setProperties(HashMap<String, Object> properties) {
		this.properties = properties;
	}
	
}
