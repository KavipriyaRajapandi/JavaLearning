package com.AllJavaConceptsImportantPractice.Part4.InterviewBasedQuestions;

import java.util.Arrays;

public class PrintAll_DuplicateArray {
    public static void main(String[] args) {
        int[] a = {5,-7,7,0,7,3,-7,8,0,7};
        int[] p = new int[a.length];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]){
                    p[i]++;
                }
            }
        }

        int count = 0;

        for(int i=0;i<p.length;i++){
            if(p[i]>1){
                count++;
            }
        }

        int[] res = new int[count];
        int x = 0;

        for(int i=0;i<a.length;i++){
            if(p[i]>1){
                res[x] = a[i];
                x++;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
