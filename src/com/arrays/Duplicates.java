package com.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Duplicates {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array: ");
		int n=sc.nextInt();
		if (n <= 0) {
            System.out.println("n should be grater than 0");
            return;
        }
		System.out.println("Enter elements of array: ");
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
        int index=0;
        for(int i=1;i<n;i++) {
        	if(arr[i]!=arr[index]) {
        		index++;
        		arr[index]=arr[i];
        	}
        }
        //here index store the index if last unique element to get length of new array 
        //length is last element index+1 so index+1 gives new length
        //but you can not print the new unique array because array size is fixed in this case we just 
        //moved unique elements to front and ignored the rest elements 
		System.out.println("new length :"+(index+1));
		
	}

}
