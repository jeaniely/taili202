package com.neuedu.object.example;

public class Goods {
    /*
    * 共有属性：
    *    商品名
    *    单价
    *    斤数/袋
    *    库存
    *
    *
    * */

    private String name;
    private double price;
    private String  arithmeticalUnit;
    private int stock;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getArithmeticalUnit() {
        return arithmeticalUnit;
    }

    public void setArithmeticalUnit(String arithmeticalUnit) {
        this.arithmeticalUnit = arithmeticalUnit;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", arithmeticalUnit='" + arithmeticalUnit + '\'' +
                ", stock=" + stock +
                '}';
    }
}
