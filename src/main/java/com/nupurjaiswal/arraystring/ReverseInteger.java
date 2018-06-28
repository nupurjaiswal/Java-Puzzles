package com.nupurjaiswal.arraystring;

public class ReverseInteger {

    public static void main(String[] args) {

        int sum = 0;
        int r;
        int number = 123;
        int tmp = number;

        while(number>0){
            r = number%10;
            sum = (sum*10)+r;
            number = number/10;




        }


        System.out.println(sum);




    }








}
