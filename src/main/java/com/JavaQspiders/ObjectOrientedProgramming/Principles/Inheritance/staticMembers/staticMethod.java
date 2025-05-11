package com.JavaQspiders.ObjectOrientedProgramming.Principles.Inheritance.staticMembers;
/*
Can we inherit static Methods?
Yes, we can inherit static Methods
Example: using Multi-Level Inheritance
 */
/*
Class Loading & Object Loading Process
First, Z will not load it will go to parent class
Now, Y will not load it will go to parent class
Finally, X will start to load Members
 */
class X{
    static int a = 10;
    public static void m1(){
        System.out.println("Message 1");
    }
}
class Y extends X{
    static int b = 20;
    public static void m2(){
        System.out.println("Message 2");
    }
}
class Z extends Y{
    static int c = 30;
    public static void m3(){
        System.out.println("Message 3");
    }
}
public class staticMethod {
    public static void main(String[] args) {
        Z.m3();
        Z.m2();
        Z.m1();
    }
}
