package com.JavaQspiders.ObjectOrientedProgramming.Project.Bag_Ball_Project;

public class Ball {
    private double radius;

    Ball(double radius){
        this.radius = radius;
    }
     public double getRadius(){
        return radius;
     }
     public void setRadius(double rad){
        this.radius = rad;
     }

}
class BasketBall extends Ball{
    String game = "Basket Ball";
    BasketBall(){
        super(15.1);

    }
}

class TennisBall extends Ball
{
    String game = "Tennis Ball";
    TennisBall(){
        super(14.1);
    }
}
