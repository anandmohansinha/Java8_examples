package com.java.supplier.factoryPattern;

public abstract class Computer {
    public abstract String getRAM(); // empty
    public abstract String getHDD(); // empty
    public abstract String getCPU(); // empty

    //concret method
    public String getComputerInfo(){
        return "computer has RAM, HDD, CPU";
    }
}
