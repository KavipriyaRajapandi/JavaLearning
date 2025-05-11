package com.objectorientedprogramming.generics.objectsComparision;

public class ComparisionObjects implements Comparable<ComparisionObjects>{

    int rollno;
    float marks;

    public ComparisionObjects(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks + "" ;
    }

    @Override
    public int compareTo(ComparisionObjects o) {
         int diff = (int)(this.marks - o.marks);
         return diff;
    }


}
