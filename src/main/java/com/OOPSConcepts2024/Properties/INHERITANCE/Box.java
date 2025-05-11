package com.OOPSConcepts2024.Properties.INHERITANCE;

import java.util.ArrayList;

public class /*final-we cant access members , function and child classes if we put final on class */ Box {
    double l;
    double w;
    double h;
    

    Box(){
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    static void greeting(){
        System.out.println("This is Box!Welcome to box");
        ArrayList list = new ArrayList<>();
        //abstract data types -- getters setters
    }

    Box(double side){
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(double l,double w,double h){
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    public void information(){
        System.out.println("Running the box");
    }




}
