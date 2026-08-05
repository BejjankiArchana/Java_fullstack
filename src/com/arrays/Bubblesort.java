package com.arrays;
//Bubble Sort repeatedly compares adjacent elements and swaps them if they are in the wrong order.

//After every pass, the largest element moves to the end, just like an air bubble rises to the surface.
//for every pass compare adjacent elements
//if left > right swap them

import java.util.Arrays;
import java.util.Scanner;

public class Bubblesort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array: ");
		int n=sc.nextInt();
		System.out.println("Enter elements of array: ");
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int temp=0;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));

	}

}
