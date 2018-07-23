package com.nupurjaiswal.problems;

public class checkIfPrime {


    public static void main(String[] args) {
        System.out.println(simplePrimeCheck(88));
        System.out.println(isPrimeForEvenOddMethod(3));

    }


    public static boolean simplePrimeCheck(int n){

        for(int i = 2; i< n;i++){
            if (n% i ==0){
                return false;
            }

        }return true;
    }

    public static boolean isPrimeForEvenOddMethod(int n){
        if(n%2 == 0){
            return false;
        }
        for (int i = 3; i*i <=n;i+=2){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
