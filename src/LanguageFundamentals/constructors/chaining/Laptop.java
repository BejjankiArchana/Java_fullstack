package LanguageFundamentals.constructors.chaining;

public class Laptop {
	int id;
	String brand;
	String colour;
	int genaration;
	String processor;
	
	Laptop() {
	    this(100);
	}
	Laptop(int id) {
	    this(id, "Dell");
	}
	

	Laptop(int id, String brand) {
	    this(id, brand, "Black");
	}
	Laptop(int id, String brand,String colour) {
	    this(id, brand, colour, 10);
	}
	

	Laptop(int id, String brand, String colour, int genaration) {
	    this(id, brand, colour, genaration, "i5");
	}

	Laptop(int id, String brand, String colour, int genaration, String processor) {
	    this.id = id;
	    this.brand = brand;
	    this.colour = colour;
	    this.genaration = genaration;
	    this.processor = processor;
	}

	public static void main(String[] args) {
		System.out.println("main method");
		Laptop l1=new Laptop();
		l1.show();
		Laptop l2=new Laptop(101);
		l2.show();
		Laptop l3=new Laptop(102,"lenovo");
		l3.show();
		Laptop l4=new Laptop(103,"dell","blue");
		l4.show();
		Laptop l5=new Laptop(104,"apple","red",12);
		l5.show();
		Laptop l6=new Laptop(105,"asus","blue",13,"i7");
		l6.show();
		

	}
	void show() {
		System.out.println(id);
		System.out.println(brand);
		System.out.println(colour);
		System.out.println(genaration);
		System.out.println(processor);
		System.out.println("----------------------");
	}

}
