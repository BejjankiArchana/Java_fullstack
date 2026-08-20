package com.arrays;

import java.util.Scanner;

//Input:
//[ 1   2   3   4 ]
//[ 5   6   7   8 ]
//[ 9  10  11  12 ]
//[ 13 14  15  16 ]

//Output:
//[ 16   3   2   1 ]
//[ 10  36  14  16 ]
//[ 12  11 100   9 ]
//[ 26  28  30 256 ]
public class TwoDArrayZigZag {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of rows or colums of square matrix :");
		int n=sc.nextInt();
		int[][]arr=new int[n][n];
		System.out.println("enter elements of array:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			if(i%2!=0) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					arr[i][j]=arr[i][j]*arr[i][j];
				}
				System.out.print(arr[i][j]+" ");
			}
			}
			else {
				
				for(int j=n-1;j>=0;j--) {
					if(i+j==n-1) {
						arr[i][j]=arr[i][j]*arr[i][j];
					}
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}

	}

}
