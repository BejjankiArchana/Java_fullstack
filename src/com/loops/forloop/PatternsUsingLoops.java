package com.loops.forloop;

import java.util.Scanner;

public class PatternsUsingLoops {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number :");
		int n=sc.nextInt();
		pattern1(n);
		System.out.println();
		pattern2(n);
		System.out.println();
		pattern3(n);
		System.out.println();
		pattern4(n);
		System.out.println();
		pattern5(n);
		
		

	}
	static void pattern1(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}
	static void pattern2(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}
	static void pattern3(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j );
			}
			System.out.println();
			
		}
	}
	static void pattern4(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(j );
			}
			System.out.println();
			
		}
	}
	static void pattern5(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i );
			}
			System.out.println();
			
		}
	}

}
