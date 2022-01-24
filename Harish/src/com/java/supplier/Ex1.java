package com.java.supplier;

import java.util.List;
import java.util.function.Supplier;

public class Ex1 {
    public static void main(String[] args) {
       Supplier<List<Trade>> supplier = () ->TradeUtil.createTrades();
        List<Trade> li = supplier.get();
        for (Trade trade: li){
            System.out.println(trade.toString());
        }
    }
}
