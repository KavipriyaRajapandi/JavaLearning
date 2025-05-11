package com.JavaQspiders.ObjectOrientedProgramming.Principles.Inheritance.Types_Of_Inheritance;
/*
It is a process of One Parent Class more than one Child class in different Level is known as Multi-Level Inheritance
 */

class M{
    //Class M has 1 member and 0 Member inherited
    int x = 10;
}

class N extends M
{
    //Class N has 3 Members (1 Member inherited 2 Members present in the class)
    int y = 20;
    public void run(){
        System.out.println("Running");
    }
}

class O extends N{
    //Class O has 5 Members (3 Members Inherited 2 Members present in the class)
    int z = 30;
    public void display(){
        System.out.println("Showing Message");
    }
}
public class Multi_Level_Inheritance {
    public static void main(String[] args) {
        O ref = new O();
        System.out.println(ref.x);
        System.out.println(ref.y);
        System.out.println(ref.z);
        ref.run();
        ref.display();
    }
}
