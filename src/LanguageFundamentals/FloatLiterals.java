package LanguageFundamentals;

public class FloatLiterals {

	public static void main(String[] args) {
		float f1=123;//valid float can hold int
		//float f2=123.5;//not valid you should add f at end
		               //if dont add it treat like double 
		   //and double can not store in float 
		          
		float f3=0123;//valid octal number int o/p 83.0
		float f4=0123.5f;//it is having floating point data 
		                //so even it is octal it treat like decimal only
		float f5=1230;//valid int can be stored in float
		float f6=0x123;//valid hexa decimal int
	//float f7=0x123.5f;//not valid f has ambiguity whether float f or hexadecimal f
		float f8=0b10;//valid binary int o/p:2.0
		float f9=0x123f;//valid hexa decimal int
		float f10=1235f;//valid float 
		double d=0x123d;//valid hexa decimal int
//char literals
		
		char c1='a';//charracter 
		char c2=65;//ascii
		char c3='\u0001';//unicode
		
		System.out.println(f1);//123.0
		System.out.println(f3);//83.0
		System.out.println(f4);//123.5
		System.out.println(f5);//1230.0
		System.out.println(f6);//291.0
		System.out.println(f8);//2.0
		System.out.println(f9);//4671.0
		System.out.println(f10);//1235.0
		System.out.println(d);//4669.0
		System.out.println(c1);//a
		System.out.println(c2);//A
		System.out.println(c3);//?
		//boolean literals are true and false
		boolean b=true;
		boolean b2=false;
		//null literals these are given to objects only not for primitive types
		String s=null;//valid bcz String is object data type
		//int i=null; not valid bcz int is primitive
		

	}

}
