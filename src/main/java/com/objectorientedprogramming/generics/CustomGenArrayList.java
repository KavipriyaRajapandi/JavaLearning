package com.objectorientedprogramming.generics;

import java.util.Arrays;


public class CustomGenArrayList<T> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;

    private int size = 0;

    public CustomGenArrayList(){
        data = new Object[DEFAULT_SIZE]; // method to add data in an array
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    public void resize() {
        Object[] temp = new Object[data.length * 2];

        for (int i = 0; i < data.length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove(){
         T removed = (T)(data[--size]);
         return removed;
    }

    public T get(int index){

        return (T)data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index,T value){

        data[index]  = value;



    }

    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args){


        CustomGenArrayList<Integer> lst2 = new CustomGenArrayList<>();

            for(int i = 0; i< 15;i++){

                lst2.add(2 * i);



            }

        System.out.println(lst2);







    }

}
