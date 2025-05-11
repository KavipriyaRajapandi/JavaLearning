package com.AllJavaConceptsImportantPractice.Part1.IncrementDecrementOperator;

public class Program2 {
    public static void main(String[] args) {
        int a = 11;
        int b = 22;
        int c = 0;

        c = a + b + a++ + b++ + ++a + ++b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
