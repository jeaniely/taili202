package com.neuedu.object.eight;

/**
 *  方法中方法体不在写，使用抽象方法和抽象类
 *
 *  关键词：abstract
 *
 *  抽象方法必须在抽象类中，抽象类中不一定有抽象方法
 *  抽象类：成员变量、非抽象类方法，抽象方法
 *
 *  子类继承抽象类，如果子类是非抽象类，必须实现抽象类中的抽象方法
 *                 如果是抽象类，可以实现父类中抽象方法，也可以不用实现
 *
 *  抽象类不能通过抽象类实现实例化，只能使用非抽象类的子类实现
 *
 */
public abstract class Person {/*抽象类*/
    public abstract void eat();/*抽象方法，必须在抽象类中*/
    public void sleep(){
        System.out.println("睡觉");
    }
}
