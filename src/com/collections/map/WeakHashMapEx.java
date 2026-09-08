package com.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
class Student{
	@Override
	public String toString() {
		return "Student";
	}
}

public class WeakHashMapEx {
//The WeakHashMap key is held weakly, so the object can be garbage collected.

	public static void main(String[] args) {
		Map<Student,String>map=new HashMap<>();
		Student s=new Student();
		map.put(s, "hii");
		s=null;//Here, HashMap holds a strong reference to s through the key.
		System.gc();
//the Student object will not become eligible for garbage collection, because the HashMap still references it.
		System.out.println(map);//{Student=hii}
		Map<Student,String>map1=new WeakHashMap<>();
		Student s2=new Student();
		map1.put(s2, "hii");
		System.out.println(map1);//{Student=hii}
		s2=null;
		 System.gc();
		
		System.out.println(map1);//{}

	}

}
