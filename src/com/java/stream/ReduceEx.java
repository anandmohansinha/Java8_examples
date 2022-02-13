package com.java.stream;

import com.java.stream.demo.Employee;
import com.java.stream.demo.EmployeeUtil;

import java.util.List;

public class ReduceEx {

    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeUtil.getEmployees();

       int totalSalary =  employeeList.stream().map(Employee::getSalary).reduce(0,(a, b) ->{
           System.out.println("a: "+a+" b: "+b);
            return a+b;
        });

        System.out.println("total salary: "+ totalSalary);

    }
}
