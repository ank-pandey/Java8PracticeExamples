package com.abcdeveloper.rest;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringTest {
    public static void main(String[] args) {

        String s = "God is one ,deo";
        String[] str = s.split(",");
        String str0 = str[0];
        StringBuilder sbf = new StringBuilder(str0);
        String str1 = str[1];
        System.out.println(str0);
        System.out.println(str1);
        char c12 = str1.charAt(0);
        for(char c : str1.toCharArray()) {
            if (str0.indexOf(c) != -1) {
                System.out.println("char:: " + c + " is present in string:: " + str0 +" at index:: "+ str0.indexOf(c));
                System.out.println("before delete:: "+sbf);
                sbf = sbf.deleteCharAt(str0.indexOf(c));
                System.out.println("After delete:: "+sbf);
            }
        }

        char[] chars = s.toCharArray();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char c : chars) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
            else map.put(c, 1);
        }
        for(Map.Entry e : map.entrySet()){
            System.out.println(e.getKey() + "    " + e.getValue());
            if(e.getValue().equals(1)) {
                System.out.println("first non repeating character from String "+ s +" is " + e.getKey());
                break;
            }
        }
    }
}


