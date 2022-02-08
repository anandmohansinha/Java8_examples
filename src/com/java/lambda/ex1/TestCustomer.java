package com.java.lambda.ex1;

public class TestCustomer {

    public static void main(String[] args) {
       CustomerI cus = (xyz, abc) -> "Customer email is "+xyz+" and Salary is "+abc;
       String str = cus.custInfo("test@gmail.com", 9000);
        System.out.println(str);
    }

}
