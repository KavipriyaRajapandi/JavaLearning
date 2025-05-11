package com.JavaQspiders.ArrayConcepts.Programs.Duplication;

import java.util.Arrays;

public class ArrayDuplicationApproach2 {
    public static void main(String[] args) {
        int [] a = {8,4,8,1,2,6,1,7,9};
        Arrays.sort(a);
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if(a[i] == Integer.MAX_VALUE){
                continue;
            }
            for (int j = i+1; j < a.length; j++) {
                if(a[i] == a[j]){
                    count++;
                    a[j] = Integer.MAX_VALUE;
                }

            }

        }

        count = a.length - count;
        int [] res = new int[count];
        int x = 0;
        for (int i = 0; i <a.length; i++) {
            if(a[i] != Integer.MAX_VALUE){
                res[x] = a[i];
                x++;
            }
        }
        System.out.println(Arrays.toString(res));

    }
}
