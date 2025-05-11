package com.Working_Of_Data_Structure;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueue {

    public static void main(String [] args){

        Queue<Person> queue = new LinkedList<>();


        queue.add(new Person("Alex",21));
        queue.add(new Person("Jake",19));
        queue.add(new Person("Tom",27));

        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(queue.peek());
    }

    static record Person(String name,int age){}
}
