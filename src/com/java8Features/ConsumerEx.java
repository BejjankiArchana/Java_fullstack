package com.java8Features;

import java.util.Arrays;
import java.util.function.Consumer;

import com.loops.whileloops.Armstrong;//importing my own package

public class ConsumerEx {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Consumer<Integer>c1=n->System.out.println(Armstrong.isarmstrong(n));
				c1.accept(153);
				c1.accept(123);
		Consumer<Character> c2=c->{
			if(c=='h'|| c=='H') {
				System.out.println("hi,hello");
			}
			else if(c=='w' || c=='W') {
				System.out.println("welcome");
			}
			else {
				System.out.println("i dont greet ");
			}
		};
		c2.accept('j');
		Consumer<int[]> c3=arr->{
			int j=arr.length-1;
			for(int i=0;i<arr.length/2;i++) {
				int temp;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j--;
				
			}
			System.out.println("after reversing :"+Arrays.toString(arr));
		};
		int[]arr= {1,2,3,4,5,6};
		c3.accept(arr);
		Consumer<Boolean> c4=b->System.out.println(b & !b | !b & b) ;
		c4.accept(true);

	}

}

