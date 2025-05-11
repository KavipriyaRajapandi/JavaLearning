package com.JavaCollege.Functions;

public class Shadowing {
    static int x = 90; // This has got lower priority so it got Shadowed by higher priority variable.
    public static void main(String[] args) {
        //int x = 12; // This has got higher priority in this block of variable "x".
        int x;
        //System.out.println(x); scope will begin when value is initialized
        x = 12;
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
