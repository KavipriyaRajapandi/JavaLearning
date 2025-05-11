package com.JavaQspiders.MultiDimensionalArraysConcepts.Programs;
import java.util.Arrays;
public class ArrayProblemsMultiDimensionalArrays {
    public static void main(String[] args) {
        int a[][] = {
                {-3,8,7,4},
                {6,0,1,2,5},
                {1,6,4,2,8},
                {2,1,3,8,5}
        };
        for (int i = 0; i < a.length; i++) {
            if(i==0){
                sorted(a[i]);
            }
            if(i==1){
                missingNo(a[i]);
            }
            if(i==2){
                EvenIndex(a[i]);
            }
            if(i==3){
                addElements(a[i]);
            }


        }

    }
    public static void sorted(int [] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void missingNo(int [] arr){
        Arrays.sort(arr);
        int start = 0;
        for (int i = 0; i < arr.length; i++,start++) {
            if(arr[i] != start){
                System.out.print(start+" ");
                i--;
            }
        }
    }
    public static void EvenIndex(int[] arr){
        System.out.println();
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void addElements(int[] arr){
        System.out.println();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.print(sum);
    }
}
