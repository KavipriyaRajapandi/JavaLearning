package com.AllJavaConceptsImportantPractice.Part6.Problems;

import java.util.Arrays;

public class SortCharButNotPosition {
    public static void main(String[] args) {
        String s = "aceADBbZY";
        char[] ch = s.toCharArray();
        String res = "";
        String uc = "";
        String lc = "";
        Arrays.sort(ch);

        for(int i=0;i<ch.length;i++){
            if(ch[i]>='A' && ch[i]<='Z'){
                uc += ch[i];
            }
            else{
                lc += ch[i];
            }
        }

        char[] u = uc.toCharArray();
        char[] l = lc.toCharArray();
        int x = 0;
        int y = 0;

        for(int i=0;i<s.length();i++){
            char letter = s.charAt(i);
            if(letter>='a' && letter<='z'){
                res += l[x];
                x++;
            }
            else{
                res += u[y];
                y++;
            }
        }

        System.out.println(res);
    }
}
