package com.opps.payroll;

public class FullTimeEmp extends Employee {

	public FullTimeEmp(int eid, String ename, String etype, double basicsal) {
		super(eid, ename, etype, basicsal);
		
	}
	
	@Override
	public double netsal() {
		double hra=0.2*getBasicsal();
		double da=0.10*getBasicsal();
		return getBasicsal()+hra+da;
	}
	

}
