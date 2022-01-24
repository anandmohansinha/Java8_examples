package com.java.supplier.FactoryWithSupplier;

import com.java.supplier.factoryPattern.Computer;
import com.java.supplier.factoryPattern.Desktop;
import com.java.supplier.factoryPattern.Laptop;

import java.util.function.Supplier;

public class TestSupplierFactory {

    static Supplier<Desktop> desktop = () -> new Desktop();
    static Supplier<Laptop> laptop = () -> new Laptop();

    // static
    public static void main(String[] args) {
        TestSupplierFactory obj = new TestSupplierFactory();
        obj.getDevice(desktop);
    }

    // non static
    public  Computer getDevice(Supplier<? extends Computer> supplier){
        Computer computer = supplier.get();
        System.out.println(computer.getRAM());
        System.out.println(computer.getHDD());
        return computer;
    }

}
