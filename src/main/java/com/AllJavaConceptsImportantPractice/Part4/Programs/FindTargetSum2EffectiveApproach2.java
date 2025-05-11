package com.AllJavaConceptsImportantPractice.Part4.Programs;

public class FindTargetSum2EffectiveApproach2 {
    public static void main(String[] args) {
        int[] a = {2,3,4,7,6,8};
        int target = 10;
        solve(a,target);
    }
    public static void solve(int[] a,int target){
        int start = 0;
        int end = a.length-1;
        while(start<end || end == 0){
            if(end==0){
                start++;
                end = a.length-1;
            }
            if(a[start]+a[end]==target){
                System.out.println(a[start]+","+a[end]);
            }
            if(a[start]<a[end]){
                end--;
            }
            else{
                start++;
            }
        }
    }
}
