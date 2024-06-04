package com.valentyn.creational.factory_method;

import com.valentyn.creational.factory_method.factory.ConcreteCreatorA;
import com.valentyn.creational.factory_method.factory.ConcreteCreatorB;
import com.valentyn.creational.factory_method.factory.Creator;
import com.valentyn.creational.factory_method.product.Product;

class Demo {

    private static Creator creator;
    public static void main(String[] args) {
        configure("B");
        runBusinessLogic();
    }

    static void configure(String s) {
        if (s.equals("A")) {
            creator = new ConcreteCreatorA();
        } else {
            creator = new ConcreteCreatorB();
        }
    }

    /**
     * Весь остальной клиентский код работает с фабрикой и продуктами только
     * через общий интерфейс, поэтому для него неважно какая фабрика была
     * создана.
     */
    static void runBusinessLogic() {
        creator.someOperation();
    }
}
