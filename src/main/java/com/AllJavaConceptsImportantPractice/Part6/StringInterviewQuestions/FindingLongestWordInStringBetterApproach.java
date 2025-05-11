package com.AllJavaConceptsImportantPractice.Part6.StringInterviewQuestions;

public class FindingLongestWordInStringBetterApproach {
    public static void main(String[] args) {
        String s = "I Love This Program";
        String[] arr = s.split(" ");
        String res = "";
        int max = 0;

        for(String word : arr){
            if(word.length() > max){
                max = word.length();
                res = word;
            }
        }

        System.out.println(res);
    }
}
