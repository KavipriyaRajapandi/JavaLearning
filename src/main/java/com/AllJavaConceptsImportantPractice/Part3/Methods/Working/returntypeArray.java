package com.AllJavaConceptsImportantPractice.Part3.Methods.Working;

import java.util.Arrays;

public class returntypeArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        passbyreference(arr);

        System.out.println(Arrays.toString(arr));

    }
    public static void passbyreference(int[] nums){ //call by value
        nums[0]= 99;
    }
}
