package com.JavaCollege.arrays;

import java.util.Arrays;

public class ArrayPassingFunctions {
    public static void main(String[] args) {

        int[] nums = {1 , 2, 3 , 5 ,6 ,6};
        System.out.println(Arrays.toString(nums));
        ChangeValue(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void ChangeValue(int[] arr){
        arr[1] = 12;
    }
}
