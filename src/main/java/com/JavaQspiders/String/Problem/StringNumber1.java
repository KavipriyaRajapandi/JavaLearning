package com.JavaQspiders.String.Problem;

import java.awt.*;

public class StringNumber1 {
    public static void main(String[] args) {
        String s = "a23bcd68icd346x";
        char[] a = s.toCharArray();
        String res = "";
        String num = "";
        for(int i=0;i<a.length;i++){
            if(a[i]>='a' && a[i]<='z'){
                res += a[i];
            }
            else{
                num += a[i];
                if(a[i+1]>='a' && a[i+1]<='z'){
                    int realnum = Integer.parseInt(num);
                    String ans = reverse(realnum);
                    res += ans;
                    num = "";
                }
            }
        }

        System.out.println(s);
        System.out.println(res);
    }
    public static String reverse(int num){
        int rev= 0;
        String ans = "";
        while(num>0){
            int last = num%10;
            rev = rev*10 + last;
            num /=10;
        }
        ans += rev;
        return ans;
    }

}
