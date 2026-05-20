package com.strings;

import java.util.Scanner;

public class LongestWordInSentance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a sentance:");
		String s=sc.nextLine();
		int maxlength=0;
		String longword="";
		String[]words=s.split(" ");
		for(String st:words) {
			int len=st.length();
			if(len>maxlength) {
				maxlength=len;
				longword=st;
			}
			
		}
		
		System.out.println(longword);
	}

}
