package com.juaracoding;

import java.util.ArrayList;

public class JavaCollection {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("Mazda");
        cars.add("BMW");
        cars.add("Ford");
        System.out.println(cars);
        System.out.println(cars.get(3));
        cars.set(2,"Toyota");
        cars.add(2,"Mitsubhisi");
        System.out.println(cars);
        cars.remove(1);
        System.out.println(cars);

        //for i
        System.out.println(cars.size());
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        //for each
        System.out.println("=== for each ===");
        for(String car : cars){
            System.out.println(car.toUpperCase());
        }
    }

}
