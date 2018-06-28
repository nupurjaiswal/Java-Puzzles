package com.nupurjaiswal.javaConcepts;

public class Singleton {

    //lazy way: have class create get instance just in time
    public static Singleton instance = null;

    private Singleton()
    {
    };


    public static Singleton getInstance()
    {
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    //Eagerly way: have the class instantiate the singleton object even before it is created

    public static Singleton instance2 = new Singleton();


    public static Singleton getInstance2(){

        return instance2;
    }

}
