package com.AllJavaConceptsImportantPractice.Part3.InterviewQuestions;

import java.util.Arrays;

public class intergerArrayReturn {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] res = isReturnArray(a);
        System.out.println(Arrays.toString(res));
    }
    public static int[] isReturnArray(int[] a){
        return a;
    }

}
