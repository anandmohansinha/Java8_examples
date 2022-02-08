package com.java.lambda.ex2;

public class Customer {

   static String country = "India";
   private int id;
   private String name;

    public Customer(){}
    public Customer(int id) {
        this.id = id;
    }
    public Customer(String name) {
        this.name = name;
    }
    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String customerInfo(){
        return "Customer id "+id + " name "+name;
    }

    public String customerInfo2(String email, int salary){
        return "Customer email "+ email + "and salary "+salary;
    }
}
