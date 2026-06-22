package LanguageFundamentals.constructors;

public class Employee {
	String name;
	int id;
	String dept;
	Double sal;
	int bonus;
	String mobile;
	String address;
	int leaves;
	String dob;
	
	Employee(){
	System.out.println("no arg constructor called");	
	}
Employee(int id){
	System.out.println("1 arg constructor int id called");	
		this.id=id;
	}
Employee(String name){
	System.out.println("1 arg constructor string name called");	
	this.name=name;
	
}
Employee(Double sal){
	System.out.println("1 arg constructor double sal called");	
	this.sal=sal;
	
}
Employee(Double sal,int bonus){
	System.out.println("2 arg constructor Double sal,int bonus called");
	this.sal=sal;
	this.bonus=bonus;
	
}
Employee(String name,String mobile){
	System.out.println("2 arg constructor String name,String mobile called");
	this.name=name;
	this.mobile=mobile;
	
	
}
Employee(String name,int id,String dept){
	System.out.println("3 arg constructor String name,int id,String dept called");
	this.name=name;
	this.id=id;
	this.dept=dept;
	
}
Employee(String name,int id,Double sal){
	System.out.println("3 arg constructor String name,int id,String dept called");
	this.name=name;
	this.id=id;
	this.sal=sal;
	
}
Employee(String name,int id,Double sal,int bonus){
	System.out.println("4 arg constructor String name,int id,String dept called");
	this.name=name;
	this.id=id;
	this.sal=sal;
	this.bonus=bonus;
	
}
Employee(String name,int id,Double sal,int bonus,String mobile){
	System.out.println("5 arg constructor String name,int id,String dept called");
	this.name=name;
	this.id=id;
	this.sal=sal;
	this.bonus=bonus;
	this.mobile=mobile;
	
}
Employee(String name,int id,Double sal,int bonus,String mobile,String address){
	System.out.println("6 arg constructor String name,int id,String dept called");
	this.name=name;
	this.id=id;
	this.sal=sal;
	this.bonus=bonus;
	this.mobile=mobile;
	this.address=address;
	
}
Employee(String name,int id,Double sal,int bonus,String mobile,String address,int leaves){
	System.out.println("7 arg constructor String name,int id,String dept called");
	this.name=name;
	this.id=id;
	this.sal=sal;
	this.bonus=bonus;
	this.mobile=mobile;
	this.address=address;
	this.leaves=leaves;
	
}
Employee(String name,int id,Double sal,int bonus,String mobile,String address,int leaves,String dob){
	System.out.println("8 arg constructor String name,int id,String dept called");
	this.name=name;
	this.id=id;
	this.sal=sal;
	this.bonus=bonus;
	this.mobile=mobile;
	this.address=address;
	this.leaves=leaves;
	this.dob=dob;
	
}




	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.show();
		Employee e2=new Employee(100);
		e2.show();
		Employee e3=new Employee("archana");
		e3.show();
		Employee e4=new Employee(30000.0);
		e4.show();
		Employee e5=new Employee(30000.0,100);
		e5.show();
		Employee e6=new Employee("archana","7569086544");
		e6.show();
		Employee e7=new Employee("archana",100,"jfs");
		e7.show();
		Employee e8=new Employee("archana",100,80000.0);
		e8.show();
		
		Employee e9=new Employee("archana",100,30000.0,12000);
		e9.show();
		Employee e10=new Employee("archana",100,30000.0,12000,"7569086744");
		e10.show();
		Employee e11=new Employee("archana",100,30000.0,12000,"7569086544","kphb phase-3");
		e11.show();
		Employee e12=new Employee("archana",100,30000.0,12000,"7569086544","kphb phase-3",12);
		e12.show();
		Employee e13=new Employee("archana",100,30000.0,12000,"7569086544","kphb phase-3",12,"13-05-2001");
		e13.show();
		Employee e14=new Employee("archana",100,80000.0);
		e14.show();
		Employee e15=new Employee("archana",100,80000.0);
		e15.show();
		Employee e16=new Employee("archana",100,80000.0);
		e16.show();
		

	}
	void show() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(dept);
		System.out.println(sal);
		System.out.println(bonus);
		System.out.println(mobile);
		System.out.println(address);
		System.out.println(leaves);
		System.out.println(dob);
		System.out.println("-------------------");
	}

}
