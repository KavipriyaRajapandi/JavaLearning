package com.JavaQspiders.ObjectOrientedProgramming.Has_A_RelationShip.Composition.Car_Project;
//DEPENDENT CLASS
public class Engine {
    public String type = "Diesel";
    public int cc = 350;
    public String power = "800hp";

    public Engine(){

    }

    public void detailsOfEngine(){
        System.out.println("Engine Type:"+type);
        System.out.println("Engine cc:"+cc);
        System.out.println("Engine power"+power);
        System.out.println("******************");
    }

}
