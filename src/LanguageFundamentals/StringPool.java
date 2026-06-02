package LanguageFundamentals;

public class StringPool {
	//String constant pool(scp)

	public static void main(String[] args) {
		String s1="java";
		String s2="java";
		System.out.println(s1==s2);//true both store in  scp
		String s3=new String("java");
		String s4=new String("java");
		System.out.println(s1==s2);//false both store in  heap diff objects
		System.out.println(s1==s3);//false one in pool one in  heap
		String s5="ja"+"va";//compile concatenation with literals
		System.out.println(s1==s5);//true compile concat happens in pool
		String a="ja";
		String b="va";
		String s6=a+b;
		System.out.println(s1==s6);//false runtime concat with variables 
		                            //happens at heap
		String s8=new String("java");
		System.out.println(s1==s2.intern());//true intern()
		                                   //return pool reference
	//when we create string object with new keyword it creare 2 objects
//one in heap other in scp if it is already present in pool then dont create
//so intern() return that pool reference of object
	}

}
