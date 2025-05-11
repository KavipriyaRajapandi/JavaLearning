package com.Working_Of_Data_Structure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithLinkedList {

    public static void main(String[] args){

        LinkedList<Person> linkedList = new LinkedList<>();

        linkedList.add(new Person("Alex",22));
        linkedList.add(new Person("Ben",19));
        linkedList.add(new Person("Callux",24));
        linkedList.addFirst(new Person("Ali",18));
        linkedList.addLast(new Person("Zach",27));



        Iterator<Person> personListIterator = linkedList.iterator();

        while(personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }

        System.out.println();

        //previous() to work on linked list is not working and not printing if i know the problem i can resolve it..



    }


    private static void queues(){
        Queue<WorkingWithQueue.Person> queue = new LinkedList<>();


        queue.add(new WorkingWithQueue.Person("Alex",21));
        queue.add(new WorkingWithQueue.Person("Jake",19));
        queue.add(new WorkingWithQueue.Person("Tom",27));

        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(queue.peek());
    }
    static record Person(String name,int age){}
}
