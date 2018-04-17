package com.nupurjaiswal.string;
public class CountVowels {
/*
Find number of vowels and consonants in a string
 */
	public static void main(String[] args) {

	// index of method of string returns -1 if it doesn't match any string
		String s1 = "HellO";

		int countVowels = 0;
		int countConsonants = 0;
		
		String s1normalized = s1.trim().toLowerCase();
		
		String vowels = "aeiou";
		
		char[] charArray = s1normalized.toCharArray();
		
		for (char c : charArray) {
			
			if(vowels.indexOf(c) != -1) {
				countVowels ++;
			}else if(c != ' ') {
				countConsonants++;
			}
			

		}
		System.out.println(countVowels);
		System.out.println(countConsonants);
		
	}
}
