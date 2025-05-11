package com.JavaQspiders.ObjectOrientedProgramming.Has_A_RelationShip.Composition.Car_Project;

public class CarDriver {
    public static void main(String[] args) {
        Car c1 = new Car("BMW",150000,"Black");
        Car c2 = new Car("Thar",100000,"Brown");

        c1.detailsOfCar();
        c1.e.detailsOfEngine();

        c2.detailsOfCar();
        c2.e.detailsOfEngine();
    }
}
