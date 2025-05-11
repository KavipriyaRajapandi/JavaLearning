package com.AllJavaConceptsImportantPractice.Part1.IncrementDecrementOperator;

public class Program5 {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        int k = 3;
        int m = i-- - j-- - k--;
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(m);
    }
}
