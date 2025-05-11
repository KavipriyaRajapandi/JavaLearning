package com.JavaQspiders.MethodsInJava.Problems;

public class Practice1 {
    public static void main(String[] args) {
        System.out.println("Hi iam Main");
        char res = ex1("Java");
        System.out.println("Earth");
        System.out.println(res);
        System.out.println(ex1("Python"));
        System.out.println("Bye from Main");

    }
    public static char ex1(String a){
        System.out.println("Hello Mars: "+a);
        return '$';
    }

}
