package com.neuedu.object.five;

public class Student extends Person{
    /*使用构造器完成子类对父类的属性赋值*/
    public Student(){/*默认的父类构造器 super()*/
        System.out.println("student01");
    }

    public Student(String name,int age,String sex){
        super(name,age);//调用父类的构造器
        super.sex=sex;//super 父类的一个对象，调用父类中成员变量
        System.out.println("student02");
    }
}
