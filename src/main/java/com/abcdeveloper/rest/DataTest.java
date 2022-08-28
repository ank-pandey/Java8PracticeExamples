package com.abcdeveloper.rest;

import java.util.*;
import java.util.stream.Collectors;

public class DataTest {
    public static void main(String[] args) {
//        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,64,98,32,15,72,10);
//        Set<Integer> collect = myList.stream().collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()))
//                .entrySet().stream().filter(m -> m.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toSet());
//        System.out.println(collect);
//
//        Set<Integer> collect1 = myList.stream().filter(l -> Collections.frequency(myList, l) > 1).collect(Collectors.toSet());
//        System.out.println(collect1);
//
//        Set<Integer> items = new HashSet<>();
//        Set<Integer> collect2 = myList.stream().filter(n -> !items.add(n)).collect(Collectors.toSet());
//        System.out.println(collect2);

        String s1="ABC";
        String s2="ABC";
        String s3= new String("ABC");
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s2.equals(s3));



    }
}
