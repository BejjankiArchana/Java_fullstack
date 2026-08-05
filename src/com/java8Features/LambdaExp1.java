package com.java8Features;
//fucctional interface and ;ambda expression work together
//a functional interface is a interface with single abstract method
//this code implimenting functional interface without lambda expression how to access method of interface
@FunctionalInterface
interface in1{
	void display();
}
class test implements in1{
	@Override
	public void display() {//this method should be public only other wise you will get CE:Cannot reduce the visibility of the inherited method from in1
		System.out.println("method 1 called");
	}
}
public class LambdaExp1 {

	public static void main(String[] args) {
		System.out.println("main method");
		in1 i=new test();
		i.display();

	}
	//instead of all this creating class overriding method we can simply call
	//method using lambda expression see the next program

}
