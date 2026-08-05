package com.opps.Loanapp;

import java.util.Scanner;

public class Loan {
	static Scanner sc=new Scanner(System.in);
	public String getcustomerName() {
		System.out.println("enter your name :");
		String name=sc.next();
		return name;
	}
	public int getcustomerAge() {
		System.out.println("enter your age :");
		int age=sc.nextInt();
		return age;
	}
	public double getcustomerSalary() {
		System.out.println("enter your Salary :");
		double sal=sc.nextDouble();
		return sal;
	}
	public int getcustomerCibil() {
		System.out.println("enter your cibil score  :");
		int cibil=sc.nextInt();
		return cibil;
	}
	public double getRateOfIntrest() {
		double roi=12.0;
		int cibil=getcustomerCibil();
		if(cibil>=300 && cibil<580) {
			System.out.println("Poor – High risk, loan rejection likely, higher interest rates");
		roi=roi+5.0;
		return roi;
		}
		else if(cibil>=580 && cibil<670) {
			System.out.println("May qualify with higher interest (3-5% above base rate)");
		roi=roi+3.0;
		return roi;
		}
		else if(cibil>=670 && cibil<740) {
			System.out.println("Good – Eligible for most loans, standard interest rates");
		roi=roi;
		return roi;
		}
		else if(cibil>=740 && cibil<800) {
			System.out.println("Very Good – Better interest rates, higher loan amounts");
		roi=roi-2.0;
		return roi;
		}
		else if(cibil>=800 && cibil<=900) {
			System.out.println("Excellent – Best rates, quick approval, maximum loan amount");
		roi=roi-4.0;
		return roi;
		}
		else {
			System.out.println("invalid cibil score :");
			return roi;
		}
	}
		boolean isvalidPhone() {
			System.out.println("enter your phone number :");
			String phone=sc.next();
			return phone.matches("^[6-9][0-9]{9}");
		}
		boolean isvalidAadhar() {
			System.out.println("enter your aadhar number :");
			String aadhar=sc.next();
			return aadhar.matches("^[2-9][0-9]{11}");
		}
		boolean isvalidPan() {
			System.out.println("enter your Pan number :");
			String pan=sc.next();
			return pan.matches("^[A-Z]{5}[0-9]{4}[A-Z]{1}");
		}
		
		
	}


