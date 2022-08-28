package com.abcdeveloper.rest;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8ArrayExample {
    public static void main(String[] args) {
//        Integer[] array1 = {3,9,6,9,4};
//        Integer[] array2 = {3,8,7,8,5};
//        List<List<Integer>> list = new ArrayList<>();
//        list.add(Arrays.asList(array1));
//        list.add(Arrays.asList(array2));
//        System.out.println(list);
//        Set<Integer> integerStream = list.stream().parallel().flatMap(List :: stream).collect(Collectors.toSet());
//        System.out.println(integerStream);
//        Integer maxValue = integerStream.stream().max(Comparator.comparingInt(Integer::intValue)).get();
//        System.out.println(maxValue);
//        Integer secondMaxValue = integerStream.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
//        System.out.println(secondMaxValue);
        List<Integer> numbers = Arrays.asList(1,11,3,11,24,66,24,66);
        int secondLargestNumber = numbers.stream().distinct()
                .sorted(Comparator.reverseOrder()).skip(1)
                .findFirst()
                .get();
        System.out.println(secondLargestNumber);

        Map<Integer, Long> collect = numbers.stream().filter(i -> Collections.frequency(numbers, i) > 1)
                                            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);
    }

}
