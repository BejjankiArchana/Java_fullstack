package com.operators;
//(&& || ! )for checking multiple conditions(expressions) not for values

public class LogicalOperators {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println(true && true);//true
		System.out.println(true && false);//false
		System.out.println(false && true);//false dont check 2nd condition called dead code
		System.out.println(false && false);//false dont check 2nd con bcz first false means false no need of 2nd
		
		System.out.println(a<b && ++a!=b);//true
		System.out.println(a);//11 from now a=11
		System.out.println(a<b && ++a==b);//true
		System.out.println(a);//11 from now a=12
		
		System.out.println(a>b && ++a!=b);//first case false so dont check a++!=b this is dead code
		System.out.println(a);//a does not incremented bcz dead
		System.out.println(a>b && ++a==b);//first case false so dont check a++!=b this is dead code
		System.out.println(a);//a does not incremented bcz dead
		//similarly
		
		System.out.println(true || true);//true dont check 2nd case 1 true mean true so 2nd is dead code
		System.out.println(true || false);//true  dont check 2nd case 1 true mean true so 2nd is dead code
		System.out.println(false || true);//true
		System.out.println(false || false);//false 
		
		System.out.println(a<b || ++a!=b);//first case true so dont check a++!=b this is dead code
		System.out.println(a);//12 a does not incremented bcz dead
		System.out.println(a<b || ++a==b);//true first case true so dont check a++!=b this is dead code
		System.out.println(a);//12 only
		
		System.out.println(a<b && ++a!=b);//first case false so  check a++!=b 
		System.out.println(a);// 13a  incremented
		System.out.println(a<b && ++a==b);//first case false so check a++!=b 
		System.out.println(a);// 14 a incremented
		
		//not !
		System.out.println(!(a>b));//true for complimenting the given condition
		System.out.println(!(a<b));
		
		
		

	}

}
