package com.types_of_methods;
//wap for addition,subtraction,multiplication,division,modulous
//instance methods with no args + no_ret_types
//BODMAS->brackets,orders,division,multiplication,addition,subtraction
//(/)->gives quotient
//(%)->gives remainder
//(*)->gives multiplication
public class Methods_2 {
	void addition() {
		int a=10;
		int b=20;
	System.out.println("addition :"+(a+b));//if bracket not provided then concatinates
	}
	
	void subtraction() {
		int a=10;
		int b=20;
	System.out.println("subtraction :"+(b-a));//if bracket not provided 
	                              //compile time error operator - undefined for string
	}
	void multiplication() {
		int a=10;
		int b=20;
	System.out.println("multiplication :"+a*b);//no need of brackets bcz
	                    //according to BODMAS rule mul comes first than addition
	}
	void division() {
		int a=55;
		int b=4;
	System.out.println("Division :"+a/b);//no need of brackets bcz
    //according to BODMAS rule div comes first than addition
	}
	void modulous() {
		int a=55;
		int b=4;
	System.out.println("modulous :"+a%b);//no need of brackets bcz
    //according to BODMAS rule div comes first than addition
	}

	public static void main(String[] args) {
		System.out.println("main started");
		Methods_2 m=new Methods_2();
		m.addition();
		m.subtraction();
		m.multiplication();
		m.division();
		m.modulous();
		

	}
	

}
