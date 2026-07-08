package LogicalStatements;

import java.util.Scanner;

public class CheckCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a character :");
		char ch=sc.next().charAt(0);
		if(ch>='a'&&ch<='z') {
			System.out.println("given char is lower case alphabet :"+ ch);
		}
		else if(ch>='A'&&ch<='Z') {
			System.out.println("given char is  upper case alphabet :"+ ch);
		}
		else if(ch>='0'&&ch<='9') {
			System.out.println("given char is a number :"+ ch);
		}
		else {
			System.out.println("given char is special character :"+ ch);
		}
		
		//EVEN OR ODD USING BITWISE
		System.out.println("enter a number:");
		int n=sc.nextInt();
		if((n&1)==0) {
			System.out.println("given num is even");
			
		}
		else {
			System.out.println("given num is odd");
			
		}
		

	}

}
