package crypto.forestfish.objects.avm;

import java.math.BigDecimal;

import crypto.forestfish.enums.avm.Unit;

public class AVMNativeValue {
	
	private BigDecimal val;
	private Unit unit;
	
	public AVMNativeValue(BigDecimal val, Unit unit) {
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
