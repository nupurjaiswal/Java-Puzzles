package com.nupurjaiswal.leetcode;

import java.util.HashMap;

/*

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.

Example 1:

Input: "III"
Output: 3
Example 2:

Input: "IV"
Output: 4
Example 3:

Input: "IX"
Output: 9
Example 4:

Input: "LVIII"
Output: 58
Explanation: C = 100, L = 50, XXX = 30 and III = 3.
Example 5:

Input: "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */
public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));


    }
    public static int romanToInt(String s) {
        if (s == null || s.length() == 0) return 0;

        // create a hash table to store the dictorary
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);

        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i <= s.length() - 2 &&
                    hashMap.get(s.charAt(i)) < hashMap.get(s.charAt(i + 1))) {
                num -= hashMap.get(s.charAt(i));
            } else {
                num += hashMap.get(s.charAt(i));
            }
        }
        return num;
    }
}
