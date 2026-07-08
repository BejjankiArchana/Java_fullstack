package com.loops.whileloops;

import java.util.Scanner;

public class DecimalToBin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num :");
		int n=sc.nextInt();
		convertToBin(n);

	}

	static void convertToBin(int n) {
		String bin="";
		int rem=0;
		while(n>0) {
			rem=n%2;
			bin=rem+bin;
			n=n/2;
			
		}
		System.out.println("binary: "+bin);
		
		
	}

	}


