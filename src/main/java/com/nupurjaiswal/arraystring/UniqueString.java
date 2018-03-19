package com.nupurjaiswal.arraystring;
/*
Implement an algorithm to determine if a string has all unique characters
 */
import java.util.HashSet;

public class UniqueString {

    public static void main(String[] args) {

        String name = "Nupur";
        System.out.println(checkIfStringIsUnique(name));


    }

    public static boolean checkIfStringIsUnique(String inputString) {
        char[] charInputArray = inputString.toLowerCase().toCharArray();

        HashSet<Character> charHashSet = new HashSet<Character>();

        for (int i = 0; i < charInputArray.length; i++) {

            charHashSet.add(charInputArray[i]);
        }

        if (charInputArray.length != charHashSet.size()) {

            return false;
        } else {
            return true;
        }


    }
}
