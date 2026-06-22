package com.operators;
//swaping 2 numbers can be done in 3 ways
//1.using tem variable
//with out usung tem variable
//using xor ^

public class Swaping {

	public static void main(String[] args) {
		int a=10;int b=30;
		//using temp variable
		System.out.println("before swap a="+a+" b= "+b);
		int temp=a;
		a=b;b=temp;
		System.out.println("after swap a="+a+" b= "+b);
		//without using temp var
		int a1=25; int b1=35;
		System.out.println("before swap a1="+a1+" b1= "+b1);
		a1=a1+b1;
		b1=a1-b1;
		a1=a1-b1;
		System.out.println("after swap a1="+a1+" b1= "+b1);
		//using xor ^
		int a2=80; int b2=50;
		System.out.println("before swap a2="+a2+" b2= "+b2);
		a2=a2^b2;
		b2=a2^b2;
		a2=a2^b2;
		System.out.println("after swap a2="+a2+" b2= "+b2);
		
	}

}
