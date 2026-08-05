package com.StreamApis;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class J8Streams2 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList(
			    "Amit",
			    "Rahul",
			    "Anjali",
			    "Priya",
			    "Kiran",
			    "Sneha",
			    "Vijay"
			);
		System.out.println(names);
		names.forEach(System.out::println);
		List<String> names_start_a=names.stream()
				.filter(s->s.toLowerCase().startsWith("a"))
				.collect(Collectors.toList());
		System.out.println("names start with a/A :"+names_start_a);
		List<String> names_graterthan_length_5=names.stream().filter(s->s.length()>5)
				.collect(Collectors.toList());
		System.out.println("names grater than length 5 :"+names_graterthan_length_5);
		List<String> names_uppercase=names.stream().map(s->s.toUpperCase())
				.collect(Collectors.toList());
		System.out.println("upper case :"+names_uppercase);
		List<String> names_lowercase=names.stream().map(s->s.toLowerCase())
				.collect(Collectors.toList());
		System.out.println("lower case :"+names_lowercase);
		List<String> names_sorted=names.stream().sorted()
				.collect(Collectors.toList());
		System.out.println("sorted :"+names_sorted);
		List<String> names_sorted_reverse=names.stream().sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println("sorted reverse:"+names_sorted_reverse);
		List<String> names_up_sorted=names.stream().map(s->s.toUpperCase()).sorted()
				.collect(Collectors.toList());
		System.out.println("sorted up :"+names_up_sorted);
		List<String> names_length_5=names.stream().filter(s->s.length()==5)
				.collect(Collectors.toList());
		System.out.println("names length 5 :"+names_length_5);
		List<String> names_end_a=names.stream()
				.filter(s->s.toLowerCase().endsWith("a"))
				.collect(Collectors.toList());
		System.out.println("names end with a/A :"+names_end_a);
		
		
		

	}

}
