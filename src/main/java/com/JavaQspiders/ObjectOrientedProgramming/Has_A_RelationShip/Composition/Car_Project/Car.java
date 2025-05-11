package com.JavaQspiders.ObjectOrientedProgramming.Has_A_RelationShip.Composition.Car_Project;
//DEPENDING ON CLASS
public class Car {
    public String name;
    public double price;
    public String color;
    public static String owner = "Sibi";

    Engine e = new Engine();

    public Car(String name, double price,String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public void detailsOfCar(){
        System.out.println("Car name"+name);
        System.out.println("Car price"+price);
        System.out.println("Car color:"+color);
        System.out.println("Car Owner:"+owner);
        System.out.println("******************");
    }


}
