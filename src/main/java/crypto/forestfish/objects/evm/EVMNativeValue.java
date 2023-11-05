package crypto.forestfish.objects.evm;

import java.math.BigDecimal;

import org.web3j.utils.Convert.Unit;

public class EVMNativeValue {
	
	private BigDecimal val;
	private Unit unit;
	
	public EVMNativeValue(BigDecimal val, Unit unit) {
		super();
		this.val = val;
		this.unit = unit;
	}
	
	public BigDecimal getVal() {
		return val;
	}
	
	public void setVal(BigDecimal val) {
		this.val = val;
	}
	
	public Unit getUnit() {
		return unit;
	}
	
	public void setUnit(Unit unit) {
		this.unit = unit;
	}
	
}
