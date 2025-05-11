package com.JavaQspiders.ObjectOrientedProgramming.Object;

public class ObjectBlockGen {
    public static void main(String[] args) { // jvm calls main method
        /*
        ObjectBlock - non-primitive Datatype
        obj1 - reference variable , object reference , non-primitive variable
        new keyword
        Book()- constructor call - whenever we are creating object constructor automatically created (Called by Jvm)
         */
        ObjectBlock obj1 = new ObjectBlock(); //Instantiation

        System.out.println(obj1.color);
        obj1.changeGear();
    }
}
