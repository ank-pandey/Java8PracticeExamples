package com.abcdeveloper.rest;

import java.util.HashSet;

class Student {
    private String name;
    public Student(String name){
        this.name = name;
    }
}
public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Rajat");
        Student s2 = new Student("Rajat");
        HashSet<Student> hs = new HashSet();
        hs.add(s1);
        hs.add(s2);
        System.out.println("size = " + hs.size());
        //double num = input.nextDouble();
        double sum = 0;
        for(double i = 0; i< 10; i++){
            if(i %2 == 0)
                sum += -1/(2*i-1);
            else
                sum += 1/(2*i-1);
        }
        System.out.println(sum);
    }
}