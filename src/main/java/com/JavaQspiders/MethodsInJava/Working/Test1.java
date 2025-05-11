package com.JavaQspiders.MethodsInJava.Working;

public class Test1 {
    public static void main(String[] args) {

        System.out.println("Welcome the Earth");
        int res1 = m1("SQL");
        System.out.println("Hi from Mars");
        int res2 = m2(3.14f);
        System.out.println("Hi from Jupiter");
        System.out.println("m1:"+res1);
        System.out.println("m2:"+res2);
        System.out.println("Bye from Earth");


    }
    public static int m1(String a){
        System.out.println("Hi Iam M1");
        System.out.println("a:"+a);
        System.out.println("Bye from M1");
        return 14;
    }
    public static char m2(float a){
        System.out.println("Hi Iam M2");
        System.out.println("a:"+a);
        System.out.println("Bye from M2");
        return '$';
    }
}
