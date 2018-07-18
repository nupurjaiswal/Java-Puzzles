package com.nupurjaiswal.arraystring;

import java.util.Arrays;
import java.util.HashMap;

/*
Given two string write a method to decide if one string is permutation of the other
 */
public class Permutation {

    public static void main(String[] args) {

        String input1 = "runup";
        String input2 = "nupur";
        System.out.println(checkPermutation(input1,input2));
       System.out.println(checkStringPermutation(input1,input2));
    }


    //Sort the two strings's characters.
    //Compare the results to see if they're identical


   public static boolean checkPermutation(String inputString1, String inputString2){

        char[] array1 = inputString1.toCharArray();
        char[] array2 = inputString2.toCharArray();

       Arrays.sort(array1);
       Arrays.sort(array2);

       return Arrays.equals(array1,array2);

    }


     public static boolean checkStringPermutation(String inputString1, String inputString2){

        if(inputString1.length() != inputString2.length()){
            return false;
        }

         HashMap<Character,Integer> hashMap = new HashMap<Character, Integer>();
        int count = 1;
        for(char c: inputString1.toCharArray()){

            if(!hashMap.containsKey(c)){
                hashMap.put(c,count);
            }else
            {
                hashMap.put(c,count+1);
            }
        }

        for (char c: inputString2.toCharArray()){
            if (!hashMap.containsKey(c)){
                return false;
            }else {
                hashMap.put(c,count-1);
            }
        }
         for(char c: hashMap.keySet())
         {
             if(hashMap.get(c)!=0)
                 return false;
         }
         return true;

     }

    }