package com.opps;

public class AccessModifiers2 {

	public static void main(String[] args) {
		
		

			System.out.println("main method started from TestAccessDemo2");
//			The constructor AccessModifiers1() is not visible
//			If the constructor is private, we cannot create objects, outside of the classes.
			AccessModifiers1 t = new AccessModifiers1();
			
//			
			System.out.println("------------------------");
//			Accessing the default data members outside of the classes is possible.
			System.out.println(t.id2);
			System.out.println(t.name2);
			t.method2();

			System.out.println("------------------------");
//			Accessing the public data members within same package
			System.out.println(t.id3);
			System.out.println(t.name3);
			t.method3();

			System.out.println("------------------------");
//			Accessing the protected data members within same package.
			System.out.println(t.id4);
			System.out.println(t.name4);
			t.method4();

//			Accessing the private data members outside of the classes are not possible.
//			The field AccessModifiers1.id1 is not visible
//			System.out.println(t.id1);
//			The field AccessModifiers1.name1 is not visible
//			System.out.println(t.name1);
//			The method method1() from the type TestAccessDemo1 is not visible
//			t.method1();


	}

}
