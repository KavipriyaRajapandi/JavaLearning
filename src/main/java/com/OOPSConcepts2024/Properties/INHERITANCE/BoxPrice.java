package com.OOPSConcepts2024.Properties.INHERITANCE;

public class BoxPrice extends BoxWeight {
    double price;

    BoxPrice(){
        super();
        this.price = -1;
    }

    BoxPrice(BoxPrice old){
        super(old);
        this.price = old.price;
    }

    BoxPrice(double l,double w,double h,double weight,double price){
        super(l,w,h,weight);
        this.price=price;
    }
    BoxPrice(double side,double weight,double price){
        super(side,weight);
        this.price=price;
    }
}
