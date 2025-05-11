package com.SelfLearningJava.HackerRack;

public class postpreexample {
    public static void main(String[] args) {
        int a= 10;
        int b = (a++ + a) + (a++ + ++a); //(10 + 11) + (11 + 13)
        System.out.println(a);//13
        int c = (b++ + a++) + (++b + a); //(45 + 13) + (47+ 14)
        System.out.println((b++ + a) + a);//((47 + 14)+14) = 75
        System.out.println(a++ + b);//(14 + 48) = 62
        System.out.println(a+":"+b+":"+c);//(15  , 48 , 119)
    }
}
