package com.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  two strings to check:");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		if(s1.length()!=s2.length()) {
			System.out.println("not annagram");
		}
		
		else if(s1.length()==s2.length()) {
    	 char[] arr1=s1.toLowerCase().toCharArray();
    	 char[] arr2=s2.toLowerCase().toCharArray();
    	 Arrays.sort(arr1);
    	 Arrays.sort(arr2);
    	 if(Arrays.equals(arr1,arr2)) {
    		 
    		 
    		 System.out.println("anagram");
    	 }
    	 else {
    		 
    		 System.out.println(" not anagram");
    		 
    	 }
    	 
     }
     
	}

}
