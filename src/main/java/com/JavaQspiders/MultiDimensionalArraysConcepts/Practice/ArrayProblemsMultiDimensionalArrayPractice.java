package com.JavaQspiders.MultiDimensionalArraysConcepts.Practice;

/*
0th index = Sorting
1st index = Missing Number
2nd index = Print Even Index Number
3rd index = Addition of Elements
 */

import java.util.Arrays;

public class ArrayProblemsMultiDimensionalArrayPractice {
    public static void main(String[] args) {
        int a[][] = {
                {-3,8,7,4},
                {6,0,1,2,5},
                {1,6,4,2,8},
                {2,1,3,8,5}
        };
        for(int i=0;i<a.length;i++){
            switch (i){
                case 0:{
                    int[] res = sorting(a[i]);
                    for(int j=0;j<res.length;j++){
                        System.out.print(res[j]+" ");
                    }
                    System.out.println();
                    break;
                }
                case 1:{
                    missingNumber(a[i]);
                    System.out.println();
                    break;
                }
                case 2:{
                    printEvenIndexNumber(a[i]);
                    System.out.println();
                    break;
                }
                case 3:{
                    additionOfElements(a[i]);
                    break;
                }
            }
        }
    }
    public static int[] sorting(int[] arr){
        //{-3,8,7,4}
        //BubbleSort
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void missingNumber(int[] arr){
        //{6,0,1,2,5}
        Arrays.sort(arr);
        for (int i = 0,start=0; i <arr.length; i++,start++) {
            if(arr[i]!=start){
                System.out.print(start+" ");
            }
        }
    }
    public static void printEvenIndexNumber(int[] arr){
        //{1,6,4,2,8}
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void additionOfElements(int [] arr){
        //{2,1,3,8,5}
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.print(sum);
    }
}
