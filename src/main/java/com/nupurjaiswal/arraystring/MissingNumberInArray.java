package com.nupurjaiswal.arraystring;

/*Java Program to find missing numbers
 *
 */
public class MissingNumberInArray {

    public static void main(String[] args) {
        System.out.println(findMissingNumberFromArray(new int[]{1, 2, 3, 4, 6},6));


    }

    public static int findMissingNumberFromArray(int[] array, int count){

        int expectedSum = count*(count+1)/2;

        int actualSum = 0;

        for(int i:array){
            actualSum+=i;
        }

        return  expectedSum-actualSum;

    }



}
