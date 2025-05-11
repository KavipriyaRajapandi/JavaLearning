package com.Searching.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class searchInStrings {
    public static void main(String[] args) {
        //to check in string that char is availabe or not;
        //LIKE STRING = SIBI;
        // I is avaiable;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String name:");
        String str = sc.next();
        System.out.println("Enter the target character:");
        char target = sc.next().charAt(0);

        boolean ans = searchInString(str,target);
        System.out.println(ans);



        /*String name = "sibivarshaan";

        System.out.println(Arrays.toString(name.toCharArray()));


         */
    }
    //using for-each loop
    static boolean searchInString2(String str,char target){
        if(str.length()==0){
            return false;
        }
        //iterate with loop if there is a word available in the string
        for(char ch: str.toCharArray()){
            if(ch == target){
                return true;
            }

        }
        return false;
    }

    //using for loop
    static boolean searchInString(String str,char target){
        if(str.length()==0){
            return false;
        }
        //iterate with loop if there is a word available in the string
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;

            }

        }
        return false;
    }
}
