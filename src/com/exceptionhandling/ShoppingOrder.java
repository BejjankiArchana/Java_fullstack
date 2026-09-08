package com.exceptionhandling;

import java.util.Scanner;

/*1. Write a Java program for an online shopping order that:
* Accepts the product price as a String and converts it to double.
* Stores product names in an array and accepts a product index.
* Accepts quantity and calculates price / quantity.
* Use a finally block to display "Order processing completed" whether an exception occurs or not.
* Handle multiple unchecked exceptions:
NumberFormatException → invalid price
ArrayIndexOutOfBoundsException → invalid product index
ArithmeticException → quantity is 0*/


public class ShoppingOrder {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        String[] products = {"Laptop", "Mobile", "Headphones", "Keyboard"};
	        try {
	        System.out.println("enter price ");
	        String price=sc.next();
	        double prize=Double.parseDouble(price);
	        
	        System.out.println("enter product index :");
	        int index=sc.nextInt();
	        String product=products[index];
	        
	        System.out.println("enter quantity :");
	        int quan=sc.nextInt();
	        double res=prize/quan;
	         System.out.println(prize);
	         System.out.println(product);
	         System.out.println(res);
	        
	        }catch(NumberFormatException e) {
	        System.out.println("you need to provide number only");
	        }
	        catch(ArrayIndexOutOfBoundsException e) {
	        	System.out.println("index is out of range");
	        }catch(ArithmeticException e) {
	        	System.out.println("quantity can not be zero");
	        	
	        }
	        finally {
	            System.out.println("Order processing completed");
	        }

	        sc.close();

	}

}
