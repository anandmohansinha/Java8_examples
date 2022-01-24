package com.java.supplier.factoryPattern;

public class TestFactory {

    public static void main(String[] args) {
      //  ComputerFactory factory = new ComputerFactory(); non static
        Computer computer = ComputerFactory.getDevice("Desktop"); // static
        System.out.println(computer.getRAM());
    }
}
