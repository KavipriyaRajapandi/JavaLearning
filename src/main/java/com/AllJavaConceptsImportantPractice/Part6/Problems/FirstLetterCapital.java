package com.AllJavaConceptsImportantPractice.Part6.Problems;

public class FirstLetterCapital {
    public static void main(String[] args) {
        String s = "i love india";
        String[] arr = s.split(" ");
        String res = "";
        int count = 1;

        for(int i=0;i<arr.length;i++,count=1){
            char[] ch = arr[i].toCharArray();
            for(int j=0;j<ch.length;j++) {
                if (ch[j] >= 'a' && ch[j] <= 'z' && count == 1) {
                    count++;
                    ch[j] = (char) (ch[j] - 32);
                    res += ch[j];
                } else {
                    res += ch[j];
                }
            }
            res+=" ";
        }

        System.out.println(res);
    }
}
