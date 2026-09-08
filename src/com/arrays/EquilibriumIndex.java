package com.arrays;

public class EquilibriumIndex {

	public static void main(String[] args) {
		int[]arr= {-7, 1, 5, 2, -4, 3, 0};
		
		for(int i=1;i<arr.length-1;i++) {
			int sum1=0;
			int sum2=0;
			for(int j=0;j<i;j++) {
				sum1+=arr[j];
			}
			
			for(int j=i+1;j<arr.length;j++) {
				sum2+=arr[j];
			}
			if(sum1==sum2) {
				System.out.println("equilibriumelement index is "+i);
				break;
			}else {
				System.out.println("no such element found");
			}
			
		}

	}

}
