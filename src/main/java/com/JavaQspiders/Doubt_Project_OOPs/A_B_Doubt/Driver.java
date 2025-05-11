package com.JavaQspiders.Doubt_Project_OOPs.A_B_Doubt;

import java.sql.SQLOutput;

class A{
    private String name;
    A(){}
    public A(String name) {
        this.name = name;
    }
    //getters
    public String getName(){
        return name;
    }
}
class B extends A{
    private String name;
    B(String name1,String name2){
        super(name1);
       this.name = name2; //annathae
    }
//
//    @Override
//    public String getName(){
//        return name;
//    }

}
public class Driver {
    public static void main(String[] args) {
        B ref=  new B("Parent Name","Child Name");
        System.out.println(ref.getName());
        A ref1=  new B("Parent Name","Child Name");
        System.out.println(ref1.getName());
    }
}
