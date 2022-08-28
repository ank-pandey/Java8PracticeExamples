package com.abcdeveloper.rest;
interface I1{
    void m1();
}
class Hai implements I1{

    @Override
    public void m1() {
        System.out.println("m1");
    }
}
public class OnlineTest {
    public static void main(String[] args) {
        Hai h = new Hai();
        h.m1();
    }

}
