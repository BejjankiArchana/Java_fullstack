package com.collections.map;

import java.util.IdentityHashMap;
import java.util.Map;

public class Identity_hashmap_ex {
//this IdentityHashMap compare keys with == operator not with hashcode()+equals()->like as normal HashMap

	public static void main(String[] args) {
		Map<String,String>map=new IdentityHashMap<>();
		String s1="java";
		String s2="java";
		map.put(s1, "is tough");
		map.put(s2, "is simple");
		System.out.println(map);//{java=is simple} both s1,s2 have same address
		
			Map<String,String>map1=new IdentityHashMap<>();
			String s3=new String("java");
			String s4=new String("java");
			map1.put(s3, "is tough");
			map1.put(s4, "is simple");
			System.out.println(map1);//{java=is simple, java=is tough}//different address for s3,s4

	}

}
