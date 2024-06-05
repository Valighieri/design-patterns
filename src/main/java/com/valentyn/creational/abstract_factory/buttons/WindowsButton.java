package com.valentyn.creational.abstract_factory.buttons;

public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("WindowsButton");
    }
}
