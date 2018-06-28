package com.nupurjaiswal.arraystring;

import java.util.HashSet;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {

        int[] array = {1, 1, 2, 3, 4, 9, 34, 11, 2};

        removeDuplicatesUsingHashset(array);

    }

    public static void removeDuplicatesUsingHashset(int[] array) {
        HashSet<Integer> hashset = new HashSet<Integer>();

        for (int i = 0; i < array.length; i++) {
            hashset.add(array[i]);
        }
        System.out.println(hashset);


    }

    public static void removeDuplicateSortedArray(int[] array){

    }
}
