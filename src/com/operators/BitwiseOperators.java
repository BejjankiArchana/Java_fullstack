package com.operators;
//(& | ^ ~)Bitwise operators work with both expressions(conditions) as well as variables
//& nothing but *;( | )or nothing but +

public class BitwiseOperators {

	public static void main(String[] args) {
		int a=45;
		int b=19;
		int c=-56;
		System.out.println(a&b);//1 convert both to binary and them perform and operation convert into decimal again
		System.out.println(a|b);//63convert both to binary and them perform or operation convert into decimal again
		System.out.println(82&34);//2
		System.out.println(82|34);//114
		//^ xor is like if both are (true/false) then false if any one is true mean true
		System.out.println(a^b);//62 convert to bin perform xor then convert result to decimal
		System.out.println(82^34);//112
		//~ tilt is  -(n+1) if n is positive  /+(n-1) if n is -ve
		System.out.println(~a);//-46
		System.out.println(~c);//55
		
		
		

	}

}
