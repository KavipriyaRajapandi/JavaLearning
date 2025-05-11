package com.objectorientedprogramming.Interfaces;

public class SuperCar {

    //int a;

    private Media player2;

    //data hiding

    public SuperCar(){
        player2 = new CDPlayer();
    }

    public SuperCar(Media player2/*,int a*/) {   //no use of constructor because media player2 cant access values because it is object
        this.player2 = player2;
        //this.a=a;
    }

    public void Mediastart(){
        player2.start();
    }

    public void Mediastop(){
        player2.stop();
    }

    public void UpgradeMedia(){
        this.player2 = new BluetoothPlayer();
    }

}
