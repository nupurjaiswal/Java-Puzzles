package com.nupurjaiswal.list;
/*
Write a code to remove duplicates from an unsorted linked list
 */


import java.util.HashSet;
import java.util.LinkedList;

public class RemoveDuplicates {

    public static void main(String[] args) {
        LinkedList<Integer> inputLinkedList = new LinkedList<Integer>();
        inputLinkedList.add(1);
        inputLinkedList.add(2);
        inputLinkedList.add(1);
        inputLinkedList.add(1);
        inputLinkedList.add(5);
        inputLinkedList.add(5);


         removeDuplicates(inputLinkedList);


    }

    public static void removeDuplicates(LinkedList<Integer> list){
        HashSet<Integer> hashSet = new HashSet<Integer>();
        LinkedList<Integer> resultLinkedList = new LinkedList<Integer>();
        for (int i:list) {
            hashSet.add(i);
        }

        for (int j:hashSet) {
            resultLinkedList.add(j);
        }


        System.out.println(resultLinkedList);
    }
}
