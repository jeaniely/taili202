package com.neuedu.object.night;

public class Student implements Person {
    @Override
    public void eat() {
        System.out.println("吃苹果");
    }

    @Override
    public void sleep() {
        System.out.println("睡觉");
    }
}
