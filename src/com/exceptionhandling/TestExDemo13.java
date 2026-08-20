package com.exceptionhandling;

import java.util.Scanner;

//custom exception
//to create a custom exception we have to extend our class to any exception class
class MyException extends Exception{
	
	String msg;
	MyException(){
		
	}
MyException(String s){
	super(s);
		
	}
	
//this is my custom exception class	
}
class MyException2 extends MyException{
	String msg;
	MyException2(){
		
	}
MyException2(String s){
	super(s);
		
	}
	//this is my another custom exception extending myException
}
public class TestExDemo13 {

	public static void main(String[] args) throws MyException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int age=sc.nextInt();
		if(age>18) {
			System.out.println("you are elligible for voting");
		}
		else {
			throw new MyException ("not elligible");
		}
		

	}

}
