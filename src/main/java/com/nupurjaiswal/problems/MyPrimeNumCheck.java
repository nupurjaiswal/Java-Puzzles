package com.nupurjaiswal.problems;

public class MyPrimeNumCheck {

    public boolean isPrimeNumber(int number){

        for(int i=2; i<=number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
    //another approach

    public static boolean isAPrimeNumber(int number){

        boolean isPrime = true;

        for(int i =2;i < number; i++){
            if(number%i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;

    }
    public static void main(String a[]){
        MyPrimeNumCheck mpc = new MyPrimeNumCheck();
        System.out.println("Is 17 prime number? "+mpc.isPrimeNumber(17));
        System.out.println("Is 19 prime number? "+mpc.isPrimeNumber(19));
        System.out.println("Is 15 prime number? "+mpc.isPrimeNumber(15));

        System.out.println(isAPrimeNumber(2));
        System.out.println(isAPrimeNumber(3));

    }
}


