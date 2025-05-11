package com.JavaQspiders.ArrayConcepts.ScenarioBasedQuestions;

public class MaxAreaRainWater {
    public static void main(String[] args){
        int[] a = {1,8,6,2,5,4,8,3,7};
        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                int length = Math.min(a[i],a[j]);
                int breadth = j-i;
                int area = length*breadth;
                maxArea = Math.max(area,maxArea);
            }
        }
        System.out.println("Maximum Area of the overall surface is:"+maxArea);
    }
}
