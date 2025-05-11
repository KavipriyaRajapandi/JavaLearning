package com.OOPSConcepts2024.StaticPrac.singleton;

public class Main {
    public static void main(String[]args){
        SingletonClass obj = SingletonClass.getInstance();

        SingletonClass obj2 = SingletonClass.getInstance();

        SingletonClass obj3 = SingletonClass.getInstance();
    }

}
