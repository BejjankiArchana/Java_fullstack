package com.loops.whileloops;

import java.util.Scanner;

public class Examp1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter starting num of your series");
		int start=sc.nextInt();
		System.out.println("enter ending num of your series");
		int end=sc.nextInt();
		while(start<end) {
			System.out.print(start+" ");
			start++;
		}
		System.out.println();
		System.out.println("enter num of evens you want");
		int target=sc.nextInt();
		int count=1;
		while(count<=target) {
			System.out.println("enter a number");
			int num=sc.nextInt();
			if(num%2==0) {
				System.out.println(count+" even num "+num+" ");
				count++;
				
			}
			else {
				System.out.println("it is not enen number ");
			}
			
		}
		System.out.println(" completed printing "+target+" no of evens");
		
		

	}

}
