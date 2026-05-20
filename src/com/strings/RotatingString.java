package com.strings;

import java.util.Scanner;

public class RotatingString {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string to count:");
		String s=sc.nextLine();
		StringBuilder sb=new StringBuilder(s);
		int n=sb.length();
		for(int i=0;i<2;i++) {
			//sb.append(sb.charAt(i));
			sb.deleteCharAt(0);	
			
		}
		for(int i=0;i<2;i++) {
			//sb.append(sb.charAt(i));
			sb.append(s.charAt(i));	
		}
		System.out.println(sb);
		
	}

}
