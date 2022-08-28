package com.abcdeveloper.rest;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8FibonacciExample {

    public static void main(String[] args) {
        System.out.println(printFibonacci(8));
        System.out.println(printFibonacciString(8));
        System.out.println(printFibonacci(5));
        System.out.println(printFibonacciString(5));
    }

    private static List<Integer> printFibonacci(int i) {
        return  Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(i)
                .map(t -> t[0]).collect(Collectors.toList());
    }
    private static String printFibonacciString(int i) {
        return  Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(i)
                .map(t -> t[0]).map(String :: valueOf).collect(Collectors.joining(", "));
    }
}