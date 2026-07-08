package LogicalStatements;

import java.util.Scanner;

public class AnimalSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter which kind of animal you want\n enter 1 for domestic animals\n enter 2 for wild animals");
		int choice=sc.nextInt();
		switch(choice) {
		case 1->{System.out.println("we have cat,dog,cow");
		System.out.println("enter 1 for cat\n enter 2 for dog\n enter 3 for cow");
		int ch=sc.nextInt();
		switch(ch) {
		case 1-> System.out.println("Cat displayed");
		case 2->System.out.println("dog displayed");
		case 3->System.out.println("Cow displayed");
		default->System.out.println("we have only cat,dog,cow ");
		
		};
		
		}
		case 2->{System.out.println("we have lion, tiger");
		System.out.println("enter 1 for lion\n enter 2 for Tiger");
		int ch=sc.nextInt();
		switch(ch) {
		case 1-> System.out.println("lion displayed");
		case 2->System.out.println("Tiger displayed");
		
		default->System.out.println("we have only lion,tiger ");
		
		};
		
		}
		default->{
			System.out.println("we have only 2 categiries currently thanks for visiting !!");
			
		}
	};
	System.out.println("thanks for visiting !! visit again!!");
	sc.close();
	}
}
