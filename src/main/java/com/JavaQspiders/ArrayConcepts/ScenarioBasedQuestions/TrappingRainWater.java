package com.JavaQspiders.ArrayConcepts.ScenarioBasedQuestions;
//home trace and again solve
public class TrappingRainWater {
    public static void main(String[] args) {
        int[] b= {4,2,0,6,3,2,5};
        int[] rm = new int[b.length];
        rm[0] = b[0];
        for (int i = 1; i < rm.length; i++) {
            rm[i] = Math.max(b[i],rm[i-1]);
        }
        int[] lm = new int[b.length];
        lm[lm.length-1] = b[b.length-1];
        for (int i = lm.length-2; i >= 0; i--) {
            lm[i] = Math.max(b[i],lm[i+1]);
        }
        int sum=0;
        for (int i = 0; i < b.length; i++) {
            sum+= (Math.min(rm[i],lm[i]))-b[i];
        }
        System.out.println("Sum of rainWater Problem:"+sum);
    }
}
