package com.java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionEx {

	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> b1=(n1,n2)->n1+n1;
		System.out.println(b1.apply(45, 56));
		BiFunction<Character,Character,List<Character>> b2=(c1,c2)->{
			List<Character>arr=new ArrayList<>();
			for(char i=c1;i<=c2;i++) {
				arr.add(i);
			}
			return arr;
		};
		System.out.println(b2.apply('a', 'z'));
		

	}

}
