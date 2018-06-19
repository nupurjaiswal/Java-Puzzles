package com.nupurjaiswal.leetcode;

public class ReverseInteger {


    public static void main(String[] args) {

        System.out.println(reverse(9646324351L));


    }

    public static long reverse(long x) {

        boolean flag = true;

        String xStr = "" + x;
        StringBuilder answer = new StringBuilder();

        if (xStr.contains("-")){
            flag = false;
        }

        char[] resultCharArray;

        if(!flag){
            resultCharArray = xStr.substring(1).toCharArray();
        }else{
            resultCharArray = xStr.toCharArray();
        }

        for(int i = resultCharArray.length - 1; i >= 0; i--){
            answer.append(resultCharArray[i]);
        }

        if(!flag){
            return Long.parseLong("-" + answer.toString());
        }else{
            return Long.parseLong(answer.toString());
        }



    }
}
