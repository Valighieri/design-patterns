package com.valentyn.creational.builder.example1;

public class Dog {

    private final String name; //required
    private final String breed; //required
    private final int age; //required
    private final String country; //optional
    private final String color; //optional
    private final double weight; //optional

    private Dog(Builder builder) {
        this.name = builder.name;
        this.breed = builder.breed;
        this.age = builder.age;
        this.country = builder.country;
        this.color = builder.color;
        this.weight = builder.weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    // and getters

    public static class Builder{
        private final String name; //required
        private final String breed; //required
        private final int age; //required
        private String country; //optional
        private String color; //optional
        private double weight; //optional

        public Builder(String name, String breed, int age) {
            this.name = name;
            this.breed = breed;
            this.age = age;
        }

        public Builder withCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder withColor(String color) {
            this.color = color;
            return this;
        }

        public Builder withWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public Dog build() {
            return new Dog(this);
        }
    }
}
