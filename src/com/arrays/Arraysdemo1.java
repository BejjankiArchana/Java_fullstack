package com.arrays;
//max size that we can give to array is integer max size i.e.2^32=2147483647 above that size will get compile time err


public class Arraysdemo1 {

	public static void main(String[] args) {
		//int[]arr=new int[2147483647];//max range
		int []arr2= {};//0 length array
		System.out.println(arr2.length);
		int arr3[]= {20};
		System.out.println(arr3);//prints address not elements you can not directly print array use loop or convert to string
        //find sum,highest, lowest marks in array of marks
		int marks []= {56,78,90,34,22};
		
        int min=marks[0];
        int max=marks[0];
        for(int i:marks) {
        if(i<min) {
         	min=i;
        	
        }
        if(i>max) {
         	max=i;
        	
        }    	
        
        }
		
	System.out.println("highest :"+max);	
	System.out.println("lowest :"+min);	
	byte[]ar1=new byte[10];
	short[]ar2=new short[10];
	long[]ar3=new long[10];
	float[]ar4=new float[10];
	double[]ar5=new double[10];
	char[]ar6=new char[10];
	boolean[]ar7=new boolean[10];
	String[]ar8=new String[10];
	Integer[]ar9=new Integer[10];
	System.out.println(ar1[0]);
	System.out.println(ar2[0]);
	System.out.println(ar3[0]);
	System.out.println(ar4[0]);
	System.out.println(ar5[0]);
	System.out.println(ar6[0]);
	System.out.println(ar7[0]);
	System.out.println(ar8[0]);
	System.out.println(ar9[0]);
    
	}

}
