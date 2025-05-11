package com.SDEsheet.Recursion;

public class GivenStringPalindromeRecursion {
    public static void main(String[] args) {
        String s = "level";
        String temp = s;
        char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length-1;

        palindromeString(ch,temp,left,right);

    }
    public static void palindromeString(char[] ch,String temp,int left,int right){
        String rev = "";
       if(left<right){
           char ans = ch[left];
           ch[left] = ch[right];
           ch[right] = ans;
           left++;
           right--;
       }
       else{
           rev = new String(ch);
           if(rev.equals(temp)){
               System.out.println("Palindrome");
           }
           else{
               System.out.println("Not a Palindrome");
           }
           return;
       }
       palindromeString(ch,temp,left,right);
    }
}
