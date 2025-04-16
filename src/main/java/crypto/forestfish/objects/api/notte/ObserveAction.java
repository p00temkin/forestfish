package crypto.forestfish.objects.api.notte;

import java.util.ArrayList;

public class ObserveAction {
	
	private String id;
	private String description;
	private String category;
	private ArrayList<ObserveParams> params;
	
	public ObserveAction() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public ArrayList<ObserveParams> getParams() {
		return params;
	}

	public void setParams(ArrayList<ObserveParams> params) {
		this.params = params;
	}

}
