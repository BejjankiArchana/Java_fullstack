package com.opps.Loanapp;


public class PersonalLoan extends Loan{
	

	public static void main(String[] args) {
		
		System.out.println("welcome to vcube banking !!");
		LoanInterface p=new PersonalLoan();
		if(p.isvalidAadhar()&& p.isvalidPhone()&& p.isvalidPan()) {
		System.out.println("welcome :"+p.getcustomerName());
		int age=p.getcustomerAge();
		
		double salary=p.getcustomerSalary();
		if(age<=45 && salary>=70000) {
			System.out.println("Rate of Intrest :"+p.getRateOfIntrest());

			
		   }
		
		}
		
		else {
			System.out.println("invalid details !!");
		}
	

  }
}
