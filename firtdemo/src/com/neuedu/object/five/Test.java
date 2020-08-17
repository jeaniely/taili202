package com.neuedu.object.five;

public class Test {
    public static void main(String[] args) {
        System.out.println("无参的构造器调用");
        Student student=new Student();
        System.out.println("==============");
        System.out.println("有参的构造器调用");
        Student student1=new Student("tom",12,"男");
    }
}
