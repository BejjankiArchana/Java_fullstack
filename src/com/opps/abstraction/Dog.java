package com.opps.abstraction;

public class Dog implements Animal{

	@Override
	public void eat() {
		System.out.println("dog eat non veg");
		
	}

	@Override
	public void sleep() {
		System.out.println("dog does not sleep at night");
		
	}

	@Override
	public void sound() {
		System.out.println("bow bow");
		
	}

}
