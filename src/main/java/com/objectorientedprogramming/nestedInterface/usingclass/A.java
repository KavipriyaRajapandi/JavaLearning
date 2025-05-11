package com.objectorientedprogramming.nestedInterface.usingclass;

public interface A {

    public interface CheckOdd{
        boolean isOdd(int num);

    }
}

class B implements A.CheckOdd{

    @Override
    public boolean isOdd(int num) {
        return (num & 1)==1;
    }
}
