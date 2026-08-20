package com.jdbc;

import com.jdbc.Model.Student;

public interface LoginApplication {
	 void insert(Student s);
	 void retrive(String uname,String pass);
	 void update(int id,Student s);
	 void delete(int id);
	 void selectall();
	 void getName(int id);//procedure with return
	 void checkStudent(int id);//function with varchar return
	 public void increasenum(int num);//procedure with inout parameter

}
