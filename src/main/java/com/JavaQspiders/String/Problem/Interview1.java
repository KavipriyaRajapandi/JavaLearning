package com.JavaQspiders.String.Problem;
/*
Input:a3b12c4d1
Ouput:
aaa
bbbbbbbbbbbb
cccc
d
 */

public class Interview1 {
    public static void main(String[] args) {
        String s = "a3b12c4d1";
        String num = "";

        char[] a = s.toCharArray();

        for(int i=1;i<a.length;i++){
            if(a[i]>='0' && a[i]<='9'){
                num += a[i];
            }
            else{
                num += " ";
            }
        }

        int k=0;
        String [] b = num.split(" ");
        String ans = "";
        for(int i=0;i<a.length;i++){
            if(a[i]>='a' && a[i]<='z'){
                for(int j=1;j<=Integer.parseInt(b[k]);j++){
                    ans += a[i];
                }
                ans+="\n";
                k++;
            }
        }
        System.out.println(s);
        System.out.println(ans);


    }
}
