package com.abcdeveloper.rest;


import java.util.Arrays;

public class ExampleTest {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bac";
        String s3 = "aabc";
       System.out.println(isAnagram(s1, s2));
    }

    private static Boolean isAnagram(String s1, String s2) {
        Boolean b = false;
        char[] c1 = s1.toCharArray();
        Arrays.sort(c1);
        char[] c2 = s2.toCharArray();
        Arrays.sort(c2);
        if(c1.length==c2.length){
            if(Arrays.equals(c1, c2)){
                b= true;
            }else{
                b=false;
            }
        }
        else {
            b = false;
        }
        return b;
    }
}
