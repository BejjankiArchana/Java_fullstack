package com.arrays;

import java.util.Scanner;

public class Arraypatterns2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows: ");
		int r=sc.nextInt();
		System.out.println("Enter no of columns: ");
		int c=sc.nextInt();
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(i==j || i+j==r-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		

	}

}
