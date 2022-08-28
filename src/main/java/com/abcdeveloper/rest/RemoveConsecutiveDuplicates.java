package com.abcdeveloper.rest;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveConsecutiveDuplicates {

    public static void main(String[] args) {
        //System.out.println(removeDuplicates("abbaca"));
        //System.out.println(removeDuplicatesBasedOnCountWithJava8("deeedbbcccbdaa", 3));
        //System.out.println(removeDuplicatesBasedOnCountWithJava8("acaaabbbacdddd", 3));
       // System.out.println(removeDuplicatesBasedOnCount("acaaabbbacdddd", 3));
       // System.out.println(removeDuplicatesBasedOnCount("deeedbbcccbdaa", 3));
        System.out.println(removeDuplicatesBasedOnCountWithString("acaaabbbacdddd", 3));
        System.out.println(removeDuplicatesBasedOnCountWithString("deeedbbcccbdaa", 3));
    }

    private static String removeDuplicates(String s) {
        int n = s.length();
        int i = 0;
        Stack<Character> st = new Stack<>();
        while(i<n){
            if(st.empty() || st.peek() != s.charAt(i)){
                st.push(s.charAt(i));
                System.out.println("Stack data after push is "+ st);
            }
            else{
                st.pop();
                System.out.println("Stack data after pop is "+ st);
            }
            i++;
            System.out.println("Stack data is "+ st);
        }
        String ans = "";
        while(!st.empty()){
            Character ele = st.peek();
            st.pop();
            ans += ele;
        }
        System.out.println("remained String is "+ ans);
        return new StringBuilder(ans).reverse().toString();
    }

    private static String removeDuplicatesBasedOnCountWithJava8(String s, int k){
        String result = "";
        Map<String, Long> map = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        ConcurrentMap<String, Long> conMap = new ConcurrentHashMap<>(map);
        for(Map.Entry entry : conMap.entrySet()){
            if(Integer.parseInt(entry.getValue().toString()) == k){
                conMap.remove(entry.getKey());
            }else{
                int i = Integer.parseInt(entry.getValue().toString());
                if(i > k){
                    i -= k;
                }
                while(i > 0){
                    result += entry.getKey();
                    i--;
                }
            }
        }
        return result;
    }

    private static String removeDuplicatesBasedOnCount(String s, int k){
        int n = s.length();
        if(n<k) return s;
        Stack<int[]> st = new Stack<>();
        for(char c: s.toCharArray()){
            if(!st.empty() && st.peek()[0] == c){
                st.peek()[1]++;
            }else{
                st.push(new int[]{c, 1});
            }
            if(st.peek()[1]==k){
                st.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.empty()){
            int[] top = st.pop();
            while(top[1] --> 0)
                sb.append((char) top[0]);
        }
        return sb.reverse().toString();
    }

    // "acaaabbbacdddd"

    private static String removeDuplicatesBasedOnCountWithString(String s, int k){
        int count = 1;
        for(int i = 1; i < s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }else{
                count=1;
            }
            if(count==k){
                String reduced = s.substring(0, i-k+1) + s.substring(i+1);
                return removeDuplicatesBasedOnCountWithString(reduced, k);
            }
        }
        return s;
    }
}