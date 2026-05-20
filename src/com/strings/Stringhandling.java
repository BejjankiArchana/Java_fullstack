package com.strings;
import java.util.*;



public class Stringhandling {
	 

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string to check:");
		String s=sc.next();
		//vowels
List<Character>vowels=Arrays.asList('a','e','i','o','u','A','E','I','O','U');
			int vowel=0;
			int conso=0;
			for(char ch:s.toCharArray()) {
				if(vowels.contains(ch)) {
					vowel++;
				}
				else {
					conso++;
				}
			}
			System.out.println(vowel);
			System.out.println(conso);
		
      
}
}