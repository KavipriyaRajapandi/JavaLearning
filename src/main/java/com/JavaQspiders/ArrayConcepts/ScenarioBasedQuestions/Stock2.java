package com.JavaQspiders.ArrayConcepts.ScenarioBasedQuestions;

public class Stock2 {
    //Approach2
    public static void main(String[] args) {
        int[] a = {7,1,5,3,6,4};
        int max =Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                int profit = a[j] - a[i];
                if(profit>max && profit>0){
                    max = profit;
                }
            }
        }
        System.out.println("Maximum Number in Stock is :"+max);
    }
}
