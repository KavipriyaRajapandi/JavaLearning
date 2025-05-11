package com.LogicQuestion.NumbersProgram.SameConcept2;

import java.util.Scanner;

public class FactorialOfaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int number = sc.nextInt();
        long factorial = factofNum(number);
        System.out.print("The factorial number of " + number + " is " + factorial);
    }

    public static long factofNum(int num) {
        if (num < 0) {
            return -1;
        } else if (num == 0 || num == 1) {
            return 1;
        } else {
            long result = 1;
            for (int i = 2; i <= num; i++) {
                result = result * i;
            }
            return result;
        }
    }
}




