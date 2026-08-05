package com.arrays;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class BiConsumerEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BiConsumer<Integer,Integer> bc1=(n1,n2)->{
			System.out.println("Sum :"+(n1+n2));
			System.out.println("Sub :"+(n1-n2));
			System.out.println("mul :"+n1*n2);
			System.out.println("div :"+n1/n2);
			System.out.println("rem :"+n1%n2);
			
		};
		bc1.accept(45,23);
		BiConsumer<String,String> bc2=(s1,s2)->System.out.println(s1+s2);
		bc2.accept("Archana", " sivaji");
		System.out.println("enter 2 strings to append :");
		String s1=sc.next();
		String s2=sc.next();
		bc2.accept(s1, s2);

	}

}
