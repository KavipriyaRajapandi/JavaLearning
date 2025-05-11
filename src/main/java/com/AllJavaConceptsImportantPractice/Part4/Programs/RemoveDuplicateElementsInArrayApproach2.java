package com.AllJavaConceptsImportantPractice.Part4.Programs;

import java.util.Arrays;

public class RemoveDuplicateElementsInArrayApproach2 {
    public static void main(String[] args) {
        int[] a= {8,4,8,1,2,6,1,7,9};
        removeDuplicate2(a);
    }
    public static void removeDuplicate2(int[] a){
        int count = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]==Integer.MAX_VALUE){
                continue;
            }
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                    a[j]=Integer.MAX_VALUE;
                }
            }
        }
        int[] res = new int[a.length-count];

        for(int i=0,j=0;i<a.length;i++){//traverse all the a value so put a
            if(a[i]!=Integer.MAX_VALUE){
                res[j++] = a[i];//important when true j increment
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
