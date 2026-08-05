package com.opps;

import java.util.Scanner;

public class MobileWallet {
	private double balance;
	MobileWallet(double balance){
		if(balance>0) {
		this.balance=balance;
		}
		else {
			System.out.println("balance should be grater than zero ");
		}
	}
	MobileWallet(){
		balance = 0;
	}
	
	public double getBalance() {
			
		return balance;
	}
	public void recharge(double amount) {
		if(amount>0) {
		balance=balance+amount;
		System.out.println("recharge sucess your current balance :"+balance);}
		else {
			System.out.println("recharge amount should be greater than zero");
		}
	}
	public void deduct(double amount) {
		if (amount <= 0) {
            System.out.println("Deduction amount should be greater than zero.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Available balance: " + balance);
        } else {
            balance -= amount;
            System.out.println("Deduction successful. Current Balance: " + balance);
        }
	}
	

}
