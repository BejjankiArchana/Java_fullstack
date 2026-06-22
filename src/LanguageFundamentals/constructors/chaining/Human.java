package LanguageFundamentals.constructors.chaining;

public class Human {
	String name;
	String address;
	Human(){
		System.out.println("no arg of human");		
	}

	public static void main(String[] args) {
		System.out.println("main method from human");
		
	}

}
class Person extends Human{
	Person(){
//even you don't write super() it is  called by compiler but if you write explicitly (like this())it dont provide
	//	this("unknown","unknown"); if you un comment this there is no super() exist 
//and it will call this("unknown","unknown)" but that will again call super() so first no arg human,2 arg person,then no arg person
		                                             
		System.out.println("no arg of person"); 
	}
	Person(String name,String address){
		//here also super() present
		System.out.println("2 arg of person");
		this.name=name;
		this.address=address;
		
	}
	
	public static void main(String[]args) {
		System.out.println("main method of person");
		Person p=new Person();
		p.display();
		Person p2=new Person("archana","hydrabad");
		p2.display();
		
		
	}
	void display() {
		System.out.println(name);
		System.out.println(address);
		System.out.println("----------------");
	}
	
}
