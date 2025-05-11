package com.Searching.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        /*System.out.println("Enter the row length:");
        int n = sc.nextInt();
        System.out.println("Enter the column length:");
        int m = sc.nextInt();

         */
        int[][] arr = {
                {1,2,3},
                {9,7},
                {23,5,8,6},
                {12,34}

        };
        /*
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = sc.nextInt();
            }
        }

         */

        /*
        for(int[] arr2 : arr){
            System.out.println(Arrays.toString(arr2));
        }

         */


        int target = 34;
        int[] ans = search2d(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search2d(int[][] arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if(arr[row][column] == target){
                    return new int[]{row,column}; // new int[][]
                }
            }
        }
        return new int[]{-1,-1};
    }





}
