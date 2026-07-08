package com.loops.forloop;

import java.util.Scanner;

public class TestLoops2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a range :");
		int n=sc.nextInt();
		//int no_of_evens= noOfEvens(n);
		//System.out.println(no_of_evens+" no of  evens between 1 to "+n);
		//divisibleby3and5(n);
		perfectnums(n);
		//System.out.println("main method end");

	}
	
static void perfectnums(int n) {
	int sum;
		
		for(int i=1;i<=n;i++) {
			sum=0;
			int num=i;
			for(int j=1;j<num;j++) {
				if(num%j==0) {
					sum+=j;
				}
				
			}
			if(sum==num) {
				System.out.println(num);
			}
			
		}			
	}
static int noOfEvens(int n) {
	int count=0;
	for(int i=0;i<=n;i++) {
		if(i%2==0) {
			count++;
		}
	}
	return count;
	
}
static void divisibleby3and5(int n) {
	
	for(int i=0;i<=n;i++) {
		if(i%3==0 && i%5==0) {
			System.out.println(i);
		}
	}
	
	
}

}
