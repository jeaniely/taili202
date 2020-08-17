package com.neuedu.objectexample.five;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory=new Factory3();
        ProductA productA=factory.createA();
        ProductB productB=factory.createB();
        productA.operation01();
        productA.operation02();

        productB.operation01();
        productB.operation02();
    }
}
