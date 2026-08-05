package com.opps.payroll;

public class PartTimeEmp extends Employee {

	public PartTimeEmp(int eid, String ename, String etype, double basicsal) {
		super(eid, ename, etype, basicsal);
		
	}

	@Override
	public double netsal() {
		double allowence=0.05*getBasicsal();
		
		return getBasicsal()+allowence;
	}

}
