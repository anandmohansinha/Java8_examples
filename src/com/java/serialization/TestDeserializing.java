package com.java.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestDeserializing {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("employee.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

       Employee emp = (Employee) ois.readObject();
        System.out.println(emp.getId());
        System.out.println(emp.getName()); // transient
        System.out.println(emp.getSalary());
        ois.close();
        fis.close();

    }
}
