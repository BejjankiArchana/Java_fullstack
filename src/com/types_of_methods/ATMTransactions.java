package com.types_of_methods;

public class ATMTransactions {
	double balance=10000.00;

	 void main() {
		System.out.println("welcome to hdfc banking!");
		checkbalance();
		deposite(50000);
		withdraw(70000);
		withdraw(30000);
		
	}
	 void checkbalance() {
		 System.out.println("your current balance :"+balance);
	 }
	 void deposite(int amount) {
		 System.out.println("your current balance:"+balance);
		 balance=balance+amount;
		 System.out.println("your balance after deposit :"+balance);
	 }
	 void withdraw(double amount) {
		 if(balance<amount) {
			 System.out.println("insufficient balance, your current balance :"+balance);
		 }
		 else {
			 balance=balance-amount;
			 System.out.println("your balance after withdraw :"+balance);
		 }
	 }

}
