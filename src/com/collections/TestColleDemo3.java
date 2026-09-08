package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestColleDemo3 {

	public static void main(String[] args) {
		//size()-->gives size of given collection
		Collection<Integer>c1=new ArrayList<>();
		c1.add(20);
		c1.add(78);
		c1.add(36);
		System.out.println(c1.size());
		//idEmpty()--> check whether collection is empty or not
		System.out.println(c1.isEmpty());
		//in collections iterating is done in two ways 
		//1.using Iterator
		//hasNext()-->Boolean return value
		//next()-->int return value
		Iterator<Integer>itr=c1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}//2.using for each loop
		System.out.println("----------------------------");
		for(Integer c:c1) {
			System.out.println(c);
		}
		//compared to for each iterator is best
		//For simply reading/printing elements, for-each is usually better because it is shorter and easier to read.

//Why use Iterator?

//The main advantage is that you can safely remove elements while iterating.
	/*ex:   Iterator<Integer> itr = c1.iterator();
                 while (itr.hasNext()) {
                         Integer num = itr.next();
                                  if (num % 2 == 0) {
                                      itr.remove();
                                    }
                           }*/
		//with for each loop
		/*for (Integer num : c1) {
               if (num % 2 == 0) {
               c1.remove(num);   // ❌ Problem
              }*///this causes ConcurrentModificationException
		
		

	}

}
