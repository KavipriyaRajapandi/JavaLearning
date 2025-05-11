package com.JavaQspiders.ObjectOrientedProgramming.Constructor_Chaining.super_call_statement;
class A{
    A(){
        //L.I
        System.out.println("Java");
    }
    A(boolean b){
        System.out.println("SQL"+b);
    }

}
public class B extends A {
    B(){
        super();
        //L.I
        System.out.println("J2SE");
    }
    B(String s,boolean b){
        super(b);
        //L.I
        System.out.println("J2EE");
    }

    public static void main(String[] args) {
        System.out.println("Start");
        B b1 = new B();
        System.out.println("End");
    }

}
