package com.nupurjaiswal.string;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/*
Using Regex, we can easily match or search for patterns in a text.
Before searching for a pattern, we have to specify one using some well-defined syntax.
In this problem, you are given a pattern. You have to check whether the syntax of the given pattern is valid.
 */
public class PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        PatternSyntaxException exc = null;
        while (testCases > 0) {
            String pattern = in.nextLine();
            //Write your code
            try {
                Pattern.compile(pattern);

            } catch (PatternSyntaxException exception) {

                exc = exception;
            }

            if (exc != null) {
                System.out.println("Invalid");
            } else {
                System.out.println("Valid");
            }
        }
    }
}

