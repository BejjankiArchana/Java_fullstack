package com.arrays;

import java.util.Arrays;

//Insertion Sort works like arranging playing cards in your hand.
//It takes one element at a time and inserts it into its correct position in the already sorted part of the array.
//Assume first element is sorted
//Take next element
//Move larger elements one position right
//Insert element into correct position
public class InsertionSort {

	public static void main(String[] args) {
		int[]arr= {20,10,50,30,40,2};
		for(int i=1;i<arr.length;i++) {
			int key=arr[i];
			int j=i;
			while(j>0 && arr[j-1]>key) {
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=key;
		}
      System.out.println("after sorting :"+Arrays.toString(arr));
	}

}
