package com.AllJavaConceptsImportantPractice.Part6.StringInterviewQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LongestCommanPrefixApproach2 {
    public static void main(String[] args) {
        String[] s = {"flow","flower","float","flight"};
        String lcp = s[0];
        char[] initial = lcp.toCharArray();

        for(int i=1;i<s.length;i++){
            char[] current = s[i].toCharArray();
            for(int j=0;j<initial.length;j++){
                if(initial[j]!=current[j]){
                    lcp = lcp.substring(0,j);
                    initial = lcp.toCharArray();
                    break;
                }
            }
        }

        System.out.println(lcp);
    }
}
