package com.jdbc.controller;

import java.util.Scanner;

import com.jdbc.dao.AccountOperations;
import com.jdbc.model.Account;

public class TestBankApp {

	
		static Scanner sc=new Scanner(System.in);

		public static void main(String[] args) {
			
		boolean flag=true;
			
			System.out.println("============welcome to My Banking Application==============");
			while(flag) {
				System.out.println("----------------------------------------");
			System.out.println("choose the below options ");
			System.out.println("1.Creating An Account");
			System.out.println("2.Depositing into your Account");
			System.out.println("3.Withdraw from your Account");
			System.out.println("4.Check balance in your Account");
			System.out.println("5.view all accounts details");
			System.out.println("6.Exit");
			System.out.println("enter your choice");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:{
				System.out.println("enter your name :");
				String name=sc.next();
				System.out.println("enter initial amount :");
				double balance=sc.nextDouble();
				Account ac=new Account(name,balance);
				AccountOperations ao=new AccountOperations();
				ao.createAccount(ac);
				
				
				break;
				
			}
			case 2:{
				System.out.println("enter your account no :");
				int accno=sc.nextInt();
				System.out.println("enter amount :");
				double amount=sc.nextDouble();
				AccountOperations ao=new AccountOperations();
				ao.deposit(amount, accno);
				break;
				
				
			}
			case 3:{	
				System.out.println("enter your account no :");
				int accno=sc.nextInt();
				System.out.println("enter amount :");
				double amount=sc.nextDouble();
				AccountOperations ao=new AccountOperations();
				double balance=ao.checkBalance(accno);
				if(amount<balance) {
					ao.withdraw(amount, accno);
				}else {
					System.out.println("insufficient balance");
				}
				break;
			
			}
			case 4:{
				System.out.println("enter account no :");
				int accno=sc.nextInt();
				AccountOperations ao=new AccountOperations();
				System.out.println("Your current balance rs "+ao.checkBalance(accno)); 
				
				break;
				
			
			}
			case 5:{
				AccountOperations ao=new AccountOperations();
				ao.viewAllAccountsDetails();
				break;
				
				
			}
			case 6:{
				System.out.println("thanks for using my banking application !!");
				flag=false;
				break;
			}
		    default:{
		    	System.out.println("choose correct option between 1 to 6");
		    	break;
				
			}

		}

	}


	}

}
