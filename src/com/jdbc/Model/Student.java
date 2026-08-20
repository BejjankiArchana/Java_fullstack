package com.jdbc.Model;

public class Student {
     private String username;
     private String pass;
     public Student(){
    	 
     }
     public Student(String username,String pass){
     	 this.setUsername(username);
     	 this.setPass(pass);
      }
	 public String getUsername() {
		return username;
	 }
	 public void setUsername(String username) {
		this.username = username;
	 }
	 public String getPass() {
		return pass;
	 }
	 public void setPass(String pass) {
		this.pass = pass;
	 }
   
}
