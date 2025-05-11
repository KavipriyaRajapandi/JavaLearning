package com.objectorientedprogramming.annotationAndstaticInterface;

public class Main implements A , B{

    @Override
    public void greet() {
        System.out.println("hi greet");
    }


    public static void main(String[] args) {

        Main obj = new Main();
        A.greeting();
        obj.fun2();
    }

}
