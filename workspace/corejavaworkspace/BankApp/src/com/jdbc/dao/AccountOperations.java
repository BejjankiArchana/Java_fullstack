package com.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jdbc.BankApplication;
import com.jdbc.model.Account;
import com.jdbc.util.BankDBconnection;

public class AccountOperations implements BankApplication {

	@Override
	public void createAccount(Account ac) {
		try {
			Connection con=BankDBconnection.getConnection();
			String sql="insert into accounts (name,balance) values (?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, ac.getName());
			ps.setDouble(2, ac.getBalance());
			int rows=ps.executeUpdate();
			if(rows>0) {
				System.out.println("Account created sucessfully ");
			}
			else {
				System.out.println("something went wrong");
			}
			ps.close();
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

		
	}

	@Override
	public void deposit(double amount, int accno) {
		try {
			Connection con=BankDBconnection.getConnection();
			String sql="update accounts set balance=balance+? where account_no=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setDouble(1, amount);
			ps.setInt(2, accno);
			int rows=ps.executeUpdate();
			if(rows>0){
				System.out.println("deposited sucessfully !!");
			}else {
				System.out.println("account no does not exist !!");
			}
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

		
	}

	@Override
	public void withdraw(double amount, int accno) {
		try {
			Connection con=BankDBconnection.getConnection();
			String sql="update accounts set balance=balance-? where account_no=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setDouble(1, amount);
			ps.setInt(2, accno);
			int rows=ps.executeUpdate();
			if(rows>0){
				System.out.println("withdraw sucessfull !!");
			}else {
				System.out.println("account no does not exist !!");
			}
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public double checkBalance(int accountno) {
		double balance=0.0;
		try {
	        Connection con = BankDBconnection.getConnection();

	        String sql = "select balance from accounts where account_no=?";

	        PreparedStatement ps = con.prepareStatement(sql);
	        ps.setInt(1, accountno);

	        ResultSet rs = ps.executeQuery();

	        if (rs.next()) {
	             balance = rs.getDouble("balance");
	            
	        } else {
	            System.out.println("Account number does not exist");
	        }
             
	        rs.close();
	        ps.close();
	        con.close();
	        

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
		return balance;

		
	}

	@Override
	public void viewAllAccountsDetails() {
		try {
			Connection con=BankDBconnection.getConnection();
			String sql="select * from accounts";
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getDouble(3));
			}
			ps.close();
			rs.close();
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

		
	}

}
