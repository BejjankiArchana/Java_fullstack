package com.loops.whileloops;

import java.util.Scanner;

public class PrimeNumUsingWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num up to where you want primes :");
		int n=sc.nextInt();
		int start=1;
		while(start<n) {
			if(isprime(start)) {
			System.out.print(start+" ");
		}
			start++;
	}
	}

	 static boolean isprime(int n) {
		 boolean flag=true;
		 if(n==0 || n==1) {
			 flag=false;
		 }
		 int num=2;
		while(num<=n/2) {
			if(n%num==0) {
				flag=false;
				break;
			}
			num++;
		}
		return flag;
	}
}
