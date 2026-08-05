package com.arrays;

import java.util.Scanner;

public class ArraysEvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array :");
		int l=sc.nextInt();
		int[]ar1=new int[l];
		System.out.println("enter elements of array :");
		for(int i=0;i<l;i++) {
			ar1[i]=sc.nextInt();
		}
		int evencount=0;
		int oddcount=0;
		for(int i:ar1) {
			if(i%2==0) {
				evencount++;
			}
			else {
				oddcount++;
			}
			
		}
		System.out.println("no of even elements :"+evencount);
		System.out.println("no of odd elements :"+oddcount);
		System.out.println("enter element to search :");
		int pos=0;
		boolean flag=false;
		int ele=sc.nextInt();
		for(int i=0;i<l;i++) {
			if(ele==ar1[i]) {
				pos=i;
				flag=true;
				break;
			}	
		}
		if(flag==true) {
			System.out.println("element found at posistion :"+pos);
		}
		else {
			System.out.println("element  not found ");
		}
		
		

	}

}
