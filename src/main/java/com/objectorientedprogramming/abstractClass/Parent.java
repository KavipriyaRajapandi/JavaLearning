package com.objectorientedprogramming.abstractClass;

public abstract class Parent {

     int age;

     final int value;



    public Parent(int age, int value) {
        this.age = age;
        this.value = value;
    }

    abstract void carrer();
    abstract void partner();

    //static methods and normal methods can be used in abstract classes

    static void message(){
        System.out.println("hi");
    }

    void normal(){
        System.out.println("Noraml message");
    }







}
