package com.opps;
//this is a fully encapsulated class
//called as POJO ->plain old java object
//DTO->Data transfer object
//Model->data model
//Encapsulation :It is the process of combining data (variables) and the methods (functions) that operate 
//on that data into a single unit, called a class, while restricting direct access to its variables
//adwantages of encapsulation
//Data hiding: Prevents unauthorized access to data.
//Security: Ensures data is modified only in valid ways.
//Flexibility: Internal implementation can change without affecting other code.
//Maintainability: Makes code easier to manage and debug.

public class EncapStudent {
    int id;
   private String name;
   private int marks;
   
   EncapStudent(){
	   //no arg constructor
   }
   //all arg constructor
   
   EncapStudent(int id,String name,int marks){
	   this.id=id;
	   this.name=name;
	   this.marks=marks;
   }
   public int getId() {
		return id;
	}

	   public void setId(int id) {
		this.id = id;
	   }

	   public String getName() {
		return name;
	   }

	   public void setName(String name) {
		this.name = name;
	   }

	   public int getMarks() {
		return marks;
	   }

	   public void setMarks(int marks) {
		this.marks = marks;
	   }
	   @Override
	  public String toString(){
		   return "id :"+id+" Name : "+name+" Marks :"+marks;
		   
	   }

   
   
   
}
