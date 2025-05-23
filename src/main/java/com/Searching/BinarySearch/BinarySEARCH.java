package com.Searching.BinarySearch;

import java.util.Scanner;

public class BinarySEARCH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array ELements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target value:");
        int target = sc.nextInt();
        int ans = binarysearch(arr,target);
        System.out.println(ans);


    }
    static int binarysearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
