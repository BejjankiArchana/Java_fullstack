package com.StreamApis;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class j8Streams3 {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
			    new Employee(101, "Amit", 25, 45000, "IT"),
			    new Employee(102, "Priya", 30, 65000, "HR"),
			    new Employee(103, "Rahul", 28, 55000, "IT"),
			    new Employee(104, "Sneha", 35, 75000, "Finance"),
			    new Employee(105, "Kiran", 22, 40000, "IT"),
			    new Employee(106, "Anjali", 29, 80000, "HR"),
			    new Employee(107, "Vijay", 32, 60000, "Testing")
			);
		//Print only names.
		System.out.println("1.Print only names :");
		employees.stream().map(Employee::getname).forEach(System.out::println);
		//Print employees whose salary is greater than 60000.
		System.out.println("2.Print only namesPrint employees whose salary is greater than 60000 :");
		employees.stream().filter(e->e.getsalary()>60000).forEach(System.out::println);
		//Print employees from IT department.
		System.out.println("3.Print employees from IT department :");
		employees.stream().filter(e->e.getdepartment().equals("IT")).forEach(System.out::println);
		//Print employees older than 30.
		System.out.println("4.Print employees older than 30 :");
		employees.stream().filter(e->e.getage()>30).forEach(System.out::println);
		//Print only salaries.we can use map also for each loop also
		System.out.println("5.Print only salaries :");
		employees.forEach(System.out::println);
		for(Employee e:employees) {
			System.out.println(e.getsalary());
		}
		//Increase every salary by 5000 and print.
		System.out.println("6.Increase every salary by 5000 and print.");
		employees.stream().map(e->e.getsalary()+5000).forEach(System.out::println);
		//Print employee names in uppercase.
		System.out.println("6.Print employee names in uppercase. :");
		employees.stream().map(e->e.getname().toUpperCase()).forEach(System.out::println);
		//Sort employees by salary.
		System.out.println("7.Sort employees by salary.");
		employees.stream().sorted(Comparator.comparing(Employee::getsalary)).forEach(System.out::println);
		//Sort employees by age.
		System.out.println("8.Sort employees by age.:");
		employees.stream().sorted(Comparator.comparing(Employee::getage)).forEach(System.out::println);
		//Sort employees by name.
		System.out.println("9.Sort employees by name.");
		employees.stream().sorted(Comparator.comparing(Employee::getname)).forEach(System.out::println);
		//Print IT employees sorted by salary.
		System.out.println("10.Print IT employees sorted by salary.:");
		employees.stream().filter(e->e.getdepartment().equals("IT")).
		sorted(Comparator.comparing(Employee::getsalary)).forEach(System.out::println);
		//Print employees with salary > 50000 sorted by name.
		System.out.println("11.Print employees with salary > 50000 sorted by name.");
		employees.stream().filter(e->e.getsalary()>50000)
		.sorted(Comparator.comparing(Employee::getname))
		.forEach(System.out::println);
		//Print employee names whose age > 28.
		System.out.println("12.Print employee names whose age > 28.");
		employees.stream().filter(e->e.getage()>28).map(Employee::getname).forEach(System.out::println);
		//Print HR employees sorted by salary.
		System.out.println("13.Print HR employees sorted by salary.");
		employees.stream().filter(e->e.getdepartment().equals("HR"))
		.sorted(Comparator.comparing(Employee::getsalary)).forEach(System.out::println);

	}

}
