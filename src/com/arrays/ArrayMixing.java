package com.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayMixing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length first of array :");
		int l1=sc.nextInt();
		int[]arr1=new int[l1];
		System.out.println("enter elements of first array :");
		for(int i=0;i<l1;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("enter length of second array :");
		int l2=sc.nextInt();
		int[]arr2=new int[l2];
		System.out.println("enter elements second of array :");
		for(int i=0;i<l2;i++) {
			arr2[i]=sc.nextInt();
		}
		int lengthmax=Math.max(l1, l2);
		int lengthmin=Math.min(l1, l2);
		int index=0;
		
		int[]arr3=new int[(2*lengthmin)+(lengthmax-lengthmin)];
		for(int i=0;i<lengthmin;i++) {
			arr3[index]=arr1[i];
			index+=2;
		}
		index=1;
		for(int i=0;i<lengthmin;i++) {
			arr3[index]=arr2[i];
			index+=2;
		}
		index=2*lengthmin;
		if(l1>l2) {
			for(int i=lengthmin;i<l1;i++) {
				arr3[index]=arr1[i];
				index++;
			}
		}
		else if(l2>l1) {
			for(int i=lengthmin;i<l2;i++) {
				arr3[index]=arr2[i];
				index++;
			}
		}
		
		System.out.println("after mixing result :"+Arrays.toString(arr3)); 
		
		int[] arr4=new int[lengthmax];
		
		for(int i=0;i<lengthmin;i++) {
			arr4[i]=arr1[i]+arr2[i];
		}
		if(l1>l2) {
			for(int i=lengthmin;i<lengthmax;i++) {
				arr4[i]=arr1[i];
			}
		}
		else if(l2>l1) {
			for(int i=lengthmin;i<lengthmax;i++) {
				arr4[i]=arr2[i];
			}
			
		}
		
		
		
		
		System.out.println("after adding both arrays result :"+Arrays.toString(arr4));		

	}

	}

