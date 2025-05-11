package com.AllJavaConceptsImportantPractice.Part6.Problems;

public class RunLengthEncoding {
    public static void main(String[] args) {
        String s = "aaabbaac";
        String res = "";
        int count = 1;
        char[] ch = s.toCharArray();

        for(int i=0;i<ch.length-1;i++){
            if(ch[i]==ch[i+1]){
                count++;
            }
            else{
                res += ch[i] +""+ count;
                count = 1;
            }
        }
        res += ch[ch.length-1]+""+count;
        System.out.println(res);
    }
}
