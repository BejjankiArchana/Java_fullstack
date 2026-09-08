package com.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDupliUsingSet {

	public static void main(String[] args) {
		List<Integer>arr=Arrays.asList(7,1,2,2,4,3,3,5,6);
		Set<Integer>set=new HashSet<>();
		System.out.println("duplicates are:");
		for(int i:arr) {
			if(!set.add(i)) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println(set);
	}

}
