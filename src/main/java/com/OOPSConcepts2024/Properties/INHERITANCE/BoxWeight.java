package com.OOPSConcepts2024.Properties.INHERITANCE;

public class BoxWeight extends Box {

    double weight;
    double side;

    BoxWeight(){
        super();
        this.weight = -1;
        this.side = -1;
    }
    //@Override - static cannot be overriden
//    static void greeting(){
//        System.out.println("This is BoxWeight!but even we cant override static in this");
//    }

//    BoxWeight(double other){
//        super(other);
//        this.weight=weight;
//        this.side=side;
//    }

    BoxWeight(BoxWeight other){
        super(other);
        this.weight=weight;
        this.side=side;
    }


    BoxWeight(double l,double w,double h, double weight){
        super(l,w,h);
        this.weight = weight;
        this.side = side;
        //super(l,w,h); does not care error
    }

    BoxWeight(double side,double weight){
        super(side);
        this.weight=weight;
    }

}
