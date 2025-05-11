package com.JavaQspiders.ObjectOrientedProgramming.Constructor.ArrayAccessConstructor;

public class GenBookObj {
    public static void main(String[] args) {
        Program[] books = { (new Program("Tabrez",10000)),
                            (new Program("Shekar",2000)),
                            (new Program("Nagaraj",5000))};

        for(int i=0;i<books.length;i++){
            System.out.println(books[i]);
            System.out.println(books[i].bookId);
        }
    }
}
