package com.JavaQspiders.ObjectOrientedProgramming.Principles.Inheritance.Types_Of_Inheritance;
/*
The process of One Parent class having more the one child class in same level is called as Hierarchical Inheritance
 */
class X{
    //Class X has 2 Members and 0 Member Inherited
    int x = 10;
    public void work(){
        System.out.println("Working");
    }
}
class Y extends X{
    //Class Y has totally 3 Members (2 Members inherited and 1 Member present in the class)
    int y = 20;
}
class Z extends X{
    //Class Z has totally 3 Members (2 Members inherited and 1 Member present in the class)
    static int Z = 30;
}
public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        System.out.println("Class Y");
        Y ref2 = new Y();
        System.out.println(ref2.x);
        System.out.println(ref2.y);
        System.out.println("Class Z");
        Z ref = new Z();
        System.out.println(ref.x);
        System.out.println(Z.Z);
    }
}
