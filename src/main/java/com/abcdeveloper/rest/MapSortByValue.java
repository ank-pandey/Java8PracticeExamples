package com.abcdeveloper.rest;

import java.util.*;
import java.util.stream.Collectors;

public class MapSortByValue {
    static ArrayList<Map.Entry<String, Integer>> arr = new ArrayList<>();
    static LinkedHashMap<String, Integer> linkedMap = new LinkedHashMap<>();
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("K", 12);
        map.put("A", 11);
        map.put("a", 34);
        map.put("Z", 01);
        for(Map.Entry e: map.entrySet()){
            arr.add(e);
        }
        //arr.stream().forEach(System.out::println);
        List<Map.Entry<String, Integer>> collect = arr.stream()
                .sorted(Comparator.comparing(Map.Entry::getValue, (e1, e2) -> e1.compareTo(e2)))
                .collect(Collectors.toList());

        for(Map.Entry<String, Integer> e: collect){
            linkedMap.put(e.getKey(), e.getValue());
        }

        for(Map.Entry e : linkedMap.entrySet()){
            System.out.println("map with key "+ e.getKey() + " and value "+ e.getValue());
        }
    }
}
