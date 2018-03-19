package com.nupurjaiswal.arraystring;

public class LargestNumInArray {

    public static void main(String[] args) {

        int[] array = {2,78,1,0,92,288,100};
        findLargestNumberInArray(array);


    }

    public static void findLargestNumberInArray(int[] inputArray) {

        int length = inputArray.length;


        if (length > 0) {
            int max = inputArray[0];
            int i;

            for (i = 1; i < length; i++) {
                if (inputArray[i] > max) {
                    max = inputArray[i];

                }

            }
            System.out.println("The largest number in the array is " + max);
        } else {

            System.out.println("Array is empty");
        }


    }
}
