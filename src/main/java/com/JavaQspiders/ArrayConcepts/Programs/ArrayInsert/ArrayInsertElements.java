package com.JavaQspiders.ArrayConcepts.Programs.ArrayInsert;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsertElements
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter Array Size:");
        int size = sc.nextInt();
        int[] x = solve(size);

        System.out.println(Arrays.toString(x));
    }
    public static int[] solve(int size){

        int[] a = new int[size];

        for (int i = 0; i <=a.length-1; i++) {
            System.out.print("Enter the Element a"+"["+i+"]:");
            a[i] = sc.nextInt();
        }
        System.out.println("--------------");
//        for (int i = 0;i<=a.length-1;i++){
//            System.out.println(a[i]);
//        }

return a;
    }
}
