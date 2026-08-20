package com.tgh;


import java.util.HashSet;

import java.util.Set;

//Write a Java program using the Java Collections Framework to find all unique pairs of numbers from an 
//integer array whose sum equals a given target value.
//Input: arr[] = {1, 2, 7, 8, 9}, target = 9
//Output: Pairs: (2, 7), (8, 1)



public class UniquePairs {

    public static void main(String[] args) {

        int[] arr = {1, 2, 7, 8, 9};
        int target = 9;

        Set<Integer> set = new HashSet<>();

        System.out.print("Pairs: ");

        for (int num : arr) {

            int complement = target - num;

            if (set.contains(complement)) {
                System.out.print("(" + complement + ", " + num + ") ");
            }

            set.add(num);
        }
    }
}