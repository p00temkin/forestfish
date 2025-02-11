package crypto.forestfish.objects.api.nuit;

import java.util.ArrayList;

public class ObserveSpace {

	private String markdown;
	private String description;
	private String category;
	private ArrayList<ObserveAction> actions;
	private ArrayList<ObserveAction> special_actions;
	
	public ObserveSpace() {
		super();
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public ArrayList<ObserveAction> getActions() {
		return actions;
	}
	
	public void setActions(ArrayList<ObserveAction> actions) {
		this.actions = actions;
	}

	public String getMarkdown() {
		return markdown;
	}

	public void setMarkdown(String markdown) {
		this.markdown = markdown;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public ArrayList<ObserveAction> getSpecial_actions() {
		return special_actions;
	}

	public void setSpecial_actions(ArrayList<ObserveAction> special_actions) {
		this.special_actions = special_actions;
	}

	
}
