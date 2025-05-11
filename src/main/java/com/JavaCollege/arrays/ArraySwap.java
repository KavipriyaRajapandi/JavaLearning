package com.JavaCollege.arrays;

import java.util.Scanner;

public class ArraySwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //int n = sc.nextInt();

        int[] list = new int[6];

        for(int i=0;i<6;i++){
            list[i] = sc.nextInt();
        }
        /*for(int i=0;i<n;i++){
            System.out.println(list[i]);

        }

         */

        arraysizeAddition(list);


/*
        swap(list,2,3);

        System.out.println(Arrays.toString(list));

        System.out.println();

        reverse(list);

        System.out.println(Arrays.toString(list));


 */

    }

    static void arraysizeAddition(int[] arr){
        for(int i = 0;i<6;i++){
            System.out.println(i+i);


        }

    }



/*
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(end > start){
            //swap
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr1, int index1, int index2){
        int temp =  arr1[index1];
        arr1[index1] = arr1[index2];
        arr1[index2] = temp;


    }

 */


}
