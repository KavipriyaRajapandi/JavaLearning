package com.AllJavaConceptsImportantPractice.Part6.Problems;

public class ChangeUpperToLowerAndLowerToUpper {
    public static void main(String[] args) {
        String s = "jAVaSCript";
        String res = "";

        for(int i=0;i<s.length();i++){
            char letter = s.charAt(i);
            if(letter>='a' && letter<='z'){
                letter = (char)(letter - 32);
                res = res + letter;
            }
            else{
                letter = (char)(letter + 32);
                res = res + letter;
            }
        }
    }
}
