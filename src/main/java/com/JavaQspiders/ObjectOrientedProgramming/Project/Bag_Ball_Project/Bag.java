package com.JavaQspiders.ObjectOrientedProgramming.Project.Bag_Ball_Project;

public class Bag {
    Ball bag;
    Bag(){
    }

    public boolean isBagEmpty(){
        return bag==null;
    }

    public void addBall(Ball b1){
        if(isBagEmpty()){
            bag = b1;
            System.out.println("Ball is Added to the bag");
        }
        else{
            System.out.println("Ball is already in the bag");
        }
    }

    public void removeBall(){
        if(isBagEmpty()){
            System.out.println("Ball is already removed in the bag");
        }
        else{
            bag = null;
            System.out.println("Ball is removed in the bag");
        }
    }

    public void showGame(){
        if(bag instanceof BasketBall){
            System.out.println(((BasketBall) bag).game);
        }
        else if(bag instanceof TennisBall){
            System.out.println(((TennisBall) bag).game);
        }
    }
}
