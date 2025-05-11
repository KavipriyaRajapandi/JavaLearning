package com.JavaQspiders.ObjectOrientedProgramming.Has_A_RelationShip.Aggregation.Phone_Sim_Project;

public class Mobile {
    String name;
    double price;
    String storage;
    Sim slot;

    Mobile(String name,double price,String storage){
        this.name = name;
        this.price = price;
        this.storage = storage;
    }

    public boolean isSlotEmpty(){
     return slot==null;
    }

    public void insertSim(Sim s){
        if(slot==null){
            slot = s;
            System.out.println("Sim inserted inside the Slot");
        }
        else{
            System.out.println("Sim is already inserted");
        }
    }

    public void removeSim(){
        if(slot!= null){
            slot = null;
            System.out.println("Sim has been removed");
        }
        else{
            System.out.println("Already Sim is Empty");
        }
    }

    public void detailsOfMobile(){
        System.out.println("Mobile Name:"+name);
        System.out.println("Mobile Price:"+price);
        System.out.println("Mobile Storage:"+storage);
        System.out.println("                           ");
    }

}
