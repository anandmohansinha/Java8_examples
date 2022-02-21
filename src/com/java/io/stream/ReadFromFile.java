package com.java.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// problem: slow , we cannot use this for large amount of data
public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\java_support\\Harish\\src\\com\\java\\io\\stream\\test.txt");
     int data;
     while( (data = fis.read())!=-1){
         System.out.print((char) data);
     }
    }
}
