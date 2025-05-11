package com.JavaQspiders.ArrayConcepts.ScenarioBasedQuestions.Practice;

public class MaxAreaRainWater1 {
    public static void main(String[] args) {
        int[] a = {1,8,6,2,5,4,8,3,7};
        int max = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            for (int j = i+1; j < a.length; j++) {
                int length = Math.min(a[i],a[j]);
                int breadth = j - i;
                int area = length*breadth;
                max = Math.max(area,max);
            }
        }
        System.out.println("Max area in a block is "+max);
    }
}
