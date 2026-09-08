package com.arrays;

public class EqulibriumEle2 {
	//Find an element that is greater than all elements on its left and smaller
	//than all elements on its right.

	public static void main(String[] args) {
		int[]arr= {5, 1, 4, 3, 6, 8, 10, 7};
		for(int i=1;i<arr.length-1;i++) {
			int ele=arr[i];
			boolean left=true;
			boolean right=true;
			for(int j=0;j<i;j++) {
				if(ele<arr[j]) {
					left=false;
				}
			}
				if(left) {
					for(int k=i+1;k<arr.length;k++) {
						if(ele > arr[k]) {
							right=false;
						}
					}
						if(left && right) {
							System.out.println("element found "+ele);
							break;
						}
					}
				}
		
			}
	}


