package com.abcdeveloper.rest;

public class StringCheckPathHole {


    public static void main(String args []){
        String s = "aa";
        StringCheckPathHole sol = new StringCheckPathHole();
        System.out.println(sol.solution(s));
    }
    public boolean solution(String s){
        System.out.println(s.indexOf('b'));
        System.out.println(s.lastIndexOf('a'));
        if(s.indexOf('b') > s.lastIndexOf('a')){
            return true;
        }else{
            return false;
        }
    }

    public int solution1(String S) {
        int holes = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'X') {
                holes++;
                i += 2;
            }
        }
        return holes;
    }

}
