package com.nupurjaiswal.arraystring;

public class ReplaceCharacterInString {

    public static void main(String[] args) {
        System.out.println(replaceCharacter("Nupur", 'u','a'));


    }

    public static String replaceCharacter(String input,char targetChar,char replaceChar){

        char[] array = input.toCharArray();

        for (int i =0 ;i < input.length();i++){
            if(array[i] == targetChar){
                array[i] = replaceChar;
            }
        }
        return String.valueOf(array);
    }


}
