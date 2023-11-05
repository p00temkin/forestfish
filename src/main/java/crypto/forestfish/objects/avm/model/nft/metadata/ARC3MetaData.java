package crypto.forestfish.objects.avm.model.nft.metadata;

import java.util.HashMap;

public class ARC3MetaData {

	/**
	 *  https://github.com/algorandfoundation/ARCs/blob/main/ARCs/arc-0003.md
	 */
	private String name;
	private String description;
	private Integer decimals;
	private String background_color;
	
	private String image; // Supports {id}
	private String image_integrity;
	private String image_mimetype;
	
	private String external_url; // Supports {id}
	private String external_url_integrity;
	private String external_url_mimetype;
	
	private String animation_url;
	private String animation_url_integrity;
	private String animation_url_mimetype;
	
	private String extra_metadata;
	
	private HashMap<String, Object> properties;
	// Common properties keys:
	// - String file_url [file_url_integrity, file_url_mimetype]
	
	private HashMap<String, Object> localization;
	// Required localization keys:
	// - String uri (supports {locale})
	// - String default
	// - ArrayList<String> locales
	// - HashMap<String,String> integrity
	
	/**
	 *  https://docs.opensea.io/docs/metadata-standards + _integrity/_mimetype for uri properties
	 */
	//private String name;
	//private String description;
	//private String background_color;
	
	//private String image; // Supports {id}
	//private String image_integrity;
	//private String image_mimetype;
	
	private String image_data;
	private String image_data_integrity;
	private String image_data_mimetype;
	
	//private String external_url; // Supports {id}
	//private String external_url_integrity;
	//private String external_url_mimetype;
	
	//private String animation_url;
	//private String animation_url_integrity;
	//private String animation_url_mimetype;
	
	public ARC3MetaData() {
		super();
	}
	
	// Pure constructor
	public ARC3MetaData(String _name, String _description, Integer _decimals, String _background_color,
			String _image, String _external_url, String _animation_url, 
			HashMap<String, Object> _properties) {
		super();
		this.name = _name;
		this.description = _description;
		this.decimals = _decimals;
		this.background_color = _background_color;
		this.image = _image;
		this.external_url = _external_url;
		this.animation_url = _animation_url;
		this.properties = _properties;
	}
	
	// Full constructor
	public ARC3MetaData(String _name, String _description, Integer _decimals, String _background_color,
			String _image, String _image_mimetype, String _image_integrity,
			String _image_data, String _image_data_mimetype, String _image_data_integrity,
			String _external_url, String _external_url_mimetype, String _external_url_integrity,
			String _animation_url, String _animation_url_mimetype, String _animation_url_integrity,
			HashMap<String, Object> _properties, HashMap<String, Object> _localization) {
		super();
		this.decimals = _decimals;
		this.properties = _properties;
		this.name = _name;
		this.description = _description;
		this.background_color = _background_color;
		this.image = _image;
		this.image_mimetype = _image_mimetype;
		this.image_integrity = _image_integrity;
		this.image_data = _image_data;
		this.image_data_mimetype = _image_data_mimetype;
		this.image_data_integrity = _image_data_integrity;
		this.external_url = _external_url;
		this.external_url_mimetype = _external_url_mimetype;
		this.external_url_integrity = _external_url_integrity;
		this.animation_url = _animation_url;
		this.animation_url_mimetype = _animation_url_mimetype;
		this.animation_url_integrity = _animation_url_integrity;
		this.localization = _localization;
	}



	public String getExtra_metadata() {
		return extra_metadata;
	}

	public void setExtra_metadata(String extra_metadata) {
		this.extra_metadata = extra_metadata;
	}

	public Integer getDecimals() {
		return decimals;
	}

	public void setDecimals(Integer decimals) {
		this.decimals = decimals;
	}

	public HashMap<String, Object> getLocalization() {
		return localization;
	}

	public void setLocalization(HashMap<String, Object> localization) {
		this.localization = localization;
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

	public String getImage_integrity() {
		return image_integrity;
	}

	public void setImage_integrity(String image_integrity) {
		this.image_integrity = image_integrity;
	}

	public String getImage_mimetype() {
		return image_mimetype;
	}

	public void setImage_mimetype(String image_mimetype) {
		this.image_mimetype = image_mimetype;
	}

	public String getImage_data() {
		return image_data;
	}

	public void setImage_data(String image_data) {
		this.image_data = image_data;
	}

	public String getImage_data_integrity() {
		return image_data_integrity;
	}

	public void setImage_data_integrity(String image_data_integrity) {
		this.image_data_integrity = image_data_integrity;
	}

	public String getImage_data_mimetype() {
		return image_data_mimetype;
	}

	public void setImage_data_mimetype(String image_data_mimetype) {
		this.image_data_mimetype = image_data_mimetype;
	}

	public String getExternal_url() {
		return external_url;
	}

	public void setExternal_url(String external_url) {
		this.external_url = external_url;
	}

	public String getExternal_url_integrity() {
		return external_url_integrity;
	}

	public void setExternal_url_integrity(String external_url_integrity) {
		this.external_url_integrity = external_url_integrity;
	}

	public String getExternal_url_mimetype() {
		return external_url_mimetype;
	}

	public void setExternal_url_mimetype(String external_url_mimetype) {
		this.external_url_mimetype = external_url_mimetype;
	}

	public String getAnimation_url() {
		return animation_url;
	}

	public void setAnimation_url(String animation_url) {
		this.animation_url = animation_url;
	}

	public String getAnimation_url_integrity() {
		return animation_url_integrity;
	}

	public void setAnimation_url_integrity(String animation_url_integrity) {
		this.animation_url_integrity = animation_url_integrity;
	}

	public String getAnimation_url_mimetype() {
		return animation_url_mimetype;
	}

	public void setAnimation_url_mimetype(String animation_url_mimetype) {
		this.animation_url_mimetype = animation_url_mimetype;
	}

	public HashMap<String, Object> getProperties() {
		return properties;
	}

	public void setProperties(HashMap<String, Object> properties) {
		this.properties = properties;
	}
	
}
