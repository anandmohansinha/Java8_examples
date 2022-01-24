package com.java.supplier.factoryPattern;

public class ComputerFactory {

    public static Computer getDevice(String device){
       Computer computer = null;
        if("Laptop".equalsIgnoreCase(device)){
            computer = new Laptop();
        } else if("Desktop".equalsIgnoreCase(device)){
            computer = new Desktop();
        }
        return computer;
    }
}
