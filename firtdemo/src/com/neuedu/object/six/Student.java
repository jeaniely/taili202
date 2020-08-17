package com.neuedu.object.six;

public class Student extends Person {
    /*
    * 重写
    * 1）方法名相同，参数相同,返回值相同
    * 2）限定修饰符，子类中的要等于或者大于父类中的修饰符
    * 3）子类继承或者实现父类
    *
    * @Override:1）要重写的方法 2）约束
    * */


    @Override
   public void sleep() {
        System.out.println("在沙发上睡觉");
    }

    @Override
    public void cay() {
        System.out.println("陶淘大哭");
    }

    @Override
    public void eat() {
        System.out.println("吃火锅");
    }
}
