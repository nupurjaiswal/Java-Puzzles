package com.nupurjaiswal.string;

import java.util.*;

public class Anagram {
    /*
    Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies.
    For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.
    Print "Anagrams" if  and  are case-insensitive anagrams of each other; otherwise, print "Not Anagrams" instead.
     */
    public static void main(String[] args) {

        String a = "anagramm";
        String b = "marganaa";

        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagram" : "Not Anagram");
    }

    static boolean isAnagram(String a, String b) {
        // Complete the function

        a = a.toLowerCase();
        b = b.toLowerCase();

        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();

        Arrays.sort(aArray);
        Arrays.sort(bArray);

        String newA = String.valueOf(aArray);
        String newB = String.valueOf(bArray);

        if (newA.equals(newB)) {
            return true;
        } else {
            return false;
        }


    }

    //easy approach
    public static boolean iAnagram(String word, String anagram) {
        char[] charFromWord = word.toCharArray();
        char[] charFromAnagram = anagram.toCharArray();
        Arrays.sort(charFromWord);
        Arrays.sort(charFromAnagram);
        return Arrays.equals(charFromWord, charFromAnagram);
    }


    //another easy approach
    public static boolean checkAnagram(String first, String second) {
        char[] characters = first.toCharArray();
        StringBuilder sbSecond = new StringBuilder(second);
        for (char ch : characters) {
            int index = sbSecond.indexOf("" + ch);
            if (index != -1) {
                sbSecond.deleteCharAt(index);
            } else {
                return false;
            }
        }
        return sbSecond.length() == 0 ? true : false;
    }

}
