package com.JavaQspiders.ArrayConcepts.ScenarioBasedQuestions;

public class Stock {
    //Approach 1
    public static void main(String[] args) {
        int [] a = {7,1,5,3,6,4};
        int buy = a[0];
        int max = Integer.MIN_VALUE;
        for(int i=1;i<a.length;i++){
            int profit = a[i] - buy;
            buy = Math.min(a[i],buy);
            max = Math.max(max,profit);
        }
        System.out.println("Maximum Number in Stock:"+max);
    }
}
