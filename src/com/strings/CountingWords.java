package com.strings;

import java.util.Scanner;

public class CountingWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string to count:");
		String s=sc.nextLine();
		//StringBuilder sb=new StringBuilder(s);
		int count=0;
		String[]arr=s.split(" ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			count++;
		}
		
		System.out.println("number of words : "+count);
	}

}
