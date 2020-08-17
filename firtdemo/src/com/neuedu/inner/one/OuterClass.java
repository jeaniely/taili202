package com.neuedu.inner.one;

public class OuterClass {
    private String name;
    private int age;
    public class InnerClass{
        public InnerClass(){
            name="zhansan";
            age=12;
        }

        public void print(){
            System.out.println("姓名："+name+" 年龄："+age);
        }
    }
}
