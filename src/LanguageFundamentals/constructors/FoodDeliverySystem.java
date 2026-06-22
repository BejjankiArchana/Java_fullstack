package LanguageFundamentals.constructors;

public class FoodDeliverySystem {
	int orderid;
	String cust_name;
	String rest_name;
	String item_name;
	int quantity;
	double price;

	FoodDeliverySystem(){
		System.out.println("no arg constructor called");
		
	}
	FoodDeliverySystem(int orderid,String cust_name,String item_name){
		System.out.println("3 arg constructor called");
		this.orderid=orderid;
		this.cust_name=cust_name;
		this.item_name=item_name;
		
	}
	FoodDeliverySystem(int orderid,String cust_name,String rest_name,String item_name,int quantity){
		System.out.println("5 arg constructor called");
		this.orderid=orderid;
		this.cust_name=cust_name;
		this.rest_name=rest_name;
		this.item_name=item_name;
		this.quantity=quantity;
		
	}
	FoodDeliverySystem(int orderid,String cust_name,String rest_name,String item_name,int quantity,double price){
		System.out.println("6 arg constructor called");
		this.orderid=orderid;
		this.cust_name=cust_name;
		this.rest_name=rest_name;
		this.item_name=item_name;
		this.quantity=quantity;
		this.price=price;
		
	}
	public static void main(String[] args) {
		System.out.println("welcome to FoodDeliverySystem");
		FoodDeliverySystem order1=new FoodDeliverySystem();
		order1.show();
		FoodDeliverySystem order2=new FoodDeliverySystem(101,"siva","chicken biriyani");
		order2.show();
		FoodDeliverySystem order3=new FoodDeliverySystem(102,"reddy","paradice","mutton biriyani",2);
		order3.show();
		FoodDeliverySystem order4=new FoodDeliverySystem(103,"kumar","mehfil","fried rice",3,450);
		order4.show();


	}
	void show() {
		System.out.println(orderid);
		System.out.println(cust_name);
		System.out.println(rest_name);
		System.out.println(item_name);
		System.out.println(quantity);
		System.out.println(price);
		System.out.println("-------------");
		
	}

}
