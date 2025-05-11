package com.objectorientedprogramming.Interfaces;

public class PetrolEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Use petrol to start the engine");
    }

    @Override
    public void stop() {
        System.out.println("Petrol is empty so stopped the engine");

    }

    @Override
    public void acc() {
        System.out.println("Need petrol to accelerate the car");
    }


}
