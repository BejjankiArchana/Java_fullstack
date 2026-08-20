package com.collections.map;

import java.util.HashMap;
import java.util.Map.Entry;

public class HighestFreqChar {

	public static void main(String[] args) {
		String str = "aabbcchowaad";
		HashMap<Character, Integer> map = new HashMap<>();
		for (char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		
		char maxchar=' ';
		int maxfreq=0;
		for(Entry<Character, Integer> entry:map.entrySet()) {
			if(entry.getValue()>maxfreq) {
				maxfreq=entry.getValue();
				maxchar=entry.getKey();
				}
		}
		System.out.println("max char :"+maxchar);
		System.out.println("indices of max char :");
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==maxchar) {
				System.out.print(i+" ");
			}
		}
		
	}

}
