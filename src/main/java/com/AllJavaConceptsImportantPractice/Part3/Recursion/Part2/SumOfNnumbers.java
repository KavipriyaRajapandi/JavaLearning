package com.AllJavaConceptsImportantPractice.Part3.Recursion.Part2;

import java.util.Scanner;

public class SumOfNnumbers {
    static int sum = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N number:");
        int n = sc.nextInt();

        int res = sumofNnumbers(n);

        System.out.println(res);
    }

    public static int sumofNnumbers(int n){
        if(n<0){
            return sum;
        }
        sum+=n;
        sumofNnumbers(n-1);
        return sum;
    }


}
