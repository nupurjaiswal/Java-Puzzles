package com.nupurjaiswal.javaConcepts.Deadlock;

public class Example1 {

    public void method1(){

        synchronized (String.class){
            System.out.println("Acquired lock on String class");
        }

        synchronized (Integer.class){
            System.out.println("Acquired lock on Integer class");
        }
    }

    public void method2(){

        synchronized (Integer.class){
            System.out.println("Acquired lock on String class");
        }

        synchronized (String.class){
            System.out.println("Acquired lock on Integer class");
        }
    }

    public static void main(String[] args) {

       Example1 deadlock = new Example1();
       deadlock.method1();
       deadlock.method2();
    }
}
