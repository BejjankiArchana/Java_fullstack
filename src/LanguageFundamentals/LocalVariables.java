package LanguageFundamentals;

public class LocalVariables {
	static int a=10;//global variable

	public static void main(String[] args) {
		
      int a=100;//local variable
      System.out.println(a);//100 bcz local variable get highest priyority
      //if you want global variable class_name.variable
      System.out.println(LocalVariables.a);//10
      //no default values for local variables
      int i;//you can declare but you can not use with out initializing
      i=0;//you need to initialize then you can use
      
	}

}
