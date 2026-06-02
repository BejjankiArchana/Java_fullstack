package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of first array: ");
		System.out.println("Enter length of second array: ");
		int n=sc.nextInt();
		int m=sc.nextInt();
		if (n <= 0 && m<=0) {
            System.out.println("n,m should be grater than 0");
            return;
        }
		System.out.println("Enter elements of first array: ");
		int[]arr1=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter elements of second array: ");
		int[]arr2=new int[m];
		for(int i=0;i<m;i++) {
			arr2[i]=sc.nextInt();
		}
		
 System.out.println(Arrays.toString(merge_and_sort(arr1,arr2)));
	}
	static int[] merge_and_sort(int[]arr1, int[]arr2){
		int length=arr1.length+arr2.length;
		int[]merge_array=new int[length];
		for(int i=0;i<arr1.length;i++) {
			merge_array[i]=arr1[i];
		}
		int index=0;
		for(int i=arr1.length;i<length;i++) {
			merge_array[i]=arr2[index];
			index++;
		}
		Arrays.sort(merge_array);
		
		return merge_array;
		
	}

}
