package com.nupurjaiswal.datastructure.queue;

public class Queue {
    int maxSize;
    long[] queueArray;
    int front;
    int rear;
    int nItems;


    public Queue(int size) {
        maxSize = size;
        queueArray = new long[size];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long j) {

        if (rear == maxSize-1){
            rear=-1;
        }
        rear++;
        queueArray[rear] = j;
        nItems++;
    }

    //remove item from the front of the queue
    public long remove() {
        long temp = queueArray[front];
        front++;

        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;

    }

    public long peakFront() {
        return queueArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);

    }


    public void view() {
        for (int i = 0; i < queueArray.length; i++) {
            System.out.print(queueArray[i] + " ");
        }
    }
}
