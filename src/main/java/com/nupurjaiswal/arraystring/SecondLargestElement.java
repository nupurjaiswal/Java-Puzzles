package com.nupurjaiswal.arraystring;

import java.util.Arrays;

public class SecondLargestElement {

    public static void main(String[] args) {
        int a[]={1,2,5,6,3,2};
        System.out.println(findSecondLargestElementInAnArray(a));
        System.out.println(findSecondLargestElementInAnArrayUsingArraySort(a));
        System.out.println(findSecondLargestElementInOneTravel(a));
    }

   public static int findSecondLargestElementInAnArray(int[] array) {


       //We will sort the array using brute force and then

       for (int i = 0; i < array.length; i++) {
           for (int j = i + 1; j < array.length; j++) {

               if (array[i] > array[j]) {
                   int temp = array[i];
                   array[i] = array[j];
                   array[j] = temp;
               }
           }
       }

       return array[array.length - 2];


   }

    public static int findSecondLargestElementInAnArrayUsingArraySort(int[] array){

        Arrays.sort(array);
        return array[array.length-2];
    }


    public static int findSecondLargestElementInOneTravel(int[] array){

        // Initialize these to the smallest value possible
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        System.out.println(highest);
        System.out.println(secondHighest);

        // Loop over the array
        for (int i = 0; i < array.length; i++) {

            // If we've found a new highest number...
            if (array[i] > highest) {

                // ...shift the current highest number to second highest
                secondHighest = highest;

                // ...and set the new highest.
                highest = array[i];
            } else if (array[i] > secondHighest)
                // Just replace the second highest
                secondHighest = array[i];
        }
        return secondHighest;
    }

// After exiting the loop, secondHighest now represents the second
// largest value in the array
    }

