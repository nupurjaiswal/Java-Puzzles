package com.nupurjaiswal.datastructure.linkedlists.singlylinkedlist;

public class App {

    public static void main(String[] args) {

        SinglyLinkedList mylist = new SinglyLinkedList();
        mylist.insertFirst(100);
        mylist.insertFirst(50);
        mylist.insertFirst(90);
        mylist.insertFirst(30);
        mylist.insertLast(99999);

        mylist.displayList();

    }
}
