package com.JavaQspiders.ArrayConcepts.ScenarioBasedQuestions.Practice;

public class TrappingRainWater2Pointers {
    public static void main(String[] args) {
        int[] a={4,2,0,6,3,2,5};
        int left = 0;
        int right = a.length-1;
        int leftMax = a[left]; //4
        int rightMax = a[right]; //5
        int sum = 0;

        while(left<right){
            if(leftMax<rightMax){
                left++;//2
                leftMax = Math.max(leftMax,a[left]);
                sum += leftMax - a[left];
            }
            else{
                right--;//2
                rightMax = Math.max(rightMax,a[right]);
                sum+= rightMax - a[right];
            }
        }
        System.out.println("Trapped Water sum is: "+sum);
    }
}
