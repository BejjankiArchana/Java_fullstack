package com.arrays;

public class JaggedArray {

	public static void main(String[] args) {
		int[][]jaggedarr=new int[2][];
		 jaggedarr[0] = new int[3];
	     jaggedarr[1] = new int[2];
		jaggedarr[0][0]=12;
		jaggedarr[0][1]=34;
		jaggedarr[0][2]=67;
		
		jaggedarr[1][0]=10;
		jaggedarr[1][1]=37;
		for(int []arr:jaggedarr) {
			for(int i:arr) {
				System.out.print(i +" ");
				
			}
			System.out.println();
		}
		System.out.println();
		int[][]arr2= {{1,2,3},{1,2},{7,8,9,4}};
		for(int []arr:arr2) {
			for(int i:arr) {
				System.out.print(i +" ");
				
			}
			System.out.println();
		}
		
		
		
		

	}

}
