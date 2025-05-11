package com.AllJavaConceptsImportantPractice.Part1.TernaryConditionalOperator;

import java.util.Scanner;

public class EvenOrOddOrZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        String res = (num==0)?"Zero":(num %2 ==0) ? "Even" : "Odd";

        System.out.println("Given Number is "+res);
    }
}
