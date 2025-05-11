package com.JavaQspiders.ArrayConcepts.Programs.Assignment.TwoPointers;

public class FindTargetSum2NumbersUsing2Pointers {
    public static void main(String[] args) {
        int[] a={8,7,2,3,1,6};
        int target = 10;
        int left = 0;
        int right = a.length-1;
        while(left<right || right==0){
            if(right==0) {
                left++;
                right = a.length-1;
            }
            if(a[left]+a[right]==target){
                System.out.println(a[left]+","+a[right]);
            }
            if(a[left]>a[right]){
                right--;
            }
            else{
                left++;
            }
        }

    }
}
