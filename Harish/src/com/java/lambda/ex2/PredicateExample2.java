package com.java.lambda.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample2 {

    // task is find apple whoes weight is more than 100 gm
    static List<Apple> inventory = Arrays.asList(new Apple(80,"green"),
            new Apple(155, "green"),
            new Apple(120, "red"));
    public static boolean isGreenApple(Apple apple){
        return "green".equals(apple.getColor());
    }
    public static  boolean isHeavyApple(Apple apple){
        return apple.getWeight()>150;
    }

    public static void main(String[] args) {
       // inventory.stream().filter(x -> x.getWeight()>100).forEach(x -> System.out.println(x.getColor()));
        List<Apple> greenApple = filterApples(inventory, PredicateExample2::isHeavyApple);

    }


    public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p)
    {
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory){
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }

}


class Apple {
    private String color;
    private int weight;

    public Apple( int weight, String color ) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}