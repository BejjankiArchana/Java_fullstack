package com.loops.whileloops;

import java.util.Scanner;

public class MagicNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num :");
		int n=sc.nextInt();
		int sum=sumdigits(n);
		if(sum==1) {
			System.out.println("magic num :"+n);
		}
		else {
			System.out.println(" not a magic num :"+n);
		}
      
	}

  static int sumdigits(int n) {
	  if(0<n && n<9) {
		  return n;
	  }
		
	  int temp=n;
		int rem=0;
		int sum=0;
		while(n>0) {
			rem=n%10;
			sum+=rem;
			n=n/10;	
			
		}
		return sumdigits(sum);
	}
	

}
