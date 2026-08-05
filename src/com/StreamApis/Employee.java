package com.StreamApis;

public class Employee {
	public Employee(int id,String name,int age,double salary,String department) {
		   this.id=id;
		   this.name=name;
		   this.age=age;
		   this.salary=salary;
		   this.department=department;
	   }
		private int id;
		private String name;
		private int age;
	    private double salary;
	   private String department;
	   
	   public void setId(int id) {
			this.id = id;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
	  
	   public int getid() {return id;};
	   
	   public String getname() {return name;};
	   
	   public int getage() {return age;};
	   
	   public double getsalary() {return salary;};
	   
	   public String getdepartment() {return department;};
	   
	   @Override
	   public String toString() {
		   return id+" "+name+" "+age+" "+salary+" "+department;
		   
	   }
}
