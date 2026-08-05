package com.java8Features;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

interface in8{//this is not functional interface bcz it has more than 1 abstract method
	void print();
	void show();
}
@FunctionalInterface
interface in9{//this is functional interface bcz it has abstract method
	//functional interface can have any no of default and static methods but 1 abstract method
	void m1();
	default void method1() {
		System.out.println("method 1 called");
	}
	static int add(int a,int b) {
		return a+b;
	}
	//@FunctionalInterface in10 is not a functional interface bcz it is inherited from in9
	//even it has 1 abstract method in9 abstract method also available in in10 so not a FI(functional interface)
	//if i remove in10 abstract method then only 1 in9 abstract method so it is FI
	interface in10 extends in9{
		  void mymethod();
	}
}

public class FunctionalInterface1 {

	public static void main(String[] args) {
		List<Integer> arr=Arrays.asList(10,3,20,4,40);
		Comparator<Integer> c=(i1,i2)->(i1<i2) ? -1 :(i1>i2)? 1 : 0;
		Collections.sort(arr,c);
		System.out.println(arr);
		

	}

}
