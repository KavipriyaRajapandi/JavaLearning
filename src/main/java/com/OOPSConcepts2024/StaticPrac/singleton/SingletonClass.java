package com.OOPSConcepts2024.StaticPrac.singleton;

public class SingletonClass {

    private SingletonClass(){

    }

    private static SingletonClass instance;

    public static SingletonClass getInstance(){
        if(instance==null){
            instance = new SingletonClass();
        }
        return instance;
    }

}
