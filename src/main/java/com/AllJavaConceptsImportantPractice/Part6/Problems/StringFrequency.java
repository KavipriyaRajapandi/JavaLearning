package com.AllJavaConceptsImportantPractice.Part6.Problems;

public class StringFrequency {
    public static void main(String[] args) {
        String a = "hellol";
        char[] ch = a.toCharArray();
        boolean[] seen = new boolean[255];
        int[] count = new int[255];

        String res = "";

        for(int i=0;i<ch.length;i++){
            seen[ch[i]]=true;
            count[ch[i]]++;
        }

        for(int i=0;i<ch.length;i++){
            if(seen[ch[i]]){
                res += ch[i] + ":" + count[ch[i]]+"\n";
                seen[ch[i]] = false;
            }
        }
        System.out.println(res);
    }
}
