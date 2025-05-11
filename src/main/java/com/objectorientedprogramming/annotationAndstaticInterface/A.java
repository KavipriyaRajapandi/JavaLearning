package com.objectorientedprogramming.annotationAndstaticInterface;

public interface A {

    default void fun2(){
        System.out.println("i dont need override i am a special feature");
    }


    static void greeting(){
        System.out.println("i greet u");                                 //override cannot be done doesnt depend on objects
    }

    default void fun(){
        System.out.println("hi boss");

    }
}
