package com.objectorientedprogramming;

public class WorkingWithWrapperClassesExample {

    public static void main(String[] args){

        Integer num = 45;



        //final keyword

        final A sibi = new A("sibirock");
        sibi.name = "Sibivarshaan";
        System.out.println(sibi.name);


        //Finalizer use garbage collection

        /*A obj;
        //object is created
        for(int i = 0;i<1000000000;i++){
            obj = new A("Baka");
       } */
    }


}

class A{

    final int num = 10;
    String name;

    public A(String name){
        this.name=name;

    }


    //garbage collections


    /*@Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }*/
}

