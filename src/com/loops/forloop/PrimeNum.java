package com.loops.forloop;
//write a program to find prime numbers on prime posistions
import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a range :");
		int n=sc.nextInt();
		
		int count=0;
		
		for(int i=1;i<=n;i++) {
		
			if(isprime(i)) {
				
				count++;
				if(isprime(count)) {
					System.out.println(i);
				}
			}
		}
	

	}
	static boolean isprime(int n) {
		boolean flag=true;
		if(n==0 || n==1) {
			flag=false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag=false;
				break;
			}
		}
		return flag;
		
	}

}
