package com.neuedu.object.first;

public class PersonTest {
    public static void main(String[] args) {
        Person person=new Person();/*类的实例化，是通过调用构造器完成*/
        person.age=23;/*对成员变量的赋值*/
        person.name="zhangsan";
        person.sex="男";
        person.eat();/*对方法的调用*/
    }
}
