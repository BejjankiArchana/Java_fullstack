package com.java8Features;
class Test{
	void method1() {
		System.out.println("method 1");
	}
}

public class AnonymusInnerClasswithClass {

	public static void main(String[] args) {
		Test t=new Test() {//anonymus inner class
			@Override
			void method1() {
				System.out.println("override method");
			}
		};
		t.method1();
		Test t1=new Test();
		t1.method1();
		

	}

}
