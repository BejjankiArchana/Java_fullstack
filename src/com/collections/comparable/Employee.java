package com.collections.comparable;

public class Employee implements Comparable{
	int id;
	String name;
	Double salary;
	public Employee(int id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Object o) {
		Employee e=(Employee)o;
		if(this.salary<e.salary) {
			return -1;//for decending order put +1 here
		}
		else if(this.salary>e.salary) {
			return 1;//for decending order put -1 here
		}
		else {
		return 0;
		}
		//Employee e=(Employee)o;
		//return this.name.compareTo(e.name);
	}
	

}
