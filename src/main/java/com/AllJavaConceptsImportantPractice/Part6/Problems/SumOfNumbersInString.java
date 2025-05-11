package com.AllJavaConceptsImportantPractice.Part6.Problems;

public class SumOfNumbersInString {
    public static void main(String[] args) {
        String s = "S2y3e61d";

        char[] ch = s.toCharArray();
        int sum = 0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='0' && ch[i]<='9'){
                sum += ch[i]-48;
            }
        }
        System.out.println(sum);
    }
}
