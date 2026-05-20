package com.strings;

import java.util.Scanner;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a sentance to remove special char:");
		String s=sc.nextLine();
		StringBuilder sb=new StringBuilder();
		for(char ch:s.toCharArray()) {
			if(Character.isAlphabetic(ch)||Character.isDigit(ch)) {
				sb.append(ch);
			}
		}
		System.out.println(sb);
		

	}

}
