package com.AllJavaConceptsImportantPractice.Part3.Methods.Programs;

public class Program1 {
    public static void main(String[] args) {
        System.out.println("Hi from Main");
        sibi(14,false);
        System.out.println("Bye from Main");
    }

    public static void sibi(int a,boolean b){
        System.out.println("Hi from Sibi");
        System.out.println((b)?"Yes":"No");
        System.out.println("Bye from Sibi");
        return;
    }
}
