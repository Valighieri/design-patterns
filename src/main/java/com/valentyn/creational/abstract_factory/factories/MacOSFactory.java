package com.valentyn.creational.abstract_factory.factories;

import com.valentyn.creational.abstract_factory.buttons.Button;
import com.valentyn.creational.abstract_factory.buttons.MacOSButton;
import com.valentyn.creational.abstract_factory.checkboxes.Checkbox;
import com.valentyn.creational.abstract_factory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
