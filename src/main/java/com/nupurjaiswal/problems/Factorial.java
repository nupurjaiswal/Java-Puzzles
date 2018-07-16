package com.nupurjaiswal.problems;

public class Factorial {


    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(5));
    }


    public static int factorial(int n){

        int result = 1;

        while(n > 0){

            result = result*n;
            n--;

        }

        return result;

    }


    public static int fact(int n){
        return n * fact(n-1);


    }
}
