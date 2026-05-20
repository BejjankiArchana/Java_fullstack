package com.javaintro;

public class Cricketer {
	//instance variables
	int jno;
	String name;
	//static variables
	static final  int countryid =91;
	static String countryname;

	public static void main(String[] args) {
		//accessing static data
		//countryid=92;
		countryname="bharath";
		System.out.println(countryid);
		System.out.println(countryname);
		//to access instance we have to create object of class
		Cricketer msd=new Cricketer();
		//LHS Cricketor is class name
		//msd is object reference variable
		//new keyword used to create object
		//Cricketer()constructor calling
		//accessing instance data
		//countryid=91;
		countryname="india";
		msd.jno=12;
		msd.name="mahendra singh dhoni";
		System.out.println(countryid);
		System.out.println(countryname);
		System.out.println(msd.jno);
		System.out.println(msd.name);
		
		
 
	}

}
