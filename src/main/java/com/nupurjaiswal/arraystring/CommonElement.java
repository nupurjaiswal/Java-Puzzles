package com.nupurjaiswal.arraystring;

import java.util.*;

class CommonElements {
    public static void main(String[] args) {
        Integer[] i1 = {1, 2, 3, 4, 5, 4};

        Integer[] i2 = {3, 4, 5, 6, 7, 4};

        HashSet<Integer> set1 = new HashSet<Integer>(Arrays.asList(i1));

        HashSet<Integer> set2 = new HashSet<Integer>(Arrays.asList(i2));

        set1.retainAll(set2);

        // System.out.println(set1);     //Output : [3, 4, 5]

        System.out.println(findCommonElement(i1, i2));

    }


    public static HashSet<Integer> findCommonElement(Integer[] array1, Integer[] array2) {

        HashSet<Integer> outputHashSet = new HashSet<Integer>();


        for (int i = 0; i < array1.length; i++) {

            for (int j = 0; j < array2.length; j++) {

                if (array1[i] == array2[j]) {
                    outputHashSet.add(array1[i]);
                }


            }

        }

        return outputHashSet;


    }
}
