package com.arrays;

public class ArrayPatterns1 {

	public static void main(String[] args) {
		int[][]arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		for(int i=0;i<arr.length;i++) {
			if(i%2!=0) {
				for(int j=arr[i].length-1;j>=0;j--) {
					System.out.print(arr[i][j]+" ");
				}
			}
			else {
			for(int j=0;j<4;j++) {
				System.out.print(arr[i][j]+" ");
			}
			}
			System.out.println();
		}
		System.out.println();
		int[][]arr2= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<arr2.length;i++) {
			
				for(int j=0;j<arr2[i].length;j++) {
					if(i==j || (i+j==arr2.length-1)) {
						System.out.print(arr2[i][j]+" ");
					}
					else {
						System.out.print(" ");
					}
				}
				
				System.out.println();
		}
		System.out.println();
		int[][]arr3= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3[i].length;j++) {
				if(j==0||j==arr3[i].length-1||i==0||i==arr3.length-1) {
					System.out.print(arr3[i][j]+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<arr3.length;i++) {
		for(int j=0;j<arr3[i].length;j++) {
			if((i>0) &&(i<arr3.length-1)&&(j!=arr3[i].length-1)) {
				
			}
			else {
				System.out.print(arr3[i][j]+" ");
			}
			if(i==arr3.length-1) {
				
			}
		   }
		}
		
		}

	}

