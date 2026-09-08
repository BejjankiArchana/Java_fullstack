package com.collections;

import java.util.Arrays;
import java.util.List;

public class PairsSumEqTarget {

	public static void main(String[] args) {
		List<Integer>l1=Arrays.asList(2,7,4,3,5,8,1);
		int target=9;
		for(int i=0;i<l1.size()-1;i++) {
			int num=l1.get(i);
			for(int j=i+1;j<l1.size();j++) {
				if(l1.get(j)+num==target) {
					System.out.println("("+num+","+l1.get(j)+")");
				}
			}
		}

	}

}
