package LogicalStatements;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a year:");
		int year=sc.nextInt();
		if((year%400==0 )|| (year%100!=0)&&(year%4==0)) {
			System.out.println("given year is leap year "+year);
			
		}
		else {
			System.out.println("given year is not a leap year "+year);
			
		}
		System.out.println("enter a number:");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println("given number is even "+num);
			
		}
		else {
			System.out.println("given number is odd "+num);
			
		}
		
		
		

	}

}
