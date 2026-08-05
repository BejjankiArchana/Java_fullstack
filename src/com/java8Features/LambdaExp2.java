package com.java8Features;
@FunctionalInterface
interface in2{
	void display();
}

public class LambdaExp2 {

	public static void main(String[] args) {
		System.out.println("main method");
		in2 i=()->System.out.println("display method called");//if multiple statements use curly braces with ; at end
         i.display();                                     //single statement no need of braces
	}

}
