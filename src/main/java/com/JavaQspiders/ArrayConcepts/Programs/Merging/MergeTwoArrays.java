package com.JavaQspiders.ArrayConcepts.Programs.Merging;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] a = {4,5,6,2};
        int[] b = {7,8,3,1};
        System.out.println("Given Array a:"+Arrays.toString(a));
        System.out.println("Given Array b:"+Arrays.toString(b));
        int[] res= solve(a,b);
        System.out.println("----------------------");
        System.out.println("Merged Array:"+Arrays.toString(res));
    }
    public static int[] solve(int[] x,int[] y){
        int[] c = new int[x.length+y.length];

        for(int i=0,m=0,n=0;i<c.length;i++){
            if(m<x.length){
                c[i] = x[m];
                m++;
            }
            else if(n<y.length){
                c[i] = y[n];
                n++;
            }
        }
        return c;
    }

}
