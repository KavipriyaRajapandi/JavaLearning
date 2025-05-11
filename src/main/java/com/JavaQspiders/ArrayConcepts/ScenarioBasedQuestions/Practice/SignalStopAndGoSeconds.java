package com.JavaQspiders.ArrayConcepts.ScenarioBasedQuestions.Practice;

import java.util.Scanner;

public class SignalStopAndGoSeconds {
    static int greenSecond = 0;
    static int redSecond = 0;
    static int totalSecond = 0;
    static int[] a = new int[5];
    static int start = 0;
    static int end = a.length - 4;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        greenLight(a);
        for(int i=0;i<a.length;i++){
            totalSecond += a[i];
        }
        System.out.println("Total Seconds Travelled by Car From A to B is "+totalSecond);
    }

    public static void greenLight(int[] a) {
        if (start < end) {
            for (int i = 0; i < 7; i++) {
                greenSecond++;
            }
            if (start >= 0 && start < a.length) {
                a[start] += greenSecond;
            }
            greenSecond = 0;

            if (end <= a.length - 1) {
                redLight(a);
            }
        }
    }

    public static void redLight(int[] a) {
        if (start < end) {
            while (redSecond < 3) {
                redSecond++;
            }
            if (start >= 0 && start < a.length) {
                a[start] += redSecond;
            }
            redSecond = 0;
        }

        start++;
        end++;
        if (end <= a.length) {
            greenLight(a);
        }
    }
}
