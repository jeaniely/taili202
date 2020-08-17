package com.neuedu.inner.three;

public class OuterClass {
    private String str;
    public void display(){
        System.out.println("outerclass....");
    }

    public class InnerClass{
        public void innerDisplay(){
            str="123456";
            System.out.println(str);
            display();
        }
    }


    /*使用getXX方法实现内部类实例化*/

    public InnerClass getInnerClass(){
        return new InnerClass();
    }


}
