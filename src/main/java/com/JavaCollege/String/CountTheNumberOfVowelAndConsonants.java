package com.JavaCollege.String;

public class CountTheNumberOfVowelAndConsonants {
    public static void main(String[] args) {
        int vCount = 0, cCount = 0;
        String str = "This is Sibi Varshaan";
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vCount++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                // ('a' <= str.charAt(i) <= 'z');
                cCount++;
            }
        }
        System.out.println("Vowels values are "+vCount);
        System.out.println("Consonants values are "+cCount);

    }
}
