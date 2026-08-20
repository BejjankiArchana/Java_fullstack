package com.jdbc;
import java.sql.*;
public class FirstJdbcClass {

	public static void main(String[] args) throws SQLException {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/archana";
		String username="root";
		String password="SambaSivaRao@756";
		Connection con=DriverManager.getConnection(url,username,password);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from emp");
		while(rs.next()) {
			System.out.println(rs.getInt("eno")+
					" "+rs.getString("ename")+" "+
					rs.getInt("salary"));
		}
		rs.close();
		stmt.close();
		con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		

	}

}
