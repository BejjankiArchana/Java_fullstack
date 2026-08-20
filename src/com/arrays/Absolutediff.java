package com.arrays;

public class Absolutediff {

	public static void main(String[] args) {
		int[]arr= {19,1,26,5,3,18,25};
		int mindiff=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int diff=Math.abs(arr[i]-arr[j]);
						mindiff=Math.min(mindiff, diff);
			}
			
		}
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int diff=Math.abs(arr[i]-arr[j]);
				if(diff==mindiff) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
			
		}

	}

}
