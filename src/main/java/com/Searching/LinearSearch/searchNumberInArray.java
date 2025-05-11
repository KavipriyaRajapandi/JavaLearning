package com.Searching.LinearSearch;

import javax.sound.midi.SysexMessage;
import java.util.Arrays;
import java.util.Scanner;

public class searchNumberInArray {
    public static void main(String[] args){
        // { 1, 2, 3, 4, 5, 6, 7}
        // is there a target number 5 in the array found it
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the array length:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n ; i++) {
            nums[i] = sc.nextInt();

        }
        for (int i = 0; i < n ; i++) {
            System.out.println(nums[i]);
        }
//INDEX VALUE
        System.out.println("To find the linear search of element 5 index value");
        System.out.println();

        int target = 5;

        int ans = linearSearch(nums,target);
        System.out.println(ans);


//ELEMENT TO GET IN ARRAY
       /* System.out.println("To find the element in the array");
        System.out.println();
        int target = 5;
        int ans2 = linearSearch2(nums,target);
        System.out.println(ans2);

        */
//ELEMENT IS FOUNDED TRUE OR NOT
      /* System.out.println("To find the element in the array is true or not");
        System.out.println();
        int target = 5;

        boolean ans3 = linearSearch3(nums,target);
        System.out.println(ans3);



       */
    }

    //Linear Search for find an element is true or false
    static boolean linearSearch3(int[] arr,int target){
        if(arr.length == 0){
            return false;
        }
        //if array empty then above statement will works
        //if not use for loop
        for (int element : arr) {
            if (element == target) {
                return true;
            }

        }
        //if the value not available then return nothing;
        return false;
    }

    //Linear Search for find an element value itself
    static int linearSearch2(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        //if array empty then above statement will works
        //if not use for loop
        for (int element : arr) {
            if (element == target) {
                return element;
            }

        }
        //if the value not available then return nothing;
        return -1;
    }

    //Linear Search for find an element index value
    static int linearSearch(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        //if array empty then above statement will works
        //if not use for loop
        for (int i = 0; i < arr.length; i++) {
            //here we need to check the element is equal to the target so follow doing
            int element = arr[i]; //arr[5] = 10;
            if(element == target){
                return i;
            }

        }
        //if the value not available then return nothing;
        return -1;
    }

}
