package com.AllJavaConceptsImportantPractice.Part4.ScenarioBasedQuestions;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] a = {4,2,0,6,3,2,5};
        int sum = 0;

        //left max
        int[] lm = new int[a.length];
        lm[0] = a[0];
        for(int i=1;i<a.length;i++){
            lm[i] =  Math.max(lm[i-1],a[i]);
        }

        //right max
        int[] rm = new int[a.length];
        rm[a.length-1] = a[a.length-1];
        for(int i=a.length-2;i>=0;i--){
            rm[i] = Math.max(rm[i+1],a[i]);
        }

        for(int i=0;i<a.length;i++){
            sum += Math.min(lm[i],rm[i]) - a[i];
        }
        System.out.println(sum);


    }
}
