package com.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class FreqEachChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.next();
		Map<Character,Integer>map=new HashMap<>();
		for(char ch:s.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		//highest freq character
		int maxval=0;
		char maxchar=' ';
		for(Entry<Character,Integer>entry:map.entrySet()) {
			if(entry.getValue()>maxval) {
				maxval=entry.getValue();
				maxchar=entry.getKey();
			}
		}
		//highest freq character
		System.out.println(maxval);
		System.out.println(maxchar);
		
		sc.close();

	}

}
