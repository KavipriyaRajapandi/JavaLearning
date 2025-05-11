package com.AllJavaConceptsImportantPractice.Part4.ScenarioBasedQuestions;

public class MaxAreaRainWater {
    public static void main(String[] args) {
        int[] a = {1,8,6,2,5,4,8,3,7};
        int left = 0;
        int right = a.length-1;
        int max = Integer.MIN_VALUE;
        while(left<right){
            int ln = Math.min(a[left],a[right]);
            int b = right - left;
            int area = ln*b;
            max = Math.max(area,max);
            if(a[left]<a[right]){
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println(max);
    }
}
