package com.AllJavaConceptsImportantPractice.Part6.Problems;

public class ReverseNumberInString {
    public static void main(String[] args) {
        String s = "a23bcd68ics346x";
        char[] ch = s.toCharArray();
        String res = "";
        String num = "";

        for(int i=0;i<ch.length;i++){
            if(ch[i]>='a' && ch[i]<='z'){
                res += ch[i];
            }
            else{
                num += ch[i];
                if(ch[i+1]>='a' && ch[i]<='z'){
                    int realNum = Integer.parseInt(num);
                    String rev = reverse(realNum);
                    res += rev;
                    num = "";
                }
            }
        }
        System.out.println(res);
    }
    public static String reverse(int num){
        int rev = 0;
        String ans = "";
        while(num>0){
            int last = num %10;
            rev = rev*10 + last;
            num/=10;
        }

        ans += rev;
        return ans;
    }
}
