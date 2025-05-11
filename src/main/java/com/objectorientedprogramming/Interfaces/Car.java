package com.objectorientedprogramming.Interfaces;

public class Car implements Engine,Brake,Media{



    int a = 10;

    @Override
    public void start(){
        System.out.println("Start the car");

    }

    @Override
    public void stop(){
        System.out.println("Stop the car");
    }

    @Override
    public void acc(){
        System.out.println("To accelerate the car");
    }

    @Override
    public void brake(){
        System.out.println("To use brake in the car");

    }






}
