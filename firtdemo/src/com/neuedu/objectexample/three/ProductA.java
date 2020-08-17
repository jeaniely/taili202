package com.neuedu.objectexample.three;

public class ProductA implements Product {
    @Override
    public void operaton01() {
        System.out.println("输入A产品材料");
    }

    @Override
    public void operation02() {
        System.out.println("输出A产品");
    }
}
