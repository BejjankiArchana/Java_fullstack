package com.loops.whileloops;

import java.util.Scanner;

public class GetDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number :");
		int n=sc.nextInt();
		
		//int revnum=getreverse(n);
		//System.out.println("reverse of num :"+revnum);
		//System.out.println(ispalindrome(n,revnum));
		int sum=getSumOfdigits(n);
		System.out.println("sum of digits :"+sum);

	}

	 static boolean ispalindrome(int n,int rev) {
		boolean flag=false;
		if(n==rev) {
			flag=true;
		}
		return flag;
	}

   static int getreverse(int n) {
	   int rem=0;
	   int rev=0;
	   while(n>0) {
		   rem=n%10;
		   rev=rev*10+rem;
		   n=n/10;
		   
	   }
		
		return rev;
	}

	 static int getSumOfdigits(int n) {
		 int rem=0;
		 int count=0;
		   int sum=0;
		   for(int i=n;i>0; i=i/10) {
			   rem=i%10;
			   sum+=rem;
			  
			   count++;
		   }
			System.out.println("no of digits "+count);
			return sum;
	}

}
