package com.objectorientedprogramming.Interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric is needed to start the Car");
    }

    @Override
    public void stop() {
        System.out.println("Electric is empty, So car is stopped");

    }

    @Override
    public void acc() {
        System.out.println("Accelerate for electric car");

    }
}
