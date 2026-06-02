package LanguageFundamentals;
//we have 4 types of integral literals
//decimal 0 to 9 (base 10)
//octal start with 0 range 0 to 7 (base 8)
//hexadecimal start with 0x range 0 to 9 and a to f or A to F (base 16 )
//Binary start with 0b range 0 and 1 (base 2)

public class IntegralLiterals {

	public static void main(String[] args) {
		int a1=0x123;//hexa decimal 291
		int a2=0xabc;//hexadecimal 2748
		//int a3=0x12abh;//not valid bcz h is not in hexadecimal values
		int a4=0157;//octal 111
	//	int a5=0259;//not valid 9 not in octal range
		int a6=0b10101; //binary 21
		//int a7=0b1201//not valid 2 not in binary numbers
		int i=78;//decimal 78 only
		//int i=67a;//not valid decimals don't have 'a'
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a4);
		System.out.println(a6);
		System.out.println(i);
	

	}

}
