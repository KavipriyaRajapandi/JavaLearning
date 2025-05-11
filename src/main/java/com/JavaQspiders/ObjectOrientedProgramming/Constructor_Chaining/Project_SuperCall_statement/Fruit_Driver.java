package com.JavaQspiders.ObjectOrientedProgramming.Constructor_Chaining.Project_SuperCall_statement;


import com.sibivarshaan.App;

class Fruit{
    String name;
    String color;
    Fruit(String name,String color){
        this.name=name;
        this.color=color;
    }
    public void detailsOfFruit(){
        System.out.println("Fruit Name:"+name);
        System.out.println("Fruit color:"+color);
    }
}
class Apple extends Fruit{
    int price;
    String origin;
    Apple(String name,String color,int price,String origin){
        super(name,color);
        this.price = price;
        this.origin = origin;
    }
    public void detailsOfApple(){
        System.out.println("Apple Price:"+price);
        System.out.println("Apple origin:"+origin);
        System.out.println();
    }

}
class Mango extends Fruit{
    int price;
    String origin;
    Mango(String name,String color,int price,String origin){
        super(name,color);
        this.price = price;
        this.origin = origin;
    }
    public void detailsOfMango(){
        System.out.println("Mango Price:"+price);
        System.out.println("Mango origin:"+origin);
        System.out.println();
    }
}


public class Fruit_Driver {
    public static void main(String[] args) {
        Apple ref1 = new Apple("Apple","Red",200,"Kashmir");
        ref1.detailsOfFruit();
        ref1.detailsOfApple();
        Mango ref2 = new Mango("Mango","Yellow",150,"Myanmar");
        ref2.detailsOfFruit();
        ref2.detailsOfMango();
    }
}
