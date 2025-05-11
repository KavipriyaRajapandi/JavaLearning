package com.JavaQspiders.ObjectOrientedProgramming.StaticKeyword;

public class staticProject {
    static{ //mlsi
        /*
        Exactly execute once
        First priority in the program
         */
        System.out.println("Welcome to Static Project");
    }
    static String name;
    static int num;
    public static void main(String[] args){
        staticMethod();
        System.out.println("End of Static Project");
    }
    static {
        System.out.println("Hello Java");
    }
    public static void staticMethod(){
        System.out.println("Name:"+name);
        System.out.println("Num:"+num);
    }
}
