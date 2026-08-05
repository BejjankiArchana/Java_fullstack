package com.opps;
class Student1 implements Cloneable{
	int sid;
	String sname;
	Address address;
	Student1(int sid,String sname,Address address){
		this.sid=sid;
		this.sname=sname;
		this.address=address;
	}
	@Override
	protected Object clone()throws CloneNotSupportedException {
		return super.clone();
	}
}
class Address{
	String city;
	Address(String city){
		this.city=city;
		}
	
}

public class ShallowCopy {

	public static void main(String[] args) throws CloneNotSupportedException{
		System.out.println("main method started");
		Address a=new Address("hyderabad");
		Student1 s=new Student1(101,"archana",a);
		System.out.println(s.sid);
		System.out.println(s.sname);
		System.out.println(s.address.city);
		
		Student1 s1=(Student1)s.clone();
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);
		
		System.out.println("---------------------------------");
		
		s1.sid=102;
		s1.sname="archana1";
		s1.address.city="bangloore";
		
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);
		
		System.out.println(s.sid);
		System.out.println(s.sname);
		System.out.println(s.address.city);//s address also changes when s1 address changes
		//bcz nested objects share the same object not creating new object this is called shallow copy
		
		
		
		
		

	}

}
