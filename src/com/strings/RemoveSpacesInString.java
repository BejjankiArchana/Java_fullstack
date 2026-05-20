package com.strings;

import java.util.Scanner;

public class RemoveSpacesInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String s=sc.nextLine();
		StringBuilder sb=new StringBuilder(s);
		for(int i=0;i<sb.length()-1;i++) {
			if(sb.charAt(i)==' ') {
				sb.deleteCharAt(i);
				
			}
			
		}
		sc.close();
		System.out.println(sb);
			
		}
			

	}


