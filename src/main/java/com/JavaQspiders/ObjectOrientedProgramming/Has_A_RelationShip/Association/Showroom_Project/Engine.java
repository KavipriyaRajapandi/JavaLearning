package com.JavaQspiders.ObjectOrientedProgramming.Has_A_RelationShip.Association.Showroom_Project;
//ASSOCIATION CLASS BUT ALSO DEPENDENT (Vehicle Depending)
public class Engine {
    public String type;
    public int cc;
    public String power;

    public Engine(String type,int cc,String power){
        this.type=type;
        this.cc= cc;
        this.power = power;
    }

    public void detailsOfEngine(){
        System.out.println("Engine Type:"+type);
        System.out.println("Engine cc:"+cc);
        System.out.println("Engine owner:"+power);
        System.out.println("                    ");
    }

}
