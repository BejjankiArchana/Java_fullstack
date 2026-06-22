package com.operators;
//instance of operaor is used to check whether the object is from specified(given) class or not
//you can not use instance of with primitives bcz they are not objets

class A{
	
}
class B extends A{
	
}
public class InstanceofOperator {

	public static void main(String[] args) {
		Integer i=10;
		System.out.println(i instanceof Integer);
		System.out.println(i instanceof Number);
		System.out.println(i instanceof Object);
		System.out.println(null instanceof Integer);
		String s="java";
		System.out.println(s instanceof String);
		System.out.println(s instanceof Object);
		System.out.println(null instanceof String);
		A a=new A();
		B b=new B();
		System.out.println(b instanceof B);
		System.out.println(b instanceof A);
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		
		

	}

}
