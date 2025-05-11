package com.objectorientedprogramming.StaticExample;

public class Main {

    public static void main(String[]args){

       /* Human sibi = new Human(19,"sibi",20000,false);
        Human varshaan = new Human(19,"varshaan",30000,false);

        Human sumi = new Human(19,"sree",80000,false);*/


        //object cant be taken for static variable that we have to consider using only human class as a reference variable


        /*System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);*/



       // Human.message();


       Main obj2 = new Main();
       obj2.fun2();






    }
    static void fun(){
        //greeting();

        Main obj = new Main();
        obj.greeting();

    }
    void fun2(){

        greeting();
    }


    void greeting(){
        System.out.println("hi");

    }



}
