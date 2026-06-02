package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateRight {

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
		System.out.println("enter how many times to rotate");
		int k=sc.nextInt();
		
		int[]rotatedarr=rotate(arr,k);	
		System.out.println("using new array:"+Arrays.toString(rotatedarr));
		
		int[]rotated_arr_without_new_array=rotate_without_new_array(arr,k);
	System.out.println("without using new array:"+Arrays.toString(rotated_arr_without_new_array));
	}
	static int[] rotate(int[]arr,int k) {	
		int n=arr.length;
		k=k%n;
		int[]result=new int[arr.length];
		int index1=n-k;	
		for(int i=0;i<k;i++) {
			result[i]=arr[index1];
			index1++;
		}
		int index2=0;
		for(int i=k;i<n;i++) {
			result[i]=arr[index2];
			index2++;
		}
		return result;
		
		
	}
	static int[] rotate_without_new_array(int[]arr,int k) {
		int n=arr.length;
		k=k%n;
		reverse(arr,0,n-1);	
		reverse(arr,0,k-1);
		reverse(arr,k,n-1);
		
		return arr;
	}
	static int[] reverse(int[]arr,int start,int end) {
		int temp=0;
		
		while(start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
			
		}
		return arr;
	}
	
}
