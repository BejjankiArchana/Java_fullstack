package com.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {
		Map<String,String>map=new HashMap<>();
		map.put("tg", "telangana");
		map.put("ap", "andhrapradesh");
		map.put("kr", "karnataka");
		map.put("up", "uttarpradesh");
		map.put("kl", "kerala");
		System.out.println(map.containsKey("tg"));
		System.out.println(map.containsValue("kerala"));
		System.out.println(map.get("kr"));//you need to send key you will get value
		//no method to get key if you send value
		
		//map.put() Returns:
		//the previous value associated with key , or null if there was no mapping for key
		// If the map previously contained a mapping for the key,
		//the old value is replaced by the specified value.
		System.out.println(map.put("sr", "srilanka"));//null
		System.out.println(map.put("ap", "andhra"));//andhrapradesh
		System.out.println(map);
		
		
		System.out.println(map.keySet());//give set of all keys
		System.out.println(map.values());//give collection of all values not set because duplicates allowed in values
		System.out.println(map.entrySet());//gives set of all entries
		
		Set<Entry<String,String>>entries=map.entrySet();
		//iterate over map
		for(Entry<String,String> entry:entries) {
			System.out.println(entry.getKey()+"->"+entry.getValue());
			//or
			//System.out.println(entry);
		}
		

	}

}
