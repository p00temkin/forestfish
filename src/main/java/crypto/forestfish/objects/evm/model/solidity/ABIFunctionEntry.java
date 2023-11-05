package crypto.forestfish.objects.evm.model.solidity;

import java.util.ArrayList;

public class ABIFunctionEntry {

	private String name;
	private String type;
	private String stateMutability;
	private ArrayList<ABIIOEntry> inputs;
	private ArrayList<ABIIOEntry> outputs;
	
	public ABIFunctionEntry() {
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
	
	public String getStateMutability() {
		return stateMutability;
	}
	
	public void setStateMutability(String stateMutability) {
		this.stateMutability = stateMutability;
	}
	
	public ArrayList<ABIIOEntry> getInputs() {
		return inputs;
	}
	
	public void setInputs(ArrayList<ABIIOEntry> inputs) {
		this.inputs = inputs;
	}
	
	public ArrayList<ABIIOEntry> getOutputs() {
		return outputs;
	}
	
	public void setOutputs(ArrayList<ABIIOEntry> outputs) {
		this.outputs = outputs;
	}
	
}
