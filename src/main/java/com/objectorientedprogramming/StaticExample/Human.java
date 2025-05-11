package com.objectorientedprogramming.StaticExample;

public class Human {

    int age;
    String name;
    int salary;
    boolean married;



    //when you declare a static instance variable then we have to go for comman value
    static long population;


    static void message(){
        System.out.println("Hello World");
        //System.out.println(this.name); cant access the object type instance variable in static method until you declare object reference
    }


    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

        //here for static variable we take reference variable declaration in class name only

        Human.population += 1;

        //Human.message();
    }


}
