package com.AllJavaConceptsImportantPractice.Part4.Searching.LinearSearch;

public class Working {
    public static void main(String[] args) {
        int [] a = {16,22,54,76,43,56,1,34,99};
        int key = 34;
        if (linearSearch(a, key)) {
            System.out.println("Key Found");
        }
        else{
            System.out.println("Key Not Found");
        }
    }
    public static boolean linearSearch(int[]a ,int key){
        for(int i=0;i<a.length;i++){
            if(a[i] == key){
                return true;
            }
        }
        return false;
    }
}
