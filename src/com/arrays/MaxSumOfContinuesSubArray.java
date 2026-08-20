package com.arrays;

public class MaxSumOfContinuesSubArray {

	public static void main(String[] args) {
		int[]arr= {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		//brute force methodology
		int max_sum=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=0;
			
			for(int j=i;j<arr.length;j++) {
				sum+=arr[j];
				
				max_sum=Math.max(max_sum, sum);
			}
		}
		System.out.println(max_sum);
		//Kadane's Algorithm:
		int currentSum = arr[0];
		int maxSum = arr[0];

		for (int i = 1; i < arr.length; i++) {
		    currentSum = Math.max(arr[i], currentSum + arr[i]);
		    maxSum = Math.max(maxSum, currentSum);
		}
		System.out.println(max_sum);
	}

}

