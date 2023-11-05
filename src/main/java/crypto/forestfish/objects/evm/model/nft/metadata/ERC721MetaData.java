package crypto.forestfish.objects.evm.model.nft.metadata;

import java.util.ArrayList;

public class ERC721MetaData {

	/**
	 *  https://eips.ethereum.org/EIPS/eip-721
	 */
	private String name;
	private String description;
	private String image; // Supports {id}
	
	/**
	 *  https://docs.opensea.io/docs/metadata-standards
	 */
	//private String name;
	//private String description;
	//private String image; // Supports {id}
	private String background_color;
	private String image_data; // Only use this if you're not including the image parameter
	private String external_url; // Supports {id}
	private String animation_url;
	private String youtube_url;

	private ArrayList<OpenSeaTrait> attributes;

	public ERC721MetaData() {
		super();
	}

	public ERC721MetaData(String _name, String _description, String _background_color,
			String _image, String _image_data,
			String _external_url, String _animation_url, String youtube_url, 
			ArrayList<OpenSeaTrait> _attributes) {
		super();
		this.name = _name;
		this.description = _description;
		this.background_color = _background_color;
		this.image = _image;
		this.image_data = _image_data;
		this.external_url = _external_url;
		this.animation_url = _animation_url;
		this.youtube_url = youtube_url;
		this.attributes = _attributes;
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

	public ArrayList<OpenSeaTrait> getAttributes() {
		return attributes;
	}

	public void setAttributes(ArrayList<OpenSeaTrait> attributes) {
		this.attributes = attributes;
	}

}
