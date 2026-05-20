package com.strings;

import java.util.Scanner;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class DuplicateCharacters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string to count:");
		String s=sc.nextLine();
		List<Character>arr=new ArrayList<>();
		
		Map<Character,Integer>map=new LinkedHashMap<>();
		for(char ch:s.toCharArray()) {
			map.put(ch,map.getOrDefault(ch,0)+1);
		}
		//System.out.println(map);
		
		//map foeEachloop using lambda function
		map.forEach((key,value)->{
			//if(value>1) {
				//arr.add(key);
				//non repeating letters
			//System.out.print(key);
			
			System.out.print(key+""+value);
			
			
			//else {
				//repeating letters
				//System.out.println(key);
			//}
			
		});
		//System.out.println("first non repeating: "+arr.get(0));
		

	}

}
