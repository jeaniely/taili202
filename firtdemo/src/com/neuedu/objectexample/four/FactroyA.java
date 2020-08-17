package com.neuedu.objectexample.four;

public class FactroyA implements FactoryMethod {
    @Override
    public Product create() {
        return new ProductA();
    }
}
