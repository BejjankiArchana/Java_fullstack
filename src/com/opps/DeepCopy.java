package com.opps;
class Employee{
	int eid;
	String ename;
	Address1 address;
	Employee(int eid,String ename,Address1 address){
		this.eid=eid;
		this.ename=ename;
		this.address=address;
		
	}
	Employee(Employee emp){
		this.eid=emp.eid;
		this.ename=emp.ename;
		this.address=new Address1(emp.address);//deep copy using copy constructor
	}
	
	
}
  class Address1{
	  String city;
	  Address1(String city){
		  this.city=city;
	  }
	  Address1(Address1 a){
		  this.city=a.city;
	  }
	  
  }


public class DeepCopy {

	public static void main(String[] args) {
		System.out.println("main method");
		Address1 a1=new Address1("chennai");
		Employee emp=new Employee(201,"sivaji",a1);
		
		System.out.println(emp.eid);
		System.out.println(emp.ename);
		System.out.println(emp.address.city);
		
		Employee emp2=new Employee(emp);
		
		System.out.println(emp2.eid);
		System.out.println(emp2.ename);
		System.out.println(emp2.address.city);
		System.out.println("-------------------------");
		emp2.eid=202;
		emp2.ename="siva";
		emp2.address.city="coembathur";
		System.out.println(emp2.eid);
		System.out.println(emp2.ename);
		System.out.println(emp2.address.city);
		System.out.println("-------------------------");
		System.out.println(emp.eid);
		System.out.println(emp.ename);
		System.out.println(emp.address.city);
		
	}

}
