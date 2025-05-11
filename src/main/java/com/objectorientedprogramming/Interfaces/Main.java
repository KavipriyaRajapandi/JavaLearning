package com.objectorientedprogramming.Interfaces;

public class Main {

    public static void main(String[] args) {


       Engine car = new Car();

        /*Engine car = new Car();

        int a = car.a;                               THIS WONT WORK BECAUSE ENGINE DOESN'T CARE ABOUT A VARIABLE.Until you assign reference as Car
        System.out.println(a);*/

        car.acc();
        //car.brake();
        car.start();
        car.stop();

       // int val = car.VALUE;
        //System.out.println(val);

        /*int val2  = car.BRAKE;          // this also dont work because the brake is an not a reference of engine it is Brake.java reference type
        System.out.println(val2);*/

                   // i)   // ONE WAY OF CALLING THE CLASSES WHICH IS REFERENCED BY METHODS USED IN THOSE CLASSES AND THEN FROM THE INTERFACES
        /*CDPlayer music = new CDPlayer();

        music.start();
        music.stop();



        PetrolEngine petrol = new PetrolEngine();

        petrol.start();
        petrol.stop();
        petrol.acc();                                                           //disadvantge = we have to create out own object for every class we have to call

        ElectricEngine electric = new ElectricEngine();

        electric.start();
        electric.stop();
        electric.acc();

         */

                   //OR ANOTHER WAY IS TO CREATE A NEW CLASS AS NICECAR AND ACCESS THOSE METHODS BY CALLING ANOTHER METHOD INSIDE IT (ENGINE.START)-IS FROM ANOTHER METHOD
                   //NOW TO HAVE CONSTRUCTOR IN CLASS TO CALL DIFFERENT ENGINES IS WAY MORE SUITABLE
        //T0 HAVE TO CREATE OUR OWN INTERFACE BASED CLASS IN WHICH WE CREATED THE CLASS THAT USE INTERFACE AS objects ny upcasting


       NiceCar car2 = new NiceCar();

       car2.start();
       car2.MediaStart();                       //advantage - we can call all the classes using one object
        car2.upgradeEngine();
        car2.start();


        SuperCar car3 = new SuperCar();

        car3.Mediastart();
        car3.UpgradeMedia();
        car3.Mediastart();

        //car2.start();  i can literally access the other obj reference fn in other obj refrence place.....





    }
}
