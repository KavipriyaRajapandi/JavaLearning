package com.JavaCollege.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length);
//input
        for(int row = 0;row< arr.length;row++){
            for(int column = 0;column < arr[row].length;column++) {
                arr[row][column] = sc.nextInt();
            }
        }
        //output
        /*for(int row = 0;row< arr.length;row++){
            for(int column = 0;column < arr[row].length;column++) {
                System.out.print(arr[row][column]+" ");
            }
            System.out.println();
        } */

        /*for(int row = 0;row< arr.length;row++){
            System.out.println(Arrays.toString(arr[row])); //NO NEED OF COLUMNS REP WHEN ROWS ARE DEFINED
        } */

        for(int[] arr2 : arr){
            System.out.println(Arrays.toString(arr2));
        }



    }
}
