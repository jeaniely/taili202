package com.neuedu.objectexample.five;

public class Factory2 implements  AbstractFactory {
    @Override
    public ProductA createA() {
        return new ProductA2();
    }

    @Override
    public ProductB createB() {
        return new ProductB2();
    }
}
