package com.AllJavaConceptsImportantPractice.Part6.Problems;

public class RemoveDuplicateInStrings {
    public static void main(String[] args) {
        String s1 = "Helllo";
        boolean[] seen = new boolean[255];
        char[] ch = s1.toCharArray();
        String ans = "";

        for(int i=0;i<ch.length;i++){
            seen[ch[i]] = true;
        }

        for(int i=0;i<ch.length;i++){
            if(seen[ch[i]]){
                ans += ch[i];
                seen[ch[i]] = false;
            }
        }
        System.out.println(ans);
    }
}
