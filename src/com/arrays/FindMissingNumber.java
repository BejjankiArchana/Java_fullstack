package com.arrays;

import java.util.Scanner;

public class FindMissingNumber {
//Array contains numbers from 1 to n with one missing.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array: ");
		int n=sc.nextInt();
		if (n <= 0) {
            System.out.println("n should be grater than 0");
            return;
        }
		System.out.println("Enter elements of array: ");
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int m=missing(arr);
			System.out.println("misssing number found :"+m);
		

	}
	static int missing(int[]arr) {
		
		int n=arr.length+1;
		int expected_sum=n*(n+1)/2;
		int current_sum=0;
		for(int i:arr) {
			current_sum+=i;
		}
		
		return expected_sum-current_sum;
		
	}

}
