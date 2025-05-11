package com.AllJavaConceptsImportantPractice.Part6.StringInterviewQuestions;

public class FindingLongestWordInString {
    public static void main(String[] args) {
        String s = "I Love This Program";
        String[] arr = s.split(" ");
        String res = "";
        int max = Integer.MIN_VALUE;
        //["I","Love","This","Program"]
        for(int i=0;i<arr.length;i++){
            char[] ch = arr[i].toCharArray();
            for(int j=0;j<ch.length;j++){
                if(ch.length>max){
                    max = ch.length;
                    res = new String(ch);
                }
            }
        }
        System.out.println(res);

    }
}
