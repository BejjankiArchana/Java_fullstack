package com.javaintro;

public class Garbage4 {
	 Garbage4 i;
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called");
	}
	
	

	public static void main(String[] args) {
		System.out.println("main method started");
		Garbage4 t1=new Garbage4();
		Garbage4 t2=new Garbage4();
		Garbage4 t3=new Garbage4();

		t1.i=t2;
		t2.i=t3;
		t3.i=t1;
		
		t1=null;
		t2=null;
		t3=null;
		
		System.gc();
		

	}

}
