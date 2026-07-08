package LogicalStatements;

import java.util.Scanner;

public class SwitchWithReturn {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your marks :");
		int marks=sc.nextInt();
		String grade=getPercentage(marks);
		System.out.println("your grade :"+grade);

	}
	static String getPercentage(int marks) {
		String grade=switch(marks/10) {
		case 9->"a";
		case 8->"b";
		case 7->"c";
		case 6->"d";
		case 5,4->"just pass";
		default->"f";
			
		};
		return grade;
		}
		
	}


