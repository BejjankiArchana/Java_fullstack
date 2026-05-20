package com.strings;

import java.util.Scanner;

public class FindingAllSubstrings {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string :");
		String s=sc.next();
		int n=s.length();
		//char[]arr=s.toCharArray();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<=n;j++) {
				System.out.println(s.substring(i,j));
			}
		}

	}

}
