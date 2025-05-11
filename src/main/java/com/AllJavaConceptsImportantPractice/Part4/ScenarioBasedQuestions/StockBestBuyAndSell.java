package com.AllJavaConceptsImportantPractice.Part4.ScenarioBasedQuestions;

public class StockBestBuyAndSell {
    public static void main(String[] args) {
        int[] a = {7,1,5,3,6,4};
        int max = Integer.MIN_VALUE;
        int buy = a[0];
        for(int i=1;i<a.length;i++){
            int profit = a[i] - buy;
            buy = Math.min(buy,a[i]);
            max = Math.max(max,profit);
        }
        System.out.println(max);
    }
}
