package com.java8Features;
@FunctionalInterface
interface in4{
	int square(int n);
}

public class LambdaExp4 {

	public static void main(String[] args) {
		System.out.println("main method");
		in4 i=(n)->{return n*n;};
         System.out.println(i.square(6));
	}

}
