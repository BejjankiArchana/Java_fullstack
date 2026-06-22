package com.operators;
//Comparison operators ==,!=,>,<,>=,<= returns true or false

public class ComparisionOperators {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println(a==b);//false
		System.out.println(a!=b);//true
		System.out.println(a<b);//true
		System.out.println(a<=b);//true
		System.out.println(a>b);//false
		System.out.println(a>=b);//false
		//== check values when used with primitives
		//but == check object references when used with objects
		String s1="java";
		String s2=new String("java");
		System.out.println(s1==s2);//false one from scp another fron heap
		System.out.println(s1==s2.intern());//intern() returns pooled reference

	}

}
