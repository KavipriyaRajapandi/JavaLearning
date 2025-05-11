package com.AllJavaConceptsImportantPractice.Part4.InterviewBasedQuestions;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] a = {7,6,4,3,1};
        int max = solve(a);
        System.out.println(max);
    }
    public static int solve(int[] a){
        int max = Integer.MIN_VALUE;
        int buy = a[0];
        for(int i=1;i<a.length;i++){
            int proft = a[i] - buy;
            buy = Math.min(a[i],buy);
            max = Math.max(max,proft);
        }
        return max;
    }
}
