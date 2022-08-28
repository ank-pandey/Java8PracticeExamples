package com.abcdeveloper.rest;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapExample {

public static void main(String[] args) {

        List<Developer> list = new ArrayList<>();
        list.add(Developer.builder().name("mkyong")
                .bookName("Introduction to React and Redux")
                .book(Set.of("Java 8 in Action", "Spring Boot in Action", "Effective Java (3rd Edition)"))
                .build());
        list.add(Developer.builder().name("zilap")
                .book(Set.of("Learning Python (5th Edition)","Effective Java (3rd Edition)"))
                .build());

        // hmm....Set of Set...how to process?
//        Set<Set<String>> collect = list.stream()
//                .map(Developer::getBook)
//                .collect(Collectors.toSet());
//        System.out.println(collect);
//        collect.forEach(System.out::println);

        Set<String> uniqueBook =
                list.stream()
                        .map(Developer::getBook)                              //  Stream<Set<String>>
                        .flatMap(Collection::stream)                           //  Stream<String>
                        .filter(x -> !x.toLowerCase().contains("python"))   //  filter python book
                        .collect(Collectors.toSet());                       //  remove duplicated

        uniqueBook.forEach(System.out::println);

    }
}
