package com.types_of_methods;

import java.util.Scanner;

public class Areas {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc=new Scanner(System.in);
		Areas AR=new Areas();
		
		System.out.println("enter base length of triangle :");
		float base=sc.nextFloat();
		System.out.println("enter height  of triangle :");
		double h=sc.nextDouble();
		System.out.printf("Area of triangle :%.4f%n",AR.getAreaOfTriangle(base,h));
		
		System.out.println("enter side length of square :");
		float side=sc.nextFloat();
		System.out.printf("Area of square :%.4f%n",AR.getAreaOfSquare(side));
		
		System.out.println("enter radious  of circle :");
		double r=sc.nextDouble();
		System.out.printf("Area of circle :%.4f%n",AR.getAreaOfCircle(r));
		
		System.out.println("enter  length of rectangle :");
		float l=sc.nextFloat();
		System.out.println("enter breadth  of rectangle :");
		float b=sc.nextFloat();
		System.out.printf("Area of rectangle :%.4f%n",AR.getAreaOfRectangle(l,b));
		
		

	}
	double getAreaOfTriangle(float base,double height) {
		return 0.5*base*height;
		
	}
	double getAreaOfSquare(float side) {
		return side*side;
		
	}
	double getAreaOfCircle(double r) {
		return Math.PI*r*r;
		
	}
	double getAreaOfRectangle(float l,float b) {
		return l*b;
		
	}

}
