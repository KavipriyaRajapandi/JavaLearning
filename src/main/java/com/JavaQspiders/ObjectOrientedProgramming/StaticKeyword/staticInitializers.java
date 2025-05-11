package com.JavaQspiders.ObjectOrientedProgramming.StaticKeyword;

public class staticInitializers {
    /*
    Initializers - startup instructions
    Two Types
    Single Line static Initializers - Any variable which is declared and initialized and prefixed with static keyword called SLSI (Class Variable)
    Multi Line static Initializers - Any block of code which is prefixed with static keyword is known as MLSI (cannot have static variable or SLSI inside MLSI)
     */
    static String name = "Sibi"; //SLSI
    static { //MLSI
        //Local Area
        int a = 45;
    }
}
