package com.collections;

import java.util.Arrays;
import java.util.List;

public class NonRepeatFirst {

	public static void main(String[] args) {
		List<Integer>l1=Arrays.asList(4,5,1,2,1,4,5,6,2);
		for(int i=0;i<l1.size();i++) {
			int count=0;
			int num=l1.get(i);
			for(int j=0;j<l1.size();j++) {
				if(num==l1.get(j)) {
					count++;
					
				}
			}
			if(count==1) {
				System.out.println("found "+num);
				break;
			}
			
		}

	}

}
