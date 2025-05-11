package com.AllJavaConceptsImportantPractice.Part4.Programs;
/*
2.Add the Array Elements
Input: [4,5,6,2]
Output: 17

 */

import java.util.Scanner;

public class AdditionOfArrayElementsStaticWay {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] a = {4,5,6,2};
        int sum = 0;

        for(int i=0;i<a.length;i++){
            sum += a[i];
        }
        System.out.println("Sum of all Numbers is:"+sum);
    }
}
