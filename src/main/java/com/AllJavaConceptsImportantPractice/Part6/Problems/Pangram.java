package com.AllJavaConceptsImportantPractice.Part6.Problems;

public class Pangram {
    public static void main(String[] args) {
        String s = "ThE qUicK BrOWn fOX JumPS OVer tHE LaZY dOG";

        if(isPangram(s)){
            System.out.println("Pangram");
        }
        else{
            System.out.println("Not Pangram");
        }
    }
    public static boolean isPangram(String s){
        boolean[] seen = new boolean[26];
        s = s.toUpperCase();

        for(int i=0;i<s.length();i++){
            char letter = s.charAt(i);
            if(letter>='A' && letter<='Z'){
                seen[letter-65] = true;
            }
        }

        for(int i=0;i<seen.length;i++){
            if(!seen[i]){
                return false;
            }
        }
        return true;
    }
}
