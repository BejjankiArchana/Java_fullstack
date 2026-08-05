package com.StreamApis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Streams1 {

	public static void main(String[] args) {
		List<Integer>l1=Arrays.asList(10,7,23,6,4,14);
		List<Integer>l2=l1.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(l1);
		System.out.println(l2);
		List<String>l3=Arrays.asList("archana","prasad","sivAji","ganesh","anusha","parvathi");
		List<String>l4=l3.stream().filter(s->s.contains("a")).collect(Collectors.toList());
		System.out.println(l3);
		System.out.println(l4);
		List<Double>salaries=Arrays.asList(10000.00,25000.00,36000.00,78000.00,67000.00);
		//we can update the same list also using streams no need of another list
		salaries=salaries.stream().map(s->s+5000).filter(s->s<=50000).sorted().collect(Collectors.toList());
		System.out.println(salaries);
		List<String>l5=Arrays.asList("archana","prasad","sivAji","ganesh","anusha","parvathi");
		l5=l5.stream().map(s->s+"jfs-batch-73").collect(Collectors.toList());
		l5.forEach(System.out::println);

}
}