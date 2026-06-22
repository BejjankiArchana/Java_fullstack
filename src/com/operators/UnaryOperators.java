package com.operators;
//unary operators +, -, ++, --
//a++ or ++a mean a=a+1 similarly a--or --a mean a=a-1;
public class UnaryOperators {
	public static void main(String[]args) {
		int a=10;
		int b=6;
		System.out.println(+a);//10
		System.out.println(-a);//-10
		System.out.println(++a);//11 pre increment
		System.out.println(a++);//11 post increment
		System.out.println(a++ + ++a);//26
		System.out.println(a);//14
		System.out.println(a+++a);//
		System.out.println(--b);//5 pre decrement
		System.out.println(b--);//5 post decrement after printing 5 decrement 1 so 4 stored in b
		System.out.println(b-- - --b);//2
		System.out.println(b---b);//1
		int x=10;int y=9;
				
		System.out.println(x++ + y++ +y-- +x-- -y++ -x++ +y++);//35
		int m=7;
		int n=m++ + --m + ++m;
		System.out.println(n);
		int num=3;
		int res=num++ + ++num + num-- + --num;
		System.out.println(res);
		
		
	}

}
