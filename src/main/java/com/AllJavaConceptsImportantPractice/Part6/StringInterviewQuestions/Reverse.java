package com.AllJavaConceptsImportantPractice.Part6.StringInterviewQuestions;

public class Reverse {
    public static void main(String[] args) {
        String s = "I.LIKE.THIS.PROGRAM";
        char[] a = s.toCharArray();
        String res = "";

        for(int i=a.length-1;i>=0;i--){
            res += a[i];
        }
        System.out.println(res);
    }
}
