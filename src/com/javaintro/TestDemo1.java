package com.javaintro;

public class TestDemo1 {

	public static void main(String[] args) throws ClassNotFoundException{
		System.out.println("main  method started");
		Class c=Class.forName("com.javaintro.Cricketer");
		System.out.println(c);
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("main method ended");
		
	}

}
