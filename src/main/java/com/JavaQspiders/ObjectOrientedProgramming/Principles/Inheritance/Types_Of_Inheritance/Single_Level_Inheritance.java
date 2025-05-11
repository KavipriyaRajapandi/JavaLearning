package com.JavaQspiders.ObjectOrientedProgramming.Principles.Inheritance.Types_Of_Inheritance;
/*
It is a process of one parent class having one child class
Inheritance of only one level called Single Level Inheritance
 */
class A{
    //Totally there are 2 Members in this class and 0 member inherited
    int x = 0;
    public void run(){
        System.out.println("Running");
    }
}

class B extends A{
    //2 Members from parent inherited
    //1 Member present in the class
    //Totally there are 3 Members in B Class
    int y = 20;
}


public class Single_Level_Inheritance {
    public static void main(String[] args) {
        B ref = new B();
        System.out.println(ref.x);
        System.out.println(ref.y);
        ref.run();
    }
}
