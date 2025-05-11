package com.objectorientedprogramming.abstractClass;

public class Daughter extends Parent {

    public Daughter(int age,int value) {
        super(age,value);
    }

    @Override
    void normal() {
        super.normal();
    }

    @Override
    void carrer(){
        System.out.println("I wanted to be an doctor");
    }

    @Override
    void partner(){
        System.out.println("I love gigachad");
    } // we can override same methods in new classes



}
