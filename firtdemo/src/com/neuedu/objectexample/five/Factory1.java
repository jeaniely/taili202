package com.neuedu.objectexample.five;

public class Factory1 implements AbstractFactory {
    @Override
    public ProductA createA() {
        return new ProductA1();
    }

    @Override
    public ProductB createB() {
        return new ProductB1();
    }
}
