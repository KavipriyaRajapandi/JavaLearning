package com.AllJavaConceptsImportantPractice.Part6.WorkingAndSyntax;

import java.util.Arrays;
//s.toCharArray
public class ConvertStringToCharArrayManually {
    public static void main(String[] args) {
        String s = "SibiVarshaan";
        char[] ch = new char[s.length()];

        for(int i=0;i<s.length();i++){
            ch[i] = s.charAt(i);
        }

        System.out.println(Arrays.toString(ch));
    }
}
