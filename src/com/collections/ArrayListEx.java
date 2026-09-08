package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		List<Integer>arr=Arrays.asList(10,20,30,40,50);
		//arr.add(60);//runtime error java.lang.UnsupportedOperationException because 
		//Arrays.asList gives fixed size array similarly remove is also not posible
		
		arr.set(0, 15);//set operation is permitted on array list
		System.out.println(arr);
		//then what to do
		List<Integer>arr1=new ArrayList <>( Arrays.asList(10,20,30,40,50));
		//now you can add or remove
		arr1.add(60);
		System.out.println(arr1);
		
		}

}
