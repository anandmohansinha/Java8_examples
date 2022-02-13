package com.java.stream.demo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeUtil {

    public static List<Employee> getEmployees(){
        List<Employee> employeeList = new ArrayList<>();

        Employee emp1 = new Employee("test1", 1000);
        Employee emp2 = new Employee("test2", 2000);
        Employee emp3 = new Employee("test3", 3000);
        Employee emp4 = new Employee("test4", 4000);
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        return employeeList;

    }
}
