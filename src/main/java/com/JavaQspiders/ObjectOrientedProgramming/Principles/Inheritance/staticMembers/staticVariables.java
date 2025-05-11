package com.JavaQspiders.ObjectOrientedProgramming.Principles.Inheritance.staticMembers;
/*
Can we inherit static Variables?
Yes, we can inherit static Variables
Example given with Multi-Level Inheritance
 */
class A{
    static int x =10;
}
class B extends A{
    static int y = 20;
}
class C extends B{
    static int z = 30;
}

public class staticVariables {
    public static void main(String[] args) {
        System.out.println(C.x);
        System.out.println(C.y);
        System.out.println(C.z);
    }
}
