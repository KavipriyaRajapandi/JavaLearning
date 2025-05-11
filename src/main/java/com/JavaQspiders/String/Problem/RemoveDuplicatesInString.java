package com.JavaQspiders.String.Problem;

import java.util.Scanner;

public class RemoveDuplicatesInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s1 = sc.nextLine();
        String res = removeDuplicate(s1);
        System.out.println(res);

    }
    public static String removeDuplicate(String s1){
        char[] ch = s1.toCharArray();
        String res = "";
        String duplicate = "";
        int count;

        for(int i=0;i<ch.length;i++){
            count = 0;
            for(int j=i+1;j<ch.length;j++){
                if((ch[i]>='a' && ch[i]<='z') && (ch[j]>='a' && ch[j]<='z')){
                    if(ch[i] == ch[j]){
                        duplicate = ch[j] + duplicate;
                        count = count+1;
                    }
                }
            }
            if(count==0){
                res = res + ch[i];
            }


        }
        return res;


    }

}
