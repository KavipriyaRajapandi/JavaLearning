package com.objectorientedprogramming.properties.inheritance;



public class Box {

    double l;
    double w;
    double h;

    static void message(){
        System.out.println("Message SUIIIII");
    }

    Box(){
        this.l=-1;
        this.w=-1;
        this.h=-1;
    }

    Box(double side){
        this.l=side;
        this.w=side;
        this.h=side;
    }

    Box(double l, double w, double h){
        this.l=l;
        this.w=w;
        this.h=h;
    }

    Box(Box old){
        this.l= old.l;
        this.w= old.w;
        this.h= old.h;
    }

    public void information(){
        System.out.println("Box is running");
    }




}
