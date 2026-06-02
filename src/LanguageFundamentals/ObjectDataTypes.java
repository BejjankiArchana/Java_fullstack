package LanguageFundamentals;

public class ObjectDataTypes {

	public static void main(String[] args) {
		Integer i=10; //auto boxing:converting primitive to object
		Integer x=Integer.valueOf(10);//before auto boxing
		
		int i1=i;//auto unboxing object into primitive
		int i2=i.intValue();//before auto unboxing 
	//Integer cache range is -128 to +127
	//if you give int literals in this range they will be stored in cache
//out of this range will create objects in heap
//== operator checks equality with primitives 
//== operator checks object references with objects
		Integer n1=100;
		Integer n2=100;
		System.out.println(n1==n2);//true because both store in cache
		// Even though both values are within the Integer cache range,
		// if we give different numberslike 50,70 each distinct value has 
		//its own cached Integer object.
		// Therefore, references for 50 and 70 are different.
		
		Integer n3=200;
		Integer n4=200;
		//here these are out of Integer cache range so new objects created
		System.out.println(n3==n4);
		Integer n5=128;
		//n5--;
		Integer n6=127;
		System.out.println(--n5==n6);
		
		
		
	}

}
