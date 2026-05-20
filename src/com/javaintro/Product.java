package com.javaintro;

public class Product {
	static String storename="Dmart";
	int productId;
	String productName;
	int productPrice;
	{
		System.out.println(storename);
	}
	
	void details() {
		System.out.println(productId);
		System.out.println(productName);
		System.out.println(productPrice);
		System.out.println();
		
	}

	public static void main(String[] args) {
		Product pen=new Product();
		pen.productId=1;
		pen.productName="pen";
		pen.productPrice=5;
		pen.details();
		Product pencil=new Product();
		pencil.productId=2;
		pencil.productName="pencil";
		pencil.productPrice=10;
		pencil.details();
		Product book=new Product();
		book.productId=3;
		book.productName="Book";
		book.productPrice=50;
		book.details();
		

	}

}
