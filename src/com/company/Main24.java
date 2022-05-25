package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main24 {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(24);
        numbers.add(4);
        numbers.add(6);
        numbers.add(75);
        numbers.add(754);
        numbers.add(46);
        numbers.add(2);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers);

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Porsche");
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Lexus");
        cars.add("Toyota");
        cars.add("Mazda");
        Collections.sort(cars);
        System.out.println(cars);
    }
}
