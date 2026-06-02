package com.arrays;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array: ");
		int n=sc.nextInt();
		if (n < 2) {
            System.out.println("Second largest not possible");
            return;
        }
		System.out.println("Enter elements of array: ");
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int largest=Integer.MIN_VALUE;
		int secondlargest=Integer.MIN_VALUE;
		
		for(int i:arr) {
			if(i>largest) {
				secondlargest=largest;
				largest=i;
			}else if(i>secondlargest && i!= largest) {
				secondlargest=i;
			}
		}
		
		if (secondlargest == Integer.MIN_VALUE) {//if all elements equal 
			//then second largest does not update 
            System.out.println("No second largest element");
        } else {
            System.out.println("Second largest: " + secondlargest);
        }

       sc.close();
	}

}
