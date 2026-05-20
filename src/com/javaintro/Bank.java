package com.javaintro;

public class Bank {
	static int serial=123576;
	int accountno;
	String name;
	int balance;
	String mobileno;
	{
		serial++;
		//we can assign here or we can assign inside main
		//method with object variable
		accountno=serial;
	}
	
	

	public static void main(String[] args) {
		Bank b1=new Bank();
		
		//b1.accountno=serial; we can also assign like this
		b1.name="archana";
		b1.balance=100;
		b1.mobileno="7392404720";
		b1.display();
		Bank b2=new Bank();
		//b2.accountno=serial; we can also assign like this
		b2.name="archana";
		b2.balance=100;
		b2.mobileno="7392404720";
		b2.display();
		Bank b3=new Bank();
		b3.name="archana";
		b3.balance=100;
		b3.mobileno="7392404720";
		b3.display();
		

	}
	void display() {
		System.out.println(accountno);
		System.out.println(name);
		System.out.println(balance);
		System.out.println(mobileno);
		System.out.println();
	}

}
