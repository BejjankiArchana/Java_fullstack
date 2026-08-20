package com.arrays;

import java.util.Arrays;

public class Permutations {

	public static void main(String[] args) {
		int[]arr= {1,2,3};
		int index=0;
		permutate(arr,index);
		//or you can do this without recursion also using 3 for loops
		System.out.println("without recursion");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				for(int k=0;k<arr.length;k++) {
					if(i!=j && j!=k && k!=i) {
						System.out.println(Arrays.toString(new int[] {arr[i],arr[j],arr[k]}));
					}
				}
				
			
			}
			
		}
		
		
			
		}

	
static void permutate(int[]arr,int start){
	//base case
	if(start==arr.length) {
		System.out.println(Arrays.toString(arr));
		return;
	}
	for(int i=start;i<arr.length;i++) {
		int temp=arr[start];
		arr[start]=arr[i];
		arr[i]=temp;
		permutate(arr,start+1);
	
	//backtrack
	temp=arr[start];
	arr[start]=arr[i];
	arr[i]=temp;
	
	}

}
}