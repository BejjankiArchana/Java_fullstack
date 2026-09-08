package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestDemoColle1 {

	public static void main(String[] args) {
		Collection<String> names1=new ArrayList<>();
		
		names1.add("archana");//add method returns boolean true if inserted element sucessfully
		names1.add("prasad");
		names1.add("sivaji");
		names1.add("anusha");
		names1.add("anjamma");
		System.out.println(names1);
		Collection<String> names2=new ArrayList<>();
		names2.add("xbna");
		names2.add("nbvna");
		names2.add("abvnb");
		names2.add("bvcnb");
		names2.add("BASVM");
		System.out.println(names1);
		Collection<String> names=new ArrayList<>();
		names.addAll(names1);
		names.addAll(names2);
		System.out.println(names);
		names2.clear();
		System.out.println(names2);
		System.out.println(names.contains("archana"));//true
		System.out.println(names.containsAll(names1));//true
		System.out.println(names.containsAll(names2));//true
		names2.add("honey");
		System.out.println(names.containsAll(names2));//false
		
		



	}

}
