package com.jdbc;

import com.jdbc.model.Account;

public interface BankApplication {
	void createAccount(Account ac);
	void deposit(double amount,int accno);
	void withdraw(double amount,int accno);
	double checkBalance(int accountno);
	void viewAllAccountsDetails();


}
