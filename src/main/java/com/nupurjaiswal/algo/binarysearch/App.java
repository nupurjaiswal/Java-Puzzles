package com.nupurjaiswal.algo.binarysearch;

public class App {

    public static void main(String[] args) {

        System.out.println(binarySearch(new int[]{1, 3, 4, 5, 6, 7}, 7));

    }

    public static int binarySearch(int[] array, int x) {

        int p = 0;
        int r = array.length - 1;

        while (p <= r) {

            int q = (p + r) / 2;
            if (x < array[q]) r = q - 1;
            else if (x > array[q]) p = q + 1;
            else return q;


        }
        return -1;


    }
}
