package com.nupurjaiswal.problems;

import java.util.HashSet;


public class CanMakePalindrome {
/*
Instead of counting how many times each letter occurs,
another approach keeps track of whether a letter has occurred an odd or
even number of times. If a letter has occurred an even number of times,
you don’t need to worry about it, and only need to keep track of the odd occurrences in a set. In Java:
 */
    public static void main(String[] args) {
        System.out.println(canPermutationOfStringMakePalindrome("mmo"));
        System.out.println(canPermutationOfStringMakePalindrome("yakak"));
        System.out.println(canPermutationOfStringMakePalindrome("travel"));

    }

     public static boolean canPermutationOfStringMakePalindrome(String input){

         HashSet<Character> oddChars = new HashSet<Character>();

         for (char c: input.toCharArray()){

             if(!oddChars.add(c)){
                 oddChars.remove(c);
             }
         }
        return oddChars.size() <=1;
        }
}
