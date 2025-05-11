package com.JavaQspiders.ObjectOrientedProgramming.Principles.PolyMorphism.Project.Bank_Project;

public class Bank {
    String name;
    String branch;

    Bank(){

    }

    Bank(String name,String branch){
        //L.I
        this.name=name;
        this.branch=branch;
    }

    public double rateOfInterest(){
        return 0;
    }
}

class Sbi extends Bank{
    String location;

    Sbi(){

    }

    Sbi(String location,String name,String branch){
        super(name,branch);
        this.location= location;
    }

    public double rateOfInterest(){
        return 15;
    }
}

class Icici extends Bank{
    String location;

    Icici(){

    }

    Icici(String location,String name,String branch){
        super(name,branch);
        this.location=location;
    }

    public double rateOfInterest(){
        return 10;
    }
}
