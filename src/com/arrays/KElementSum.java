package com.arrays;

import java.util.Arrays;
import java.util.Scanner;
//input //[1 3 6 2 4]
//output// next k element sum suppose k=2;
//output=//9,8,6,5,4 assume array is circular
public class KElementSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array ");
		int n=sc.nextInt();
		System.out.println("enter elements of array");
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		//[1 3 6 2 4]
		System.out.println("enter k");
		int k=sc.nextInt();
		int[]newarr=new int[n];
		int sum=0;
		for(int i=1;i<=k;i++) {
			sum+=arr[i];
		}
		newarr[0]=sum;
		for(int i=1;i<n;i++) {
			sum=sum-arr[i]+arr[(i+k)%n];
			newarr[i]=sum;
		}
		System.out.println(Arrays.toString(newarr));

	}

}
