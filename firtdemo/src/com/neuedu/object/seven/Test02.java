package com.neuedu.object.seven;

public class Test02 {
    /*
    * 多态： 调用同一个方法，实现不同的形态
    * 条件：1） 子类继承或者实现父类
    *       2）重写了父类中的方法
    *       3）父类对象有子类定义
    *
    * */

    public static void main(String[] args) {
        Person person=new Student();
        person.eat();

        Person person1=new Teacher();
        person1.eat();
    }
}
