package com.loops.whileloops;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num :");
		int n=sc.nextInt();
		if(isarmstrong(n)) {
			System.out.println("given num is armstrong :"+n);

	}
		else {
			System.out.println("given num is not armstrong :"+n);
		}

	}

	public static boolean isarmstrong(int n) {
		boolean flag=false;
		int count=(Integer.toString(n)).length();
		int rem=0;
		int sumP=0;
		int num=n;
		
		while(n>0) {
			int power=1;
			rem=n%10;
			for(int i=1;i<=count;i++) {
				power*=rem;
			}
			sumP+=power;
			n=n/10;
				
		}
		if(num==sumP) {
			flag=true;
		}
		return flag;
	}

}
