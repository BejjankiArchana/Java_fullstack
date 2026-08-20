package com.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BankDBconnection {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/bank_db";
		String username="root";
		String password="SambaSivaRao@756";
		return DriverManager.getConnection(url, username, password);

}
}