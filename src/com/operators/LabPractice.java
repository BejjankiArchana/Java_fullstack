package com.operators;

import java.util.Scanner;

public class LabPractice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number :");
		int n=sc.nextInt();
		if((n%3==0)||(n%7==0)) {
			System.out.println("yes divisible");
		}
		else {
			System.out.println("not divisible");
			
		}
		System.out.println("enter a character :");
		char ch=sc.next().charAt(0);
		if((ch>='a')&&(ch<='z')) {
			System.out.println("yes lower case");
			
		}
		else {
			System.out.println("not lower case");
			
		}
		
		

	}

}
