package com.loops.forloop;

import java.util.Scanner;

public class AdwancedForLoops {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number :");
		int n=sc.nextInt();
		pattern1(n);
		
		

	}
	static void pattern1(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<i;j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
			
          }
		
		
	}

}
