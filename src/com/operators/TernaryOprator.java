package com.operators;

import java.util.Scanner;

// a ternary operator is nothing but ? :
//used to check condition based on result perform either this or that

public class TernaryOprator {
	Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("main method");
		int a=10;
		int b=20;
		
		int  max=(a>b)?a:b;
		System.out.println("max of "+a+" , "+b+" is "+max);
		System.out.println("enter three values :");
		int a1=sc.nextInt();
		int b1=sc.nextInt();
		int c1=sc.nextInt();
		int max2=(a1>b1)? (a1>c1?a1:c1):(b1>c1?b1:c1);
		System.out.println("max of a1,b1,c1 is"+ max2);
		
		

	}

}
