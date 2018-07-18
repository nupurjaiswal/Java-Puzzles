package com.nupurjaiswal.leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesfromSortedArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeDuplicates(new int[]{1,2,2,2,3,4})));


    }

    public static Integer[] removeDuplicates(int[] nums) {

        HashSet<Integer> hashSet = new HashSet<Integer>();

        for (int i = 0; i<nums.length;i++){
            hashSet.add(nums[i]);
        }
        Integer[] arr = hashSet.toArray(new Integer[hashSet.size()]);
       return arr;

    }
}
