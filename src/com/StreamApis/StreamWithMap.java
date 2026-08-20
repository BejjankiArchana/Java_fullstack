package com.StreamApis;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamWithMap {

	public static void main(String[] args) {
		//Find the first non-repeated character in a string
        String s="swiss";
        
    char ch= s.chars().
        mapToObj(c->(char)c)
        .collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting())).
        		entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
        		System.out.println(ch);
        		//print each character with ferquency
        		String s2="programming";
        		Map<Character,Long>freqmap=s2.chars().
        				mapToObj(c->(char)c).
        				collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()));
        		
        		System.out.println(freqmap);
        		//Find duplicate characters in a string
        		List<Character>duplicates=s2.chars().
        				mapToObj(c->(char)c).
                     collect(Collectors.groupingBy(c->c,HashMap::new,Collectors.counting())).
                     entrySet().
                     stream().
                     filter(entry->entry.getValue()>1).
                     map(Map.Entry::getKey).
                     collect(Collectors.toList());
        		System.out.println(duplicates);
        		//most frequently occured character
        	char highfreqchar=s2.chars().
        		mapToObj(c->(char)c).
        		collect(Collectors.groupingBy(c->c,HashMap::new,Collectors.counting())).
        		entrySet().
        		stream().
        		max(Map.Entry.comparingByValue()).
        		get().
        		getKey();
        	System.out.println(highfreqchar);
	}

}
