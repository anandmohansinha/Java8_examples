package com.java.stream.collector;

import java.util.ArrayList;
import java.util.List;

public class PersonUtil {

    static List<Person> personList = new ArrayList<>();

    public static List<Person> getPersons(){
        Person p1 = new Person(1, "test1", 20, 30);
        Person p2 = new Person(2, "test2", 30, 40);
        Person p3 = new Person(3, "test3", 40, 50);
        Person p4 = new Person(4, "test4", 50, 50);
        Person p5 = new Person(5, "test5", 60, 70);
        Person p6 = new Person(6, "test6", 70, 70);

        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);
        personList.add(p6);
        return personList;




    }
}
