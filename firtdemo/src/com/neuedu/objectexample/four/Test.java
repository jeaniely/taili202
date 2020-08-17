package com.neuedu.objectexample.four;

public class Test {
    public static void main(String[] args) {
        FactoryMethod factoryMethod=new FactoryC();
        Product product=factoryMethod.create();
        product.operaton01();
        product.operation02();
    }
}
