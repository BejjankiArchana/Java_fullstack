package LanguageFundamentals;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerBigDecimal {

	public static void main(String[] args) {
		BigInteger bi1=new BigInteger("5319874941098470198471892749274767676767");
		BigInteger bi2=new BigInteger("7523918736081460812934081648374560893795");
		System.out.println("addition biginteger");
		System.out.println(bi1.add(bi2));
		System.out.println("multiplication biginteger");
		System.out.println(bi1.multiply(bi2));
		System.out.println("subtraction biginteger");
		System.out.println(bi2.subtract(bi1));
		BigDecimal bd1=new BigDecimal("72534674508735068.28764087140184");
		BigDecimal bd2=new BigDecimal("2397118377698768.76058363986947859");
		System.out.println("addition bigdecimal");
        System.out.println(bd1.add(bd2));
		System.out.println(bd1);
       System.out.println("multiplication bigdecimal");
        System.out.println(bd1.multiply(bd2));
       System.out.println("subtraction bigdecimal");
        System.out.println(bd2.subtract(bd1));
        
	}

}
