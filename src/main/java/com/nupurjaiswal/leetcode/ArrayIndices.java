package com.nupurjaiswal.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
  
 */

public class ArrayIndices {

	public static void main(String[] args) {

		int[] input = { 2, 7, 11, 15 };
		int target = 9;

		// System.out.println(Arrays.toString(bruteForceSolution(input, target)));
		System.out.println(Arrays.toString(hashMapApproach(input, target)));
	}

	/*
	 * Complexity Analysis
	 * 
	 * Time complexity : O(n^2). For each element, we try to find its complement by
	 * looping through the rest of array which takes O(n)O(n) time. ​​ Space
	 * complexity : O(1)
	 */
	public static int[] bruteForceSolution(int[] nums, int target) {

		int arrayLength = nums.length;

		for (int i = 0; i < arrayLength; i++) {

			for (int j = i + 1; j < arrayLength; j++) {

				if (nums[j] == target - nums[i]) {

					return new int[] { i, j };

				}

			}

		}

		throw new IllegalArgumentException("No two sum solution");
	}

	/*
	 * Time complexity : O(n)O(n). We traverse the list containing nn elements
	 * exactly twice. Since the hash table reduces the look up time to O(1)O(1), the
	 * time complexity is O(n)O(n) Space complexity : O(n)O(n). The extra space
	 * required depends on the number of items stored in the hash table, which
	 * stores exactly nn elements
	 */
	public static int[] hashMapApproach(int[] nums, int target) {

		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {

			hashmap.put(nums[i], i);
		}

		for (int i = 0; i < nums.length; i++) {

			int complement = target - nums[i];

			if (hashmap.containsKey(complement) && hashmap.get(complement) != i) {
				return new int[] { i, hashmap.get(complement) };
			}

		}

		throw new IllegalArgumentException("No two sum solution");

	}

}
