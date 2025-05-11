package com.Searching.BinarySearch;

import java.util.Scanner;

public class OrderAgnosticBS {
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
        int ans = orderAgnosticBinarySearch(arr,target);
        System.out.println(ans);

        // {10 , 15 , 121 , 21, 143 , 192}

    }
    static int orderAgnosticBinarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start) / 2; // a + (b-a)/2 -> 2a + b - a/2 -> (a + b)/2

            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}
