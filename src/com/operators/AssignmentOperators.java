package com.operators;
//assignment operators are (=,+=,-=,*=,/=,%=)

public class AssignmentOperators {

	public static void main(String[] args) {
		int result=10;
		double res=9;
	//result=result+3.5;//CE because addition gives double//Type mismatch: cannot convert from double to int
		result=(int)(result+3.9);// o/p 13 ,explicit type casting double to int
		System.out.println(result);
		result+=3.9;//narrowing with += (high type to low type)
		System.out.println(result);
		res+=5;//widening low type to high type
		System.out.println(res);
	//	result=result-3.4;//CE because addition gives double//Type mismatch: cannot convert from double to int
	//result=(int)(result-3.5);//12
		//System.out.println(result);
		result-=3.5;
		System.out.println(result);//12
		result*=3.2;
		System.out.println(result);//38
		result/=3.2;
		System.out.println(result);//9
		result%=4.2;
		System.out.println(result);//2

	}

}
