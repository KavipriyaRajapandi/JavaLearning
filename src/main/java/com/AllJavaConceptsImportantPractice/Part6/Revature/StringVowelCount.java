package com.AllJavaConceptsImportantPractice.Part6.Revature;

public class StringVowelCount {
    public static void main(String[] args) {
        String s = "It is a very pleasant morning";
        s = s.toLowerCase();
        int count = 0;
        for(int i=0;i<s.length();i++){
            char letter = s.charAt(i);
            if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'){
                count++;
            }
        }
        System.out.println(count);

    }
}
