package com.SDEsheet.Strings;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        s = s.toLowerCase();
        char[] ch = s.toCharArray();
        String rev = "";

        for(int i=0;i<ch.length;i++){
            if(ch[i]>='a' && ch[i]<='z'){
                rev += ch[i];
            }
        }
        String temp = rev;


        char[] r = rev.toCharArray();
        int left = 0;
        int right = r.length-1;
        validpalindrome(r,temp,left,right);


    }

    public static void validpalindrome(char[] r,String temp,int left,int right){
        String rev = "";
        if(left<right){
            char ans = r[left];
            r[left] = r[right];
            r[right] = ans;
            left++;
            right--;
        }
        else{
            rev = new String(r);
            if(temp.equals(rev)){
                System.out.println("Valid Palindrome");
                return;
            }
            else{
                System.out.println("Not a Valid Palindrome");
                return;
            }
        }
        validpalindrome(r,temp,left,right);
    }
}
