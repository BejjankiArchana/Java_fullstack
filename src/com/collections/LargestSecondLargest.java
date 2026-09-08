package com.collections;

import java.util.Arrays;
import java.util.List;

public class LargestSecondLargest {

	public static void main(String[] args) {
		List<Integer>arr=Arrays.asList(10,40,30,50,20);
		int largest=Integer.MIN_VALUE;
		for(int i=0;i<arr.size()-1;i++) {
			if(arr.get(i)<arr.get(i+1)) {
				largest=Math.max(largest, arr.get(i+1));
			}else {
				largest=Math.max(largest, arr.get(i));
			}
		}
		System.out.println(largest);
		int secondlargest=Integer.MIN_VALUE;
		for(int i=0;i<arr.size()-1;i++) {
			if(arr.get(i)<arr.get(i+1)) {
				if(arr.get(i+1)!=largest) {
				
				secondlargest=Math.max(secondlargest, arr.get(i+1));}
			}else {
				if(arr.get(i)!=largest) {
				secondlargest=Math.max(secondlargest, arr.get(i));}
			}
		}
		System.out.println(secondlargest);
		
		//simple way
		
		for(int num:arr) {
			if(num > largest) {
				secondlargest=largest;
				largest=num;
			}else if(num >secondlargest && num!=largest) {
				secondlargest=num;
				
			}
			
		}
		System.out.println(largest);
		System.out.println(secondlargest);
		

	}

}
