package com.abcdeveloper.rest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class IntArrayExample {

    public static void main(String[] args) throws JsonProcessingException {
        String str = "1112222555557777778888888";
        countByMap(str);
        Map<String, Long> map = Arrays.stream(str.split("")).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(map);
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map));

        String str1 ="AnkitNarsimhah AnkitNarsimhah AnkitNarsimhah";
        Map<String, Long> map1 = Arrays.stream(str1.split(" ")).collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(map1);

        Integer[] arr ={4,6,1,3,2};
        Integer n =4;

        if(arr.length > 1 && n <= arr.length)
        {
            Integer num = Arrays.stream(arr).sorted(Comparator.naturalOrder()).skip(n-1).findFirst().get();
            System.out.println(num);
        }else{
            System.out.println( arr[0]);
        }
    }

    private static void countByMap(String str) {
        Map<Character, Integer> countMap = new HashMap<>();
        for(int i = 0; i< str.length() ; i++){
            if(countMap.containsKey(str.charAt(i))){
                int count = countMap.get(str.charAt(i));
                countMap.put(str.charAt(i), ++ count);
            }else{
                countMap.put(str.charAt(i), 1);
            }
        }
        System.out.println(countMap);
    }
}
