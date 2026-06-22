package LogicalStatements;

import java.util.Scanner;

public class LogicalStatements1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age :");
		int age=sc.nextInt();
		if(age>18)//if  brackets not provided first statement after if is considered 
			System.out.println("elligible");
		else//if brackets not provided also no error first line is considered
			System.out.println("not elligible");
		System.out.println("main method ended");//always execute bcz not in else block
		
		

	}

}
