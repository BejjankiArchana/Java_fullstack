package LanguageFundamentals.constructors;

public class StudentConstructor {
	int id;
	String name;
	String course;
	
	StudentConstructor(){
		System.out.println("no arg constructor called");
		id=100;
		name="abc";
		course="java";
		
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		StudentConstructor s=new StudentConstructor();
		s.display();

	}
	void display() {
		System.out.println("id :"+id);
		System.out.println("name :"+name);
		System.out.println("course :"+course);
	}

}
