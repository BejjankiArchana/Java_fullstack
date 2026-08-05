package com.opps;
interface Animal {
}

class Student{
	
}


public class ClassReturnType {
	//getClass()method is a method in object class it returns the class name of current class
	public static Class<?> getStudentClass() {
        return Student.class;
    }
	public static Class<?> getInterfaceClass() {
        return Animal.class;
    }
	
	public static void main(String[] args) {
		ClassReturnType c=new ClassReturnType ();
		Class<?> c1 =getStudentClass();
		System.out.println(c1.getName());//c.getName() is a method of the Class class
                    // It returns the fully qualified name (package + class/interface name)
		                          //of the class or interface represented by the Class object.
		
System.out.println(c.getClass());//class com.opps.ClassReturnType(return fully qualified name of class)
		//how to return a class name from a method?

// similarly interface as return type
//method should return interface name 
//Just like a class has Student.class, an interface also has a Class object.
Class<?> c3 = getInterfaceClass();
System.out.println(c3.getName());//for interface also you need to return class only
		

	}

	
}
