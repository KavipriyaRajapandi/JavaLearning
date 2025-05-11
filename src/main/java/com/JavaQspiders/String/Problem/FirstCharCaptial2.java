package com.JavaQspiders.String.Problem;

public class FirstCharCaptial2 {
    public static void main(String[] args) {
        String s = "i love india";
        char[] ch = s.toCharArray();
        String ans = "";
        ch[0] -= ch[0] >= 'a' && ch[0]<= 'z' ? 32 : 0;
        ans += ch[0];
        for(int i=1;i< ch.length;i++){
            if(ch[i]==' ')
                ch[i+1] -= ch[i+1]>= 'a' && ch[i+1]<= 'z' ? 32:0;

            ans += ch[i];
        }
        System.out.println(s);
        System.out.println(ans);
    }
}
