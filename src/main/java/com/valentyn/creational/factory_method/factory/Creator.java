package com.valentyn.creational.factory_method.factory;

import com.valentyn.creational.factory_method.product.Product;

/**
 * Базовый класс фабрики. "Фабрика" – это всего лишь
 * дополнительная роль для класса. Он уже имеет какую-то бизнес-логику, в
 * которой требуется создание разнообразных продуктов.
 */
public abstract class Creator {
    public void someOperation(){
        Product product = createProduct();
        product.doStuff();
    };

    /**
     * Подклассы будут переопределять этот метод, чтобы создавать конкретные
     * объекты продуктов, разные для каждой фабрики.
     */
    public abstract Product createProduct();
}
