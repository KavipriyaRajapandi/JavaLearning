package com.JavaQspiders.ObjectOrientedProgramming.Principles.Encapsulation.PrivateConstructorHelperMethod;

public class PrivateConstructor {
    /*
    When constructor is private We cant call constructor from outside class
    PRIVATE CONSTRUCTOR:
    We need Helper Method to create Object from Outside Class (should be static)
    -it should be parameterized
    -static
    -return type is ClassName(NON-primitive dataype)
     */
    private String name;
    private double price;

    private PrivateConstructor(String name,double price){
        //L.I
        this.name = name;
        this.price = price;
    }

    //getter
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
//Object Creation Using Another Way
    public static PrivateConstructor getPrivateConstructor(String name,double price){
        return new PrivateConstructor(name,price);
    }
}
