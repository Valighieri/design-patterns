package com.valentyn.creational.singleton;

class Demo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("Singleton");
        Singleton singleton2 = Singleton.getInstance("Non-Singleton");

        System.out.println(singleton);
        System.out.println(singleton2);
    }
}
