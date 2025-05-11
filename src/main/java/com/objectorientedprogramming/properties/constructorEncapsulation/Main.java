package com.objectorientedprogramming.properties.constructorEncapsulation;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Ford","Mustang",2021);

        System.out.println(car1.getMake());

        car1.setMake("GTA");

        System.out.println(car1.getMake());
    }
}
