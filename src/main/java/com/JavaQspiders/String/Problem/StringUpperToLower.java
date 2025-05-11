package com.JavaQspiders.String.Problem;

public class StringUpperToLower {
    public static void main(String[] args) {
        String s = "jAVaSCript";
        String res = "";
        char[] ch = s.toCharArray();

        for(int i=0;i<ch.length;i++){
            if(ch[i]>='a' && ch[i]<='z'){
                ch[i] -= 32;
            }
            else{
                ch[i] += 32;
            }

        }
        res += new String(ch);
        System.out.println(res);
    }
}
