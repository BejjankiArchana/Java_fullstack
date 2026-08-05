package com.java8Features;

import java.util.function.Predicate;

//Predicate<T>-->boolean test(T t)
//Function<T,R> -->R apply(T t)
//Consumer<T> ---> accept(T t)
//Supplier  ---->R get()

public class PridicateEx1 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Predicate<Integer> p1=i->i%2==0;
		System.out.println(p1.test(5));
		Predicate<String> p2=s->s.contains("i");
		System.out.println(p2.test("archana bejjanki"));
		Predicate<Character> p3=ch->{
			if(ch>='a' && ch<='z') {
				return true;
			}
			return false;
		};
		System.out.println(p3.test('c'));
		Predicate<Boolean> p4=p->!p;
		System.out.println(p4.test(true));
		

	}

}
