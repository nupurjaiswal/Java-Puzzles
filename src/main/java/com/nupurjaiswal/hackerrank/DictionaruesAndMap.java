package com.nupurjaiswal.hackerrank;

import java.util.HashMap;
/*
Task: Sample Input
3
sam 99912222
tom 11122222
harry 12299933
sam
edward
harry

Sample Output
sam=99912222
Not found
harry=12299933
 */
public class DictionaruesAndMap {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String,Integer> hashMap = new HashMap<String, Integer>();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            hashMap.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(hashMap.containsKey(s)){
                System.out.println(s +"=" +hashMap.get(s));
            }else{
                System.out.println("Not found");
            }

        }
        in.close();

    }
}
