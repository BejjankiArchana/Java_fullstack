package com.StreamApis;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Interviewprep {

	public static void main(String[] args) {
		List<Integer> arr2=Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		List<Integer>arr=new ArrayList<>();
		
		arr=arr2.stream().filter(n->n%2==0).collect(Collectors.toList());
         System.out.println(arr);
         List<String>names=Arrays.asList("archana","sivaji","prasad");
         names=names.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
         System.out.println(names);
         //sum of list
       int sum= arr2.stream().mapToInt(n->n).sum();
       System.out.println(sum);
       //max and min values in list
       int min = arr.stream().mapToInt(n->n).min().getAsInt();
         System.out.println(min);
         int max=arr.stream().mapToInt(n->n).max().getAsInt();
         System.out.println(max);
         //Count numbers greater than 10
         List<Integer>nums=Arrays.asList(11,34,16,19,29,7,34,7,11,100,54);
        long count= nums.stream().filter(n->n>10).count();
        System.out.println(count);
        //Remove duplicate elements using Stream API.
        List<Integer>newnames=new ArrayList<>();
        newnames=nums.stream().distinct().collect(Collectors.toList());
        System.out.println(newnames);
        //Find the first element greater than 50
        int firstgraterthan50 = nums.stream().filter(n-> n>50).mapToInt(n->n).min().getAsInt();
        System.out.println(firstgraterthan50);
        //Find the second-highest number
        int secondhighest=nums.stream().
        		distinct().sorted(Comparator.reverseOrder()).
        		skip(1).
        		findFirst().
        		get();
        System.out.println(secondhighest);
        //secondlowest
        int secondlowest=nums.stream().distinct().sorted().skip(1).findFirst().get();
        System.out.println(secondlowest);
        //find average of list
        double avg= arr2.stream().mapToInt(n->n).average().getAsDouble();
        System.out.println(avg);
        //find whether list is +ve all grater than 0
        boolean result=nums.stream().allMatch(n->n>0);
        System.out.println(result);
        //find whether all divisible by 5
        boolean result1=nums.stream().allMatch(n->n%5==0);
        System.out.println(result1);
        //Find the longest string
        String longest=names.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println(longest);
        //Count the number of strings starting with "A"
        long count1=names.stream().filter(s->s.startsWith("a")|| s.startsWith("A")).count();
        System.out.println(count1);
        
        
	}
}
