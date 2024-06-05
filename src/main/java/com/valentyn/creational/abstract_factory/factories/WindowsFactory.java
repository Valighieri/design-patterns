package com.valentyn.creational.abstract_factory.factories;

import com.valentyn.creational.abstract_factory.buttons.Button;
import com.valentyn.creational.abstract_factory.buttons.WindowsButton;
import com.valentyn.creational.abstract_factory.checkboxes.Checkbox;
import com.valentyn.creational.abstract_factory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
