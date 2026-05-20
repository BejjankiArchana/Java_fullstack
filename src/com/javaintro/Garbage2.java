package com.javaintro;

public class Garbage2 {
	static String name="Archana";
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called");
	}

	public static void main(String[] args) {
		//ananomus object creation and making it elligible for garbage
		new Garbage2();
		System.out.println(Garbage2.name);
		System.gc();

	}

}
