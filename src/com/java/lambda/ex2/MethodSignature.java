package com.java.lambda.ex2;

public class MethodSignature {

    //1.conditional(Prediction)
    public boolean isCold(String val){
        if("True".equalsIgnoreCase(val)){
            return true;
        } else {
            return false;
        }
    }
    // 2. function
    public Customer getCustomerInfo(String name, int id){
        Customer cust = new Customer(id, name);
        return cust;
    }

    //3.consumer
    public void updateCustomer(String name){
        //kldfjldsjflkjsd
    }


}