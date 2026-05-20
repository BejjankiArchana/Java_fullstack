package com.strings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string to check:");
		String s=sc.next();
		StringBuilder sb=new StringBuilder(s);
		
		sb.reverse();
		
		if(s.equals(sb.toString())) {
			System.out.println(s+" is a palindrome");
		}
		else {
			System.out.println(s+" is not a palindeome");
		}
		

	}

}
