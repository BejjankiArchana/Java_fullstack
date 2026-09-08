package com.arrays;

import java.util.Scanner;

public class NthLargest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array ");
		int n=sc.nextInt();
		System.out.println("enter elements of array");
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("enter k");
		int k=sc.nextInt();
		int largest=Integer.MAX_VALUE;
		
		
		for(int j=0;j<k;j++) {
			int nextlarge=Integer.MIN_VALUE;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]<largest && arr[i]>nextlarge) {
					nextlarge=arr[i];
				}
				
			}
			largest=nextlarge;
			
		
	}
		System.out.println(largest);
		

	}

}
