package com.collections;

import java.util.ArrayList;

import java.util.List;
import java.util.ListIterator;

public class ListEx3 {

	public static void main(String[] args) {
		List<Integer>l1=new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		//Iterator is a cursor
		//Iterator is universal means it work with all types of collections
		//ListIterator is bidirectional both hasnext() and has previous() 
		//but if you want to use hasprevious() first you need to use has next()
		// and after setting cursor at bottom then you have has previous()	
//if cursor is at top then no previous element so you need to use both if you want reverse order
		ListIterator<Integer> itr=l1.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("------------");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
		
	}

}
