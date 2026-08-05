package com.java8Features;

import java.util.Arrays;

@FunctionalInterface
interface in5{
	int[] doublednums(int[] arr);
}
public class LambdaExp5 {

	public static void main(String[] args) {
		in5 i=arr->{
			for(int j=0;j<arr.length;j++) {
			arr[j]*=2;}
		return arr;
		};
		int[]a= {1,2,3,4};
		System.out.println(Arrays.toString(i.doublednums(a)));

	}

}
