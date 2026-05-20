package com.strings;

import java.util.Scanner;

public class ReversingEachWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string to reverse:");
		String s=sc.nextLine();
		
		String[]arr=s.split(" ");
		for(int i=0;i<arr.length;i++) {
			StringBuilder sb=new StringBuilder(arr[i]);
			sb.reverse();
			System.out.print(sb+" ");
		}
		
	}

}
