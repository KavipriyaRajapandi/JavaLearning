package com.JavaQspiders.Static.Concepts;


/*
Method Area:

static{
}
psvm(S[]args){
}
static void m1(){
}
static{
}

 */


public class Driver2 {
    //Table created
    static int a = 1;//0 important
    static {
        System.out.println("Welcome to Chennai");
    }

    public static void main(String[] args) {
        System.out.println("start");
        int b = m1(); //12
        System.out.println("end");
    }

    static int m1(){
        System.out.println("m1");
        return 12;
    }
    static{
        System.out.println("HI");
        int c = m1();
        System.out.println(c); // sir didnt explian
    }
}
