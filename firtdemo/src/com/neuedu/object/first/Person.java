package com.neuedu.object.first;

public class Person {
    /*类
     属性和方法
     属性：变量--成员变量
     方法：---成员方法
     构造器:特殊方法：没有返回类型，方法名与类名相同;目的之一：实例化对象;之二：给成员变量赋值

*/
    String name;
    String sex;
    int age;
    double height;
    public Person(){}/*默认构造器*/

    public Person(String name){/*构造器重载，默认构造器失效，一般建议将默认构造器自己写出来*/
        this.name=name;/*本类的一个对象*/
    }
    public Person(String name,String  sex){
        this(name);/*this()直接调用构造器,并在方法的中的第一行*/
        this.sex=sex;
    }

    public Person(String name,String  sex,int age){
        this(name,sex);/*this()直接调用构造器,并在方法的中的第一行*/
        this.age=age;
    }
    void eat(){
        System.out.println("吃东西");
    }

}
