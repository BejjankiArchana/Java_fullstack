package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
	public static Connection getConnection() throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/archana";
        String username = "root";
        String password = "SambaSivaRao@756";

        return DriverManager.getConnection(url, username, password);
    }

	

}
