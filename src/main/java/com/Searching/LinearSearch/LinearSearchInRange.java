package com.Searching.LinearSearch;

import java.util.Scanner;

public class LinearSearchInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array:");
        int n = sc.nextInt();

        System.out.println("Enter the array and start and end inbetween values only can be accessed:");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n;i++){
            //System.out.println(arr[i]);
        }
        //IMPORTANT PART IN RANGE
        int target = 10;

        int ans = linearSearch(arr,target,0,4);
        System.out.println(ans);



    }
    static int linearSearch(int[] arr,int target,int start,int end){
        if(arr.length == 0){
            return -1;
        }
        //if array empty then above statement will works
        //if not use for loop
        for (int i = start; i <=end; i++) {
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
