package com.collections.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestEmployee {

	
	public static void main(String[] args) {
		Employee e1=new Employee(1,"archana",25000.00);
		Employee e2=new Employee(2,"sivaji",35000.00);
		Employee e3=new Employee(3,"anusha",15000.00);
		Employee e4=new Employee(4,"prasad",50000.00);
		Employee e5=new Employee(5,"ramu",75000.00);
		List<Employee>list=Arrays.asList(e1,e2,e3,e4,e5);
		for(Employee e:list) {
		System.out.println(e);
		}
		Collections.sort(list);
		System.out.println("after sorting -----------------------------------");
		for(Employee e:list) {
			System.out.println(e);
			}

	}

}
