package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestcolleDemo2 {

	public static void main(String[] args) {
		Collection<Integer>nums1=new ArrayList<>();
		nums1.add(10);
		nums1.add(20);
		System.out.println(nums1.hashCode());//1291
		Collection<Integer>nums2=new ArrayList<>();
		nums2.add(10);
		nums2.add(20);
		System.out.println(nums1.hashCode());//1291
		System.out.println(nums1.equals(nums2));
		
		//calculating hash code[10,20]
		//31*1+10=41
		//31*41+20=1291--hashcode
		Collection<Integer>nums3=new ArrayList<>();
		nums3.add(20);
		nums3.add(10);
		System.out.println(nums3.hashCode());//1591
		System.out.println(nums1.equals(nums3));//false
		//suppose order is different [20,10]
		//31*1+20=51
		//31*51+10=1591=hashcode
		//remove()-removes an element from collection
		nums3.remove(10);
		System.out.println(nums3);
		Collection<Integer>nums4=new ArrayList<>();
		nums4.add(30);
		Collection<Integer>nums=new ArrayList<>();
		nums.addAll(nums1);
		nums.addAll(nums4);
		System.out.println(nums);
		//difference between removeAll(Collection c) and clear()
		//clear() remove all elements in specified collection
		//removeAll(Collection c) remove given collection from specified collection
		nums.removeAll(nums4);
		System.out.println(nums);
		
		

	}

}
