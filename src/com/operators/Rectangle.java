package com.operators;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of rectangle : ");
		float le=sc.nextFloat();
		System.out.println("enter breadth of rectangle : ");
		float br=sc.nextFloat();
		float area=le*br;
		System.out.println("area :"+area);
		float perimeter=2*(le+br);
		System.out.println("perimeter :"+perimeter);
		System.out.println("enter first number to sort a : ");
		int a=sc.nextInt();
		System.out.println("enter 2nd number to sort b : ");
		int b=sc.nextInt();
		System.out.println("before sort :"+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after sort :"+a+" "+b);

	}

}
