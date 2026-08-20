package com.jdbc.model;

public class Account {
	
		private String name;
		private double balance;
		public Account(String name,double balance){
			this.name=name;
			this.balance=balance;
		}
		public Account(String name){
			this.name=name;
			
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString(){
			return "name :"+name+"balance :"+balance;
			
		}

	}



