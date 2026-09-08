package com.collections;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {

	public static void main(String[] args) {
		Set<Integer>set=new HashSet<>();
		set.add(45);//45%16=13
		set.add(18);//18%16=2
		set.add(24);//24%16=8
		set.add(34);//34%16=2
		set.add(48);//48%16=0
		set.add(2);//2%16=2
		set.add(9);//9%16=9
		set.add(16);//16%16=0
		set.add(32);//32%16=0
		set.add(32);//no duplicates allowed
		set.add(null);//only 1 null is permitted
		set.add(null);
		set.add(null);
		System.out.println(set);//48 16 32 null 18 34 2 24 9 45(ascending of hash code then insertion order)
		

	}

}
