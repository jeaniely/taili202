package com.neuedu.objectexample02.one;

public class Car extends Vehicle {

    private int loader;
    public Car(String brand, String color,int loader) {
        super(brand, color);
        this.loader=loader;
    }

    @Override
    public void run() {
        System.out.println("品牌是："+super.getBrand()+",颜色是："+super.getColor()+"速度是："+super.getSpeed()+"载人量："+loader);
    }
}
