package com.strings;

import java.util.Scanner;

public class CountUppercaseLowercase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a sentance to count :");
		String s=sc.nextLine();
		int upper=0;
		int lower=0;
		int digit=0;
		int special=0;
		//StringBuilder sb=new StringBuilder();
		for(char ch:s.toCharArray()) {
			
			if(Character.isUpperCase(ch)) {
				upper++;
			}
		else if(Character.isLowerCase(ch)) {
				lower++;
			}
			else if(Character.isDigit(ch)) {
				digit++;
			}
			else {
				special++;
		}
		

	}
		System.out.println("upper :"+upper);
		System.out.println("lower :"+lower);
		System.out.println("digit :"+digit);
		System.out.println("special :"+special);

	}
	
}
