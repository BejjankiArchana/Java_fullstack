package com.opps.abstraction;

public class Cat implements Animal{

	@Override
	public void eat() {
		System.out.println("cat eat non veg and veg");
		
	}

	@Override
	public void sleep() {
		System.out.println("cat sleep at any time");
		
	}

	@Override
	public void sound() {
		System.out.println("meaw meaw");
		
	}

}
