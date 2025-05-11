package com.JavaQspiders.ObjectOrientedProgramming.Principles.Encapsulation.PrivateConstructorHelperMethod;

public class ObjectCreation_HelperMethod {
    public static void main(String[] args) {
        PrivateConstructor p1 = PrivateConstructor.getPrivateConstructor("Iphone",50000);
        System.out.println("Product Name:"+p1.getName());
        System.out.println("Product Price:"+p1.getPrice());
    }
}
