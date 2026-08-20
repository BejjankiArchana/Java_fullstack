package com.jdbc.controler;

import java.util.Scanner;

import com.jdbc.Dao.Login;
import com.jdbc.Model.Student;

public class TestStudent {

	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	    Login l = new Login();

	    while (true) {

	        System.out.println("\n========== LOGIN APPLICATION ==========");
	        System.out.println("1. Register");
	        System.out.println("2. Login");
	        System.out.println("3. Update");
	        System.out.println("4. Delete");
	        System.out.println("5. View All Students");
	        System.out.println("6. getnameby id");
	        System.out.println("7. checkStudentby id");
	        System.out.println("8. increase num");
	        System.out.println("9. Exit");
	        System.out.print("Enter your choice: ");

	        int choice = sc.nextInt();

	        switch (choice) {

	        case 1:
	            System.out.print("Enter username: ");
	            String username = sc.next();

	            System.out.print("Enter password: ");
	            String pass = sc.next();

	            Student s = new Student(username, pass);
	            l.insert(s);
	            break;

	        case 2:
	            System.out.print("Enter username: ");
	            String name = sc.next();

	            System.out.print("Enter password: ");
	            String password = sc.next();

	            l.retrive(name, password);
	            break;

	        case 3:
	            System.out.print("Enter ID: ");
	            int id = sc.nextInt();

	            System.out.print("Enter new username: ");
	            String newUsername = sc.next();

	            System.out.print("Enter new password: ");
	            String newPassword = sc.next();

	            Student student = new Student();
	            student.setUsername(newUsername);
	            student.setPass(newPassword);

	            l.update(id, student);
	            break;

	        case 4:
	            System.out.print("Enter ID: ");
	            int deleteId = sc.nextInt();

	            l.delete(deleteId);
	            break;

	        case 5:
	            l.selectall();
	            break;

	        case 6:
	        	System.out.print("Enter ID: ");
	            int selectId = sc.nextInt();

	            l.getName(selectId);
	            break;
	        case 7:
	        	System.out.print("Enter ID: ");
	            int chechId = sc.nextInt();

	            l.checkStudent(chechId);
	            break;
	        case 8:
	        	System.out.print("Enter a number: ");
	            int num = sc.nextInt();

	            l.increasenum(num);
	            break;
	        case 9:
	            System.out.println("Thanks for using my application!");
	            sc.close();
	            return;

	        default:
	            System.out.println("Invalid choice");
	        }
	    }
	}

}
