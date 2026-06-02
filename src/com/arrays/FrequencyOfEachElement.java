package com.arrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfEachElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array: ");
		int n=sc.nextInt();
		if (n <= 0) {
            System.out.println("n should be grater than 0");
            return;
        }
		System.out.println("Enter elements of array: ");
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Map<Integer,Integer>map=new LinkedHashMap<>();
		for(int i:arr) {
			map.put(i, map.getOrDefault(i,0)+1);
		}
		map.forEach((key,value)->{System.out.println(key+"->"+value);});

	}
}

