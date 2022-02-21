package com.java.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("E:\\java_support\\Harish\\src\\com\\java\\io\\stream\\test.txt");


        fos.write("Welcome to Java course".getBytes());
    }
}
