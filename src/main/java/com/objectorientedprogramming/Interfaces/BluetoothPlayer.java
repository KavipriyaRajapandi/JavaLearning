package com.objectorientedprogramming.Interfaces;

public class BluetoothPlayer implements Media{


    @Override
    public void start() {
        System.out.println("Bluetooth song starts");
    }

    @Override
    public void stop() {
        System.out.println("Bluetooth song stops");

    }
}
