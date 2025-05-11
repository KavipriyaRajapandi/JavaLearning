package com.JavaCollege.arrays;

import java.util.Scanner;

public class ArrayIndexSizeAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputArray = {1,2,3,4,5,6,7};
        int[] outputArray = new int[inputArray.length];

        for(int i=0;i<inputArray.length;i++){
            outputArray[i] = inputArray[i] + i;
            System.out.println(outputArray[i]);
        }
    }
}




