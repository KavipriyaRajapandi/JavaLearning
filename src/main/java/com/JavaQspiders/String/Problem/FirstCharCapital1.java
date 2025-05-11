package com.JavaQspiders.String.Problem;

public class FirstCharCapital1 {
    public static void main(String[] args) {
        String s = "i love india";
        String[] b = s.split(" ");
        String res = "";

        for(int i=0;i<b.length;i++){
            char[] ch = b[i].toCharArray();

            if(ch[0]>='a' && ch[0]<='z'){
                ch[0] -= 32;
                res += new String(ch)+" ";
            }
        }
        System.out.println(res);

    }
}
