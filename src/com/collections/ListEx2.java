package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

public class ListEx2 {

	public static void main(String[] args) {
	List<String>teamA=new ArrayList<>();
	teamA.add("archana");
	teamA.add("sivaji");
	teamA.add("prasad");
	List<String>teamB=new ArrayList<>();
	teamB.add("gdch");
	teamB.add("bvascnb");
	teamB.add("abvscxm");
	List<String>teamc=new ArrayList<>();
	teamc.add("nbfn");
	teamc.add("hbjshgc");
	List<String>allteams=new ArrayList<>();
	allteams.addAll(teamA);
	allteams.addAll(teamB);
	allteams.addAll(2, teamc);
	System.out.println(allteams);
	//we have remove(int index)
	//remove(Element e)
	allteams.remove(4);//index 4 element is removed
	allteams.remove("archana");
	System.out.println(allteams);
	//what if you want to remove element from integer collection then
	List<Integer>l1=new ArrayList<>();
	l1.add(10);
	l1.add(20);
	l1.add(30);
	l1.add(40);
	l1.add(50);
	l1.add(10);
	//l1.remove(20);//gives index out of bounds exception bcz here 20 is treat like index
	l1.remove(l1.indexOf(20));//now it will delete 20
	System.out.println(l1);
	System.out.println(l1.get(3));
	System.out.println(l1.get(3).equals(50));
	
	System.out.println(l1.lastIndexOf(10));
	//if duplicates present it will give last duplicate element index 
	l1.set(0, 70);//replace the old element by new element
	System.out.println(l1);
	Object[]arr=l1.toArray();//converting list to array
	
	//array to list
	Integer[]arr1= {1,2,3,4,5};
	List<Integer>l2=Arrays.asList(arr1);
	System.out.println(l2);
	
	//list to String array
	List<String> list = new ArrayList<>();

    list.add("Apple");
    list.add("Banana");
    list.add("Mango");

    String[] arr2 = list.toArray(new String[0]);

    System.out.println(Arrays.toString(arr2));
	
	//list to int array
    List<Integer> li = Arrays.asList(10, 20, 30);

    Integer[] arr3 = li.toArray(new Integer[0]);

    System.out.println(Arrays.toString(arr3));
	
	//array to list
   
	

	}

}
