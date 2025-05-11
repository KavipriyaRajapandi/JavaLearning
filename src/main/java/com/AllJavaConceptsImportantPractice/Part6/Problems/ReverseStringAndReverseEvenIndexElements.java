package com.AllJavaConceptsImportantPractice.Part6.Problems;

public class ReverseStringAndReverseEvenIndexElements {
    public static void main(String[] args) {
        String s1 = "Hi how are you?";
        String res = "";
        String[] arr = s1.split(" ");

        for(int i=arr.length-1;i>=0;i--){
            if(i%2==1){
                res += arr[i];
            }
            else{
                char[] ch = arr[i].toCharArray();
                String ans = reverseString(ch);
                res += ans;
            }
            res += " ";
        }
        System.out.println(res);
    }
    public static String reverseString(char[] ch){
        String ans = "";
        for(int i=ch.length-1;i>=0;i--){
            ans += ch[i];
        }
        return ans;
    }
}
