package com.collections.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurentHahMapEx {

	public static void main(String[] args) {
		Map<String,Integer>map=new ConcurrentHashMap<>();
		map.put("a",1);
		//map.put(null,2);//Exception in thread "main" java.lang.NullPointerException
		//null key not accepted
		//map.put("b",null);//Exception in thread "main" java.lang.NullPointerException
		//null value not accepted
		map.put("c",2);
		for(Entry<String,Integer>entry:map.entrySet()) {
			System.out.println(entry);
			map.put("d", 3);
		}
		System.out.println(map);
/*ConcurrentHashMap allows modification during iteration without throwing ConcurrentModificationException,
 *  but its iterator does not guarantee exactly what newly added entries will be observed.

 Why is it called "weakly consistent"?

Think of the iterator as taking a moving view of the map rather than a fixed snapshot.*/

	}

}
