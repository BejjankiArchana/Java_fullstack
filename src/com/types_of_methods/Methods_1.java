package com.types_of_methods;
//in java we have several types of methods
//part1:
//1.pre defined
//2.user defined
//part2:
//static,instance,abstract,final,synchronised,factory
//part3:
// no_args + no_ret_type, no_arg + ret_type, args + no_ret_type, args + ret_type

public class Methods_1 {
	//static and instance methods with no_arg and no_ret_type
	void hello() {
		System.out.println("instance method");
	}
	public static void welcome() {
		System.out.println("static method");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Methods_1 t1=new Methods_1();
		t1.hello();
		welcome();
		System.out.println("main ended");
		

	}

}
