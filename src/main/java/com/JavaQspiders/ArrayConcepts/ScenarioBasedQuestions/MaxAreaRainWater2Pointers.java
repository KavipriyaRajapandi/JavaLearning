package com.JavaQspiders.ArrayConcepts.ScenarioBasedQuestions;

public class MaxAreaRainWater2Pointers {
    public static void main(String[] args) {
        int[] a = {1,8,6,2,5,4,8,3,7};
        int max = Integer.MIN_VALUE;
        int l = 0;
        int r = a.length-1;
        while(l<r){
            int ln = Math.min(a[l],a[r]);
            int br = r - l;
            int area = ln*br;
            max = Math.max(area,max);
            if(a[r]>a[l]){
                l++;
            }
            else{
                r--;
            }
        }
        System.out.println("Max Area in which best max length and best max breadth is "+max);
    }
}
