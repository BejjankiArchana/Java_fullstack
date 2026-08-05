package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		int[]arr= {1,2,3,4,5,6,7,8};
		System.out.println("after rotation :"+Arrays.toString(arr));
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of times to rotate :");
		int r=sc.nextInt();
		r=r%(arr.length);
		rotatearray(arr,r);
		System.out.println("after rotation :"+Arrays.toString(arr));
		

	}

	 static void rotatearray(int[] arr, int r) {
		int start=0;
		int end=arr.length-1;
		reversearr(arr,start,end);
		reversearr(arr,start,r-1);
		reversearr(arr,r,end);
		
		
	}

	  static void reversearr(int[] arr, int start, int end) {
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
			
		}
		
	 }

}
