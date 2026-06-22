package LanguageFundamentals.constructors.chaining;

public class Account {
	long account_no;
	String acc_holder_name;
	Account(){
		this(123456789l,"bejjanki archana");
		System.out.println("no arg of parent");
		
	}
Account(long account_no,String acc_holder_name ){
	System.out.println("2 arg of parent");
	this.acc_holder_name=acc_holder_name;
	this.account_no=account_no;
		
	}
	

	public static void main(String[] args) {
		

	}

}
 class SavingsAccount extends Account{ 
	double balance;
	SavingsAccount(){
		this(0.0);
		System.out.println("no arg of child");
		
	}
SavingsAccount(double balance){
	System.out.println("1 arg of child");
	this.balance=balance;
		
	}
	
	
      public static void main(String[] args) {
    	  System.out.println("main method");
    	  SavingsAccount s1= new SavingsAccount();
    	  s1.display();
    	  SavingsAccount s2= new SavingsAccount(40000.00);
    	  s2.display();
		

	}
      void display() {
    	  System.out.println(account_no+" :"+acc_holder_name+" :"+balance);
    	  
      }
	
	
}