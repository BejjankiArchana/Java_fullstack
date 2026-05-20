package com.strings;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class FrequencyOfEachChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string to count:");
		String s=sc.nextLine();
		Map<Character,Integer>map=new LinkedHashMap<>();
		for(char ch:s.toCharArray()) {
			map.put(ch,map.getOrDefault(ch,0)+1);
		}
		System.out.println(map);
		}

	}


