package com.neuedu.inner.three;

public class Test {
    public static void main(String[] args) {
        OuterClass outer=new OuterClass();
        OuterClass.InnerClass inner=outer.getInnerClass();
        inner.innerDisplay();/*内部类对象执行操作内部类中的方法和属性*/
    }
}
