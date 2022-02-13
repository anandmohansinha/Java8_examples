package com.java.stream.collector;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestCollector {

    static List<Person> list = PersonUtil.getPersons();
    public static void main(String[] args) {
        //1. get all person who is older than 40
       //  list.stream().filter(person -> person.getAge()>40).forEach(System.out::println);
       /* Map<Integer, List<Person>> result = groupPersonByAge();
        result.forEach((x, y)->{
            System.out.println(y);

        });*/
       // System.out.println(getPersonAverageAge());
        Map<String, Integer> personMap = convertToMap();
        personMap.forEach((x, y) -> System.out.println("Key: "+x + " :::::: "+"value: "+y));

    }

    public static Map<Integer, List<Person>> groupPersonByAge(){
        Map<Integer, List<Person>> groupByAge = list.stream().collect(Collectors.groupingBy(person -> person.getAge()));
        return groupByAge;
    }

    public static Double getPersonAverageAge(){
       Double avg = list.stream().collect(Collectors.averagingInt(person ->person.getAge()));
        return avg;
    }

    public static Map<String, Integer> convertToMap(){
        return list.stream().collect(Collectors.toMap(person -> person.getName(),person -> person.getSalary()));

    }
}
