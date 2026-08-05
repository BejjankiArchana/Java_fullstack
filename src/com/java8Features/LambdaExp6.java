package com.java8Features;
@FunctionalInterface
interface in7{
	int cube( int n);
}

public class LambdaExp6 {

	public static void main(String[] args) {
		in7 i=(n)-> n*n*n;//return statement is optional if it has single line code multi line code use braces with return
		//if you have return statement then curly braces must
		System.out.println(i.cube(5));

	}

}
