package com.JavaQspiders.ArrayConcepts.Programs.Assignment.BruteForce;
//go home and trace again and solve problem.
import java.util.Scanner;

public class KthLargest {
    static Scanner sc = new Scanner(System.in);
    static int largest= 0;
    public static void main(String[] args) {
        System.out.println("Enter K Value:");
        int K = sc.nextInt();
        int[] a = {8,4,-3,16,7,12,1};

        for(int m=1;m<=K;m++){
            largest = Integer.MIN_VALUE;
            for (int i = 0; i < a.length; i++) {
                if(a[i]>largest){
                    largest = a[i];
                }
            }
            for (int i = 0; i < a.length; i++) {
                if(a[i]==largest){
                    a[i] = Integer.MIN_VALUE;
                }
            }
        }
        System.out.println(K+"Largest Value is "+largest);
    }
}
