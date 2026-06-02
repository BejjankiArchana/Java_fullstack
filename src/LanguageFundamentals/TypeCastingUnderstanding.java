package LanguageFundamentals;

public class TypeCastingUnderstanding {
//byte range -128 t0 +127
//if you give out of range you will get compile error
//Type mismatch: cannot convert from int to byte
//by default RHS value is int so it is showing int to byte 
//implicit type casting :high type values(int) can hold low type (byte,short)values
//explicit type casting:low type values cannot hold high type values so we need to
//explicitly cast high to low that is ex (int to byte ) in the given example
//if value is out of byte range (128) so then it will again start from -128
//(-128,-127,-126,.....0,1,2,     126,127)if you type cast out of range values 
	//they will revolve in this loop
	//ex: 128 ->-128
	//129 ->-127
	//130 ->-126       //these will revolve in a loop
	//256 ->0
	//-129 ->127
	//-130 ->126
	
	
	
	static byte b=(byte)127;//because 128 out of range it is considering as int 
	                   //so explicitly changing its type to byte
	
	static byte b1=(byte)256;
	
	//short range -32,768 to 32,767
	static short s=(short)32768; //cannot convert from int to short output:-32,768 again to start
	
	//int range -2,147,483,648 to 2,147,483,647
	static int i=(int)2147483648L;//out of range error first you need to convert RHS to long by adding L at end
	//because rhs is default int after adding L at end you can explicit type cast
	
	//long -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
	static long l=9223372036854775807L;//we can not explicit type cast long because
	//there is no big data type than long to hold it first so you can not revolve in long range

	//but still you can hold long in float because float store in exponential form
	//float range ±3.4 × 10³⁸ (6–7 decimal digits precision)
	static float f=9223372036854775807L;//implicit type casting not explicit
	
	// double range ±1.7 × 10³⁰⁸ (15 decimal digits precision)
	static double d=9223372036854775808d;
	
	public static void main(String[] args) {
		byte b2=127;//local variable gets more preference
		System.out.println(b2++);//127 only after printing it add +1
		System.out.println(b1);//0 because 128+128=256 
		System.out.println(++b);//-128 first add 1 and then type casting
		System.out.println(s);//-32768
		System.out.println(i);//-2147483648
		System.out.println(l);//9223372036854775807
		System.out.println(f);//9.223372E18
		System.out.println(d);//9.223372036854776E18 double will print more decimal values than float

	}

}
