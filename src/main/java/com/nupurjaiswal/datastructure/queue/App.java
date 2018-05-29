package com.nupurjaiswal.datastructure.queue;

public class App {
    public static void main(String[] args) {
        Queue myQueue = new Queue(3);

        myQueue.insert(1);
        myQueue.insert(10);
        myQueue.insert(100);
        myQueue.insert(900);

        myQueue.view();
    }
}
