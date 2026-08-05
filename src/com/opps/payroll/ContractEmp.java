package com.opps.payroll;

public class ContractEmp extends Employee{

	public ContractEmp(int eid, String ename, String etype, double basicsal) {
		super(eid, ename, etype, basicsal);
		
	}
	@Override
	public double netsal() {
		
		return getBasicsal();
	}
	

}
