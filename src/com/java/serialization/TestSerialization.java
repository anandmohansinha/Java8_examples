package com.java.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerialization {

    public static void main(String[] args) throws IOException {

        Employee emp = new Employee(1, "anand", 8000);


        FileOutputStream fos = new FileOutputStream("employee.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(emp);
        oos.close();
        fos.close();

    }
}
