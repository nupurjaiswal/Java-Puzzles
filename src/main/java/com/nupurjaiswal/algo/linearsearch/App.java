package com.nupurjaiswal.algo.linearsearch;

public class App {

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5};

        System.out.println(searchByLinear(input,50));

    }

    public static int searchByLinear(int[] array, int number){



        for (int i =0; i< array.length;i++){
            if (number == array[i])
            {
               return i;
            }
        }
        return -1;
    }
}
