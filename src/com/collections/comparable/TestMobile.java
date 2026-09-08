package com.collections.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestMobile {

	public static void main(String[] args) {
		Mobile m1=new Mobile(1,"redmi",6000.00);
		Mobile m2=new Mobile(1,"oppo",10000.00);
		Mobile m3=new Mobile(1,"vivo",16000.00);
		Mobile m4=new Mobile(1,"oneplus",36000.00);
		Mobile m5=new Mobile(1,"mi",15000.00);
		List<Mobile>list=Arrays.asList(m1,m2,m3,m4,m5);
		Comparator<Mobile>c=new Comparator<Mobile>() {

			@Override
			public int compare(Mobile o1, Mobile o2) {
				if(o1.price<o2.price) {
				return -1;//for decending order put +1 here
				}
				else if(o1.price>o2.price) {
					return 1;//for decending order put -1 here
				}
				return 0;
			}
			
		};
		for(Mobile m:list) {
			System.out.println(m);
		}
		System.out.println("---------------------------------------------------");
		Collections.sort(list, c);
		for(Mobile m:list) {
			System.out.println(m);
		}
	
	}

}
