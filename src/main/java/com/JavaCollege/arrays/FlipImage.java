package com.JavaCollege.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FlipImage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        flipAndInvertImage(arr);





    }
    public static void flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] ansArr = new int[n][n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            int j = n - 1;
            while (j >= 0) {
                ansArr[i][count] = image[i][j];
                if (ansArr[i][count] == 1) {
                    ansArr[i][count] = 0;
                } else {
                    ansArr[i][count] = 1;
                }
                count++;
                j--;
            }
            count = 0;
        }
        System.out.println(Arrays.deepToString(ansArr));



    }


}
