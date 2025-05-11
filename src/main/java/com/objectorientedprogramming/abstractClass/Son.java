package com.objectorientedprogramming.abstractClass;

public class Son extends Parent{


    public Son(int age,int value) {
        super(age,value);
    }

    @Override
    void carrer(){
        System.out.println("I am going to be coder with "+value+" and buy car");
    }

    @Override
    void partner(){
        System.out.println("I love bubu");

    }

    @Override
    void normal() {
        super.normal();
    }



    static void fun(){
        System.out.println("bye");
    }

}
