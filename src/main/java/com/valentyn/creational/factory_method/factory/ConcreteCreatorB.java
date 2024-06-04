package com.valentyn.creational.factory_method.factory;

import com.valentyn.creational.factory_method.product.ConcreteProductB;
import com.valentyn.creational.factory_method.product.Product;

public class ConcreteCreatorB extends Creator{
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
