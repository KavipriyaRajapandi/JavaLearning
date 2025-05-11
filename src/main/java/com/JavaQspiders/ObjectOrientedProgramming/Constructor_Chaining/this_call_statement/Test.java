package com.JavaQspiders.ObjectOrientedProgramming.Constructor_Chaining.this_call_statement;
//Is_a_relationship no needed one class is enough
public class Test {
    int x = 10;
    int y = 20;
    Test(){
        this(4);
        System.out.println("Earth");
    }
    Test(int a){
        this("Java",true);
        System.out.println("Venus");
    }
    Test(String a,boolean b){
        this(3.14);
        System.out.println("Mercury");
        System.out.println(a+" "+b);
    }
    Test(double a){
        System.out.println("Jupiter");
        System.out.println(a);
    }

    public static void main(String[] args) {
        Test t1 = new Test();
    }
}
