package com.abcdeveloper.rest;

import lombok.Data;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class UnstructuredStringInArrayExample {

    public static void main(String[] args) {
        String [] arr = {"1-ENGLISH:20","2-MATH:30","3-HINDI:50","4-PHYSICS:70","5-ENGLISH:35"};
        List<Student> listData = new ArrayList<>();

        for(String str : arr){
            Student s = new Student();
            s.setRollNum(str.substring(0, str.indexOf('-')));
            s.setSubject(str.substring(str.indexOf('-')+1, str.indexOf(':')));
            s.setNumber(Integer.parseInt(str.substring(str.indexOf(':')+1)));
            listData.add(s);
        }

        Map<String, Double> collect = listData.stream().collect(Collectors.groupingBy(Student::getSubject, Collectors.averagingInt(Student::getNumber)));
        System.out.println(collect);

        Map<String, Optional<Student>> collect1 =
                listData.stream().collect(Collectors.groupingBy(Student::getSubject,
                        Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Student::getNumber)))));
        collect1.entrySet().forEach(entry -> System.out.println(entry.getKey() +" : "+ entry.getValue().get().getNumber()));
    }

    @Data
    static class Student {

        private String rollNum;
        private String subject;
        private Integer number;
    }
}
