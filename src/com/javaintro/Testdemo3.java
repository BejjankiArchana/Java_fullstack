package com.javaintro;

public class Testdemo3 {
	//static method
	static void method1() {
		System.out.println("method1");
		Testdemo3 t=new Testdemo3();
		//calling instance method
		t.method2();
		//calling static method
		method3();
	}
	//instance method
	void method2() {
		System.out.println("method2");
		//calling static method
		method3();
		//calling instance method
		method4();
	}
	static void method3() {
		System.out.println("method3");
		
	}
	 void method4() {
		System.out.println("method4");
	}
	

	public static void main(String[] args) {
		//Testdemo3 t=new Testdemo3();
		method1();
		
		
		

	}

}
