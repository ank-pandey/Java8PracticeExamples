package com.abcdeveloper.rest;

class X {
    X(){
        System.out.println("X constructor called");
    }
    public void methodA()
    {
        System.out.println ("hello, I'm methodA of class X");
    }
}

class Y extends X
{
    Y(){
        System.out.println("Y constructor called");
    }

    public void methodA()
    {
        System.out.println ("hello, I'm methodA of class Y");
    }
}

public class Z
{
    public static void main (String args []) {
        X obj1 = new X();
        X obj2 = new Y();
        obj1.methodA();
        obj2.methodA();
    }
}
