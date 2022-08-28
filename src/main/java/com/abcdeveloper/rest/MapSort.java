package com.abcdeveloper.rest;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapSort {

    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("K", 12);
        map.put("A", 11);
        map.put("a", 34);
        map.put("Z", 01);

        for(Map.Entry e : map.entrySet()){
            System.out.println("map with key "+ e.getKey() + " and value "+ e.getValue());
        }
    }
}
