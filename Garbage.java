package com.javaintro;

class Employee{
	
	@Override
	protected void finalize()throws Throwable{
		System.out.println("finalize method called");
		
	}
}

public class Garbage {
	

	public static void main(String[]args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		
		
		System.out.println(e1);//com.javaintro.Employee@1dbd16a6
//address of object=fullyqualified(along with package)classname and 
		//hexadecimal value of hashcode of object
		System.out.println(e1.hashCode());//hash code:498931366 
		System.out.println(e2);
		//nullifiing the object so that it will be collected by garbage
		e1=null;
		//System.gc();
		//reassigning
		e3=e2;
		
		System.gc();//calling garbage collector 
		//garbage collector collect that only if
		//we nullify the object as shown above
		//re-assigning the objects
		//anonymous objects
		//objects inside the methods
		//Island of isolation
		

	}

}
