package com.neuedu.objectexample.four;

public class FactoryB implements FactoryMethod {
    @Override
    public Product create() {
        return new ProductB();
    }
}
