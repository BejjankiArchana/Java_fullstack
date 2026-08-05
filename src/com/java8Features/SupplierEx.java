package com.java8Features;

import java.util.function.Supplier;

public class SupplierEx {

	public static void main(String[] args) {
		Supplier<Integer> s1=()->{
			int a=10;int b=20;
			int c=a+b;
			return c;
		};
		System.out.println(s1.get());

	}

}
