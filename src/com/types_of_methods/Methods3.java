package com.types_of_methods;

import java.util.Scanner;

public class Methods3 {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("main method started");
		Methods3 m=new Methods3();
		double sal=m.getSal();
		double bonous=m.getbonus();
		double gst=m.getgst();
		System.out.println("total salary = "+(sal+bonous+gst));
		
	}
	double getSal() {
		System.out.println("enter your salary: ");
		double sal=sc.nextDouble();
		return sal;
	}
	double getbonus() {
		System.out.println("enter your bonus: ");
		double bonus=sc.nextDouble();
		return bonus;
	}
	double getgst() {
		System.out.println("enter your gst: ");
		double gst=sc.nextDouble();
		return gst;
	}

}
