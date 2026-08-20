package com.opps.abstraction;

public class TestAnimal {

	public static void main(String[] args) {
		Animal c=new Cat();
		c.eat();
		c.sleep();
		c.sound();
		Animal d=new Dog();
		d.eat();
		d.sleep();
		d.sound();

	}

}
