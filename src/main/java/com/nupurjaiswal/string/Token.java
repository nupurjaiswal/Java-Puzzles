package com.nupurjaiswal.string;

import java.util.Scanner;

/*
Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
We define a token to be one or more consecutive English alphabetic letters.
 Then, print the number of tokens, followed by each token on a new line
 */
public class Token {

    public static void main(String[] args) {

        String s = "He is a very very good boy, isn't he?";
        // Write your code here.
        String[] inputArray = s.replaceFirst("^\\W+", "").split("[\\s!,?._'@]+");
        System.out.println(inputArray.length);
        for(int i = 0; i < inputArray.length; i ++){
            System.out.println(inputArray[i]);

        }


    }
}
