package com.neuedu.objectexample02.one;

public class Test {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle("benz","block");
        vehicle.setSpeed(120);
        vehicle.run();

        Car car=new Car("Honda","red",2);
        car.setSpeed(60);
        car.run();
    }
}
