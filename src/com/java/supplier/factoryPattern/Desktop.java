package com.java.supplier.factoryPattern;

public class Desktop extends Computer{
    @Override
    public String getRAM() {
        return "Desktop RAM";
    }

    @Override
    public String getHDD() {
        return "Desktop HDD";
    }

    @Override
    public String getCPU() {
        return "Desktop CPU";
    }
}
