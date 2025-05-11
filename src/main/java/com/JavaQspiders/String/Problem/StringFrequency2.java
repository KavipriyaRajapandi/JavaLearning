package com.JavaQspiders.String.Problem;

public class StringFrequency2 {
    public static void main(String[] args) {
        String s = "hellol";
        char[] ch = s.toCharArray();
        int[] a = new int[256];
        boolean[] b = new boolean[256];
        String ans="";

        for(int i=0;i<ch.length;i++){
            b[ch[i]] = true;
            a[ch[i]]++;
        }
        for(int i=0;i<ch.length;i++){
            if(b[ch[i]]){
                ans += ch[i] + ":" + a[ch[i]] + "\n";
                b[ch[i]] = false;
            }
        }
        System.out.println(ans);


    }
}
