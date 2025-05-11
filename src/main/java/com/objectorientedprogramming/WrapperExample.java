package com.objectorientedprogramming;

public class WrapperExample {
    public static void main(String[] args){
        Integer a = 10;
        //int a = 10;
        Integer b = 20;
        //int b = 20;

        swap(a,b);

        System.out.println(a+" "+b);

        final B sibi = new B("sibi varshaan");

        sibi.name = "Turner";

        //sibi = new A("wwe");

        B obj;

        for(int i = 0;i<1000000000;i++){

            obj = new B("CAR");

        }


    }

    static void swap(Integer a /*int a*/,Integer b /*int b*/){
        Integer temp = a;
         a = b;
         b = temp;

    }

}

class B{
    final int num = 2;
    String name;

    public B(String name) {
        this.name = name;
        //System.out.println("Object is created");
    }

//    @Override
//    protected void finalize() throws Throwable {
//        //super.finalize();
//        System.out.println("Object is destroyed");
//    }
}


