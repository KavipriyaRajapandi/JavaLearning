package com.JavaCollege.String;

import java.util.HashMap;

public class CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {
        String a = "thequickbrownfoxjumpsoverthelazydog";
        //char ch = sc.next().charAt(0);

        System.out.println(checkIfPangram(a));
        //System.out.println(hashbooleanPangram(a));
    }
    static boolean checkIfPangram(String sentence){

        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < sentence.length(); i++) {
            map.put(sentence.charAt(i),1);
        }
        if(map.size()==26) {
            return true;
        }
        return false;
    }

    static boolean hashbooleanPangram(String a){
        int n = a.length();
        int count = 0;
        boolean[] hash = new boolean[26];
        for (int i = 0; i < n; i++) {
            char ch = a.charAt(i);
            if(!hash[ch - 'a']){
                count++;
            }
            hash[ch - 'a']=true;

        }
        return count == 26;
    }


}
