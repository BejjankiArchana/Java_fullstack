package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array: ");
		int n=sc.nextInt();
		System.out.println("Enter element to search in array: ");
		int target=sc.nextInt();
		System.out.println("Enter elements of array: ");
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		boolean index=false;
		int posistion=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==target) {
				posistion=i;
				index=true;
				break;
			}
		}
		if(index==true) {
		System.out.println("element found at index:"+posistion);}
		else {
			System.out.println("element not found ");
		}
		//clone() creates an exact duplicate with the same size,
		//while Arrays.copyOf() allows resizing the
		//new array and is more flexible.
		int[]copy=Arrays.copyOf(arr, 3);//copying an array up given range
		int[]clone=arr.clone();
		System.out.println(Arrays.toString(copy));
		System.out.println(Arrays.toString(clone));

	}

}
