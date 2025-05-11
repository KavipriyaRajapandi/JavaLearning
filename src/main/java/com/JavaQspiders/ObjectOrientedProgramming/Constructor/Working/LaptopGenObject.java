package com.JavaQspiders.ObjectOrientedProgramming.Constructor.Working;

public class LaptopGenObject {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("Hp",50000);
        Laptop l2 = new Laptop("Dell",40000);
        Laptop l3 = new Laptop("Lenevo",80000);

        l1.laptopDetails();
        l2.laptopDetails();
        l3.laptopDetails();
    }
}
