package com.arrays;

import java.util.Scanner;

//input:n=5
//Output:
//1
//6 4
//8 9 10
//16 15 14 12
//18 20 21 22 24

public class ZigZagOfCompositeNums {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number :");
		int n=sc.nextInt();
		int start=1;
		for(int row=1;row<=n;row++) {
			int[]arr=new int[row];
			int index=0;
			while(index<row) {
				if(!isprime(start)) {
					arr[index]=start;
					index++;
				}
				start++;
			}
			if(row%2!=0) {
				for(int i=0;i<arr.length;i++) {
					System.out.print(arr[i]+" ");
				}
			}
			else {
				for(int i=arr.length-1;i>=0;i--) {
					System.out.print(arr[i]+" ");
				}
			}
			System.out.println();
		}
		

	}
	static boolean isprime(int n){
		boolean flag=true;
		if(n==0 || n==1) {
			flag=false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag=false;
				break;
			}
			
		}
		return flag;
		
	}

}
