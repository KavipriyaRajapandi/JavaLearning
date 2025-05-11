package com.JavaCollege.arrays;

import java.util.Scanner;

public class MaximumArraySize {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        for(int i = 0;i<n;i++){
            list[i]  = sc.nextInt();
        }
        for(int i = 0;i<n;i++) {
            System.out.println(list[i]);
        }

        int[] list2 ={10 , 20 ,30,40,50,60,70,80,90,100};

        System.out.println();

        System.out.println(MaxValRange(list,0,10));

    }

    //edge cases are being added
    static int MaxValRange(int[] arr,int start,int end){

        if(end > start){
            return -1;
        }

        if(arr == null){
            return -1;
        }


        int maxVal = arr[start];
        for(int i = start; i<end;i++){
            if(maxVal < arr[i]){
                maxVal = arr[i];
            }
        }
        return maxVal;



    }

    static int MaxVal(int[] arr){





        int maxVal = arr[0];
        for(int i = 0; i<arr.length;i++){
            if(arr.length==0){
                return -1;
            }
            if(maxVal < arr[i]){
                maxVal = arr[i];
            }
        }
        return maxVal;



    }

}
