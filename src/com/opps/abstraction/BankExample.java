package com.opps.abstraction;

public abstract class BankExample implements Bank {

	@Override
	public void method1() {
		System.out.println("default implimentation method1 through abstract class");
		
	}

	@Override
	public void method2() {
		System.out.println("default implimentation method2 through abstract class");
		
	}

	//not implemented method 3
	//but still it is available in this abstract class as abstract class only
	@Override
	public void method4() {
		System.out.println("default implimentation method4 through abstract class");
	}
	public abstract void method5() ;

}
