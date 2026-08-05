package com.opps.payroll;

public class Employee {
	private int eid;
	private String ename;
	private String etype;
	private double Basicsal;
	
	public Employee(int eid, String ename, String etype, double basicsal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.etype = etype;
		this.Basicsal = basicsal;
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEtype() {
		return etype;
	}
	public void setEtype(String etype) {
		this.etype = etype;
	}
	public double getBasicsal() {
		return Basicsal;
	}
	public void setBasicsal(double basicsal) {
		Basicsal = basicsal;
	}
	public double netsal() {
		return Basicsal;
	}
	
	

}
