package com.AllJavaConceptsImportantPractice.Part6.StringInterviewQuestions;

public class LongestCommanPrefix {
    public static void main(String[] args) {
        String[] arr = {"flower","flow","flight","flintstones"};

        String ans = longestCommanPrefix(arr);

        System.out.println(ans);

    }

    public static String longestCommanPrefix(String[] s){
        String res = "";
        int longestPrefix = 0;
        int until_longest = 1;
        for(int i=0;i<s.length;i++){
            for(int j=0;j<s.length;j++) {
                if(longestPrefix>=until_longest && i==0) {
                    res += s[i].charAt(j-1);
                    until_longest = longestPrefix;
                    longestPrefix = 0;
                }
                for(int k=1;k<s.length;k++) {
                    if (s[i].charAt(j) == s[k].charAt(j)) {
                        longestPrefix++;
                    }
                    else{
                        longestPrefix=0;
                    }

                }
            }

        }
        return res;
    }
}
