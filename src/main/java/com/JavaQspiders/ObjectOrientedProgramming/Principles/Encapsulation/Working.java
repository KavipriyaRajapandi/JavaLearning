package com.JavaQspiders.ObjectOrientedProgramming.Principles.Encapsulation;

public class Working {
    /*
    Definition:
    The process of wrapping or binding the states and behaviour by class is known as Encapsulation
    (With Help of Class we can achieve encapsulation)
    To access the members inside the Class and outside the class its possible for these Data members prefixed with access modifiers (default,public,protected)
     */

    public int a = 10;
    protected int b = 20;
    int c = 30;

    /*
    But for private members it is only accessible inside the class but not outside the class
     */
    private int d = 40;
    //Inside the Class
    public static void main(String[] args) {
        Working a1 = new Working();
        System.out.println(a1.a);
        System.out.println(a1.b);
        System.out.println(a1.c);
        //visible inside the class Only
        System.out.println(a1.d);
    }
}

class A{
    public static void main(String[] args) {
        Working a2 = new Working();
        System.out.println(a2.a);
        //private members cant access
        /*
        System.out.println(a2.d);//d has private access
        To solve this there is Advantages of ENCAPSULATION
         */

    }

}
