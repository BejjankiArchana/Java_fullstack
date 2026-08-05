package com.arrays;

public class LeadersofArray {

	public static void main(String[] args) {
		int[]arr= {16,17,4,3,5,2};
		int n=arr.length;
		int leader=arr[n-1];
		for(int i=n-1;i>=0;i--) {
			if(arr[i]>=leader) {
				leader=arr[i];
				System.out.print(leader+" ");
			}
			
		}
		

	}

 }
