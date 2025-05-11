package com.JavaQspiders.ObjectOrientedProgramming.Principles.Inheritance.staticMembers;
/*
We cant inherit static Multi Line initializers but it will executing themselves in class loading process
 */
class M{
    static{
        System.out.println("Executed in M itself");
    }
}
class N extends M{
    static{
        System.out.println("Executed in N itself");
    }
}
public class staticMultiLineInitializers {
    public static void main(String[] args) {
        N ref = new N();

    }
}
