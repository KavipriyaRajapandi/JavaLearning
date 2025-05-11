package com.JavaQspiders.MultiDimensionalArraysConcepts.Programs;

/*
So I won't claim to be an expert on the topic, but I know enough that I should be able to answer your question.

First, Arrays.toString() iterates through all the elements in the array and simply calls the toString() function for each element individually. When you do this with things like primitives or objects with well defined toString() functions, you get reasonable results.

Somewhat unfortunately, all arrays have default to the useless implementation of toString(). Instead of overriding the toString() function like pretty much every other object in the language, they leave you with quite a mystery. When toString() is called on an array of primitives, you get a pattern like so:

1.) "[" to indicate that everything after this is apart of an array

2.) getClass.getName() -> A string that should properly identify what the object is. For primitives, this is usually just a capital letter that starts the object name (i.e 'I' for int or 'C' for char). For Class types, it typically gives the path to the Class file in the java library (i.e. java.lang.String for String)

3.) "@" for no real reason other than to separate part 2 from part 4

4.) The hexadecimal representation of the objects hashCode.

So yeah, there is a lot of nuance to the "getClass.getName()" part which I skip over because either it doesn't pertain to the question you asked or I don't know my self. In any event, I hope I helped in some way.
 */

import java.util.Arrays;

public class AdditionOf2Matrix {
    public static void main(String[] args) {
        int[][] a = {
                {4,7,8,4},
                {3,2,7,9},
                {1,8,9,5}
        };
        int[][] b = {
                {3,2,6,9},
                {9,4,3,1},
                {1,5,6,2}
        };

        int[][] res = new int[a.length][];

        for (int i = 0; i < res.length; i++) {
            res[i] = new int[a[i].length];
        }

        for(int i = 0;i<res.length;i++){
            for (int j = 0; j < res[i].length; j++) {
                res[i][j] = a[i][j] + b[i][j];
                System.out.print(res[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
