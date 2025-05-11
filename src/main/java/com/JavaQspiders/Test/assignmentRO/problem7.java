package com.JavaQspiders.Test.assignmentRO;

public class problem7 {
    public static void main(String[] args) {
        int p = 30, q = 20, r = 25;
        boolean res1 = (p > q) && (r < q);
        boolean res2 = (p >= r) && (q <= p);
        boolean res3 = !(q > r);
        System.out.println(res1 + " "+ res2 + " " + res3);
    }
}
