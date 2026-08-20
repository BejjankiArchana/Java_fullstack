package com.jdbc.Dao;
import java.sql.CallableStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;


import com.jdbc.DBconnection;
import com.jdbc.LoginApplication;
import com.jdbc.Model.Student;



public class Login implements LoginApplication {

	@Override
	public void insert(Student s) {
		try{
			Connection con = DBconnection.getConnection();
		String sql="INSERT INTO studentlog (name, pass) VALUES (?, ?)";
		 PreparedStatement ps = 
				 con.prepareStatement(sql);

         ps.setString(1, s.getUsername());
         ps.setString(2,s.getPass());

         int rows = ps.executeUpdate();

         if (rows > 0) {
             System.out.println("Data inserted successfully");
         }

         ps.close();
         con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void retrive(String name,String pass) {
		try{
			Connection con = DBconnection.getConnection();
	        
		String sql="SELECT * FROM studentlog WHERE name = ? AND pass = ?";
		 PreparedStatement ps = con.prepareStatement(sql);
		 
         ps.setString(1, name);
         ps.setString(2, pass);

         ResultSet rs = ps.executeQuery();

         if (rs.next()) {
             System.out.println("Login successful");
             System.out.println("Welcome " + rs.getString("name"));
         } else {
             System.out.println("Invalid username or password");
         }
		rs.close();
		ps.close();
		con.close();
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void update(int id, Student s) {
		try {
			Connection con=DBconnection.getConnection();
			String sql1="SELECT * FROM studentlog where id=? ";
			PreparedStatement ps=con.prepareStatement(sql1);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				String sql2="update studentlog set name=?,pass=? where id=? ";
				PreparedStatement ps1=con.prepareStatement(sql2);
				ps1.setString(1, s.getUsername());
				ps1.setString(2, s.getPass());
				ps1.setInt(3, id);
				int rows=ps1.executeUpdate();
				if(rows>0) {
					System.out.println("details updated sucessfully ");
				}
				ps1.close();
				rs.close();
				ps.close();
			}
			else {
				System.out.println("given id does not exist");
			}
			
			con.close();
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int id) {
		try {
		Connection con=DBconnection.getConnection();
		String sql="select * from studentlog where id=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			String sql2="delete from studentlog where id=?";
			PreparedStatement ps1=con.prepareStatement(sql2);
			ps1.setInt(1, id);
			int rows=ps1.executeUpdate();
			if(rows>0) {
				System.out.println(" data deleted sucessfully");
			}
			ps1.close();
			ps.close();
			rs.close();
		}
		else {
			System.out.println("id does not exist");
		}
		con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void selectall() {
		try {
		Connection con=DBconnection.getConnection();
		String sql="select * from studentlog";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("pass"));
		}
		ps.close();
		rs.close();
		con.close();
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void getName(int sid) {
		try {
			Connection con=DBconnection.getConnection();
			CallableStatement cs =
                    con.prepareCall("{call getnameById(?, ?)}");
			cs.setInt(1, sid);	
			cs.registerOutParameter(2,Types.VARCHAR);
				cs.execute();
				String name=cs.getString(2);
				System.out.println("Name = " + name);
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void checkStudent(int sid) {
		try {
			Connection con=DBconnection.getConnection();
			CallableStatement cs =
                    con.prepareCall("{?=call checkStudent(?)}");
			cs.setInt(2, sid);	
			cs.registerOutParameter(1,Types.VARCHAR);
				cs.execute();
				String name=cs.getString(1);
				System.out.println("Name = " + name);
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public void increasenum(int num) {
		try {
			Connection con=DBconnection.getConnection();
			CallableStatement cs =
                    con.prepareCall("{call increasenumber(?)}");
			cs.registerOutParameter(1,Types.INTEGER);
			cs.setInt(1, num);	
			
				cs.execute();
				int number=cs.getInt(1);
				System.out.println("Number " + number);
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
