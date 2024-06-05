package com.valentyn.creational.abstract_factory;

import com.valentyn.creational.abstract_factory.app.Application;
import com.valentyn.creational.abstract_factory.factories.GUIFactory;
import com.valentyn.creational.abstract_factory.factories.MacOSFactory;
import com.valentyn.creational.abstract_factory.factories.WindowsFactory;

class Demo {

    /**
     * Приложение выбирает тип и создаёт конкретные фабрики динамически исходя
     * из конфигурации.
     */
    private static Application configureApplication(String gui) {
        GUIFactory factory;

        if (gui.equals("Windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacOSFactory();
        }

        return new Application(factory);
    }

    public static void main(String[] args) {
        String gui = "Windows";
        Application application = configureApplication(gui);
        application.paint();
    }
}
