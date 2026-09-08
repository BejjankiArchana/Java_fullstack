package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDupArrList {

	public static void main(String[] args) {
		List<Integer>arr=new ArrayList<>(Arrays.asList(10,20,10,30,20,40));
		for(int i=0;i<arr.size();i++) {
			for(int j=i+1;j<arr.size();j++) {
				if(arr.get(i)==arr.get(j)) {
					arr.remove(j);
					j--;
				}
				
			}
		}
		
		
		
System.out.println(arr);
	}

}
