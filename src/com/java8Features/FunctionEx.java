package com.java8Features;

import java.util.Arrays;
import java.util.function.Function;

public class FunctionEx {

	public static void main(String[] args) {
		System.out.println("main method started");
		Function<Integer,Integer> f1=n->n*n;
		System.out.println(f1.apply(20));
		Function<Character,String> f2=c->{
			if(c>='a'&& c<='z') {
				return "lower case";
			}
			else if(c>='A'&& c<='Z') {
				return "uppercase case";
			}
			else if(c>='0'&& c<='9') {
				return "number";
			}
			else {
				return "special character";
			}
		};
		System.out.println(f2.apply('g'));
		Function<Boolean,String> f3=b->b==true?"True":"False";
		System.out.println(f3.apply(true));
		Function<int[],Integer> f4=arr->{
			int sum=0;
			for(int i:arr) {
				sum+=i;
			}
			return sum;
		};
		int[]arr= {1,2,3,4,5};
		System.out.println("sum :"+ f4.apply(arr));
		Function<int[],int[]> f5=arr1->{
			
			for(int i=0;i<arr.length;i++) {
				if((arr[i]%2)!=0) {
					arr[i]=arr[i]+1;
				}
			}
			return arr;
		};
		int[]arr1= {1,2,3,4,5};
		System.out.println("even array :"+Arrays.toString(f5.apply(arr1)));
		
		
		
		

	}

}
