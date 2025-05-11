package com.AllJavaConceptsImportantPractice.Part5.Problems;

/*
0th index = Sorting
1st index = Missing Number
2nd index = Print Even Index Number
3rd index = Addition of Elements
 */

import java.util.Arrays;

public class MDAusingArrayProblems {
    public static void main(String[] args) {
        int[][] a = {
                {-3,8,7,4},
                {6,0,1,2,5},
                {1,6,4,2,8},
                {2,1,3,8,5}
        };
        for(int i=0;i<a.length;i++){
            switch(i){
                case 0:{
                    int[] arr = sorting(a[i]);
                    for(int j=0;j<arr.length;j++){
                        System.out.print(arr[j]+" ");
                    }
                    break;
                }

                case 1:{
                    System.out.println();
                    missingNumber(a[i]);
                    break;
                }
                case 2:{
                    System.out.println();
                    evenIndexNumber(a[i]);
                    break;
                }
                case 3:{
                    System.out.println();
                    int sum = additionOfElements(a[i]);
                    System.out.println(sum+" ");
                    break;
                }

            }
        }
    }
    public static int[] sorting(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void missingNumber(int[] arr){
        Arrays.sort(arr);
        int count = 0;
        for(int i=0;i<arr.length;i++,count++){
            if(arr[i]!=count){
                System.out.print(count+" ");
                i--;
            }


        }
    }

    public static void evenIndexNumber(int[] arr){
        for(int i=0;i< arr.length;i++){
            if(i%2==0){
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static int additionOfElements(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
}
