package com.OOPSConcepts2024.Properties.POLYMORPHISM;

public class Numbers {

    double sum(double a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();

        obj.sum(3,2);
        obj.sum(1,2,3);
        System.out.println(obj.sum(3.123f,2));
    }
}
