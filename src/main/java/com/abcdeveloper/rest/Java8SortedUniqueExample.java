package com.abcdeveloper.rest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8SortedUniqueExample {
    public static void main(String[] args) {
        Integer[] arr = {10,23,11,12,11,10,23,10};
        List<Integer> list = Arrays.asList(arr);
        List<Integer> uniqueData = list.stream().sorted(Comparator.naturalOrder()).distinct().collect(Collectors.toList());
        System.out.println(uniqueData);
    }
}
