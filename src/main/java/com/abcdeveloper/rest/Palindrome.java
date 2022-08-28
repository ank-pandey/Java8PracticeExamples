package com.abcdeveloper.rest;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("radar"));
    }

    static boolean checkPalindrome(String s){
//        String reverse = "";
//        for(int i = s.length() -1 ; i >= 0; i--){
//            reverse = reverse + s.charAt(i);
//        }
        String reverse = new StringBuilder(s).reverse().toString();
        return reverse.equals(s);
    }
}
