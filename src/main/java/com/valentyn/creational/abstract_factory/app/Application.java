package com.valentyn.creational.abstract_factory.app;

import com.valentyn.creational.abstract_factory.buttons.Button;
import com.valentyn.creational.abstract_factory.checkboxes.Checkbox;
import com.valentyn.creational.abstract_factory.factories.GUIFactory;

/**
 * Код, использующий фабрику, не волнует с какой конкретно фабрикой он работает.
 * Все получатели продуктов работают с продуктами через абстрактный интерфейс.
 */
public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
