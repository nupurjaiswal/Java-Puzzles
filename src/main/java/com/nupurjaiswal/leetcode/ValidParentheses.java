package com.nupurjaiswal.leetcode;


import java.util.Stack;
/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.
 */
public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));

    }
    public static boolean isValid(String s) {
        int length=s.length();
        char [] array=s.toCharArray();
        if(length==0) return true;
        Stack<Character> stack=new Stack<Character>();
        for(int i=0; i<length; i++)
        {
            if(array[i]=='(' || array[i]=='{' || array[i]=='[' )
            {
                stack.push(array[i]);
            }
            if(array[i]==')' ||array[i]=='}' ||array[i]==']')
            {
                if(stack.isEmpty()) return false;
                char temp=stack.pop();
                if((temp=='(' && array[i]==')' ) || (temp=='{' && array[i]=='}' ) ||(temp=='[' && array[i]==']' )  )
                {
                    continue;
                }else
                {
                    return false;
                }
            }
        }
        if(!stack.isEmpty()) return false;
        return true;
    }

    }

