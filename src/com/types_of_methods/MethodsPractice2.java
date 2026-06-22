package com.types_of_methods;

import java.util.Scanner;

/*Print reverse of a predefined number.
Print sum of digits of predefined number.
Print factorial of 5.
Print cube of numbers 1-10.
Print powers of 2 up to 1024.
Print stars in pyramid pattern.
Print diamond pattern.
Print multiplication tables 1-10.
Print predefined array elements.
Print largest element from predefined array.
Print smallest element from predefined array.*/

public class MethodsPractice2 {

	public static void main(String[] args) {
		MethodsPractice2 m=new MethodsPractice2();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int num=sc.nextInt();
		int res=m.reverse16(num);
		System.out.println(res);
		int sum=m.sumOf17(num);
		System.out.println(sum);
		System.out.println("enter a number to find factorial: ");
		int n2=sc.nextInt();
		int factorial=m.factorial18(n2);
		System.out.println(factorial);
		
		System.out.println("enter num to find cubes: ");
		int n3=sc.nextInt();
		m.cube19(n3);
		m.power20();
		
		
	}
	int reverse16(int n) {
		int rev=0;
		String s=String.valueOf(n);
		String reverse="";
		for(int i=s.length()-1;i>=0;i--) {
			reverse+=s.charAt(i);
		}
		rev=Integer.parseInt(reverse);
		return rev;
	}
	int sumOf17(int n) {
		int sum=0;
		while(n>0) {
		 int digit=n%10;
		 sum+=digit;
		 n=n/10;
		}
		return sum;
	}
	int factorial18(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	void cube19(int n) {
		for(int i=1;i<=n;i++) {
			System.out.print(i*i*i+" ");
		}
		System.out.println();
		
	}
	void power20() {
		int ans=1;
		int index=1;
		while(ans<1024) {
			ans=Math.powExact(2,index );
			System.out.print(ans+" ");
			index++;
		}
	}
	

}
