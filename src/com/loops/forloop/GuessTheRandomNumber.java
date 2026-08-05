package com.loops.forloop;
import java.util.Scanner;
import java.util.Random;

public class GuessTheRandomNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random random=new Random();
		int num = random.nextInt(10);
		int guess=0;
		System.out.println("enter no of chances you want to guess :");
		int no_of_chances=sc.nextInt();
		
		for(int i=1;i<=no_of_chances;i++) {
			System.out.println("Guess the number hint: 1 digit only");
		  guess=sc.nextInt();
			if(guess==num) {
				System.out.println("perfect, you won ");
				break;
			}
			
			else if(guess < num && i<no_of_chances){
				System.out.println(" not correct! hint: number is higher ");
				
			}
			else if(guess>num && i<no_of_chances) {
				
				
				System.out.println(" not correct! hint: number is lower ");
				
			}
			 if (i == no_of_chances) {
	                System.out.println("Game Over!");
	                System.out.println("The correct number was: " + num);
	            }
			
		}
		  sc.close();

	}

}
