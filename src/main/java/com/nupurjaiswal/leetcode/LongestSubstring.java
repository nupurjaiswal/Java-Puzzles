//To do






package com.nupurjaiswal.leetcode;

import java.util.HashSet;

/*
Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstring {
	public static void main(String[] args) {

	}
	
	  public int lengthOfLongestSubstring(String s) {
	      
		  char[] input = s.toCharArray();
	        HashSet<Character> hashset = new HashSet<Character>();
	        
	        for (int i = 0; i < input.length; i++){
	            hashset.add(input[i]);

	        }
			return 0;
	        
	    }
}
