package com.valentyn.creational.abstract_factory.buttons;

public class MacOSButton implements Button{
    @Override
    public void paint() {
        System.out.println("MacOSButton");
    }
}
