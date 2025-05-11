package com.AllJavaConceptsImportantPractice.Part3.Recursion.Part2;

import java.util.Scanner;

public class sumOfNnumbersParameterizedWay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        parameterizedWay(n,sum);
    }
    public static void parameterizedWay(int n, int sum){
        if(n<0){
            System.out.println(sum);
            return;
        }
        parameterizedWay(n-1,sum+n);
    }
}
