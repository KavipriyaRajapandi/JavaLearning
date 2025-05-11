package com.JavaQspiders.ObjectOrientedProgramming.Has_A_RelationShip.Association.Showroom_Project;

public class Vehicle {
    public String name;
    public double price;
    public String color;

    Engine e; //association

    public Vehicle(String name,double price,String color,Engine e){
        this.name = name;
        this.price = price;
        this.color = color;
        this.e = e;
    }

    public void detailsOfVehicles(){
        System.out.println("Vehicle Name:"+name);
        System.out.println("Vehicle price:"+price);
        System.out.println("Vehicle color:"+color);
        System.out.println("                    ");
    }


}
