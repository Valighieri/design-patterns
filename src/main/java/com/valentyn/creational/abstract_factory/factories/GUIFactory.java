package com.valentyn.creational.abstract_factory.factories;

import com.valentyn.creational.abstract_factory.buttons.Button;
import com.valentyn.creational.abstract_factory.checkboxes.Checkbox;

/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 * А каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
