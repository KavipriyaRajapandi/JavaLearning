package com.objectorientedprogramming.properties.inheritance;

public class BoxPrice extends BoxWeight{



    double price;

    BoxPrice(){
        super();
        this.price = -1;
    }

    BoxPrice(double side,double weight, double price){
        super(side, weight);
        this.price = price ;

    }



    BoxPrice(double l, double w,double h,double weight, double price){
        super(l, w, h, weight);
        this.price = price;
    }

    BoxPrice(BoxPrice another){
        super(another);
        this.price = another.price;
    }


}
