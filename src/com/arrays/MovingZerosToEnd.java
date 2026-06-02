package com.arrays;

import java.util.*;

public class MovingZerosToEnd {

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
		int index=0;
		for(int i=0;i<n;i++) {
			int num=arr[i];
			if(num!=0) {
				arr[index]=num;
				index++;
			}
			
		}
		while(index<n) {
			arr[index]=0;
			index++;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
