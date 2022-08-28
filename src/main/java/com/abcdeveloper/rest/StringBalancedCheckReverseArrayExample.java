package com.abcdeveloper.rest;

import java.util.Arrays;
import java.util.Collections;

public class StringBalancedCheckReverseArrayExample {

    public static void main(String[] args) {
        String s = "{()}";
        System.out.println(balancedCheck(s));
        Integer[] intArray = {1,2,3,4,5};
        System.out.println(Arrays.asList(reverseArray(intArray)));
    }

    static Integer[] reverseArray(Integer a[]){
       Collections.reverse(Arrays.asList(a));
        return a;
    }
    static boolean balancedCheck(String s){
        while(s.contains("()") || s.contains("{}") || s.contains("[]")){
            s = s.replaceAll("\\(\\)", "")
                    .replaceAll("\\{\\}", "")
                    .replaceAll("\\[\\]", "");
        }
        return (s.length()==0);
    }
}
