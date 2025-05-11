package com.JavaQspiders.ObjectOrientedProgramming.Object;

public class ObjectBlock {
    /*
    Block of Memory in Heap Area
    Properties of Object
        *States (Non-static Variable)
        *Behaviour (Non-static Methods)
    can States and Behaviour can be static ? yes depend on the requirement
     */

    //states
    String name;
    String color;
    double price;
    static String owner = "Sibi";

    //Behaviour
    public void run(){
        System.out.println("Car Runs");
    }
    public void stop(){
        System.out.println("Car Stops");
    }
    public void changeGear(){
        System.out.println("Gear Changed");
    }
}
