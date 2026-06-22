package com.types_of_methods;

public class MethodsPractice {

	void main() {
        System.out.println("main method");
		method1();
		method2();
		method3();
		method4();
		method5();
	    method6();
		method7();
		method8();
		method9();
		method10();
		method11();
	     method12();
		method13();
		 method14();
		 method15();

	}
	void method1() {
		System.out.println("hello");
	}
	void method2() {
		System.out.println("archana");
	}
	void method3() {
		System.out.println("2026");
	}
	void method4() {
		int n=10;
		for(int i=1;i<=n;i++) {
		System.out.print(i+" ");
	}
		System.out.println();
	}
	void method5() {
		int n=10;
		for(int i=n;i>=1;i--) {
		System.out.print(i+" ");
	}
		System.out.println();
	}
	void method6() {
		int n=20;
		for(int i=1;i<=20;i++) {
			if(i%2==0) {
		System.out.print(i+" ");}
	}
		System.out.println();
	}
	void method7() {
		int n=20;
		for(int i=20;i>=1;i--) {
			if(i%2!=0) {
		System.out.print(i+" ");}
	}
		System.out.println();
	}
	void method8() {
		int n=5;
		for(int i=1;i<=10;i++) {
			
		System.out.println(n+"*"+i+"="+(n*5));}
		System.out.println();
	
	}
	void method9() {
		char ch=65;
		for(int i=ch;i<=90;i++) {
			
		System.out.print((char)i+" ");}
		System.out.println();
	
	}
	void method10() {
		String vowels="AEIOUaeiou";
		for(char ch:vowels.toCharArray()) {
			
		System.out.print(ch+" ");}
		System.out.println();
	
	}
	void method11() {
		String[] weaks= {"MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY","SUNDAY"};
		for(String weak:weaks) {
			
		System.out.print(weak+" ");
		}
		System.out.println();
	
	}
	void method12() {
		String[] months= {"jan","feb","mar","apr","may","june","julay","aug","sep","oct","nov","dec"};
		for(String month:months) {
			
		System.out.print(month+" ");
		}
		System.out.println();
	
	}
	void method13() {
		int target=10;
		int n1=0;
		int n2=1;
		System.out.print(n1+" "+n2+" ");
		for(int i=2;i<=target;i++) {
			int n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
		
		System.out.println();
	
	}
	void method14() {
		int n=50;
		int num=0;
		
		for(int i=2;i<=n;i++) {
			boolean flag=true;
			num=i;
			for(int j=2;j<=num/2;j++) {
				if(num%j==0) {
					flag=false;
					break;
				}
				
			}
			if(flag) {
				System.out.print(num+" ");
			}
		}
		System.out.println();
	}
	void method15() {
		int n=24;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	

}
/*Print "Hello World".
Print your name.
Print current year.
Print numbers 1 to 10.
Print numbers 10 to 1.
Print even numbers from 1 to 20.
Print odd numbers from 1 to 20.
Print multiplication table of 5.
Print square pattern using *.
Print triangle pattern.
Print alphabet A-Z.
Print vowels.
Print days of the week.
Print months of the year.
Print Fibonacci series up to 10 terms.
Print first 20 natural numbers.
Print ASCII values A-Z.
Print prime numbers from 1 to 50.
Print factors of 24.
*/