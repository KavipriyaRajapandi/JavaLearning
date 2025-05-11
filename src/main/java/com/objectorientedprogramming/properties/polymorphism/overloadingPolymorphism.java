package com.objectorientedprogramming.properties.polymorphism;

public class overloadingPolymorphism {

    int sum(int a,int b){

        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;

    }
    double sum(double b, double a){
        return a+b;
    }

    public static void main(String[] args) {
        overloadingPolymorphism obj = new overloadingPolymorphism();

        System.out.println(obj.sum(3,5));

        System.out.println(obj.sum(8.9,2.3));

        System.out.println(obj.sum(100,22,211));
    }

}
