package com.AllJavaConceptsImportantPractice.Part4.Programs;

import java.util.Arrays;

public class TypeCastingUsingArray {
    public static void main(String[] args) {
        char [] ch = {'A','B','C','D'};
        int[] res = solve(ch);
        System.out.println(Arrays.toString(res));
    }
    public static int[] solve(char[] ch){
        int[] res = new int[ch.length];

        for(int i=0;i<res.length;i++){
            res[i] = ch[i];
        }
        return res;
    }
}
