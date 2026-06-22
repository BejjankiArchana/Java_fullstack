package LanguageFundamentals.constructors.chaining;

public class Vehicle {
	String brand;
	String model;
	Vehicle(){
		this("unknown","unknown");
		System.out.println("no arg");
	}
	Vehicle(String brand,String model){
		System.out.println("2 arg");
		this.brand=brand;
		this.model=model;
	}
	
public static void main(String[] args) {
			
	}
}	
		
//if parent class does not contain default or no arg constructor child class gets compile error
//Implicit super constructor Vehicle() is undefined for default constructor. Must define an explicit constructor
//this is bcz when clild object created it will call default child constructor that constructor implicitly call super()
//but super()not present so no arg must be in super class
class Bike extends Vehicle{
	Bike(){
		super();//constructor chaining using super()
		//super("unknown","unknown");only one super() execute bcz this() or super() should be first line
		System.out.println("no arg child");
	}
	
	public static void main(String[] args) {
		Bike b=new Bike();
		b.display();	
	}
	void display() {
		System.out.println(brand);
		System.out.println(model);
		
	}
}
