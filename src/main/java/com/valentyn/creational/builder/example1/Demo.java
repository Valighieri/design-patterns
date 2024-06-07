package com.valentyn.creational.builder.example1;

public class Demo {
    public static void main(String[] args) {
        Dog dog = new Dog.Builder("Marly", "Spaniel", 12)
                .withWeight(19.5)
                .withColor("black")
                .withCountry("Ukraine")
                .build();
        Dog dog2 = new Dog.Builder("Buddy", "Labrador", 3).build();

        System.out.println(dog);
        System.out.println(dog2);
    }
}
