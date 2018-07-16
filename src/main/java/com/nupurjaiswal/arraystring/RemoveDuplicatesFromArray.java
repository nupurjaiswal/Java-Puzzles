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
    /*
    int[] arr = {4, 3, 4, 2, 6, 1, 1, 7, 6, 8, 9, 9, 1, 1};
    Set<Integer> set = new HashSet<Integer>();
    for (int n : arr)
    set.add(n);
    Integer[] arr2 = set.toArray(new Integer[set.size()]);
    System.out.println("Unique elements in Array :" + Arrays.toString(arr2));
     */
}
