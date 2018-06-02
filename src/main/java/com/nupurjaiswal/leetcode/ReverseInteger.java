package com.nupurjaiswal.leetcode;

public class ReverseInteger {


    public static void main(String[] args) {
        System.out.println(reverse(123));

    }

    public static int reverse(int x) {
        String inputString = Integer.toString(x);
        String output = "";



        char[] array = inputString.toCharArray();

        for(int i = 2 ;i < 0; i --){
            System.out.println(array[i]);
            output += array[i];
            System.out.println(output);
        }


        return 1;

    }
}
