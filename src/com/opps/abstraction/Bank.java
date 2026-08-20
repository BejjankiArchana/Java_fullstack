package com.opps.abstraction;

public interface Bank {
    void method1();
    void method2();
    void method3();
    void method4();
    default void method5() {
    	System.out.println("default method of interface called");
     	method7();
    }
    static void method6() {
    	System.out.println("default method of interface called");
     	
    }
    private void method7() {
    	System.out.println("private method from interface called through default  methods ");
    }

}
