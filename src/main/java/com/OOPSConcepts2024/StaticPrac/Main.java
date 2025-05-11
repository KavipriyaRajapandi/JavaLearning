package com.OOPSConcepts2024.StaticPrac;

public class Main {
    public static void main(String[] args) {
        Human sibi = new Human("Sibi Varshaan");
        System.out.println(Human.population);
        System.out.println(Human.population);
//        fun();
//        System.out.println(a);

        Main funn = new Main();
        funn.fun2();
    }

    static int a = 10;


    static void fun(){
        Main obj = new Main();
        obj.greeting();
    }

    void fun2(){
        greeting(); //9th point in note , go check main method

    }

    void greeting(){
        System.out.println("hello");
    }


}
