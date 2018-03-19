package com.nupurjaiswal.arraystring;

import java.util.HashSet;
/*
Given two string write a method to decide if one string is permutation of the other
 */
public class Permutation {

    public static void main(String[] args) {

        String input1 = "runup";
        String input2 = "nupur";
        System.out.println(checkIfStringIsPermutation(input1, input2));
    }

    public static boolean checkIfStringIsPermutation(String inputString1, String inputString2) {


        HashSet<Character> input1HashSet = new HashSet<Character>();
        HashSet<Character> input2HashSet = new HashSet<Character>();

        if (inputString1.length() == inputString2.length()) {
            for (char a : inputString1.toCharArray()) {

                input1HashSet.add(a);

            }

            for (char b : inputString2.toCharArray()) {

                input2HashSet.add(b);
            }

            if (input1HashSet.size() == input2HashSet.size()) {
                for (char b : inputString2.toCharArray()) {

                    if (!input1HashSet.contains(b)) {

                        return false;
                    }

                }
                return true;
            } else {
                return false;
            }


        } else {
            return false;
        }


    }
}