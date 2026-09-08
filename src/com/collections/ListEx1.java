package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {

	public static void main(String[] args) {
		//if you provide data type then only that type of data is allowed
		//if you dont provide specific type any kind of data accepted
		List<Integer>l1=new ArrayList<>();
		l1.add(10);
		l1.add(20);
		List l2=new ArrayList<>();
		l2.add(10);
		l2.add("archana");//any type of data is accepted
		//list is based on shifting index if you insert in middle
		List<Integer>l3=new ArrayList<>();
		//list allows any no of null values
		//list allows duplicate values
		//list preserve insertion order
		//list allow homogeneous as well as heterogeneous types
		l3.add(10);
		l3.add(20);
		l3.add(null);
		l3.add(null);
		l3.add(10);
		l3.add(3,13);
		l3.add(2,32);
		
		System.out.println(l3);//10,20,32,null,13,null,10
		//l3.add(10,25);
		//gives index out of bounds exception because 
		//l3 size is 7 and you are adding at 10th posistion
		
		
		

	}
 
}
