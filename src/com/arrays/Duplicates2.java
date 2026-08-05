package com.arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Duplicates2 {

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
		int[] result=removeduplicates(arr);
		System.out.println(Arrays.toString(result));
		int[]result2=removeduplicates_sorted(arr);
		System.out.println(Arrays.toString(result2));
		

	}
	static int[] removeduplicates(int[]arr) {
	//this work with both sorted and unsorted arrays
		//Time  -> O(n) Space -> O(n) two pointer techinique is effective
		//if you dont want to print array	
		Set<Integer>set=new LinkedHashSet<>();
		for(int i:arr) {
			set.add(i);			
		}
		int index=0;
		int[]result=new int[set.size()];
		for(int i:set) {
			result[index]=i;
			index++;
		}
		return result;
	}
	static int[] removeduplicates_sorted(int[]arr) {
	//this works with sorted array only	
		
	Arrays.sort(arr);
		int count=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=arr[i-1]) {
				count++;			
			}
			}
			int[]result1=new int[count];
			//this is two pointer approach
			int j=1;
			result1[0]=arr[0];
			for(int i=1;i<arr.length;i++) {
				if(arr[i]!=arr[i-1]) {
					result1[j]=arr[i];
					j++;
				}
				
			}
			return result1;
		}
	}
	


