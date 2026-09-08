package com.collections.map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableEx {

	public static void main(String[] args) {
		Hashtable<String,String>map=new Hashtable<>();
		map.put("a","apple");
		//map.put(null,"apple");//Exception in thread "main" java.lang.NullPointerException: 
		//Cannot invoke "Object.hashCode()" because "key" is null
		//null key not allowed
		//map.put("b",null);//Exception in thread "main" java.lang.NullPointerException
		//at java.base/java.util.Hashtable.put(Hashtable.java:475)
		//null value also not supported
		//map.put("c",null);
		System.out.println(map);

	}

}
