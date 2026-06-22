package LanguageFundamentals;

import java.util.Scanner;

public class Calculator {
	void add() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value:");	
		int a=sc.nextInt();
		System.out.println("enter b value:");	
		int b=sc.nextInt();
		System.out.println("sum of "+a+" "+b+" = "+(a+b));
	}
	void sub() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value:");	
		int a=sc.nextInt();
		System.out.println("enter b value:");	
		int b=sc.nextInt();
		System.out.println("subtraction of "+a+" "+b+" = "+(a-b));
	}
	void mul() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value:");	
		int a=sc.nextInt();
		System.out.println("enter b value:");	
		int b=sc.nextInt();
		System.out.println("multiplication of "+a+" "+b+" = "+(a*b));
	}
	void div() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value:");	
		int a=sc.nextInt();
		System.out.println("enter b value:");	
		int b=sc.nextInt();
		System.out.println("subtraction of "+a+" "+b+" = "+(a-b));
	}
	void add(int a,int b) {
		System.out.println("sum of "+a+" "+b+" = "+(a+b));
	}
	void sub(int a,int b) {
		System.out.println("subtraction of "+a+","+b+" = "+(a-b));
	}
	void mul(int a,int b) {
		System.out.println("multiplication of "+a+","+b+" = "+(a*b));
	}
	void add(int a,int b,int c) {
		System.out.println("sum of "+a+" "+b+" "+c+" = "+(a+b+c));
	}
	void sub(int a,int b,int c) {
		System.out.println("subtraction of "+a+" "+b+" "+c+" = "+(a-b-c));
	}
	void mul(int a,int b,int c) {
		System.out.println("multiplication of "+a+","+b+","+c+" = "+(a*b*c));
	}

	public static void main(String[] args) {
		System.out.println("welcome to calculator");
		Calculator calc=new Calculator();
		calc.add();
		calc.sub();
		calc.mul();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value:");	
		int a=sc.nextInt();
		System.out.println("enter b value:");	
		int b=sc.nextInt();
		System.out.println("enter c value:");	
		int c=sc.nextInt();
		
		calc.add(a,b);
		calc.sub(a,b);
		calc.add(a,b,c);
		calc.sub(a,b,c);
		calc.mul(a,b);
		calc.mul(a,b,c);
		

	}

}
