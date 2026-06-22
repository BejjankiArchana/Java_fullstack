package com.types_of_methods;

import java.util.Scanner;

public class Student {
	static int count=0;
	int id;
	String name;
    double marks;
    {
    	count++;
    }
    void displayWelcome() {
    	System.out.println("welcome to student management system ");
    }
    Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		Student st=new Student();
		st.displayWelcome();
		st.SetStudentDetails(st);
		st.getdetails(st);
		
		System.out.println(st.id+" "+st.name+" "+st.marks);
		int marks=st.getMarks();
		int bonus=st.calculateBonusMarks(marks);
		System.out.println(bonus);
		displayCollagename();
		int count=displayTotalStudents();
		System.out.println(count);
	}
	Student getdetails(Student s) {
		System.out.println("enter student id :");
		 s.id=sc.nextInt();
		 System.out.println("enter student name :");
		 s.name=sc.next();
		 System.out.println("enter student marks :");
		 s.marks=sc.nextDouble();
		return s;
	}
	void SetStudentDetails(Student s) {
		System.out.println("enter student id :");
		 s.id=sc.nextInt();
		 System.out.println("enter student name :");
		 s.name=sc.next();
		 System.out.println("enter student marks :");
		 s.marks=sc.nextDouble();
		 System.out.println(s.id+" "+s.name+" "+s.marks);
		 
		 System.out.println("--------------------");
		
	}
	int getMarks() {
		System.out.println("enter marks:");
		int marks=sc.nextInt();
		return marks;
	}
	int calculateBonusMarks(int marks){
		System.out.println("enter bonus marks:");
		int bonus=sc.nextInt();
		return marks+bonus;
		
	}
	static void displayCollagename() {
		System.out.println("v cube");
	}
	static int displayTotalStudents() {
		return count;
	}

}
