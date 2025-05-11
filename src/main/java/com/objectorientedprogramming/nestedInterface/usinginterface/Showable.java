package com.objectorientedprogramming.nestedInterface.usinginterface;

public interface Showable {

    void show();
        interface Message{

        void message();


    }
}


class NestedInterface implements Showable.Message{


    @Override
    public void message() {
        System.out.println("Hello nested interface");

    }

    public static void main(String[] args) {

        Showable.Message obj = new NestedInterface();

        obj.message();
    }
}
