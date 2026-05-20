package com.javaintro;

public class Garbage3 {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called");
	}
	static void method1() {
		Garbage3 t1=new Garbage3();
		System.out.println(t1);
	}

	public static void main(String[] args) {
		//object inside method elligible for garbage 
		System.out.println("main method started");
		Garbage3.method1();
		System.gc();

	}

}
