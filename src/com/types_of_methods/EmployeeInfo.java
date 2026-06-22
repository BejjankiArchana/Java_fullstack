package com.types_of_methods;

import java.util.Scanner;

public class EmployeeInfo {

	public static void main(String[] args) {
		System.out.println("welcome to vcube!");
		
		EmployeeInfo e=new EmployeeInfo();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your city: ");
		String city=sc.next();
		e.getEmpCity(city);
		System.out.println("enter your salary: ");
		double sal=sc.nextDouble();
		e.getEmpSal(sal);

		System.out.println("enter your org name: ");
		sc.nextLine();
		String s=sc.nextLine();
		e.getOrgName(s);
				
		System.out.println("enter your age: ");
		byte age=sc.nextByte();
		e.getEmpAge(age);
		System.out.println("enter your gender: ");
		char gender=sc.next().charAt(0);
		e.getEmpGender(gender);
		System.out.println("enter your emi: ");
		short emi=sc.nextShort();
		e.getEmpEMI(emi);
		System.out.println("enter your pf: ");
		int pf=sc.nextInt();
		e.getEmpPF(pf);
		System.out.println("enter your mobile: ");
		long mobile=sc.nextLong();
		e.getEmpmobile(mobile);
		System.out.println("enter your Increment: ");
		float increment=sc.nextFloat();
		e.getEmpIncrement(increment);
		System.out.println("enter your status: ");
		boolean status=sc.nextBoolean();
		e.getEmpStatus(status);
		
		

	}
	void getOrgName(String s) {
		System.out.println("org name :"+s);
	}
	void getEmpSal(double sal) {
		System.out.println("emp sal :"+sal);
	}
	void getEmpCity(String city) {
		System.out.println("emp city :"+city);
	}
	void getEmpAge(byte age) {
		System.out.println("emp age :"+age);
	}
	void getEmpGender(char Gender) {
		System.out.println("emp Gender :"+Gender);
	}
	void getEmpEMI(short EMI) {
		System.out.println("emp emi :"+EMI);
	}
	void getEmpPF(int pf) {
		System.out.println("emp pf :"+pf);
	}
	
	void getEmpStatus(boolean active) {
		System.out.println("emp Gender :"+active);
	}
	void getEmpmobile(long mobile) {
		System.out.println("emp mobile :"+mobile);
	}
	void getEmpIncrement(float Increment) {
		System.out.println("emp increment :"+Increment);
	}
	

}
