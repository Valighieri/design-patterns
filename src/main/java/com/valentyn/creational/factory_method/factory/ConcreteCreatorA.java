package com.valentyn.creational.factory_method.factory;

import com.valentyn.creational.factory_method.product.ConcreteProductA;
import com.valentyn.creational.factory_method.product.Product;

public class ConcreteCreatorA extends Creator{
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
