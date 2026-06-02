package com.arrays;
import java.util.*;


public class HighestElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array: ");
		int n=sc.nextInt();
		System.out.println("Enter elements of array: ");
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int highest=Integer.MIN_VALUE;
		int lowest=Integer.MAX_VALUE;
		int sum=0;
		int even=0;
		int odd=0;
		
		for(int i=0;i<n;i++) {
			
			highest=Math.max(highest,arr[i] );
			lowest=Math.min(lowest, arr[i]);
			sum+=arr[i];
			if(arr[i]%2==0) {
				even++;
			}
			else {
				odd++;
			}
			
		}
		System.out.println(sorted(arr));
		System.out.println("highest element is : "+highest);
		System.out.println("lowest element is : "+lowest);
		System.out.println("sum is : "+sum);
		System.out.println("even count is : "+even);
		System.out.println("odd count is : "+odd);
		
		//Arrays.sort(arr);
		//System.out.println("highest element is : "+arr[n-1]);

	}
	static boolean sorted(int[]arr) {
		boolean flag=false;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]<=arr[i+1]) {
				flag=true;
			}else {flag=false;
		}
		
		
	}return flag;

	}
}
