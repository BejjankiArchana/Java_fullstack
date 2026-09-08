package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx1 {

	public static void main(String[] args) {
//retainAll() keeps only the elements that are common between two collections.
//Arrays.asList() returns a fixed-size list backed by the original array.

//retainAll() may need to remove elements (apple and orange), 

//but this list does not support removal.Therefore:
		List<String> fruits=new ArrayList<>(Arrays.asList("apple","banana","mango","orange"));
		List<String> veggiess=new ArrayList<>(Arrays.asList("tomato","banana","mango","chilli"));
		System.out.println(fruits);
		System.out.println(veggiess);
		System.out.println(fruits.retainAll(veggiess));//true
		System.out.println(fruits);//common elements between 2 lists(banana, mango)
		
		//sublist(start index,end index)->startIndex included, endIndex Excluded
		//operations performed on sublist effected on main list also
		List<Integer>l1=new ArrayList<>();
		l1.add(0);
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		List<Integer>sl=l1.subList(2, 4);
		System.out.println(l1);//[0, 1, 2, 3, 4, 5]
		System.out.println(sl);//[2, 3]
		sl.add(6);
		sl.add(7);
		System.out.println(l1);//[0, 1, 2, 3, 6, 7, 4, 5]
		System.out.println(sl);//[2, 3, 6, 7]
		System.out.println(sl.size());
		sl.remove(3);//2 is index
		sl.remove(2);//3 is index
		System.out.println(l1);//[0, 1, 2, 3, 6, 7, 4, 5]
		System.out.println(sl);
	}

}
