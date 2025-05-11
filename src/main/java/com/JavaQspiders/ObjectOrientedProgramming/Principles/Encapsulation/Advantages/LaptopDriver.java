package com.JavaQspiders.ObjectOrientedProgramming.Principles.Encapsulation.Advantages;

public class LaptopDriver {
    public static void main(String[] args) {
        DataHiding l1 = new DataHiding("Dell",50000,8);
        System.out.println("Laptop Name:"+l1.getName());
        System.out.println("Laptop price:"+l1.getPrice());
        System.out.println("Laptop Ram:"+l1.getRam());
        System.out.println("                        ");
        l1.setName("Acer");
        l1.setRam(16);
        System.out.println("Laptop Name:"+l1.getName());
        System.out.println("Laptop price:"+l1.getPrice());
        System.out.println("Laptop Ram:"+l1.getRam());

    }
}
