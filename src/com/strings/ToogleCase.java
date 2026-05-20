package com.strings;

import java.util.Scanner;

public class ToogleCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string to count:");
		String s=sc.nextLine();
		StringBuilder sb=new StringBuilder();
		for(char ch:s.toCharArray()) {
			
		
			if(Character.isUpperCase(ch)) {
				sb.append(Character.toLowerCase(ch));
				
			}
			else if(Character.isLowerCase(ch)){
				sb.append(Character.toUpperCase(ch));
			}
			else {
				sb.append(ch);
			}
		}
    System.out.println(sb);
    sc.close();
}
}