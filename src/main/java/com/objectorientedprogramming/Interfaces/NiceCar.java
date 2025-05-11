package com.objectorientedprogramming.Interfaces;

public class NiceCar {

    private Engine engine; // FOR DATA HIDING WE DIDNT ACCESS OBJECT HERE ITSELF.

    private Media player ;//= new CDPlayer();   // objects that are being created here itself

    public NiceCar() {
         engine = new ElectricEngine();             //FOR many INTERFACE ONLY WE CAN CREATE no arguments CONSTRUCTOR AND CALL THEM IT IS  POSSIBILITY IN INTERFACES
                                               //Showing data hiding concept
        player = new CDPlayer();

    }

  /*  public NiceCar(Engine engine, Media player) {  //no use of constructor
        this.engine = engine;
        this.player = player;

    }*/

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.start();
    }

    public void MediaStart(){
        player.start();
    }

    public void MediaStop(){
        player.stop();
    }

    public void upgradeEngine(){
        this.engine = new PetrolEngine();
    }

}
