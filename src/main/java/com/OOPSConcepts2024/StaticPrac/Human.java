package com.OOPSConcepts2024.StaticPrac;

public class Human {
    String name;
    static long population;

    static void message(){
        System.out.println("message given");
        //System.out.println(this.name); //cannot use this keyword inside static context
    }


    Human(String name){
        this.name = name;
        Human.population += 1;
    }




}
