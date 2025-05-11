package com.JavaQspiders.ObjectOrientedProgramming.Has_A_RelationShip.Aggregation.Phone_Sim_Project;

public class Sim {
    private String operator_name;
    private String band_width;
    private double price;

    private Sim(String operator_name,String band_width,double price){
        this.operator_name = operator_name;
        this.band_width = band_width;
        this.price = price;
    }

    //getters
    public String getOperator_name(){
        return operator_name;
    }

    public String getBand_width(){
        return band_width;
    }

    public double getPrice(){
        return price;
    }

    //object creation with help of method and not in main method - //Aggregation
    public static Sim getObject(String operator_name,String band_width,double price){
        return new Sim(operator_name,band_width,price);
    }

}
