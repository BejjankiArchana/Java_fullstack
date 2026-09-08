package com.collections.comparable;

import java.util.HashSet;
import java.util.Set;

public class TestStudentEx {

	public static void main(String[] args) {
		Student s1=new Student(101,"archana");
		Student s2=new Student(101,"archana");
		Student s3=new Student(103,"archana");
		Student s4=new Student(103,"sivaji");
		Student s5=new Student(104,"prasad");
		Student s6=new Student(105,"prasad");
		Set<Student>set=new HashSet<>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		set.add(s6);
		System.out.println(set.size());
		System.out.println(set);

	}

}
