package com.java8Features;
interface in11{
	void hello();
	void show();
}//any no of abstract methods we can impliment with anonamus inner classes

public class InterfacewithAnonymusinnerclasses {

	public static void main(String[] args) {
		in11 i=new in11(){//this is not creating object interface it is how anonymus inner class created
			//with open and close curly braces and semi colon at end
			@Override
			public void hello() {
				System.out.println("first abstract method");
			}
			@Override
			public void show() {
				System.out.println("second abstract method");
			}
			//all the abstract methods of interface need to impliment other wise compile error
			
		};//ending of inner class
		i.hello();
		i.show();

	}

}
