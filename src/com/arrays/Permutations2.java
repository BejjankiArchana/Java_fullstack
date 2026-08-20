package com.arrays;

import java.util.Arrays;

public class Permutations2 {

	public static void main(String[] args) {
		int[]arr= {1,2,3};
		int[]result=new int[arr.length];
		combinations(arr,0,result,0);
		

	}
	static void combinations(int[]arr,int start,int[]result,int index) {
		System.out.println(Arrays.toString(Arrays.copyOf(result, index)));
		for(int i=start;i<arr.length;i++) {
			result[index]=arr[i];
			combinations(arr,i+1,result,index+1);
			
		}
	}

}
