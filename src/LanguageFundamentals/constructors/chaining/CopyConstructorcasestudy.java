package LanguageFundamentals.constructors.chaining;
class Smartphone{
	int productid;
	String productname;
	String brand;
	double price;
	int warrenty_months;
	
}

public class CopyConstructorcasestudy extends Smartphone{
	CopyConstructorcasestudy(){
		
	}
CopyConstructorcasestudy(Smartphone s1){
	this.productid=s1.productid;
	this.productname=s1.productname;
	this.brand=s1.brand;
	this.price=s1.price;
	this.warrenty_months=s1.warrenty_months;
		
	}
	
	

	public static void main(String[] args) {
		Smartphone s1=new Smartphone();
		s1.productid=1;
		s1.productname="SamsungS6";
		s1.brand="samsung";
		s1.price=26500.45;
		s1.warrenty_months=18;
		CopyConstructorcasestudy s2=new CopyConstructorcasestudy(s1);
		//s1.display();
		s2.display();
		

	}
	void display() {
		System.out.println(productid);
		System.out.println(productname);
		System.out.println(brand);
		System.out.println(price);
		System.out.println(warrenty_months);
	}

}
