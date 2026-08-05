package com.arrays;
//Given an array of integers, move all negative numbers to the beginning while preserving the 
//relative order of both negative and positive numbers.

import java.util.Arrays;
import java.util.Scanner;

public class MoveNegativetoEnd {

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
		int[]arr2=new int[n];
		int index=0;
		for(int i=0;i<n;i++) {
			if(arr[i]<0) {
				arr2[index]=arr[i];
				index++;
			}
		}
		for(int i=0;i<n;i++) {
			if(arr[i]>=0) {
				arr2[index]=arr[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(arr2));
		

	}

}
