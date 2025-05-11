package com.AllJavaConceptsImportantPractice.Part6.StringInterviewQuestions;

public class LongestCommanPrefixCorrectApproach {
    public static void main(String[] args) {
        String[] s = {"flower","flow","flight"};

        String res = longestCommanPrefix(s);
        System.out.println(res);
    }
    public static String longestCommanPrefix(String[] strs){
        if(strs==null || strs.length==0){
            return "";
        }
        String prefix = strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);

                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
}
