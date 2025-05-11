package com.JavaQspiders.ArrayConcepts.ScenarioBasedQuestions.Practice;

/*
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
*/

public class TrapRainWaterPractice {
    public static void main(String[] args) {
        int[] a = {4,2,0,6,3,2,5};
        int[] rm = new int[a.length];
        rm[0]=a[0];
        for (int i = 1; i < rm.length; i++) {
            rm[i] = Math.max(rm[i-1],a[i]);// rm[1-1]=4 , 2
        }
        int[] lm = new int[a.length];
        lm[rm.length-1] = a[a.length-1];
        for(int i = lm.length-2;i>=0;i--){
            lm[i] = Math.max(lm[i+1],a[i]);//lm[5]=2,5=5
        }
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum += Math.min(rm[i],lm[i])-a[i];
        }
        System.out.println("Sum of Rain Water is:"+sum);
    }
}
