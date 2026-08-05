package com.opps.payroll;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
	System.out.println("welcome to payroll system");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your emp id");
	int eid=sc.nextInt();
	System.out.println("enter your name :");
	String ename=sc.next();
	System.out.println("enter your type of enployment :");
	System.out.println("enter 1 for full time employee");
	System.out.println("enter 2 for part time employee");
	System.out.println("enter 3 for contract employee");
	int choice=sc.nextInt();
	System.out.println("enter your basic sal :");
	double bsal=sc.nextDouble();
	Employee e=null;
	switch(choice) {
	case 1->{e=new FullTimeEmp(eid,ename,"fulltime",bsal);
	             System.out.println("net salary :"+e.netsal()); }
	case 2->{e=new PartTimeEmp(eid,ename,"parttime",bsal);
    System.out.println("net salary :"+e.netsal()); }
	case 3->{e=new ContractEmp(eid,ename,"contract",bsal);
    System.out.println("net salary :"+e.netsal()); }
	 default->{
    System.out.println("invalid type of employee"); }


	}
	

	}

}
