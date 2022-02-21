package com.java.io.stream.bufferStream;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
//Problem: always we need to convert byte to character
public class ReadFileUsingBuffer {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\java_support\\Harish\\src\\com\\java\\io\\stream\\test.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        int data;

        while((data = bis.read())!=-1){
            System.out.print((char) data);
        }
        fis.close();
        bis.close();

    }
}
