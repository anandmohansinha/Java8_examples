package com.java.supplier.factoryPattern;

public class Laptop extends Computer{
    @Override
    public String getRAM() {
        return "Laptop RAM";
    }

    @Override
    public String getHDD() {
        return "Laptop HDD";
    }

    @Override
    public String getCPU() {
        return "Laptop CPU";
    }
}
