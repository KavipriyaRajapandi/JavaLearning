package com.JavaQspiders.ObjectOrientedProgramming.Constructor.Working;

public class Laptop { //CLASS LOADING PROCESS OCCURS BEFORE OBJECT LOADING PROCESS (ADDED BY JVM)
    //states
    String name;
    double price;
    static String owner = "Sibi";

    /*

    Constructor
    *Special Type of Block which is having same similar to className(Laptop)
    *initialize the data member this.year = year;
    *constructor will not have modifiers (static,void,final)

    L.I(Load Instruction) after constructor called we follow OBJECT LOADING PROCESS (ADDED BY COMPILER)
    L.I load all Non-static Members

     */

    public Laptop(String n,double pr){
        //L.I ( until now non-static members will have default value)
        name = n;
        price = pr;
    }

    public void laptopDetails(){
        System.out.println("Brand:"+name);
        System.out.println("Price:"+price);
        System.out.println("Owner:"+owner);
        System.out.println("             ");
    }



}
