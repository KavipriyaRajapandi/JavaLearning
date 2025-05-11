package com.JavaQspiders.ArrayConcepts.Programs.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {10,20,30,40,50,60,70,80};
        System.out.println(Arrays.toString(a));
        System.out.println("Enter Key Element:");
        int key = sc.nextInt();
        if(linearsearch(a,key)){
            System.out.println("Key Found");
        }
        else{
            System.out.println("Key Not Found");
        }
    }
    public static boolean linearsearch(int[]a,int key){
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                return true;
            }
        }
        return false;
    }
}
