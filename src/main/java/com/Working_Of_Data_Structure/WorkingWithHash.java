package com.Working_Of_Data_Structure;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WorkingWithHash {

    public static void main(String[] args){

        Map<Person,Diamond> map = new HashMap<>();

        map.put(new Person("Jack"),new Diamond("Indian"));

        System.out.println(new Person("Jack").hashCode());
        System.out.println(new Person("Jack").hashCode());
        System.out.println(map.get(new Person("Jack")));

    }
    static class Person{
        String name;
        public Person(String name){
            this.name=name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
    record Diamond(String name){}
}
