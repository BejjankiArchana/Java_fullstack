package com.opps;

public class TestEnapStudent {

	public static void main(String[] args) {
		//if you have all arg constructor in student class then you can directly assign values while creating
		//but you can not modify it if you dont have setters
		//not providing setters make its variables immutable like Strings
		//with setters you can modify and provide controlled access to variables
		EncapStudent s1= new EncapStudent(1,"archana",99);
		s1.setMarks(75);//you dont have setters then this is not possible
		//toString() method will print all data to gether but if you want individual data them you need getters
		//toString of method is a method of object class so all classes extend object so we can override this method
		//to return our own class data
		System.out.println(s1);//gives all data with out using method name even 
		System.out.println(s1.toString());//both are same whether you call toString or not 
		System.out.println(s1.getId());//for getting individual fields
		
		

	}

}
