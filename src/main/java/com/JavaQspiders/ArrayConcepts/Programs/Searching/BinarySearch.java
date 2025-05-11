package com.JavaQspiders.ArrayConcepts.Programs.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {80,72,43,30,20,10,50,60};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(a));
        System.out.println("Enter the Key Element:");
        int key = sc.nextInt();
        if(binarySearch(a,key)){
            System.out.println("Key Found");
        }
        else{
            System.out.println("Key Not Found");
        }
    }
    public static boolean binarySearch(int[] a,int key){
        int left = 0;
        int right = a.length-1;
        while(left<=right){
            int middle = (left+right)/2;
            if(a[middle] == key){
                return true;
            }
            else if(key < a[middle]){
                right = middle-1;
            }
            else{
                left = middle+1;
            }
        }
        return false;
    }
}
