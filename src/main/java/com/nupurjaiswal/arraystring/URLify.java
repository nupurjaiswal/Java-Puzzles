package com.nupurjaiswal.arraystring;
/*
Write a method to replace all spaces in a string with "%20". You are given the true length of the string
 */
public class URLify {


    public static void main(String[] args) {

        replaceSpaces("Mr John Smith      ", 13);


    }

    public static void replaceSpaces(String inputString, int length) {

        char[] inputStringCharArray = inputString.toCharArray();

        for (int i = 0; i < length; i++) {
            if (inputStringCharArray[i] == ' ') {

                System.out.print("%20");


            } else {
                System.out.print(inputStringCharArray[i]);
            }

        }


    }
}
