package LanguageFundamentals.constructors;

public class Test {
	

	void main() {
		
      System.out.println(hello()); 
	}
int hello() {
	try {
		return 10;
	}
	catch(Exception e){
		return 20;
	}
	finally {
		return 30;
	}
}
}
