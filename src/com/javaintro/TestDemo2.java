package com.javaintro;

public class TestDemo2 {
	//static block execute first
	//instance block execute when we create object
	//if we have static block and static variable then it follow order 
	//who ever come first it will execute first
	//static TestDemo2 td=new TestDemo2();
	
	static {
			System.out.println("static block 1 started");
			
	}
	static {
		System.out.println("static block 2 started");
		
}
		{
			System.out.println("instance block 1 started");
			
		}
		{
			System.out.println("instance block 2 started");
			
		}
		public static void main(String[]args) {
			System.out.println("main method started");
			TestDemo2 td=new TestDemo2();
		
		
}
}