package com.abcdeveloper.rest;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatmapDemo {

    public static void main(String[] args) {
        String[][] data = new String[][] {{"a,b"}, {"c", "d"}, {"e","f"}};
        final Stream<String[]> dataStream = Stream.of(data);
        final List<String> collect = dataStream
                                        .flatMap(val -> Stream.of(val))
                                        .collect(Collectors.toList());
        System.out.println(collect);
    }
}