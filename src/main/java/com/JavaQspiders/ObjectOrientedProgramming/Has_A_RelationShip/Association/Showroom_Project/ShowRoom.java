package com.JavaQspiders.ObjectOrientedProgramming.Has_A_RelationShip.Association.Showroom_Project;
//Association
public class ShowRoom {
    public String name;
    public String branch;
    public String mgr;

    Vehicle[] v; //association

    public ShowRoom(String name,String branch,String mgr,Vehicle[] v){
        this.name = name;
        this.branch = branch;
        this.mgr= mgr;
        this.v = v;
    }

    public void detailsOfShowroom(){
        System.out.println("Showroom name:"+name);
        System.out.println("Showroom Branch:"+branch);
        System.out.println("Showroom Manager:"+mgr);
        System.out.println("                      ");
    }

    public void detailsOfVehicles(){
        for(int i=0;i<v.length;i++){
            System.out.println("Vehicle"+(i+1)+"Details");
            v[i].detailsOfVehicles();
            v[i].e.detailsOfEngine();

            System.out.println("----------------------");

        }
    }
}


