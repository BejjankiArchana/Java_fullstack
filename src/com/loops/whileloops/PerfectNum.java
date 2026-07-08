package com.loops.whileloops;

import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num :");
		int n=sc.nextInt();
		if(isperfect(n)){
			System.out.println(n+"is perfect number");
		}
		else {
			System.out.println(n+" is not a perfect number");
		}

	}

	 static boolean isperfect(int n) {
		boolean flag=false;
		int start=1;
		int sum=0;
		while(start<n) {
			if(n%start==0) {
				sum+=start;
			}
			start++;
		}
		if(sum==start) {
			flag=true;
		}
		return flag;
	}

}
