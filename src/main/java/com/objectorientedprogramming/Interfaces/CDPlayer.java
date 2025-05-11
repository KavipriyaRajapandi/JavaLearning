package com.objectorientedprogramming.Interfaces;

public class CDPlayer implements Media{


    @Override
    public void start() {
        System.out.println("Media player starts");
    }

    @Override
    public void stop() {
        System.out.println("Media player stops");
    }
}
