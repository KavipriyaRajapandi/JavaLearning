package com.AllJavaConceptsImportantPractice.Part1.IncrementDecrementOperator;

public class Program7 {
    public static void main(String[] args) {
        int i = 19;
        int j = 29;
        int k;
        k= i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
}
