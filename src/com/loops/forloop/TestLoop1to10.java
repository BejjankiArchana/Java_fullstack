package com.loops.forloop;

import java.util.Scanner;

public class TestLoop1to10 {

	public static void main(String[] args) {
		//for(int i=0;i<10;){
		//System.out.println(i);}//syntax correct but infinite loop
		for(int i=0;i<=10;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("reverse order:");
		for(int i=10;i>=0;i--) {
			System.out.print(i+" ");
		}
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("enter a number :");
		int a=sc.nextInt();
		int sum=sum(a);
		fibonacci(a);
		System.out.println("sum of numbers from 1 to "+a+" is "+sum);
		System.out.println("enter a number :");
		int b=sc.nextInt();
		int fact=fact(b);
		System.out.println("factorial of given number "+b+" is "+fact);
		String evenOrodd=evenOrodd(a);
		System.out.println("given number "+a+" is "+evenOrodd);
		multiple7(a);
		
		


	}
	static int sum(int n) {
		int sum=0;
		for(int i=1;i<n;i++) {
			sum+=i;
		}
		return sum;
	}
	static int fact(int n) {
		
		if(n==0||n==1) {
			return 1;
		}
		 else
		     return n * fact(n - 1);
		
	}
	static String evenOrodd(int n) {
		
		if(n%2==0) {
			return "even";
		}
		else {
			return "odd";
		}
	}
	static void multiple7(int n) {
		
		for(int i=1;i<=n;i++) {
			if(i%7==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
	}
	static void fibonacci(int n) {
		int n1=0;
		int n2=1;
		int n3;
		System.out.print(n1+" "+n2+" ");
		for(int i=1;i<n;i++) {
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
		System.out.println();
	}

}
