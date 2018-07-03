package com.nupurjaiswal.leetcode;

import java.util.HashSet;

public class RemoveDuplicatesfromSortedArray {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,2,2,2,3,4}));

    }

    public static int removeDuplicates(int[] nums) {

        HashSet<Integer> hashSet = new HashSet<Integer>();

        for (int i = 0; i<nums.length;i++){
            hashSet.add(nums[i]);
        }

       return hashSet.size();

    }
}
