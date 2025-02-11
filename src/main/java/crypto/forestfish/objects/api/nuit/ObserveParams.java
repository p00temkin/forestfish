package crypto.forestfish.objects.api.nuit;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ObserveParams {

	private String name;
	private String type;
	private ArrayList<String> values;
	
	@JsonProperty("default")
	private String defaultText;

	public ObserveParams() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ArrayList<String> getValues() {
		return values;
	}

	public void setValues(ArrayList<String> values) {
		this.values = values;
	}

	public String getDefaultText() {
		return defaultText;
	}

	public void setDefaultText(String defaultText) {
		this.defaultText = defaultText;
	}
	
	
}
