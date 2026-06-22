package com.operators;
//<< >> >>>

public class ShiftOperators {

	public static void main(String[] args) {
		int a=69;
		int b=2;
		
		System.out.println(a<<b);//276 convert to bin and shift to left b no of bits
		System.out.println(a>>b);//17
		System.out.println(56<<3);//448
		System.out.println(56>>3);//7
		System.out.println(56>>>3);//similar to right shift but unsigned
		System.out.println(5<<45);
		
		
		

	}

}
