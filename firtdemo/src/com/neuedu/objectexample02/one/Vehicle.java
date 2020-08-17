package com.neuedu.objectexample02.one;

public class Vehicle {
    private String brand;
    private String color;
    private double speed;

    public Vehicle(String brand,String color){
        this.brand=brand;
        this.color=color;
    }

    public String getBrand() {
        return brand;
    }

  /*  public void setBrand(String brand) {
        this.brand = brand;
    }*/

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void run(){
        System.out.println("品牌是："+brand+",颜色是："+color+"速度是："+speed);
    }


}
