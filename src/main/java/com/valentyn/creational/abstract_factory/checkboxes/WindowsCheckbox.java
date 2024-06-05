package com.valentyn.creational.abstract_factory.checkboxes;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("WindowsCheckbox");
    }
}
