package LogicalStatements;

import java.util.Scanner;

public class SwitchExamp {

	public static void main(String[] args) {
		System.out.println("welcome to NMS Movies");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your category :G(general)/P(prime)/V(vip)");
		 String ch=sc.next().toUpperCase();
		switch (ch) {
		case "G"->{System.out.println("your ticket price: 150rs");
			
		}
        case "P"->{
        	System.out.println("your ticket price: 250rs");
			
		}
        case "V"->{
        System.out.println("your ticket price: 400rs");
         }
        default->{
        System.out.println("there is no other category");
        	
        }
		
		}

	}

}
