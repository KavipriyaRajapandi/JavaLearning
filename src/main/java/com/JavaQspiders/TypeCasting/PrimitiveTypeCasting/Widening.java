package com.JavaQspiders.TypeCasting.PrimitiveTypeCasting;

public class Widening {
    public static void main(String[] args) {
        char a = 'A';
        System.out.println("---BEFORE WIDENING---");
        System.out.println("a->"+a);
        double b = a;
        System.out.println("---AFTER WIDENING---");
        System.out.println("b->"+b);
    }
}
