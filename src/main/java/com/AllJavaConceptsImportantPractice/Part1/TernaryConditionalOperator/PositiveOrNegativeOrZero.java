package com.AllJavaConceptsImportantPractice.Part1.TernaryConditionalOperator;

import java.util.Scanner;

public class PositiveOrNegativeOrZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();

        String res = (num==0) ? "Zero" : (num > 0) ? "Positive" : "Negative";

        System.out.println("Given Number is "+res);
    }
}
