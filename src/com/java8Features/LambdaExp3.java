package com.java8Features;
@FunctionalInterface
interface in3{
	void add(int a,int b);//here you need data type
}

public class LambdaExp3 {

	public static void main(String[] args) {
		System.out.println("main method");
		in3 i=(n,m)->System.out.println("sum :"+(n+m));//no need of data type even at here
		i.add(10, 20);
	}

}
