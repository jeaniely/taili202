package com.neuedu.objectexample.four;

public class FactoryC implements FactoryMethod {
    @Override
    public Product create() {
        return new ProductC();
    }
}
