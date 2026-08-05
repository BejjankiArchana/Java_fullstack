package com.arrays;
//Find the smallest element from the unsorted part and place it at the beginning.
//Every pass places one minimum element in its correct position.
//Repeat
//Find minimum element
//Swap with first unsorted element

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array: ");
		int n=sc.nextInt();
		System.out.println("Enter elements of array: ");
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("before sorting :"+Arrays.toString(arr));
		for(int i=0;i<n-1;i++) {
			int minindex=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[minindex]) {
					minindex=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[minindex];
			arr[minindex]=temp;
			
			
		}
		System.out.println("after sorting :"+Arrays.toString(arr));

	}

}
