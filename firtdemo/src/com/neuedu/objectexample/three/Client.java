package com.neuedu.objectexample.three;

public class Client {
    public static void main(String[] args) {
        Product product=SimpleFactory.creat("C");
        if(product!=null) {
            product.operaton01();
            product.operation02();
        }else {
            System.out.println("只有A、B两种产品");
        }
    }
}
