package LanguageFundamentals.constructors.chaining;
//Parent Class
class Parent {
 String company = "Vcube";

 Parent() {
     System.out.println("Parent Constructor Called");
 }

 void displayParent() {
     System.out.println("Parent Method Called");
 }
}

//Helper class for passing object to constructor
class EmployeeDetails {
 EmployeeDetails(Employee emp) {
     System.out.println("Constructor received Employee object: " + emp.name);
 }
}

//Child Class
class Employee extends Parent {

 String name;
 int age;

 // 2. this() to invoke another constructor in the same class
 Employee() {
     this("John", 25);
     System.out.println("Default Constructor Called");
 }

 Employee(String name, int age) {

     // 9. super() to invoke parent class constructor
     super();

     // 1. this to refer current class instance variable
     this.name = name;
     this.age = age;

     System.out.println("Parameterized Constructor Called");
 }

 // 3. this to invoke current class method
 void show() {
     this.display();
 }

 void display() {
     System.out.println("Name : " + this.name);
     System.out.println("Age  : " + this.age);

     // 7. super to access parent class variable
     System.out.println("Company : " + super.company);

     // 8. super to invoke parent class method
     super.displayParent();
 }

 // 4. Pass this as an argument to a method
 void passToMethod() {
     receiveObject(this);
 }

 void receiveObject(Employee emp) {
     System.out.println("Method received object: " + emp.name);
 }

 // 5. Pass this as an argument to a constructor
 void passToConstructor() {
     EmployeeDetails details = new EmployeeDetails(this);
 }

 // 6. Return current class object using this
 Employee getObject() {
     return this;
 }
}

//Main Class
public class ThisSuperDemo {
 public static void main(String[] args) {

     Employee emp = new Employee();

     System.out.println("\n--- Using this to invoke method ---");
     emp.show();

     System.out.println("\n--- Passing this to method ---");
     emp.passToMethod();

     System.out.println("\n--- Passing this to constructor ---");
     emp.passToConstructor();

     System.out.println("\n--- Returning current object using this ---");
     Employee obj = emp.getObject();
     System.out.println("Returned Object Name: " + obj.name);
 }
}