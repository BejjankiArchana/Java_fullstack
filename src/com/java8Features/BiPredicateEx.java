package com.java8Features;

import java.util.function.BiPredicate;

public class BiPredicateEx {

	public static void main(String[] args) {
		BiPredicate<Integer,Integer> b1=(n,m)->n==m;
		System.out.println(b1.test(3, 3));
		System.out.println(b1.test(3, 4));
		
		BiPredicate<String,String> b2=(s1,s2)->s1.length()==s2.length();
		System.out.println(b2.test("archana", "sivaji"));

	}

}
