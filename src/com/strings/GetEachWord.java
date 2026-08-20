package com.strings;

import java.util.Scanner;

//Input: "Java is simple"
//Output:Java - (0, 3)is - (5, 6)simple - (8, 13)

public class GetEachWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String :");
		String s=sc.nextLine();
		int startindex=0;
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i) == ' ') {
				int endindex=i-1;
				
				
				System.out.print(s.substring(startindex,i)+"-("+startindex+","+endindex+")");
				startindex=i+1;
			}
			
			else if(i==s.length()-1) {
				int endindex=i;
				System.out.print(s.substring(startindex,i)+"-("+startindex+","+endindex+")");
			}
			
		}
		
sc.close();
	}

}
