package LanguageFundamentals;

import java.math.BigInteger;

public class DataTypes2 {
	//char range 0 to 65535
	//'\u0000' to '\uffff' hexadecimal values space '\u0020'
	//A->65  Z->90  a->97    z122->
	
	public static void main(String[] args) {
		int a='a';
		System.out.println(a);
		long b='a';
		System.out.println(b);
		float c='a';
		System.out.println(c);
		double d='a';
		System.out.println(d);
		char ch=65;
		System.out.println(ch);
		Integer i=10;//auto boxing int to integer
		int j=i;//auto un boxing integer to int
		//Integer k=null;
		//int g=k;//no compile but at run time you will get null pointer exception
	
		System.out.println(j);
		//System.out.println(g);
		
		BigInteger bi=new BigInteger("10007492387280293040194894370109380139");
		//big integer does not accept integers
		//causes this error because BigInteger constructors expect:
		 //String or a byte[] or other internal formats
		System.out.println(bi);
		byte x=10;
		//x=x+10; //Type mismatch: cannot convert from int to byte
		//here it treat like x= (int)x + (int)10
		x=(byte)(x+10);//now no error bcz x+10 is converting to int after addition
//In Java, arithmetic operations on byte, short, and char are automatically promoted to int.
		x+=10;//but no error here bcz it treat like x = (byte)(x + 10);
		Character cha=null;//true bcz Character is object
		Float fl=null;
		Long lg=null;   //all are objects so true and these provide auto boxing and un boxing
		Byte by=null;
		Short sh=null;
		Integer it=null;
		double u=0/0.0; //output NaN
		System.out.println(u);
		long l = 1000 * 1000 * 1000 * 1000;//over flow occuring before assigning to long
		System.out.println(l);//-727379968
		
		
	}

}
