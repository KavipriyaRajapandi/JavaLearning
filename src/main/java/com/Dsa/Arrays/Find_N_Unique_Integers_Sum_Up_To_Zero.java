package com.Dsa.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Find_N_Unique_Integers_Sum_Up_To_Zero {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] res = isSumUpZero(n);
        System.out.println(Arrays.toString(res));
    }
    public static int[] isSumUpZero(int n){
        /*
        Your code ensures that the sum of the returned array is always zero by making the last element -sum of the previous (n-1) elements.

        Key points about your approach:
        Ensures uniqueness: It generates n-1 unique random numbers.
        Enforces sum zero: The last number is set as -sum to make the total sum zero.
        Avoids duplicates: It ensures lastNum is not already used, guaranteeing uniqueness.
         */
        int[] a = new int[n];
        Random rand = new Random();
        HashSet<Integer> usedNumbers = new HashSet<>();
        int LastNum = 0;
        int sumFinal = 0;

        while(true){
            sumFinal = 0;
            usedNumbers.clear();

            for(int i=0;i<n-1;i++){
                int num = 0;

                do{
                    num = rand.nextInt(1000)-500;
                }while (usedNumbers.contains(num));

                a[i] = num;
                usedNumbers.add(num);
                sumFinal += num;
            }
            LastNum = -sumFinal;

            if(!usedNumbers.contains(LastNum)){
                a[n-1] = LastNum;
                break;
            }
        }
        return a;


    }
}
